package co.edu.uniquindio.poo.hoteeeel;

public class ServicioHabitacion extends Servicio {

    public ServicioHabitacion() {
        super();
        agregarServicio("Limpieza");
        agregarServicio("Spa");
        agregarServicio("Restaurante");
    }

    @Override
    public void ofrecerServicio() {
        System.out.println("Servicios de la Habitacion Disponibles: " +getServiciosDisponibles());
    }

    @Override
    public void consumir() {

    }
}
