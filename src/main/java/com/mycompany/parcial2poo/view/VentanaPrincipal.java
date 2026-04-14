/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2poo.view;

import com.mycompany.parcial2poo.controller.ColegioControlador;
import com.mycompany.parcial2poo.model.Estudiante;
import com.mycompany.parcial2poo.model.Profesor;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private ColegioControlador ctrl = new ColegioControlador();
    private JTextArea area;

    public VentanaPrincipal() {

        setTitle("Sistema Colegio");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnEst = new JButton("Agregar Estudiante");
        btnEst.setBounds(50, 30, 180, 30);
        add(btnEst);

        JButton btnProf = new JButton("Agregar Profesor");
        btnProf.setBounds(250, 30, 180, 30);
        add(btnProf);

        JButton btnVerEst = new JButton("Ver Estudiantes");
        btnVerEst.setBounds(50, 80, 180, 30);
        add(btnVerEst);

        JButton btnVerProf = new JButton("Ver Profesores");
        btnVerProf.setBounds(250, 80, 180, 30);
        add(btnVerProf);

        area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(50, 130, 380, 200);
        add(scroll);

        // 🔹 AGREGAR ESTUDIANTE
        btnEst.addActionListener(e -> {
            Estudiante est = new Estudiante(
                JOptionPane.showInputDialog("Nombre"),
                JOptionPane.showInputDialog("Dirección"),
                JOptionPane.showInputDialog("Teléfono"),
                JOptionPane.showInputDialog("Fecha"),
                JOptionPane.showInputDialog("Código"),
                JOptionPane.showInputDialog("Grado")
            );
            ctrl.agregarEstudiante(est);
        });

        // 🔹 AGREGAR PROFESOR
        btnProf.addActionListener(e -> {
            Profesor p = new Profesor(
                JOptionPane.showInputDialog("Nombre"),
                JOptionPane.showInputDialog("Dirección"),
                JOptionPane.showInputDialog("Teléfono"),
                JOptionPane.showInputDialog("Fecha"),
                JOptionPane.showInputDialog("Cédula"),
                JOptionPane.showInputDialog("Área"),
                Double.parseDouble(JOptionPane.showInputDialog("Salario hora")),
                Integer.parseInt(JOptionPane.showInputDialog("Horas"))
            );
            ctrl.agregarProfesor(p);
        });

        // 🔹 VER ESTUDIANTES (manual)
        btnVerEst.addActionListener(e -> {
            String texto = "";
            for (Estudiante est : ctrl.getEstudiantes()) {
                texto += "Nombre: " + est.getNombre() + "\n";
                texto += "Código: " + est.getCodigoEstudiante() + "\n";
                texto += "Grado: " + est.getGrado() + "\n";
                texto += "----------------------\n";
            }
            area.setText(texto);
        });

        // 🔹 VER PROFESORES (manual + ordenados)
        btnVerProf.addActionListener(e -> {

            ctrl.ordenarProfesoresPorSalario();

            String texto = "";
            for (Profesor p : ctrl.getProfesores()) {
                texto += "Nombre: " + p.getNombre() + "\n";
                texto += "Salario: " + String.format("%,.0f", p.calcularSalario()) + "\n";
                texto += "Prestaciones: " + String.format("%,.0f", p.calcularPrestaciones()) + "\n";
                texto += "----------------------\n";
            }
            area.setText(texto);
        });
    }
}