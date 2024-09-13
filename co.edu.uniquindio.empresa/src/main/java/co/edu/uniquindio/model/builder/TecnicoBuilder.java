package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder {
    private String especialidad;

    public TecnicoBuilder nombre(String nombre) {
        super.self();
        return this;
    }

    public TecnicoBuilder idEmpleado(String idEmpleado) {
        super.self();
        return this;
    }

    public TecnicoBuilder edad(int edad) {
        super.self();
        return this;
    }

    public TecnicoBuilder departamento (Departamento departamento) {
        super.self();
        return this;
    }

    public TecnicoBuilder especialidad(String especialidad) {
        this.especialidad = especialidad;
        return this;
    }

    public Tecnico build() {
        return new Tecnico(self().nombre, self().idEmpleado, self().edad, self().departamento, especialidad);
    }
}
