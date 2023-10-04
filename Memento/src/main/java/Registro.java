
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryam
 */
public class Registro {
    	private String nombre;
	private int edad;
	private String cedula;

	public Registro(String n, int e, String c){
		this.nombre = n;
		this.edad = e;
		this.cedula = c;
	}

        public Object[] getRegistro() {
            Object[] registro = new Object[]{this.cedula, this.nombre, this.edad};
            return registro;
        }

}
