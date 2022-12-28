package calc;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author oscar
 */
public class Calc
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        iniciaApp();
        
    }

    private static void iniciaApp()
    {
        Calculadora calc = new Calculadora();
        calc.setVisible(true);
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
        }
    }
}
