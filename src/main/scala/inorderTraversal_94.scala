
import java.util

import scala.collection.mutable.ListBuffer

/**
  * 94. 二叉树的中序遍历
  *   1）递归
  *   2）迭代
  * Created by luyao on 2019/2/26.
  */

/**
  * Definition for a binary tree node.
  * class TreeNode(var _value: Int) {
  *   var value: Int = _value
  *   var left: TreeNode = null
  *   var right: TreeNode = null
  * }
  */
object inorderTraversal_94 {


  /**
    * 递归的方式
    * @param root
    * @return
    */
  def inorderTraversal(root: TreeNode): List[Int] = {
    var res = List[Int]()
    if(root == null) return List[Int]()
    res = res:::inorderTraversal(root.left)
    res = res:::List[Int](root.value)
    res = res:::inorderTraversal(root.right)
    res
  }

  /**
    * 迭代的方式
    * @param root
    * @return
    */
  def inorderTraversal2(root: TreeNode): List[Int] = {
    val stack:util.LinkedList[TreeNode] = new util.LinkedList()
    var pNode = root
    var res = ListBuffer[Int]()
    while (pNode!=null || !stack.isEmpty){
      if(pNode != null){
        stack.push(pNode)
        pNode = pNode.left
      }else{
        val node = stack.pop()
        res = res.+=(node.value)
        pNode = node.right
      }
    }
    res.toList
  }

  def inorderTraversal3(root: TreeNode): List[Int] = {
    import scala.collection.mutable.Stack
    val stack = Stack[TreeNode]()
    var pNode = root
    var res = ListBuffer[Int]()
    while (pNode!=null || !stack.isEmpty){
      if(pNode != null){
        stack.push(pNode)
        pNode = pNode.left
      }else{
        val node = stack.pop()
        res = res+=(node.value)
        pNode = node.right
      }
    }
    res.toList
  }


  def main(args: Array[String]): Unit = {
    val root = new TreeNode(1)
    root.right = new TreeNode(2)
    root.right.left = new TreeNode(3)
    val ls = inorderTraversal3(root)
    for(l <- ls) println(l)
  }

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}



