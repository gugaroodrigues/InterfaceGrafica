/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo10;

import exemplo08.JFrameBaseInterface;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Alunos
 */
public class ExemploHospitalJFrame implements JFrameBaseInterface {
    
    private int linhaSelecionada = -1;
    private JFrame jFrame;
    private JTextField jTextFieldNome, jTextFieldRendaAnual, jTextFieldAno;
    private JFormattedTextField jFormattedTextFieldCNPJ;
    private JComboBox jComboBoxCategoria;
    private JCheckBox jCheckBoxPrivado;
    private JLabel jLabelAno, jLabelNome, jLabelCnpj, jLabelCategoria,
            jLabelRendaAnual;
    private JButton jButtonAdicionar, jButtonEditar, jButtonExcluir;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private DefaultTableModel dtm;
    private ArrayList<Hospital> hospitais = new ArrayList<>();

    public ExemploHospitalJFrame() {
        gerarTela();
        instanciarComponentes();
        gerarLocalizacao();
        gerarDimensoes();
        adicionarComponentes();
        configurarJComboBox();
        configurarJTable();
        configurarJFormattedTextField();
        AcaoAdicionar();
        AcaoEditar();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Hospital para seu momento");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);

    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jTextFieldAno);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldRendaAnual);
        jFrame.add(jComboBoxCategoria);
        jFrame.add(jCheckBoxPrivado);
        jFrame.add(jFormattedTextFieldCNPJ);
        jFrame.add(jLabelAno);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelCategoria);
        jFrame.add(jLabelRendaAnual);
        jFrame.add(jLabelCnpj);
        jFrame.add(jButtonAdicionar);
        jFrame.add(jButtonEditar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jScrollPane);
        
    }

    @Override
    public void instanciarComponentes() {
        jLabelAno = new JLabel("Ano");
        jLabelCategoria = new JLabel("Categoria");
        jLabelCnpj = new JLabel("CNPJ");
        jLabelNome = new JLabel("Nome");
        jLabelRendaAnual = new JLabel("Renda Anual");
        jCheckBoxPrivado = new JCheckBox("Privado");
        jButtonAdicionar = new JButton("Adicionar");
        jButtonEditar = new JButton("Editar");
        jButtonExcluir = new JButton("Excluir");
        jComboBoxCategoria = new JComboBox();
        jFormattedTextFieldCNPJ = new JFormattedTextField();
        jTextFieldAno = new JTextField();
        jTextFieldNome = new JTextField();
        jTextFieldRendaAnual = new JTextField();
        jTable = new JTable();

        jScrollPane = new JScrollPane(jTable);

    }

    private void configurarJComboBox() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Cardiologia");
        modelo.addElement("Endocrinologia");
        modelo.addElement("Emergêcia");
        modelo.addElement("Oncologia");
        modelo.addElement("Pronto Socorro");
        modelo.addElement("Reunomatologia");
        jComboBoxCategoria.setModel(modelo);
        jComboBoxCategoria.setSelectedIndex(- 1);
    }

    @Override
    public void gerarLocalizacao() {
        jLabelNome.setLocation(10, 10);
        jLabelAno.setLocation(10, 60);
        jLabelCategoria.setLocation(10, 160);
        jLabelCnpj.setLocation(10, 110);
        jLabelRendaAnual.setLocation(10, 210);

        jTextFieldNome.setLocation(10, 35);
        jTextFieldAno.setLocation(10, 85);
        jTextFieldRendaAnual.setLocation(10, 235);
        jFormattedTextFieldCNPJ.setLocation(10, 135);

        jCheckBoxPrivado.setLocation(10, 160);
        jComboBoxCategoria.setLocation(10, 185);

        jButtonAdicionar.setLocation(10, 285);
        jButtonEditar.setLocation(265, 10);
        jButtonExcluir.setLocation(370, 10);

        jScrollPane.setLocation(170, 35);

    }

    @Override
    public void gerarDimensoes() {
        jLabelNome.setSize(150, 20);
        jLabelAno.setSize(150, 20);
        jLabelCategoria.setSize(150, 20);
        jLabelCnpj.setSize(150, 20);
        jLabelRendaAnual.setSize(150, 20);

        jTextFieldNome.setSize(150, 20);
        jTextFieldAno.setSize(150, 20);
        jTextFieldRendaAnual.setSize(150, 20);
        jFormattedTextFieldCNPJ.setSize(150, 20);

        jCheckBoxPrivado.setSize(150, 20);
        jComboBoxCategoria.setSize(150, 20);

        jButtonAdicionar.setSize(100, 20);
        jButtonEditar.setSize(100, 20);
        jButtonExcluir.setSize(100, 20);

        jScrollPane.setSize(300, 400);

    }

    private void configurarJFormattedTextField() {

        try {
            MaskFormatter maskFormatter = new MaskFormatter("##.###.###/####-##");
            maskFormatter.install(jFormattedTextFieldCNPJ);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Chame o prog");
        }
    }

    private void configurarJTable() {
        dtm = new DefaultTableModel();
        dtm.addColumn("Nome");
        dtm.addColumn("CNPJ");
        dtm.addColumn("Renda Anual");
        jTable.setModel(dtm);

    }
    
    private void AcaoAdicionar(){
        jButtonAdicionar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Hospital hospital = new Hospital();
                hospital.setNome(jTextFieldNome.getText());
                hospital.setCnpj(jFormattedTextFieldCNPJ.getText());
                hospital.setRendaAnual(Double.parseDouble(
                   jTextFieldRendaAnual.getText()
                ));
                hospital.setAno(Short.parseShort(
                   jTextFieldAno.getText()
                ));
                hospital.setPrivado(jCheckBoxPrivado.isSelected());
                hospital.setCategoria(
                   jComboBoxCategoria.getSelectedItem().toString()
                );
                if(linhaSelecionada == - 1){
                hospitais.add(hospital);
                dtm.addRow(new Object[]{
                    hospital.getNome(),
                    hospital.getCnpj(),
                    hospital.getRendaAnual()
                });
                }else{
                    hospitais.set(linhaSelecionada, hospital);
                    dtm.setValueAt(hospital.getNome(), linhaSelecionada, 0);
                    dtm.setValueAt(hospital.getCnpj(), linhaSelecionada, 1);
                    dtm.setValueAt(hospital.getRendaAnual(), linhaSelecionada, 2);
                }
                limparCampos();
                
                
            }

            
        });
    }
    private void limparCampos() {
                jTextFieldAno.setText("");
                jTextFieldNome.setText("");
                jTextFieldRendaAnual.setText("");
                jCheckBoxPrivado.setSelected(false);
                jComboBoxCategoria.setSelectedIndex(-1);
                jFormattedTextFieldCNPJ.setText("");
                jTextFieldNome.requestFocus();
                linhaSelecionada = -1;
            }
    
    private void AcaoEditar(){
       jButtonEditar.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
               linhaSelecionada = jTable.getSelectedRow();
               Hospital hospital = hospitais.get(linhaSelecionada);
               preencherCampos(hospital);
               
           }

       });
    }
    private void preencherCampos(Hospital hospital) {
               jTextFieldNome.setText(hospital.getNome());
               jTextFieldAno.setText(
                  String.valueOf(hospital.getAno())
               );
               jTextFieldRendaAnual.setText(
                  String.valueOf(hospital.getRendaAnual())
               );
               jComboBoxCategoria.setSelectedItem(
                  hospital.getCategoria());
               jCheckBoxPrivado.setSelected(hospital.isPrivado()
               );
               jFormattedTextFieldCNPJ.setText(hospital.getCnpj());
           }
           
          
}


