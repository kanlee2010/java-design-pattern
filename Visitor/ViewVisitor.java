package Visitor;

public class ViewVisitor implements Visitor {
    private String Path = "";

    @Override
    public void visit(Entry visitable) {
        if (visitable instanceof File) {
            System.out.println(Path + "/" + ((File) visitable).getName());
        } else if (visitable instanceof Folder) {
            Folder foler = (Folder) visitable;
            Path = Path + "/" + foler.getName();
            System.out.println(Path);
            for (int i = 0; i < foler.getEntries().size(); i++) {
                foler.getEntries().get(i).accept(this);
            }
        }
    }
}