import org.example.Main;


import org.example.model.BancoDeDados;
import org.example.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    void retornaTrueSeForMaiorDeIdade() {
        Assertions.assertTrue(Main.cliente.maiorDeIdade());
    }

    @Test
    void retornaTrueSeEmailForValido() {
        String[] testeEmail = Main.cliente.getEmail().split("@");

        List<String> emailsValidos = new ArrayList<>();
        emailsValidos.add("icloud.com");
        emailsValidos.add("gmail.com");
        emailsValidos.add("outlook.com");
        Assertions.assertTrue(emailsValidos.contains(testeEmail[1]));
    }

    @Test
    void retornaTrueSeTodosForamAdicionadosAoBanco() {

        Assertions.assertEquals(Cliente.getClientes(), BancoDeDados.clientes.size());
    }

}
