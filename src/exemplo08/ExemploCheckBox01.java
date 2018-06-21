package exemplo08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class ExemploCheckBox01 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JCheckBox jCheckBoxEuLiOsTermos;
    private JCheckBox jCheckBoxEuAceitoOsTermos;
    private JButton jButtonSalvar, jButtonLimpar;

    public ExemploCheckBox01() {
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        limparSelecao();
        acaoBotalSalvar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jCheckBoxEuLiOsTermos);
        jFrame.add(jCheckBoxEuAceitoOsTermos);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonLimpar);

    }

    @Override
    public void instanciarComponentes() {
        jButtonLimpar = new JButton("Limpar");
        jButtonSalvar = new JButton("Salvar");
        jCheckBoxEuLiOsTermos = new JCheckBox("Eu li os termos");
        jCheckBoxEuAceitoOsTermos = new JCheckBox("Eu Aceito os termos");
    }

    @Override
    public void gerarLocalizacao() {
        jCheckBoxEuLiOsTermos.setLocation(10, 10);
        jCheckBoxEuAceitoOsTermos.setLocation(10, 35);
        jButtonLimpar.setLocation(10, 60);
        jButtonSalvar.setLocation(115, 60);
    }

    @Override
    public void gerarDimensoes() {
        jButtonLimpar.setSize(100, 20);
        jButtonSalvar.setSize(100, 20);
        jCheckBoxEuLiOsTermos.setSize(250, 20);
        jCheckBoxEuAceitoOsTermos.setSize(250, 20);
    }
    
    public void limparSelecao(){
        jButtonLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jCheckBoxEuLiOsTermos.setSelected(false);
                jCheckBoxEuAceitoOsTermos.setSelected(false);            }
        });
    }
    
    public void acaoBotalSalvar(){
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jCheckBoxEuLiOsTermos.isSelected()){
                    JOptionPane.showMessageDialog(null, "Leia os termos");
                    return;
                }
                if (!jCheckBoxEuAceitoOsTermos.isSelected()){
                    JOptionPane.showMessageDialog(null, "Aceite os termos");
                    return;
                }
                JOptionPane.showMessageDialog(null, "Você acaba de vender livros");
            }
        });
    }

}
