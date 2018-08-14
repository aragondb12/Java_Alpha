
package basics;
import java.util.Scanner;
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
        int num=4;
        int fac=1;
        /*for (int i = num; i == 1; i--) {
            System.out.println(fac=num*i);
        }*/
        int linea=5;
        for (int i = 1; i<=num; i++) {
            System.out.println(fac=fac*i);
        }
         do{
             System.out.println("Linea numero: "+ linea);
             linea--;
         }while(linea!=0);
         System.out.println("=======================================");
          int num1, num2,res;
          
         Scanner entrada= new Scanner(System.in);
         System.out.print("Ingrese el primer numero: ");
         //num1= entrada.nextInt();
         System.out.print("Ingrese el segundo numero: ");
         //num2= entrada.nextInt();
         //res= num1+num2;
         //System.out.println("Resultado= "+res);
         System.out.println("=======================================");
         int a,b,c,aux;
         System.out.print("N1:");
         a=entrada.nextInt();
         System.out.print("N2:");
         b=entrada.nextInt();
         System.out.print("N3:");
         c=entrada.nextInt();
        if (a<b) {
            if (b<c) {
                System.out.println("A,B,C"+a+b+c);
            }
            if(a<c){
                System.out.println("A,C,B"+a+c+b);
            }else{
                System.out.println("C,A,B"+c+a+b);
            }
        }else{
            if (c<b) {
                System.out.println("C,B,A"+c+b+a);
            }else{
                if (a<c) {
                    System.out.println("B,A,C"+b+a+c);
                }else{
                    System.out.println("B,A,C"+b+a+c);
                }
            }
        
        }
         
    }
}
