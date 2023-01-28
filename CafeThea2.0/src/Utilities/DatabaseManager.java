/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;
import java.sql.*;
/**
 *
 * @author V
 */
public class DatabaseManager {
    private String url = "jdbc:mysql://localhost:3306/";
    Connection con = null;
    Statement cursor = null;
    ResultSet sqlVar = null;
    
    public DatabaseManager() {
        try {
            DatabaseSetup newDB = new DatabaseSetup("cafetheadb","","vr00T4rc3()->");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void createDatabase(String dbName) {
        try {
            cursor.execute("create database "+dbName);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteDatabase(String dbName) {
        try {
            cursor.execute("drop database "+dbName);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void closeConnections() {
        try {
            sqlVar.close();
            cursor.close();
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void commitChanges() {
        try {
           con.commit(); 
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public class DatabaseSetup {
        /**
        *This constructor establishes a connection to a local mysql database.
        * 
        *@param db       database name to use and access
        *@param user     mysql localhost username
        *@param password mysql user password
        */
        public DatabaseSetup(String db, String user, String password) {
            if (user.isBlank()) {
                user = "root";
            }
            try {
                con = DriverManager.getConnection(url,user,password);
                System.out.print("Connection established!");
                cursor = con.createStatement();
                sqlVar = cursor.executeQuery("show databases");
                Boolean flag = false;
                while (sqlVar.next()) {
                    String dbName = sqlVar.getString("Database");
                    if (dbName.equals(db)) {
                        flag=true;
                    }
                }
                if (flag) {
                    System.out.println(db+" exists!");
                    cursor.execute("use "+db);
                    System.out.println("using "+db);
                }
                else {
                    initiateTables(db,user,password);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        private void initiateTables(String db, String user, String pass) {  
            final String[] dbTables = {
                "CREATE TABLE MENUITEM (menuItemID INT AUTO_INCREMENT PRIMARY KEY,menuItemName VARCHAR(50) NOT NULL,menuItemCost FLOAT(10) NOT NULL,resourceDeductionAverage FLOAT(10))",
                "CREATE TABLE SUPPLIER (supplierID INT AUTO_INCREMENT PRIMARY KEY,supplierName VARCHAR(50) NOT NULL,supplierContact INT(15) NOT NULL)",
                "CREATE TABLE RESOURCE (resourceID INT AUTO_INCREMENT PRIMARY KEY,resourceName VARCHAR(50) NOT NULL,resourceCost FLOAT(10) NOT NULL,resourceQuantity INT NOT NULL,resourceDeductionAverage INT NOT NULL,supplierID INT NOT NULL,CONSTRAINT FK_SUP FOREIGN KEY (supplierID) REFERENCES SUPPLIER(supplierID))",
                "CREATE TABLE CUSTOMER (customerID INT AUTO_INCREMENT PRIMARY KEY, customerFirstName VARCHAR(50) NOT NULL, customerLastName VARCHAR(50) NOT NULL, customerContact INT(15) NOT NULL, customerAddress VARCHAR(100) NOT NULL)",
                "CREATE TABLE SCHEDULE (dateTime DATETIME NOT NULL PRIMARY KEY)",
                "CREATE TABLE SERVICE (serviceID INT AUTO_INCREMENT PRIMARY KEY, serviceName VARCHAR(20) NOT NULL, serviceCost FLOAT(10) NOT NULL, resourceDeductionAverage FLOAT(10) NOT NULL, serviceDescription VARCHAR(200) NOT NULL)",
                "CREATE TABLE CREDENTIALS (userID INT AUTO_INCREMENT PRIMARY KEY, userName VARCHAR(20) NOT NULL, password VARCHAR(20) NOT NULL)",
                "CREATE TABLE ORDERREQUEST (orderID INT AUTO_INCREMENT PRIMARY KEY, serviceID INT NOT NULL, CONSTRAINT FK_SERV FOREIGN KEY (serviceID) REFERENCES SERVICE(serviceID), customerID INT NOT NULL, CONSTRAINT FK_CUST FOREIGN KEY (customerID) REFERENCES CUSTOMER(customerID), userID INT NOT NULL, CONSTRAINT FK_USER FOREIGN KEY (userID) REFERENCES CREDENTIALS(userID), menuItemID INT NOT NULL, CONSTRAINT FK_MENU FOREIGN KEY (menuItemID) REFERENCES MENUITEM(menuItemID), dateTime DATETIME NOT NULL, CONSTRAINT FK_SCHED FOREIGN KEY (dateTime) REFERENCES SCHEDULE(dateTime), deliveryMode CHAR(20) NOT NULL, CONSTRAINT CHK_DELIVERY CHECK(deliveryMode IN ('Dine In', 'Take Out', 'Delivery', 'Pick Up', 'N/A')), serviceInstruction VARCHAR(150), totalCost FLOAT(10) NOT NULL, CONSTRAINT CHK_TOTAL CHECK(totalCost > 0))",
                "CREATE TABLE RECEIPT (receiptID INT AUTO_INCREMENT PRIMARY KEY, receiptDateTime DATETIME NOT NULL, orderID INT NOT NULL, CONSTRAINT FK_ORDER FOREIGN KEY (orderID) REFERENCES ORDERREQUEST(orderID))"
            };
            try {
                cursor.execute("create database "+db);
                con = DriverManager.getConnection(url+db, user, pass);
                cursor = con.createStatement();
                for (String query: dbTables) {
                    cursor.execute(query);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    
    public static void main(String args[]) {
        DatabaseManager cafeTheaDb = new DatabaseManager();
        cafeTheaDb.createDatabase("test");
        cafeTheaDb.deleteDatabase("test");
    }
}
