package com.bulkgym.data;

import com.bulkgym.domain.Cliente;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ClienteRowMapper implements RowMapper<Cliente> {

    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cliente cliente = new Cliente();

        // Atributos persona
        cliente.setIdPersona(rs.getInt("id_persona"));
        cliente.setNombre(rs.getString("nombre"));
        cliente.setApellidos(rs.getString("apellidos"));
        cliente.setTelefono(rs.getString("telefono"));
        cliente.setCorreoElectronico(rs.getString("correo_electronico"));
        cliente.setImagenRuta(rs.getString("imagen"));
        cliente.setFechaNacimiento(rs.getObject("fecha_nacimiento", LocalDate.class));
        cliente.setSexo(rs.getString("sexo").charAt(0)); // Asume que es un char almacenado como string

        // Atributos de Cliente
        cliente.setIdCliente(rs.getInt("id_cliente"));
        cliente.setActivo(rs.getBoolean("activo"));

        return cliente;
    }
}
