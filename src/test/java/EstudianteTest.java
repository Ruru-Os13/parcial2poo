/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.parcial2poo;

import com.mycompany.parcial2poo.model.Estudiante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testDatosEstudiante() {

        Estudiante e = new Estudiante("Ana", "Cali", "123", "2005", "001", "11");

        assertEquals("Ana", e.getNombre());
        assertEquals("001", e.getCodigoEstudiante());
        assertEquals("11", e.getGrado());
    }
}