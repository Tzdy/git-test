import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloWorldSwing {
    private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public HelloWorldSwing(){
      prepareGUI();
   }
   public static void main(String[] args){
      HelloWorldSwing  swingControlDemo = new HelloWorldSwing();      
      swingControlDemo.showTextAreaDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Java Swing JTextArea示例");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showTextAreaDemo(){
      headerLabel.setText("Control in action: JTextArea"); 
      JLabel  commentlabel= new JLabel("评论内容: ", JLabel.RIGHT);

      final JTextArea commentTextArea = 
         new JTextArea("这个是一个简单的Swing JTextArea \n" 
         +" 用于制作用户图形界面。",5,20);

      JScrollPane scrollPane = new JScrollPane(commentTextArea);    
      JButton showButton = new JButton("显示评论");

      showButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            statusLabel.setText( commentTextArea.getText());        
         }
      }); 
      controlPanel.add(commentlabel);
      controlPanel.add(scrollPane);        
      controlPanel.add(showButton);
      mainFrame.setVisible(true);  
   }


}