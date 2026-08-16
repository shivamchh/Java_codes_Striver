public class implementaion_of_Stacks_striver {



//    static int max = 5;
//    static  int [] Stack = new int [max];
//    static int top = -1;
//
//    public  void Push( int value )
//    {
//
//     if ( top == max-1 )
//     {
//         System.out.println( " not possible ");
//     }
//     else {
//             top++;
//             Stack[top] = value;
//         System.out.println( value);
//     }
//    }
//
//
//    public  void top()
//    {
//
//        if ( top == 0 )
//        {
//            System.out.println( " not possible ");
//        }
//else {
//            for (int i = 0; i < Stack.length; i++) {
//                System.out.println(Stack[i]);
//            }
//        }
//    }
//
//    public  void pop()
//    {
//        if ( top == 0 )
//        {
//            System.out.println( " not possible ");
//        }
//        else
//        {
//            System.out.println(Stack[top]);
//            top--;
//        }
//
//
//    }

  //  ----------->   Queue using Arays


     static  int max = 5;
     static  int [] q = new int[max];
    static int  start = -1;
      static int end =  -1 ;
      static  int size = 0 ;

      public static  void  push_q( int  value )
      {
if ( size==max){
    System.out.println( " not ");
    return;
}
  if( size == 0  )
 {
     start = 0 ;
      end = 0 ;
 }
  else
  {
      end = (end+1)&q.length;
      q[end] = value;
      size++;
  }
      }

   public  static void pop()
   {
       if( size == 0){
           System.out.println("nothing");
           return;
       }
      if (size ==1){
          start = -1;
           end = -1;
           size --;
      }
else {
    size--;
        start = (start+1)%q.length;
        return;
      }
   }









    public static void main(String[] args) {





    }
}
