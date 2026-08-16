public class BS_on_answers {

//        TC ---->   log(N)

//    public static int sqrt_bs( int n)
//    {
//
//
//        int low = 0 ; int high = n;
//
//        while (low<=high)
//        {
//            int mid = (low + high) /2;
//
//              if (mid*mid==n)
//              {
//                  return mid;
//              }
//              else if( mid * mid > n){
//                  high = mid -1;
//              }
//              else{
//                  low = mid +1;
//              }
//
//        }
//
//
//
//   return  high;
//
//    }



//
//    public  static double    multiply( double number, int n ){
//
//        double ans = 1.0;
//        for (  int i = 0 ; i< n ; i++ ) {
//            ans = ans * number;
//        }
//return  ans ;
//    }
//
//
//    public  static   void   sqrt_n_times_bs (int n , int m )
//    {
//
//        double low = 0 ;
//        double high = m;
//        double eps = 1e-6;
//
//        while ((high - low) > eps)
//        {
//
//            double mid = (low + high) / 2 ;
//
//            if (multiply(mid , n)<m )
//            {
//                low = mid;
//            }
//            else {
//                high = mid;
//            }
//
//        }
//        System.out.println(low + " " + high);
//
//    }


    // koooko    eating banana

//    public static int calculate( int [] nums , int hours)
//    {
//
//        int ans = 1;
//
//        for ( int i = 0 ; i<nums.length; i++)
//        {
//
//            hours += Math.ceil((double) nums[i]/hours);
//
//        }
//return hours;
//
//    }
//
//
//    public  static  int Brute_main_funcn_koko_eating_banana(  int [] nums,int target)
//    {
//        int max =Integer.MIN_VALUE;
//
//        for ( int i = 0; i<nums.length; i++)
//        {
//            if (nums[i]>max)
//            {
//                max = nums[i];
//            }
//        }
//
//        for ( int j = 1; j<=max; j++)
//        {
//
//             int function_hr = calculate(nums,j);
//
//
//if (function_hr<=target)
//{
//    return function_hr;
//}
//
//        }
//return  -1;
//    }

// optimal using binanry search

    public static int opitaml_koko( int n ,int [] arr)
    {








        return - 1;
    }




    //     to find the minimum days  to make a M bonquewtes
    // TC =    (max - min)(O(N))

    // brute

//public static  boolean engine_m_boquetes( int [] arr , int day, int m , int k )
//{
//    int n = arr.length;
//    int count = 0 ;
//    int boquetes = 0 ;
//for ( int i = 0 ; i <n ; i ++)
//{
//    if (arr[i]<=day)
//    {
//        count ++;
//    }
//    else
//    {
//boquetes += count/k;
//count=0;
//    }
//}
//
//boquetes +=  count / k;
//if (boquetes >=m)
//{
//    return  true;
//}
//return  false;
//}
//


//public static  int main_funcn_boquetes( int [] arr  , int m , int k )
//{
//    int n = arr.length;
//    if (m*k>n)
//    {
//        return -1;
//    }
//    int mini = Integer.MAX_VALUE;
//    int maxi = Integer.MIN_VALUE;
//
//    for (int i = 0; i < n; i++) {
//
//        mini = Math.min(mini, arr[i]);
//        maxi = Math.max(maxi, arr[i]);
//    }
//
//
//    for ( int i =mini; i<= maxi; i++ ) {
//
//
//        if (engine_m_boquetes(arr, i, m, k)==true){
//            return i;
//        }
//
//    }
//
//return -1;
//}


    // optimal     TC --->   [log(max-min) (O(n))]

//    public  static int optimal_minimum_days_to_make_a_M_bonquewtes( int [] bloomday , int m , int k )
//    {
//        int n = bloomday.length;
//        int low = Integer.MAX_VALUE;
//    int high = Integer.MIN_VALUE;
//
//    for (int i = 0; i < n; i++) {
//
//        low = Math.min(low, bloomday[i]);
//        high = Math.max(high, bloomday[i]);
//    }
//    int ans = -1;
//    while (low<=high)
//    {
//        int mid = (low+ high)/2;
//
//        if (engine_optimal_minimum_days_to_make_a_M_bonquewtes(bloomday,mid,m,k)==true)
//        {
//            ans = mid ;
//            high = mid-1;
//        }
//        else {
//            low =  mid +1;
//        }
//
//
//    }
//     return ans;
//    }
//
//    public static boolean engine_optimal_minimum_days_to_make_a_M_bonquewtes( int [] bloomday, int days , int m, int k )
//    {
//
//        int n = bloomday.length;
//        int count = 0 ;
//        int boquetes = 0 ;
//        for ( int i = 0 ; i <n ; i ++)
//        {
//            if (bloomday[i]<=days)
//            {
//                count ++;
//            }
//            else
//            {
//                boquetes += count/k;
//                count=0;
//            }
//        }
//
//        boquetes +=  count / k;
//        if (boquetes >=m)
//        {
//            return  true;
//        }
//        return  false;
//
//
//    }

    //  SMALLEST DIVISOR GIVEN IN THRESHOULD
    //   TC = O(n)(max-min)

//    public static  int brute_divisor_min_threshould( int [] arr , int thres)
//    {
//        int n = arr.length;
//        int high = Integer.MIN_VALUE;
//        for ( int i = 0; i <n; i++) {
//            high = Math.max(high, arr[i]);
//        }
//        for ( int i = 1 ; i <= high; i ++)
//        {
//        if (engine_divisor_min_threshould(arr, i , thres )==true)
//        {
//            return  i;
//        }
//        }
//
//return  -1;
//    }

//    public static boolean engine_divisor_min_threshould( int [] arr , int divisor , int threshould)
//    {
//
//        int sum = 0 ;
//        for ( int i = 0; i<=arr.length-1; i++)
//        {
//
//            sum += Math.ceil((double) arr[i]/divisor);
//
//        }
//        if (sum<=threshould){
//            return true;
//        }
//        return   false;
//
//    }
//
//               //   tc = o(n) * log(max)
//    public  static int optimal_divisor_min_threshould( int [] arr , int thres)
//    {
//        int ans = 0;
//
//int n = arr.length;
//        int low = 1;
//    int high = Integer.MIN_VALUE;
//
//    for (int i = 0; i < n; i++) {
//
//
//        high = Math.max(high, arr[i]);
//    }
//
//
//    while (low<=high)
//    {
//        int mid = (low + high) /2;
//        if (engine_divisor_min_threshould(arr,mid,thres)==true)
//        {
//            high = mid - 1;
//            ans = mid;
//        }
//        else {
//            low = mid +1;
//        }
//
//    }
//        return ans;
//    }


//                   Capicity to ship packages within D days

//    public static int brute_Capicity_to_ship_packages_within_D_days( int [] weigth , int days  )
//    {
//
//        int  n = weigth.length;
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//        for ( int i = 0 ; i < n ; i++)
//        {
//            max=Math.max(max,weigth[i]);
//            sum+=weigth[i];
//        }
//
//        for ( int i = max; i<= sum; i++)
//        {
//
//            int max_capicity= engine_Capicity_to_ship_packages_within_D_days(weigth,i) ;
//
//            if (max_capicity<=days)
//            {
//                return i;
//            }
//
//        }
//
//        return -1;
//
//    }

//    public  static  int engine_Capicity_to_ship_packages_within_D_days(int [] arr , int capicity )
//    {
//
//        int n = arr.length;
//        int days = 1;
//        int load = 0 ;
//
//         for ( int i = 0 ; i <n; i++)
//         {
//             if ((arr[i]+load)>capicity)
//             {
//                 days++;
//                 load=arr[i];
//             }
//             else {
//                 load+=arr[i];
//             }
//         }
//        return  days;
//    }
//
//
//    public static int optimal_Capicity_to_ship_packages_within_D_days( int [] weigth , int days  )
//    {
//        int n = weigth.length;
//        int low = Integer.MIN_VALUE;
//        int sum = 0;
//
//        for ( int i = 0 ; i <n ; i++) {
//            low = Math.max(weigth[i], low);
//            sum += weigth[i];
//
//
//        }
//            while (low<=sum){
//
//                int mid = (low + sum) /2;
//
//                int engine_days = engine_Capicity_to_ship_packages_within_D_days(weigth,mid);
//
//                if (engine_days<=days)
//                {
//                    sum = mid - 1;
//                }
//                else {
//                    low = mid +1 ;
//                }
//        }
//        return  low;
//    }


    //      K th missing  positive number
    ///   Brute


//    public static  void brute_K_th_missing_positive_number( int [] nums ,  int k)
//    {
//
//        for (  int i= 0 ; i < nums.length; i++)
//        {
//            if (nums[i]<=k)
//            {
//                k++;
//            }else{
//                break;
//            }
//        }
//    }


//                 public static int optmial_K_th_missing_positive_number( int [] nums , int target ){
//
//                     int n = nums.length;
//                     int low  = 0 ;
//                     int high = n-1;
//
//                     while (low<= high )
//                     {
//                         int mid = (low + high) /2;
//                         int missing = nums[mid]-(mid+1);
//                       if (missing<target)
//                       {
//                           low = mid+1;
//                       }
//                       else {
//                           high =  mid -1;
//                       }
//                     }
//
//                            return  target + high + 1;
//                 }



    //    TC  =O(N)*(max - min)

//                 public static int  brute_Aggressive_cows( int [] slots , int cow_targted)
//                 {
//                       int ans = -1;
//                     int n = slots.length;
//                     int low = 1;
//                     int high = slots[n-1];
//
//                     for ( int max_gap= low ; max_gap<=high; max_gap++){
//
//                         if (tested_days_Aggressive_cows(slots , max_gap , cow_targted)==true)
//                         {
//                             ans =  max_gap;
//                         }
//
//
//                     }
//
//return ans;
//
//                 }
//
//                 public static boolean  tested_days_Aggressive_cows( int [] slots , int max_gap , int cow_targted)
//                 {
//                      int n = slots.length;
//                     int tested_cow = 1 ; int last_one = slots[0];
//
//                     for ( int i  = 1 ; i <n ; i ++)
//                     {
//
//                         if ((slots[i]-last_one)>=max_gap)
//                         {
//                             tested_cow++;
//                             last_one=slots[i];
//                         }
//
//
//                     }
//                     if (tested_cow>=cow_targted)
//                     {
//                         return true;
//                     }
//
//                      return false;
//                 }
//
//
//    public static int  optimal_Aggressive_cows( int [] slots , int cow_targted)
//    {
// int n = slots.length;
// int low = 1;
//  int high = slots[n-1]-slots[0];
//  int ans = -1;
//
//  while (low<= high ){
//
//      int mid  = (low + high) /2 ;
//
//      if ( tested_days_Aggressive_cows(slots , mid , cow_targted)==true)
//      {
//          ans = mid ;
//          low = mid +1;
//
//      }
//      else {
//
//          high = mid -1;
//      }
//
//
//  }
//
//
//return  ans;
//    }

    //      tc = log n * n

    public static int optimal_allocate_books (int [] pages , int student)
    {

        int n = pages .length;
        int low = pages[0];
        int  sum = 0 ;
        int ans = -1;
        for ( int i = 0; i<n ; i ++) {
            sum += pages[i];
        }
        int high = sum;

        while ( low<= high)
        {
            int mid = (low + high) /2;

            if(allocated_Strudent(pages,mid,student)==true){
                ans =  mid  ;
                high = mid -1;
            }
            else {
                low = mid +1;
            }

        }


        return ans ;
    }

    public static  boolean allocated_Strudent( int [] arr , int tested_allocated_pages , int student_target )
    {
        int alocated_student =1 ;
        int allocated_page = 0;


        for ( int i = 0 ; i<=arr.length-1; i++) {

            if (allocated_page + arr[i]>tested_allocated_pages)
            {
                alocated_student++;
                allocated_page = arr[i];
            }
            else
            {
                allocated_page+=arr[i];
            }

        }

        return    alocated_student <= student_target;

    }



    public static void main(String[] args) {

        //      System.out.println(sqrt_bs(7));


        //   sqrt_n_times_bs(4, 81);

        //  int [] arr= {7,7,7,7,13,11,12,7};
//        System.out.println(main_funcn_boquetes(arr,2,3));

        //      System.out.println(optimal_minimum_days_to_make_a_M_bonquewtes(arr,2,3));

        int[] nums = {1, 2, 5, 9};

        int threshold = 6;

        //      System.out.println(brute_divisor_min_threshould(nums,threshold));
        //      System.out.println(optimal_divisor_min_threshould(nums , threshold));
        int[] weight = {1,2,3,4,5,6,7,8,9,10};

        int days = 5;

        //     int ans =
        //    brute_Capicity_to_ship_packages_within_D_days(weight, days);
        //    System.out.println(optimal_Capicity_to_ship_packages_within_D_days(weight, days));
        //    System.out.println(ans);

//        int [] arr = {2,3,4,7,11};
//        System.out.println(optmial_K_th_missing_positive_number(arr,5));

//         int arr[] = {0,3,4,7,9,10};
//        System.out.println(brute_Aggressive_cows(arr,4));

//        System.out.println(optimal_Aggressive_cows(arr,4));

        int arr[] = {  12,34,67,90};
        System.out.println(optimal_allocate_books(arr,2));



    }
}
