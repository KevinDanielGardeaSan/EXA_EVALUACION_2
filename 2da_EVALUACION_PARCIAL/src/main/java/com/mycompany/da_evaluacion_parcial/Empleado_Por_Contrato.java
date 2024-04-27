/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.da_evaluacion_parcial;

/**
 *
 * @author nacho
 */
public class Empleado_Por_Contrato extends Empleados{
private int contrato;

    public Empleado_Por_Contrato() {
     this.Nombre = "------";
        this.SalarioBase =0;   
    }

    public Empleado_Por_Contrato(int contrato) {
        this.contrato = contrato;
    }

    public Empleado_Por_Contrato(int contrato, String Nombre, int SalarioBase) {
        super(Nombre, SalarioBase);
        this.contrato = contrato;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }
    public void imprimirDatos(){
  System.out.println("sueldo por contrato: " + contrato);
}
}
