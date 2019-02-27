import java.util

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  * 102. 二叉树的层次遍历
  * (头条面试)
  * Created by luyao on 2019/2/27.
  */
object levelOrder_102 {

  def levelOrder(root: TreeNode): List[List[Int]] = {
    var res:ListBuffer[List[Int]] = ListBuffer[List[Int]]()
    if(root == null) return res.toList
    var Arr1 = ArrayBuffer[TreeNode]()
    var Arr2 = ArrayBuffer[TreeNode]()
    Arr1 = Arr1.+=(root)
    while(Arr1.length !=0 || Arr2.length !=0){
      var level:ListBuffer[Int] = ListBuffer[Int]()
      for(it <- Arr1){
        level = level.+=(it.value)
        if(it.left != null) Arr2.+=(it.left)
        if(it.right != null) Arr2.+=(it.right)
      }
      if(level.length!=0) res = res.+=(level.toList)
      level = ListBuffer[Int]()
      Arr1 = ArrayBuffer[TreeNode]()
      for(it <- Arr2){
        level = level.+=(it.value)
        if(it.left != null) Arr1.+=(it.left)
        if(it.right != null) Arr1.+=(it.right)
      }
      Arr2 = ArrayBuffer[TreeNode]()
      if(level.length!=0) res = res.+=(level.toList)
    }
    res.toList
  }

  def levelTraverse(root: TreeNode){
    if (root == null) {
      return;
    }
    val queue: util.LinkedList[TreeNode] = new util.LinkedList[TreeNode]();
    queue.offer(root);
    while (!queue.isEmpty()) {
      val node = queue.poll();
      print(node.value + "  ");
      if (node.left != null) {
        queue.offer(node.left);
      }
      if (node.right != null) {
        queue.offer(node.right);
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val root = new TreeNode(3)
    root.right = new TreeNode(20)
    root.left = new TreeNode(9)
    root.right.left = new TreeNode(15)
    root.right.right = new TreeNode(7)
    val ls = levelOrder(root)
    for(l <- ls) {
      for (i <- l) print(i + ",")
      println()
    }

    levelTraverse(root)
  }

  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}
