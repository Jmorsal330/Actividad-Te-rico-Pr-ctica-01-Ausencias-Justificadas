package main;

import java.util.HashMap;
/**
 * Clase que Gestiona los empleados con metodos como agregar, buscar y eliminar empleados.
 * 
 * @author Javier Moreno Salas
 * @version 0.2
 */
public class GestorEmpleados {

    private HashMap<String, Empleado> empleados;


    /**
     * Contructor de GestorEmpleados
     */
    public GestorEmpleados() {
        empleados = new HashMap<>();
    }

    /**
     * Funcion que recibe un empleado y lo agrega
     * 
     * @param empleado - empleado a añadir
     * @return La localizacion en el Map
     */
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleados.put(empleado.getId(), empleado);
    }


    /**
     * Busca un empleado
     * 
     * @param id - codigo del empleado a buscar
     * @return devuelve el id de empleado
     */
    public Empleado buscarEmpleado(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El ID no puede ser null o vacío");
        }
        return empleados.get(id);
    }


    /**
     * Elimina un empleado
     * 
     * @param id - codigo del empleado a eliminar
     * @return devuelve el id del empleado eliminado
     */
    public Empleado eliminarEmpleado(String id) {
        return empleados.remove(id);
    }


    /**
     * Calcular el salario total
     * 
     * @return devuelve el salario total
     */
    public double calcularSalarioTotal() {
        return empleados.values().stream().mapToDouble(Empleado::calcularSalario).sum();
    }

    /**
     * Es la funcion main, crea un gestor de empleados y agrega un nuevo empleado
     * 
     * @param args
     */
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        gestor.agregarEmpleado(new Empleado("1", "Juan Pérez", 30000));
    }


    /**
     * Clases empleado con los metodos de calcular salario
     * 
     * 
     * @author Javier Moreno Salas
     * @version 0.2
     */
    public static class Empleado {
        private String id;
        private String nombre;
        private double salarioBase;

        /**
         * Contuctor de empleado
         * 
         * @param id - id de empleado
         * @param nombre - nombre de empleado
         * @param salarioBase - salario base de empleado
         */
        public Empleado(String id, String nombre, double salarioBase) {
            this.id = id;
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }


        /**
         * Calcular el salario
         * 
         * @return devuelve el salario base
         */
        public double calcularSalario() {
            // Lógica para calcular el salario
            return salarioBase;
        }
    }
}
