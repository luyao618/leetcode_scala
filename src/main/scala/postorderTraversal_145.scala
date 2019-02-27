import java.util

import scala.collection.mutable.ListBuffer
/**
  * Created by luyao on 2019/2/26.
  */
object postorderTraversal_145 {
  /**
    * 递归
    * @param root
    * @return
    */
  def postorderTraversal(root: TreeNode): List[Int] = {
    var res = List[Int]()
    if(root == null) return List[Int]()
    res = res:::postorderTraversal(root.left)
    res = res:::postorderTraversal(root.right)
    res = res:::List[Int](root.value)
    res
  }

  /**
    * 非递归
    * @param root
    * @return
    */
  def postorderTraversal2(root: TreeNode): List[Int] = {
    if(root == null) return List[Int]()
    val stack:util.LinkedList[TreeNode] = new util.LinkedList()
    var cNode:TreeNode = root
    var pNode:TreeNode = null
    var res = ListBuffer[Int]()
    stack.push(root)
    while (!stack.isEmpty){
      cNode = stack.peek()
      if((cNode.left==null && cNode.right==null) || (pNode != null && (pNode == cNode.left || pNode == cNode.right))){
        res = res+=(cNode.value)
        stack.pop()
        pNode = cNode
      }else{
        if(cNode.right!=null) stack.push(cNode.right)
        if(cNode.left!=null) stack.push(cNode.left)
      }
    }
    res.toList
  }


  def main(args: Array[String]): Unit = {
    val root = new TreeNode(3)
    root.left = new TreeNode(1)
    root.right =  new TreeNode(2)
    val ls = postorderTraversal2(root)
    for(l <- ls) println(l)
  }

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }


}
