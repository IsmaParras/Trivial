import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(true);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1() {
        // Arrange
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de María es 1";

        // Act
        String actual = sut.nuevaPosicionJugador();

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void menorADosJugadores() {
        Game sut = new Game();
        sut.agregar("María");
        sut.esJugable();

        Boolean expected = false;
        boolean actual = sut.esJugable();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void igualAdosJugadores() {
        Game sut = new Game();
        sut.agregar("María");
        sut.agregar("Juan");
        sut.esJugable();

        Boolean expected = true;
        boolean actual = sut.esJugable();

        Assertions.assertEquals(expected, actual);
    }
}