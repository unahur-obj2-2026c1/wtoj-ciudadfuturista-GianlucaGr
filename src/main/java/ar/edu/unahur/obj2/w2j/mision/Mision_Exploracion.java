package ar.edu.unahur.obj2.w2j.mision;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class Mision_Exploracion extends Mision {
    @Override
    public Double costoExtra(){
        return 0.0;
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return dron.eficienciaOperativa() % 2 == 0;
    }

    
}
