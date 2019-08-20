
package menu;

public class Operador {      
    public int numero1 = 0;
    public int numero2 = 0;
    public int total = 0;
    
    //Consturctor
    
    public Operador(int num1, int num2){
    
    this.numero1 = num1;
    this.numero2 = num2;
 
    }
    
    //Metodo suma
    
    public int suma (){
    
   return this.numero1+this.numero2;  
    
   }
    
    //Metodo resta
    
    public int resta (){
    
   return this.numero1-this.numero2;  
    
   }
    
    //Metodo divicion
    
    public int divicion (){
    
   return this.numero1/this.numero2;  
    
   }
    
    //Metodo resta
    
    public int multiplicacion (){
    
   return this.numero1+this.numero2;  
    
   }
    
}

