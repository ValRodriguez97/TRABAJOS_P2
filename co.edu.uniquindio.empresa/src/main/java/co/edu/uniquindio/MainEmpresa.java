package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;
import co.edu.uniquindio.model.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEmpresa {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudDepartamento(modelFactory);
        //crudTecnico(modelFactory);
        crudPresupuesto(modelFactory);
    }

    /**
     * Test del crud del apartamento
     * @param modelFactory
     */
    public static void crudDepartamento(ModelFactory modelFactory) {
        createDepartamento(modelFactory);
        deleteDepartamento(modelFactory);
        readDepartamento(modelFactory);
        updateDepartamento(modelFactory);
    }

    private static void createDepartamento(ModelFactory modelFactory) {
        boolean actualizado = modelFactory.createDepartamento("Finanzas", "usaba");
        System.out.println("Se creo el departamento " );
    }

    private static void deleteDepartamento(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.deleteDepartamento("ajshba");

    }

    private static void readDepartamento(ModelFactory modelFactory){
        Departamento departamento = modelFactory.readDepartamento("123");
        System.out.println(departamento.getCodigo());
    }

    private static void updateDepartamento(ModelFactory modelFactory) {
        boolean actualizado = modelFactory.updateDepartamento("Updata", "7346");
        System.out.println("El procedimiento fue "+actualizado);
    }

    /**
     * Test del crud del tecnico
     * @param modelFactory
     */
  /*  public static void crudTecnico(ModelFactory modelFactory){
        createTecnico(modelFactory);
        deleteTecnico(modelFactory);
        readTecnico(modelFactory);
        updateTecnico(modelFactory);
    }

    private static void createTecnico(ModelFactory modelFactory){
        boolean centinela = modelFactory.createTecnico("Jamir", "vuc", 21, new Departamento("Sistemas", "0000"), "Artes marciales");
        System.out.println("El resultado fue " + centinela);
    }

    private static void deleteTecnico(ModelFactory modelFactory) {
        Boolean centinela = modelFactory.deleteTecnico("2");
        System.out.println("El resultado fue " + centinela);
    }

    private static void readTecnico(ModelFactory modelFactory){
        Tecnico tecnico = modelFactory.readTecnico("1");
        System.out.println(tecnico.toString());
    }

    private static void updateTecnico(ModelFactory modelFactory){
        Boolean centinela = modelFactory.updateTecnico("Jose Jose", "3", 20, new Departamento("Electricidad", "123456789"), "Cocinar");
        System.out.println("El resultado fue " + centinela);
    }*/

    /**
     * Test del crud del apartamento
     * @param modelFactory
     */
    public static void crudPresupuesto(ModelFactory modelFactory) {
        createPresupuesto(modelFactory);
        deletePresupuesto(modelFactory);
        readPresupuesto(modelFactory);
        updatePresupuesto(modelFactory);
    }
    private static void createPresupuesto(ModelFactory modelFactory) {
        Boolean presupuesto = modelFactory.createPresupuesto("123", 200000, "disponible", "Cuenta para donar a funaciones");
        System.out.println("El resultado fue " + presupuesto);
    }

    private static void deletePresupuesto(ModelFactory modelFactory) {
        boolean eliminado = modelFactory.deletePresupuesto("123");
        System.out.println("El resultado fue " + eliminado);
    }

    private static void readPresupuesto(ModelFactory modelFactory) {
        Presupuesto presupuesto = modelFactory.readPresupuesto("123");
        System.out.println("El resultado fue " +presupuesto);
    }

    private static void updatePresupuesto(ModelFactory modelFactory) {
        Presupuesto presupuesto = modelFactory.readPresupuesto("123");
        System.out.println("El resultado fue " + presupuesto);
    }

}