
import exemplo00.ExemploJFrame01;
import exemplo01.ExemploJButton01;
import exemplo02.ExemploJLabel01;
import exemplo03.ExemploJTextField01;
import exemplo04.ExemploJButton02;
import exemplo05.ExemploJComboBox01;
import exemplo06.ExemploJTextArea;
import exemplo07.ExemploJRadioButton01;
import exemplo08.ExemploCheckBox01;
import exemplo08.JFrameBaseInterface;
import exemplo09.ExemploJTable01;
import exemplo10.ExemploHospitalJFrame;
import exemplo11.ExemploJFrameKeyPressed;
import exemplo08.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class ExemploTudo implements JFrameBaseInterface {

    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    private JButton jButton10;
    private JButton jButton11;

    public ExemploTudo() {
        gerarTela();
        instanciarComponentes();
        gerarLocalizacao();
        gerarDimensoes();
        acaoJButton00();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        acaoJButton10();
        acaoJButton11();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Hospital para seu momento");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
        jFrame.add(jButton10);
        jFrame.add(jButton11);
        
    }

    @Override
    public void instanciarComponentes() {
        jButton00 = new JButton("Exemplo 00");
        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");
        jButton10 = new JButton("Exemplo 10");
        jButton11 = new JButton("Exemplo 11");

    }

    @Override
    public void gerarLocalizacao() {
        
        jButton00.setLocation(10, 10);
        jButton01.setLocation(120, 10);
        jButton02.setLocation(230, 10);
        jButton03.setLocation(340, 10);
        jButton04.setLocation(10, 120);
        jButton05.setLocation(120, 120);
        jButton06.setLocation(230, 120);
        jButton07.setLocation(340, 120);
        jButton08.setLocation(10, 230);
        jButton09.setLocation(120, 230);
        jButton10.setLocation(230, 230);
        jButton11.setLocation(340, 230);
        
    }

    @Override
    public void gerarDimensoes() {
        
        jButton00.setSize(100, 100);
        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
        jButton07.setSize(100, 100);
        jButton08.setSize(100, 100);
        jButton09.setSize(100, 100);
        jButton10.setSize(100, 100);
        jButton11.setSize(100, 100);
        
    }

    public void acaoJButton00() {
        jButton00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo00.ExemploJFrame01();

            }
        });
    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo01.ExemploJButton01();
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo02.ExemploJLabel01();
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo03.ExemploJTextField01();
            }
        });
    }

    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo04.ExemploJButton02();
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo05.ExemploJComboBox01();
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo06.ExemploJTextArea();
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo07.ExemploJRadioButton01();
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo08.ExemploCheckBox01();
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo09.ExemploJTable01();
            }
        });
    }

    public void acaoJButton10() {
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo10.ExemploHospitalJFrame();
            }
        });
    }
    public void acaoJButton11() {
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo11.ExemploJFrameKeyPressed();
            }
        });
    }

}
