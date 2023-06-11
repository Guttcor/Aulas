/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.ResultSetMetaData;
        import java.sql.SQLException;
 
        import javax.swing.table.DefaultTableModel;
        import javax.swing.JOptionPane;
public class Auditorio {
    DefaultTableModel model;
    Connection conectar;
    String path="jdbc:sqlite:C:\\Users\\Kevin\\Documents\\Aulas\\DATA_BASE_BIBLIOTECA_1MM11.db";
    int ID;
    String tipo;
    int hora;
    String disp;
    int cap;
     
    Auditorio(int I, String T, int H, String D, int C){
    ID=I;
    tipo=T;
    hora=H;
    disp=D;
    cap=C;
    };
    void registrar(){
       try{
            //Class.forName("org.sqlite.JDBC");
             conectar = DriverManager.getConnection(path);
             if(conectar != null){
                   String sql = "insert into Auditorio (ID, Tipo, Horario, Capacidad, Disponibilidad) values(?,?)";
                   PreparedStatement st=conectar.prepareStatement(sql);
                   
                   st.setInt(1,ID) ;
                   st.setString(2, tipo);
                   st.setInt(3,hora) ;
                   st.setInt(4,cap) ;
                   st.setString(5,disp);
                   st.execute();
                   
                   ResultSet resul= null;
                  model.setRowCount(0);
                  st=conectar.prepareStatement("Select ID, Tipo, Horario, Capacidad, Disponibilidad from Auditorio");
                  resul = st.executeQuery();
                 
                  while (resul.next()){
                      model.addRow(new Object[]{resul.getInt("ID"), resul.getString("Tipo"),resul.getInt("Horario"),resul.getInt("Capacidad"),resul.getString("Capacidad")});
                  }
                   conectar.close();
                }
            }
                    catch(Exception x){
                  
                    }
         
    };    
}
