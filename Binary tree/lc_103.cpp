public class lc_103 {
     vector<vector<int>> ans;
        if(!root) return ans;
        queue<TreeNode*> q;
        q.push(root);
        bool leftToright=true;
        while(!q.empty()){
            int size=q.size();
            vector<int> level(size);
                for(int i=0;i<size;i++){
                    TreeNode* node=q.front();
                    q.pop();
                    int index=leftToright?i:size-i-1;
                    level[index]=node->val;

                    if(node->left) q.push(node->left);
                    if(node->right) q.push(node->right);

                }
                ans.push_back(level);
                leftToright=!leftToright;
        }
        return ans;
    }
}
