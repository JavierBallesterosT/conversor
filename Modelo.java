package mvc;

public class Modelo {
 
 private double moneda;
 private double cantidad;
 private double resultado;
 
 /*public void setMoneda(double moneda) {
  this.moneda = moneda;
 }
 public void setCantidad(double cantidad) {
  this.cantidad = cantidad; 
 }*/
 public double getResultado() {
  return resultado;
 }
 public void convetirDolarAPeso() {
	 resultado = cantidad * moneda;
 }
 public void convertirPesoADolar() {
  resultado = cantidad * moneda;
 }
}
