
package basics;

/**
 *
 * @author aragondb12
 */
public class Basics {

    public static void main(String[] args) {
        int opc=2, n=3;
        
        System.out.println("Hola Mundo");
         
        switch(opc){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
        }
      
        System.out.println("Ejercicio 1 Sesion 1");
         for (int i = 0; i < n; i++) {
             for(int j = 0;j <= i;j++){
             System.out.print("*");
             }
             System.out.println("");
         }
         System.out.println("Ejercicio 2 while");
         int fact = 1, cont =1;
         while (fact <10 ){
             System.out.println("Fact("+ cont + ")="+fact);
             cont++;
             fact=fact*cont;
         }
        int num=3;
        for (int i = 1; i <=num; i++) {
            System.out.println(num=num*i);
        }
    } 
    
}
