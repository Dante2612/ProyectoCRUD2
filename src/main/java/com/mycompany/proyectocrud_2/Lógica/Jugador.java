
package com.mycompany.proyectocrud_2.Lógica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jugador implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int códigoJugador;
    private String idJugador;
    private String celular;
    private String correoElectrónico;
    private String servidor;

    public Jugador() {
    }

    public Jugador(int códigoJugador, String idJugador, String celular, String correoElectrónico, String servidor) {
        this.códigoJugador = códigoJugador;
        this.idJugador = idJugador;
        this.celular = celular;
        this.correoElectrónico = correoElectrónico;
        this.servidor = servidor;
    }

    public int getCódigoJugador() {
        return códigoJugador;
    }

    public void setCódigoJugador(int códigoJugador) {
        this.códigoJugador = códigoJugador;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectrónico() {
        return correoElectrónico;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }
    
}
