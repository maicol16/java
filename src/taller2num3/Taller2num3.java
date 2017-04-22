
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller2num3;

/**
 *
 * @author alpiz
 */
public class Taller2num3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a[] = {1,5,1,5,2,3,4,};
         
        int d  = -1;
        int cont = 0;
        int i;
        int j;
       
       for (i = 0; i < a.length; i++) {
            

        for ( j = 0; j < a.length; j++) {
            

        if (a [i]- a[j] == d) {

        cont++;

}
        }
         
      if (cont == 1) {

System.out.println("cuantas parejas cumplen con dicha\n" +
"condici´on " +  a[i]);

}
       }
    }
}