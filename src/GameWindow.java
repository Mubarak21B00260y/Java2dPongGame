import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;


public class GameWindow extends JFrame implements Runnable {
    final Graphics2D graphics2D;
    Listener listener = new Listener();
    KeyEvent keyEvent;
    Rectangle rectangle;
    Rectangle player = new Rectangle(Constants.ZERO, Constants.ZERO, Constants.PLAYER_WIDTH, Constants.PLAYER_HEIGHT, Constants.PLAYER_COLOR);
    Rectangle cpu = new Rectangle(Constants.CPU_X_AXIS, Constants.CPU_Y_AXIS, Constants.PLAYER_WIDTH, Constants.PLAYER_HEIGHT, Constants.PLAYER_COLOR);
    Rectangle gameBall = new Rectangle(Constants.BALL_X_AXIS, Constants.BALL_Y_AXIS, Constants.BALL_WIDTH, Constants.BALL_HEIGHT, Constants.PLAYER_COLOR);

    public GameWindow() {
        this.setTitle(Constants.Title);
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_WIDTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.graphics2D = (Graphics2D) this.getGraphics();
        this.addKeyListener(listener);
    }

    public void update(double deltaTime) {
        graphics2D.setColor(Color.BLUE);
        graphics2D.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_WIDTH);
        player.draw(graphics2D);
        cpu.draw(graphics2D);
        gameBall.draw(graphics2D);


    }

    @Override
    public void run() {
        double lastFrameTime = Constants.LAST_FRAME_TIME;
        while (true) {

            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;

            update(deltaTime);

            try {

                Thread.sleep(30);
            } catch (Exception e) {

                throw new RuntimeException(e.getMessage());
            }
        }

    }
}
