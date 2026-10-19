import java.util.HashMap;
import java.util.HashSet;

public class Sliding_window_two_pntrs {

    public static int  constant_sum( int [] nums , int k )
    {

        int sum = 0 ;
        int  l = 0 ;
         int r = k-1;
         int max = 0 ;

       for ( int i =  l ; i<=r ; i ++)
       {
           sum += nums[i];

       }
           while(r<nums.length-1)
           {
               sum-=nums[l];

            l++;
            r++;
            sum+=nums[r];
            max = Math.max(max , sum);

           }

return  max;
    }

//    public static int brute_max_subaaray_sum_less_than_k( int [] arr , int k)
//    {
//     // for ( int i =  0;){}
//
//
//
//    }

    public static int better_max_subaaray_sum_less_than_k( int [] arr , int k) {

        int l = 0;
        int r = 0;
        int sum = 0 ;
        int maxlen  = 0 ;

        while( r < arr.length-1){

         sum+=arr[r];

         while (sum>k)
         {
             sum-=arr[l];
             l++;
         }
         if (sum<k)
         {
             sum+=arr[r];
             maxlen = Math.max(maxlen, r-l+1);
             r++;

         }



        }

return maxlen;
    }

    class Solution {
        public int maxScore(int[] arr, int k) {

            int i = 0 ;
            int n =arr.length;
            int j = n-1 ;
            int target = 0 ;
            int sum = 0 ;
            int max = Integer.MIN_VALUE;
            while(  target < k){
                sum+=arr[i];
                max = Math.max(sum , max  );
                target ++;
                i++;
            }

            return engine( arr , k  , sum  , target , i , n ,  max ) ;
        }


        public int engine(int[] arr, int k , int  sum , int target , int i  , int n , int max  )
        {
            int j = arr.length-1;
            while( i>=0 && j>=n-k)
            {
                i--;
                sum-=arr[i];

                sum+=arr[j];

                j--;
                max = Math.max(sum , max );
            }
            return max ;
        }
    }

    public static  int  brute_fruits_into_basket( int [] nums){

        int l = 0 ;
        int r = 0;
        int n=nums.length;
        int max = 0;

        int  sum=0;

        for (int i =0; i<n; i++){
            HashSet<Integer> map = new HashSet<>();
            for (int j = i ; j<n;  j ++)
            {
                map.add(nums[j]);

                if (map.size()<=2){
                    sum+=nums[j];
                    max = Math.max(max , r-l+1);
                }
                else break;

            }
        }
        return max;
    }

//    public static  int optimal_fruits_into_basket( int [] arr ){
//
//
//
//
//    }


    public static void main(String[] args) {





    }
}
