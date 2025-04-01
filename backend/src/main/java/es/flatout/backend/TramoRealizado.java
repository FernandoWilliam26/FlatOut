package es.flatout.backend;

import es.flatout.backend.tramos.Tramo;

import java.time.Instant;
import java.util.UUID;

public class TramoRealizado {

    private UUID tramoRealizadoId;

    private Tramo tramoRealizado;
    private Usuario usuario;
    private CocheUsuario cocheUtilizado;

    private Instant fechaInicio;
    private Instant fechaFin;
    private long duracionMs;
    private boolean lluvia;
    

}