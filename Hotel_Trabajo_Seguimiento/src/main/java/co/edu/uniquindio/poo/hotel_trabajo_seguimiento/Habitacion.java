package co.edu.uniquindio.poo.hotel_trabajo_seguimiento;

import java.util.LinkedList;
import java.util.List;

public class Habitacion {
    private int numeroHabitacion;
    private TipoHabitacion tipo;
    private double precio;
    private Reserva reserva;
    private LinkedList<Servicio> servicios;

    public Habitacion(int numeroHabitacion, TipoHabitacion tipo, double precio) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
