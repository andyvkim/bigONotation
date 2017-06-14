/**
 * Created by paulkim on 6/14/17.
 */
public class BigONotation {

    private int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    /*
    0(1) the time needed to complete a task does not change depending on what is being done
    adding an item to an array no matter how big the number is, does not change the complexity of this process
    */
    public void addItemToArray(int newItem){
        theArray[itemsInArray++] = newItem;
    }

    /*
    0(n) the compexity is dependent on how big n is. this is a linear relationship
     */
    public void linearSearchForValue(int value){

        boolean valueInArray = false;
        String indexesWithValue = "";

        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == value){
                valueInArray = true;
                indexesWithValue += value + " ";

            }
        }
        System.out.println("Value found " + valueInArray);

    }

    

}
