/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.week11tpprotype;

/**
 *
 * @author JiJi
 */
public class Week11TpProtype {

    public static void main(String[] args) {
        
        Employe employe = new Employe(12, "Mooken", "1802HJCB28", 2500);
        Employe employe2 = (Employe) employe.getClone();
        employe2.setId(98);
 
        System.out.println(employe);
        System.out.println(employe2);
    }
}
