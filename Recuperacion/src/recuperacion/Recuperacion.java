/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Recuperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in=new Scanner(System.in);
        Empleado empleado=new Empleado();
        
        int numero=0,ventas=0,nivel=0,op=0;
        float sueldo=0F;
        String nombre=" ",domicilio=" ";
        
        do{
            System.out.println(" 1- Capturar informacion de empleado");
            System.out.println(" 2- Capturar ventas e imprimir pago");
            System.out.println(" 3- Imprimir informacion del empleado");
            System.out.println(" 4- Salir");
            System.out.print(" Opcion---> ");
            op=in.nextInt();
            
            switch(op){
                case 1:
                    System.out.println(" Ingrese numero de empleado");
                    numero=in.nextInt();
                    System.out.println(" Ingrese nombre de empleado");
                    in.nextLine();
                    nombre=in.nextLine();
                    System.out.println(" Ingrese domicilio empleado");
                    in.nextLine();
                    domicilio=in.nextLine();
                    System.out.println(" Ingrese suldo base");
                    sueldo=in.nextFloat();
                    
                    do{
                        System.out.println(" Ingrese nivel del empleado");
                        nivel=in.nextInt();
                    }while(nivel<0 || nivel>2);
                    empleado.setNumeroEmpleado(numero);
                    empleado.setNombreEmpleado(nombre);
                    empleado.setDomicilioEmpleado(domicilio);
                    empleado.setSueldoBase(sueldo);
                    empleado.setNivelEmpleado(nivel);
                    break;
                    
                case 2:
                    System.out.println(" Ingrese numero de ventas");
                    ventas=in.nextInt();
                    System.out.println(" Comision "+empleado.calcularPagoComision(ventas));
                    System.out.println(" Bono "+empleado.calcularBonoVenta());
                    System.out.println(" pago "+empleado.calcularPago(ventas));
                    break;
                    
                case 3:
                    System.out.println(" Numero de empleado "+empleado.getNumeroEmpleado());
                    System.out.println(" Nombre de empleado "+empleado.getNombreEmpleado());
                    System.out.println(" Domicilio de empleado "+empleado.getDomicilioEmpleado());
                    System.out.println(" Sueldo base $"+empleado.getSueldoBase());
                    if(empleado.getNivelEmpleado()==1)
                        System.out.println(" Nivel 1 (vendedor de piso)");
                    else
                        System.out.println(" Nivel 2 (vendedor foraneo)");
                    break;
                default:System.out.println(" Opcion invalida");
            }
            
            
        }while(op!=4);
    }
    
}
