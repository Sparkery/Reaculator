   //Reaculator 
 //Pranav Balan, Ashvarya Garg, Aditya Ponukumati, Anirudh Ryali
   import javax.swing.JFrame;
    public class ReaculatorDriver
   {
       public static void main(String[] args)
      {
         JFrame frame = new JFrame("Reaculator");
         frame.setSize(400, 400);
         frame.setLocation(100, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new ReaculatorPanel()); 
         frame.setVisible(true);
      }
   }
