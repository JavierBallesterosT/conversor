package mvc;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mvc.Modelo;
import mvc.Controlador;
import mvc.Vista;



public class PruebaConversor  {
 public static void main(String arf[]) {
  try {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
  } 
  catch (UnsupportedLookAndFeelException e) {
  }
  catch (ClassNotFoundException e) {
  }
  catch (InstantiationException e) {
  }
  catch (IllegalAccessException e) {
  } 
  Modelo modelo = new Modelo();
  Vista vista = new Vista();
  Controlador controlador = new Controlador(modelo, vista);
  controlador.iniciarVista();
 }
}
