package head_first.template_method;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "안녕하세요";
        repaint();
    }

    public void start() {
        message = "시작 중 ...";
        repaint();
    }

    public void stop() {
        message = "떠납니다";
        repaint();
    }

    public void destroy() {

    }

    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }

    public static void main(String[] args) {
        MyApplet myApplet = new MyApplet();
    }
}
