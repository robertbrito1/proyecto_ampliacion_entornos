import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ReservaTest {

    @Test
    public void testReservaExitosa() {
        Reserva[] baseDatosVacia = new Reserva[1];
        Reserva nuevaReserva = new Reserva("Juan", "2026-06-20", "14:00", 5);
        
        assertTrue(nuevaReserva.realizarReserva(baseDatosVacia));
    }

    @Test
    public void testNoPermitirReservaDuplicada() {
        // Simulamos una mesa 5 ya ocupada a las 14:00
        Reserva[] baseDatos = { new Reserva("Ana", "2026-06-20", "14:00", 5) };
        
        // Intentamos reservar la misma mesa a la misma hora
        Reserva intentoDuplicado = new Reserva("Juan", "2026-06-20", "14:00", 5);
        
        assertFalse(intentoDuplicado.realizarReserva(baseDatos), 
            "El sistema debería bloquear la reserva si la mesa ya está ocupada.");
    }
}