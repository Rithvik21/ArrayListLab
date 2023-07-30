
import java.util.ArrayList;
public class ArrayListWork
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ArrayListWork
     */
    public ArrayListWork()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    //#1)
    public static void replaceAll(ArrayList list, String word1, String word2){
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == word1){
                list.set(i, word2);
            }
        }
    }
    //#2)
    public static void insertWords(ArrayList list, String word, int newSize){
        int size = list.size();
        for(int i = size; i<newSize; i++){
            list.add(0, word);
        }
    }
    //#3)
    public static void insertWord(ArrayList list, String word1, String word2){
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == word1){
                list.add(i, word2);
            }
        }
    }
}
