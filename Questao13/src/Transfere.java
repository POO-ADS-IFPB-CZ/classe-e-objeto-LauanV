public class Transfere {

    public static boolean transfere(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor){
        if(contaOrigem.saca(valor)){
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

}
