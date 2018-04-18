package noereyes;

import javax.swing.JOptionPane;

/**
 * Nombre de la clase: NoeReyes
 * Fecha: 18/04/18
 * Version: 1.0
 * CopyRight: ITCA-FEPADE
 * @author Noé Reyes
 */
public class NoeReyes {

 
    public static void main(String[] args) {
        int nEmpleados;
        int opc;
        boolean flag=true;
        
        nEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados con el que desea trabajar."));
        
        
        
                String [] nombres= new String[nEmpleados];
                double [] salarioHora= new double[nEmpleados];
                int [] horasTrabajadas= new int[nEmpleados];
                double[] salario= new double [nEmpleados];
                double [] salarioRenta = new double[nEmpleados];
                int iterador=0;
               
        while (flag) {   
            opc=Integer.parseInt(JOptionPane.showInputDialog("+++++MENU+++++ \n "
                + "Agregar empleado-----Opción 1 \n"
                + "Calcular Planilla---------Opción 2 \n"
                + "salir--------------------------Opción 3 \n"
                + "Digite una opción"));
           switch(opc){
               
            case 1: 
                if (iterador>=nEmpleados) {
                    JOptionPane.showMessageDialog(null, "ya no se pueden ingresar empleados");
                }else{
                    nombres[iterador]=JOptionPane.showInputDialog("Nombre del empelado N°"+(iterador+1));
                
                    salarioHora[iterador]=Double.parseDouble(JOptionPane.showInputDialog("Salario por hora del empelado N°"+(iterador+1)));
                    
                    horasTrabajadas[iterador]=Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas del empleado N°"+(iterador+1)));      
                    
                    salario[iterador]=salarioHora[iterador]*horasTrabajadas[iterador];
                    
                    salarioRenta[iterador]=salario[iterador]-(salario[iterador]/100*10);
                    
                    JOptionPane.showMessageDialog(null, "Datos Empelado N°"+(iterador+1)
                            + "\n Nombre: "+nombres[iterador]
                            + "\n Salario por Hora: "+salarioHora[iterador]
                            + "\n Horas trabjadas: "+horasTrabajadas[iterador]
                            + "\n Salario Neto: "+salario[iterador]
                            + "\n Salario con Renta: "+salarioRenta[iterador]);
                    
                    iterador++;
                }
            break;
            case 2:
                    JOptionPane.showMessageDialog(null, "+++++Planilla+++++ \n"
                            + "");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
                flag=false;
            break;
        } 
        }
        
        
            
        }
                
    }
