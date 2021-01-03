package Visitor;

public class ViewVisitor implements Visitor {
    private static final String DELIMITER = "/";
    private String path = "";

    @Override
    public void visit(Entry visitable) {
        if (visitable instanceof File) {
            System.out.println(path + DELIMITER + ((File) visitable).getName());
        } else if (visitable instanceof Folder) {
            Folder foler = (Folder) visitable;
            path = path + DELIMITER + foler.getName();
            System.out.println(path);
            for (int i = 0; i < foler.getEntrySize(); i++) {
                foler.getEntry(i).accept(this);
            }
        }
    }
}
