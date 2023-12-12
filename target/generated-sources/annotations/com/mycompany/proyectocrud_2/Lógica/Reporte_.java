package com.mycompany.proyectocrud_2.Lógica;

import com.mycompany.proyectocrud_2.Lógica.Jugador;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2023-11-27T04:39:03")
@StaticMetamodel(Reporte.class)
public class Reporte_ { 

    public static volatile SingularAttribute<Reporte, String> fecha;
    public static volatile SingularAttribute<Reporte, String> motivo;
    public static volatile SingularAttribute<Reporte, Integer> códigoJugadorRep;
    public static volatile SingularAttribute<Reporte, Jugador> eljugador;
    public static volatile SingularAttribute<Reporte, String> idJugadorRep;
    public static volatile SingularAttribute<Reporte, String> observación;

}