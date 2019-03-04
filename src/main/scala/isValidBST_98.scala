
/**
  * 98. 验证二叉搜索树
  *
  *    卡Integer.MIN_VALUE边界值太恶心
  * Created by luyao on 2019/3/4.
  */
object isValidBST_98 {

  def isValidBST(root: TreeNode): Boolean = {
    if(root == null) return true
    //迭代中序遍历，同时判断是否是大于上一次输出的
    import scala.collection.mutable.Stack
    val stack = Stack[TreeNode]()
    var pNode = root
    var tmp:Int = Integer.MIN_VALUE
    var first_flag = 0
    while (pNode != null || !stack.isEmpty){
      if(pNode!=null){
        stack.push(pNode)
        pNode = pNode.left
      }else{
        pNode = stack.pop()
        if(first_flag != 0){
          if(pNode.value <= tmp) return false else tmp = pNode.value
        }else{
          tmp = pNode.value
          first_flag = 1
        }
        pNode = pNode.right
      }
    }
    true
  }


  class TreeNode(var _value: Int) {
    var value: Int = _value
    var left: TreeNode = null
    var right: TreeNode = null
  }

}
