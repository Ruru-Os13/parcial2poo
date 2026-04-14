/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2poo.controller;

import com.mycompany.parcial2poo.model.Estudiante;
import com.mycompany.parcial2poo.model.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ColegioControlador {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();

    // ESTUDIANTES
    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // PROFESORES
    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void ordenarProfesoresPorSalario() {
        Collections.sort(profesores, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor p1, Profesor p2) {
                return Double.compare(p2.calcularSalario(), p1.calcularSalario());
            }
        });
    }
}