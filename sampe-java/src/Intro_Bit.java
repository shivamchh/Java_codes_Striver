public class Intro_Bit {


    // conversion of decimal to bianry

    public  static void D_B( int n )
    {
        String s = "";
        while (n>0)
        {
            if(n%2==1){
                s+='1';
            }
            else
            {
                s+='0';
            }
            n=n/2;

        }
        String ans = new StringBuilder(s).reverse().toString();
        System.out.println(ans);
    }


     // for  binary to deciaml

    public  static  int B_D(  String s ){

        int pow = 0 ;
        int ans = 0 ;
        for ( int i = s.length()-1; i>= 0; i--)
        {
            int digit = s.charAt(i)-'0';

            ans = ans + (digit*(int)Math.pow(2,pow));
            pow++;
        }
return ans ;
    }

    // swap  number

    public static void swaping( int a , int  b)
    {
        a=a^b;
        b=a^b;         // b = (a^b)^b      .. a = a^b
        a=a^b;         //  a= (a^b)^a      .. b =a

        System.out.println(a);
        System.out.println(b);
    }

    public  static boolean check_number_At_places(int n , int i)   // tc = o(1)
    {
        if (( 1 & n>>i)!=0)
        {
            return true;
        }
        return false;
    }

    public  static int set_number_At_places(int n , int i)   // tc = o(1)
    {

         return n | (n<<i) ;

    }
    public  static int clear_number_At_places(int n , int i)   // tc = o(1)
    {

        return n & ~(1<<i) ;

    }

    public  static int toggle( int n  , int i )
    {

        return n ^ n << i ;

    }

// removing the last set bit
    public  static   int  remove_l_set_bit( int n )
    {
        return  n & (n-1) ;
    }

    // check  if the number id power of 2
     public   static boolean  power_of_2( int n)
     {

         if (n<= 0 ){
             return false;
         }
if ((n &(n-1))==0){
    return true;
}
return false;
     }

     // count 1 brute
     public  static int Brute_count_num( int n )
     {
         int count = 0 ;
         while( n > 1){

             if ((n & 1)==1){
                 count = n & 1;
             }
             n=n<<1;

         }
         if (n==1){
             count =1;
         }
         return count;
     }

     // count optimal

    public  static int optimal_count_num( int n ){

        int  count = 0 ;
        while (n!=0){
             n =  n &( n-1 );
             count++;
        }
        return  count;
    }




    public static void main(String[] args) {


D_B(13);
String s = "1101";
        System.out.println(B_D(s));

      swaping(2,3);

        System.out.println(check_number_At_places(13,1));
    }



}
