import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_user","root","");
        if(connection != null){
        System.out.println("connected");}
        String user = "SELECT  username FROM user WHERE ID = ? && PASSWORD = ? ";
        PreparedStatement pstmt = connection.prepareStatement(user);
        System.out.println("EnterUsername");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        pstmt.setInt(1,id);

        System.out.println("password");
        Scanner sc = new Scanner(System.in);
        String password = scanner.next();
        pstmt.setString(2,password);


        ResultSet result = pstmt.executeQuery();
        if(result.next()){
            System.out.println("You are logged in");
        }else{
            System.out.println("incorrect password or username");
        }






//        Statement stmt =  connection.createStatement();
//        int result = stmt.executeUpdate("INSERT INTO user VALUES( 1,'Biruk','1234')");
//
//        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
//        boolean s = stmt.execute("Select * from user");
//        System.out.println(s);

//
//        while(rs.next()){
//            int id  = rs.getInt(1);
//            String userName = rs.getString(2);
//            String password = rs.getString(3);
//            System.out.println("id="+id+"username="+userName+"passwrd="+password+ "\n");
//        }
//        System.out.println(result+"is affected");
//        stmt.close();
//        PreparedStatement pstmt  = connection.prepareStatement("UPDATE  user SET  username=?,password=? WHERE id = 2" );
////                pstmt.setInt(1,1);
////                int i = pstmt.executeUpdate();
////        System.out.println(i + "Items are UPDATED! ");


////            pstmt.setInt(1,2);
//            pstmt.setString(2,"selam");
//            pstmt.setString(3,"password");
//            int i = pstmt.executeUpdate();
//        System.out.println(i+"item is affected");
//        PreparedStatement stmt = connection.prepareStatement ("update user set username = ? where id = ?");
//        stmt.setString(1,"Rutha");
//                stmt.setInt(2,2);
//        stmt.executeUpdate();





    }
}