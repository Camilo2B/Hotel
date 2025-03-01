package co.edu.uniquindio.poo.hotel_trabajo_seguimiento;


import java.util.LinkedList;
import java.util.List;

public abstract class Servicio implements Consumir{

    private List<String> serviciosDisponibles;

    public Servicio() {
        this.serviciosDisponibles = new LinkedList<>();
    }

    public void agregarServicio(String servicio) {
        serviciosDisponibles.add(servicio);
    }

    public List<String> getServiciosDisponibles() {
        return serviciosDisponibles;
    }

    @Override

    public String toString() {
        return "Servicios Disponibles: " +serviciosDisponibles;

    }

    public abstract void ofrecerServicio();
}



