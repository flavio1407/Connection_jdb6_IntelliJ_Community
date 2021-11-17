package com.br.nt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleTest {

  
    public static void  main(String[] args) throws  Exception
    {
        // Create jdbc connection obj and load class
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","teste","teste");


        //create statement obj
        Statement st= con.createStatement();

        //Execute the query
        ResultSet rs= st.executeQuery("select * from tab WHERE rownum < 53");

        //Print database table records
        while (rs.next())
        {
        //System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }

        //Close all jdbc obj
        rs.close();
        st.close();
        con.close();


    }//main

}//Class



