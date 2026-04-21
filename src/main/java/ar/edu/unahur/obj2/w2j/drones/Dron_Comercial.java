package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.mision.Mision;

public class Dron_Comercial extends Dron {

    public Dron_Comercial(Double autonomia, Double nivelDeProcesamiento, Mision mision) {
        super(autonomia, nivelDeProcesamiento, mision);
    }

    @Override
    public Double eficienciaOperativa() {
        return super.eficienciaOperativa() + 15.0;
    }
    
    @Override
    public Boolean esAvanzado(){
        return false;
    }

    
    
}
