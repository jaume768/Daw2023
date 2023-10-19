package Empleado;

public class EmpleadoAsalariado extends Empleado{

    private int salarioMensual;

    public EmpleadoAsalariado(String nombre, int edad, int salarioMensual){
        super(nombre,edad);
        this.salarioMensual = salarioMensual;
    }


    @Override
    public int saberSalario() {
        return salarioMensual;
    }
}
