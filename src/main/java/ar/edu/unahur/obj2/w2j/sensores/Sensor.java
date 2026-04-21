package ar.edu.unahur.obj2.w2j.sensores;

public class Sensor {
    private Double capacidad;
    private Double durabilidad;
    private Boolean mejoras;

    public Sensor(Double capacidad, Double durabilidad, Boolean mejoras) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejoras = mejoras;
    }

    public Double eficiencia(){
        Double devolver = 0.0; 
        if (mejoras){
            devolver = capacidad;
        }
        else{
            devolver = capacidad * 2;
        }

        return devolver;
    }

    public Boolean esDuradero(){
        return capacidad *2 < durabilidad;
    }

    public Double getCapacidad() {
        return capacidad;
    }
    public Double getDurabilidad() {
        return durabilidad;
    }
    public Boolean getMejoras() {
        return mejoras;
    }
}
