public class Vendedor extends Funcionario{
    public String localQueAtua;

    @Override
    public double calcularSalario(int horas, double valorPorHora) {
        return super.calcularSalario(4, 43);
    }
}
