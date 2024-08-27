package co.edu.uniquindio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Departamento depto1 = new Departamento("Tecnología", "D002");
        Gerente gerente = new Gerente("Alice", 1, depto1);
        Tecnico tecnico = new Tecnico("Bob", 2, "Procesamiento de datos", depto1);

        Departamento depto = new Departamento("Tecnología", "D001");
        depto.agregarGerente(gerente);
        depto.agregarEmpleado(tecnico);

        Proyecto proyecto = new Proyecto("Desarrollo de Software", "P001");
        proyecto.asignarGerente(gerente);
        proyecto.asignarEmpleado(tecnico);

        System.out.println(depto);
        System.out.println(proyecto);

        gerente.contribuir();
        tecnico.contribuir();
    }
}