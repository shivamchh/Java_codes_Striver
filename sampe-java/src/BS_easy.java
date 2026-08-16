import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

public class BS_easy {


//     public  static  int  search_x_simple(  int [] arr ,int tagret, int n ){
//         n = arr.length;
//         int low= 0 ;
//         int high  = n-1 ;
//
//         while (low<=high) {
//             int  mid= ( low + high)/2;
//if (arr[mid] == tagret) {
//                 return mid;
//             } else if (tagret>arr[mid]) {
//    low=mid+1;
//}
//else{
//    high=mid-1;
//}
//         }
//         return -1;
//     }


    //public  static  int search_x_recursive( int low ,int high ,int n , int target, int [] arr)
    //{
//           if ( low>high){
//               return -1 ;
//           }
//
//            int mid = (low + high )/2;
//
//           if (arr[mid]==target){
//               return  mid  ;
//           }
//           else  if( target > arr[ mid]){
//               return  search_x_recursive(mid+1,high,arr.length,target,arr);
//           }
//           else{
//               return search_x_recursive(low,mid-1, arr.length, target,arr);
//           }
//
//    }



//    public  static int  lower_bound_simple( int [] arr , int target){
    ////            TC   LOG N
//        int n = arr.length;
//        int low = 0 ;
//         int high = n-1;
//          int  ans =  n;
//
//         while ( low < high){
//
//             int mid = (low + high)/2;
//
//             if (arr[mid]>=target) {
//                 ans = mid;
//                 high = mid -1;
//             }
//             else{
//                 low = mid+1 ;
//             }
//         }
//         return  ans ;
//    }


// this code is also for inseet bs -   3 problem  only add = in low<=high in while looop
// public  static  int upper_bound_simple( int [] arr , int target){
//
//        int n = arr.length;
//        int low = 0 ;
//         int high = n-1;
//          int  ans =  n;
//
//         while ( low < high){
//
//             int mid = (low + high)/2;
//
//             if (arr[mid]>target) {
//                 ans = mid;
//                 high = mid -1;
//             }
//             else{
//                 low = mid+1 ;
//             }
//         }
//     return ans ;
// }

//  floor and ceil

//public static  int  floor( int target , int [] arr){
//            int n = arr.length;
//        int low = 0 ;
//         int high = n-1;
//          int  ans =  n;
//
//         while ( low <= high){
//
//             int mid = (low + high)/2;
//
//             if (arr[mid]<=target) {
//                 ans = mid;
//                 low = mid+1 ;
//             }
//             else{
//                 high = mid -1;
//             }
//         }
//     return ans ;
// }
//
// public static int ceil( int  target , int [] arr)
// {
//
//
//             int n = arr.length;
//        int low = 0 ;
//         int high = n-1;
//          int  ans =  n;
//
//         while ( low <= high){
//
//             int mid = (low + high)/2;
//
//             if (arr[mid]>=target) {
//                 ans = mid;
//                 high = mid -1;
//             }
//             else{
//                 low = mid+1 ;
//             }
//         }
//     return ans ;
// }

//            LOWER  AND UPPER BOUND


//
//public static  int  lower_bound( int target , int [] arr){
//      int  n = arr.length;
//        int low = 0 ;
//         int high = n-1;
//          int  ans =  n;
//
//         while ( low <= high){
//
//             int mid = (low + high)/2;
//
//             if (arr[mid]>=target) {
//                 ans = mid;
//                 high = mid-1 ;
//             }
//             else{
//                 low = mid +1;
//             }
//         }
//     return ans ;
// }
//
//
// public static int upper_bound( int  target , int [] arr)
// {
//     int n = arr.length;
//        int low = 0 ;
//         int high = n-1;
//          int  ans =  n;
//
//         while ( low <= high){
//
//             int mid = (low + high)/2;
//
//             if (arr[mid]>target) {
//                 ans = mid;
//                 high = mid -1;
//             }
//             else{
//                 low = mid+1 ;
//             }
//         }
//     return ans ;
// }

// public static int[] first_last( int target , int [] arr)
// {
//
//int lb = lower_bound(target,arr);
//int ub = upper_bound(target,arr);
//if (  lb ==arr.length|| arr[lb]!=target){
//    return  new int[]{-1,-1};
//}
//     System.out.println(ub-lb);
//return  new int[]{lb,ub-1};
//
// }


    //   find elemnet in rotated sorted part 1   tc = log n , sc  = 1

//public  static int rotated_sorted_1(int []  nums  , int target)
//{
//    int n = nums.length;
//    int low = 0 ;
//     int high = n-1;
//
//
//  while (low <=high) {
//      int mid = (low + high) / 2;
//      if (nums[mid] == target) {
//          return mid;
//      }
//
//      if (nums[low] <= nums[mid]) {
//          if (nums[low] <= target && target < nums[mid]) {
//
//              high = mid - 1;
//          } else {
//              low = mid + 1;
//          }
//      }
//
//       else{
//              if (target > nums[mid] && target <= nums[high]) {
//
//                  low = mid + 1;
//              } else {
//                  high = mid - 1;
//              }
//      }
//
//  }
//  return -1;
//}


//           for rotated sorted  part 2   checking it present or  not

//public  static  boolean rotated_sorted_2( int [] nums , int target)
//{
//
//
//    int n = nums.length;
//    int low = 0 ;
//    int high = n-1;
//
//    while (low<= high)
//    {
//
//        int mid = (low + high) /2;
//
//        if(nums[mid]==target)
//        {
//            return true ;
//        }
//
//        if (nums[low]==nums[mid]&& nums[mid]==nums[high])
//        {
//            low++;
//            high--;
//            continue;
//        }
//
//        if (nums[low]<=nums[mid])
//        {
//            if (nums[low]<=target&& target<nums[mid])
//            {
//                high=mid-1;
//            }
//            else {
//                low=mid+1;
//            }
//        }
//        else
//        {
//            if (nums[mid]<target&& target<=nums[high])
//            {
//                low=mid+1;
//            }
//            else
//            {
//                high=mid-1;
//            }
//        }
//    }
//
//    return false ;
//
//}
    //           FIND MINIMUM IN ROTATED SORTED ARRAYS

//       public  static  int  min_rotaed_sorted( int []  nums)
//       {
//
//           int n = nums.length;
//           int low = 0 ;
//           int high = n-1;
//           int ans = Integer.MAX_VALUE;
//
//
//           while (low<=high)
//           {
//                int mid = (low + high) /2;
//               if (nums[low]<=nums[mid])
//               {
//                   ans = Math.min(ans,nums[low]);
//                   low=mid+1;
//               }
//               else
//               {
//                   high=mid-1;
//                   ans = Math.min(ans, nums[low]);
//               }
//           }
//           return ans ;
//       }

    //    INDEX  OF   MINIMUM IN ROTATED SORTED ARRAYS


//       public  static  int  INDEX_min_rotaed_sorted( int []  nums)
//       {
//
//           int n = nums.length;
//           int low = 0 ;
//           int high = n-1;
//           int ans = Integer.MAX_VALUE;
//           int index = -1;
//
//           while (low<=high)
//           {
//                int mid = (low + high) /2;
//               if (nums[low]<=nums[mid])
//               {
//                   if(nums[low]<ans)
//                   {
//                       index=low;
//                       ans = nums[ low];
//                   }
//                   low=mid+1;
//               }
//               else
//               {
//                   high=mid-1;
//                   if(nums[mid]<ans)
//                   {
//                       index=mid;
//                       ans = nums[mid];
//                   }
//               }
//           }
//           return index ;
//       }

    //      FIND SINGLE ELEMENT IN SORTED ARRAYS  ---->   TC = o{N}

//               public static int brute_single_element( int [] arr)
//               {
//                    int n = arr.length;
//                    for ( int i = 0 ; i<n ; i++) {
//
//                        if (i==0)
//                        {
//                            if (arr[i] != arr[i+1])
//                            {
//                                return arr[i];
//                            }
//                        }
//                        else if(i==n)
//                        {
//                            if (arr[i]!=arr[i+1])
//                            {
//                                return  arr[i];
//                            }
//                        }
//                        else {
//                            if (arr[i-1]!=arr[i]&&arr[i]!=arr[i+1])
//                            {
//                                return  arr[i];
//                            }
//                        }
//                    }
//return  -1;
//               }

    //   TC  = o(log N)    sc = 0(1)
// public  static  int ooptimal_single_element( int [] nums )
// {
//
//     int n = nums.length;
//     if (n==1)
//     {
//         return nums[0];
//     }
//
//     if (nums[0]!=nums[1])
//     {
//         return  nums[0];
//     }
//
//     if (nums[n-1]!=nums[n-2])
//     {
//         return nums[n-1];
//     }
//     int low = 1;
//     int high = n-2;
//     while ( low<=high)
//     {
//         int mid = (low + high) / 2;
//
//         if (nums[mid]!=nums[mid+1]&& nums[mid]!=nums[mid-1])
//         {
//             return nums[mid];
//         }
//
//         if (nums[mid]%2==1&& nums[mid]==nums[mid-1]|| nums[mid]%2==0 && nums[mid]==nums[mid+1])
//         {
//             low = mid +1;
//         }
//         else {
//             high = mid-1;
//         }
//     }
//return  -1;
// }

    //    PEAK ELEMENTS     /// tc = o(N)       // WRONG
// public  static  int  brute_peak_elements(int [] nums)
// {
//        int n = nums.length;
//     for ( int i= 0; i<=n-1; i++ )
//     {
//         if (i==0 || nums[i]>nums[i-1]  &&   i==n-1 || nums[i]>nums[i+1])
//         {
//             return i;
//         }
//     }
//return  -1;
// }

    //  optimal for the single peak
//public  static int optimal_peak_single( int [] nums)
//{
//    int n = nums.length;
//
//    if (nums[0]>nums[1])
//    {
//        return 0;
//    }
//
//    if (nums[n-1]>nums[n-2])
//    {
//        return n-1;
//    }
//
//    int low = 1 ;
//     int high = n-2;
//    while (low<=high){
//        int mid = (low+ high) /2;
//        if (nums[mid]>nums[mid-1]&& nums[mid]>nums[mid+1])
//        {
//            return mid ;
//        }
//
//        else  if (nums[mid]>nums[mid-1])
//        {
//            low =  mid +1;
//        }
//        else if (nums[mid]<nums[mid-1]){
//            high = mid-1;
//        }
//    }
//    return  -1;
//}



//public static  int optimal_multple_peak( int [] nums){
//    int n= nums.length;
//
//    if(n==1)
//    {
//        return 0;
//    }
//    if( nums[0]>nums[1])
//    {
//        return 0;
//    }
//    if(  nums[n-1]>nums[n-2])
//    {
//        return n-1;
//    }
//
//    int low =1;
//    int high=n-2;
//    while(low<=high )
//    {
//
//        int mid = (low + high) /2;
//
//        if( nums[mid]>nums[mid-1]&& nums[mid]>nums[mid+1])
//        {
//            return mid ;
//        }
//
//        else if ( nums [mid]>nums[mid-1])
//        {
//            low = mid +1;
//        }
//        else
//        {
//            high = mid -1;
//        }
//
//
//    }
//
//    return -1;
//}

    public static void main(String[] args) {

//int [] arr = {3,4,6,7,9,12,16,17};

//        System.out.println(search_x_simple(arr,6,arr.length));

        //  System.out.println(search_x_recursive(0,arr.length-1,arr.length,16,arr));
//          int [] arr = {1,2,3,3,5,8,8,10,10,11};
//        System.out.println(lower_bound_simple(arr,1));


//         int [] arr = {10,20,30,40,50};
//        System.out.println(floor(25,arr));
//        System.out.println(ceil(35,arr));


//
//  int  [] arr = {2,4,6,8,8,11,13};
//     int   target = 8;
//int [] ans = first_last(target,arr);
//        System.out.println("First Occurrence: " + ans[0]);
//        System.out.println("Last Occurrence: " + ans[1]);
//

//        int [] arr = {4,5,6,7,0,1,2};
//        System.out.println(  rotated_sorted_1(arr,0));


//        int [] nums = {3,1,2,3,3,3,3};
//        System.out.println(rotated_sorted_2(nums,3));

//        int [] nums = {4,5,6,7,0,1,2};
//        System.out.println(INDEX_min_rotaed_sorted(nums));

//        int [] arr={1,1,2,2,3,3,4,5,5,6,6};
//        System.out.println(ooptimal_single_element(arr));

//int [] arr = {1,2,3,4,5,6,7,8,5,1};
//        System.out.println(optimal_peak_single(arr));



    }

}
