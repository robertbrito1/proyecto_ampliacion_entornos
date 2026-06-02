public class Reserva {
    private int mesa;
    private String fecha, hora;
    private String nombreCliente;

    public Reserva(String nombre, String fecha, String hora, int mesa) {
        this.nombreCliente = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    // Método principal de negocio
    public boolean realizarReserva(Reserva[] reservasExistentes) {
        for (Reserva r : reservasExistentes) {
            if (esMismaReserva(r)) {
                return false; // Conflicto detectado
            }
        }
        return true; // Disponible
    }


    private boolean esMismaReserva(Reserva otra) {
        return otra != null && 
               this.fecha.equals(otra.fecha) && 
               this.hora.equals(otra.hora) && 
               this.mesa == otra.mesa;
    }
}