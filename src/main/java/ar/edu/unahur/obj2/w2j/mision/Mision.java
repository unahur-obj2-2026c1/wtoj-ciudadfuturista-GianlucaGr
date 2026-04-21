package ar.edu.unahur.obj2.w2j.mision;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public abstract class Mision {
    public abstract Double costoExtra();

    public Boolean esAvanzado(Dron dron){
        return false;
    }
}
