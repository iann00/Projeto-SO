package models;

/**
 * Essa classe representa um objeto que pode ser enviado aos @{link Observer}
 * quando a classe executa alguma ação.
 *
 * Quando necessário enviar mais dados, simplismente adicionamos mais propriedades
 * nessa classe.
 *
 * @see jrx.Observer
 * @see User
 * @author Ivan
 */
public class Event {
    /**
     *  Identificador do usuário que executou o event
     */
    public String who;
    /**
     * A ação em si que representa o evento
     */
    public Action action;

    public Event(String who, Action action) {
        this.who = who;
        this.action = action;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWho() {
        return who;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}
