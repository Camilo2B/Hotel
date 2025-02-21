package co.edu.uniquindio.poo.hotel_trabajo_seguimiento;

public abstract class Servicio implements Consumir{
    private String spa;
    private String restaurante;
    private String limpieza;

    public Servicio(String spa, String restaurante, String limpieza) {
        this.spa = spa;
        this.restaurante = restaurante;
        this.limpieza = limpieza;
    }

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }

    public void consumir(){
        System.out.println("Ha consumido el servicio");
    }

    public abstract void ofrecerServicio();
    }

