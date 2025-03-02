package co.edu.uniquindio.poo.hoteeeel;

import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private String DNI;
    private LinkedList<Reserva> reservas; // Lista de reservas del cliente

    public Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.reservas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LinkedList<Reserva> getReservas() {
        return reservas;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' + ", DNI='" + DNI + '\'' + '}';
    }
}
