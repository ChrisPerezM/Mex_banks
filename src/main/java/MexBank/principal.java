/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MexBank;

/*Nombre completo: CHRISTIAN PEREZ MENDEZ
Matrícula: 21010561
Fecha de elaboración: 21/03/2022
Nombre del módulo: Programación Orientada a Objetos
Nombre del asesor: CLAUDIA PATRICIA ROJANO HERNANDEZ
*/

public class principal {
    
    //Método main
        public static void main (String [] args) {
            
            //Creación de objetos para cada clase 
           cuentaAhorro A = new cuentaAhorro(0,1000,500);
           A.apertura();
           A.depositar();
           A.invertir();
           A.mostrarDatos();
           tarjetaDebito B = new tarjetaDebito(0,2000,500);
           B.apertura();
           B.depositar();
           B.retirar();
           B.mostrarDatos();
           tarjetaCredito C = new tarjetaCredito(0,-2000,500);
           C.apertura();
           C.depositar();
           C.sumarInteres();
           C.mostrarDatos();
        }

}
