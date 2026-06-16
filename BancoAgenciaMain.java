import java.util.ArrayList;
import java.util.List;

public class BancoAgenciaMain {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNumero(1);
        banco.setNome("Banco do Brasil");
        
        Agencia agencia1 = new Agencia();
        agencia1.setNumero(123);
        agencia1.setNome("Agência Central");
        
        Agencia agencia2 = new Agencia();
        agencia2.setNumero(456);
        agencia2.setNome("Agência Norte");
        
        Agencia agencia3 = new Agencia();
        agencia3.setNumero(789);
        agencia3.setNome("Agência Sul");
        
        List<Agencia> agencias = new ArrayList<>();
        agencias.add(agencia1);
        agencias.add(agencia2);
        agencias.add(agencia3);
        
        banco.setAgencias(agencias);
        
        System.out.println("Número do Banco: " + banco.getNumero());
        System.out.println("Nome do Banco: " + banco.getNome());
        System.out.println("Agências:");
        for (Agencia agencia : banco.getAgencias()) {
            System.out.println("- Número: " + agencia.getNumero() 
            + ", Nome: " + agencia.getNome());
        }
    }

}
