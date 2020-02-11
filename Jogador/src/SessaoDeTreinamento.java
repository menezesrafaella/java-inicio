public class SessaoDeTreinamento {
    public int experiencia;

    public SessaoDeTreinamento(){

    }

    public SessaoDeTreinamento(int experiencia){
        this.experiencia = experiencia;
    }
    public void treinarA(JogadorDeFutebol jogadorDeFutebol){
        System.out.println("Experincia inicial " + jogadorDeFutebol.getExperiencia());
        this.experiencia = jogadorDeFutebol.getExperiencia();

        jogadorDeFutebol.correr();
        jogadorDeFutebol.fazerGol();
        jogadorDeFutebol.correr();

        this.experiencia++;

        jogadorDeFutebol.setExperiencia(this.experiencia);
        System.out.println("Experiencia final:" + jogadorDeFutebol.getExperiencia());
    }
}

