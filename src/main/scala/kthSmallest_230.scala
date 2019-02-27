/**
  * 230. 二叉搜索树中第K小的元素
  *  二叉树中序遍历
  * Created by luyao on 2019/2/19.
  */
object kthSmallest {

  def main(args: Array[String]): Unit = {
    def kthSmallest(root: TreeNode, k: Int): Int ={
      val vol = new kthSmallest()
      vol.kthSmallest(root,k)
    }
  }
}


class kthSmallest {
  private var index = 0
  private var res = 0

  def kthSmallest(root: TreeNode, k: Int): Int = {

    if(root == null) return res
    kthSmallest(root.left,k)
    index = index + 1
    if(index == k) res = root.value
    kthSmallest(root.right,k)
    return res
  }
}


class TreeNode(var _value: Int) {
   var value: Int = _value
   var left: TreeNode = null
   var right: TreeNode = null
}
