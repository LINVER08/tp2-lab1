import edu.uatf.tp2.lab1.model.Student;

public class App {
    public static void main(String[] args) {
        Student e1 = new Student("Carlos", "Mendoza", "carlos@ejemplo.com",
                                 "Ingeniería de Sistemas", 5, 62.5);
        Student e2 = new Student("Ana", "García", "ana@ejemplo.com",
                                 "Medicina", 3, 45.0); // prueba reprobado
        Student e3 = new Student("Luis", "Pérez", "luis@ejemplo.com",
                                 "Derecho", 7, 75.0);
        Student e4 = new Student("Sofía", "Ruiz", "sofia@ejemplo.com",
                                 "Arquitectura", 4, 51.0); // justo en el límite

        System.out.println("--- ESTUDIANTE 1 ---"); e1.mostrarDatos();
        System.out.println("--- ESTUDIANTE 2 ---"); e2.mostrarDatos();
        System.out.println("--- ESTUDIANTE 3 ---"); e3.mostrarDatos();
        System.out.println("--- ESTUDIANTE 4 ---"); e4.mostrarDatos();

        System.out.println("Total estudiantes: " + Student.getTotalStudents());
    }
}