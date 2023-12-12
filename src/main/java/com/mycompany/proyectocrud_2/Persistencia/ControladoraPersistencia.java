
package com.mycompany.proyectocrud_2.Persistencia;

import com.mycompany.proyectocrud_2.Lógica.Jugador;
import com.mycompany.proyectocrud_2.Lógica.Reporte;
import com.mycompany.proyectocrud_2.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    JugadorJpaController jugadorJpa = new JugadorJpaController();
    ReporteJpaController reporteJpa = new ReporteJpaController();

    public void cargar(Jugador jugador, Reporte reporte) {
        
        //Creamos en la Base de Datos el jugador
        jugadorJpa.create(jugador);
        
        //Creamos en la Base de Datos el reporte
        reporteJpa.create(reporte);
    }

    public List<Reporte> traerReportes() {
        
        return reporteJpa.findReporteEntities();
        
    }

    public void borrarReporte(int códigoJugadorRep) {
        try {
            reporteJpa.destroy(códigoJugadorRep);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Reporte traerReporte(int códigoJugadorRep) {
        
        return reporteJpa.findReporte(códigoJugadorRep);
        
    }

    public void guardarCambios(Reporte rep) {
        
        try {
            reporteJpa.edit(rep);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Jugador traerJugador(int códigoJugador) {
        
        return jugadorJpa.findJugador(códigoJugador);
        
    }

    public void editarJugador(Jugador jugador) {
        
        try {
            jugadorJpa.edit(jugador);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
