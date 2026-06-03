public class ProgramaConta {

    public static void main(String[] args) {

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa Lux");
        pj.setDataNascimento("01/01/2000");
        pj.setCnpj("12.345.678/0001-00");

        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(12345);
        cc.setTitular(pj);
        cc.depositar(1000.0);
        cc.setLimite(500);

        if (cc.sacar(1500)) {
            System.out.println("Saque realizado com sucesso na conta corrente.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Maria");
        pf.setDataNascimento("01/01/1990");
        pf.setCpf("123.456.789-00");

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(54321);
        cp.setTitular(pf);
        cp.depositar(2000.0);
        cp.setRendimento(0.05);

        if (cp.sacar(2100)) {
            System.out.println("Saque realizado com sucesso na conta poupança.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println();
        System.out.println("Conta Corrente:");
        System.out.println("Número: " + cc.getNumero());
        System.out.println("Titular: " + cc.getTitular().getNome());
        System.out.println("CNPJ: " + ((PessoaJuridica) cc.getTitular()).getCnpj());
        System.out.println("Saldo: " + cc.getSaldo());

        System.out.println();
        System.out.println("Conta Poupança:");
        System.out.println("Número: " + cp.getNumero());
        System.out.println("Titular: " + cp.getTitular().getNome());
        System.out.println("CPF: " + ((PessoaFisica) cp.getTitular()).getCpf());
        System.out.println("Saldo: " + cp.getSaldo());
        System.out.println();


        System.out.println();


        Diretor diretor = new Diretor();
        diretor.setNome("Alice");
        diretor.setCpf("111.111.111-11");
        diretor.setCargo("Diretora");
        diretor.setSalario(10000.00);
        diretor.setDepartamento("Financeiro");
        diretor.setSenha("1234");


        Gerente gerente = new Gerente();
        gerente.setNome("Ana");
        gerente.setCpf("222.222.222-22");
        gerente.setCargo("Gerente");
        gerente.setSalario(7000.00);
        gerente.setSetor("Vendas");
        gerente.setSenha("5678");


        Cliente cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.setEndereco("Rua lalala");
        cliente.setTelefone("(81)99999-9999");
        cliente.setSenha("9999");

        System.out.println();
        System.out.println("Nome: " + diretor.getNome());
        System.out.println("Cargo: " + diretor.getCargo());
        System.out.println("Departamento: " + diretor.getDepartamento());
        System.out.println("Senha: " + diretor.getSenha());
        System.out.println("Diretor: " + diretor.autenticar("1234"));

        System.out.println();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Cargo: " + gerente.getCargo());
        System.out.println("Departamento: " + gerente.getSetor());
        System.out.println("Senha: " + gerente.getSenha());
        System.out.println("Gerente: " + gerente.autenticar("5678"));

        System.out.println();
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Senha: " + cliente.getSenha());
        System.out.println("Cliente: " + cliente.autenticar("9999"));
        System.out.println();
    }
}