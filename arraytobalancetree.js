/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var sortedArrayToBST = function(nums,left=0, right=nums.length-1) {
    if(left>right)
        return null;
    
    const mid=Math.floor((left+right)/2);
    const node =new TreeNode(nums[mid]);
    node.left=sortedArrayToBST(nums,left,mid-1);
    node.right=sortedArrayToBST(nums,mid+1,right);

    return node;
};