package co.edu.uniquindio;

import javax.swing.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Departamento depto1 = new Departamento("Tecnología", "D002");
            Gerente gerente = new Gerente("Alice", "1", depto1);
            Tecnico tecnico = new Tecnico("Bob", "2", "Procesamiento de datos", depto1);

            Departamento depto = new Departamento("Tecnología", "D001");
            depto.agregarEmpleado(tecnico);

            Proyecto proyecto = new Proyecto("Desarrollo de Software", "P001");
            proyecto.asignarGerente(gerente);
            proyecto.asignarEmpleado(tecnico);

            System.out.println(depto);
            System.out.println(proyecto);
            Empresa empresa = new Empresa();
            empresa.agregarDepartamentos(depto1);
            empresa.agregarDepartamentos(depto);
            empresa.agregarProyectos(proyecto);
            empresa.agregarEmpleados(gerente);
            empresa.agregarEmpleados(tecnico);

            gerente.contribuir();
            tecnico.contribuir();

            MenuInteractivo menu = new MenuInteractivo(empresa);
            menu.iniciarMenu();
        }

        public static class MenuInteractivo {
            private static Empresa empresa;

            public MenuInteractivo(Empresa empresa) {
                this.empresa = empresa;
            }

            public void iniciarMenu() {
                while (true) {
                    String[] opciones = {
                            "Añadir Empleado",
                            "Añadir Técnico",
                            "Añadir Gerente",
                            "Añadir Departamento",
                            "Añadir Proyecto",
                            "Assignar Empleado a Departamento",
                            "Asignar Empleado a Proyecto",
                            "Asignar Gerente a Proyecto",
                            "Mostrar Datos",
                            "Salir"
                    };

                    JList<String> listaOpciones = new JList<>(opciones);
                    listaOpciones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                    JScrollPane scrollPane = new JScrollPane(listaOpciones);
                    int eleccion = JOptionPane.showConfirmDialog(null, scrollPane, "Menú Opciones", JOptionPane.OK_CANCEL_OPTION);
                    switch (eleccion) {
                        case JOptionPane.OK_OPTION:
                            int indiceSeleccionado = listaOpciones.getSelectedIndex();

                            switch (indiceSeleccionado) {
                                case 0:
                                    agregarEmpleado();
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
                                    System.exit(0);
                            }
                            break;
                        case JOptionPane.CANCEL_OPTION:
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                            System.exit(0);
                            break;
                        case JOptionPane.CLOSED_OPTION:
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                            System.exit(0);
                    }
                }
            }
            
        private static void agregarEmpleado() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento del empleado:");

            Departamento departamento = empresa.getListDepartamentos().stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);
            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            Empleado empleado = new Empleado(nombre, idEmpleado, departamento);
            empresa.agregarEmpleados(empleado);
        }

        private static void agregarTecnico() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del técnico:");
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del técnico:");
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento del técnico:");
            String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del técnico:");

            Departamento departamento = empresa.getListDepartamentos().stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);
            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            Tecnico tecnico = new Tecnico(nombre, idEmpleado, especialidad, departamento);
            empresa.agregarEmpleados(tecnico);
        }

        private static void agregarGerente() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del gerente:");
            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del gerente:");
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento del gerente:");

            Departamento departamento = empresa.getListDepartamentos().stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);
            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            Gerente gerente = new Gerente(nombre, idEmpleado, departamento);
            empresa.agregarEmpleados(gerente);
        }

        private static void agregarDepartamento() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del departamento:");
            String codigo = JOptionPane.showInputDialog("Ingrese el código del departamento:");
            Departamento departamento = new Departamento(nombre, codigo);
            empresa.agregarDepartamentos(departamento);
        }

        private static void agregarProyecto() {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
            String codigo = JOptionPane.showInputDialog("Ingrese el código del proyecto:");
            Proyecto proyecto = new Proyecto(nombre, codigo);
            empresa.agregarProyectos(proyecto);
        }

        private static void asignarEmpleadoADepartamento() {
            String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento al que desea asignar el empleado:");
            Departamento departamento = empresa.getListDepartamentos().stream().filter(d -> d.getCodigo().equals(codigoDepartamento)).findFirst().orElse(null);

            if (departamento == null) {
                JOptionPane.showMessageDialog(null, "Departamento no encontrado.");
                return;
            }

            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado a asignar:");
            Empleado empleado = empresa.getListEmpleados().stream().filter(e -> e.getIdEmpleado().equals(idEmpleado)).findFirst().orElse(null);

            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            departamento.agregarEmpleado(empleado);
        }

        private static void asignarEmpleadoAProyecto() {
            String codigoProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto al que desea asignar el empleado:");
            Proyecto proyecto = empresa.getListProyectos().stream().filter(p -> p.getCodigo().equals(codigoProyecto)).findFirst().orElse(null);

            if (proyecto == null) {
                JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                return;
            }

            String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado a asignar:");
            Empleado empleado = empresa.getListEmpleados().stream().filter(e -> e.getIdEmpleado().equals( idEmpleado)).findFirst().orElse(null);

            if (empleado == null) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            proyecto.asignarEmpleado(empleado);
        }

        private static void asignarGerenteAProyecto() {
            String codigoProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto al que desea asignar el gerente:");
            Proyecto proyecto = empresa.getListProyectos().stream().filter(p -> p.getCodigo().equals(codigoProyecto)).findFirst().orElse(null);

            if (proyecto == null) {
                JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                return;
            }

            String idGerente = JOptionPane.showInputDialog("Ingrese el ID del gerente a asignar (deje en blanco si no hay):");
            if (!idGerente.trim().isEmpty()) {
                Gerente gerente = (Gerente) empresa.getListEmpleados().stream().filter(e -> e instanceof Gerente && e.getIdEmpleado().equals(idGerente)).findFirst().orElse(null);
                if (gerente == null) {
                    JOptionPane.showMessageDialog(null, "Gerente no encontrado.");
                    return;
                }
                proyecto.asignarGerente(gerente);
            }
        }

        private static void mostrarDatos() {
            String departamentosStr = empresa.getListDepartamentos().stream().map(Departamento::toString).collect(Collectors.joining("\n\n"));
            String proyectosStr = empresa.getListProyectos().stream().map(Proyecto::toString).collect(Collectors.joining("\n\n"));
            String empleadosStr = empresa.getListEmpleados().stream().map(Empleado::toString).collect(Collectors.joining("\n\n"));

            String mensaje = "Departamentos:\n" + departamentosStr + "\n\nProyectos:\n" + proyectosStr + "\n\nEmpleados:\n" + empleadosStr;
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}

