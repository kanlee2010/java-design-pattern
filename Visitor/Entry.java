package Visitor;

public abstract class Entry implements Element {
    private String name;

    public Entry(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public abstract void add(Entry entry);

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }
}