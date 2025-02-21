package co.edu.uniquindio.poo.hotel_trabajo_seguimiento;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private double precio;

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, double precio) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
