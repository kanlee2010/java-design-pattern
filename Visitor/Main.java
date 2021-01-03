package Visitor;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        File track1 = new File("track1");

        root.add(home);
        home.add(track1);

        root.accept(new ViewVisitor());
    }
}
