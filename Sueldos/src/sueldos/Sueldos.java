
package sueldos;

import java.util.Scanner;

public class Sueldos {
    public static void main(String[] args) {
        Scanner dato1=new Scanner(System.in);
        Scanner dato2=new Scanner(System.in);
        float sueldo1,sueldo2,resultado;
        int categoria;
        System.out.println("Ingrese sueldo inicial");
        sueldo1=dato1.nextFloat();
        System.out.println("Ingrese la categoria (1)(2)(3) o (4)");
       categoria=dato2.nextInt();
        switch(categoria){
            case 1:
                sueldo2= (float)(sueldo1*0.15);
                resultado=sueldo2+sueldo1;
                System.out.println("El sueldo inicial es ="+sueldo1);
                System.out.println("La categoria elegida es ="+categoria);
                System.out.println("El sueldo final es ="+resultado);
                break;
             case 2:
                sueldo2= (float)(sueldo1*0.1);
                resultado=sueldo2+sueldo1;
                System.out.println("El sueldo inicial es ="+sueldo1);
                System.out.println("La categoria elegida es ="+categoria);
                System.out.println("El sueldo final es ="+resultado);
                break;
             case 3:
                sueldo2= (float)(sueldo1*0.08);
                resultado=sueldo2+sueldo1;
                System.out.println("El sueldo inicial es ="+sueldo1);
                System.out.println("La categoria elegida es ="+categoria);
                System.out.println("El sueldo final es ="+resultado);
                break;
             case 4:
                sueldo2= (float)(sueldo1*0.07);
                resultado=sueldo2+sueldo1;
                System.out.println("El sueldo inicial es ="+sueldo1);
                System.out.println("La categoria elegida es ="+categoria);
                System.out.println("El sueldo final es ="+resultado);
                break;
             default:
                 System.out.println("Ingrese la categoria correcta");
        }
    }
    
}
