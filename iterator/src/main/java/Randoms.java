import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new InfinityIter(this.min, this.max);
    }


}