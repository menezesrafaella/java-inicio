package ListaDeExercicios;

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

        public JogadorDeFutebol(String nome, int energia, int alegria, int gol) {
            this.nome = nome;
            this.energia = energia;
            this.alegria = alegria;
            this.gol = gol;

        }

        public void fazerGol(double gol){
            if (this.gol == 1) {
               this.gol += 1;
               System.out.println("GOOOOL" + this.gol);
        }
     }
}
