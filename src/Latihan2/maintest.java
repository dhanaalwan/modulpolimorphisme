/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author Dna
 */
public class maintest {
    public static void main(String[]args){
        Line line1 = new Line(1.0,2.0,1.0,2.0);
        Line line2 = new Line(2.0,3.0,2.0,3.0);
        
        boolean b1 = line1.isGreater(line1, line2);
        System.out.println("line1 is greater than line2:"+b1);
        boolean b2 = line1.isEqual(line1, line2);
        System.out.println("line1 is equal with line2:"+b2);
        
        Relation line3 = new Line(1.0,5.0,1.0,5.0);
        boolean b3 = line3.isEqual(line1, line3);
        System.out.println("line1 is equal with line3:"+b3);
        
        System.out.println("Length of liner is "+line1.getLength());
        System.out.println("Length of liner is "+line2.getLength());
    }
    
}
