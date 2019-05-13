/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio;

import logica.Cliente;
import logica.Dado;

/**
 *
 * @author Estudiantes
 */
public class Recuperatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Las frecuencias de los lanzamientos de los dados 1000 veces son: ");
        Cliente c = new Cliente();
        c.lanzar();
    }

}
