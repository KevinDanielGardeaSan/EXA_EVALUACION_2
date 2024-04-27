/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.da_evaluacion_parcial;

/**
 *
 * @author nacho
 */
public class Empleado_Por_Horas extends Empleados{
    private int Horas_Trabajadas;

    public Empleado_Por_Horas(String Nombre) {
    this.Nombre = "------";
        this.SalarioBase =0;    
    this.Horas_Trabajadas = 100;
    }

    public Empleado_Por_Horas(int Horas_Trabajadas) {
        this.Horas_Trabajadas = Horas_Trabajadas;
    }

    public Empleado_Por_Horas(int Horas_Trabajadas, String Nombre, int SalarioBase) {
        super(Nombre, SalarioBase);
        this.Horas_Trabajadas = Horas_Trabajadas;
    }

    public int getHoras_Trabajadas() {
        return Horas_Trabajadas;
    }

    public void setHoras_Trabajadas(int Horas_Trabajadas) {
        this.Horas_Trabajadas = Horas_Trabajadas;
    }
 public void imprimirDatos(){
  System.out.println("sueldo por Horas trabajadas: " + Horas_Trabajadas);
}
  
    
}
