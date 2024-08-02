import org.example.Main;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @BeforeAll
    static void iniciar() {
        Main.main(new String[]{});
    }

    @Test
    void retornaTrueSeClienteForNull() {

        Assertions.assertNotNull(Main.cliente,"O cliente não deve ser nulo");
    }

    @Test
    void retornaTrueSeCPFForIgualOnze() {
        Assertions.assertEquals(11, Main.cliente.getCpf().length(), "O CPF deve ter 11 caracteres");
    }



}
