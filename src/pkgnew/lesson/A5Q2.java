/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.lesson;

/**
 *
 * @author messr2578
 */
public class A5Q2 {
    // create the list array
    private int[] list;
    // keep track of how many numbers are in the array
    private int listtotal;
    // keep track of the size of the array
    private int size;
/*
 * initialize the variables
 */
    public A5Q2() {
        this.size = 10;
        this.list = new int[this.size];
        this.listtotal = 0;
    }
/*
 * add the new number in the right spot
 */
    public void add(int index, int num) {

        // make sure the array is the right size
        if (this.listtotal == this.size) {
            size = size * 2;
            int[] array = new int[((this.listtotal) * 2)];
            for (int i = 0; i < this.listtotal; i++) {
                array[i] = this.list[i];
            }
            // make the array be the list
            this.list = array;
        }
        // if the index is bigger than the next number add it to the end instead
        if (index < this.listtotal + 1) {
            index = this.listtotal + 1;
        }
        // add the number to the stack
        if (index <= this.listtotal) {
            this.list[index] = num;
        } else if (index > this.listtotal) {
            this.list[listtotal] = num;
        }
        this.listtotal++;

    }
    /*
     * remove a number in the list
     */
    public void remove(int index) {
        // set the current value of the index to zero
        this.list[index] = 0;
        // remove the empty spot in the list
        for (int i = index; i < this.listtotal; i++) {
            this.list[i] = this.list[i + 1];
        }
        this.listtotal--;
    }
    /*
     * return the number of numbers in the list
     */
    public int size() {
        return this.listtotal;
    }
    /*
     * return if there is nothing in the list
     */
    public boolean isEmpty() {
        return listtotal == 0;
    }
/**
 * 
 * @param index
 * @return the number at the specified location t
 */
    public int get(int index) {
        return this.list[index];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q2 list = new A5Q2();
        list.add(0, 4);
        list.add(1, 5);
        list.add(2, 2);
        list.add(3, 3);
        list.add(4, 6);
        list.add(5, 8);
        list.add(8, 9);
        list.add(6, 10);
        //list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
