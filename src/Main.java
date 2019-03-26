import models.Inbox;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class Main {
    /**
     * Esse é a faixa de geração de números do random. Sendo mais claro:
     * ele sorteiará um número pseudoaleatório entre 0 e 10000. Esse
     * número será o tempo que o usuário leva para digitar a mensagem
     */
    public static int BOUND = 600000;

    /**
     * M - Número máximo de mensagens que podem ser enviadas por vez
     */
    private static int MAX_MESSAGES_NUMBER = 4;

    public static Random random = new Random();

    /**
     * Objetos referentes a cada usuário que irá escrever mensagens.
     * Estou declarando esses objetos globalmente apenas para que seja
     * possível.
     */
    private static Thread usersThread;


    private static Inbox inbox = new Inbox(MAX_MESSAGES_NUMBER);

    public static void main(String[] args) {
//        User ivan  = new User("01", "Ivan",  random.nextInt(BOUND));
//        User helen = new User("02", "Helen", random.nextInt(BOUND));
//        User ana   = new User("03", "Ana",   random.nextInt(BOUND));
//        User alan  = new User("04", "Alan",  random.nextInt(BOUND));
//        User julia = new User("05", "Júlia", random.nextInt(BOUND));
//
//        usersThread = new Thread(() -> {
//
//        });


        CompletableFuture completableFuture = new CompletableFuture();
    }
}
