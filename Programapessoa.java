public class Programapessoa {
    
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao");
        pessoa1.setIdade(30);
        pessoa1.setCpf("123.456.789-00");
        
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("CPF: " + pessoa1.getCpf());

    }
}
