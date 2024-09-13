package co.edu.uniquindio;

import co.edu.uniquindio.factory.ModelFactory;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEmpresa {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        crudDepartamento(modelFactory);
    }

    public static void crudDepartamento(ModelFactory modelFactory) {
       createDepartamento(modelFactory);
       deleteDepartamento(modelFactory);
    }

    private static void createDepartamento(ModelFactory modelFactory) {
        boolean actualizado = modelFactory.createDepartamento("Finanzas", "usaba");
        System.out.println("Se elimino el departamento " + actualizado);
    }

    private static  void deleteDepartamento(ModelFactory modelFactory){
        boolean eliminado = modelFactory.deleteDepartamento("ajshba");
    }
}