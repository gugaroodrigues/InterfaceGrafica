
package exemplo07;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.text.Text;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

/**
 *
 * @author Gustavo
 */
public class ExemploJRadioButton01 {
    private JFrame jFrame;
    private JLabel jLabelCor;
    private JRadioButton
            jRadioButtonCorPreto,
            jRadioButtonCorBranco,
            jRadioButtonCorFuschia,
            jRadioButtonCorRose;
    private ButtonGroup buttongroupCor;
    private JButton jButtonSalvar, jButtonLimparSlecao;
    
    
    
            
    
    public ExemploJRadioButton01(){
        gerarTela();
        instanciarComponentees();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        definirRadioParaButtonGroup();
        adicionarAcao();
        estilizarRadionButton();
        jFrame.setVisible(true);
        }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    private void instanciarComponentees() {
        jLabelCor = new JLabel("Cor");
        jRadioButtonCorBranco = new JRadioButton();
        jRadioButtonCorBranco.setText("Branco");
        jRadioButtonCorFuschia = new JRadioButton();
        jRadioButtonCorFuschia.setText("Fushia");
        jRadioButtonCorPreto = new JRadioButton("Preto");
        jRadioButtonCorRose = new JRadioButton("Rose");
        buttongroupCor = new ButtonGroup();
        jButtonSalvar = new JButton("Salvar");
        jButtonLimparSlecao = new JButton("Limpar");
        }
    private void definirRadioParaButtonGroup(){
        buttongroupCor.add(jRadioButtonCorRose);
        buttongroupCor.add(jRadioButtonCorPreto);
        buttongroupCor.add(jRadioButtonCorBranco);
        buttongroupCor.add(jRadioButtonCorFuschia);
        
    }

    private void gerarDimensoes() {
        jLabelCor.setSize(40, 20);
        jRadioButtonCorBranco.setSize(100, 20);
        jRadioButtonCorFuschia.setSize(100, 20);
        jRadioButtonCorPreto.setSize(100, 20);
        jRadioButtonCorRose.setSize(100, 20);
        jButtonLimparSlecao.setSize(120, 20);
        jButtonSalvar.setSize(120, 20);
        
    }

    private void gerarLocalizacoes() {
        jLabelCor.setLocation(10, 10);
        jRadioButtonCorPreto.setLocation(10, 35);
        jRadioButtonCorBranco.setLocation(10, 60);
        jRadioButtonCorFuschia.setLocation(10, 85);
        jRadioButtonCorRose.setLocation(10,110);
        jButtonLimparSlecao.setLocation(10, 135);
        jButtonSalvar.setLocation(135, 135);
        
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelCor);
        jFrame.add(jRadioButtonCorBranco);
        jFrame.add(jRadioButtonCorFuschia);
        jFrame.add(jRadioButtonCorPreto);
        jFrame.add(jRadioButtonCorRose);
        jFrame.add(jButtonLimparSlecao);
        jFrame.add(jButtonSalvar);
    }
    
    private void adicionarAcao(){
        jButtonLimparSlecao.addActionListener(
            new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                buttongroupCor.clearSelection();
                definirCorDeTexto("#000000");
                jFrame.getContentPane().setBackground(
                        UIManager.getColor("Frame.background"));
            }
        });
        
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (jRadioButtonCorBranco.isSelected()){
                    jFrame.getContentPane().setBackground(Color.WHITE);
                    definirCorDeTexto(("#000000"));
                }else if (jRadioButtonCorFuschia.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#FF00FF"));
                    definirCorDeTexto("#000000");
                }else if (jRadioButtonCorPreto.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#000000"));
                    definirCorDeTexto("#FFFFFF");
                }else if (jRadioButtonCorRose.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#FF009D"));
                    definirCorDeTexto("#FFFFFF");
                    
                }
            }
        });
    }
    
    private void definirCorDeTexto(String cor){
        jRadioButtonCorBranco.setForeground(Color.decode(cor));
        jRadioButtonCorFuschia.setForeground(Color.decode(cor));
        jRadioButtonCorPreto.setForeground(Color.decode(cor));
        jRadioButtonCorRose.setForeground(Color.decode(cor));
    }
    
    private void estilizarRadionButton(){
        jRadioButtonCorBranco.setContentAreaFilled(false);
        jRadioButtonCorFuschia.setContentAreaFilled(false);
        jRadioButtonCorPreto.setContentAreaFilled(false);
        jRadioButtonCorRose.setContentAreaFilled(false);
    }
    
   
     
    
}
