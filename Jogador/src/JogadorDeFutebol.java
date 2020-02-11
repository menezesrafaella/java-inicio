public class JogadorDeFutebol {
    public String nome;
    public int energia;
    public int alegria;
    public int gol;
    public int experiencia;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int gol) {
        this.experiencia = gol;
    }


    public JogadorDeFutebol(String nome, int energia, int alegria, int gol, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gol = gol;
        this.experiencia = experiencia;

    }

    public String fazerGol() {
        if (this.energia >= 5) {
            int golTotal = this.gol += gol;
            this.energia = this.energia - 5;
            this.alegria = this.alegria + 10;
            return "GOOOL" + "Total de Gol = " + golTotal + "alegria = " + this.alegria + "energia = " + this.energia;

        } else {
            return "Não tem gol";
        }
    }

    public void correr(int energia) {
        if (this.energia >= 10) {
            this.energia = this.energia - 10;
            System.out.println("Cansei");

        } else {
            System.out.println("Sem energia");
        }
    }
}
