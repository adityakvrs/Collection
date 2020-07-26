package com.epam.collections;
/**
 * To implement custom collection list
 * 
 *
 */
public class Main
{
    public static void main(String[] args) 
    {
        customList<Integer> list = new customList<Integer>();//Creates list with size default size 10;
      
        //Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);
        
         //List Size
        System.out.println(list.size());
    
        //Remove elements from list with given index
        list.remove(4);
        System.out.println(list);
         
        //Get element with index
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        //Index out of range Exception
        //System.out.println(list.get(10));
 
       
    }
}
