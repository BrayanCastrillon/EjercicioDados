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
public class Cliente {

    public void lanzar() {
        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int d = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0, d11 = 0, d12 = 0;
        for (int i = 0; i < 1000; i++) {
            int suma = ((d1.dados()) + (d2.dados()));
            if ((suma) == 2) {
                d++;
            }
            if ((suma) == 3) {
                d3++;
            }
            if ((suma) == 4) {
                d4++;
            }
            if ((suma) == 5) {
                d5++;
            }
            if ((suma) == 6) {
                d6++;
            }
            if ((suma) == 7) {
                d7++;
            }
            if ((suma) == 8) {
                d8++;
            }
            if ((suma) == 9) {
                d9++;
            }
            if ((suma) == 10) {
                d10++;
            }
            if ((suma) == 11) {
                d11++;
            }
            if ((suma) == 12) {
                d12++;
            }

        }

        System.out.println("Frecuencia dado 2: " + d);
        System.out.println("Frecuencia dado 3: " + d3);
        System.out.println("Frecuencia dado 4: " + d4);
        System.out.println("Frecuencia dado 5: " + d5);
        System.out.println("Frecuencia dado 6: " + d6);
        System.out.println("Frecuencia dado 7: " + d7);
        System.out.println("Frecuencia dado 8: " + d8);
        System.out.println("Frecuencia dado 9: " + d9);
        System.out.println("Frecuencia dado 10: " + d10);
        System.out.println("Frecuencia dado 11: " + d11);
        System.out.println("Frecuencia dado 12: " + d12);
    }

}
