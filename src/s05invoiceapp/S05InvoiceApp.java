/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s05invoiceapp;

/**
 *
 * @author alumno
 */
public class S05InvoiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mensaje de bienvenida al usuario
  System.out.println("Bienvenido a la Aplicacion Total Factura");
  System.out.println(); // print a blank line
// Crear un objeto tipo Scanner con identificador sc
Scanner sc = new Scanner(System.in);
// Obtener el subtotal del usuario
  System.out.print("Ingrese Subtotal: ");
double subtotal = sc.nextDouble();
double impuesto = subtotal * 0.18;
double total = subtotal + impuesto;
// Mostrar el total de factura
String mensaje = "Total Factura: " + total + "\n";
  System.out.println(mensaje);
}

    }

    

