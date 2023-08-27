import org.example.Imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ImcTest {
    Imc imc;

    @BeforeEach
    void setUp() {
        imc = new Imc();
    }

    @Test
    void deveRetornarExcecaoSexoInvalido() {
        try {
            imc.setSexo("A");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Sexo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFemininoAbaixoPeso() {
        imc.setPeso(19.0f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoPesoNormal() throws IllegalAccessException {
        imc.setPeso(25.7f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoMarginalmenteAcimaPesoNormal() {
        imc.setPeso(27.2f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("marginalmente acima do peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoAcimaPesoIdeal() {
        imc.setPeso(32.2f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarFemininoObeso() {
        imc.setPeso(32.4f);
        imc.setAltura(1.0f);
        imc.setSexo("F");
        assertEquals("obeso", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso() {
        imc.setPeso(20.6f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoPesoNormal() {
        imc.setPeso(26.3f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoMarginalmenteAcimaPesoNormal() {
        imc.setPeso(27.7f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("marginalmente acima do peso normal", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoAcimaPesoIdeal() {
        imc.setPeso(31.0f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    void deveRetornarMasculinoObeso() {
        imc.setPeso(31.2f);
        imc.setAltura(1.0f);
        imc.setSexo("M");
        assertEquals("obeso", imc.calcularImc());
    }
}
