public class InsertionSort 
{ 
    public static void main(String[] args)
    {
        int[] A = {5,3,1,4,29,75,0,98,20};
        System.out.println("Initial Array:");
        display(A);
        System.out.println("Array after Insertion Sort:");
        Insertion_Sort(A);
        display(A);
        
    }
    public static void Insertion_Sort(int[] A)
    {
        for(int i = 0 ; i < A.length ; i++)
        {
            int j = i ;
            while(j > 0 && A[j] < A[j-1])
            {
                Swap(A, j, j-1);
                j--;
            }
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
