package comercialsql;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Diego
 */
public class MProductos {
    String codigo;
    String descripcion;
    String unidadmedida;
    Double saldoInicial;
    Double ingresos;
    Double egresos;
    Double ajustes;
    Double saldoFinal;
    Double costo;
    Double precio;
    String status;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }

    public Double getAjustes() {
        return ajustes;
    }

    public void setAjustes(Double ajustes) {
        this.ajustes = ajustes;
    }

    public Double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(Double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void insertarProducto(JTextField codigo, JTextField descripcion, JComboBox unidadMedida, 
                                 JTextField saldoInicial, JTextField ingresos, JTextField egresos, 
                                 JTextField ajustes, JTextField costo, JTextField precio, 
                                 JComboBox status) {
        ComercialSQL objetoConex = new ComercialSQL();
        
        

        String insert = "INSERT INTO PRODUCTOS (PROCODIGO, PRODESCRIPCION, PROUNIDADMEDIDA, PROSALDOINICIAL," +
                        "PROINGRESOS, PROEGRESOS, PROAJUSTES, PROSALDOFINAL, PROCOSTOUM, PROPRECIOUM, PROSTATUS) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conexion = null;
        PreparedStatement preparedStatement = null;

        try {
            // Intentar convertir los campos de texto a números
            double saldoInicialVal = Double.parseDouble(saldoInicial.getText().isEmpty() ? "0" : saldoInicial.getText());
            double ingresosVal = Double.parseDouble(ingresos.getText().isEmpty() ? "0" : ingresos.getText());
            double egresosVal = Double.parseDouble(egresos.getText().isEmpty() ? "0" : egresos.getText());
            double ajustesVal = Double.parseDouble(ajustes.getText().isEmpty() ? "0" : ajustes.getText());
            double costoVal = Double.parseDouble(costo.getText().isEmpty() ? "0" : costo.getText());
            double precioVal = Double.parseDouble(precio.getText().isEmpty() ? "0" : precio.getText());

            // Calcular el saldo final
            double saldoFinal = saldoInicialVal + ingresosVal - egresosVal + ajustesVal;

            conexion = objetoConex.establecerConection();
            if (conexion != null) {
                preparedStatement = conexion.prepareStatement(insert);
                preparedStatement.setString(1, codigo.getText());
                preparedStatement.setString(2, descripcion.getText());
                preparedStatement.setString(3, unidadMedida.getSelectedItem().toString());
                preparedStatement.setDouble(4, saldoInicialVal);
                preparedStatement.setDouble(5, ingresosVal);
                preparedStatement.setDouble(6, egresosVal);
                preparedStatement.setDouble(7, ajustesVal);
                preparedStatement.setDouble(8, saldoFinal);
                preparedStatement.setDouble(9, costoVal);
                preparedStatement.setDouble(10, precioVal);
                preparedStatement.setString(11, status.getSelectedItem().toString());

                int registroInsert = preparedStatement.executeUpdate();
                if (registroInsert > 0) {
                    JOptionPane.showMessageDialog(null, "Se realizó la inserción correctamente");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en los campos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizó la inserción: " + e.getMessage());
        }
    }
    
    public void mostrarProducto(JTable selectTabla) {
    ComercialSQL objetoConect = new ComercialSQL();

    DefaultTableModel modelo = new DefaultTableModel();

    TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
    selectTabla.setRowSorter(OrdenarTabla);

    String sql = "";

    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Unidad Medida");
    modelo.addColumn("Saldo inicial");
    modelo.addColumn("Ingresos");
    modelo.addColumn("Egresos");
    modelo.addColumn("Ajustes");
    modelo.addColumn("Saldo final");
    modelo.addColumn("Costo");
    modelo.addColumn("Precio");
    modelo.addColumn("Status");
    modelo.addColumn("Saldo Fisico");

    selectTabla.setModel(modelo);

    sql = "SELECT * FROM PRODUCTOS;";

    Connection conexion = null;
    Statement statement = null;

    try {
        conexion = objetoConect.establecerConection();
        if (conexion != null) {
            statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Object[] datos = new Object[12];
                datos[0] = rs.getString("PROCODIGO");
                datos[1] = rs.getString("PRODESCRIPCION");
                datos[2] = rs.getString("PROUNIDADMEDIDA");
                datos[3] = rs.getDouble("PROSALDOINICIAL");
                datos[4] = rs.getDouble("PROINGRESOS");
                datos[5] = rs.getDouble("PROEGRESOS");
                datos[6] = rs.getDouble("PROAJUSTES");
                // Calcular el saldo final
                double saldoFinal = rs.getDouble("PROSALDOINICIAL") + rs.getDouble("PROINGRESOS") - 
                                    rs.getDouble("PROEGRESOS") + rs.getDouble("PROAJUSTES");
                datos[7] = saldoFinal;
                datos[8] = rs.getDouble("PROCOSTOUM");
                datos[9] = rs.getDouble("PROPRECIOUM");
                datos[10] = rs.getString("PROSTATUS");
                datos[11] = rs.getInt("PROSALDOFISICO");

                modelo.addRow(datos);
            }
            selectTabla.setModel(modelo);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros: " + e.getMessage());
    } 
}
    public void seleccion(JTable jTable1, JTextField codigo,JComboBox unidadmedida, JTextField saldoInicial, JTextField ingresos, JTextField egresos, JTextField ajustes, JTextField saldofinal, JTextField costo,
    JTextField precio, JComboBox status, JTextField descripcion){
        try {
            int fila = jTable1.getSelectedRow();
            
            if(fila >=0){
            
                codigo.setText(jTable1.getValueAt(fila, 0).toString());
                descripcion.setText(jTable1.getValueAt(fila, 1).toString());
                unidadmedida.setSelectedItem(jTable1.getValueAt(fila, 2).toString());
                saldoInicial.setText(jTable1.getValueAt(fila, 3).toString());
                ingresos.setText(jTable1.getValueAt(fila, 4).toString());
                egresos.setText(jTable1.getValueAt(fila, 5).toString());
                ajustes.setText(jTable1.getValueAt(fila, 6).toString());
                saldofinal.setText(jTable1.getValueAt(fila, 7).toString());
                costo.setText(jTable1.getValueAt(fila, 8).toString());
                precio.setText(jTable1.getValueAt(fila, 9).toString());
                status.setSelectedItem(jTable1.getValueAt(fila, 10).toString());
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No es no");
        }
    }
    
    public void modificarProducto(JTextField codigo,JComboBox unidadmedida, JTextField saldoInicial, JTextField ingresos, JTextField egresos, JTextField ajustes, JTextField saldofinal, JTextField costo,
    JTextField precio, JComboBox status, JTextField descripcion, JTextField saldofisico){
        setCodigo(codigo.getText());
        setUnidadmedida(unidadmedida.getSelectedItem().toString());
        setSaldoInicial(Double.parseDouble(saldoInicial.getText()));
        setIngresos(Double.parseDouble(ingresos.getText()));
        setEgresos(Double.parseDouble(egresos.getText()));
        setSaldoFinal(Double.parseDouble(saldofinal.getText()));
        setAjustes(Double.parseDouble(ajustes.getText()));
        setCosto(Double.parseDouble(costo.getText()));
        setPrecio(Double.parseDouble(precio.getText()));
        setStatus(status.getSelectedItem().toString());
        setDescripcion(descripcion.getText());
        
        ComercialSQL objetoConect = new ComercialSQL();
        
        String sql = "UPDATE PRODUCTOS SET PRODESCRIPCION=?, PROUNIDADMEDIDA=?, PROSALDOINICIAL=?, PROINGRESOS=?, PROEGRESOS=?, PROAJUSTES=?, PROSALDOFINAL=?, PROCOSTOUM=?, PROPRECIOUM=?, PROSTATUS=?, PROSALDOFISICO=? WHERE PROCODIGO=?";
        
        Connection conexion = null;
        PreparedStatement preparedStatement = null;

        try {
            // Intentar convertir los campos de texto a números
            double saldoInicialVal = Double.parseDouble(saldoInicial.getText().isEmpty() ? "0" : saldoInicial.getText());
            double ingresosVal = Double.parseDouble(ingresos.getText().isEmpty() ? "0" : ingresos.getText());
            double egresosVal = Double.parseDouble(egresos.getText().isEmpty() ? "0" : egresos.getText());
            double ajustesVal = Double.parseDouble(ajustes.getText().isEmpty() ? "0" : ajustes.getText());
            double costoVal = Double.parseDouble(costo.getText().isEmpty() ? "0" : costo.getText());
            double precioVal = Double.parseDouble(precio.getText().isEmpty() ? "0" : precio.getText());
            double saldofisicoVal = Double.parseDouble(saldofisico.getText());
            

            // Calcular el saldo final
            double saldoFinal = saldoInicialVal + ingresosVal - egresosVal + ajustesVal;

            conexion = objetoConect.establecerConection();
            if (conexion != null) {
                preparedStatement = conexion.prepareStatement(sql);
                preparedStatement.setString(12, codigo.getText());
                preparedStatement.setString(1, descripcion.getText());
                preparedStatement.setString(2, unidadmedida.getSelectedItem().toString());
                preparedStatement.setDouble(3, saldoInicialVal);
                preparedStatement.setDouble(4, ingresosVal);
                preparedStatement.setDouble(5, egresosVal);
                preparedStatement.setDouble(6, ajustesVal);
                preparedStatement.setDouble(7, saldoFinal);
                preparedStatement.setDouble(8, costoVal);
                preparedStatement.setDouble(9, precioVal);
                preparedStatement.setString(10, status.getSelectedItem().toString());
                preparedStatement.setDouble(11, saldofisicoVal);

                int registroInsert = preparedStatement.executeUpdate();
                if (registroInsert > 0) {
                    JOptionPane.showMessageDialog(null, "Se realizó la inserción correctamente");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en los campos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizó la inserción: " + e.getMessage());
        }
    }
    
    public void deleteProducto(JTextField codigo,JComboBox status){
        setCodigo(codigo.getText());
        setStatus(status.getSelectedItem().toString());
        
        ComercialSQL objetoConect = new ComercialSQL();
        
        String sql="";
        int i,j;
        
        if(status.getSelectedItem().toString()=="INA"){
            sql ="DELETE FROM PRODUCTOS WHERE PROSTATUS = ? AND PROCODIGO =?;";
        }
        else{
            sql ="UPDATE PRODUCTOS SET PROSTATUS=? WHERE PROCODIGO =?";
        }
        
        //String sql ="DELETE FROM PRODUCTOS WHERE PROCODIGO =?;";
        //String sql ="UPDATE PRODUCTOS SET PROSTATUS=? WHERE PROCODIGO =?";
        
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        
        try {
            conexion = objetoConect.establecerConection();
            if (conexion != null) {
                preparedStatement = conexion.prepareStatement(sql);
                preparedStatement.setString(1, "INA");
                preparedStatement.setString(2, codigo.getText());

                int registroDelete = preparedStatement.executeUpdate();
                if (registroDelete > 0) {
                    JOptionPane.showMessageDialog(null, "Se eliminó el producto correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el producto con el código especificado");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizó la eliminación: " + e.getMessage());
        }
    }
    public void subirImagenProducto(JTextField codigo, File archivoImagen) {
        ComercialSQL objetoConex = new ComercialSQL();

        String update = "UPDATE PRODUCTOS SET PROFOTO = ? WHERE PROCODIGO = ?";

        Connection conexion = null;
        PreparedStatement preparedStatement = null;

        try {
            byte[] bytesImagen = convertirArchivoABytes(archivoImagen);
            if (bytesImagen != null) {
                conexion = objetoConex.establecerConection();
                if (conexion != null) {
                    preparedStatement = conexion.prepareStatement(update);
                    preparedStatement.setBytes(1, bytesImagen);
                    preparedStatement.setString(2, codigo.getText());

                    int registrosActualizados = preparedStatement.executeUpdate();
                    if (registrosActualizados > 0) {
                        JOptionPane.showMessageDialog(null, "Se subió la imagen del producto correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el código especificado", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo leer el archivo de la imagen", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al subir la imagen del producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private byte[] convertirArchivoABytes(File archivo) {
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int longitud;
            while ((longitud = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, longitud);
            }
            fis.close();
            return bos.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }
    
    public File seleccionarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "jpeg", "gif");
        fileChooser.setFileFilter(filter);
        int resultado = fileChooser.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }
    
    public void mostrarImagenProducto(JTextField codigo, JLabel labelImagen) {
        ComercialSQL objetoConex = new ComercialSQL();

        String query = "SELECT PROFOTO FROM PRODUCTOS WHERE PROCODIGO = ?;";

        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            conexion = objetoConex.establecerConection();
            if (conexion != null) {
                preparedStatement = conexion.prepareStatement(query);
                preparedStatement.setString(1, codigo.getText());
                resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    byte[] bytesImagen = resultSet.getBytes("PROFOTO");
                    if (bytesImagen != null) {
                        ImageIcon imagen = new ImageIcon(bytesImagen);
                        Image img = imagen.getImage().getScaledInstance(labelImagen.getWidth(), labelImagen.getHeight(), Image.SCALE_SMOOTH);
                        labelImagen.setIcon(new ImageIcon(img));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró ninguna imagen para el producto especificado", "Información", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la imagen del producto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String obtenerNuevoNumeroAjuste() {
        ComercialSQL conn = new ComercialSQL();
        Connection connection = conn.establecerConection();
        String ultimoNumeroFactura = null;
        String query = "SELECT MAX(AJUCODIGO) AS ultimoNumero FROM AJUSTES;";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                ultimoNumeroFactura = resultSet.getString("ultimoNumero");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (ultimoNumeroFactura != null && !ultimoNumeroFactura.isEmpty()) {
            try {
                int ultimoNumero = Integer.parseInt(ultimoNumeroFactura.replace("AJ-", ""));
                return "AJ-" + String.format("%03d", ultimoNumero + 1);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return "AJ-001";
            }
        } else {
            return "AJ-001";
        }
    }
    
    public void cierreInventario(JTable tablaPro){
        ComercialSQL conn = new ComercialSQL();
        Connection conexion = conn.establecerConection();
        DefaultTableModel modelo = (DefaultTableModel) tablaPro.getModel();
        String ajucodigo = obtenerNuevoNumeroAjuste();
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = dateFormat.format(now); 
        PreparedStatement sta1 = null;
        PreparedStatement sta2 = null;
        PreparedStatement sta3 = null;
        //String sql1 ="INSERT INTO AJUSTES (AJUCODIGO,AJUFECHA,AJUDESCRIPCION) VALUES (?,?,'CIERRE INVENTARIO';";
        //String sql2 ="INSERT INTO PXA (PROCODIGO,AJUCODIGO,PXADESCRIPCION,PXAUNIDADMEDIDA,PXAFECHA,PXASALDOINICIAL,PXAINGRESOS,PXAEGRESOS,PXAAJUSTES,PXASALDOFINAL,PXASALDOFISICO,PXASALDOTOTAL) VALUES (?,?,?,?,?,?,?,?,?,?);";
        //String sql3 ="UPDATE PRODUCTOS SET PROSALDOINICIAL = ?, PROINGRESOS = 0,PROEGRESOS = 0, PROAJUSTES = 0, PROSALDOFISICO = ? WHERE PROCODIGO = ?;";
        String sql1 = "INSERT INTO AJUSTES (AJUCODIGO, AJUFECHA, AJUDESCRIPCION) VALUES (?, ?, 'CIERRE INVENTARIO');";
        String sql2 = "INSERT INTO PXA (PROCODIGO, AJUCODIGO, PXADESCRIPCION, PXAUNIDADMEDIDA, PXAFECHA, PXASALDOINICIAL, PXAINGRESOS, PXAEGRESOS, PXAAJUSTES, PXASALDOFINAL, PXASALDOFISICO, PXASALDOTOTAL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        String sql3 = "UPDATE PRODUCTOS SET PROSALDOINICIAL = ?, PROINGRESOS = 0, PROEGRESOS = 0, PROAJUSTES = 0, PROSALDOFISICO = ? WHERE PROCODIGO = ?;";

        
        try{
            conexion.setAutoCommit(false);
            sta1 = conexion.prepareStatement(sql1);
            
            sta1.setString(1, ajucodigo);
            sta1.setString(2, fecha);
            
            sta1.executeUpdate();
            //sta2.close();
            
            sta2 = conexion.prepareStatement(sql2);
            
            for(int i = 0; i < modelo.getRowCount(); i++){
                String procodigo = (String) modelo.getValueAt(i, 0);
                String descripcion = (String) modelo.getValueAt(i, 1);
                String unidadmedida = (String) modelo.getValueAt(i, 2);
                double saldoinicial = Double.parseDouble(modelo.getValueAt(i, 3).toString());
                double ingresos = Double.parseDouble(modelo.getValueAt(i, 4).toString());
                double egresos = Double.parseDouble(modelo.getValueAt(i, 5).toString());
                double ajustes = Double.parseDouble(modelo.getValueAt(i, 6).toString());
                double saldofinal = Double.parseDouble(modelo.getValueAt(i, 7).toString());
                double saldofisico = Double.parseDouble(modelo.getValueAt(i, 11).toString());
                double saldototal = saldofinal - saldofisico;
                
                sta2.setString(1, procodigo);
                sta2.setString(2, ajucodigo);
                sta2.setString(3, descripcion);
                sta2.setString(4, unidadmedida);
                sta2.setString(5, fecha);
                sta2.setDouble(6, saldoinicial);
                sta2.setDouble(7, ingresos);
                sta2.setDouble(8, egresos);
                sta2.setDouble(9, ajustes);
                sta2.setDouble(10, saldofinal);
                sta2.setDouble(11, saldofisico);
                sta2.setDouble(12, saldototal);
                sta2.addBatch();
            }
            sta2.executeBatch();
            //sta2.close();
            
            sta3 = conexion.prepareStatement(sql3);
            for(int j = 0; j < modelo.getRowCount(); j++){
                double saldo = Double.parseDouble(modelo.getValueAt(j, 11).toString());
                String codigo = (String) modelo.getValueAt(j, 0);
                
                sta3.setDouble(1, saldo);
                sta3.setDouble(2, saldo);
                sta3.setString(3, codigo);
                sta3.addBatch();
            }
            sta3.executeBatch();
            //sta3.close();
            conexion.commit();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error:."+ e.getMessage());
        }
    }
    
    public void mostrarAjustes(JTable tablaPro){
        ComercialSQL conn = new ComercialSQL();
        Connection conexion = conn.establecerConection();
        String sql = "SELECT AJUCODIGO, AJUFECHA, AJUDESCRIPCION FROM AJUSTES;";
        DefaultTableModel modelo = new DefaultTableModel();
        Statement sta = null;
        ResultSet rs=null;
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Descripcion");
        
        tablaPro.setModel(modelo);
        
        try{
            sta = conexion.createStatement();
            rs = sta.executeQuery(sql);
            
            while(rs.next()){
                Object[] datos = new Object[3];
                datos[0] = rs.getString("AJUCODIGO");
                datos[1] = rs.getString("AJUFECHA");
                datos[2] = rs.getString("AJUDESCRIPCION");
                
                modelo.addRow(datos);
            }
            tablaPro.setModel(modelo);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());            
        }
    }
    
    public void detallesAjuste(String ajucodigo, JTable tablaPro){
        ComercialSQL conn = new ComercialSQL();
        Connection conexion = conn.establecerConection();
        String sql = "SELECT PROCODIGO,PXADESCRIPCION,PXAUNIDADMEDIDA,PXASALDOINICIAL,PXAINGRESOS,PXAEGRESOS,PXAAJUSTES,PXASALDOFINAL,PXASALDOFISICO,PXASALDOTOTAL FROM PXA WHERE AJUCODIGO =?;";
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement sta = null;
        ResultSet rs=null;
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("UNIDAD MEDIDA");
        modelo.addColumn("SALDO INICIAL");
        modelo.addColumn("INGRESOS");
        modelo.addColumn("EGRESOS");
        modelo.addColumn("AJUSTES");
        modelo.addColumn("SALDO FINAL");
        modelo.addColumn("SALDO FISICO");
        modelo.addColumn("SALDO TOTAL");
        
        tablaPro.setModel(modelo);
        
        try{
            sta = conexion.prepareStatement(sql);
            sta.setString(1, ajucodigo);
            rs = sta.executeQuery();
            
            while(rs.next()){
                Object[] datos = new Object[10];
                datos[0] = rs.getString("PROCODIGO");
                datos[1] = rs.getString("PXADESCRIPCION");
                datos[2] = rs.getString("PXAUNIDADMEDIDA");
                datos[3] = rs.getDouble("PXASALDOINICIAL");
                datos[4] = rs.getDouble("PXAINGRESOS");
                datos[5] = rs.getDouble("PXAEGRESOS");
                datos[6] = rs.getDouble("PXAAJUSTES");
                datos[7] = rs.getDouble("PXASALDOFINAL");
                datos[8] = rs.getDouble("PXASALDOFISICO");
                datos[9] = rs.getDouble("PXASALDOTOTAL");
                
                modelo.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        }
        
    }
}
