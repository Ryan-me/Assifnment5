 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.lesson;

/**
 *
 * @author messr2578
 */
public class IntNode {

    private int item;
    private IntNode next;
    
    public IntNode(int num){
        item = num;
        next = null;
    }
    /**
     * returns the number stored in the 
     * @return 
     */
    public int getNum(){
        return this.item;
    }
    /**
     * returns the next node
     * @return the next node 
     */
    public IntNode getNext(){
        return this.next;
    }
   /**
    * sets the node that comes after
    * @param node 
    */
    public void setNext(IntNode node){
        this.next = node;
    }
}
