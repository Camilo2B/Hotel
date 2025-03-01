package co.edu.uniquindio.poo.hotel_trabajo_seguimiento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "12345678");

        // 2. Crear una habitación
        Habitacion habitacion = new Habitacion(101, TipoHabitacion.DOBLE, 100.0);

        // 3. Crear una reserva para la habitación
        LocalDate fechaEntrada = LocalDate.of(2025, 3, 1);
        LocalDate fechaSalida = LocalDate.of(2025, 3, 5);
        Reserva reserva = new Reserva(fechaEntrada, fechaSalida, habitacion.getPrecio() * 4);

        // 4. Mostrar información de la reserva
        System.out.println("Reserva creada: " + reserva);

        // 5. Agregar servicios a la habitación
        ServicioHabitacion servicioHabitacion = new ServicioHabitacion();
        System.out.println("Servicios disponibles:");
        servicioHabitacion.ofrecerServicio();

        // 6. Consumir un servicio
        servicioHabitacion.consumir();
    }
}
















