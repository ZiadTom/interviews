// Say you have an array for which the ith element is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

// Example 1:
// Input: [7, 1, 5, 3, 6, 4]
// Output: 5

// max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
// Example 2:
// Input: [7, 6, 4, 3, 1]
// Output: 0

// In this case, no transaction is done, i.e. max profit = 0.

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        //Kadane's algorithm
        if(prices.length == 0) {
            return 0;
        }
        
        int max = 0;
        int min = prices[0];
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        
        List<Integer> tempList = new ArrayList<Integer>();
        tempList.add(root.val);
        result.add(tempList);
        
        while(!queue.isEmpty()) {
            Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
            
            List<Integer> list = new ArrayList<Integer>();
            
            while(!queue.isEmpty()) {
                TreeNode current = queue.remove();
                
                if(current.left != null) {
                    currentLevel.add(current.left);
                    list.add(current.left.val);
                }
                
                if(current.right != null) {
                    currentLevel.add(current.right);
                    list.add(current.right.val);
                }
            }
            
            if(list.size() > 0) {
                result.add(list);
            }

            queue = currentLevel;
        }
        
        return max;
        // this new comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment
        // this is comment// this is comment
        // this is comment
        // this is comment
        // this is comment
    }
}
