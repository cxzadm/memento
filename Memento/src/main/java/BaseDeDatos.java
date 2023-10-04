/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;



public class BaseDeDatos {
    	private ArrayList<Registro> listado;
	private Memento memento;

	public BaseDeDatos(){
		listado = new ArrayList<Registro>();
		memento = new Memento();
	}

	public void agregarRegistro(String nombre, int edad, String cedula){
		Registro temp = new Registro(nombre,edad,cedula);
		listado.add(temp);
	}

	public void limpiarBD(){
		listado = null;
	}
        

        public void mostrarListado(JTable miTabla) {
          if (listado != null) {
              DefaultTableModel modelo = (DefaultTableModel) miTabla.getModel();

              modelo.setRowCount(0);

              for (Registro temp : listado) {

                  modelo.addRow(temp.getRegistro());
              }
          } else {

              DefaultTableModel modelo = (DefaultTableModel) miTabla.getModel();
              modelo.setRowCount(0); // Limpiar la tabla
              modelo.addRow(new Object[]{"Base de datos vacía!!!", "", ""}); // Agregar mensaje
          }
      }

      

	public void generarBackup(){
		memento.setBackup(listado);
	}


        public void getBackup(int i) {
            listado = new ArrayList<Registro>();
            for (Registro temp : memento.getBackup(i)) {
                listado.add(temp);
            }

        }
	public int getTamanioBackup(){
		return memento.getSize();
	}
    
}
