import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
    int currentIndex;
    int[] data;

    /*Construct the sequence by copying values from the other array into the data array*/
    public ArraySequence(int[] other){  
        data = other;
        currentIndex = 0;
    }

    //Postcondition: The otherseq will be reset.
    //This constructor will copy ALL values of the `otherseq` into the data array.
    public ArraySequence(IntegerSequence otherseq){
        data = new int[otherseq.length()];
        otherseq.reset();
        for(int i = 0; i < data.length; ++i) {
            data[i] = otherseq.next();
        }
        otherseq.reset();
        currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < data.length; 
    }

    public int next() {
        return data[currentIndex++];
    }

    public int length() {
        return data.length;
    }

    public void reset() {
        currentIndex = 0;
    }
}