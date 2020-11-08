/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack2;

/**
 *
 * @author HP
 */
public class CobaStackSTATIS {
     public static void main(String args[]){
        
        STACK2 S = new STACK2();
        
        S.createEmpty();
        S.printStack();
        
        System.out.println("=================================================");
        
        S.push("E31201794", "Rahma", 82);
        S.push("E31201795", "Reva", 90);
        S.push("E31201796", "Rizky", 98);
        
        S.pop();
        S.pop();
        S.printStack();
        
        System.out.println("=================================================");
    }
}













