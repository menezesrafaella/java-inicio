public class Main {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        double salarioFunc = funcionario.calcularSalario(2,32);
        System.out.println(salarioFunc);

        Atendente atendente = new Atendente();
        double salarioAtend = atendente.calcularSalario(1,21);
        System.out.println(salarioAtend);

        Vendedor vendedor = new Vendedor();
        double salarioVend = vendedor.calcularSalario(4,2);
        System.out.println(salarioVend);

    }
}
