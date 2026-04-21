package ar.edu.unahur.obj2.w2j.mision;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.drones.Dron;
import ar.edu.unahur.obj2.w2j.sensores.Sensor;

public class Mision_Vigilancia extends Mision {

    private List<Sensor> sensores = new ArrayList<>();


    @Override
    public Double costoExtra() {
        Double costo = sensores.stream().mapToDouble(s->s.eficiencia()).sum();
        return costo;
    }

    public Boolean sensoresSonDuraderos(){
        return sensores.stream().allMatch(s->s.esDuradero());
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return sensoresSonDuraderos();
    }



}
