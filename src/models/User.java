package models;

import jrx.Observable;
import jrx.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe tem como finalidade representar o usuáio.
 *
 * Essa classe será observada e notificará à todos os observadores
 * das mudanças que ocorrerem. Para isso, ela implementa a interface
 * @{link Observable}.
 *
 * Isso é nescessário, e é bem prático, para mostrar na interface que
 * o usuário está digitando.
 *
 * @see Observable
 * @author Ivan Silva
 */
public class User implements Observable<Event> {
    /**
     * Identificador único de cada usuário. Importante salientar que
     * apesar ser uma tributo dito "crítico" (por não poder se repetir),
     * é de responsabilidade do programador definir esse valor único
     * no momento de instanciação da classe
     */
    public String id;
    /**
     * Nome para o usuário. Esse atributo é meramente ilustrativo
     */
    public String name;
    /**
     * Tempo que o usuário leva pra escrever a mensagem
     */
    public int time;

    /**
     * Lista de observadores da classe
     */
    private List<Observer> observers = new ArrayList();


    public User(String id, String name, int time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Esse método deve ser acionado quando o usuário estiver digitando
     * ou não
     * @param typing
     */
    public void typing(boolean typing) {
        if (typing) {
            Event event = new Event(this.id, Action.TYPING);
            this.notifyObservers(event);
        } else {
            Event event = new Event(this.id, Action.LEISURE);
            this.notifyObservers(event);
        }
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Event data) {
        for (Observer observer: observers) {
            observer.onEvent(data);
        }
    }
}
