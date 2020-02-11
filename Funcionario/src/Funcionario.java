public class Funcionario {
    protected double salario;

    public double calcularSalario(int horas, double valorPorHora){
        double salario = horas*valorPorHora;
        return salario;
    }
}
