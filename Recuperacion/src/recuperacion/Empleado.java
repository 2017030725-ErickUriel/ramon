/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion;

/**
 *
 * @author Erick
 */
public class Empleado {
    //Atributos
    private int numeroEmpleado;
    private String nombreEmpleado;
    private String domicilioEmpleado;
    private float sueldoBase;
    private int nivelEmpleado;
    
    //Constructores
    public Empleado(){
        //constructor por omision
        this.numeroEmpleado=1;
        this.nombreEmpleado="Jose Lopez";
        this.domicilioEmpleado="Av de las rosas 23";
        this.sueldoBase=5000;
        this.nivelEmpleado=1;
    }
    public Empleado(int numero,String nombre,String domicilio,float sueldo,int nivel){
        //Constructor con parametros
        this.numeroEmpleado=numero;
        this.nombreEmpleado=nombre;
        this.domicilioEmpleado=domicilio;
        this.sueldoBase=sueldo;
        this.nivelEmpleado=nivel;
    }
    public Empleado(Empleado otra){
        this.numeroEmpleado=otra.numeroEmpleado;
        this.nombreEmpleado=otra.nombreEmpleado;
        this.domicilioEmpleado=otra.domicilioEmpleado;
        this.sueldoBase=otra.sueldoBase;
        this.nivelEmpleado=otra.nivelEmpleado;
    }

    /**
     * @return the numeroEmpleado
     */
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * @param numeroEmpleado the numeroEmpleado to set
     */
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    /**
     * @return the nombreEmpleado
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * @param nombreEmpleado the nombreEmpleado to set
     */
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    /**
     * @return the domicilioEmpleado
     */
    public String getDomicilioEmpleado() {
        return domicilioEmpleado;
    }

    /**
     * @param domicilioEmpleado the domicilioEmpleado to set
     */
    public void setDomicilioEmpleado(String domicilioEmpleado) {
        this.domicilioEmpleado = domicilioEmpleado;
    }

    /**
     * @return the sueldoBase
     */
    public float getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase the sueldoBase to set
     */
    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * @return the nivelEmpleado
     */
    public int getNivelEmpleado() {
        return nivelEmpleado;
    }

    /**
     * @param nivelEmpleado the nivelEmpleado to set
     */
    public void setNivelEmpleado(int nivelEmpleado) {
        this.nivelEmpleado = nivelEmpleado;
    }
    
    public float calcularPagoComision(int ventas){
        if(nivelEmpleado==1)
            return ventas*.07F;
        else
            return ventas*.010F;
    }
    public float calcularBonoVenta(){
        if(nivelEmpleado==1)
            return sueldoBase*0.05F;
        else
            return sueldoBase*0.10F;
    }
    public float calcularPago(int ventas){
        return sueldoBase+calcularPagoComision(ventas)+calcularBonoVenta();
    }
            
}
