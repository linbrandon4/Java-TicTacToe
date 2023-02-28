import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
  JPanel panel = new JPanel(new GridLayout(3, 3));
  JButton[][] buttons = new JButton[3][3];
   private int player1Score = 0;
   private int player2Score = 0;
   public int tieScore = 0;
  public MyFrame(JButton[][] labels){
    this.setTitle("JFrame Title");
    this.setSize(600, 600);
    this.getContentPane().setBackground(new Color (100, 100, 100));
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
      for (int i = 0; i < labels.length; i++){
        for (int j = 0; j < labels.length; j++){
          buttons[i][j] = labels[i][j];
          panel.add(buttons[i][j]);
        }
      }
      this.add(panel);
  }
  public JPanel getPanel(){
    return panel;
  }
  public void checkHorVictory() {
    for (int i = 0; i < buttons.length; i++){
      if (buttons[i][0].getText().equals("X") && buttons[i][1].getText().equals("X") && buttons[i][2].getText().equals("X")){
        player1Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
      if (buttons[i][0].getText().equals("O") && buttons[i][1].getText().equals("O") && buttons[i][2].getText().equals("O")){
        player2Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
    }
  }
  public void checkVertVictory() {
    for (int i = 0; i < buttons.length; i++){
      if (buttons[0][i].getText().equals("X") && buttons[1][i].getText().equals("X") && buttons[2][i].getText().equals("X")){
        player1Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
      if (buttons[0][i].getText().equals("O") && buttons[1][i].getText().equals("O") && buttons[2][i].getText().equals("O")){
        player2Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
    }
  }
  public void checkDiagVictory() {
      if (buttons[0][0].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][2].getText().equals("X")){
        player1Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
      if (buttons[0][2].getText().equals("X") && buttons[1][1].getText().equals("X") && buttons[2][0].getText().equals("X")){
        player1Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
      if (buttons[0][0].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[2][2].getText().equals("O")){
        player2Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
      if (buttons[0][2].getText().equals("O") && buttons[1][1].getText().equals("O") && buttons[2][0].getText().equals("O")){
        player2Score++;
        gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
      }
  }
  public boolean checkTie() {
    int filled = 0;
    boolean tie = true;
    for (int i = 0; i < buttons.length; i++){
      for (int j = 0; j < buttons.length; j++){
        if (!(buttons[i][j].getText().equals("X") || buttons[i][j].getText().equals("O"))){
          tie = false;
        }
        else{
          filled++;
        }
      }
    }
    if (filled == 9){
      tieScore++;
      gamePanel.turn = 1;
        resetBoard();
        showScore();
        enableButtons();
    }
    return tie;
  }
  public void resetBoard() {
      for (int i = 0; i < buttons.length; i++) {
        for (int j = 0; j < buttons.length; j++){
          buttons[i][j].setText(""); 
        }
  }
}
public void showScore() {
  JOptionPane.showMessageDialog(null, "Player 1 Score: " + player1Score + "\r\n Player 2 Score: " + player2Score + "\r\n Tie Score: " + tieScore, "Player Score", JOptionPane.PLAIN_MESSAGE);
}
public void enableButtons() {
  for (int i = 0; i < buttons.length; i++){
    for (int j = 0; j < buttons.length; j++){
      buttons[i][j].setEnabled(true);
    }
  }
}
}