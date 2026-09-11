import javax.naming.BinaryRefAddr;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Implementation_problem_n_stacks {

     public  static  int [] brute_sliding_window( int []  nums , int k)
     {
         int [] arr = new int[nums.length-k+1];
         int max = Integer.MIN_VALUE;

         for ( int i= 0 ; i<nums.length-k; i++)
         {
             for ( int j =i ; j<k+i; j++)
             {

          max = Math.max(max , nums[j]);
          arr[i]=max;
             }
         }
return arr;
     }

     public  static  int[] optimal_sliding_window( int []  nums , int k){

         Deque<Integer> dq = new ArrayDeque<>();
         int[] ans = new int[nums.length - k + 1];

         for ( int  i= 0 ; i <nums.length ; i++)
         {

             if(!dq.isEmpty() && dq.peekFirst()<=i-k )
             {
                 dq.removeFirst();
             }

              while( !dq.isEmpty()  &&  nums[dq.peekLast()]<=nums[i]){

                  dq.removeLast();
              }

              dq.addLast(i);


              if ( i>=k-1)
              {
                  ans[i-k+1]=nums[dq.peekFirst()];
              }

         }
return ans;
     }

//     public static int brute_stock_span( int [] nums)
//     {
//
//         int count =1;
//
//         for ( int  i = 0 ; i <nums .length ; i ++)
//         {
//
//             for ( int j = 0 ;  j<nums.length; j++ ){
//                 if (nums[i])
//
//             }
//
//
//
//
//         }
//     }

    class pair{

         int  value ;
         int span;

         pair( int value , int pair )
         {
             this.value = value;
             this.span= span;
         }
    }


    public  static int[]  Optimal_stock_Span( int [] nums)
    {

        Stack<pair> st = new Stack<>();
        int [] ans = new  int[nums.length];

        int [] pge = previous_gretear_elment(nums);


        for ( int i = 0 ; i<nums.length ; i++)
        {
            ans[i]= i=pge[i];
        }

       return ans;
    }

    public  static int [] previous_gretear_elment( int [] arr ){

            int i = 0;
            Stack<Integer> st = new Stack<>();
            int [] ans = new int[arr.length];



            while (i<arr.length)
            {
                while ( !st.empty() && arr[st.peek()]<=arr[i] )
                {
                    st.pop();

                }

                if (st.empty())
                {
                    ans[i] =  -1;
                }
                else
                {
                   ans[i]= st.peek();
                }

                st.push(i) ;
                i++;
            }


            return ans;
        }







    public static void main(String[] args) {




    }

}
