package ar.edu.unahur.obj2.w2j.ciudadFuturista;

import java.util.List;

import ar.edu.unahur.obj2.w2j.drones.Dron;
import ar.edu.unahur.obj2.w2j.escuadrones.Escuadron;
import ar.edu.unahur.obj2.w2j.zonas.Zona;

public class Ciudad {
    private Integer cantidadMaxDrones = 10;
    private List<Zona> zonas;
    
    public Ciudad(Integer cantidadMaxDrones, List<Zona> zonas) {
        this.cantidadMaxDrones = cantidadMaxDrones;
        this.zonas = zonas;
    }

    public void agregarDronAEscuadronSiSePuede(Escuadron escuadron,Dron dron){
        if (escuadron.cantidadDrones() <= cantidadMaxDrones){
            escuadron.agregarDron(dron);
        }
        else{
            throw new RuntimeException("Supera la cantidad máxima definida por la ciudad");
        }
    }
}
