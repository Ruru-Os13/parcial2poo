/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.parcial2poo;

import com.mycompany.parcial2poo.controller.ColegioControlador;
import com.mycompany.parcial2poo.model.Estudiante;
import com.mycompany.parcial2poo.model.Profesor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegracionTest {

    @Test
    public void testFlujoCompleto() {

        ColegioControlador ctrl = new ColegioControlador();

        ctrl.agregarEstudiante(new Estudiante("Ana", "Cali", "123", "2005", "001", "11"));
        ctrl.agregarProfesor(new Profesor("Luis", "Cali", "456", "1990",
                                          "222", "Física", 10000, 100));

        ctrl.ordenarProfesoresPorSalario();

        assertEquals(1, ctrl.getEstudiantes().size());
        assertEquals(1, ctrl.getProfesores().size());
    }
}