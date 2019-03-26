package models;

import java.util.ArrayList;

/**
 * Essa classe tem como finalidade representar o pombo-correio.
 *
 * @author Ivan Silva
 */
public class CarrierPigeon {
    /**
     * As especificações do projeto salientam apenas um único pombo,
     * mas por questões de prevenção, adicionaremos esse atributo de
     * identificação caso venhamos a adicionar mais pombos.
     */
    public String id;

    /**
     * Lista de mensagens que o pombo carregará. Via método setter,
     * nós passaremos para ele uma cópia da "caixa de mensagens" que
     * fica acessível à todos os usuários.
     */
    public ArrayList<Message> messages;


    // Construtor vazio para fins de praticidade
    public CarrierPigeon() {

    }

    // Construtor da instância com argumentos
    public CarrierPigeon(String id, ArrayList<Message> messages) {
        this.id = id;
        this.messages = messages;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    /**
     * Método útil para o pombo descarregar as mensagens da sua cesta (ou seja
     * lá onde ele leve isso).
     *
     * @return boolean
     */
    public boolean removeMessages() {
        if (messages != null) {
            messages.clear();
            return true;
        }

        return false;
    }
}
