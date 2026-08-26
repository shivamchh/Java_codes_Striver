import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;
import java.util.Stack;

public class implementaion_of_Stacks_striver {

    static class node {
        int data;
        node next;

        node(int data1, node next1) {
            data = data1;
            next = next1;
        }

        node(int data1) {
            data = data1;
            next = null;
        }
    }

    int value ;
    int min;

//    pair( int value , int min )
//    {
//        this.min = min;
//        this.value=value;
//    }

    // implementation of stacks using  linked lists

//    static node top = null;
//    static  int  size = 0 ;
//
//    public static  void push ( int value )
//    {
//        node newnode = new node(value);
//
//        newnode.next = top;
//        top = newnode;
//        size++;
//    }
//
//    public  static  void pop()
//    {
//        if ( top == null ){
//            System.out.println( " not gona hapeen");
//        }
//node temp = top;
//top = top.next;
//size--;
//    }
//


//         queue using ll

// static node start = null;
//    static  node end = null ;
//    static int size = 0 ;
//
//    public  static   void   push( int  value ){
//
//        node temp =  new node(value) ;
//
//        if (size == 0 )
//        {
//            start = end  = temp;
//        }
//
//        else {
//             end.next = temp ;
//            end = temp;
//        }
//        size++;
//    }
//
//    public static  void pop()
//    {
//        if (size == 0)
//        {
//            System.out.println("not");
//        }
//        if( size == 1)
//        {
//            start =null ;
//            end = null;
//        }
//        start = start.next;
//        size-=1;
//    }
//
//    public  static int   top(){
//        if (size == 0)
//        {
//            System.out.println("not");
//        }
//
//        return  start.data ;
//
//    }


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

//
//     static  int max = 5;
//     static  int [] q = new int[max];
//    static int  start = -1;
//      static int end =  -1 ;
//      static  int size = 0 ;
//
//      public static  void  push_q( int  value )
//      {
//if ( size==max){
//    System.out.println( " not ");
//    return;
//}
//  if( size == 0  )
// {
//     start = 0 ;
//      end = 0 ;
// }
//  else
//  {
//      end = (end+1)&q.length;
//      q[end] = value;
//      size++;
//  }
//      }
//
//   public  static void pop()
//   {
//       if( size == 0){
//           System.out.println("nothing");
//           return;
//       }
//      if (size ==1){
//          start = -1;
//           end = -1;
//           size --;
//      }
//else {
//    size--;
//        start = (start+1)%q.length;
//        return;
//      }
//   }


// STACKS  USING QUEUE

//   static   Queue<Integer> q = new LinkedList<>() ;
//
//
//    public  void push(int value){
//        int maxlen = q.size();
//      q.add(value);
//
//        for ( int i = 0 ; i<maxlen; i++)
//        {
//
//            q.add(q.remove());
//
//        }
//    }
//
//    public static  int pop(){
//
//
//        int maxlen = q.size();
//        if (q.isEmpty())
//        {
//            System.out.println("not");
//            return -1;
//        }
//
//
//     return   q.remove();
//
//
//    }
//
//
//public  int top()
//{
//    int maxlen = q.size();
//    if (q.isEmpty())
//    {
//        System.out.println("not");
//        return -1;
//    }
//    return q.peek();
//}


// Queue using Stacks

//   static Stack<Integer> s1 = new Stack<>();
//    static Stack<Integer> s2 = new Stack<>();
//
//    public  static  void push(int value)
//    {
//        int size1 =s1.size();
//        int size2= s2.size();
//
//       while(!s1.empty())
//       {
//           s2.push(s1.pop());
//       }
//
//s1.add(value);
//
//       while (!s2.isEmpty())
//       {
//           s1.add(s2.pop());
//       }
//    }
//
//    public static void pop()
//    {


//    }


    //   Valid parentheisis
    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {

                if (st.empty()) {
                    return false;
                }

                char top = st.peek();

                if ((top == '(' && c == ')') ||
                        (top == '{' && c == '}') ||
                        (top == '[' && c == ']')
                ) {
                    st.pop();
                } else {
                    return false;
                }


            }

            if (st.empty()) {
                return true;
            }
        }

        return false;

    }


    /// Write a Stack code  for Get min operation

//   static Stack<Integer> st = new Stack<>();
//    public static void push(int val) {
//
//
//        if (st.empty()) {
//            st.push(new pair(val, val));
//        } else {
//            int min = Math.min(val, st.peek().min);
//            st.push(new pair(val, min));
//
//        }
//    }
//
//    public  static void pop()
//    {
//        if (st.empty())
//        {
//            System.out.println("none");
//        }
//        else
//        {
//            st.pop();
//        }
//    }
//    public static  void peek()
//    {
//        st.peek();
//    }
//


    public static void main(String[] args) {





    }
}
