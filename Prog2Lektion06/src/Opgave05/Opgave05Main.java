package Opgave05;

import java.sql.PreparedStatement;

public class Opgave05Main {
    public static void main(String[] args) {
        System.out.println(sfd(325*13, 325*7));



    }
    public static int sfd(int a, int b) {
        if (b <= a && (a % b == 0)){
            return b;
        }
        if (a < b){
           return sfd(b, a);
        }
        else return sfd(a, a%b);
    }

}
