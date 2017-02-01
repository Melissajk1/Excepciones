/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Gabriel
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      try{
       Recursivo();
      }catch (StackOverflowError e){
          System.out.println("El metodo es muy recursivo");
      }

      try{ 
      ArithmeticExceptio();
      }catch(ArithmeticException e){
          System.out.println("No se puede dividir entre cero");
      }
      try{
      ClassCastExceptio();
      }catch(ClassCastException e){
          System.out.println("Variable que no pasa el test IS-A");
      }
      try{
      ArrayIndexOutOfBoundsExceptio ();
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Mayor que la longitud del array");
      }
      /*try{
      IllegalArgumentExceptio ();
      }catch(IllegalArgumentException e){
          System.out.println("Tipo de variable diferente al que se espera");
      }*/
      try{
      NullPointerExceptio ();
      }catch(NullPointerException e){
          System.out.println("Objeto con variable con valor null");
      }
      try{
      NumberFormatExceptio ();
      }catch(NumberFormatException e){
          System.out.println("String no puede ser convertido");
      }
    }
    
    public static void Recursivo() {
     Recursivo();
    }
    
    public static void ArithmeticExceptio(){
      int i = 10/0;
        
    }
    
    public static void ClassCastExceptio(){
      Object n = 42;
      String s = (String)n;
        
    }
    
    public static void ArrayIndexOutOfBoundsExceptio (){
      int[]array = {0,1};
      
      for (int i=0;i<=2;i++)
          System.out.println(array[i]);
        
    }
    
    public static void IllegalArgumentExceptio (){
        String m = null;
        System.out.println(m.length());
      
        
    }
    public static void NullPointerExceptio(){
        
      String cadena = null; 
      cadena.equals("");
        
    }
    public static void NumberFormatExceptio(){
      String cadena = "1243e";
      Integer.parseInt(cadena);
    }
}
