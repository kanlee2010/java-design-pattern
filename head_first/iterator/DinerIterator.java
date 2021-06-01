
public class DinerIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
    
    public DinerIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        boolean outBound = position >= items.length || items[position] == null;
        return !outBound;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

}
