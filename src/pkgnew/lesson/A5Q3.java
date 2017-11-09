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
    /**
     * initialize the variables
     */
    public A5Q3(){
        this.size = 10;
        this.stack = new char[10];
    }
    public boolean inLang(String word){
        // create the variable and boolean used to control the specific
        boolean lang = true;
        int ty= 0;
        // turn word into a character stack
        for (int i = 0; i < word.length(); i++) {
            this.stack[i] = word.charAt(i);
        }
        //check to see if the word is in the language
        while(lang = true && ((word.length()/2)+ty)== word.length()-1){
            if(this.stack[(word.length()/2)-ty]== this.stack[word.length()/2+ty]){
                System.out.println(this.stack[word.length()/2]);
                lang = true;
                // if it is not in the language return false
            }else{
                lang = false;
            }
            ty++;
        }
        return lang;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A5Q3 word = new A5Q3();
        System.out.println(word.inLang("cat$tac"));
        
    }
}
