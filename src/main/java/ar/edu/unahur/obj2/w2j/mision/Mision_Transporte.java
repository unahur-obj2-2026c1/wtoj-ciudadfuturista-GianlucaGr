package ar.edu.unahur.obj2.w2j.mision;

import ar.edu.unahur.obj2.w2j.drones.Dron;

public class Mision_Transporte extends Mision{

    @Override
    public Double costoExtra(){
        return 100.0;
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return dron.getAutonomia() >= 50;
    }

    
}
