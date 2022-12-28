/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author oscar
 */
public class LIstaNomina
{

    private Nomina inicio;
    private Nomina fin;

    /**
     *
     */
    public LIstaNomina()
    {
        this.inicio = null;
        this.fin = null;
    }

    /**
     *
     * @param nuevo
     */
    public void inserta(Nomina nuevo)
    {
        if (getInicio() != null)
        {
            getFin().setSig(nuevo);
            setFin(nuevo);
        } else
        {
            setInicio(nuevo);
            setFin(nuevo);
        }
    }

    /**
     * @return the inicio
     */
    public Nomina getInicio()
    {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nomina inicio)
    {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public Nomina getFin()
    {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Nomina fin)
    {
        this.fin = fin;
    }

    public void verLista()
    {
        Nomina nodo = getInicio();
        while (nodo != null)
        {
            System.out.println("Fecha inicio:");
            System.out.println("\t" + nodo.getFechaInicio().get(Calendar.DAY_OF_MONTH) + "/" + (nodo.getFechaInicio().get(Calendar.MONTH) + 1) + "/" + nodo.getFechaInicio().get(Calendar.YEAR));
            System.out.println("Fecha fin:");
            System.out.println("\t" + nodo.getFechaFin().get(Calendar.DAY_OF_MONTH) + "/" + (nodo.getFechaFin().get(Calendar.MONTH) + 1) + "/" + nodo.getFechaFin().get(Calendar.YEAR));
            System.out.println("Salario:");
            System.out.println("\t" + nodo.getSueldo());
            System.out.println("---------------------------------------");
            nodo = nodo.getSig();
        }
    }
}
