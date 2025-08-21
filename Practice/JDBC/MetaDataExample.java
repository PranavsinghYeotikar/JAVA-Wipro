import java.sql.*;
import java.io.*;

class MakeConnection3 {
    Connection conn;
    Statement stmt;
    String s1, s2;
    DatabaseMetaData dbmd;

MakeConnection3() {
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:orcl","scott","tiger");dbmd = conn.getMetaData();
s1 = dbmd.getURL();
s2 = dbmd.getSQLKeywords();
boolean b1 = dbmd.supportsTransactions();
boolean b2 = dbmd.supportsSelectForUpdate();
System.out.println("URL :  "+s1);
System.out.println("SQL Keywords :"+s2);
System.out.println("This supports Transactions : "+b1);
System.out.println("This supports SelectforUpdate : "+b2);
}

catch(Exception e) {
e.printStackTrace();
}
}
}

public class MetaDataExample {
    public static void main(String args[]) {
        new MakeConnection3();
    }
}
