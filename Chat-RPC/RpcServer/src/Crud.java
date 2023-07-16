import java.sql.*;
import java.util.List;
import java.util.Vector;

public class Crud {
    public Crud() {
        connect();
    }

    private Connection connection;
    private void connect()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String db = "jdbc:mysql://localhost:3306/myrpc";
        String user = "root";
        String pass = "";
        try {
            connection = DriverManager.getConnection(db, user, pass);
            if(connection != null){
                System.out.println("stub of server connected ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public List<String> getData() throws SQLException {
        String data = "";
        Vector<String> vector = new Vector<>();
        String query = "select * from messages";
        Statement stmt;
        ResultSet result;
        try {
            stmt = connection.createStatement();
            result = stmt.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        while(result.next()){
            data = "user: " + result.getString(1) + " :  " + result.getString(2);
            vector.add(data);
        }

        return vector;
    }

    public String insertData(String username,String password){
        String data;
        int rows;
        String query = "insert into users values(?,?)";
        try {
            PreparedStatement ps =  connection.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            rows = ps.executeUpdate();
            if(rows > 0){
                data = rows + "rows are affected";
            }else{
                data = "not inserted";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public String insertMessage(String username,String text){
        String data;
        int rows;
        String query = "insert into messages values(?,?)";
        try {
            PreparedStatement ps =  connection.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,text);
            rows = ps.executeUpdate();
            if(rows > 0){
                data = rows + "rows are affected";
            }else{
                data = "not inserted";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return data;
    }


}

