/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author oscar
 */
public class DetallePension implements Datos
{

    private String totalSemanasCotizadas;
    private String salarioPromedioUlt250;
    private String tieneEsposa;
    private String cantHijos;
    private String cantPadres;
    private String edad;
    private String uma;
    private String salarioVuma;
    private String salDiarProm;
    private String cuantiaBasica;
    private String cuantiaDiaria;
    private String cuantiaBasicaAnual;
    private String incrementoCuantiaBasica;
    private String incrementoDiario;
    private String incrementoAnualPrevio;
    private String aniosDespues500Sem;
    private String incrementoAnualCuantiaBasica;
    private String cuantiaBasAnual;
    private String cuantiaAnualPension;
    private String ayudaAnualAsigEsposa;
    private String ayudaAnualHijos;
    private String ayudaAnualPadres;
    private String ayudaAnualSoledad;
    private String totalAyudas;
    private String cuantiaAnualPensionAyudas;
    private String incremento11Porc;
    private String pensionAnualVejez;
    private String porcPensionxEdad;
    private String pensionAnualxCesentia;
    private String pensionMensual;
    private Object detallePromedio[][];
    private String sumaSalario;

    public DetallePension()
    {
    }

    /**
     * @return the totalSemanasCotizadas
     */
    public String getTotalSemanasCotizadas()
    {
        return totalSemanasCotizadas;
    }

    /**
     * @param totalSemanasCotizadas the totalSemanasCotizadas to set
     */
    public void setTotalSemanasCotizadas(String totalSemanasCotizadas)
    {
        this.totalSemanasCotizadas = totalSemanasCotizadas;
    }

    /**
     * @return the salarioPromedioUlt250
     */
    public String getSalarioPromedioUlt250()
    {
        return salarioPromedioUlt250;
    }

    /**
     * @param salarioPromedioUlt250 the salarioPromedioUlt250 to set
     */
    public void setSalarioPromedioUlt250(String salarioPromedioUlt250)
    {
        this.salarioPromedioUlt250 = salarioPromedioUlt250;
    }

    /**
     * @return the tieneEsposa
     */
    public String getTieneEsposa()
    {
        return tieneEsposa;
    }

    /**
     * @param tieneEsposa the tieneEsposa to set
     */
    public void setTieneEsposa(String tieneEsposa)
    {
        this.tieneEsposa = tieneEsposa;
    }

    /**
     * @return the cantHijos
     */
    public String getCantHijos()
    {
        return cantHijos;
    }

    /**
     * @param cantHijos the cantHijos to set
     */
    public void setCantHijos(String cantHijos)
    {
        this.cantHijos = cantHijos;
    }

    /**
     * @return the cantPadres
     */
    public String getCantPadres()
    {
        return cantPadres;
    }

    /**
     * @param cantPadres the cantPadres to set
     */
    public void setCantPadres(String cantPadres)
    {
        this.cantPadres = cantPadres;
    }

    /**
     * @return the edad
     */
    public String getEdad()
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad)
    {
        this.edad = edad;
    }

    /**
     * @return the uma
     */
    public String getUma()
    {
        return uma;
    }

    /**
     * @param uma the uma to set
     */
    public void setUma(String uma)
    {
        this.uma = uma;
    }

    /**
     * @return the salarioVuma
     */
    public String getSalarioVuma()
    {
        return salarioVuma;
    }

    /**
     * @param salarioVuma the salarioVuma to set
     */
    public void setSalarioVuma(String salarioVuma)
    {
        this.salarioVuma = salarioVuma;
    }

    /**
     * @return the salDiarProm
     */
    public String getSalDiarProm()
    {
        return salDiarProm;
    }

    /**
     * @param salDiarProm the salDiarProm to set
     */
    public void setSalDiarProm(String salDiarProm)
    {
        this.salDiarProm = salDiarProm;
    }

    /**
     * @return the cuantiaBasica
     */
    public String getCuantiaBasica()
    {
        return cuantiaBasica;
    }

    /**
     * @param cuantiaBasica the cuantiaBasica to set
     */
    public void setCuantiaBasica(String cuantiaBasica)
    {
        this.cuantiaBasica = cuantiaBasica;
    }

    /**
     * @return the cuantiaDiaria
     */
    public String getCuantiaDiaria()
    {
        return cuantiaDiaria;
    }

    /**
     * @param cuantiaDiaria the cuantiaDiaria to set
     */
    public void setCuantiaDiaria(String cuantiaDiaria)
    {
        this.cuantiaDiaria = cuantiaDiaria;
    }

    /**
     * @return the cuantiaBasicaAnual
     */
    public String getCuantiaBasicaAnual()
    {
        return cuantiaBasicaAnual;
    }

    /**
     * @param cuantiaBasicaAnual the cuantiaBasicaAnual to set
     */
    public void setCuantiaBasicaAnual(String cuantiaBasicaAnual)
    {
        this.cuantiaBasicaAnual = cuantiaBasicaAnual;
    }

    /**
     * @return the incrementoCuantiaBasica
     */
    public String getIncrementoCuantiaBasica()
    {
        return incrementoCuantiaBasica;
    }

    /**
     * @param incrementoCuantiaBasica the incrementoCuantiaBasica to set
     */
    public void setIncrementoCuantiaBasica(String incrementoCuantiaBasica)
    {
        this.incrementoCuantiaBasica = incrementoCuantiaBasica;
    }

    /**
     * @return the incrementoDiario
     */
    public String getIncrementoDiario()
    {
        return incrementoDiario;
    }

    /**
     * @param incrementoDiario the incrementoDiario to set
     */
    public void setIncrementoDiario(String incrementoDiario)
    {
        this.incrementoDiario = incrementoDiario;
    }

    /**
     * @return the incrementoAnualPrevio
     */
    public String getIncrementoAnualPrevio()
    {
        return incrementoAnualPrevio;
    }

    /**
     * @param incrementoAnualPrevio the incrementoAnualPrevio to set
     */
    public void setIncrementoAnualPrevio(String incrementoAnualPrevio)
    {
        this.incrementoAnualPrevio = incrementoAnualPrevio;
    }

    /**
     * @return the aniosDespues500Sem
     */
    public String getAniosDespues500Sem()
    {
        return aniosDespues500Sem;
    }

    /**
     * @param aniosDespues500Sem the aniosDespues500Sem to set
     */
    public void setAniosDespues500Sem(String aniosDespues500Sem)
    {
        this.aniosDespues500Sem = aniosDespues500Sem;
    }

    /**
     * @return the incrementoAnualCuantiaBasica
     */
    public String getIncrementoAnualCuantiaBasica()
    {
        return incrementoAnualCuantiaBasica;
    }

    /**
     * @param incrementoAnualCuantiaBasica the incrementoAnualCuantiaBasica to
     * set
     */
    public void setIncrementoAnualCuantiaBasica(String incrementoAnualCuantiaBasica)
    {
        this.incrementoAnualCuantiaBasica = incrementoAnualCuantiaBasica;
    }

    /**
     * @return the cuantiaBasAnual
     */
    public String getCuantiaBasAnual()
    {
        return cuantiaBasAnual;
    }

    /**
     * @param cuantiaBasAnual the cuantiaBasAnual to set
     */
    public void setCuantiaBasAnual(String cuantiaBasAnual)
    {
        this.cuantiaBasAnual = cuantiaBasAnual;
    }

    /**
     * @return the cuantiaAnualPension
     */
    public String getCuantiaAnualPension()
    {
        return cuantiaAnualPension;
    }

    /**
     * @param cuantiaAnualPension the cuantiaAnualPension to set
     */
    public void setCuantiaAnualPension(String cuantiaAnualPension)
    {
        this.cuantiaAnualPension = cuantiaAnualPension;
    }

    /**
     * @return the ayudaAnualAsigEsposa
     */
    public String getAyudaAnualAsigEsposa()
    {
        return ayudaAnualAsigEsposa;
    }

    /**
     * @param ayudaAnualAsigEsposa the ayudaAnualAsigEsposa to set
     */
    public void setAyudaAnualAsigEsposa(String ayudaAnualAsigEsposa)
    {
        this.ayudaAnualAsigEsposa = ayudaAnualAsigEsposa;
    }

    /**
     * @return the ayudaAnualHijos
     */
    public String getAyudaAnualHijos()
    {
        return ayudaAnualHijos;
    }

    /**
     * @param ayudaAnualHijos the ayudaAnualHijos to set
     */
    public void setAyudaAnualHijos(String ayudaAnualHijos)
    {
        this.ayudaAnualHijos = ayudaAnualHijos;
    }

    /**
     * @return the ayudaAnualPadres
     */
    public String getAyudaAnualPadres()
    {
        return ayudaAnualPadres;
    }

    /**
     * @param ayudaAnualPadres the ayudaAnualPadres to set
     */
    public void setAyudaAnualPadres(String ayudaAnualPadres)
    {
        this.ayudaAnualPadres = ayudaAnualPadres;
    }

    /**
     * @return the ayudaAnualSoledad
     */
    public String getAyudaAnualSoledad()
    {
        return ayudaAnualSoledad;
    }

    /**
     * @param ayudaAnualSoledad the ayudaAnualSoledad to set
     */
    public void setAyudaAnualSoledad(String ayudaAnualSoledad)
    {
        this.ayudaAnualSoledad = ayudaAnualSoledad;
    }

    /**
     * @return the totalAyudas
     */
    public String getTotalAyudas()
    {
        return totalAyudas;
    }

    /**
     * @param totalAyudas the totalAyudas to set
     */
    public void setTotalAyudas(String totalAyudas)
    {
        this.totalAyudas = totalAyudas;
    }

    /**
     * @return the cuantiaAnualPensionAyudas
     */
    public String getCuantiaAnualPensionAyudas()
    {
        return cuantiaAnualPensionAyudas;
    }

    /**
     * @param cuantiaAnualPensionAyudas the cuantiaAnualPensionAyudas to set
     */
    public void setCuantiaAnualPensionAyudas(String cuantiaAnualPensionAyudas)
    {
        this.cuantiaAnualPensionAyudas = cuantiaAnualPensionAyudas;
    }

    /**
     * @return the incremento11Porc
     */
    public String getIncremento11Porc()
    {
        return incremento11Porc;
    }

    /**
     * @param incremento11Porc the incremento11Porc to set
     */
    public void setIncremento11Porc(String incremento11Porc)
    {
        this.incremento11Porc = incremento11Porc;
    }

    /**
     * @return the pensionAnualVejez
     */
    public String getPensionAnualVejez()
    {
        return pensionAnualVejez;
    }

    /**
     * @param pensionAnualVejez the pensionAnualVejez to set
     */
    public void setPensionAnualVejez(String pensionAnualVejez)
    {
        this.pensionAnualVejez = pensionAnualVejez;
    }

    /**
     * @return the porcPensionxEdad
     */
    public String getPorcPensionxEdad()
    {
        return porcPensionxEdad;
    }

    /**
     * @param porcPensionxEdad the porcPensionxEdad to set
     */
    public void setPorcPensionxEdad(String porcPensionxEdad)
    {
        this.porcPensionxEdad = porcPensionxEdad;
    }

    /**
     * @return the pensionAnualxCesentia
     */
    public String getPensionAnualxCesentia()
    {
        return pensionAnualxCesentia;
    }

    /**
     * @param pensionAnualxCesentia the pensionAnualxCesentia to set
     */
    public void setPensionAnualxCesentia(String pensionAnualxCesentia)
    {
        this.pensionAnualxCesentia = pensionAnualxCesentia;
    }

    /**
     * @return the pensionMensual
     */
    public String getPensionMensual()
    {
        return pensionMensual;
    }

    /**
     * @param pensionMensual the pensionMensual to set
     */
    public void setPensionMensual(String pensionMensual)
    {
        this.pensionMensual = pensionMensual;
    }

    public boolean creaExcel()
    {
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter(" ", " "));
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.setApproveButtonText("Guardar");
        jfc.setDialogTitle("Seleccione ubicación");
        int selection = jfc.showSaveDialog(null);
        if (selection == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                Workbook book = new XSSFWorkbook();
                Sheet cedulaPension = book.createSheet("CEDULA PENSIÓN");

                Font calibri18Bold = book.createFont();
                calibri18Bold.setFontName("Calibri");
                calibri18Bold.setBold(true);
                calibri18Bold.setColor(IndexedColors.BLACK.getIndex());
                calibri18Bold.setFontHeightInPoints((short) 18);

                CellStyle titulo1 = book.createCellStyle();
                titulo1.setFillForegroundColor(IndexedColors.TURQUOISE.getIndex());
                titulo1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                titulo1.setBorderBottom(BorderStyle.THIN);
                titulo1.setBorderLeft(BorderStyle.THIN);
                titulo1.setBorderRight(BorderStyle.THIN);
                titulo1.setBorderTop(BorderStyle.THIN);
                titulo1.setFont(calibri18Bold);
                titulo1.setAlignment(HorizontalAlignment.CENTER);
                titulo1.setVerticalAlignment(VerticalAlignment.CENTER);

                Font calibri12 = book.createFont();
                calibri12.setFontName("Calibri");
                calibri12.setBold(false);
                calibri12.setColor(IndexedColors.BLACK.getIndex());
                calibri12.setFontHeightInPoints((short) 18);

                CellStyle texto1 = book.createCellStyle();
                texto1.setFillForegroundColor(IndexedColors.WHITE.getIndex());
                texto1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                texto1.setBorderBottom(BorderStyle.THIN);
                texto1.setBorderLeft(BorderStyle.THIN);
                texto1.setBorderRight(BorderStyle.THIN);
                texto1.setBorderTop(BorderStyle.THIN);
                texto1.setFont(calibri12);
                texto1.setVerticalAlignment(VerticalAlignment.CENTER);

                Row fila;
                Cell celda;
                int i = -1;

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(0, 0, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("REPORTE PENSIÓN POR CESANTIA O VEJEZ");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(1, 1, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("LEY 1973 IMSS");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("TOTAL SEMANAS COTIZADAS");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getTotalSemanasCotizadas()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("SALARIO PROMEDIO ULTIMAS 250 SEMANAS COTIZADAS");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getSalarioPromedioUlt250()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("¿Existe esposa?");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(getTieneEsposa());

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("NUMERO DE HIJOS MENORES DE EDAD O 25 AÑOS ESTUDIANDO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCantHijos()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("PADRES QUE DEPENDEN ECONOMICAMENTE");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCantPadres()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("EDAD");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getEdad()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("UNIDAD DE MEDIDA(UMA)");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getUma()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("SALARIO EN VUMA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getSalarioVuma()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("CALCULO");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);
                celda.setCellValue("ANUAL");

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("CUANTÍA BÁSICA");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("SALARIO DIARIO PROMEDIO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getSalarioPromedioUlt250()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) CUANTÍA BÁSICA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaBasica()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) CUANTÍA DIARIA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaDiaria()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("X365");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(365);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) CUANTÍA BÁSICA ANUAL");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaBasAnual()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("INCREMENTOS ANUALES A LA CUANTÍA BÁSICA");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("SALARIO DIARIO PROMEDIO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getSalarioPromedioUlt250()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) INCREMENTO CUANTÍA BÁSICA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getIncrementoCuantiaBasica()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) INCREMENTO DIARIO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getIncrementoDiario()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("X365");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(365);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) INCREMENTO ANUAL PREVIO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getIncrementoAnualPrevio()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) AÑOS DESPUES DE PRIMERAS 500 SEMANAS");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getAniosDespues500Sem()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) INCREMENTO ANUAL A LA CUANTÍA BÁSICA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getIncrementoAnualCuantiaBasica()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("TOTAL PENSIÓN ANUAL");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("CUANTÍA BÁSICA ANUAL");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaBasAnual()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(+) INCREMENTO ANUAL A LA CUANTÍA BÁSICA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getIncrementoAnualCuantiaBasica()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) CUANTÍA ANUAL DE LA PENSIÓN");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPension()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("ASIGNACIONES FAMILIARES");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("ESPOSA/CONCUBINA");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("CUANTÍA ANUAL DE LA PENSIÓN");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPension()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) 15% SI EXISTE LA VIUDA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellType(CellType.NUMERIC);
                celda.setCellValue("15.00%");

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) AYUDA ANUAL ASIGNACIÓN ESPOSA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getAyudaAnualAsigEsposa()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("HIJO MENORES DE EDAD O MENORES DE 25 ESTUDIANDO");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("CUANTÍA ANUAL DE LA PENSIÓN");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPension()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) 10%");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellType(CellType.NUMERIC);
                celda.setCellValue("10.00%");

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) NO HIJOS MENORES O ESTUDIANDO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCantHijos()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) AYUDA ANUAL HIJOS MENORES O ESTUDIANDO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getAyudaAnualHijos()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("PADRES (SI NO HAY ESPOSA O HIJOS)");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("CUANTÍA ANUAL DE LA PENSIÓN");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPension()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) 20%");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellType(CellType.NUMERIC);
                celda.setCellValue("20.00%");

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) NO PADRES");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCantPadres()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) AYUDA ANUAL PADRES");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getAyudaAnualPadres()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("SOLEDAD (SIN PADRES, SIN HIJOS, SIN ESPOSA)");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("CUANTÍA ANUAL DE LA PENSIÓN");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPension()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) 15%");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellType(CellType.NUMERIC);
                celda.setCellValue("15.00%");

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) AYUDA ANUAL X SOLEDAD");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getAyudaAnualSoledad()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("SUMA PENSIÓN MAS AYUDAS FAMILIARES");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("TOTAL AYUDAS");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getTotalAyudas()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(+) CUANTÍA ANUAL DE LA PENSIÓN");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPension()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) CUANTÍA ANUAL DE LA PENSIÓN + AYUDAS");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPensionAyudas()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("PENSIÓN POR VEJEZ (MAS 11% DECRETO FEDERAL)");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("CUANTÍA ANUAL DE LA PENSIÓN + AYUDAS");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getCuantiaAnualPensionAyudas()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) INCREMENTO 11% ARTÍCULO DÉCIMO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellType(CellType.NUMERIC);
                celda.setCellValue("11%");

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) PENSIÓN ANUAL X VEJEZ");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getPensionAnualVejez()));

                i++;
                fila = cedulaPension.createRow(i);

                cedulaPension.addMergedRegion(new CellRangeAddress(i, i, 1, 2));
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("PENSIÓN POR CESANTÍA");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("PORCENTAJE DE PENSIÓN X EDAD DEL TRABAJADOR");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getPorcPensionxEdad()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(X) PENSIÓN ANUAL X VEJEZ");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getPensionAnualVejez()));

                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("(=) PENSIÓN ANUAL X CESANTÍA EN EDAD AVANZADA");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getPensionAnualxCesentia()));

                i++;
                i++;
                fila = cedulaPension.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("PENSIÓN MENSUAL");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getPensionMensual()));

                cedulaPension.setColumnWidth(0, 3000);
                cedulaPension.setColumnWidth(1, 22000);
                cedulaPension.setColumnWidth(2, 7000);

                Sheet calculoSalario = book.createSheet("CALCULO SALARIO");

                i = -1;

                i++;
                fila = calculoSalario.createRow(i);

                celda = fila.createCell(1);
                celda.setCellStyle(texto1);
                celda.setCellValue("FECHA DE INICIO");
                celda = fila.createCell(2);
                celda.setCellStyle(texto1);
                celda.setCellValue("FECHA DE FIN");
                celda = fila.createCell(3);
                celda.setCellStyle(texto1);
                celda.setCellValue("SEMANAS");
                celda = fila.createCell(4);
                celda.setCellStyle(texto1);
                celda.setCellValue("SUELDO");

                for (int j = 0; j < detallePromedio.length; j++)
                {
                    i++;
                    fila = calculoSalario.createRow(i);

                    celda = fila.createCell(1);
                    celda.setCellStyle(texto1);
                    celda.setCellValue(detallePromedio[j][0].toString());
                    celda = fila.createCell(2);
                    celda.setCellStyle(texto1);
                    celda.setCellValue(detallePromedio[j][1].toString());
                    celda = fila.createCell(3);
                    celda.setCellStyle(texto1);
                    celda.setCellValue(Double.parseDouble(detallePromedio[j][3].toString()));
                    celda = fila.createCell(4);
                    celda.setCellStyle(texto1);
                    celda.setCellValue(Double.parseDouble(detallePromedio[j][2].toString()));
                }

                i++;
                i++;
                fila = calculoSalario.createRow(i);

                celda = fila.createCell(3);
                celda.setCellStyle(texto1);
                celda.setCellValue("SUMA");
                celda = fila.createCell(4);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getSumaSalario()));

                i++;
                fila = calculoSalario.createRow(i);

                celda = fila.createCell(3);
                celda.setCellStyle(texto1);
                celda.setCellValue("PROMEDIO");
                celda = fila.createCell(4);
                celda.setCellStyle(texto1);
                celda.setCellValue(Double.parseDouble(getSalarioPromedioUlt250()));

                calculoSalario.setColumnWidth(1, 9000);
                calculoSalario.setColumnWidth(2, 9000);
                calculoSalario.setColumnWidth(3, 6000);
                calculoSalario.setColumnWidth(4, 6000);

                Sheet tabla = book.createSheet("TABLAS");

                i = -1;

                i++;
                fila = tabla.createRow(i);

                tabla.addMergedRegion(new CellRangeAddress(i, i, 0, 1));
                celda = fila.createCell(0);
                celda.setCellStyle(titulo1);
                celda.setCellValue("VSM");
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);

                i++;
                fila = tabla.createRow(i);

                celda = fila.createCell(0);
                celda.setCellStyle(titulo1);
                celda.setCellValue("De:");
                celda = fila.createCell(1);
                celda.setCellStyle(titulo1);
                celda.setCellValue("A:");
                celda = fila.createCell(2);
                celda.setCellStyle(titulo1);
                celda.setCellValue("Cuantía Básica");
                celda = fila.createCell(3);
                celda.setCellStyle(titulo1);
                celda.setCellValue("Incremento \nAnual");
                fila.setHeightInPoints(50);

                for (int j = 0; j < TABLAINCREMENTOS.length; j++)
                {

                    i++;
                    fila = tabla.createRow(i);

                    celda = fila.createCell(0);
                    celda.setCellStyle(texto1);
                    if (j == 0)
                    {
                        celda.setCellValue(" - ");
                    } else
                    {
                        celda.setCellValue(TABLAINCREMENTOS[j - 1][0] + 0.01);
                    }
                    celda = fila.createCell(1);
                    celda.setCellStyle(texto1);
                    if (j == TABLAINCREMENTOS.length - 1)
                    {
                        celda.setCellValue(" - ");
                    } else
                    {
                        celda.setCellValue(TABLAINCREMENTOS[j][0]);
                    }
                    celda = fila.createCell(2);
                    celda.setCellStyle(texto1);
                    celda.setCellValue(TABLAINCREMENTOS[j][1]);
                    celda = fila.createCell(3);
                    celda.setCellStyle(texto1);
                    celda.setCellValue(TABLAINCREMENTOS[j][2]);
                }

                tabla.setColumnWidth(0, 6500);
                tabla.setColumnWidth(1, 6500);
                tabla.setColumnWidth(2, 10000);
                tabla.setColumnWidth(3, 15000);
                try
                {
                    File file = new File(jfc.getSelectedFile().getAbsolutePath() + ".xlsx");
                    FileOutputStream fos = new FileOutputStream(file);
                    book.write(fos);
                    fos.close();
                    Desktop.getDesktop().open(file);
                } catch (Exception e)
                {
                }
                return true;
            } catch (Exception e)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @return the detallePromedio
     */
    public Object[][] getDetallePromedio()
    {
        return detallePromedio;
    }

    /**
     * @param detallePromedio the detallePromedio to set
     */
    public void setDetallePromedio(Object[][] detallePromedio)
    {
        this.detallePromedio = detallePromedio;
    }

    /**
     * @return the sumaSalario
     */
    public String getSumaSalario()
    {
        return sumaSalario;
    }

    /**
     * @param sumaSalario the sumaSalario to set
     */
    public void setSumaSalario(String sumaSalario)
    {
        this.sumaSalario = sumaSalario;
    }
}
