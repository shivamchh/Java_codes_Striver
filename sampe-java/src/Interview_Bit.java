import org.w3c.dom.css.CSSUnknownRule;

import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Array;
import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview_Bit {



    // minimum Bit flips to convert Numbers

    public  static  int Check_bit( int start , int goal   ){

        int ans = start^ goal;
        int count = 0;
        while( ans != 0)
        {
            ans = ans & (ans -1 );
            count++;
        }
return  count;

    }

    // power set using Bit operation

    public  static  List<List<Integer>> Power_set( int [] nums )
    {

        int n = nums.length;
        int subset = 1<<n;
        List <List<Integer>> Ans = new ArrayList<>();

        for ( int i = 0 ; i < subset; i++)
        {
            List<Integer> List = new ArrayList<>();
            for (int j = 0 ; j<n; j++)

            {

                if ((i & (1<<j))!=0){
                    List.add(nums[j]);
                }
            }
            Ans.add(List);
        }
return Ans;
    }

    public  static int single_number_1(  int [] nums ){

        int ans = 0 ;
        for ( int i = 0 ; i<nums.length; i ++)
        {
             ans ^= nums[i];
        }
        return ans;}


public  static  void xor_til_n( int n )
{
    int ans = 0 ;
    if (n%4==1)  ans = 1;
    else if (n%4==2) ans = n+1;
     else if( n % 4 ==3 ) ans =0;
            else  ans =n;
}

//public  static  int for_range ( int  l  ,int r)
//{
//
//    return xor_til_n(r) ^ xor_til_n(l - 1);
//
//}

    public  static  int  brute_single_number_iii( int [] arr  )   // tc = n * 32
    {

 int n = arr.length;
 int ans =0;
        for ( int bitwise = 0 ;  bitwise <= 31 ; bitwise ++ )
        {
            int count = 0 ;
            for ( int i = 0; i < n ; i++)
            {

                // now checing for count
                if ( (arr[i] & (1<<bitwise))!=0){
                    count ++;
                }

            }  // where
            if ( (count % 3) ==1)
            {
                // set 1
                ans = ans|1<<bitwise;
            }

        }
return  ans ;

    }

    public static  int better_single_number_iii( int [] arr  )    // tc = n log n + n /3
    {
int n = arr.length;;
        for ( int i = 0 ; i<arr.length-3; i+=3)
        {
            Arrays.sort(arr);

     if (arr[i]!=arr[i+1])
     {
       return arr[i];
     }
        }
        return  arr[n-1];
    }


    public  static   int  optimal_single_number_iii( int [] arr  )   // tc 0 n   /////// again     z
    {
int ones = 0;
int twos = 0;
for ( int i =0 ; i< arr.length; i++){
    ones = (ones^arr[i])&(~twos);
    twos = (twos^arr[i])&( ~ ones);
}
return  ones;
    }


    public static void main(String[] args) {

int [] nums = {1,2,3};
        System.out.println(Power_set(nums));


    }

}
