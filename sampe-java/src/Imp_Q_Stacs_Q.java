import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Imp_Q_Stacs_Q {

    public  static  int[] Next_greater_element(int [] arr){

        int i = arr.length-1;
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[arr.length];
        Stack<Integer> Ans = new Stack<>();

        if (i==arr.length-1)
        {
         Ans.push(arr[i]);
        }
        while (i>=1)
        {
            while ( !st.empty() && st.peek()<=arr[i] )
            {
                st.pop();

            }

            if (st.empty())
            {
                Ans.push(-1);
            }
            else
            {
                Ans.push(st.peek());
            }

            st.push(arr[i]) ;
            i--;
        }
        for ( int j = 0   ; j<ans.length; j++)
        {
            arr[j]=st.pop();
        }


            return ans;
     }


     public static int [] NGE_ii( int [] arr)
     {
         Stack<Integer> st = new Stack<>();
         int [] ans = new int[arr.length];

         int n = arr.length;
         for (  int i =2*(n-1) ;  i >= 0; i++)
         {
             int current =i%n;

         while( !st.empty() && st.peek()<=arr[current]  ){
               st.pop();
         }
         if (i<n) {
             if (!st.empty() ) {
                 ans[i]=st.peek();
             } else {
                ans[i]=-1;
             }
         }
         st.push(current);
         }


return ans;
     }

     public  static int [] nxt_smaller_ele( int [] arr)
     {
         int [] ans = new int[arr.length];
         Stack<Integer> st = new Stack<>();

          int i = arr.length-1 ;
          while( i >= 0)
          {
              while( !st.empty() &&  st.peek()>=arr[i] )
              {
                  st.pop();
              }
                  if (st.empty())
                  {
                      ans[i]=-1;

                  }
                  else
                  {
                     ans[i]=  st.peek();
                  }
                  st.push(arr[i]);
                i--;
          }
         return ans;

     }


     public static int []  previous_smaller_ele( int [] arr)
     {
         Stack<Integer> st = new Stack<>();
         int [] Ans = new  int[arr.length];
         int i =0;
         while(i<arr.length )
         {


            while (!st.empty() && st.peek() >= arr[i])
            {
                st.pop();

            }

                if (!st.empty()  )
                {
                Ans[i]=-1;
                }else
                {
                  Ans[i]=  st.peek();
                }

                st.push(arr[i]);
                        i++;
         }
         return  Ans ;
     }




    public static int traping_rainwater(int[] arr) {

        int total = 0;

        int[] sufix = sufix(arr);
        int[] prefix = prefix(arr);

        for (int i = 0; i < arr.length; i++) {

            total += Math.min(prefix[i], sufix[i]) - arr[i];
        }

        return total;
    }

public  static int []  prefix(  int [] arr)
{
    int [] prefix  = new int[arr.length];
    prefix[0] =arr[0];
     for ( int j  = 0 ; j< arr.length; j++)
    {

         prefix[j]= Math.max(prefix[j],arr[j+1]);
    }

    return  arr;
}


public  static  int [] sufix ( int [] arr)
{
  int [] sufix =  new int[arr.length];
  sufix[arr.length-1]=arr[arr.length-1];

    for (int k = arr.length; k>=0 ; k--)
    {
        sufix[k] = Math.max(sufix[k+1], arr[k]);
    }

   return arr;
}

public  static  int optimal_rainwater(int [] arr) {
    int lmax = 0;
    int rmax = 0;
    int water = 0;
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        if (arr[left] <= arr[right]) {

            if ( lmax >= arr[left]) {
                water += lmax - arr[left];
            }
            else {
                lmax = arr[left];

            }
            left++;
        }
        else
        {

            if (rmax>arr[right])
            {
                water+=rmax-arr[right];
            }
            else {

                rmax=arr[right];


            }
            right--;
        }
    }
    return water;
}


 public static  int subarray_min_sum( int [] arr)
 {

   int n = arr.length;
 int sum = 0;
   for ( int i = 0 ; i <n; i++)
   {
   int min = arr[i];
       for (  int  j = i; j<n; j++)
       {
           min = Math.min(min , arr[j]);
           sum = sum + min;
       }
   }
return sum;

 }


    public String removeKdigits(String num, int k)
    {
        Stack <Character> st = new Stack<>();
        int n = num.length();
        if (k==n)
        {
            return "0";
        }
        for (   int i = 0 ; i < n ; i++)
        {
            char  ch = num.charAt(i);

            while( !st.empty() && k>0  && st.peek() > ch )
            {
                st.pop();
            }

            st.push(ch);
        }

        while (k>0 && !st.empty())
        {
            st.pop();
            k--;
        }

        StringBuilder Ans = new StringBuilder();
             int i = 0 ;
        while ( !st.empty()   )
        {
            
        }


return  Ans.substring(i);
    }

    public static  int brute_largets_rectangle ( int [] nums )
    {

        int[] previous = previous_smaller_index(nums);
        int[] next = nxt_smaller_index(nums);
     int max  =  0;
     for ( int i = 0 ; i<nums.length ; i++)
     {


         max = Math.max(max ,  nums[i]) * (next[i]-previous[i]-1);
     }
     return max;
    }


    public  static int [] nxt_smaller_index( int [] arr)
    {
        int [] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        int i = arr.length-1 ;
        while( i >= 0)
        {
            while( !st.empty() &&  arr[st.peek()]>=arr[i] )
            {
                st.pop();
            }
            if (st.empty())
            {
                ans[i]=-1;

            }
            else
            {
                ans[i]=  st.peek();
            }
            st.push(i);
            i--;
        }
        return ans;

    }



    public static int []  previous_smaller_index( int [] arr)
    {
        Stack<Integer> st = new Stack<>();
        int [] Ans = new  int[arr.length];
        int i =0;
        while(i<arr.length )
        {


            while (!st.empty() && arr[st.peek()] >= arr[i])
            {
                st.pop();

            }

            if (!st.empty()  )
            {
                Ans[i]=-1;
            }else
            {
                Ans[i]=  st.peek();
            }

            st.push(i);
            i++;
        }
        return  Ans ;
        
    }




     public static void main(String[] args) {



    }
}
