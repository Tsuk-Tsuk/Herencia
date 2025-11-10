public abstract class Vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private String propietario;
    private double precio;

    public Vehiculo(String placa, String marca, int anio, String propietario, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.propietario = propietario;
        this.precio = precio;
    }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getPropietario() { return propietario; }
    public void setPropietario(String propietario) { this.propietario = propietario; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public abstract double calcularValorMatricula();
}
class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String placa, String marca, int anio, String propietario, double precio, int numeroPuertas) {
        super(placa, marca, anio, propietario, precio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularValorMatricula() {
        double base = 50;
        if (getAnio() < 2010 || getPrecio() < 3000) {
            return base;
        }
        double incrementoAnio = (getAnio() - 2010) * 0.01 * base;
        double incrementoPrecio = ((getPrecio() - 3000) / 1000) * 0.01 * base;
        return base + incrementoAnio + incrementoPrecio;
    }
}
class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String placa, String marca, int anio, String propietario, double precio, int cilindrada) {
        super(placa, marca, anio, propietario, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorMatricula() {
        double base = 50;
        if (getAnio() < 2010 || getPrecio() < 3000) {
            return base;
        }
        double incrementoAnio = (getAnio() - 2010) * 0.01 * base;
        double incrementoPrecio = ((getPrecio() - 3000) / 1000) * 0.01 * base;
        return base + incrementoAnio + incrementoPrecio;
    }
}
class Camion extends Vehiculo {
    private double capacidadToneladas;

    public Camion(String placa, String marca, int anio, String propietario, double precio, double capacidadToneladas) {
        super(placa, marca, anio, propietario, precio);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularValorMatricula() {
        double base = 50;
        if (getAnio() < 2010 || getPrecio() < 3000) {
            return base;
        }
        double incrementoAnio = (getAnio() - 2010) * 0.01 * base;
        double incrementoPrecio = ((getPrecio() - 3000) / 1000) * 0.01 * base;
        double plusCapacidad = capacidadToneladas * 0.5;
        return base + incrementoAnio + incrementoPrecio + plusCapacidad;
    }
}

