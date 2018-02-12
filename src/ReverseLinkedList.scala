/**
  * Created by Varre.Sai-Bharath-Ku on 2/2/2018.
  */
object ReverseLinkedList {


  def main(args: Array[String]) {

    println("Program to reverse a given Singly linked List  " )

    var head =new Node(4)
    head.nxt=Some(new Node(5))
    head.nxt.get.nxt= Some(new Node(6))
    head.nxt.get.nxt.get.nxt= Some(new Node(7))
    head.nxt.get.nxt.get.nxt.get.nxt= Some(new Node(8))

    println("before reversal: ")
    printNodes(Some(head))

    var newHead = reverseNodes(Some(head), None)

    println("\n after reversal: ")
    printNodes(newHead)
  }

  def reverseNodes(  oldHead:Option[Node],  newHead:Option[Node]):Option[Node] =
  {
    oldHead match
    {
      case None => newHead
      case x => { var tmpNext=x.get.nxt; x.get.nxt=newHead; reverseNodes(tmpNext , x) }
    }
  }

  def printNodes( head:Option[Node]):Unit =
  {
    head match
    {
      case None => print("......finished")
      case x => { print("  "+x.get.num); printNodes(x.get.nxt) }

    }
  }

  class Node(var num:Int, var nxt:Option[Node]=None)

}