package task8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.util.Objects;

// App class
class Main extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 500;
    String background_image_path = "back";
    String animation_images_path = "src/task8/frames/";
    int method;
    Graphics2D graphics;


    Main() {
        super("Random shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        Button btn = new Button("Start animation");
        btn.setSize(200, 100);
        btn.setLocation(0, 0);
        btn.addActionListener(
                event -> {
                    method = 1;
                    setTitle("Start animation");
                    setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT);
                    setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT);
                }
        );
        add(btn);

        Button shapesBtn = new Button("Add shapes");
        shapesBtn.setSize(100, 100);
        shapesBtn.setLocation(0, 110);
        shapesBtn.addActionListener(
                event -> {
                    System.out.println("shapes btn pressed");
                    random_shapes_paint(5);
                    repaint();
                }
        );
        add(shapesBtn);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }

    // Paint method
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        this.graphics = g;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);

        switch (this.method) {
            case 0 -> random_shapes_paint(50);
            case 1 -> animate(this.animation_images_path, g);
            default -> {
            }
        }
    }

    void random_shapes_paint(int shapes) {
        Graphics2D g = this.graphics;
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {

                // Oval
                case 1 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                }

                // Rect
                case 2 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                }

                // Line
                case 3 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_HEIGHT)
                    );
                }

                // Arc
                case 4 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 360),
                            (int) (Math.random() * 360)
                    );
                }

                // Rounded rect
                case 5 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200),
                            (int) (Math.random() * 200)
                    );
                }

                // Circle
                case 6 -> {
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH),
                            (int) (Math.random() * WINDOW_HEIGHT),
                            100,
                            100
                    );
                }
                default -> {
                }
            }
        }
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        while (true) {
            for (File file : dir.listFiles()) {
                Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }
    }



    // Start app
    public static void main(String[] args) {
        Main app = new Main();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        }
        else if (args.length == 2) {
            app.set_background_image_path(args[0]);
            app.set_animation_images_path(args[1]);
        }
        else {
            System.out.println("[!] Background image path is empty");
        }
    }
}