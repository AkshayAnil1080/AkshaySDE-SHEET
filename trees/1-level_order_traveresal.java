//leet code 102

class Solution {
    public List<List<Integer>> levelOrder(TreeNode node) {
        
        
      List<List<Integer>> al = new ArrayList<>();
        if(node==null) return al;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode root = node;
        q.add(root);
        
        while(!q.isEmpty())
        {
            int c= q.size();
             List<Integer> li = new ArrayList<>();
            for(int i=0;i<c;i++)
            {

            TreeNode temp =q.poll();
            li.add(temp.val);
                
            // System.out.print(temp.val+ " ");
            
            if(temp.left!=null)
            q.add(temp.left);
            
            if(temp.right!=null)
            q.add(temp.right);
            }
            al.add(li);
               
        }
       
        return al;  
    }
}
// gfg

class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
       ArrayList <Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        Node root = node;
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temp =q.poll();
            al.add(temp.data);
            
            if(temp.left!=null)
            q.add(temp.left);
            
            if(temp.right!=null)
            q.add(temp.right);
            
            
           
           
        }
       
        return al;   
    }
}
