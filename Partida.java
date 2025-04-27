package es.empresa.torneo.modelo;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Partida {
    private Date fecha;
    private Time hora;
    private Equipo ganador;
    private Torneo torneo;

    //Constructor
    public Partida(Date fecha, Time hora){
        this.fecha = fecha;
        this.hora = hora;
    }

    public void registrarResultado(Equipo ganador){
        //Asignar el equipo ganador
        this.ganador = ganador;
    }

    public void actualizarClasificacion(List<Equipo> nuevaClasif){
        this.torneo.setClasificacion(nuevaClasif);
    }
}
