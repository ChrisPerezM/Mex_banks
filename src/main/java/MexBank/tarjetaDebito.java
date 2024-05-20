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
public class tarjetaDebito extends cuentaBase{

    //Constructor herededado de la clase padre
    public tarjetaDebito(double montoActual, double apertura, double cantidad) {
        super(montoActual, apertura, cantidad);
    }

  //Metodos
 public void apertura (){
       super.montoActual = super.montoActual + super.apertura;
       
   }
   
  public void depositar (){
   super.montoActual= super.montoActual + cantidad;
    
    }
    
    public void retirar (){
      super.montoActual = super.montoActual - cantidad;
}
   

  

    public void mostrarDatos(){
       System.out.print("\n" +  "TARJETA DE DÉBITO" + "\n" +"El monto de apertura es : " + montoActual
        +  "\n" + "El monto a depositar es: " + cantidad
        + "\n" + "El monto a retirar es: " + cantidad
       + "\n" + "Su saldo es: " + montoActual);
    }
       
    
}
