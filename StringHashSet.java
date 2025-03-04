import java.util.LinkedList;

public class StringHashSet {
    private LinkedList<String>[] tab;
    private int count;

    public StringHashSet() {
        this.tab = new LinkedList[10];
        this.count = 0;
    }

    public StringHashSet(int initialCapacity) {
        this.tab = new LinkedList[initialCapacity];
        this.count = 0;
    }

    public int hash(String s) {
        return Math.abs(s.hashCode()) % this.tab.length;

    }



}