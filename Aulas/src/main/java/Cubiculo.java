/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin, Beristain, Gael, Angel
 */
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.ResultSetMetaData;
        import java.sql.SQLException;
 
        import javax.swing.table.DefaultTableModel;
        import javax.swing.JOptionPane;
public class Cubiculo {
    DefaultTableModel model;
    Connection conectar;
    String path="jdbc:sqlite:C:\\Users\\Kevin\\Documents\\Aulas\\DATA_BASE_BIBLIOTECA_1MM11.db";
    
     int ID;
    String tipo;
    int hora;
    String disp;
    
    Cubiculo(int I, String T, int H, String D){
    ID=I;
    tipo=T;
    hora=H;
    disp=D;
    
    };
    void registrar(){
        try{
            //Class.forName("org.sqlite.JDBC");
             conectar = DriverManager.getConnection(path);
             if(conectar != null){
                   String sql = "insert into Cubiculo (ID, Tipo, Horario, Disponibilidad) values(?,?,?,?)";
                   PreparedStatement st=conectar.prepareStatement(sql);
                   
                   st.setInt(1,ID) ;
                   st.setString(2, tipo);
                   st.setInt(3,hora) ;
               
                   st.setString(4,disp);
                   st.execute();
                   
                   ResultSet resul= null;
                  model.setRowCount(0);
                  st=conectar.prepareStatement("Select ID, Tipo, Horario, Disponibilidad from Cubiculo");
                  resul = st.executeQuery();
                 
                  while (resul.next()){
                      model.addRow(new Object[]{resul.getInt("ID"), resul.getString("Tipo"),resul.getInt("Horario"),resul.getString("Disponibilidad")});
                  }
                   conectar.close();
                }
            }
         catch(Exception x){
                    }
    }; 
}
