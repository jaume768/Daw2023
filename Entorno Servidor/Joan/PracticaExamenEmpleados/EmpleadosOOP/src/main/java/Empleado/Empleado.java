package Empleado;

import lombok.AllArgsConstructor;
import lombok.Data;

public @Data
@AllArgsConstructor
abstract class Empleado {

    private String nombre;
    private int edad;

    public abstract int saberSalario();

}
