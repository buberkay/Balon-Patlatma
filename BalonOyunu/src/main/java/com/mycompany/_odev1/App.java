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
        System.out.println("Hoş geldiniz. Toplam balon sayısını giriniz.");
        Scanner scanner = new Scanner(System.in);  
        int n=scanner.nextInt();
        
        for(int i=1; i<=n; i++)
        {
         Node newNode = new Node(i);
          if (head == null) 
            {
                head = newNode;
                tail = newNode;
            } 
          else 
            {
                tail.next = newNode;
                tail = newNode;
            }
        }
        tail.next = head;
        System.out.println("Örüntüde kullanılacak sayıyı giriniz");
        int m=scanner.nextInt();
        
        balonPozisyonBul(n, m);
        System.out.println("Kalan balonun pozisyonu: " + head.sira);

    }
}
