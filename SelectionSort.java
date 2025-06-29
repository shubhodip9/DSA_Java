public class SelectionSort 
{
    public static void main(String[] args)
    {
        int[] A = {5,3,1,4,29,20,0,98,75};
        System.out.println("Initial Array:");
        display(A);
        System.out.println("Array after Selection Sort:");
        Selection_Sort(A);
        display(A);
        
    }
    public static void Selection_Sort(int[] A)
    {
        for(int i = 0 ; i < A.length-1 ; i++)
        {
            int min_index = i;
            for(int j = i+1 ; j < A.length ; j++)
            {
                if(A[j] < A[min_index])
                    min_index = j;
            }
            Swap(A, i, min_index);
        }
    }
    public static void Swap(int[] A, int m, int n)
    {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
    public static void display(int[] A)
    {
        for(int i = 0 ; i < A.length ; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}  
