package Vista.Forms;

import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Modelo.Entidad.Muestra;
import Modelo.Entidad.Parametro;
import Modelo.Entidad.Prueba;
import Modelo.Entidad.Signatario;
import Modelo.Repositorio.RepositorioParametro;
import Modelo.Repositorio.RepositorioPrueba;
import java.util.ArrayList;

/**
 *
 * @author rubenor
 */
public class PruebasPorSignatario extends javax.swing.JFrame {
        Signatario sesion;
        Muestra muestra;
        List<Parametro> parametros;
        HashMap<String, List<Prueba>> pruebas;
        List<Prueba> emptyPruebas;

        RepositorioParametro repoParam;
        RepositorioPrueba repoPrueba;

        /**
         * Creates new form PruebasPorSignatario
         */
        public PruebasPorSignatario() {
                repoParam = new RepositorioParametro();
                repoPrueba = new RepositorioPrueba();
                emptyPruebas = new ArrayList<>();
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                parametroCbox = new javax.swing.JComboBox<>();
                buenDiaLbl = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                pruebasTB = new javax.swing.JTable();
                normaCbox = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                continuarBtn = new javax.swing.JButton();
                muestraLbl = new javax.swing.JLabel();
                selMuestraBtn = new javax.swing.JToggleButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(153, 255, 255));

                parametroCbox.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                parametroCbox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                parametroCboxActionPerformed(evt);
                        }
                });

                buenDiaLbl.setText("Buen día [Usuario]");

                jLabel2.setText("Parámetro");

                pruebasTB.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Prueba"
                                }));
                jScrollPane1.setViewportView(pruebasTB);

                normaCbox.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                jLabel3.setText("Norma");

                continuarBtn.setText("Continuar");

                muestraLbl.setText("Muestra: [Ninguna]");

                selMuestraBtn.setText("Seleccionar muestra");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(27, 27, 27)
                                                                                                .addComponent(jLabel3)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(normaCbox,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                146,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(continuarBtn))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addContainerGap()
                                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                426,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(16, 16, 16)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(buenDiaLbl,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                158,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                                                .addGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                jLabel2)
                                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                parametroCbox,
                                                                                                                                                                                                                                0,
                                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                                jPanel1Layout
                                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                muestraLbl)
                                                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                selMuestraBtn)))
                                                                                                                                                                                .addGap(9, 9, 9)))))
                                                                                                .addGap(0, 1, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(buenDiaLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                12,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(muestraLbl)
                                                                                .addComponent(selMuestraBtn))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(parametroCbox,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                369,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(normaCbox,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(continuarBtn))
                                                                .addGap(14, 14, 14)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void parametroCboxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_parametroCboxActionPerformed
                try {
                        if (this.pruebas == null) {
                                HashMap<String, List<Prueba>> pruebas = new HashMap<>();
                                for (Parametro parametro : parametros) {
                                        pruebas.put(parametro.nombre, repoPrueba.searchBy(sesion.idSignatario,
                                                        parametro.idParametro));
                                }
                                this.pruebas = pruebas;
                        }

                        int index = this.parametroCbox.getSelectedIndex();
                        if (index == 0) {
                                loadPruebas(emptyPruebas);
                                return;
                        }

                        Parametro p = parametros.get(index - 1);

                        loadPruebas(this.pruebas.get(p.nombre));
                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(
                                        null,
                                        "Error: " + e.toString(),
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                        return;
                }
        }// GEN-LAST:event_parametroCboxActionPerformed

        private void loadPruebas(List<Prueba> list) throws Exception {
                DefaultTableModel model = new DefaultTableModel(
                                new Object[] { "Prueba" }, 0);

                for (Prueba p : list) {
                        Object[] newRow = { p.nombre };
                        model.addRow(newRow);
                }

                pruebasTB.setModel(model);
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel buenDiaLbl;
        private javax.swing.JButton continuarBtn;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel muestraLbl;
        private javax.swing.JComboBox<String> normaCbox;
        private javax.swing.JComboBox<String> parametroCbox;
        private javax.swing.JTable pruebasTB;
        private javax.swing.JToggleButton selMuestraBtn;
        // End of variables declaration//GEN-END:variables

        public void preparar(Signatario s) {
                sesion = s;
                muestra = null;
                pruebas = null;
                buenDiaLbl.setText("Buen día " + s.primNombre + " " + s.segNombre);
                muestraLbl.setText("Muestra: No seleccionado");
                try {
                        parametros = repoParam.searchParametroBySignatario(s.idSignatario);

                        // Llenar Cbox
                        String[] params = new String[parametros.size() + 1];
                        params[0] = "";

                        int i = 1;
                        for (Parametro p : this.parametros) {
                                params[i] = p.nombre;
                                i++;
                        }

                        parametroCbox.setModel(new javax.swing.DefaultComboBoxModel<>(params));
                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(
                                        null,
                                        "Error: " + e.toString(),
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }
}
