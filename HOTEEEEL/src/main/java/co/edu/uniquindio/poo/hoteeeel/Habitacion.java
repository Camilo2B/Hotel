package co.edu.uniquindio.poo.hoteeeel;

import java.util.LinkedList;

public class Habitacion {
    private int numero;
    private TipoHabitacion tipo;
    private double precio;
    private LinkedList<Servicio> serviciosDisponibles; // Lista de servicios de la habitación

    public Habitacion(int numero, TipoHabitacion tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.serviciosDisponibles = new LinkedList<>();
    }

    public int getNumero() {
        return numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public LinkedList<Servicio> getServiciosDisponibles() {
        return serviciosDisponibles;
    }

    public void agregarServicio(Servicio servicio) {
        serviciosDisponibles.add(servicio);
    }

    @Override
    public String toString() {
        return "Habitacion{" + "numero=" + numero + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
}
