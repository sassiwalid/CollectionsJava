/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicerev1;

/**
 *
 * @author walidsassi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Options opt=new Options(new String[]{"-u","u1","u2","u3","-g","g1","g2","-x"}, "-u -g");
        System.out.println(opt.toString());

    }
    
}
