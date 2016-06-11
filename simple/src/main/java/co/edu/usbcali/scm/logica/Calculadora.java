package co.edu.usbcali.scm.logica;

import javax.swing.JOptionPane;

public class Calculadora implements ICalculadora {
	
	private double result = 0; 
	private String operacion = "";
	
	public Calculadora(String operacion){
		this.operacion = operacion;		
	}

	public void sumar(int num1, int num2) {
		result = num1 + num2;
	}

	public void restar(int num1, int num2) {
		result = num1 - num2;

	}

	public void dividir(int num1, int num2) {
		result = num1 / num2;

	}

	public void multiplicar(int num1, int num2) {
		result = num1 * num2;

	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
		
	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public void imprimir(){
		System.out.println("Resultado: "+getOperacion() +" "+ getResult());
	}
	
	public static void main(String args[]){
		String numero1 = JOptionPane.showInputDialog("Ingrese numero 1: "  );
		String numero2 = JOptionPane.showInputDialog("Ingrese numero 2: "  );
		
		Calculadora c = new Calculadora("Sumar");
		c.sumar(Integer.parseInt(numero1), Integer.parseInt(numero2));
		
		//JOptionPane.showMessageDialog(null,c.imprimir(),null,null);
	}
	

}
