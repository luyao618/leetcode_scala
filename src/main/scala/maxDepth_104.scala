/**
  *
  * 二叉树的最大深度
  * @auther luyao
  * @date 20-4-22
  * @version 1.0
  */
object maxDepth_104 {

  def maxDepth(root: TreeNode): Int = {
    var result = 0
    if(root == null) return result
    if(root.left == null && root.right == null) result = 1
    val left_max = maxDepth(root.left)
    val rigth_max = maxDepth(root.right)
    if (left_max > rigth_max) result = 1 + left_max else result = 1 + rigth_max
    result
  }



}


class TreeNode(var _value: Int) {
  var value: Int = _value
  var left: TreeNode = null
  var right: TreeNode = null
}
