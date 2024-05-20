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

//Clase hija
public class cuentaAhorro extends cuentaBase {

    //Herencia de la clase padre
    public cuentaAhorro(double montoActual, double apertura, double cantidad) {
        super(montoActual, apertura, cantidad);
    }

  
   

//Métodos con herencia
   public void apertura (){
       super.montoActual = super.montoActual + super.apertura;
       
   }

    

   public void depositar (){
   super.montoActual = super.montoActual + super.cantidad;
 
    }
    
    public void invertir (){
      super.montoActual = super.montoActual  + (super.montoActual*.1);
      
}
    
    //Método que nos mostrará en pantalla las cantidades de cada clase
    public void mostrarDatos(){
       System.out.print( "CUENTA DE AHORRO" + "\n" +"El monto de apertura es: " + apertura
        +  "\n" + "El monto a depositar es: " + cantidad
       + "\n" + "Su saldo es: " + montoActual);
    }
        
    }
    
    
  
