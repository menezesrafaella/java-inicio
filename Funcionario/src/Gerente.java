public class Gerente extends Funcionario{
    public String nome;

    @Override
    public double calcularSalario(int horas, double valorPorHora) {
        return super.calcularSalario(1, 12);
    }
}
