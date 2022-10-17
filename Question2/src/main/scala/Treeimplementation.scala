object Treeimplementation extends App{



val val1=new Node(40,null,null)
val val2=new Node(39,left=val1,null)
val val3=new Node(1,null,null)
val val4=new Node(11,val3,val2)
println(leafnode(val4))


}
case class Node(data: Int, left: Node, right: Node)



  def height(node: Node): Int = {
    if (node == null)
      -1
    else
      Math.max(height(node.left), height(node.right)) + 1
  }


  def leafnode(root: Node): Int = {
    if(root==null)
      0
    else if (root.left == null && root.right == null)
      1
    else {
      leafnode(root.left) + leafnode(root.right)
    }
  }


  def preorder(root: Node): Unit = {
    if (root != null) {
      println(root.data)

      preorder(root.left)

      preorder(root.right)
    }
  }




