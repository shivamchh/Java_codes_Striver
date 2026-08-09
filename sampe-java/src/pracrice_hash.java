import java.util.*;

public class pracrice_hash {


    public static int[] two_Sum( int [] arr , int target)
    {

        HashMap <Integer , Integer> hashMap = new HashMap<>();

        for ( int i = 0 ; i<arr.length; i++)
        {
            int value = arr[i];
            int  hash =  target - arr[i];


            if (hashMap.containsKey(hash))
            {
                return  new  int[] {hashMap.get(hash),i};
            }
            hashMap.put(arr[i],i);
        }
     return    new int[]{-1,-1};
    }
    public  static  ArrayList<Integer> removeDuplicates(int[] nums) {

        HashSet<Integer> Hash = new HashSet<>();
        ArrayList <Integer> ans = new ArrayList<>();
        for ( int i = 0 ; i<nums.length ; i++)
        {

            if (!Hash.contains(nums[i]))
            {
                ans.add(nums[i]);
            }
            Hash.add(nums[i]);

        }

return  ans;
    }
    public  static  int max_frequency( int [] nums)
    {

        HashMap< Integer , Integer> hash = new HashMap<>();

        for ( int i = 0 ; i <nums.length ; i++)
        {
            hash.put(nums[i] , hash.getOrDefault(nums[i],0)+1);
        }
int key = 0 ;
        int value = 0 ;
        for (Map.Entry<Integer , Integer>entry:hash.entrySet())
        {
            if (entry.getValue()>value)
            {
                key=entry.getKey();
                        value = entry.getValue();
            }
        }
return key;
    }


    public  static  int indexx_subarry( int [] nums , int target)
    {
        HashMap<Integer , Integer> Hash = new HashMap<>();
        int sum = 0;
        int max =0;
        for ( int i = 0 ; i < nums.length; i++){
            sum += nums[i];

          if ( Hash.containsKey(sum-target))
          {
               int prev = i-Hash.get(sum-target);
               max = Math.max(prev, max);
          }
          Hash.put(sum ,i);
        }

        return max;
    }

    public  static  int count_subarray( int [] nums , int k)
    {
        HashMap<Integer , Integer> Hash = new HashMap<>();
        Hash.put(0,1);
        int sum = 0;
        int count =0;
        for ( int i = 0 ; i < nums.length; i++){
            sum += nums[i];

            if ( Hash.containsKey(sum-k))
            {
               count+=Hash.get(sum-k);
            }
            Hash.put(sum,Hash.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public  static  boolean contains_duplicae_ii( int [] nums , int k)
    {

        HashMap<Integer , Integer> Hash = new HashMap<>();

        for ( int i = 0 ; i < nums.length; i++) {

            int  here = nums[i];
if (Hash.containsKey(here))
{
    int prev =  i - Hash.get(here);
    if (prev<=k){
       return true;
    }
}
Hash.put(nums[i],i);
        }
        return false;
    }
    public  static int Longest_Consecutive_Sequence(int [] nums  ){
        HashSet<Integer> Hash = new HashSet<>();
        int count = 0 ;
        int  max = 0 ;
        for ( int i =0 ; i< nums.length; i++) {
            Hash.add(nums[i]);
        }
        for (int j =0 ; j< nums.length; j++){
            int x = nums[j];
            if (!Hash.contains(x-1)){
                 count =1 ;
                while (Hash.contains((x+1))){
                    count++;
                    x++;
                }
                max = Math.max(count , max);
              }
            }
return max;
    }

    public static void main(String[] args) {



    }

}
