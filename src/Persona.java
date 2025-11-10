//\\\
//public class Persona {
//    String cedula;
//    String nombre;
//    int edad;
//   public Persona(String cedula, String nombre, int edad) {
//       this.cedula = cedula;
//        this.nombre = nombre;
//        this.edad = edad;
//   }
//   public void imprimir(){
//       System.out.printf("Datos personales \nCedula" + cedula + "\nNombre" + nombre + "\nEdad" + edad);
//   }
//}
//    class Estudiante extends Persona {
//        String codigo;
//        public Estudiante(String cedula, String nombre, int edad, String codigo) {
//            super(cedula, nombre, edad);
//            this.codigo = codigo;
//        }
//        public void imprimir(){
//            super.imprimir();
//            System.out.printf("\nCodigo" + codigo);
//        }
//    }
//    class Docente extends Persona {
//        String materias;
//        public Docente(String cedula, String nombre, int edad, String materias) {
//            super(cedula, nombre, edad);
//            this.materias = materias;
//        }
//        public void imprimir(){
//            super.imprimir();
//            System.out.printf("\nMaterias" + materias);
//        }
//    }
//// class Main {
// //   public static void main(String[] args) {
//        Persona persona = new Persona("0102030405", "Juan Pérez", 30);
//        Estudiante estudiante = new Estudiante("0102030406", "María López", 20, "E123");
//        Docente docente = new Docente("0102030407", "Carlos Ruiz", 40, "Matemáticas");
//
//        System.out.println("=== Persona ===");
//        persona.imprimir();
//
//        System.out.println("\n\n=== Estudiante ===");
//        estudiante.imprimir();
//
//        System.out.println("\n\n=== Docente ===");
//        docente.imprimir();
//    }
//}
//
