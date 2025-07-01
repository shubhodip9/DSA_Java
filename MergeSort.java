import java.util.ArrayList;
public class MergeSort 
{ 
    public static void main(String[] args) 
    {
        
        int[] A = {6,5,8,9,7,20,13,-2,0};
        System.out.println("Initial Array");
        display(A);
        System.out.println("Sorted Array");
        int low = 0 , high = A.length - 1 ; 
        mergeRecursion(A,low,high);
        display(A);
    }
    public static void mergeRecursion(int[] A, int low, int high)
    {
        if(low >= high)
            return;
            
        int mid = (low + high) / 2 ;
        mergeRecursion(A , low , mid) ;
        mergeRecursion(A , mid+1 , high) ;
        
        mergeSort(A, low, mid, high) ;
    }
    public static void mergeSort(int[] A, int low, int mid, int high)
    {
        int left = low ;
        int right = mid + 1 ;
        ArrayList<Integer> temp = new ArrayList<>(); 
        
        while(left <= mid && right <= high)
        {
            if(A[left] <= A[right])
            {
                temp.add(A[left]);
                left++;
            }
            else
            {
                temp.add(A[right]);
                right++;
            }
        }
        while(left <= mid)
        {
            temp.add(A[left]);
            left++;
        }
        while(right <= high)
        {
            temp.add(A[right]);
            right++;
        }
        
        for(int i = 0 ; i < temp.size() ; i++)
        {
            A[low + i] = temp.get(i);
        }
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
