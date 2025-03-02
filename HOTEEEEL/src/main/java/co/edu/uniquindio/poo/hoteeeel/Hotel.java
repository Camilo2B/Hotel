package co.edu.uniquindio.poo.hoteeeel;

import java.util.LinkedList;

public class Hotel {
    private String nombre;
    private LinkedList<Cliente> clientes;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.clientes = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    // Método 1: Calcular el costo total de las reservas de un cliente
    public double calcularCostoTotalReservas(Cliente cliente) {
        double total = 0;
        for (Reserva reserva : cliente.getReservas()) {
            total += reserva.getPrecio();
        }
        return total;
    }

    // Método 2: Obtener el costo de una habitación según el tipo
    public double calcularCostoHabitacion(TipoHabitacion tipo) {
        switch (tipo) {
            case SIMPLE:
                return 100.000;
            case DOBLE:
                return 200.000;
            case SUIT:
                return 300.000;
            default:
                return 0;
        }
    }

    // Método 3: Calcular el costo de todos los servicios de una habitación
    public double calcularCostoServicios(Habitacion habitacion) {
        return habitacion.getServiciosDisponibles().size() * 20.0; // Cada servicio cuesta $20
    }
}
