package ar.edu.unahur.obj2.w2j.drones;

import ar.edu.unahur.obj2.w2j.mision.Mision;

public class Dron_Seguridad extends Dron {

    public Dron_Seguridad(Double autonomia, Double nivelDeProcesamiento, Mision mision) {
        super(autonomia, nivelDeProcesamiento, mision);
    }

    @Override
    public Boolean esAvanzado() {
        return nivelDeProcesamiento >= 50 || mision.esAvanzado(this);
    }



}
