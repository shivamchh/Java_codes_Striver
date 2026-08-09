import java.awt.event.ItemEvent;
import java.util.*;

public class Arrays_hard {


    public void setZeroes(int[][] matrix) {

        for (  int i = 0 ; i < matrix.length; i++){

            for ( int    j = 0 ;  j <matrix[0].length; j++)
            {
                if (matrix[i][j]==0){

                    make_row(matrix , i );
                    make_col(matrix , j );

                }
            }
        }
    }


    public  static void make_row( int [] []  matrix  , int row ){

        for ( int j = 0 ; j <matrix.length ; j++ ){

            if (matrix[j][row]!=0){
                matrix[j][row] =-1;
            }
        }
    }

    public  static  void make_col( int [] []  matrix  , int row)
    {

        for (int i = 0  ; i <matrix[0].length ; i++)
        {
            if (matrix[i][row]!=0){
                matrix[i][row] = -1;
            }
        }
    }


    public void convertZeroes(int[][] matrix) {

        for (  int i = 0 ; i < matrix.length; i++){

            for ( int    j = 0 ;  j <matrix[0].length; j++)
            {
                if (matrix[i][j]==-1){
              matrix[i][j]=0;
                }
            }
        }
    }

    public void setZeroes_better(int[][] matrix) {
         int []  row = new int[matrix.length];
         int [] col = new  int[matrix[0].length];

         for ( int i = 0 ; i <matrix.length ; i++)
         {
             for ( int j = 0 ; j<matrix[0].length ; j++)
             {
                 if (matrix[i][j] ==0) {

                     row[i]=1;
                 col[j]=1;
             }
             }
         }

        for ( int i = 0 ; i <matrix.length ; i++)
        {
            for ( int j = 0 ; j<matrix[0].length ; j++)
            {
                if (row[i]==1 || col[j]==1) {
                    matrix[i][j]=0;
                }
            }
        }
    }

    public  static  void rotate_matrix_brute( int[][] matrix){


        int n = matrix[0].length;
        int [][] ans =new int[n][n];
        for ( int i = 0 ; i <matrix.length; i++)
        {
            for ( int j = 0 ; j<matrix[0].length; j++)
            {
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        for ( int i = 0 ; i <matrix.length; i++)
        {
            for ( int j = 0 ; j<matrix[0].length; j++)
            {
                matrix[i][j]=ans[i][j];
            }
        }
    }

public  static  void rotate_matrix_hard_better( int[][] matrix) {

        int n = matrix.length;

        for ( int i=0; i<matrix.length; i++)
        {
            for ( int j = 0 ; j<matrix[0].length; j++)
            {
                if(i<j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for ( int i = 0 ; i <matrix.length ; i++)
        {

            int left = 0 ;
            int right = matrix[0].length-1;
            while (left<right) {
                int temp = matrix[i][left];
               matrix[i][left]=matrix[i][right];
               matrix[i][right]=temp;

               left++;
               right++;

            }
        }
}

    public  static List<Integer> spiralOrder(int[][] m) {

        List<Integer> ans = new ArrayList<>();

        int left = 0;
        int top = 0;
        int bottom = m.length - 1;
        int right = m[0].length - 1;

        while( left<=right && top <= bottom){
            for( int i = left; i<=right; i++ )
            {
                ans.add(m[top][i]);
            }
            top++;


            for( int j = top ; j<= bottom ; j++){
                ans.add(m[j][right]);
            }
            right --;

            if(top<=bottom){

                for( int   k = right ; k >=left; k-- ){
                    ans.add(m[bottom][k]);

                }
                bottom--;
            }

            if(left <= right) {
                for( int l = bottom ; l>= top ; l--)
                {
                    ans.add(m[l][left]);
                }
                left++;
            }
        }
        return ans ;
    }

    public  static   int  pascal_find_number_at_any_place(int n , int r) {
      return engine_pascal_find_number_at_any_place(n-1 , r-1);
    }
    public  static int  engine_pascal_find_number_at_any_place(int n , int r) {
         int res = 1 ;
         for ( int i = 0; i<r; i++ )
         {
             res = res*(n-i);
             res = res/(i+1);
         }
return  res;
    }

public static  int printing_row_pascal( int n )
{
    int ans = 1;
    for ( int i = 1 ; i <n ; i++){
        ans = ans*(n-i);
        ans = ans /i;
        System.out.print( ans );
    }
    return  ans ;
}

    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> List = new ArrayList<>();
        for ( int  j = 1 ; j<numRows ; j++)
        {

     List<Integer> temp = genrate_row(j);    // imp***********
     List.add(temp);

        }
return List;
    }

    public  List<Integer> genrate_row( int numRows)
    {
        List<Integer> temp = new ArrayList<>();
        int ans =1 ;
        temp.add(ans);

        for ( int i =  1 ; i<= numRows ; i++) // i === columns
        {
            ans = ans*(numRows-i);
            ans = ans /i;

            temp.add(ans);
        }
return  temp;
    }


   public  List<Integer>  majority_elements_brute( int [] nums )
   {
List <Integer> List = new ArrayList<>();

       for ( int i = 0 ; i < nums.length ; i++)
       {
           int count = 0 ;
           for ( int j = 0 ; j<nums.length; j++)
           {

               if ( nums[i]==nums[j])
               {
                   count++;
               }
            }
           if (count>nums.length/3 && !java.util.List.of().contains(nums[i])){
               List.add(nums[i]);
           }
       }
    return  List;
   }

   public   List<Integer>  majority_elements_better( int [] nums )
   {

       List<Integer> List =  new ArrayList<>();
       HashMap <Integer , Integer> Hash = new HashMap<>();

       for ( int i = 0 ; i<nums.length; i++)
       {
           Hash.put(nums[i] , Hash.getOrDefault(nums[i],0)+1);
       }

       for (Map.Entry<Integer ,Integer> entry : Hash.entrySet())
       {

           if (entry.getValue() > nums.length/3)
           {
               List.add(entry.getKey());
           }

       }
       return List;
   }

public  List<Integer>  majority_elements_optimal( int [] nums )
{

    List<Integer> List = new ArrayList<>();
    int count1 = 0 ;
    int count2 = 0 ;
    int  cand1 = 0;
     int cand2=0;
    for ( int i = 0 ;  i<nums.length; i++)
    {

        if (count1 ==0 && nums[i]!=cand2 )
        {
            cand1 = nums[i];
            count1=1;
        }

      else  if (count2== 0  && nums[i]!=cand1)
        {
            cand2=nums[i];
            count2=1;
        }

   else  if ( nums[i]==cand1)
        {
            count1++;
        }

 else  if (nums[i]== cand2)
        {
            count2++;
        }
else {

    count2--;
    count1--;
        }

    }
    count2 = 0;
    count1 = 0 ;

    for ( int i = 0; i<nums.length; i++)
    {
        if (nums[i]==cand1) count1++;
        if ( nums[i]==cand2) count2++;
    }

    int min = (nums.length/3)+1;

    if (count1 >=min)
    {
        List.add(cand1);
    }
    if (count2>=min){
        List.add(cand2);
    }

    return List;
       }

    public List<List<Integer>> threeSum_brute(int[] nums) {
        int n = nums.length;

        Set<List<Integer>> Ans = new HashSet<>();

        for ( int i = 0 ; i <n; i++)
        {
            for (  int   j = i +1 ; j<n ; j++)
            {
                for ( int k = j+1 ; k<n ; k++)
                {
                    if ((nums[i]+nums[j]+nums[k])==0)
                    {
                        List<Integer> Temp = new ArrayList<>();
                     Temp.add(nums[i]);
                     Temp.add(nums[j]);
                     Temp.add(nums[k]);
                     Collections.sort(Temp);

                     Ans.add(Temp);
                    }


                }
            }
        }
return new ArrayList<>();

    }

    public List<List<Integer>> threeSum_better(int[] nums)
    {

        Set<List<Integer>> Ans = new HashSet<>();

        int n = nums.length;
        for ( int i = 0  ; i<n; i++ )
        {
            HashSet<Integer > Hash = new HashSet<>();
            for ( int  j = i+1 ;  j<n; j++)
            {
                int k = -(nums[i]+nums[j]);
            if (Hash.contains(k)){
List<Integer> temp = new ArrayList<>();
temp.add(nums[i]);
temp.add(nums[j]);
temp.add(k);
Collections.sort(temp);
Ans.add(temp);
            }
                Hash.add(nums[j]);

            }
        }
return new ArrayList<>(Ans);
    }



    public List<List<Integer>> threeSum_optimal(int[] nums)
    {
        List<List<Integer>> Ans = new ArrayList<>();

        for ( int i = 0 ; i <nums.length; i++ )
        {
            List<Integer> temp = new ArrayList<>();

            int j =i+1 ; int k = nums.length-1;
            while (j<k)
            {
             if ((nums[i]+nums[j]+nums[k])==0)
             {
              temp.add(i);
              temp.add(nums[j]);
              temp.add(nums[k]);
             }
   else if ((nums[i]+nums[j]+nums[k])<0)
   {
       j++;
   }
   else if ((nums[i]+nums[j]+nums[k])>0)
   {
       k--;
   }
Collections.sort(temp);

   while (j<k && nums[j]==nums[j-1])
   {
       j++;
   }
   while( j<k && nums[k]==nums[k+1])
   {
       k--;
   }


            }
        }
return Ans;
    }

    public List<List<Integer>> fourSum_better(int[] nums, int target) {

        Set<List<Integer>> Ans = new HashSet<>();

         int  n  = nums.length;
        for ( int i = 0 ; i <n; i++) {
            for (int j = i + 1; j < n; j++) {
                HashSet<Integer> Hash =  new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long l = (long)target-( (long)nums[i]+nums[j]+nums[k]);

                    if (l>=Integer.MIN_VALUE && l<= Integer.MAX_VALUE && Hash.contains((int)l))
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int)l);

                        Collections.sort(temp);
                        Ans.add(temp);
                    }
                     Hash.add(nums[k]);
                }
            }
        }
return new ArrayList<>(Ans);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {

                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }

                    } else if (sum < target) {

                        k++;

                    } else {

                        l--;
                    }
                }
            }
        }

        return ans;
    }

    public   static  int maxlen( int [] arr)
    {
        HashMap <Integer , Integer> Hash = new HashMap<>();
         int sum = 0 ;
         int max = 0 ;
        for ( int i = 0  ; i <arr.length; i++)
        {
            sum +=arr[i];

            if (sum==0){
                max = i+1;
            }
            if (!Hash.containsKey(sum))
            {
              int    length = i - Hash.get(sum);
               max = Math.max(max,length);
            }
            else {
            Hash.put(sum ,i );
        }

        }
return max;
    }


        public static void main(String[] args) {

//        System.out.println(pascal_find_number_at_any_place(4,3));
//        printing_row_pascal(6);

            int  [] arr = {1,0,-4,3,1,0};
            System.out.println(maxlen(arr));

    }
}
