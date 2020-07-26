package com.epam.collections;
import java.util.Arrays;
/**
 * To implement custom collection list
 * 
 *
 */
 
class customList<T> 
{
    //Size of list
    private int size = 0;
     
    //Default size of list is 10
    private static final int DEFAULT_SIZE = 10;
     
    //This array will store all elements added to list
    private Object elements[];
 
    //Default constructor
    public customList() {
        elements = new Object[DEFAULT_SIZE];
    }
   
    
 
    //Add method
    public void add(T e) {
        if (size == elements.length) {
            increseCapacity();
        }
        elements[size++] = e;
    }
     
    //Get method
    public T get(int i) {
        if (i >=size||i<0) {
            throw new IndexOutOfBoundsException("Index "+i);
        }
        return (T) elements[i];
    }
     
    //Remove method
    public T remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index"+i);
        }
        Object item = elements[i];
        int remainingelements = elements.length - (i+1) ;
        System.arraycopy( elements, i + 1, elements, i, remainingelements) ;
        size--;
        return (T) item;
    }
     
    //Get Size of list
    public int size() {
        return size;
    }
     
    
    //increse capacity of list
    private void increseCapacity() {
        int new_size = elements.length * 2;
        elements = Arrays.copyOf(elements, new_size);
    }
    
    //Print list in format [1,2,3..]
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i=0;i<size;i++) {
             sb.append(elements[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }

    
}
