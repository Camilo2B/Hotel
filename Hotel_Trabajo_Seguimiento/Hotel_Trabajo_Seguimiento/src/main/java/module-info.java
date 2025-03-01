module co.edu.uniquindio.poo.hotel_trabajo_seguimiento {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.hotel_trabajo_seguimiento to javafx.fxml;
    exports co.edu.uniquindio.poo.hotel_trabajo_seguimiento;
}