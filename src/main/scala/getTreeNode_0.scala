/**
  * 先序遍历:ABCDEFGH
  * 中序遍历:CBEDAGHF
  * 求出二叉树
  * Created by luyao on 2019/2/28.
  */
object getTreeNode_0 {

  def getTreeNode(f:String,m:String): TreeNode ={
    if(f.length ==0 ) return null
    if(f.length ==1 ) return new TreeNode(f.charAt(0).toString)
    else{
      val root = f.charAt(0).toString
      val res = new TreeNode(root)
      val index = getIndex(m,root)
      res.left = getTreeNode(f.substring(1,index+1),m.substring(0,index))
      res.right = getTreeNode(f.substring(index+1,f.length),m.substring(index+1,m.length))
      return res
    }
  }

  def getIndex(str :String,c:String): Int ={
    var i = 0
    for(s <- str){
      if(s.toString == c) return i
      i = i +1
    }
    return i
  }


  def main(args: Array[String]): Unit = {
    val str = "CBEDAGHF"
//    val res = getIndex(str,"A")
//    println(res)
//
//    var s1 = str.substring(0,4)
//    var s2 = str.substring(4+1,str.length)
//    println(s1)
//    println(s2)
    val str2 = "ABCDEFGH"
//    s1 = str2.substring(1,4+1)
//    s2 = str2.substring(4+1,str2.length)
//    println(s1)
//    println(s2)


    val tree = getTreeNode(str2,str)
    println(postorderTraversal1(tree))
    println(postorderTraversal2(tree))
    println(postorderTraversal3(tree))



  }

  def postorderTraversal1(root: TreeNode): String = {
    var res = ""
    if(root == null) return ""
    res = res+root.value
    res = res+postorderTraversal1(root.left)
    res = res+postorderTraversal1(root.right)
    res
  }
  def postorderTraversal2(root: TreeNode): String = {
    var res = ""
    if(root == null) return ""
    res = res+postorderTraversal1(root.left)
    res = res+root.value
    res = res+postorderTraversal1(root.right)

    res
  }
  def postorderTraversal3(root: TreeNode): String = {
    var res = ""
    if(root == null) return ""
    res = res+postorderTraversal1(root.left)
    res = res+postorderTraversal1(root.right)
    res = res+root.value
    res
  }

  class TreeNode(var _value: String) {
    var value: String = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}
