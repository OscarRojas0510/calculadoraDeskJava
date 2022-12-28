/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

import java.util.Calendar;

/**
 *
 * @author oscar
 */
public class Nomina
{

    private Calendar fechaInicio;
    private Calendar fechaFin;
    private double sueldo;
    private Nomina sig;

    /**
     *
     * @param fechaInicio
     * @param fechaFin
     * @param sueldo
     */
    public Nomina(Calendar fechaInicio, Calendar fechaFin, double sueldo)
    {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.sueldo = sueldo;
        this.sig = null;
    }

    /**
     * @return the fechaInicio
     */
    public Calendar getFechaInicio()
    {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Calendar fechaInicio)
    {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Calendar getFechaFin()
    {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Calendar fechaFin)
    {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo()
    {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    /**
     * @return the sig
     */
    public Nomina getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(Nomina sig)
    {
        this.sig = sig;
    }

}
