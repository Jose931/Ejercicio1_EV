/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	private double saldo;
    private double tipoInteres;


    public CCuenta()
    {
    }
  /*Este metodo asigna losdatos de nombre, cuenta, saldo a la CCUenta*/
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
  /*Asigna un nombre a la cuenta*/
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return saldo;
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    public String obtenerCuenta()
    {
        return cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
