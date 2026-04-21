package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.mision.Mision;

public abstract class Dron {
    private Double autonomia;
    protected Double nivelDeProcesamiento;
    protected Mision mision;

    public Dron(Double autonomia, Double nivelDeProcesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.mision = mision;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }


    public void cambiarMision(Mision nuevaMision){
        this.mision = nuevaMision;
    }
    
    public Boolean esAvanzado(){
        return false;
    }

    public Double eficienciaOperativa(){
        return autonomia * 10 + mision.costoExtra();
    }

    public void disminuirAutonomia(){
        autonomia = autonomia -2;
    }

    public Double getAutonomia() {
        return autonomia;
    }
    public Double getNivelDeProcesamiento() {
        return nivelDeProcesamiento;
    }
    public Mision getMision() {
        return mision;
    }
}

