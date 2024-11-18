public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", 500);
        ContaBancaria conta2 = new ContaBancaria("José", 300);

        System.out.println("Saldo da conta bancária de "+conta1.getTitular()+ " é: " + conta1.getSaldo());
        System.out.println("Saldo da conta bancária de "+conta2.getTitular()+ " é: " + conta2.getSaldo());

        double valor = 200;

        if (Transfere.transfere(conta1, conta2, valor)) {
            System.out.println("\nTransferência de R$ "+valor+" foi realizada com sucesso!");
        }
        else {
            System.out.println("\nTransferência de R$ " + valor + " não foi realizada!");
        }
        System.out.println("\nSaldo da conta bancária de "+conta1.getTitular()+ " é: " + conta1.getSaldo());
        System.out.println("Saldo da conta bancária de "+conta2.getTitular()+ " é: " + conta2.getSaldo());
    }
}