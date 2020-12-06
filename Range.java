import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
    private int start,end,current;
    public Range(int start, int end){
        this.start = start;
        current = start;
        this.end = end;
    }
    public void reset(){ 
        current = start;
    }
    public int length(){
        return end - start + 1;
    }
    public boolean hasNext(){
        return current <= end;
    }

    //@throws NoSuchElementException
    public int next(){    
        if(current >= end) throw new NoSuchElementException("End of range");
        return current++;
    }
  
}