
import java.util.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;

public class medium_probelm_ll {

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

    // ARRAY TO LINKED LIST
    private static node convertArr2_ll(int[] arr) {

        node head = new node(arr[0]);

        node mover = head;

        for (int i = 1; i < arr.length; i++) {

            node temp = new node(arr[i]);

            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // PRINT LL
    public static void printll(node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    // FIND MIDDLE
//    public static node brute_middle_ll(node head) {
//
//        node temp = head;
//        int count = 0;
//
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//
//        int mid_node = count / 2 + 1;
//
//        temp = head;
//
//        while (temp != null) {
//
//            mid_node--;
//
//            if (mid_node == 0)
//                break;
//
//            temp = temp.next;
//        }
//
//        return temp;
//    }

//    public  static  node  optimal_find_mid( node head )
//    {
//
//        node temp = head;
//        node slow = head;
//        node fast = head;
//
//        while( fast != null && fast.next != null)
//        {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return  slow;
//    }



    public  static node iterative_reverse_ll(node head )
    {
        node temp = head;
        node prev  = null;

        while (temp!=null)
        {
            node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public static  node recursive_revrse_ll(  node head )
    {

        if (head == null || head.next==null)
        {
            return head;
        }

        node newhead = recursive_revrse_ll(head.next);
        node front = head.next;
        front.next=head;
        head.next=null;

        return newhead;
    }

    public static  boolean brute_detect_loop( node head )
    {

        node temp = head;
        HashMap<node , Integer> nodeMap = new HashMap<>();

        while (temp!=null)
        {

            if (nodeMap.containsKey(temp))
            {
                return  true;
            }

            nodeMap.put(temp ,1);
            temp = temp.next;

        }
        return  false;
    }

    public  static  boolean optimal_detetct_loop( node head)
    //  using turtle and raabbit method
    //   because  fast and slow always overlapp if it is loop
    //    can use fromats to run

    {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast)
            {
                return  true;
            }

        }
        return false;

    }

    public  static node brute_find_start_ll( node head)
    {

        node temp = head;
        HashMap<node , Integer> nodemap= new HashMap<>();

        while (temp!=null)
        {


            if (nodemap.containsKey(temp))
            {
                return temp;
            }

            nodemap.put(temp,1);
            temp = temp.next;


        }

        return  temp;
    }

    public  static node optimal_find_start_ll( node head)
    {
        node slow = head;
        node fast = head;

        while( fast!= null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
            {
                slow = head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;

                }
                return slow;
            }
        }
        return null;
    }

    public static  int brute_find_length_ll( node head )
    {

        HashMap <node , Integer > mpp = new HashMap<>();

        node temp = head;
        int  timer  =0 ;

        while( temp != null)
        {
            if (  mpp.containsKey(temp))
            {
                int value = mpp.get(temp);
                return timer - value;
            }
            mpp.put(temp , timer);
            timer ++;
            temp = temp.next;


        }
        return  0;

    }

    public static  int  optimal_find_length_ll( node head)
    {
        node fast = head;
        node slow = head ;

        while( fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if (fast==slow)
            {

                int count = 1 ;
                fast = fast.next;

                while (fast!=slow){

                    fast = fast.next;
                    count ++;

                }
                return count;
            }
        }

        return 0;
    }

    public  static boolean brute_check_palindrome( node head)
    {

        Stack<Integer> st = new Stack<>();

        node temp = head;

        while( temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }

        temp = head;
        while (temp!=null)
        {
            if (temp.data!=st.pop())
            {
                return false;
            }
            temp =temp.next;
        }
        return true;
    }


//    public static boolean optimal_check_palindrome( node head )    //    wrong
//    {
//
//        if (head == null || head.next == null)
//        {
//            return  true;
//        }
//
//        node slow = head;
//        node fast = head;
//
//        while( fast !=null || fast.next!=null)
//        {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//
//        node newhead = recursive_revrse_ll(slow.next);
//
//        node  sec = newhead;
//        node first = head;
//
//        while(sec!=null)
//        {
//
//            if (sec.data==first.data) {
//
//                newhead = newhead.next;
//                head = head.next;
//            }
//        else
//        {
//            return false;
//        }
//        }
//        recursive_revrse_ll(newhead);
//        return true;
//    }
//

    public  static  node brute_putting_odd_even_elments( node  head)
    {
        ArrayList <Integer> arr = new ArrayList<>();
        node temp = head;

        if (head==null || head.next==null)
        {
            return head;
        }

        while( temp!=null && temp.next!=null)
        {
            arr.add(temp.data);
            temp = temp.next.next;
        }

        temp = head.next;

        while (temp!=null  && temp.next != null)
        {

            arr.add(temp.data);
            temp=temp.next.next;
        }

        int i = 0 ;
        temp = head;

        while( temp!=null  && temp.next != null)
        {
            temp.data=arr.get(i);
            i++;
            temp=temp.next;

        }
        return head;
    }

    public  static node better_putting_odd_even_elments( node head)
    {
        node odd = head;
        node even = head.next;
        node new_even = head.next;


        if (head == null || head.next==null)
        {
            return head;
        }

        while( even !=null && even.next!=null)
        {
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even = even.next;

        }
        odd.next = new_even;

        return head;
    }

    public static node brute_delete_n_from_last( node head , int n)
    {
        node temp = head;

        int count = 0;

        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }

        if (count==n)
        {
            node newhead = head.next;
            return newhead;
        }
        temp =head;
        int result =   count - n;

        while(temp!=null)
        {
            result--;

            if (result==0)
            {
                break;

            }
            temp=temp.next;
        }
        node delnode=temp.next;
        temp.next= temp.next.next;
        return head;
    }

    public  static node optimal_delete_n_from_last( node head , int n )
    {
        node fast = head;
        node slow = head;

        for ( int i = 0 ; i<n ; i++)
        {
            fast=fast.next;
        }


        if (fast==null)
        {
            return head.next;
        }

        while(fast.next!=null)
        {
            fast=fast.next;
            slow= slow.next;
        }
        node delnode= slow.next;
        slow.next=slow.next.next;

        return head;

    }

    public static  node brute_delete_mid_node( node head)
    {
        if (head==null || head.next==null)
        {
            return null;
        }

        node temp = head;
        int count = 0 ;



        while( temp!=null)
        {
            count++;
            temp =temp.next;

        }

        int mid = count/2;
        temp = head;

        while(temp!=null)
        {
            mid--;

            if (mid==1)
            {
                temp.next=temp.next.next;
            }
            temp=temp.next;

        }

        return head;
    }

    public static node optimal_delete_mid_node( node head){


        if (head==null || head.next==null)
        {
            return null;
        }

        node slow =head;
        node fast = head;
        node prev = null;
        while( fast!=null && fast.next!=null)
        {
            prev=slow;
            slow = slow.next;
            fast=fast.next.next;

        }
        prev.next=slow.next;
        return head;
    }

    public  static node brute_sort_ll( node head)
    {

        ArrayList <Integer> nums = new ArrayList<>();
        node temp = head;

        while(temp!=null)
        {
            nums.add(temp.data);
            temp=temp.next;

        }

        Collections.sort(nums);
        int i = 0;
        temp = head;
        while(temp!=null)
        {
            temp.data=nums.get(i);
            i++;
            temp=temp.next;

        }
        return head;
    }

    public static  node brute_merge_two_sort_ll( node head)
    {


















        return head;
    }


    public static node optimal_merge_two_sort_ll(node head1, node head2)
    {
        node dnode = new node(-1);
        node temp = dnode;

        node t1 = head1;
        node t2 = head2;

        while (t1 != null && t2 != null)
        {
            if (t1.data < t2.data)
            {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            }
            else
            {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        if (t1 != null)
        {
            temp.next = t1;
        }

        if (t2 != null)
        {
            temp.next = t2;
        }

        return dnode.next;
    }

    public static node brute_dutchman_flag_ll( node head)
    {
        node temp = head;
        int c0=0;
        int c1=0;
        int c2 =0;

        while( temp!=null)
        {

            if (temp.data==0) c0++;
            else if (temp.data==1) c1++;
            else if(temp.data==2) c2++;

            temp=temp.next;
        }

        temp = head;

        while(temp!=null)
        {

            if(c0!=0)
            {
                temp.data=0;
                c0--;
            }

            else   if(c1!=0)
            {
                temp.data=1;
                c1--;
            }

            else if (c2!=0)
            {
                temp.data=2;
                c2--;
            }
            temp=temp.next;

        }
        return  head;
    }

    public  static node optimal_dutchman_flag_ll( node head)
    {

        node dumy0=new node(-1);  node zero=dumy0;
        node dumy1=new node(-1); node one = dumy1;
        node dumy2=new node(-1); node two = dumy2;

        node temp = head;

        while(temp!=null)
        {

            if (temp.data==0)
            {
                zero.next=temp;
                zero=temp;
            }


            else    if (temp.data==1)
            {
                one.next=temp;
                one=temp;
            }

            else   if (temp.data==2)
            {
                two.next=temp;
                two=temp;
            }

            temp=temp.next;

        }

        if (dumy1.next!=null)
        {
            zero.next=dumy1.next;
        }

        else {
            zero.next=dumy2.next;
        }

        one.next=dumy2.next;

        two.next=null;

        return  dumy0.next;
    }

    public static node brute_first_intersection_node( node head1 , node head2)
    {
        HashMap <node,Integer> mpp = new HashMap<>();
        node temp1= head1;
        node temp2 = head2;

        while (temp1!=null)
        {
            mpp.put(temp1,1);
            temp1=temp1.next;
        }
        while(temp2!=null){

            if (mpp.containsKey(temp2))
            {
                return temp2;
            }
            temp2=temp2.next;
        }
        return null;
    }

    public static node better_first_intersection_node( node head1  , node head2)
    {
        node temp1 = head1;
        node temp2 = head2;

        int c1=0;
        while(temp1!=null)
        {
            c1++;
            temp1=temp1.next;
        }

        int c2=0;
        while(temp2!=null)
        {
            c2++;
            temp2=temp2.next;
        }
        int  diff = Math.abs(c2-c1);

        temp1=head1;
        temp2=head2;

        if (c1<c2)
        {

            while (diff>0)
            {
                diff--;
                temp2=temp2.next;
            }

        }
        else{


            while (diff>0)
            {
                diff--;
                temp1=temp1.next;
            }
        }


        while(temp2 !=null && temp1!=null)
        {

            if (temp1==temp2) {

                return temp1;
            }

            else
            {
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }


        return temp2;
    }

    public  static node optimal_first_intersection_node( node head1 , node head2)
    {

        node temp1=head1;
        node temp2 =head2;

        while (temp1!=temp2)
        {

            if (temp1==null)
            {
                temp1=head2;
            }
            else {
                temp1=temp1.next;
            }

            if (temp2==null)
            {
                temp2=head1;
            }
            else{
                temp2=temp2.next;
            }

        }


        return temp1;
    }

    public static  node brute_add_1_ll( node head)
    {

        head = recursive_revrse_ll(head);
        node temp = head;
        int carry =1;
        while( temp!=null)
        {
            temp.data= temp.data+carry;

            if (temp.data<10){
                carry=0;
                break;
            }
            else {

                carry=1;
                temp.data=0;

            }
            temp=temp.next;
        }

        if (carry==1){
            node additional_node = new node(1);
            recursive_revrse_ll(head);
            additional_node.next=head;
        }
        return  null;
    }

    public static node optimal_add_1_ll( node head){

        node temp = head;


        int carry = engine_optimla_add_1_ll(head);


        if (carry==1)
        {

            node m_hu_new_node = new node(1);
            m_hu_new_node.next=head;
            return m_hu_new_node;


        }



        return head;


    }

    public static int engine_optimla_add_1_ll(node temp )
    {
        if (temp==null)
        {
            return 1;
        }

        int carry = engine_optimla_add_1_ll(temp.next);
        temp.data=temp.data+carry;
        if (temp.data<10){

            return 0;
        }
        else {
            temp.data=0;
            return 1;
        }
    }

    public  static  node ooptimal_add_two_ll( node ll1 , node ll2){

        node dummy=new node(0);
        node temp = dummy;

        int carry = 0;
        while(ll1!=null || ll2!=null || carry!=0) {
            int sum = 0;
            if (ll1 != null) {

                sum = ll1.data;
                ll1 = ll1.next;

            }

            if (ll2 != null) {
                sum += ll2.data;
                ll2 = ll2.next;
            }

            carry = sum/10;
            sum+=carry;
            node actual_ll = new node(sum%10);

            temp.next=actual_ll;
            temp=temp.next;

        }
        return dummy.next;
    }




    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};

        node head = convertArr2_ll(arr);

        printll(head);

        //   node middle = brute_middle_ll(head);

        //   System.out.println("Middle Node = " + middle.data);

//        head = optimal_find_mid(head);
//        System.out.println(head.data);

        head = iterative_reverse_ll(head);
        printll(head);

        head = recursive_revrse_ll(head);
        printll(head);


        System.out.println(brute_detect_loop(head));

        System.out.println(optimal_detetct_loop(head));

        System.out.println(brute_find_start_ll(head));

        System.out.println(optimal_detetct_loop(head));

        System.out.println(brute_find_length_ll(head));

        System.out.println(optimal_find_length_ll(head));

        System.out.println(brute_check_palindrome(head));

        head = brute_putting_odd_even_elments(head);
        printll(head);

        head = better_putting_odd_even_elments(head);
        printll(head);

        head = brute_delete_n_from_last(head , 8);
        printll(head);

        head = optimal_delete_n_from_last(head,3);
        printll(head);

        head = brute_delete_mid_node(head);
        printll(head);

        head = optimal_delete_mid_node(head);
        printll(head);











    }
}