package exm;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class Vista extends JFrame {

    JSpinner spHoras, spAntiguedad;
    JComboBox cboPuesto;
    JButton btnCalcular, btnBorrar;
    JTextArea etiPercepciones,etiDeducciones;
    JLabel etiHoras,etiAntiguedad,etiPue;
    
     
        
        

    public Vista() {

        this.setTitle(" Ejercicio1");
        this.setSize(800, 800);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        etiPercepciones = new JTextArea();
        this.getContentPane().add(etiPercepciones, new AbsoluteConstraints(10, 150, 270, 250));
        etiDeducciones = new JTextArea();
        this.getContentPane().add(etiDeducciones, new AbsoluteConstraints(300, 150, 270, 250));
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints(250, 40, 170, 20));
        btnBorrar = new JButton("Borrar");
        this.getContentPane().add(btnBorrar, new AbsoluteConstraints(250, 80, 170, 20));
        
        spHoras = new JSpinner();
        this.getContentPane().add(spHoras, new AbsoluteConstraints(120, 60, 70, 20));
        spAntiguedad = new JSpinner();
        this.getContentPane().add(spAntiguedad, new AbsoluteConstraints(120, 100, 70, 20));
        
        Object x[]= new Object[3];
        x[0]= "Gerente";
        x[1]="Cajero";
        x[2]="Intendente";
        cboPuesto = new JComboBox(x);
        this.getContentPane().add(cboPuesto, new AbsoluteConstraints(120, 10, 90, 20));
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(100);
        nm.setMinimum(0);
        spHoras.setModel(nm);
        
         SpinnerNumberModel s = new SpinnerNumberModel();
        s.setMaximum(100);
        s.setMinimum(0);
        spAntiguedad.setModel(s);
        
         etiHoras = new JLabel("Horas: ");
        this.getContentPane().add(etiHoras, new AbsoluteConstraints(10, 60, 70, 20));
         etiAntiguedad = new JLabel("Antiguedad: ");
        this.getContentPane().add(etiAntiguedad, new AbsoluteConstraints(10, 100, 70, 20));
         etiPue = new JLabel("Puesto: ");
        this.getContentPane().add(etiPue, new AbsoluteConstraints(10, 10, 70, 20));
    }

    public static void main(String[] args) {
        Vista s = new Vista();
        s.setVisible(true);
    } 

    
}
