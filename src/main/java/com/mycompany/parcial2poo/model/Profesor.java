/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2poo.model;

public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioHora;
    private int horasTrabajadas;

    // Constructor
    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasTrabajadas) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario() {
        double salarioBase = salarioHora * horasTrabajadas;
        return salarioBase + (salarioBase * 0.30);
    }

    public double calcularPrestaciones() {
        return calcularSalario() * 0.19;
    }

    public double calcularSalario(int horasExtra) {
        double salarioBase = salarioHora * (horasTrabajadas + horasExtra);
        return salarioBase + (salarioBase * 0.30);
    }

    @Override
    public String toString() {
        return nombre + " - Salario: " + calcularSalario() +
               " - Prestaciones: " + calcularPrestaciones();
    }
}