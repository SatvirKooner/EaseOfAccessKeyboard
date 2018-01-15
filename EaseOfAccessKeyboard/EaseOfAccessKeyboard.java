import java.applet.Applet;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EaseOfAccessKeyboard
  extends Applet implements KeyListener
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public EaseOfAccessKeyboard() {}
  
  JButton[] keys1 = new JButton[10];
  JButton[] keys2 = new JButton[9];
  JButton[] keys3 = new JButton[7];
  Clip clip = null;
  
  Panel P1 = new Panel();
  Panel P2 = new Panel();
  Panel P3 = new Panel();
  
  public void init() {
    setSize(1074, 368);
    keys1[0] = new JButton("q");
    keys1[1] = new JButton("w");
    keys1[2] = new JButton("e");
    keys1[3] = new JButton("r");
    keys1[4] = new JButton("t");
    keys1[5] = new JButton("y");
    keys1[6] = new JButton("u");
    keys1[7] = new JButton("i");
    keys1[8] = new JButton("o");
    keys1[9] = new JButton("p");
    
    keys2[0] = new JButton("a");
    keys2[1] = new JButton("s");
    keys2[2] = new JButton("d");
    keys2[3] = new JButton("f");
    keys2[4] = new JButton("g");
    keys2[5] = new JButton("h");
    keys2[6] = new JButton("j");
    keys2[7] = new JButton("k");
    keys2[8] = new JButton("l");
    
    keys3[0] = new JButton("z");
    keys3[1] = new JButton("x");
    keys3[2] = new JButton("c");
    keys3[3] = new JButton("v");
    keys3[4] = new JButton("b");
    keys3[5] = new JButton("n");
    keys3[6] = new JButton("m");
    P1.setLayout(new FlowLayout(4, 20, 10));
    P2.setLayout(new FlowLayout(4, 20, 10));
    P3.setLayout(new FlowLayout(4, 20, 10));
    
    for (int i = 0; i < keys1.length; i++) {
      keys1[i].setPreferredSize(new Dimension(75, 75));
      P1.add(keys1[i]);
      keys1[i].addKeyListener(this);
    }
    for (int i = 0; i < keys2.length; i++) {
      keys2[i].setPreferredSize(new Dimension(75, 75));
      P2.add(keys2[i]);
      keys2[i].addKeyListener(this);
    }
    for (int i = 0; i < keys3.length; i++) {
      keys3[i].setPreferredSize(new Dimension(75, 75));
      P3.add(keys3[i]);
      keys3[i].addKeyListener(this);
    }
    setLayout(new FlowLayout(1, 10, 20));
    add(P1);
    add(P2);
    add(P3);
    keys1[0].requestFocusInWindow();
  }
  
  //the spacing here has been ruined after decompiling the jar (original code was lost after my old hdd died)
  //need to fix
  public void keyPressed(KeyEvent ev)
  {
    char key = ev.getKeyChar();
    String keyStr = Character.toString(key);
    String str1;
    switch ((str1 = keyStr).hashCode()) {case 97:  if (str1.equals("a")) {} break; case 98:  if (str1.equals("b")) {} break; case 99:  if (str1.equals("c")) {} break; case 100:  if (str1.equals("d")) {} break; case 101:  if (str1.equals("e")) {} break; case 102:  if (str1.equals("f")) {} break; case 103:  if (str1.equals("g")) {} break; case 104:  if (str1.equals("h")) {} break; case 105:  if (str1.equals("i")) {} break; case 106:  if (str1.equals("j")) {} break; case 107:  if (str1.equals("k")) {} break; case 108:  if (str1.equals("l")) {} break; case 109:  if (str1.equals("m")) {} break; case 110:  if (str1.equals("n")) {} break; case 111:  if (str1.equals("o")) {} break; case 112:  if (str1.equals("p")) {} break; case 113:  if (str1.equals("q")) break; break; case 114:  if (str1.equals("r")) {} break; case 115:  if (str1.equals("s")) {} break; case 116:  if (str1.equals("t")) {} break; case 117:  if (str1.equals("u")) {} break; case 118:  if (str1.equals("v")) {} break; case 119:  if (str1.equals("w")) {} break; case 120:  if (str1.equals("x")) {} break; case 121:  if (str1.equals("y")) {} break; case 122:  if (!str1.equals("z"))
      {
        return;keys1[0].doClick();
        sound('Q');
        return;
        
        keys1[1].doClick();
        sound('W');
        return;
        
        keys1[2].doClick();
        sound('E');
        return;
        
        keys1[3].doClick();
        sound('R');
        return;
        
        keys1[4].doClick();
        sound('T');
        return;
        
        keys1[5].doClick();
        sound('Y');
        return;
        
        keys1[6].doClick();
        sound('U');
        return;
        
        keys1[7].doClick();
        sound('I');
        return;
        
        keys1[8].doClick();
        sound('O');
        return;
        
        keys1[9].doClick();
        sound('P');
        return;
        
        keys2[0].doClick();
        sound('A');
        return;
        
        keys2[1].doClick();
        sound('S');
        return;
        
        keys2[2].doClick();
        sound('D');
        return;
        
        keys2[3].doClick();
        sound('F');
        return;
        
        keys2[4].doClick();
        sound('G');
        return;
        
        keys2[5].doClick();
        sound('H');
        return;
        
        keys2[6].doClick();
        sound('J');
        return;
        
        keys2[7].doClick();
        sound('K');
        return;
        
        keys2[8].doClick();
        sound('L');
      }
      else {
        keys3[0].doClick();
        sound('Z');
        return;
        
        keys3[1].doClick();
        sound('X');
        return;
        
        keys3[2].doClick();
        sound('C');
        return;
        
        keys3[3].doClick();
        sound('V');
        return;
        
        keys3[4].doClick();
        sound('B');
        return;
        
        keys3[5].doClick();
        sound('N');
        return;
        
        keys3[6].doClick();
        sound('M');
      }
      

      break;
    }
    
  }
  

  public void keyReleased(KeyEvent arg0) {}
  

  public void keyTyped(KeyEvent arg0) {}
  

  public void sound(char letter)
  {
    try
    {
      URL url = getClass().getResource("sound/letter" + letter + ".wav");
      AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
      clip = AudioSystem.getClip();
      clip.open(audioIn);
      clip.start();
    }
    catch (Exception g) {
      JOptionPane.showMessageDialog(null, "There was an error loading the sound!");
    }
  }
}