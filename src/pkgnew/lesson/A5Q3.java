/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgnew.lesson;

/**
 *
 * @author messr2578
 */
public class A5Q3 {
    // make the stack a string
    private char[] stack;
    // keep track of the char stack size
    private int size;
    
    public A5Q3(){
        this.size = 10;
        this.stack = new char[10];
    }
    public boolean inLang(String word){
        boolean lang = true;
        // turn word into a character stack
        for (int i = 0; i < word.length(); i++) {
            this.stack[i-1] = word.charAt(i);
        }
        while(lang){
            if(this.stack[0]== this.stack[word.length()-1]){
                lang = true;
            }else{
                lang = false;
            }
        }
        
        
        return lang;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q3 word = new A5Q3();
    }
}
