package main.java.ecom.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;;


public class main {

    //Eliminar registros de una tabla
    public static void deleteVendedor(Connection con, int usuario){
        //Delete From vendedor Where usuario = '1'
        String sql = "Delete From vendedor Where usuario = '"+usuario+"'";
        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate(sql);

            //--> 1 => El usuario se borro
            //=/ 1 => El usuario no se borro
            if ( result == 1){
                System.out.println("Se borro el usuario numero "+usuario);
            }else {
                System.out.println("El usuario numero " + usuario + " no existe");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Insertar datos a la tabla vendedor
    public static void insertVendedor(Connection con, int usuario, String nombre_vendedor, String apellido_vendedor, int contraseña, int identificacion_vendedor, int numero_celular){
        String sql = "Insert Into vendedor(nombre_vendedor,apellido_vendedor,identificacion_vendedor,contraseña,numero_celular) values('"+nombre_vendedor+"','"+apellido_vendedor+"','"+identificacion_vendedor+"','"+contraseña+"','"+numero_celular+"')";
        Statement stmt;
        int result;

        try {
            stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            if(result == 1){
                System.out.println("Los datos han sido ingresados");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    //Consultar datos de la tabla vendedor.
    public static void Consulta(Connection con){
        String sql = "SELECT * FROM vendedor";
        Statement stmt;
        ResultSet rs;
        int usuario,contraseña,identificacion_vendedor,numero_celular;
        String nombre_vendedor,apellido_vendedor;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                usuario = rs.getInt("usuario");
                contraseña = rs.getInt("contraseña");
                identificacion_vendedor = rs.getInt("identificacion_vendedor");
                numero_celular = rs.getInt("numero_celular");
                nombre_vendedor = rs.getString("nombre_vendedor");
                apellido_vendedor = rs.getString("apellido_vendedor");

                System.out.println("Usuario: "+usuario+ " , Nombre vendedor: "+nombre_vendedor+" , Apellido vendedor: "+apellido_vendedor+" , Identificacion: "+identificacion_vendedor+" , Contraseña: "+contraseña+" , Celular: "+numero_celular);


            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

    }
    //Conecxion con la base de datos.
    public static Connection ConectarBD(){
        Connection conexion;
        String host = "jdbc:mysql://localhost/";
        String user = "root";
        String pass = "";
        String bd = "mydbecom";

        System.out.println("Conectando");

        try {
            conexion = DriverManager.getConnection(host+bd,user,pass);
            System.out.println("Conexion exitosa¡¡");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return conexion;
    }
    public static void main(String[] args) {
        //Connection bd = ConectarBD();
        //deleteVendedor(bd, );
        //Consulta(bd);
        //insertVendedor(bd, 1, "Manuel", "Ortiz", 14303, 1077865374, 311822);
    }

}