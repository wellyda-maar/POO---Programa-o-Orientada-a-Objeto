public class Conta {
    int numero;
    String titular;
    double saldo;

    public int getNumero(){
        return this.numero;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso");
        }

        else{
            System.out.println("Saque nao efetuado");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito efetuado com sucesso");
    }
}


