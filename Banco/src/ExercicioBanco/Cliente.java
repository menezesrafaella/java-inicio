package ExercicioBanco;

public class Cliente{
    private String nome;


    public Cliente(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
