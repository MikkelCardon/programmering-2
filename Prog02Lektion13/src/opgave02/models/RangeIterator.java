package opgave02.models;

import java.util.Iterator;
import java.util.List;

public class RangeIterator implements Iterator<Integer> {
    private int index;
    private int end;

    public RangeIterator(int start, int end) {
        this.index = start;
        this.end = end;
    }

    @Override
    public boolean hasNext() {
       return index < end;
    }

    @Override
    public Integer next() {
        return index++;
    }
}
