public class JuegoOnline {
    private int nivel = 1;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1)
            this.nivel = nivel;
        else
            System.out.println("Nivel inválido. No puede ser negativo o cero.");
    }
}
