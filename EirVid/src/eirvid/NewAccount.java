/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eirvid;

/**
 *
 * @author Yuri
 */

    
    public class NewAccount implements NewAccountInterface {
    public void StoreTrades(List<AccountInfo> NewAccount) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String DB_URL = "jdbc:mysql://localhost/Account";
        String USER = "root";
        String PASS = "root";    
        
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
           Statement stmt = conn.createStatement();
        ) {		
            String sql;
//            sql = "CREATE TABLE IF NOT EXISTS Account " +
//                    "(id INTEGER not NULL AUTO_INCREMENT, " +
//                    " Email VARCHAR(255), " + 
//                    " Password VARCHAR(255), " + 
//                    " PRIMARY KEY ( id ));"; 
//            stmt.executeUpdate(sql);
//            System.out.println("Created table in given database...");  
            
            
            for (AccountInfo Account : NewAccount) {
                    sql = String.format("INSERT INTO Account (Email, Password) VALUES ('%s', '%s');",
                    
                    NewAccount.Email, NewAccount.Password);
                    stmt.executeUpdate(sql);
            }
            System.out.println("Sucessful");

        } catch (SQLException e) {
            e.printStackTrace();        
        }          
    }
}

    

