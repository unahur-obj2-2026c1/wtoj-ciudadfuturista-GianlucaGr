package ar.edu.unahur.obj2.w2j.zonas;

public class Zona {
    private Double tamanio;
    private Integer cantidadOperaciones;
    
    public Zona(Double tamanio, Integer cantidadOperaciones) {
        this.tamanio = tamanio;
        this.cantidadOperaciones = cantidadOperaciones;
    }

    public Double getTamanio() {
        return tamanio;
    }

    public Integer getCantidadOperaciones() {
        return cantidadOperaciones;
    }

    public void sumarOperaciones(){
        cantidadOperaciones = cantidadOperaciones + 1;
    }
}


