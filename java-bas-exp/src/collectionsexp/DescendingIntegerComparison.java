package collectionsexp;

import java.util.Comparator;

public class DescendingIntegerComparison implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.intValue() - o1.intValue();
    }
}
