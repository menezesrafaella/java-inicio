package ExercicioBanco;

public class Conta{
    private int numeroConta;
    private double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente, double saldo){
        this.saldo = saldo;
        this.cliente = cliente;
    }


    public double getSaldo (){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public double deposito(float entrada, double saldo) {
        this.saldo = entrada + this.saldo;
        return this.saldo;
    }

    public double saque(float entradaSaque, double saldo){
        if (this.saldo < entradaSaque) {
            System.out.println("Não é permitido sacar");
            return this.saldo;
        } else {
            double saldoTotal = this.saldo - entradaSaque;
            return saldoTotal;
        }
    }
}
