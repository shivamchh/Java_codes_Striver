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

    public static void main(String[] args) {





    }
}
