package Observer;

import Observer.Button.OnClickListener;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.setOnClockListener(new ButtonClick());
        button.onClick();

        // Anonymous object
        button.setOnClockListener(new OnClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println(button + "is clicked");

            }
        });
        button.onClick();
    }
}


class ButtonClick implements OnClickListener {
    @Override
    public void onClick(Button button) {
        System.out.println(button + "is clicked");

    }
}
