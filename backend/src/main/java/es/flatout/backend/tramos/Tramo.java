package es.flatout.backend.tramos;

import java.util.UUID;

public class Tramo {

    private UUID tramoId;

    private String nombre;
    private double distanciaKm;
    private RecorridoTramo recorridoTramo;

    private Superficie superficie;
    private SuperficieAgarre superficieAgarre;
    private ConcurrenciaTramo concurrenciaTramo;
    private SeguridadTramo seguridadTramo;
    private TipoTramo tipoTramo;

}
