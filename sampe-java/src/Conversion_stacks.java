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


    public static void main(String[] args) {

    }

}
