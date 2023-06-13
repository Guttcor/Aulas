
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Prestamos {
    DefaultTableModel mode;
    Connection conectar;
    String path="jdbc:sqlite:C:\\Users\\Kevin\\Documents\\Aulas\\DATA_BASE_BIBLIOTECA_1MM11.db";
    
    int ID;
    int aula;
    String tipo;
    int hora;
    float fecha;
    Prestamos(int I, String T, int H, float F,int A){
    ID=I;
    aula=A;
    tipo=T;
    hora=H;
    fecha=F;
    };
    void registrar(){
        try{
            //Class.forName("org.sqlite.JDBC");
             conectar = DriverManager.getConnection(path);
             if(conectar != null){
                   String sql = "insert into Prestamo (ID_prestamo, Tipo, Horarios, Fecha,ID_aula ) values(?,?,?,?,?)";
                   PreparedStatement st=conectar.prepareStatement(sql);
                   
                   st.setInt(1,ID) ;
                   st.setString(2, tipo);
                   st.setInt(3,hora);
                   st.setFloat(4,fecha) ;
                   st.setInt(3,aula);
                   st.execute();
                   
                   ResultSet resul= null;
                  mode.setRowCount(0);
                  st=conectar.prepareStatement("ID_prestamo, Tipo, Horarios, Fecha,ID_aula o from Prestamo");
                  resul = st.executeQuery();
                 
                  while (resul.next()){
                      mode.addRow(new Object[]{resul.getInt("ID de prestamo"), resul.getString("Tipo"),resul.getInt("Horario"),resul.getFloat("Fecha"),resul.getInt("ID aula")});
                  }
                   
                }
            }
         catch(Exception x){
                    }
    };
}
