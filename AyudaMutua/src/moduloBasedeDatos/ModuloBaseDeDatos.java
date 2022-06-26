package moduloBasedeDatos;

import java.sql.*;

public class ModuloBaseDeDatos {
    static Connection conexion = null;
    static Statement statement = null;
    static ResultSet resultset = null;
    static String url = "jdbc:mysql://localhost:3306/AyudaMutua";
    static String username = "ale";
    static String password = "1409";
    
    //Constructor
    public ModuloBaseDeDatos(){
        //Empty Constructor
    }
    
    //Metodos estaticos
    public void verificarDriver()throws ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    
    public static void establecerConexion()throws SQLException{
        conexion = DriverManager.getConnection(url, username, password);
    }
    
    public static void iniciarStatement()throws SQLException{
        statement = conexion.createStatement();
    }
    
    public static void killEverything()throws SQLException{
        statement.close();
        resultset = null;
        conexion.close();
    }
    
    public static void insertarDatos(String query)throws SQLException{
        System.out.println("Funcion no implementada");
    }
    
    public static void mostrarResultSet(String query, int cantColumasSolicitadas)throws 
    SQLException{
        resultset = null;
        resultset = statement.executeQuery(query);
        while(resultset.next()){
            String salida = "";
            System.out.println(salida + "FUncion no lista");
        }
    }
    
    public static String crearQueryDeConsulta(String columnasParaSeleccionar, String tabla){
        String query = "SELECT "+columnasParaSeleccionar+" FROM "+tabla+";";
        return query;
    }
    
    public static String crearQueryInsertar(String tabla, String columnasParaInsertar, String valores){
        String query = "INSERT INTO " + tabla + " (" + columnasParaInsertar + ") VALUES(" + valores + ");";
        return query;
    }
    
    
}
