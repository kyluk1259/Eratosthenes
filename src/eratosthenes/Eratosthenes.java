/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenes;

import java.util.ArrayList;

/**
 *
 * @author kyluk1259
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //rrayList<Integer> prNum = new ArrayList<Integer>();
        int n = 1000;
        boolean[] nums = new boolean[1001];
        int counter = 0;

        System.out.println("The prime numbers of 1 - 1000 are:");
        try {
            //set boolean values to true
            for (int i = 0; i < n; i++) {
                nums[i] = true;
            }

            //check if a number is prime
            for (int p = 2; p * p <= n; p++) {

                if (nums[p] == true) {
                    //if a number is not prime, set bool to false
                    for (int i = p * p; i <= n; i += p) {
                        nums[i] = false;
                    }
                }
            }

            for (int i = 2; i <= n; i++) {
                //print prime numbers
                if (nums[i] == true) {
                    System.out.print(i + " ");
                    counter++;
                }
                //create new line after 15 prime numbers
                if (counter == 15) {
                    System.out.println(" ");
                    counter = 0;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
