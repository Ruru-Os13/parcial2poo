/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.parcial2poo;

import com.mycompany.parcial2poo.model.Profesor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    @Test
    public void testCalcularSalario() {

        Profesor p = new Profesor("Juan", "Cali", "123", "2000",
                                  "111", "Matemáticas", 10000, 100);

        assertEquals(1300000, p.calcularSalario());
    }
}