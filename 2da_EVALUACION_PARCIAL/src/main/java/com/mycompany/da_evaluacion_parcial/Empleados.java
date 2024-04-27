/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.da_evaluacion_parcial;

/**
 *
 * @author nacho
 */
public abstract class Empleados {
  public String Nombre;
  public int SalarioBase;

    public Empleados() {
        this.Nombre = "------";
        this.SalarioBase =0;
    }

    public Empleados(String Nombre, int SalarioBase) {
        this.Nombre = Nombre;
        this.SalarioBase = SalarioBase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(int SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

  
  
  
}
