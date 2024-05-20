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
public class tarjetaCredito extends cuentaBase {

    
    //  Constructor con herencia
    public tarjetaCredito(double montoActual, double apertura, double cantidad) {
        super(montoActual, apertura, cantidad);
    }

  //Métodos
   public void apertura (){
       super.montoActual = super.montoActual + super.apertura;
       
   }

  public void depositar (){
   super.montoActual= super.montoActual + cantidad;
    
    }
    
    public void sumarInteres (){
     super.montoActual = super.montoActual  + (super.montoActual*.15);
      
}
    public void mostrarDatos(){
       System.out.print("\n" + "TARJETA DE CRÉDITO" + "\n" +"El monto de crédito es: " + apertura
        +  "\n" + "El monto a depositar es: " + cantidad
       + "\n" + "Su saldo es: " + montoActual);
    }
        
}
