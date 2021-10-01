/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.Modelos.Modelo;
import mvc.Vistas.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {

    //Importo las dos clases
    private Vista vista = new Vista();
    private Modelo modelo = new Modelo();

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.btn_Calcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        modelo.setNumero1(Integer.parseInt(vista.Caja_1.getText()));

        modelo.setNumero2(Integer.parseInt(vista.Caja_2.getText()));
        
        
        modelo.sumar();
        vista.Caja_Resultado.setText(String.valueOf(modelo.sumar())); // Dentro de los parentesis le traigo los resultados d ela funciont

    }

}
