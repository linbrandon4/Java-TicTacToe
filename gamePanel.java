import javax.swing.JButton; 
import java.awt.event.*;  
class gamePanel{
 public static int turn = 1;
public static void main(String args[]){
   JButton tile1 = new JButton();
   JButton tile2 = new JButton();
   JButton tile3 = new JButton();
   JButton tile4 = new JButton();
   JButton tile5 = new JButton();
   JButton tile6 = new JButton();
   JButton tile7 = new JButton();
   JButton tile8 = new JButton();
   JButton tile9 = new JButton();
   JButton[][] tiles = {
  {tile1, tile2, tile3},
  {tile4, tile5, tile6},
  {tile7, tile8, tile9}};
   MyFrame gameFrame = new MyFrame(tiles);
   tile1.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile1.setText("O");  
      }
      else{
                tile1.setText("X");
      }
      incrementTurn();
      tile1.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile2.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile2.setText("O");  
      }
      else{
                tile2.setText("X");
      }
      incrementTurn();
      tile2.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile3.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile3.setText("O");  
      }
      else{
                tile3.setText("X");
      }
      incrementTurn();
      tile3.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile4.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile4.setText("O");  
      }
      else{
                tile4.setText("X");
      }
      incrementTurn();
      tile4.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile5.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile5.setText("O");  
      }
      else{
                tile5.setText("X");
      }
      incrementTurn();
      tile5.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile6.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile6.setText("O");  
      }
      else{
                tile6.setText("X");
      }
      incrementTurn();
      tile6.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile7.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile7.setText("O");  
      }
      else{
                tile7.setText("X");
      }
      incrementTurn();
      tile7.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile8.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile8.setText("O");  
      }
      else{
                tile8.setText("X");
      }
      incrementTurn();
      tile8.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 tile9.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      if (turn % 2 == 0){
                tile9.setText("O");  
      }
      else{
                tile9 .setText("X");
      }
      incrementTurn();
      tile9.setEnabled(false);
      gameFrame.checkTie();
      gameFrame.checkHorVictory();
      gameFrame.checkVertVictory();
      gameFrame.checkDiagVictory();
            }  
        });  
 }
    public static int incrementTurn(){
      turn++;
      return turn;
}
}