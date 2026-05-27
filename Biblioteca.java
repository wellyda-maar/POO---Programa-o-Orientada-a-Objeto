import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void mostrarBiblioteca() {
        System.out.println("Biblioteca: " + nome);

        for (Livro l : livros) {
            l.mostrarLivro();

        }
    }
}
