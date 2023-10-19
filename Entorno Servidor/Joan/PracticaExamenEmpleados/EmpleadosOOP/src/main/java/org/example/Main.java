package org.example;

import Empleado.EmpleadoAsalariado;
import Empleado.EmpleadoPorHoras;

public class Main {
    public static void main(String[] args) {

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan",18,2000);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Tomeu",20,40,8);

        System.out.println(empleadoPorHoras.saberSalario());

    }
}