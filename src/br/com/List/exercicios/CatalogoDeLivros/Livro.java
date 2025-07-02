package br.com.List.exercicios.CatalogoDeLivros;

public class Livro {
    private String titulo;
    private String autor;
    private int anopublicação;

    public Livro(String titulo, String autor, int anopublicação) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicação = anopublicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnopublicação() {
        return anopublicação;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anopublicação=" + anopublicação +
                '}';
    }
}
