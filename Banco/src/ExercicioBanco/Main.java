package ExercicioBanco;

public class Main {

    public static void main(String[] args){


        Cliente cliente1 = new Cliente("Cesar");
        Conta cliente = new Conta(cliente1, 1234);
        System.out.println(cliente1.getNome());
        System.out.println(cliente.deposito(32,2333.05));
        System.out.println(cliente1.saque(1234));

        //double salFernanda = Fernanda.deposito(3,2200.21);
        //System.out.println("O Saldo atual de Fernanda é " + salFernanda);


        Cliente cliente2 = new Cliente("Paulo");
        System.out.println(cliente2.getNome());
        Conta outroCliente = new Conta(cliente2, 12);


        //double salNaruto = Naruto.saque(98,3000.12);
        //System.out.println("O Saldo atual do Naruto é " + salNaruto);

    }
}
