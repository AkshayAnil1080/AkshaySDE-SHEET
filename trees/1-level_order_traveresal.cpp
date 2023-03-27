//leetcode 102

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* node) {
        vector<vector<int>> ans;
        if(node==NULL) return ans;
        queue<TreeNode*> q;
        TreeNode* root = node;
        q.push(root);
        
        while(!q.empty()) {
            int c = q.size();
            vector<int> li;
            for(int i=0; i<c; i++) {
                TreeNode* temp = q.front();
                q.pop();
                li.push_back(temp->val);
                if(temp->left != NULL)
                    q.push(temp->left);
                if(temp->right != NULL)
                    q.push(temp->right);
            }
            ans.push_back(li);
        }
       
        return ans;  
    }
};

//gfg

class Solution
{
    public:
    //Function to return the level order traversal of a tree.
    vector<int> levelOrder(Node* node)
    {
      //Your code her
       vector<int> result;
        queue<Node*> q;
        Node* root = node;
        q.push(root);
        
        while(!q.empty()) {
            Node* temp = q.front();
            q.pop();
            result.push_back(temp->data);
            if(temp->left != nullptr) q.push(temp->left);
            if(temp->right != nullptr) q.push(temp->right);
        }
        return result;
    }
};