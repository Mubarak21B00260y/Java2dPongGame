import javax.swing.*;
public class GameWindow extends JFrame implements  Runnable {


    public   GameWindow (){
         this.setTitle("PingPong");
         this.setSize(900, 800);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.setVisible(true);
    }

    @Override
    public void run() {

         while (true) {


             //todo
             // implement the logic;

         }



    }
}
