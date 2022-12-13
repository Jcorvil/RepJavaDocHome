/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Jorge
 */
public class CCuenta {

/**
 * @hidden nombre "nombre" establece el nombre de la cuenta
 */
     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *Constructor por defecto
     */
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue La cuenta en si
    * @param sal El saldo total de la cuenta
    * @param tipo Tipo de interés que tiene la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Almacena el nombre de la cuenta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return Devuelve el nombre almacenado
    */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * 
     * @return Devuelve el saldo de la cuenta
     */
     public double estado ()
    {
        return saldo;
    }
/**
 * 
 * @param cantidad Cantidad de dinero que se va a ingresar o retirar en la cuenta
 * @throws Exception
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad El saldo disponible en la cuenta
     * @throws Exception Mensajes que muestra si la cantidad de la cuenta no es suficiente
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     *
     * @return Devuelve la cuenta sobre la que se va a trabajar
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     * 
     * @param cuenta Otorga un nombre a la cuenta
     */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo Establece un saldo a la cuenta
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * 
  * @return Devuelve el tipo de interés de la cuenta
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés Establece el tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}