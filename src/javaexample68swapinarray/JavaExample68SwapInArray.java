
package javaexample68swapinarray;


public class JavaExample68SwapInArray {

    
    public static void main(String[] args) {
     
        StringBuilder[] words= new StringBuilder[] {new StringBuilder("one"), 
        new StringBuilder("two"), new StringBuilder("three"), new StringBuilder("four"),
        new StringBuilder("five"), new StringBuilder("six")};
        
        PrintArray(words);
        
        // two swap operations
        Swap(words, 1, 3);
        Swap(words, 2, 4);
        
        PrintArray(words);
        
    }
    
    private static void Swap(Object[] array, int indx1, int indx2)
    {
        Object temp=null;
        if(array==null || indx1<0 || indx1>=array.length || indx2<0 || indx2>=array.length || indx1==indx2)
            return;
        else{
            temp=array[indx1];
            array[indx1]= array[indx2];
            array[indx2]=temp;
        }
    }
    
    private  static  void PrintArray(Object[] array)
    {
        for (Object item : array) {
            System.out.print(item +" ");
        }
        System.out.println();
    }
}
