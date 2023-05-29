class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        // Write your code here
        Node ans = morris(root, K);
        
        return (ans!=null) ? ans.data : -1;
    }
    Node morris(Node curr, int k)
    {
        while(curr!=null)
        {
            if(curr.left==null)
            {
                // print root node
                if(k==1) return curr;
                k--;
                curr=curr.right;
            }
            else
            {
                Node prev = curr.left;
                while(prev.right!= null && prev.right!=curr)
                prev = prev.right;
                
                if(prev.right==null) // thread is not there
                {
                    // make the thread
                    prev.right = curr;
                    curr= curr.left;
                }
                else // there is a thread;
                {
                    
                    //remove it
                    prev.right = null;
                   
                    if(k==1) return curr;
                     k--;
                    //print the data
                    curr = curr.right;
                }
            }
        }
        return null;
    }
}
