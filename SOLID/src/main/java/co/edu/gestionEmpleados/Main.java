package co.edu.uniquindio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class MenuInteractivo {

        private static List<Empleado> empleados = new ArrayList<>();
        private static List<Departamento> departamentos = new ArrayList<>();
        private static List<Proyecto> proyectos = new ArrayList<>();}

        public static void main(String[] args) {
        Departamento depto1 = new Departamento("Tecnología", "D002");
        Gerente gerente = new Gerente("Alice", 1,depto1 );
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

            while (true) {
                String[] opciones = {
                        "Agregar Empleado Normal",
                        "Agregar Técnico",
                        "Agregar Gerente",
                        "Agregar Departamento",
                        "Agregar Proyecto",
                        "Asignar Empleado a Departamento",
                        "Asignar Empleado a Proyecto",
                        "Asignar Gerente a Proyecto",
                        "Mostrar Datos",
                        "Salir"
                };
                int eleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Interactivo",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                switch (eleccion) {
                    case 0:
                        agregarEmpleadoNormal();
                        break;
                    case 1:
                        agregarTecnico();
                        break;
                    case 2:
                        agregarGerente();
                        break;
                    case 3:
                        agregarDepartamento();
                        break;
                    case 4:
                        agregarProyecto();
                        break;
                    case 5:
                        asignarEmpleadoADepartamento();
                        break;
                    case 6:
                        asignarEmpleadoAProyecto();
                        break;
                    case 7:
                        asignarGerenteAProyecto();
                        break;
                    case 8:
                        mostrarDatos();
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            }
        }

        private static void agregarEmpleadoNormal() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento del empleado:");

            Departamento departamento = MenuInteractivo.departamentos.stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);
            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            Empleado empleado = new Empleado(nombre, idEmpleado, departamento);
            MenuInteractivo.empleados.add(empleado);
        }

        private static void agregarTecnico() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del técnico:");
            int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del técnico:"));
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento del técnico:");
            String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del técnico:");

            Departamento departamento = MenuInteractivo.departamentos.stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);
            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            Tecnico tecnico = new Tecnico(nombre, idEmpleado, especialidad, departamento);
            MenuInteractivo.empleados.add(tecnico);
        }

        private static void agregarGerente() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del gerente:");
            int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del gerente:"));
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento del gerente:");

            Departamento departamento = MenuInteractivo.departamentos.stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);
            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            Gerente gerente = new Gerente(nombre, idEmpleado, departamento);
            MenuInteractivo.empleados.add(gerente);
        }

        private static void agregarDepartamento() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del departamento:");
            String codigo = JOptionPane.showInputDialog("Ingrese el código del departamento:");
            Departamento departamento = new Departamento(nombre, codigo);
            MenuInteractivo.departamentos.add(departamento);
        }

        private static void agregarProyecto() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
            String codigo = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
            Proyecto proyecto = new Proyecto(nombre, codigo);
            MenuInteractivo.proyectos.add(proyecto);
        }

        private static void asignarEmpleadoADepartamento() {
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento al que desea asignar el empleado:");
            Departamento departamento = MenuInteractivo.departamentos.stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);

            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado a asignar:");
            Empleado empleado = MenuInteractivo.empleados.stream().filter(e -> e.getIdEmpleado() == Integer.parseInt(idEmpleado)).findFirst().orElse(null);

            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            departamento.agregarEmpleado(empleado);
        }

        private static void asignarEmpleadoAProyecto() {
            String codigoProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto al que desea asignar el empleado:");
            Proyecto proyecto = MenuInteractivo.proyectos.stream().filter(p -> p.getCodigo().equals(codigoProyecto)).findFirst().orElse(null);

            if (proyecto == null) {
                JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                return;
            }

            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado a asignar:");
            Empleado empleado = MenuInteractivo.empleados.stream().filter(e -> e.getIdEmpleado() == Integer.parseInt(idEmpleado)).findFirst().orElse(null);

            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            proyecto.asignarEmpleado(empleado);
        }

        private static void asignarGerenteAProyecto() {
            String codigoProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto al que desea asignar el gerente:");
            Proyecto proyecto = MenuInteractivo.proyectos.stream().filter(p -> p.getCodigo().equals(codigoProyecto)).findFirst().orElse(null);

            if (proyecto == null) {
                JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                return;
            }

            String idGerente = JOptionPane.showInputDialog("Ingrese el ID del gerente a asignar (deje en blanco si no hay):");
            if (!idGerente.trim().isEmpty()) {
                Gerente gerente = (Gerente) MenuInteractivo.empleados.stream().filter(e -> e instanceof Gerente && e.getIdEmpleado() == Integer.parseInt(idGerente)).findFirst().orElse(null);
                if (gerente == null) {
                    JOptionPane.showMessageDialog(null, "Gerente no encontrado.");
                    return;
                }
                proyecto.asignarGerente(gerente);
            }
        }

        private static void mostrarDatos() {
            String departamentosStr = MenuInteractivo.departamentos.stream().map(Departamento::toString).collect(Collectors.joining("\n\n"));
            String proyectosStr = MenuInteractivo.proyectos.stream().map(Proyecto::toString).collect(Collectors.joining("\n\n"));
            String empleadosStr = MenuInteractivo.empleados.stream().map(Empleado::toString).collect(Collectors.joining("\n\n"));

            String mensaje = "Departamentos:\n" + departamentosStr + "\n\nProyectos:\n" + proyectosStr + "\n\nEmpleados:\n" + empleadosStr;
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

