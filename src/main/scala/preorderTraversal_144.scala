import java.util

import scala.collection.mutable.ListBuffer

/**
  * 144. 二叉树的前序遍历
  * Created by luyao on 2019/2/26.
  */
object preorderTraversal_144 {


  /**
    * 递归
    * @param root
    * @return
    */
  def preorderTraversal(root: TreeNode): List[Int] = {
    var res = List[Int]()
    if(root == null) return List[Int]()
    res = res:::List[Int](root.value)
    res = res:::preorderTraversal(root.left)
    res = res:::preorderTraversal(root.right)
    res
  }

  /**
    * 非递归
    * @param root
    * @return
    */
  def preorderTraversal2(root: TreeNode): List[Int] = {
    val stack:util.LinkedList[TreeNode] = new util.LinkedList()
    var pNode = root
    var res = ListBuffer[Int]()
    while (pNode!=null || !stack.isEmpty){
      if(pNode != null){
        res = res.+=(pNode.value)
        stack.push(pNode)
        pNode = pNode.left
      }else{
        val node = stack.pop()
        pNode = node.right
      }
    }
    res.toList
  }


  def main(args: Array[String]): Unit = {
    val root = new TreeNode(1)
    root.right = new TreeNode(2)
    root.right.left = new TreeNode(3)
    val ls = preorderTraversal2(root)
    for(l <- ls) println(l)
  }

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}
