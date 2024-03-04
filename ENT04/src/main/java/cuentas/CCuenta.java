package cuentas;
 /**
  * 
  * @author Mario
  * @version 1.0
  */
public class CCuenta {

    /**
     * Atributos
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
   
   /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }
   /**
     * Constructor con parámetros
     * @param nom reemplaza nombre
     * @param cue reemplaza cuenta
     * @param sal reemplaza saldo
     * @param tipo no reemplaza nada
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

       /**
     * @return el saldo
     */
    public double estado()
    {
        return getSaldo();
    }
   /**
     * Método para ingresar dinero. Contiene excepciones en caso de que la cantidad sea negativa
     * @param cantidad se usa para añadir saldo
     *      * @throws impide que la cantidad sea negativa 

     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
   /**
     * Método para retirar dinero. Contiene excepciones en caso de que la cantidad sea negativa
     * o el saldo sea menor a la cantidad
     * @param cantidad se usa para quitar saldo
     * @throws impide que la cantidad sea negativa o el saldo menor a la canstidad
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre que modifica nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return el cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta que modifica cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo que modifica saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés que modifica tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
