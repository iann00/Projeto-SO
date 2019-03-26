package models;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

/**
 * A classe Inbox servirá para encapsularmos seu funcionamento evitando
 * fragmentação de código e poluíção visual no momento de implementarmos
 * as regras de negócio da dinânica (criação de mensagens, envio e etc..);
 *
 * <p>Aqui será possível adicionar {@link Message} à caixa, remover,
 * esvaziar e verificar o limite da caixa.
 *
 * @author Ivan Silva
 */
public class Inbox {
    /**
     * Esse limite é o equivalente ao M da especificação do trabalho.
     * Percebe que a ele será atribuído uma valor apenas no momento da
     * criação afim de termos todas as constantes em um único local.
     */
    public int limit;

    /**
     * Lista de mensagens que serão transportadas.
     */
    private ArrayList<Message> messages;

    /**
     * Flag para verificação rápida do limite da caixa. Por prdrão
     * é setada como falso, indicando que incialmente a caixa está
     * vazia.
     */
    private boolean full = false;


    public Inbox(int limit) {
        this.limit = limit;
        this.messages = new ArrayList<>();
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public Status add(@NotNull Message message) {
        if (this.isFull() == Status.FULL) {
            return Status.FULL;
        }
        else {
            if (messages.add(message)) {
                return Status.SUCCESS;
            } else {
                return Status.ERROR;
            }
        }
    }

    public Status remove(@NotNull Message message) {
        if (messages.remove(message)) {
            return Status.SUCCESS;
        } else {
            return Status.ERROR;
        }
    }

    public Status removeAll() {
        if (messages.removeAll(messages)) {
            return Status.SUCCESS;
        } else {
            return Status.ERROR;
        }
    }

    public Status isFull() {
        return messages.size() == limit ? Status.FULL: Status.AVAILABLE;
    }

    enum Status { FULL, AVAILABLE, ERROR, SUCCESS }
}
