package co.edu.uniquindio.poo.hoteeeel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un hotel
        Hotel hotel = new Hotel("Hotel");

        // 2. Crear un cliente y agregarlo al hotel
        Cliente cliente = new Cliente("Juan Pérez", "12345678");
        hotel.agregarCliente(cliente);
        Cliente cliente2 = new Cliente ("Erwin Harder,", "1092xxxx");
        hotel.agregarCliente(cliente2);
        Cliente cliente3 = new Cliente ("Juan David," ,"1000xxxx");
        hotel.agregarCliente(cliente3);
        Cliente cliente4 = new Cliente ("Camilo Ruiz," ,"1111xxxx");
        hotel.agregarCliente(cliente4);


        // 3. Crear una habitación y agregarle servicios
        Habitacion habitacion = new Habitacion(101, TipoHabitacion.DOBLE, 100.0);
        ServicioHabitacion servicio1 = new ServicioHabitacion();
        ServicioHabitacion servicio2 = new ServicioHabitacion();
        habitacion.agregarServicio(servicio1);
        habitacion.agregarServicio(servicio2);

        // 4. Crear una reserva para la habitación
        LocalDate fechaEntrada = LocalDate.of(2025, 3, 1);
        LocalDate fechaSalida = LocalDate.of(2025, 3, 5);
        Reserva reserva = new Reserva(fechaEntrada, fechaSalida, habitacion.getPrecio() * 4);
        cliente.agregarReserva(reserva);

        System.out.println("Reserva creada: " + reserva);
        System.out.println("Servicios disponibles:");
        ServicioHabitacion servicioHabitacion = new ServicioHabitacion();
        servicioHabitacion.ofrecerServicio();
        servicioHabitacion.consumir();

        // Mensaj metodos

        // Método 1: Calcular el costo total de las reservas de un cliente
        double costoReservas = hotel.calcularCostoTotalReservas(cliente);
        System.out.println("El costo total de las reservas de " + cliente.getNombre() + " es: $" + costoReservas);

        // Método 2: Obtener el costo de una habitación según su tipo
        double costoHabitacion = hotel.calcularCostoHabitacion(TipoHabitacion.DOBLE);
        System.out.println("El costo de una habitación doble es: $" + costoHabitacion);

        // Método 3: Calcular el costo de los servicios de una habitación
        double costoServicios = hotel.calcularCostoServicios(habitacion);
        System.out.println("El costo total de los servicios de la habitación " + habitacion.getNumero() + " es: $" + costoServicios);
    }
}
