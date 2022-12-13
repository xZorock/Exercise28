package it.develhope.exercise28;

public class Start {
    public static void main(String[] args) {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        ++b;

        if (((b %2 != 0) && ((b * b + 1) %3 == 0))){
            System.out.println("All conditions met");
        }else System.out.println("No conditions meet");
    }
}
