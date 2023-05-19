/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._odev1;

/**
 *
 * @author 90553
 */
import java.util.Scanner;

public class App {
    
     public static class Node 
    {
        int sira;
        Node next;   
        
        public Node (int sira)
        {
            this.sira = sira;
            this.next = null;
        }
    }
    private static Node head;
    private static Node tail;
    
    public static void balonPozisyonBul(int n, int m)
    {
     while (head != head.next) 
       {
        for (int i = 1; i < m - 1; i++) {
            head = head.next;
        }
        n--;
        System.out.println(head.next.sira + ". balon patladı. " + n + " adet balon kaldı.");
        head.next = head.next.next;
       }
    }



    public static void main(String[] args) {

    }
}
