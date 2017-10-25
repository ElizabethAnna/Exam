package exm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Controlador implements ActionListener, ChangeListener {

    Vista s;

    public Controlador() {
        s = new Vista();
        s.setVisible(true);

        s.btnBorrar.addActionListener(this);
        s.btnCalcular.addActionListener(this);
        s.spHoras.addChangeListener((javax.swing.event.ChangeListener) this);
        s.spAntiguedad.addChangeListener((javax.swing.event.ChangeListener) this);
        s.cboPuesto.addActionListener(this);

    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double h, an, st;
        String a = "";
        Double sue, cant, capa, apo, ant;
        Double isr, sal, sin, af;
        Double tp, td;

        h = (int) Double.parseDouble(s.spHoras.getValue().toString());
        an = (int) Double.parseDouble(s.spAntiguedad.getValue().toString());

        a = String.valueOf(s.cboPuesto.getSelectedItem());
        if (a == "Gerente") {
            s.etiPercepciones.setText(null);//opción1
            s.etiDeducciones.setText(null);//opción2
            sue = h * 200;
            cant = sue * .015;
            capa = sue * .025;
            apo = sue * .03;
            ant = an * 150;

            isr = sue * .16;
            sal = sue * .035;
            sin = sue * .01;
            af = sue * .02;

            tp = sue + cant + capa + apo + ant;
            td = isr + sal + sin + af;
            st = tp + td;

            if (ae.getSource() == s.btnCalcular) {

                s.etiPercepciones.append("Sueldo Base\t$" + sue + "\n");
                s.etiPercepciones.append("Canasta basica\t$" + cant + "\n");
                s.etiPercepciones.append("Capacitacion\t$" + capa + "\n");
                s.etiPercepciones.append("Apoyo\t$" + apo + "\n");
                s.etiPercepciones.append("Antiguedad\t$" + ant + "\n");
                s.etiPercepciones.append("TP\t$" + tp + "\n");

                s.etiDeducciones.append("ISR\t$" + isr + "\n");
                s.etiDeducciones.append("Salud\t$" + sal + "\n");
                s.etiDeducciones.append("Sindicato\t$" + sin + "\n");
                s.etiDeducciones.append("Afore\t$" + af + "\n");
                s.etiDeducciones.append("TD\t$" + td + "\n");
                s.etiDeducciones.append("Salario neto\t$" + st + "\n");

            }

        }
        if (a == "Cajero") {
            s.etiPercepciones.setText(null);//opción1
            s.etiDeducciones.setText(null);//opción2
            sue = h * 100;
            cant = sue * .015;
            capa = sue * .025;
            apo = sue * .03;
            ant = an * 150;

            isr = sue * .16;
            sal = sue * .035;
            sin = sue * .01;
            af = sue * .02;

            tp = sue + cant + capa + apo + ant;
            td = isr + sal + sin + af;
            st = tp + td;

            if (ae.getSource() == s.btnCalcular) {

                s.etiPercepciones.append("Sueldo Base\t$" + sue + "\n");
                s.etiPercepciones.append("Canasta basica\t$" + cant + "\n");
                s.etiPercepciones.append("Capacitacion\t$" + capa + "\n");
                s.etiPercepciones.append("Apoyo\t$" + apo + "\n");
                s.etiPercepciones.append("Antiguedad\t$" + ant + "\n");
                s.etiPercepciones.append("TP\t$" + tp + "\n");

                s.etiDeducciones.append("ISR\t$" + isr + "\n");
                s.etiDeducciones.append("Salud\t$" + sal + "\n");
                s.etiDeducciones.append("Sindicato\t$" + sin + "\n");
                s.etiDeducciones.append("Afore\t$" + af + "\n");
                s.etiDeducciones.append("TD\t$" + td + "\n");
                s.etiDeducciones.append("Salario neto\t$" + st + "\n");
            }

        }
        if (a == "Intendente") {
            s.etiPercepciones.setText(null);//opción1
            s.etiDeducciones.setText(null);//opción2
            sue = h * 70;
            cant = sue * .015;
            capa = sue * .025;
            apo = sue * .03;
            ant = an * 150;

            isr = sue * .16;
            sal = sue * .035;
            sin = sue * .01;
            af = sue * .02;

            tp = sue + cant + capa + apo + ant;
            td = isr + sal + sin + af;
            st = tp + td;

            if (ae.getSource() == s.btnCalcular) {

                s.etiPercepciones.append("Sueldo Base\t$" + sue + "\n");
                s.etiPercepciones.append("Canasta basica\t$" + cant + "\n");
                s.etiPercepciones.append("Capacitacion\t$" + capa + "\n");
                s.etiPercepciones.append("Apoyo\t$" + apo + "\n");
                s.etiPercepciones.append("Antiguedad\t$" + ant + "\n");
                s.etiPercepciones.append("TP\t$" + tp + "\n");

                s.etiDeducciones.append("ISR\t$" + isr + "\n");
                s.etiDeducciones.append("Salud\t$" + sal + "\n");
                s.etiDeducciones.append("Sindicato\t$" + sin + "\n");
                s.etiDeducciones.append("Afore\t$" + af + "\n");
                s.etiDeducciones.append("TD\t$" + td + "\n");
                s.etiDeducciones.append("Salario neto\t$" + st + "\n");
            }

        }
        if (ae.getSource() == s.btnBorrar) {
            s.etiPercepciones.setText(null);//opción1
            s.etiDeducciones.setText(null);//opción2

        }

    }

    public static void main(String[] args) {
        Controlador f = new Controlador();
    }

}
