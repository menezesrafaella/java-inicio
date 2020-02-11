public class Atendente extends Funcionario{
    public int idade;

    @Override
    public double calcularSalario(int horas, double valorPorHora) {
        return super.calcularSalario(3, 25);
    }
}

