import java.util.List;

public class PancakeIterator implements Iterator {
	List<MenuItem> items;
	int position = 0;

    public PancakeIterator(List<MenuItem> items) {
		this.items = items;
    }
    
    @Override
    public boolean hasNext() {
		return items.size() > position;
    }

    @Override
    public Object next() {
		return items.get(position++);
    }

}
