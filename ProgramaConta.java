public class ProgramaConta {
    
    public static void main(String[] args){
        Conta  conta1 = new Conta();
        conta1.setNumero( 12345678);
        conta1.setTitular("Joao");
        conta1.depositar(100);
        conta1.sacar(50);
        
        System.out.println("Numero: " + conta1.getNumero());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());
        
    }
}
