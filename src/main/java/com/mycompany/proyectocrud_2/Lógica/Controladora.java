
package com.mycompany.proyectocrud_2.Lógica;

import com.mycompany.proyectocrud_2.Persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void cargar(String idjugador, String celular, String correo, String servidor, String idjugadorReportado, String fecha, String motivo, String observación) {
        
        //Creamos el jugador y asignamos sus valores
        Jugador jugador = new Jugador();
        jugador.setIdJugador(idjugador);
        jugador.setCelular(celular);
        jugador.setCorreoElectrónico(correo);
        jugador.setServidor(servidor);
        
        //Creamos el reporte y asignamos sus valores
        Reporte reporte = new Reporte();
        reporte.setIdJugadorRep(idjugadorReportado);
        reporte.setFecha(fecha);
        reporte.setMotivo(motivo);
        reporte.setObservación(observación);
        reporte.setEljugador(jugador);
        
        controlPersis.cargar(jugador, reporte);
    }

    public List<Reporte> traerReportes() {
        
        return controlPersis.traerReportes();
        
    }

    public void borrarReporte(int código_jugadorreportado) {
        
        controlPersis.borrarReporte(código_jugadorreportado);
    }

    public Reporte traerReporte(int códigoJugadorRep) {
        
        return controlPersis.traerReporte (códigoJugadorRep);
        
    }

    public void guardarCambios(Reporte rep, String idjugador, String celular, String correo, String servidor, String idjugadorReportado, String fecha, String motivo, String observación) {
        
        rep.setIdJugadorRep(idjugadorReportado);
        rep.setFecha(fecha);
        rep.setMotivo(motivo);
        rep.setObservación(observación);
        
        //Editar los cambios del reporte
        controlPersis.guardarCambios (rep);
        
        //Seteo nuevos valores del jugador
        Jugador jugador = this.buscarJugador(rep.getEljugador().getCódigoJugador());
        jugador.setIdJugador(idjugador);
        jugador.setCelular(celular);
        jugador.setCorreoElectrónico(correo);
        jugador.setServidor(servidor);
        
        //Llamar al editar jugador
        this.editarJugador(jugador);
        
    }

    private Jugador buscarJugador(int códigoJugador) {
        
        return controlPersis.traerJugador(códigoJugador);
        
    }

    private void editarJugador(Jugador jugador) {
        
        controlPersis.editarJugador(jugador);
        
    }
    
}
