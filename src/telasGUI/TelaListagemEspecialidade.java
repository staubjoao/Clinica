package telasGUI;

import controle.ControleEspecialidade;
import entidade.Especialidade;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TelaListagemEspecialidade extends javax.swing.JInternalFrame {

    public TelaListagemEspecialidade() {
        initComponents();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    public void popularTabela() {
        ArrayList<Especialidade> especialidades = new ArrayList();
        ControleEspecialidade controle = new ControleEspecialidade();
        especialidades = controle.listar();

        DefaultTableModel tabela = (DefaultTableModel) jTableEspecialidades.getModel();

        for (Especialidade i : especialidades) {
            Object[] o = {i.getIdEspecialidade(), i.getNome()};
            tabela.addRow(o);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Especialidade", "Especialidade"
            }
        ));
        jScrollPane3.setViewportView(jTableEspecialidades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 406, 323);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableEspecialidades;
    // End of variables declaration//GEN-END:variables
}
