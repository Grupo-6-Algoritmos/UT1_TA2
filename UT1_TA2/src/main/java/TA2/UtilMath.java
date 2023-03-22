/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TA2;

/**
 * @author zhynk
 */
public class UtilMath {

    public static int factorial(int num) {
        int resultado = 1;
        for (int i = num; i > 0; i--) {
            resultado *= i ;
        }
        return resultado;
    }
    
    public static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
            if (n % i == 0) {
                prime = false;
                break;
            }
            if (( n%2 !=0 && prime && n > 2) || n == 2) {
                return true;
            } else {
                return false;
            }
    }
    
    public static int evenOrOddAdder(long n){
        int i = 0;
        int res = 0;
        boolean prime = false;
        if (isPrime(n)){
            prime = true;
        }
        while (n >= i){
            if (prime && i % 2 == 0){
                res += i;
            }
            if (!prime && i % 2 != 0){
                res += i;
            } 
            i++;
        }   
        return res;
    }

}
