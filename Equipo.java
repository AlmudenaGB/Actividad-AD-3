package es.empresa.torneo.modelo;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String localidad;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String localidad){
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public void addJugador(Jugador jugador){

        boolean existe = false;

        //Buscar si ya existe el jugador
        for (Jugador elem: jugadores) {
            if (elem.getNombre().equals(jugador.getNombre())){
                existe = true;
            }
        }

        //si el jugador no es null y no existe
        if (jugador != null && existe == false) {
            //Añadir jugador a la lista
            jugadores.add(jugador);
        }
    }

    public void consultaJugadores(){
        //Bucle que recorre la lista de jugadores
        for (Jugador jugador: jugadores) {
            //Mostrar datos del jugador
            System.out.println("Nombre: " + jugador.getNombre() + " Dorsal: " + jugador.getDorsal() + " Edad: " + jugador.getEdad() + " Nacionalidad: " + jugador.getNacionalidad());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }
}
