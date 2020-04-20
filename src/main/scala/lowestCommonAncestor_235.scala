/**
  * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
  * @auther luyao
  * @date 20-4-20
  * @version 1.0
  */
object lowestCommonAncestor_235 {

  def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {

    val (left_int,rigth_int) = if( p.value < q.value) (p.value,q.value) else (q.value,p.value)

    if(left_int <= root.value && rigth_int >= root.value){
      return root
    }else if (rigth_int < root.value){
      return lowestCommonAncestor(root.left,p,q)
    } else if (left_int > root.value){
      return lowestCommonAncestor(root.right,p,q)
    } else {
      return root
    }


  }


  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}
