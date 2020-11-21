package Composite;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder home = new Folder("home");
        File track1 = new File("track1");

        root.addComponent(home);
        home.addComponent(track1);

        show(root);
    }

    private static void show(Component component) {
        System.out.println(component.getClass().getName()+" | "+component.getName());
        if(component instanceof Folder) {
            for(Component c : ((Folder)component).getChildren()) {
                show(c);
            }
        }
    }
}