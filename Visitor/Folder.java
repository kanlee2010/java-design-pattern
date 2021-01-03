package Visitor;

import java.util.ArrayList;

public class Folder extends Entry {
    private ArrayList<Entry> entries = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Entry entry) {
        entries.add(entry);
    }

    public int getEntrySize() {
        return entries.size();
    }

    public Entry getEntry(int index) {
        return entries.get(index);
    }
}
