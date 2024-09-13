package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;

/**
 * Builder para crear instancias de la clase Departamenro
 * Implementación del builder del objeto Departamento
 */
public class DepartamentoBuilder {
    private String nombre;
    private String codigo;

    /**
     * Método para establecer el nombre del departamenti
     *
     * @param nombre Nombre del departamento
     * @return Instancia actual del DepartamentoBuilder
     */
    public DepartamentoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     * Método para establecer el codigo del departamento
     *
     * @param codigo Código del departamento
     * @return Instancia actual de DepartamentoBuilder
     */
    public DepartamentoBuilder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    /**
     * Método para crear una instancia de Departamento
     * @return
     */
    public Departamento build() {
        return new Departamento(nombre, codigo);
    }
}
