/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_12;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class search_elt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
        //1...SEARCHING ELEMENT IN INTEGER DATA TYPE
        
        //CREATING INTEGER ARRAY OF OBJECTS
        System.out.println("==========INTEGER==========");
        System.out.println("Enter the Integer array size:");
        int size=val.nextInt();
        Integer num[]=new Integer[size];
        System.out.println("Enter the Integer data to create Integer array:");
        for(int i=0;i<size;i++)
        {
            num[i]=val.nextInt();
        }
        
        //DISPLAYING ARRAY
        System.out.println("==========ARRAY==========");
        for(Integer i:num)
            System.out.println(i);
        
        //SEARCH ELEMENT
        System.out.println("Enter the data to be searched:");
        int elt1=val.nextInt();
        
        //TO CALL SEARCHING METHOD
        Search<Integer,Integer> s1=new Search<>();
        s1.search(num, elt1);
        
        //2...SEARCHING ELEMENT IN STRING DATA TYPE
        
        //CREATING STRING ARRAY OF OBJECTS  
        System.out.println("==========STRING==========");
        System.out.println("Enter the String array size:");
        size=val.nextInt();
        String str[]=new String[size];
        System.out.println("Enter the String data to create String array:");
        for(int i=0;i<size;i++)
        {
            str[i]=val.next().toLowerCase();
            
        }
        
        //DISPLAYING ARRAY
        System.out.println("==========ARRAY==========");
        for(String i:str)
        {
            System.out.println(i);
            
        }
            
        
        //SEARCH ELEMENT
        System.out.println("Enter the data to be searched:");
        String elt2=val.next().toLowerCase();
       
        
        //TO CALL SEARCHING METHOD
        Search<String,String> s2=new Search<>();
        s2.search(str, elt2);
        
        //2...SEARCHING ELEMENT IN CHARACTER DATA TYPE
        
        //CREATING CHARACTER ARRAY OF OBJECTS  
        System.out.println("==========CHARACTER==========");
        System.out.println("Enter the Character array size:");
        size=val.nextInt();
        Character chars[]=new Character[size];
        System.out.println("Enter the Character data to create Character array:");
        for(int i=0;i<size;i++)
        {
            chars[i]=val.next().toLowerCase().charAt(0);
            
        }
        
        //DISPLAYING ARRAY
        System.out.println("==========ARRAY==========");
        for(Character i:chars)
        {
            System.out.println(i);
        }
            
        
        //SEARCH ELEMENT
        System.out.println("Enter the data to be searched:");
        char elt3=val.next().toLowerCase().charAt(0);
                
        //TO CALL SEARCHING METHOD
        Search<Character,Character> s3=new Search<>();
        s3.search(chars, elt3);
        
        
        
    }
    
}

//generic class
class Search<T,S>
{
    T[] array;
    S value;
    boolean flag=false;
    
    //generic method for all data types
    public <T,S>void search(T[] array,S value)
    {
        for(T i:array)
        {
            if(value.equals(i))
            {
                flag=true;
                break;
            }
        }
        
        if(flag)
            System.out.println("Searched element '"+value+"' found  /*(@ _ @)*/");
        else
            System.out.println("Searched element not found  {=_=}");
    }
}