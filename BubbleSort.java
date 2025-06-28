//import java.util.*;
class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] A = {14, 9, 15, 12, 6, 8, 13};
        System.out.println("Initial Array:");
        display(A);
        Bubble_Sort(A);
        System.out.println("Array in Ascending Order:");
        display(A);
    }
    public static void display(int[] A)
    {
        for(int i = 0 ; i < A.length ; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void Bubble_Sort(int[] A)
    {
        int didSwap = 0 ;
        for(int i = A.length - 1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j <= i-1 ; j++)
            {
                if(A[j] > A[j+1])
                {
                    //Swap(A, j, j+1);
                    int temp = A[j] ;
                    A[j] = A[j+1] ;
                    A[j+1] = temp ;  
                    didSwap = 1 ;
                }
            }
            if(didSwap == 0)
                break;
        }
    }
    public static void Swap(int[] A, int m, int n)
    {
        int temp = A[m] ;
        A[m] = A[n] ;
        A[n] = temp ;
    }
}