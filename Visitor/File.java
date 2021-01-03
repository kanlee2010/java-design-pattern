package Visitor;

public class File extends Entry {

    public File(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void add(Entry entry) {
    }
}