public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    public boolean saca(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

}

