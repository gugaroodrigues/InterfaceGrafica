
package exemplo06;

import com.sun.org.apache.xerces.internal.util.DOMUtil;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author Gustavo
 */
public class ExemploJTextArea {
    private JFrame jFrame;
    private JTextArea jTextArea;
    private JLabel jLabelDescricao;
    private JScrollPane jScrollPane;
    
    
    public ExemploJTextArea(){
        gerarTela();
        instancicarComponentes();
        gerarDimensoes();
        gerarLocatizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        jFrame.setVisible(true);
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exemplo JTextArea");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instancicarComponentes (){
        jScrollPane = new JScrollPane();
        jTextArea = new JTextArea();
        jLabelDescricao = new JLabel("Decrição");
        jScrollPane.setViewportView(jTextArea);
        
    }
    
    private void gerarDimensoes(){
        jLabelDescricao.setSize(70,20);
        jScrollPane.setSize(450, 410);
    }
    
    private void gerarLocatizacoes(){
        jLabelDescricao. setLocation(10, 10);
        jScrollPane.setLocation(10, 35);
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelDescricao);
        jFrame.add(jScrollPane);
    }
    
    private void configurarJScrollPane(){
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(
            jScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(
            jScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextArea.setLineWrap(true);
    }
    
    
    
}
