/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_12;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class generic_methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner val=new Scanner(System.in);
        
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
       
        //GENERIC METHODS CALLING
        prop_1<Integer> obj1=new prop_1<>();
        System.out.println("\n>>>>>>>>>COUNTING NO. OF ODD INTEGERS>>>>>>>>>");
        obj1.count_of_odd_int(num);
        
        prop_2_3<Integer> obj2=new prop_2_3<>();
        System.out.println("\n>>>>>>>>>INTERCHANGING ELEMENTS IN 2 DIFFERENT POSITIONS>>>>>>>>>");
        System.out.println("Enter the two positions whose elements are to be interchanged:");
        int m=val.nextInt();
        int n=val.nextInt();
        obj2.swap(num, m, n);
        
        System.out.println("\n>>>>>>>>>FINDING MAXIMAL ELEMENT>>>>>>>>>");
        System.out.println("Enter the Start and End index for the range in which Maximal element is to be found:");
        m=val.nextInt();
        n=val.nextInt();
        obj2.maximal(num, m, n);
        
        //CREATING STRING ARRAY OF OBJECTS  
        System.out.println("\n-*-*-*-*-*-*-*--*-*-*-*-*-*-*--*-*-*-*-*-*-*--*-*-*-*-*-*-*-\n==========STRING==========");
        System.out.println("Enter the String array size:");
        size=val.nextInt();
        String str[]=new String[size];
        System.out.println("Enter the String data to create String array:");
        for(int i=0;i<size;i++)
        {
            str[i]=val.next();
            
        }
        
        //GENERIC METHODS CALLING
        prop_2_3<String> obj3=new prop_2_3<>();
        System.out.println("\n>>>>>>>>>INTERCHANGING ELEMENTS IN 2 DIFFERENT POSITIONS>>>>>>>>>");
        System.out.println("Enter the two positions whose elements are to be interchanged:");
        m=val.nextInt();
        n=val.nextInt();
        obj3.swap(str, m, n);
        
        System.out.println("\n>>>>>>>>>FINDING MAXIMAL ELEMENT>>>>>>>>>");
        System.out.println("Enter the Start and End index for the range in which Maximal element is to be found:");
        m=val.nextInt();
        n=val.nextInt();
        obj3.maximal(str, m, n);
        
        //CREATING CHARACTER ARRAY OF OBJECTS  
        System.out.println("\n-*-*-*-*-*-*-*--*-*-*-*-*-*-*--*-*-*-*-*-*-*--*-*-*-*-*-*-*-\n==========CHARACTER==========");
        System.out.println("Enter the Character array size:");
        size=val.nextInt();
        Character chars[]=new Character[size];
        System.out.println("Enter the Character data to create Character array:");
        for(int i=0;i<size;i++)
        {
            chars[i]=val.next().charAt(0);
            
        }
        
        //GENERIC METHODS CALLING
        prop_2_3<Character> obj4=new prop_2_3<>();
        System.out.println("\n>>>>>>>>>INTERCHANGING ELEMENTS IN 2 DIFFERENT POSITIONS>>>>>>>>>");
        System.out.println("Enter the two positions whose elements are to be interchanged:");
        m=val.nextInt();
        n=val.nextInt();
        obj4.swap(chars, m, n);
        
        System.out.println("\n>>>>>>>>>FINDING MAXIMAL ELEMENT>>>>>>>>>");
        System.out.println("Enter the Start and End index for the range in which Maximal element is to be found:");
        m=val.nextInt();
        n=val.nextInt();
        obj4.maximal(chars, m, n);
        
    }
    
}

//BOUNDED CLASS TO FIND COUNT OF ODD INTEGERS 
class prop_1<I extends Number>
{
    int count=0;
     
    //GENERIC METHOD TO FIND COUNT OF ODD INTEGERS
    public <I extends Number> void count_of_odd_int(I[] numarr)
    {
       for(I i:numarr)
       {
           if(i.intValue()%2 != 0)
               count++;
       }
       System.out.println("Count of Odd Integers= "+count);
    }
}

//GENERIC CLASS
class  prop_2_3<V> 
{
    //GENERIC METHOD TO INTERCHANGING ELEMENTS IN 2 DIFFERENT POSITIONS
    public <V> void swap(V[] array,int index_1,int index_2)
    {
        System.out.println("Interchanging elements in Position '"+index_1+"' & Position '"+index_2+"' ........\nProcessing --------(=_=)-------");
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                if(index_1==i && index_2==j)
                {
                   V temp=array[index_1];
                   array[index_1]=array[index_2];
                   array[index_2]=temp;
                   break;   
                }
            }
        }
        
        System.out.println("\nInterchanged!!!  (^_^) ........\n=====INTERCHANGED ARRAY=====");
        for (V ele: array) {
            System.out.println(ele);
        }
        
    }
    
    //GENERIC METHOD TO FINDING MAXIMAL ELEMENT
    public <V extends Comparable> void maximal(V[] array,int begin,int end)
    {
        System.out.println("Finding Maximal element in the range ["+begin+","+end+"] ........\nProcessing --------(=_=)-------");
        
        V max=array[begin];
        System.out.println("Elements in the range ["+begin+","+end+"]:");
        for(int i=begin;i<end;i++)
        {
            System.out.println(array[i]);
            if(array[i].compareTo(max) > 0)
                max=array[i];
        }
        System.out.println("Found Maximal element!!  *($_$)*\nMaximal element is: "+max);
    }
}