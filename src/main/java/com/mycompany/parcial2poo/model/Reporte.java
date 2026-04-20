/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2poo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Reporte {

    public String listarEstudiantes(ArrayList<Estudiante> estudiantes) {
        StringBuilder sb = new StringBuilder();

        for (Estudiante e : estudiantes) {
            sb.append(e.toString()).append("\n");
        }

        return sb.toString();
    }

    public String listarProfesores(ArrayList<Profesor> profesores) {

        Collections.sort(profesores, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor p1, Profesor p2) {
                return Double.compare(p2.calcularSalario(), p1.calcularSalario());
            }
        });

        StringBuilder sb = new StringBuilder();

        for (Profesor p : profesores) {
            sb.append(p.toString()).append("\n");
        }

        return sb.toString();
    }
}
