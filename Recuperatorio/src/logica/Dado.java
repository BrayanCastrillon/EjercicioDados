/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Estudiantes
 */
public class Dado {

    public int dados() {

        int numero = (int) (Math.random() * 6) + 1;

        return numero;
    }
}
