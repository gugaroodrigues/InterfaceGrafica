
package exemplo11;

import exemplo08.JFrameBaseInterface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gus
 */
public class ExemploJFrameKeyPressed implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JTextField jTextFieldNumero;  
    
    public ExemploJFrameKeyPressed(){
        gerarTela();
        instanciarComponentes();
        gerarLocalizacao();
        gerarDimensoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("JFrame KeyPressed");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldNumero);
    }

    @Override
    public void instanciarComponentes() {
        jTextFieldNumero = new JTextField();
    }

    @Override
    public void gerarLocalizacao() {
        jTextFieldNumero.setLocation(10, 10);
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNumero.setSize(100, 20);
    }
    
    public void adicionarKeyPressed(){
        jTextFieldNumero.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
               switch (e.getKeyCode()){
                    case KeyEvent.VK_ENTER:
                       JOptionPane.showMessageDialog(null, "Viva");
                       break;
                    case KeyEvent.VK_UP:
                        JOptionPane.showMessageDialog(null, "CIMA");
                        break;
                    case KeyEvent.VK_DOWN:
                        JOptionPane.showMessageDialog(null, "BAIXO");
                        break;
                    case KeyEvent.VK_RIGHT:
                        JOptionPane.showMessageDialog(null, "DIREITA");
                        break;
                    case KeyEvent.VK_LEFT:
                        JOptionPane.showMessageDialog(null, "ESQUERDA");
                        break;
                    
                    case KeyEvent.VK_F10:
                        jTextFieldNumero.setSelectedTextColor(Color.red);
                        jTextFieldNumero.setSelectionStart(0);
                        jTextFieldNumero.setSelectionEnd(jTextFieldNumero
                        .getText().length());
                        break;
                    
                    case KeyEvent.VK_F11:
                        jTextFieldNumero.setCaretPosition(0);
                        break;
                    
                    case KeyEvent.VK_F12:
                        jTextFieldNumero.setCaretPosition(
                        jTextFieldNumero.getText().length());
                        break;
                    
               }
                       
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    
}
