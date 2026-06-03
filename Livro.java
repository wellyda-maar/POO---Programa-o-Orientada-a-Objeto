import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor; // Associação simples
    private ArrayList<Capitulo> capitulos; // Composição

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public void mostrarLivro() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor.getNome());

        System.out.println("Capítulos:");
        for (Capitulo c : capitulos) {
            System.out.println("- " + c.getTitulo());
        }
    }
}
