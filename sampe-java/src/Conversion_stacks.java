import java.io.StringReader;
import java.util.Set;
import java.util.Stack;



public class Conversion_stacks {


    public  static  String Infix_Postfix( String s ){
            String ans = "";
    Stack<Character> st=new Stack<>();
    int i = 0 ;
    while(i<s.length())
    {
      char ch = s.charAt(i);
      if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'  )
      {
          ans+=s.charAt(i);
      }
      else if( s.charAt(i)=='(' )
      {
          st.push(s.charAt(i));
      }

      else if (s.charAt(i)==')')
      {
          while ( !st.empty() && st.peek() != '(' )
          {
              ans+=st.pop();
          }

          if (!st.empty())
          {
              st.pop();
          }
      }

      else
      {

          while ( !st.empty() && st.peek()!='(' && priority(ch)<= priority(st.peek()) )
          {
              ans+=st.pop();
          }
          st.push(ch);
      }
  i++;
    }

    while (!st.empty()){
        ans+=st.pop();
    }

return ans ;
      }

public  static  int priority(  char ch  )
{

    if (ch=='^')
    {
return 3;
    }
     else if (ch=='/'   || ch =='*')
    {
        return 2;
    }
    else if (ch == '+' || ch== '-' )
    {
        return 1;
    }
    return 0;

}

public  static  String Infix_Prefix( String s)       // not completeed
{

    StringBuilder  rev  = new StringBuilder(s).reverse();


    for ( int   i = 0 ; i <s.length() ; i ++)
    {
        char ch = rev.charAt(i);
        if (ch=='(')
        {
          rev.setCharAt(i, ')');
        }
     else    if (ch == ')')
        {
            rev.setCharAt(i,'(');
        }
    }

   String temp =  Infix_Postfix(rev.toString());

    String Ans  = new StringBuilder(temp).reverse().toString();

    return Ans;

}

//     postfix to  infix
    public  static  String Postfix_Infix( String s )
    {
        int i  =  0 ;
        Stack<String> st = new Stack<>();

         String value ="";
        while (i<s.length())
        {

            char ch = s.charAt(i);
            if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'  )
            {
                st.push(String.valueOf(ch));

            }
            else  {
            String t1 = st.pop();


            String t2 = st.pop();

            value  = "(" + t2+s.charAt(i)+t1+")";
         st.push(value);

            }
            i++;
        }
return value;
    }
public  static  String Prefix_Inifix( String s ){

        int i = s.length()-1;
        Stack<String> sc =  new Stack<>();

        String Ans = "";

        while (i>=0)
        {
            char ch = s.charAt(i);
            if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'  )
            {
                sc.push(String.valueOf(ch));
            }

            else
            {

                String t1 = sc.pop();
                String t2 =sc.pop();

                Ans = "("+t1+s.charAt(i)+t2+")";
                sc.push(Ans);

            }
       i--;

        }

return sc.peek();

}

public  static  String Postfix_Prefix( String s ){

          int i = 0 ;
          Stack <String> st = new Stack<>();

          String Ans = "";
          while(i<s.length())
          {

              char ch = s.charAt(i);
              if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'  )
              {
                  st.push(String.valueOf(ch));
              }
              else
              {
                  String t1 = st.pop();
                  String t2 = st.pop();

                  String value = s.charAt(i)+t2+t1;
                  st.push(value);
              }
                 i++;

          }

return st.peek();
}


    public  static  String Prefix_Postfix( String s ){

        int i = s.length()-1;
        Stack<String> sc =  new Stack<>();

        String Ans = "";

        while (i>=0)
        {
            char ch = s.charAt(i);
            if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'  )
            {
                sc.push(String.valueOf(ch));
            }

            else
            {

                String t1 = sc.pop();
                String t2 =sc.pop();

                Ans = t1+t2+s.charAt(i);
                sc.push(Ans);

            }
            i--;

        }

        return sc.peek();

    }


    public static void main(String[] args) {

        System.out.println(Infix_Postfix("a+B(4+)"));

        System.out.println(Infix_Prefix("a+B(4+)"));

        System.out.println(Postfix_Infix("AB+C+"));
    }

}
