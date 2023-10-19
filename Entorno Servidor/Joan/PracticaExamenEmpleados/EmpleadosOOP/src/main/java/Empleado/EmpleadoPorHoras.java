package Empleado;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;
    private int salarioPorHoras;

    public EmpleadoPorHoras(String nombre,int edad, int horasTrabajadas, int salarioPorHoras){

        super(nombre,edad);
        this.salarioPorHoras = salarioPorHoras;
        this.horasTrabajadas = horasTrabajadas;

    }

    @Override
    public int saberSalario() {
        return (salarioPorHoras * horasTrabajadas) * 4;
    }
}
