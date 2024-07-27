package org.example.model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BancoDeDados {

    public Set<Cliente> clientes;

    public BancoDeDados() {
        this.clientes = new LinkedHashSet<>();
    }

    public int NumDeClientes() {
        return clientes.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BancoDeDados that)) return false;
        return Objects.equals(clientes, that.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clientes);
    }
}
