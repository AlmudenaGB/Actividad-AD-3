package es.empresa.torneo.modelo;

public class Jugador {
    private String nombre;
    private int dorsal;
    private int edad;
    private String nacionalidad;
    //Relacion con equipo
    private Equipo equipo;

    //Constructor
    public Jugador(String nombre, int dorsal, int edad, String nacionalidad){
        //Asignamos los atributos
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}
