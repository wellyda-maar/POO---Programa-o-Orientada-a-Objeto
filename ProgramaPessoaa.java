public class ProgramaPessoaa {
    
      public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica();

        pf1.setNome("Sebastianah santos");
        pf1.setDataNascimento("11/06/1956");
        pf1.setCpf("123.456.783-00");
        pf1.setSexo('F');

        System.out.println("Pessoa Física");
        System.out.println("Nome: " + pf1.getNome());
        System.out.println("Nascimento: " + pf1.getDataNascimento());
        System.out.println("CPF: " + pf1.getCpf());
        System.out.println("Sexo: " + pf1.getSexo());

        System.out.println();

        PessoaJuridica pj1 = new PessoaJuridica();

        pj1.setNome("Empresa XPTO");
        pj1.setDataNascimento("01/01/2010");
        pj1.setCnpj("12.345.678/0001-99");

        System.out.println("Pessoa Jurídica");
        System.out.println("Nome: " + pj1.getNome());
        System.out.println("Abertura: " + pj1.getDataNascimento());
        System.out.println("CNPJ: " + pj1.getCnpj());
    }
}
