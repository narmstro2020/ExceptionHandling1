package org.WalkerCC_CompSci;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        int a = 10;
////        int b = 0;
////        int c = 0;
////
////        if(b == 0){
////            System.out.println("Cannot divide Zero");
////        }
////        else{
////            c = a / b;
////            System.out.println(c);
////        }
        int a = 38;
        int b = 0;
        int c = 0;
        int d = 0;
        int q = 0;
        int r = 5;
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        try{
            c = a / r;
            System.out.println(ints.get(90));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException f){
            System.out.println(f.getMessage());
        }
        catch(Exception g){
            System.out.println(g.getMessage());
        }
        finally{
            d = a + c;
        }



        System.out.println(d);
        System.out.println(q);

    }
}
