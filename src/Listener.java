import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener  implements KeyListener {

    boolean [] PressedKey = new boolean[Constants.ASCII_CHARACTERS];//
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
     PressedKey[e.getKeyCode()]=true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        PressedKey[e.getKeyCode()]=false;
    }

    public boolean OnKeyPressed (int keyCode){
         return   PressedKey[keyCode];
    }
}
