
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
    

    @Override
    public void gerarTela() {
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
    }

    @Override
    public void instanciarComponentes() {
        jButton00 = new JButton("Exemplo00");
        jButton01 = new JButton("Exemplo01");
        jButton02 = new JButton("Exemplo02");
        jButton03 = new JButton("Exemplo03");
        jButton04 = new JButton("Exemplo04");
        jButton05 = new JButton("Exemplo05");
        jButton06 = new JButton("Exemplo06");
        jButton07 = new JButton("Exemplo07");
        jButton08 = new JButton("Exemplo08");
        jButton09 = new JButton("Exemplo09");

    }

    @Override
    public void gerarLocalizacao() {
    }

    @Override
    public void gerarDimensoes() {
    }

    public void acaoJButton00() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new exemplo07.ExemploJRadioButton01Principal();
            }
        });
    }

    public void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }


    public void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton07() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton08() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public void acaoJButton09() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

}
