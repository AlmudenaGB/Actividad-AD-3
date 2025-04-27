package es.empresa.torneo.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Torneo {
    private String nombre;
    private String ciudad;
    private String categoria;
    private Date fechainicio;
    private Date fechaFin;
    private List<Equipo> clasificacion;
    private Premio premio;

    //Constructor
    public Torneo(String nombre, String ciudad, String categoria, Date fechainicio, Date fechaFin) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.fechainicio = fechainicio;
        this.fechaFin = fechaFin;
        //Crear la lista vacía de equipos
        clasificacion = new ArrayList<>();
    }

    public void inscribirEquipo(Equipo equipo){
        boolean existe = false;

        //Buscar si ya existe el equipo
        for (Equipo elem: clasificacion) {
            if (elem.getNombre().equals(equipo.getNombre())){
                existe = true;
            }
        }

        //si el equipo no es null y no existe
        if (equipo != null && existe == false) {
            //Añadir jugador a la lista
            clasificacion.add(equipo);
        }
    }

    public void setClasificacion(List<Equipo> clasificacion) {
        this.clasificacion = clasificacion;
    }
}
