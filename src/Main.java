import jrx.Observer;
import models.Event;
import models.Inbox;
import java.util.Random;

public class Main implements Observer<Event> {
    /**
     * Esse é a faixa de geração de números do random. Sendo mais claro:
     * ele sorteiará um número pseudoaleatório entre 0 e 10000. Esse
     * número será o tempo que o usuário leva para digitar a mensagem
     */
    public static int BOUND = 600000;
    /**
     * Número máximo de mensagens que podem ser enviadas por vez
     */
    private static int MAX_MESSAGES_NUMBER = 4;

    public static Random random = new Random();


    private static Inbox inbox = new Inbox(MAX_MESSAGES_NUMBER);

    public static void main(String[] args) {

    }

    /**
     * Por esse método receberemos os eventos do usuário (digitando ou não)
     *
     * @param data
     */
    @Override
    public void onEvent(Event data) {
        
    }
}
