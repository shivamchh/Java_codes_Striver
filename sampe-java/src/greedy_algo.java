import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class greedy_algo {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j =0;

        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){

                i++;
            }
            j++;
        }
        return i;
    }

    public boolean lemonadeChange(int[] b) {

        int i = 0 ;
        int n = b.length;
        int c5=0;
        int c10=0;

        while( i<n ){

            if( b[i] == 5  )
            {
                c5++;
            }
            else if(  c5!=0 && b[i]== 10  )
            {
                c10++;
                c5--;
            }
            else if (  (  (c10!=0 && c5!=0) || (c5>2)  )   && b[i]==20 )
            {
                if(  c10!=0 && c5!=0 )
                {
                    c10--;
                    c5--;

                }
                else {
                    c5-=3;
                }
            }
            else { return false ;}
            i++;
        }
        return true;
    }




   static class Item{

        int value;
        int weight;

        Item( int  value , int weight ){
            this.weight = weight;
            this.value = value;
        }
    }

     static class ItemComparator implements Comparator<Item>{

        @Override
        public int compare( Item a , Item b){

            double r1 = (double) a.value / a.weight;
            double r2 = (double) b.value / b.weight;

            if (r1 > r2)
                return -1;
            else if (r1 < r2)
                return 1;
            else
                return 0;
        }
    }

    public static   double  Fractional_Knapsack(int[] val, int[] wt, long cap)
    {

        ArrayList<Item> items = new ArrayList<>();

        // Create Item objects
        for (int i = 0; i < val.length; i++) {
            items.add(new Item(val[i], wt[i]));
        }

        // Sort according to value/weight ratio
        Collections.sort(items, new ItemComparator());

        double totalValue = 0;

        int i =  0;
        int n = items.size();
        while ( i < n){

            Item item = items.get(i);
            if (  item.weight <= cap ){
             cap-=item.weight;
             totalValue+= item.weight;
            }
            else{

                totalValue +=((double) item.value / item.weight)*cap;
                break;
            }
                i++;
        }
return  totalValue;
        }



    public static boolean jump_game_1( int [] nums ){

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    static  class  job{

        int id;
        int deadline;
        int profit;

        job( int id , int deadline , int profit)
        {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static class jobComparator implements Comparator<job>{

        @Override
        public int compare(  job a  ,  job b){

           return  b.profit-a.profit;

        }
    }


    public   static  int[] JobScheduling(int[][] Jobs) {
     ArrayList <job> list = new ArrayList<>();

     for ( int i = 0 ; i < Jobs.length; i++)
     {
         list.add(new job(Jobs[i][1] , Jobs[i][2],Jobs[i][3]));
     }

     Collections.sort(list , new jobComparator());

     int max_deadline = 0;
for(  int i = 0 ; i<Jobs.length; i++){
    max_deadline =Math.max(Jobs[i][2] , max_deadline);
}
boolean slot[] = new boolean[max_deadline +1 ];

     int k = 0 ;
     int max_Sum = 0;
     int count =  0;
      while (k<list.size()){
          job current = list.get(k);
        if( JobScheduling_engine(slot , current.deadline)     ){

        }
        max_Sum+=current.profit;
        count++;
        k++;
      }
        return new int[]{count, max_Sum};
    }



    public static  boolean JobScheduling_engine( boolean [] slot  , int deadline)
    {
           for ( int  i = deadline; i>=0 ; i--){

               if (!slot[i]){
                   slot[i]=true;
                            return false;
               }
           }
                   return false;
    }

    public long solve(int[] bt) {

        Arrays.sort(bt);
        long sum = 0;
        long ans = 0;
        for (int i = 0; i < bt.length; i++) {
            ans += sum;
            sum += bt[i];
        }
        return ans / bt.length;
    }

    static class N_meetings{
        int start;
        int end ;


        public N_meetings(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static  class  N_meetings_Comparator implements Comparator<N_meetings>{

        @Override
        public  int compare( N_meetings a , N_meetings b){
            return a.end - b.end;
        }
    }




    public static int N_meetings(int[] start, int[] end ){

        ArrayList<N_meetings> list = new ArrayList<>();

        for ( int i = 0 ; i <start.length; i++){
            list.add( new N_meetings(start[i],end[i]));
        }

        Collections.sort(list , new N_meetings_Comparator());

        int count =0;
        int max_free_time = -1 ;

      ArrayList<Integer> store = new ArrayList<>();
                int i =0;

                while( i<list.size()){
                    N_meetings current = list.get(i);
                        if ( current.start> max_free_time){
                            count++;
                            store.add(list.get(i).end);
                            max_free_time= current.end;
                        }

                    i++;
                }
               return count;

    }


    static class eraseOverlapIntervals {
        int id ;
        int start;
        int end;

        public eraseOverlapIntervals(int id, int start, int end) {
            this.id = id;
            this.start = start;
            this.end = end;
        }
    }

    static  class eraseOverlapIntervals_comparator  implements Comparator< eraseOverlapIntervals > {

        @Override
        public int compare(eraseOverlapIntervals a, eraseOverlapIntervals b) {
            return a.end - b.end;
        }
    }

    public static int eraseOverlapIntervals( int[][] i){

        ArrayList <eraseOverlapIntervals> list = new ArrayList<>();

        for (int  j = 0 ; j<i.length ; j++){
            list.add(new eraseOverlapIntervals(j, i[j][0], i[j][1]));
        }

        Collections.sort(list , new eraseOverlapIntervals_comparator());

        int count = 0 ;
        int max = -1;
         int n = list.size();
         int k = 0 ;
         if( k <n ){
             eraseOverlapIntervals current = list.get(k);

             if (current.start>=max){

                 count++;
                 max=Math.max(max , Integer.MAX_VALUE);

             }


             k++;
         }
        return  n-count;

    }

    static  class  merge{
        int index;
        int start;
        int end;

        public merge(int index, int start, int end) {
            this.index = index;
            this.start = start;
            this.end = end;
        }

    }

    static class arr_comparator implements Comparator<merge> {

        @Override
        public int compare(merge a, merge b) {
            return a.start - b.start;
        }
    }

    public  static   int[][] merge(int[][] arr) {

        ArrayList<merge>list  = new ArrayList<>();

        for ( int i = 0 ; i <arr.length; i++){

            list.add( new merge( i ,arr[i][0] , arr[i][1] )  );

        }

        Collections.sort(list , new arr_comparator());
        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0 ;
        int n  = list.size();

        while (i<n) {

            merge current = list.get(i);
            int  start  = current.start;
            int  next = current.end;

            i++;

            while( i<n &&  list.get(i).start <=next){

            merge next_interval =  list.get(i);

                start = Math.min(start  , next_interval.start);
                next = Math.max ( next , next_interval.end );
                i++;

            }
            ans.add( new int []
                    {start , next } );
        }


        return ans.toArray( new int [ ans.size()][]);

    }

    public static int  Brute_platfrorm(int[] arrival, int[] departure)
    {
        int  count = 1;
        for (int i = 0; i < arrival.length; i ++){


            for( int j =  i ; j<departure.length ; j++){

                if ( arrival[i]<arrival[j]   && departure[i]>departure[j]
                ){
                    count ++;
                }

            }
        }

        return count;

    }

    static class optimal_findPlatform{
        int time ;
        char type ;

        public optimal_findPlatform(int time, char type) {
            this.time = time;
            this.type = type;
        }
    }

    static class optimal_findPlatform_Comparator implements Comparator< optimal_findPlatform>{

        @Override

        public int compare( optimal_findPlatform a , optimal_findPlatform b)
        {
            return a.time - b.time;
        }
    }



    public  int optimal_findPlatform( int [] arrival , int [] departure)
    {
        ArrayList<optimal_findPlatform> list = new ArrayList<>();
        for ( int i = 0 ; i <arrival.length ; i ++)
        {
            list.add(   new optimal_findPlatform(arrival[i] , 'A'));
            list.add( new optimal_findPlatform( departure[i] , 'D'));
        }

        Collections.sort(list , new optimal_findPlatform_Comparator() );

        int count = 0;
        int max = 0 ;
        for ( int i = 0 ; i <list.size(); i++){

            optimal_findPlatform current = list.get(i);
             char type =  current.type;
            if(  type == 'A'){
                count++;
            }else {count--;}


            max = Math.max(count , max);
        }
 return   max;
    }

    public boolean checkValidString(String s) {

        int n = s.length();
        int count = 0 ;
        int c2 = 0;
        int star = 0;

        for( int i  = 0 ; i < s.length() ; i ++){

            char ch = s.charAt(i);
            if(ch=='*'){
                star++;
            }
            else if( ch == '('){
                count++;
            }
            else{
                count-- ;
            }

        }


        if( star==0 && count < 0 )
        {
            return false ;
        }

        if( count == 0 ){
            return true ;
        }
        else if ( count > 0)
        {
            int plus = count-star;
            if(plus==0)
            {
                return true;
            }
        }
        else {
            int minus = count+star;
            if(minus == 0){
                return true;
            }
        }


        return false ;

    }






    public static void main(String[] args) {




    }


}
