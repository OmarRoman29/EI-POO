package Vista.Forms;

import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Controlador.EventListener;
import Modelo.Entidad.Muestra;
import Modelo.Entidad.Norma;
import Modelo.Entidad.Parametro;
import Modelo.Entidad.Prueba;
import Modelo.Entidad.Signatario;
import Modelo.Repositorio.RepositorioNorma;
import Modelo.Repositorio.RepositorioParametro;
import Modelo.Repositorio.RepositorioPrueba;
import Vista.Extras.VentanaUtils;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author rubenor
 */
public class PruebasPorSignatario extends javax.swing.JFrame implements EventListener {
    private VentanaUtils utils;
    private boolean ventanaPrincial;
    private boolean buscandoMuestra;
    private Signatario sesion;
    private Muestra muestra;
    private List<Parametro> parametros;
    private HashMap<String, List<Prueba>> pruebas;
    private List<Prueba> emptyPruebas = new ArrayList<>();
    private List<Muestra> emptyMuestras = new ArrayList<>();

    private RepositorioParametro repoParam = new RepositorioParametro();
    private RepositorioPrueba repoPrueba = new RepositorioPrueba();
    private RepositorioNorma repoNorma = new RepositorioNorma();
    private static PruebasPorSignatario instancia;

    public static PruebasPorSignatario getInstancia(){
        if(PruebasPorSignatario.instancia == null){
            PruebasPorSignatario.instancia = new PruebasPorSignatario();
        }

        return PruebasPorSignatario.instancia;
    }

    private PruebasPorSignatario() {
        BuscadorMuestras.getInstancia().subscribe(this);
        this.buscandoMuestra = false;
        this.utils = new VentanaUtils(this);
        utils.centrarEnPantalla();
        initComponents();
        
        // Agregar WindowListener para capturar el evento de cierre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarVentana();
            }
        });
    }

    @Override
    public void update(String eventType, Object obj) {
        if (!buscandoMuestra)
            return;

        switch (eventType) {
            case BuscadorMuestras.EVENTO_BUSQUEDA:
                this.muestra = (Muestra) obj;
                this.muestraLbl.setText(muestra.toString());
                buscandoMuestra = false;
                break;

            default:
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        volverBtn1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        parametroCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        parametroCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametroCboxActionPerformed(evt);
            }
        });

        buenDiaLbl.setText("Buen día [Usuario]");

        jLabel2.setText("Parámetro");

        pruebasTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prueba"
            }
        ));
        pruebasTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pruebasTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pruebasTB);

        normaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Norma");

        continuarBtn.setText("Continuar");
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });

        muestraLbl.setText("Muestra: [Ninguna]");

        selMuestraBtn.setText("Seleccionar muestra");
        selMuestraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selMuestraBtnActionPerformed(evt);
            }
        });

        volverBtn1.setText("Volver");
        volverBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(normaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continuarBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(volverBtn1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(buenDiaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(parametroCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(muestraLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(selMuestraBtn)))))
                                .addGap(9, 9, 9)))
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(volverBtn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buenDiaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(muestraLbl)
                    .addComponent(selMuestraBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(parametroCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normaCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(continuarBtn))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        
    }//GEN-LAST:event_continuarBtnActionPerformed

    private void volverBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtn1ActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_volverBtn1ActionPerformed

    private void pruebasTBMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pruebasTBMouseClicked
        int index = pruebasTB.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Se debe elegir una prueba",
                    "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String parametro = parametros.get(parametroCbox.getSelectedIndex() - 1).nombre;
        Prueba prueba = this.pruebas.get(parametro).get(index);
        try {
            List<Norma> normas = repoNorma.getNormaByPrueba(prueba.idPrueba);
            loadNormas(normas);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.toString(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

    }// GEN-LAST:event_pruebasTBMouseClicked

    private void selMuestraBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_selMuestraBtnActionPerformed
        this.buscandoMuestra = true;
        BuscadorMuestras menu = BuscadorMuestras.getInstancia();
        menu.setModo(BuscadorMuestras.MODO_BUSQUEDA);
        menu.preparar();
        menu.show();
    }// GEN-LAST:event_selMuestraBtnActionPerformed

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

    private void loadNormas(List<Norma> list) throws Exception {
        String[] normas = new String[list.size() + 1];
        normas[0] = "";

        int i = 1;
        for (Norma n : list) {
            normas[i] = n.norma;
            i++;
        }

        normaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(normas));
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
    private javax.swing.JButton volverBtn1;
    // End of variables declaration//GEN-END:variables

    public void preparar(Signatario s) {
        sesion = s;
        muestra = null;
        pruebas = null;
        buenDiaLbl.setText("Buen día " + s.primNombre + " " + s.segNombre);
        muestraLbl.setText("Muestra: No seleccionado");
        this.utils.centrarEnPantalla();

        switch (s.posicion) {
            case Signatario.POSICION_PRUEBAS:
            case Signatario.POSICION_SINDICALIZADO:
                this.ventanaPrincial = true;
                break;
            case Signatario.POSICION_MUESTREO:
            case Signatario.POSICION_DIRECCION:
                this.ventanaPrincial = false;
                break;
            default:
                break;
        }

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
    
    public void cerrarVentana(){
        this.buscandoMuestra = false;
        this.hide();

        if(this.ventanaPrincial){
            System.exit(0);
        }else{
            dispose();
        }
    }
}
