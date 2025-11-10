import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("\nRegistro de Auto:");
        System.out.print("Placa: "); String placaAuto = sc.nextLine();
        System.out.print("Marca: "); String marcaAuto = sc.nextLine();
        System.out.print("Año: "); int anioAuto = sc.nextInt();
        System.out.print("Propietario: "); String propietarioAuto = sc.nextLine();
        System.out.print("Precio: "); double precioAuto = sc.nextDouble();
        System.out.print("Número de puertas: "); int puertas = sc.nextInt();
    Auto auto = new Auto(placaAuto, marcaAuto, anioAuto, propietarioAuto, precioAuto, puertas);
        System.out.println("\nRegistro de Moto:");
        System.out.print("Placa: "); String placaMoto = sc.nextLine();
        System.out.print("Marca: "); String marcaMoto = sc.nextLine();
        System.out.print("Año: "); int anioMoto = sc.nextInt();
        sc.nextLine();
        System.out.print("Propietario: "); String propietarioMoto = sc.nextLine();
        System.out.print("Precio: "); double precioMoto = sc.nextDouble();
        System.out.print("Cilindrada: "); int cilindrada = sc.nextInt();
    Moto moto = new Moto(placaMoto, marcaMoto, anioMoto, propietarioMoto, precioMoto, cilindrada);

        sc.nextLine();
git init
        System.out.println("\nRegistro de Camión:");
        System.out.print("Placa: "); String placaCamion = sc.nextLine();
        System.out.print("Marca: "); String marcaCamion = sc.nextLine();
        System.out.print("Año: "); int anioCamion = sc.nextInt();
        sc.nextLine();
        System.out.print("Propietario: "); String propietarioCamion = sc.nextLine();
        System.out.print("Precio: "); double precioCamion = sc.nextDouble();
        System.out.print("Capacidad (toneladas): "); double capacidad = sc.nextDouble();
    Camion camion = new Camion(placaCamion, marcaCamion, anioCamion, propietarioCamion, precioCamion, capacidad);
        System.out.println("\n=== VALOR DE MATRÍCULA ===");
        System.out.println("Auto (" + auto.getPlaca() + "): $" + String.format("%.2f", auto.calcularValorMatricula()));
        System.out.println("Moto (" + moto.getPlaca() + "): $" + String.format("%.2f", moto.calcularValorMatricula()));
        System.out.println("Camión (" + camion.getPlaca() + "): $" + String.format("%.2f", camion.calcularValorMatricula()));
        sc.close();
}
}