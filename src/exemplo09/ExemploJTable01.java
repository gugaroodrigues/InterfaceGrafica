/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo09;

import exemplo08.JFrameBaseInterface;
import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class ExemploJTable01 implements JFrameBaseInterface{
    
    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private JScrollPane jScrollPane;
    
    public ExemploJTable01(){
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        jFrame.setVisible(true);
    }


    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jScrollPane);
    }

    @Override
    public void instanciarComponentes() {
        jTable = new JTable();
        jScrollPane = new JScrollPane(jTable);
        //jScrollPane.setViewportView(jTable);
        defaultTableModel = new DefaultTableModel(
        new Object[] {"Nome", "Idade", "Altura"},0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        configurarTableModel();
    }

    private void configurarTableModel() {
        defaultTableModel.addRow(new Object[]{
                "Gustavo", 22, 1.68
        });
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 22, 1.76
        });
        defaultTableModel.addRow(new Object[]{
            "Crispim", 20, 1.75
        });
        jTable.setModel(defaultTableModel);
        
    }
    
    @Override
    public void gerarLocalizacao() {
        jScrollPane.setLocation(10, 10);
    }

    @Override
    public void gerarDimensoes() {
        jScrollPane.setSize(400, 400);
        
    }

    
}
