package models;

/**
 * Essa classe tem como finalidade representar o usuáio.
 *
 * <p>Nas especificações do trabalho é salientado que cada usuário,
 * após ter terminado de escrever, colorca a mensagem imediantamente na caixa
 * de mensagens (se tiver capacidade, claro).</p>
 *
 * <p>Existe uma tentação em adicionar uma lista de mensagens nesta classe,
 * porém não faz sentido. Caso, no decorrer do projeto, haja a necessidade
 * de se armazenar qualquer mensagem que não na caixa principal, será
 * necessário criar um reservatório e quando a caixa principal se esvaziar
 * fazemos a transferência para ela. Fica evidente então o motivo de não
 * haver um atributo lista aqui.
 *
 *
 * @author Ivan Silva
 */
public class User {
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
}
