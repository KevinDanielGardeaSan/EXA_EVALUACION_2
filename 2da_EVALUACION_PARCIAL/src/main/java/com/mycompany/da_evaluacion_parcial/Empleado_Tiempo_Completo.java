/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.da_evaluacion_parcial;

/**
 *
 * @author nacho
 */
public class Empleado_Tiempo_Completo extends Empleados{
    private int bono;

    public Empleado_Tiempo_Completo(String Nombre, int SalarioBase ) {
     this.Nombre = "------";
        this.SalarioBase =0; 
         this.bono=100;
    }

    public Empleado_Tiempo_Completo(int bono) {
        this.bono = bono;
    }

    public Empleado_Tiempo_Completo(int bono, String Nombre, int SalarioBase) {
        super(Nombre, SalarioBase);
        this.bono = bono;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    
    }
     public void imprimirDatos(){
   System.out.println("sueldo por Tiempo Completo: " + bono);
}
}

