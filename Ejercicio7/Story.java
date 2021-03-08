package Ejercicio7;

public abstract class Story {
    private String titulo;
    private String autor;
    private Integer noPaginas;
    private String mensaje;

    public Story(String titulo, String autor, String mensaje) {
        this.titulo = titulo;
        this.autor = autor;
        this.mensaje = mensaje;
        this.noPaginas = setNoPaginas();
    }

    @Override
    public String toString() {
        return "Story{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", noPaginas=" + noPaginas +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public abstract Integer setNoPaginas();

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
