public class BuenasPracticas {
    private String nombre = "Jugador1";
    private int vidas = 3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty())
            this.nombre = nombre;
        else
            System.out.println("El nombre no puede estar vacío.");
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        if (vidas >= 0)
            this.vidas = vidas;
        else
            System.out.println("No puedes tener vidas negativas.");
    }
}
