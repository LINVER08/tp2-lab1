package edu.uatf.tp2.lab1.model;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private static int count = 0;

    private String carrera;
    private int semestre;
    private double promedio;

    public Student(String firstName, String lastName, String email,
                   String carrera, int semestre, double promedio) {
        this.id = ++count;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // — Getters & Setters —
    public int getId()           { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public String getEmail()     { return email; }
    public String getCarrera()   { return carrera;  }
    public int getSemestre()     { return semestre; }
    public double getPromedio()  { return promedio; }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank())
            throw new IllegalArgumentException("firstName no puede ser vacío");
        this.firstName = firstName;
    }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email)       { this.email = email; }
    public void setCarrera(String carrera)    { this.carrera = carrera; }
    public void setSemestre(int semestre)     { this.semestre = semestre; }
    public void setPromedio(double promedio)  { this.promedio = promedio; }

    public String fullName()             { return firstName + " " + lastName; }
    public static int getTotalStudents()  { return count; }

    public String print() {
        return "Nombre: " + fullName() + " | Correo: " + email + " | ID: " + id +
               "\nCarrera: " + carrera + " | Semestre: " + semestre + " | Promedio: " + promedio;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + fullName());
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Resultado: " + aprobo()); // ← nuevo aquí también
        System.out.println("---------------------------");
    }

    //  — MÉTODO NUEVO QUE PIDE —
    public String aprobo() {
        if (promedio >= 51) {
            return "Aprobó ";
        } else {
            return "Reprobó ";
        }
    }
}