import java.util.Iterator;
import java.util.Random;

public class InfinityIter implements Iterator<Integer> {

    int min;
    int max;

    public InfinityIter( int min,int max){
        this.min = min;
        this.max = max;
    }


    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        Integer number = new Random().nextInt(this.max-this.min+1);
        number+=this.min;
        return number;
    }
}
