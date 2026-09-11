public class class_Quesiton {

public  static  String  traverse( String s )
{

    int n = s.length();
    for ( int i = 0 ; i<n ; i++)
    {
        char ch = s.charAt(i);

    }

    String t = "shivam";
    String u = "  Sing h    ";


    System.out.println(t.concat(u));
    System.out.println(t.replace('i','d'));
    System.out.println(t.toLowerCase());
    System.out.println(u.trim());
    



    return t.substring(5,6);
}


    public static void main(String[] args) {


        System.out.println(traverse("abcd"));



    }


}
