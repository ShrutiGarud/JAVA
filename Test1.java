import java.sql.*;          // 1

class Test1
{
    public static void main(String arg[]) 
    {
        try{
        Connection cobj = DriverManager.getConnection("path","username","password");   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery("select * from student");      // 4

        while(robj.next())          // 5
        {
            System.out.println("RNO : "+robj.getInt("rno"));
            System.out.println("Name : "+robj.getString("name"));
            System.out.println("City : "+robj.getString("City"));
        }
      }
      catch(Exception obj){

      }
    }
}