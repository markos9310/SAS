/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;




import javax.swing.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexion.ConexionDB;
import javax.swing.table.DefaultTableModel;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;
import java.net.URISyntaxException;




public class principal extends javax.swing.JFrame {
    private WebSocketClient clienteWebSocket;
    private int idServicio;
    public principal(String nombreyarea) {
        FlatMacDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        txtAgente.setText(nombreyarea); // Mostrar el nombre del agente y área

        try {
            clienteWebSocket = new WebSocketClient(new URI("ws://localhost:8080")) {
                @Override
                public void onOpen(ServerHandshake handshakedata) {
                    System.out.println("Conectado al servidor WebSocket");
                }

                @Override
                public void onMessage(String message) {
                    System.out.println("Mensaje recibido: " + message);
                    if (message.equals("ACTUALIZAR")) {
                        // Llamar al método para recargar las interacciones
                        System.out.println("Recargando interacciones con idServicio: " + idServicio);
                        recargarInteracciones(idServicio); // Usar idServicio aquí
                    }
                }



                @Override
                public void onClose(int code, String reason, boolean remote) {
                    System.out.println("Desconectado del servidor WebSocket");
                }

                @Override
                public void onError(Exception ex) {
                    System.out.println("Error en WebSocket: " + ex.getMessage());
                    ex.printStackTrace();
                }
            };
            clienteWebSocket.connect();
        } catch (URISyntaxException e) {
            System.out.println("Error en URI: " + e.getMessage());
            
            e.printStackTrace();
        }
    }
    public void recargarInteracciones(int idServicio) {
        System.out.println("Recargando interacciones desde recargarInteracciones con idServicio: " + idServicio);
        cargarInteracciones(idServicio); // Llama al método existente para cargar las interacciones
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEncabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAgente = new javax.swing.JLabel();
        cmbIdentificador = new javax.swing.JComboBox<>();
        txtIdentificador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlDatosCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlDatosCliente_lblNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pnlDatosCliente_lblDni = new javax.swing.JLabel();
        pnlDatosCliente_lblId = new javax.swing.JLabel();
        pnlDatosCliente_lblTelefono = new javax.swing.JLabel();
        pnlDatosCliente_lblEmail = new javax.swing.JLabel();
        pnlDomicilioFacturacion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblCalle = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblNumeroCasa = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblInterior = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblUrb = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblDistrito = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblProvincia = new javax.swing.JLabel();
        pnlDomicilioFacturacion_lblDepartamento = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        lblIdServicio = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblTipoServicio = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblEstadoServicio = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblFechaContrato = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        lblFechaCancelacion = new javax.swing.JLabel();
        pnlDireccionInstalacion = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblCalle = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblNumeroCasa = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblInterior = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblUrb = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblDistrito = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblProvincia = new javax.swing.JLabel();
        pnlDireccionInstalacion_lblDepartamento = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInteracciones = new javax.swing.JTable();
        btnNuevaInteraccion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));

        pnlEncabezado.setPreferredSize(new java.awt.Dimension(821, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-autonoma.png"))); // NOI18N

        txtAgente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAgente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user14.png"))); // NOI18N
        txtAgente.setText("Roy Markos Huayta Laura [Atención al cliente]");
        txtAgente.setName(""); // NOI18N

        cmbIdentificador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbIdentificador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "ID CLIENTE", "ID SERVICIO" }));

        txtIdentificador.setMargin(new java.awt.Insets(6, 6, 2, 6));

        btnBuscar.setBackground(new java.awt.Color(15, 130, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(15, 130, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eraser.png"))); // NOI18N

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 801, Short.MAX_VALUE)
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEncabezadoLayout.createSequentialGroup()
                        .addComponent(cmbIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAgente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlEncabezado, java.awt.BorderLayout.PAGE_START);

        pnlDatosCliente.setBackground(new java.awt.Color(40, 40, 40));
        pnlDatosCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true));

        jLabel3.setBackground(new java.awt.Color(40, 40, 40));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Datos del cliente");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(12, 85, 195)));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");

        pnlDatosCliente_lblNombre.setText("ROY MARKOS HUAYTA LAURA");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("DNI/RUC");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tel. Referencia");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Email");

        pnlDatosCliente_lblDni.setText("48322105");

        pnlDatosCliente_lblId.setText("2231892118");

        pnlDatosCliente_lblTelefono.setText("985925608");

        pnlDatosCliente_lblEmail.setText("MARKOS9310@GMAIL.COM");

        javax.swing.GroupLayout pnlDatosClienteLayout = new javax.swing.GroupLayout(pnlDatosCliente);
        pnlDatosCliente.setLayout(pnlDatosClienteLayout);
        pnlDatosClienteLayout.setHorizontalGroup(
            pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(67, 67, 67)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosCliente_lblNombre)
                    .addComponent(pnlDatosCliente_lblDni)
                    .addComponent(pnlDatosCliente_lblId)
                    .addComponent(pnlDatosCliente_lblTelefono)
                    .addComponent(pnlDatosCliente_lblEmail))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlDatosClienteLayout.setVerticalGroup(
            pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pnlDatosCliente_lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pnlDatosCliente_lblDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pnlDatosCliente_lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pnlDatosCliente_lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(pnlDatosCliente_lblEmail))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pnlDomicilioFacturacion.setBackground(new java.awt.Color(40, 40, 40));
        pnlDomicilioFacturacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 40, 40), 1, true));

        jLabel10.setBackground(new java.awt.Color(40, 40, 40));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Domicilio de Facturación");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(12, 85, 195)));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Calle/Avenida");

        pnlDomicilioFacturacion_lblCalle.setText("VILLA UNIÓN");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("N° Casa/Edificio");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Dep./Int.");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Urbanización");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Distrito");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Provincia");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Departamento");

        pnlDomicilioFacturacion_lblNumeroCasa.setText("MZ D LOTE 13");

        pnlDomicilioFacturacion_lblInterior.setText("N/A");

        pnlDomicilioFacturacion_lblUrb.setText("VILLA UNIÓN");

        pnlDomicilioFacturacion_lblDistrito.setText("VILLA MARÍA DEL TRIUNFO");

        pnlDomicilioFacturacion_lblProvincia.setText("LIMA");

        pnlDomicilioFacturacion_lblDepartamento.setText("LIMA");

        javax.swing.GroupLayout pnlDomicilioFacturacionLayout = new javax.swing.GroupLayout(pnlDomicilioFacturacion);
        pnlDomicilioFacturacion.setLayout(pnlDomicilioFacturacionLayout);
        pnlDomicilioFacturacionLayout.setHorizontalGroup(
            pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDomicilioFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDomicilioFacturacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(60, 60, 60)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDomicilioFacturacion_lblDepartamento)
                    .addComponent(pnlDomicilioFacturacion_lblProvincia)
                    .addComponent(pnlDomicilioFacturacion_lblDistrito)
                    .addComponent(pnlDomicilioFacturacion_lblUrb)
                    .addComponent(pnlDomicilioFacturacion_lblInterior)
                    .addComponent(pnlDomicilioFacturacion_lblNumeroCasa)
                    .addComponent(pnlDomicilioFacturacion_lblCalle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDomicilioFacturacionLayout.setVerticalGroup(
            pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDomicilioFacturacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pnlDomicilioFacturacion_lblCalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pnlDomicilioFacturacion_lblNumeroCasa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pnlDomicilioFacturacion_lblInterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pnlDomicilioFacturacion_lblUrb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pnlDomicilioFacturacion_lblDistrito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pnlDomicilioFacturacion_lblProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDomicilioFacturacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(pnlDomicilioFacturacion_lblDepartamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Id. Servicio");

        lblIdServicio.setText("1234567890");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Tipo:");

        lblTipoServicio.setText("Internet FTTH");

        lblVelocidad.setText("500 MBPS");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Velocidad:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Estado:");

        lblEstadoServicio.setText("Activo");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Fecha de contratación:");

        lblFechaContrato.setText("2023-10-21 08:05:00 ");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setText("Fecha de cancelación:");

        lblFechaCancelacion.setText("2023-10-21 08:05:00 ");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setText("Dirección de instalación");
        jLabel56.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(12, 85, 195)));
        jLabel56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel56.setOpaque(true);

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Calle/Avenida");

        pnlDireccionInstalacion_lblCalle.setText("VILLA UNIÓN");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("N° Casa/Edificio");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Dep./Int.");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Urbanización");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Distrito");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Provincia");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("Departamento");

        pnlDireccionInstalacion_lblNumeroCasa.setText("MZ D LOTE 13");

        pnlDireccionInstalacion_lblInterior.setText("N/A");

        pnlDireccionInstalacion_lblUrb.setText("VILLA UNIÓN");

        pnlDireccionInstalacion_lblDistrito.setText("VILLA MARÍA DEL TRIUNFO");

        pnlDireccionInstalacion_lblProvincia.setText("LIMA");

        pnlDireccionInstalacion_lblDepartamento.setText("LIMA");

        javax.swing.GroupLayout pnlDireccionInstalacionLayout = new javax.swing.GroupLayout(pnlDireccionInstalacion);
        pnlDireccionInstalacion.setLayout(pnlDireccionInstalacionLayout);
        pnlDireccionInstalacionLayout.setHorizontalGroup(
            pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addGap(60, 60, 60)
                .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                        .addComponent(pnlDireccionInstalacion_lblUrb)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDireccionInstalacion_lblInterior)
                            .addComponent(pnlDireccionInstalacion_lblNumeroCasa)
                            .addComponent(pnlDireccionInstalacion_lblCalle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64))
                        .addGap(60, 60, 60)
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDireccionInstalacion_lblDepartamento)
                            .addComponent(pnlDireccionInstalacion_lblProvincia)
                            .addComponent(pnlDireccionInstalacion_lblDistrito))
                        .addGap(107, 107, 107))))
        );
        pnlDireccionInstalacionLayout.setVerticalGroup(
            pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel57)
                            .addComponent(pnlDireccionInstalacion_lblCalle))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(pnlDireccionInstalacion_lblNumeroCasa))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(pnlDireccionInstalacion_lblInterior)))
                    .addGroup(pnlDireccionInstalacionLayout.createSequentialGroup()
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(pnlDireccionInstalacion_lblDistrito))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(pnlDireccionInstalacion_lblProvincia))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(pnlDireccionInstalacion_lblDepartamento))))
                .addGap(18, 18, 18)
                .addGroup(pnlDireccionInstalacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(pnlDireccionInstalacion_lblUrb))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39))
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFechaCancelacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstadoServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIdServicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlDireccionInstalacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblIdServicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblTipoServicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(lblVelocidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lblEstadoServicio))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(lblFechaContrato))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lblFechaCancelacion))
                .addGap(42, 42, 42)
                .addComponent(pnlDireccionInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATOS DEL SERVICIO", jPanel5);

        tblInteracciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id. Inter.", "Fecha Inicio", "Tipo de interacción", "Estado", "Id. Empleado", "Nombre agente", "Área asignada"
            }
        ));
        tblInteracciones.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblInteracciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblInteracciones.setRowHeight(30);
        jScrollPane1.setViewportView(tblInteracciones);
        if (tblInteracciones.getColumnModel().getColumnCount() > 0) {
            tblInteracciones.getColumnModel().getColumn(0).setMaxWidth(70);
            tblInteracciones.getColumnModel().getColumn(1).setMinWidth(120);
            tblInteracciones.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblInteracciones.getColumnModel().getColumn(2).setMinWidth(200);
            tblInteracciones.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblInteracciones.getColumnModel().getColumn(3).setMinWidth(70);
            tblInteracciones.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblInteracciones.getColumnModel().getColumn(4).setMinWidth(30);
            tblInteracciones.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        btnNuevaInteraccion.setBackground(new java.awt.Color(15, 130, 255));
        btnNuevaInteraccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNuevaInteraccion.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaInteraccion.setText("Nueva Interacción");
        btnNuevaInteraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaInteraccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNuevaInteraccion)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnNuevaInteraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INTERACCIONES", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDomicilioFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(pnlDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDomicilioFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu2.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");

        jMenu4.setText("jMenu4");

        jMenuItem3.setText("jMenuItem3");
        jMenu4.add(jMenuItem3);

        jMenu3.add(jMenu4);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("jMenu1");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaInteraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaInteraccionActionPerformed
        int idServicio = Integer.parseInt(lblIdServicio.getText());
        String dniCliente = pnlDatosCliente_lblDni.getText();
        String nombreCliente = pnlDatosCliente_lblNombre.getText();
        String agenteYArea = txtAgente.getText();

        nueva_interaccion nuevaInteraccion = new nueva_interaccion(this, idServicio, dniCliente, nombreCliente, agenteYArea);
        nuevaInteraccion.setLocationRelativeTo(null);
        nuevaInteraccion.setVisible(true);
    }//GEN-LAST:event_btnNuevaInteraccionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPorDNI();
    }//GEN-LAST:event_btnBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
   

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal("Agente Desconocido").setVisible(true);
                
            }
        });
    }
    
 private void buscarPorDNI() {
    String dni = txtIdentificador.getText();
    if (dni.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.");
        return;
    }

    try (Connection conexion = ConexionDB.getConnection()) {
        String query = "SELECT * FROM Cliente WHERE dni_cliente = ?";
        PreparedStatement pstmt = conexion.prepareStatement(query);
        pstmt.setString(1, dni);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            String nombreCliente = rs.getString("nombre_cliente"); // Asegúrate de definir nombreCliente aquí

            List<Servicio> servicios = obtenerServiciosPorDNI(dni);
            if (servicios.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron servicios para el DNI ingresado.");
            } else {
                // Ahora llamamos a mostrarDlgSeleccionarServicio con nombreCliente y dni
                mostrarDlgSeleccionarServicio(servicios, nombreCliente, dni);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    private List<Servicio> obtenerServiciosPorDNI(String dni) {
    List<Servicio> servicios = new ArrayList<>();

    String query = "SELECT id_servicio, tipo_servicio, CONCAT(avenida_servicio, ' ', num_casa_servicio, ' ', interior_servicio, ' ', urbanizacion_servicio, ' ', distrito_servicio, ' ', provincia_servicio, ' ', departamento_servicio) AS direccion_servicio, estado_servicio, fecha_inicio_servicio " +
                   "FROM Servicio " +
                   "JOIN Cliente ON Servicio.id_cliente_servicio = Cliente.id_cliente " +
                   "WHERE Cliente.dni_cliente = ?";

    try (Connection connection = ConexionDB.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setString(1, dni);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Servicio servicio = new Servicio();
            servicio.setIdServicio(resultSet.getInt("id_servicio"));
            servicio.setTipoServicio(resultSet.getString("tipo_servicio"));
            servicio.setDireccionServicio(resultSet.getString("direccion_servicio"));
            servicio.setEstado(resultSet.getString("estado_servicio"));
            servicio.setFechaContratacion(resultSet.getDate("fecha_inicio_servicio"));
            servicios.add(servicio);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return servicios;
}
   // Método para mostrar el diálogo con los servicios
private void mostrarDlgSeleccionarServicio(List<Servicio> servicios, String nombreCliente, String dniCliente) {
    dlgSeleccionarServicio dialog = new dlgSeleccionarServicio(this, true, nombreCliente, dniCliente);

    JTable tblSeleccionServicio = dialog.getTblSeleccionServicio();
    DefaultTableModel model = (DefaultTableModel) tblSeleccionServicio.getModel();

    model.setRowCount(0);

    for (Servicio servicio : servicios) {
        model.addRow(new Object[]{
            servicio.getIdServicio(),
            servicio.getTipoServicio(),
            servicio.getDireccionServicio(),
            servicio.getEstado(),
            servicio.getFechaContratacion()
        });
    }
    
    dialog.setLocationRelativeTo(null);
    dialog.setVisible(true);
    
} 


void actualizarDatosPrincipal(int idServicio) {
    try (Connection conexion = ConexionDB.getConnection()) {
        // Consultar el cliente
        String queryCliente = "SELECT * FROM Cliente WHERE id_cliente = (SELECT id_cliente_servicio FROM Servicio WHERE id_servicio = ?)";
        PreparedStatement pstmtCliente = conexion.prepareStatement(queryCliente);
        pstmtCliente.setInt(1, idServicio);
        ResultSet rsCliente = pstmtCliente.executeQuery();

        if (rsCliente.next()) {
            pnlDatosCliente_lblNombre.setText(rsCliente.getString("nombre_cliente"));
            pnlDatosCliente_lblDni.setText(rsCliente.getString("dni_cliente"));
            pnlDatosCliente_lblId.setText(String.valueOf(rsCliente.getInt("id_cliente")));
            pnlDatosCliente_lblTelefono.setText(rsCliente.getString("telefono_cliente"));
            pnlDatosCliente_lblEmail.setText(rsCliente.getString("email_cliente"));
            pnlDomicilioFacturacion_lblCalle.setText(rsCliente.getString("avenida_cliente"));
            pnlDomicilioFacturacion_lblNumeroCasa.setText(rsCliente.getString("num_casa_cliente"));
            pnlDomicilioFacturacion_lblInterior.setText(rsCliente.getString("interior_cliente"));
            pnlDomicilioFacturacion_lblUrb.setText(rsCliente.getString("urbanizacion_cliente"));
            pnlDomicilioFacturacion_lblDistrito.setText(rsCliente.getString("distrito_cliente"));
            pnlDomicilioFacturacion_lblProvincia.setText(rsCliente.getString("provincia_cliente"));
            pnlDomicilioFacturacion_lblDepartamento.setText(rsCliente.getString("departamento_cliente"));
        }

        // Consultar el servicio
        String queryServicio = "SELECT * FROM Servicio WHERE id_servicio = ?";
        PreparedStatement pstmtServicio = conexion.prepareStatement(queryServicio);
        pstmtServicio.setInt(1, idServicio);
        ResultSet rsServicio = pstmtServicio.executeQuery();

        if (rsServicio.next()) {
            lblIdServicio.setText(String.valueOf(rsServicio.getInt("id_servicio")));
            lblTipoServicio.setText(rsServicio.getString("tipo_servicio"));
            lblVelocidad.setText(rsServicio.getString("velocidad_servicio"));
            lblEstadoServicio.setText(rsServicio.getString("estado_servicio"));
            lblFechaContrato.setText(rsServicio.getString("fecha_inicio_servicio"));
            lblFechaCancelacion.setText(rsServicio.getString("fecha_fin_servicio"));
            pnlDireccionInstalacion_lblCalle.setText(rsServicio.getString("avenida_servicio"));
            pnlDireccionInstalacion_lblNumeroCasa.setText(rsServicio.getString("num_casa_servicio"));
            pnlDireccionInstalacion_lblInterior.setText(rsServicio.getString("interior_servicio"));
            pnlDireccionInstalacion_lblUrb.setText(rsServicio.getString("urbanizacion_servicio"));
            pnlDireccionInstalacion_lblDistrito.setText(rsServicio.getString("distrito_servicio"));
            pnlDireccionInstalacion_lblProvincia.setText(rsServicio.getString("provincia_servicio"));
            pnlDireccionInstalacion_lblDepartamento.setText(rsServicio.getString("departamento_servicio"));
        }
        
        // Cargar interacciones en la tabla
        cargarInteracciones(idServicio);

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void cargarInteracciones(int idServicio) {
    System.out.println("Cargando interacciones para idServicio: " + idServicio);
    try (Connection conexion = ConexionDB.getConnection()) {
        String query = "SELECT i.id_interaccion, i.inicio_interaccion, " +
                       "CONCAT(TipoInteraccion.descripcion_tipo, ' - ', ClaseInteraccion.descripcion_clase, ' - ', SubclaseInteraccion.descripcion_subclase) AS tipo_interaccion, " +
                       "i.estado_interaccion, i.id_agente_interaccion, Agente.nombre AS nombre_agente, Area.nombre AS area_nombre " +
                       "FROM Interaccion i " +
                       "JOIN TipoInteraccion ON i.id_tipo_interaccion = TipoInteraccion.id_tipo " +
                       "JOIN ClaseInteraccion ON i.id_clase_interaccion = ClaseInteraccion.id_clase " +
                       "JOIN SubclaseInteraccion ON i.id_subclase_interaccion = SubclaseInteraccion.id_subclase " +
                       "JOIN Agente ON i.id_agente_interaccion = Agente.id_agente " +
                       "JOIN Area ON i.id_area_interaccion = Area.id_area " +
                       "WHERE i.id_servicio_interaccion = ?";

        PreparedStatement pstmt = conexion.prepareStatement(query);
        pstmt.setInt(1, idServicio);
        ResultSet rs = pstmt.executeQuery();
        DefaultTableModel model = (DefaultTableModel) tblInteracciones.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de añadir nuevos datos
        while (rs.next()) {
            System.out.println("Añadiendo interacción a la tabla: " + rs.getInt("id_interaccion"));
            Object[] row = new Object[7]; // Actualizado para 7 columnas
            row[0] = rs.getInt("id_interaccion");
            row[1] = rs.getTimestamp("inicio_interaccion");
            row[2] = rs.getString("tipo_interaccion");
            row[3] = rs.getString("estado_interaccion");
            row[4] = rs.getInt("id_agente_interaccion");
            row[5] = rs.getString("nombre_agente");
            row[6] = rs.getString("area_nombre"); // Nueva columna para el área
            model.addRow(row);
        }
    } catch (SQLException e) {
        System.out.println("Error al cargar interacciones: " + e.getMessage());
        e.printStackTrace();
    }
}







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevaInteraccion;
    private javax.swing.JComboBox<String> cmbIdentificador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEstadoServicio;
    private javax.swing.JLabel lblFechaCancelacion;
    private javax.swing.JLabel lblFechaContrato;
    private javax.swing.JLabel lblIdServicio;
    private javax.swing.JLabel lblTipoServicio;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JPanel pnlDatosCliente;
    private javax.swing.JLabel pnlDatosCliente_lblDni;
    private javax.swing.JLabel pnlDatosCliente_lblEmail;
    private javax.swing.JLabel pnlDatosCliente_lblId;
    private javax.swing.JLabel pnlDatosCliente_lblNombre;
    private javax.swing.JLabel pnlDatosCliente_lblTelefono;
    private javax.swing.JPanel pnlDireccionInstalacion;
    private javax.swing.JLabel pnlDireccionInstalacion_lblCalle;
    private javax.swing.JLabel pnlDireccionInstalacion_lblDepartamento;
    private javax.swing.JLabel pnlDireccionInstalacion_lblDistrito;
    private javax.swing.JLabel pnlDireccionInstalacion_lblInterior;
    private javax.swing.JLabel pnlDireccionInstalacion_lblNumeroCasa;
    private javax.swing.JLabel pnlDireccionInstalacion_lblProvincia;
    private javax.swing.JLabel pnlDireccionInstalacion_lblUrb;
    private javax.swing.JPanel pnlDomicilioFacturacion;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblCalle;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblDepartamento;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblDistrito;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblInterior;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblNumeroCasa;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblProvincia;
    private javax.swing.JLabel pnlDomicilioFacturacion_lblUrb;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JTable tblInteracciones;
    private javax.swing.JLabel txtAgente;
    private javax.swing.JTextField txtIdentificador;
    // End of variables declaration//GEN-END:variables
}
