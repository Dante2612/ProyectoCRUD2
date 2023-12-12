
package com.mycompany.proyectocrud_2.Lógica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reporte implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int códigoJugadorRep;
    private String idJugadorRep;
    private String fecha;
    private String motivo;
    private String observación;
    
    @OneToOne
    private Jugador eljugador;

    public Reporte() {
    }

    public Reporte(int códigoJugadorRep, String idJugadorRep, String fecha, String motivo, String observación, Jugador eljugador) {
        this.códigoJugadorRep = códigoJugadorRep;
        this.idJugadorRep = idJugadorRep;
        this.fecha = fecha;
        this.motivo = motivo;
        this.observación = observación;
        this.eljugador = eljugador;
    }

    public int getCódigoJugadorRep() {
        return códigoJugadorRep;
    }

    public void setCódigoJugadorRep(int códigoJugadorRep) {
        this.códigoJugadorRep = códigoJugadorRep;
    }

    public String getIdJugadorRep() {
        return idJugadorRep;
    }

    public void setIdJugadorRep(String idJugadorRep) {
        this.idJugadorRep = idJugadorRep;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getObservación() {
        return observación;
    }

    public void setObservación(String observación) {
        this.observación = observación;
    }

    public Jugador getEljugador() {
        return eljugador;
    }

    public void setEljugador(Jugador eljugador) {
        this.eljugador = eljugador;
    }
    
}
