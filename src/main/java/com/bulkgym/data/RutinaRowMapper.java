package com.bulkgym.data;

import com.bulkgym.domain.Rutina;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RutinaRowMapper implements RowMapper<Rutina> {

    @Override
    public Rutina mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rutina rutina = new Rutina();

        rutina.setIdRutina(rs.getInt("id_rutina"));
        rutina.setFechaCreacion(rs.getDate("fecha_creacion"));
        rutina.setFechaRenovacion(rs.getDate("fecha_renovacion"));
        rutina.setHorario(rs.getString("horario"));
        rutina.setObjetivo(rs.getString("objetivo"));
        rutina.setLesiones(rs.getString("lesiones"));
        rutina.setPadecimientos(rs.getString("padecimientos"));

        return rutina;
    }
}
