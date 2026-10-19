import com.sun.source.tree.Tree;

import javax.swing.*;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class inorderTraversal{

    int value ;
    TreeNode left ;
    TreeNode right ;

    public void TreeNode( int  value ){
        this.value = value;
        this.left=null;
        this.right=null;
    }
}

public class Binary_search_trees {

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode node = root;

        while (true) {

            if (node != null) {
                st.push(node);
                node = node.left;
            }
            else {
                if (st.empty()) {
                    break;
                }

                node = st.pop();
                list.add(node.value);
                node = node.right;
            }
        }

        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {


        List<Integer> list  = new ArrayList<>();
        rec( root  , list );

        return list ;
    }

    public  void rec( TreeNode root , List<Integer> list  ){

        TreeNode node = root;
        if(node == null ){
            return  ;
        }
        list.add( node.val);

        rec(node.left , list);
        rec(node.right , list);

    }

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if( root == null ){
            return list;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode node = s1.pop();
            s2.push(node);

            if(node.left!=null)
            {
                s1.push( node.left );
            }
            if(node.right!= null)
            {
                s1.push( node .right) ;
            }
        }
        while(!s2.isEmpty()){
            list.add(s2.pop().val);
        }
        return list ;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode > q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
            for( int i = 0 ; i<size; i++){
                TreeNode  node = q.poll();

                list.add(node.val);
                if(node.left!=null){
                    q.add(node .left);
                }

                if(node.right!= null){
                    q.add( node.right);
                }

            }
            ans.add(list);
        }
        return ans;

    }


    public static void main(String[] args) {





    }
}
