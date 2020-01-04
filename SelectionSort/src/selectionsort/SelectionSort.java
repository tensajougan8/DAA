/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;


/**
 *
 * @author Student
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int number ,i,j, index;
        int first = 0;
        int Sort[];
        
        System.out.println("Enter the number of elements you want to insert in the array");
        number = input.nextInt();
        Sort = new int[number];
        
        System.out.println("Enter the elements");
        for(i=0;i<number;i++)
        {
            Sort[i] = input.nextInt();
        }
        
        for(i=0;i<number-1;i++)
        {
//             int y = Math.min(number,Sort[i]);
            index = i;
            for(j=i+1;j<number;j++)
            {
               if(Sort[index] > Sort[j])
               {
                   index = j;
                   
               }
            }
            
            if(index != i)
            {
                int swap = Sort[index];
                Sort[index] = Sort[i];
                Sort[i] = swap;
            }
        }
        
        System.out.println("The sorted Array is");
        for(i=0;i<number;i++)
        {
            System.out.println(""+Sort[i]);
        }
    }
    
}
