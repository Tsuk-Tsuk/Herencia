public class Videojuego {
    private String titulo;
    private String plataforma;
    private double puntuacion;

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    // Setters con validación
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPuntuacion(double puntuacion) {
        if (puntuacion >= 0 && puntuacion <= 10)
            this.puntuacion = puntuacion;
        else
            System.out.println("Puntuación inválida. Debe estar entre 0 y 10.");
    }
}
