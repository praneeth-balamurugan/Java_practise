package dsa;

import java.util.*;  
public class hash
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
       /* Create a HashTable to store String values corresponding to integer keys */  
        Hashtable<Integer, String> hm = new Hashtable<>();  
        /* Input the values */  
        hm.put(3, "You are visiting");  
        hm.put(5, "Hello");  
        hm.put(9, "website");  
        hm.put(2, "Javatpoint");  
        /* Display the Hashtable */  
        System.out.println(hm);  
    }  
}  