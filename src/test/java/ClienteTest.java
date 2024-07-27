import org.example.Main;
import org.example.model.Cliente;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    //afterall se todos os clientes foram adicionados no banco
    //beforeall verificar se o user é root e se cliente é null
    //testar exceção se idade for menor que 1
    //testar se cliente é maior de idade

    @Test
    void ClienteNull() {
        Main.main(new String[]{});
        Assertions.assertTrue(Cliente.getClientes() > 0);
    }
}
