

package sueldoalmacen;


import javax.swing.JOptionPane;

/**
 *
 * @author CamiloVelasco
 */
public class SueldoAlmacen {
    public static void main(String[] args) {
        
        double nombre = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nombre"));
        double cedula = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
        double sueldoBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario basico"));
        double salarioMinimo = 1300000; 
        
        double diasLaborados = Double.parseDouble("Ingrese la cantidad de dias laborados");
        
        double Transporte = 84140;
        double AuxTransporte = Transporte*diasLaborados/30;
        if (AuxTransporte <= salarioMinimo );
              
        double sueldoDevengado = salarioMinimo*diasLaborados/30;
        
        double comisionVentas = 200000;
        
        double totalDevengado = sueldoDevengado + comisionVentas ;
        double salarioNeto = totalDevengado ;
        
        JOptionPane.showMessageDialog(null, " Ingrese su nombre " + nombre
        +" Ingrese su numero de cedula : " + cedula + " Ingrese su salario minimo : " + sueldoBasico + "$\n"
        +"Auxilio de transporte" + AuxTransporte + "Su comision de ventas es : " + comisionVentas 
        + "Su salario final es : $ " + salarioNeto );
        
    }
}