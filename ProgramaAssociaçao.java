public class ProgramaAssociaçao {
    public static void main(String[] args) {
        
        Autor autor1 = new Autor("George Orwell");

        Livro livro1 = new Livro("A revolução dos bichos", autor1);
        
        livro1.adicionarCapitulo(new Capitulo("A expulsão de bola de neve"));
        livro1.adicionarCapitulo(new Capitulo("A construção do moinho"));

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        biblioteca.adicionarLivro(livro1);

        biblioteca.mostrarBiblioteca();

    }
}
