package models;

/**
 * Essa classe tem como finalidade representar as mensagens que serão
 * transportadas pelo pombo-correio em sua "viagem" entre as cidades.
 *
 * <p>Importante salientar que qualquer regra de negócio, isto é, lógica,
 * deve ser processada e implementada fora dessa classe.
 *
 * @author Ivan Silva
 */
public class Message {
    /**
     * Identificador único de cada usuário. Importante salientar que
     * apesar ser uma tributo dito "crítico" (por não poder se repetir),
     * é de responsabilidade do programador definir esse valor único
     * no momento de instanciação da classe
     */
    public String id;

    /**
     * Esse atributo servirá para armazenar quanlquer conteúdo
     * na mensagem
     */
    public String content;

    /**
     * Essa flag servirá apenas para fins testes, não tendo efeito
     * significante na especificação do trabalho. Caso prefira, é possível
     * setar esse atributo para verdadeiro quando a mensagem é entregue.
     * Por padrão, seu valor é falso
     */
    public boolean received = false;


    // Construtor vazio para fins de praticidade
    public Message() {

    }

    // Construtor da instância com argumentos
    public Message(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }

    public boolean isReceived() {
        return received;
    }
}
