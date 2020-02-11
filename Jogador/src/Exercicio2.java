public class Exercicio2 {

    public static void main(String[] args) {
        JogadorDeFutebol Jogador1 = new JogadorDeFutebol("Roberto Carlos", 0 , 0 , 0, 6);
        JogadorDeFutebol Jogador2 = new JogadorDeFutebol("Ronaldinho", 2,20,2,8);

        SessaoDeTreinamento treino = new SessaoDeTreinamento();

        treino.treinarA(Jogador1);
        treino.treinarA(Jogador2);
    }
}
