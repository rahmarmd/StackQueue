/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author HP
 */
public class CobaQueueStatis {
    public static void main(String[] args) {
        QUEUE Q = new QUEUE ();
        Q.createEmpty ();
        Q.printQueue ();
        
        System.out.println("=================================================");
        
        Q.add("E31201794", "Rahma", 82);
        Q.add("E31201795", "Omdi", 88);
        Q.add("E31201796", "Omriz", 92);
        
        Q.printQueue();
        System.out.println("=================================================");
        
        Q.del();
        Q.del();
        System.out.println("=================================================");
    }
}
