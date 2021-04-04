package head_first.template_method;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String message;

    public void init() {
        message = "�ȳ��ϼ���";
        repaint();
    }

    public void start() {
        message = "���� �� ...";
        repaint();
    }

    public void stop() {
        message = "�����ϴ�";
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
