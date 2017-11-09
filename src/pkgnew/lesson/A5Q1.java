/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.lesson;

/**
 *
 * @author messr2578
 */
public class A5Q1 {

    private IntNode head;
    private int numItems;

    public A5Q1() {
        this.head = null;
        this.numItems = 0;
    }
/*
 * add in the next node in the right number spot
 */
    public void add(int num) {
        // start at beginning of the list
        IntNode node = this.head;
        //see if it is the first item
        if (node == null) {
            IntNode temp = new IntNode(num);
            this.head = temp;
            // if it's not the first number in the list
        } else if (this.head.getNum() >= num) {
            IntNode temp = new IntNode(num);
            temp.setNext(this.head);
            // change node pointer
            this.head = temp;
        } else {
            while (num > node.getNum() && node.getNext() != null) {
                // travel to the next node
                System.out.println("hello");
                node = node.getNext();
            }
            //make the temp node to add it
            IntNode temp = new IntNode(num);
            temp.setNext(node.getNext());
            // change node pointer
            node.setNext(temp);
        }
        // increase the size counter
        this.numItems++;
    }

    public int size() {
        return this.numItems;
    }
/*
 * returmn if the list is empty
 */
    public boolean isEmpty() {
        return this.numItems == 0;
    }
/*
 * get the number at the right position
 */
    public int get(int pos) {
        IntNode node = this.head;
        // move the number of items
        for (int i = 0; i < pos; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

    public void remove(int num) {
        // if removing from start
        if (this.head.getNum() == num) {
            this.head = this.head.getNext();
        } else {
            IntNode node = this.head;
            while (node.getNext().getNum() != num) {
                node = node.getNext();
            }
            if (node.getNext() == null) {
            } else {
                // the node to remove
                IntNode toRemove = node.getNext();
                // get the next node
                IntNode next = toRemove.getNext();
                // set all the links
                node.setNext(next);
                toRemove.setNext(null);
            }
        }
        this.numItems--;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q1 list = new A5Q1();
        list.add(4);
        list.add(5);
        list.add(2);
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
