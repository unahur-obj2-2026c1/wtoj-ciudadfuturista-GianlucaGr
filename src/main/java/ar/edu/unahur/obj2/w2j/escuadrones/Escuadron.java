package ar.edu.unahur.obj2.w2j.escuadrones;

import java.util.List;

import ar.edu.unahur.obj2.w2j.drones.Dron;
import ar.edu.unahur.obj2.w2j.zonas.Zona;

public class Escuadron {
    private List<Dron> drones;

    public Escuadron(List<Dron> drones) {
        this.drones = drones;
    }

    public void operarSobreZona(Zona zona){
        if (drones.stream().anyMatch(d->d.esAvanzado()) && this.eficienciaOperativaEscuadron() >= zona.getTamanio()){
            zona.sumarOperaciones();
            drones.stream().forEach(d->d.disminuirAutonomia());
        }
    }

    public Integer cantidadDrones(){
        return drones.size();
    }

    public Double eficienciaOperativaEscuadron(){
        return drones.stream().mapToDouble(d->d.eficienciaOperativa()).sum();
    }

    public void agregarDron(Dron dron){
        drones.add(dron);
    }
}
