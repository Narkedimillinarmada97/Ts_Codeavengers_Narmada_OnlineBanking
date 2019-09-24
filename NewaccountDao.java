package DAO;
//import Bean.User;
//import Connection.DBConnection;
//import Bean.UserBean;
//import Connection.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Bean.NewaccountBean;
public class NewaccountDao {
//public static Connection getConnection(){
	//Connection con = null;

public static int save(NewaccountBean register){
	int status=0;
	try{
		//System.out.println("333333333333__before connection");
		Connection con = DBconnection.DBConnection.createConnection(); 
		//System.out.println("dfgh"+con);
		PreparedStatement
		ps=con.prepareStatement("insert into newaccount1(username,password,repassword,accountnumber,amount,address,phone) values(?,?,?,?,?,?,?)");
		ps.setString(1,register.getUserName());
		//System.out.println("44444444444"+register.getUserName());
        ps.setString(2,register.getPassword());
        //System.out.println("555555555555"+register.getPassword());
		ps.setString(3,register.getPassword());
		//System.out.println("6666666666666"+register.getPassword());
		ps.setString(4,register.getRepassword());
		//System.out.println("777777777777777"+register.getRepassword());
		ps.setString(5,register.getAccountnumber());
		//System.out.println("8888888888"+register.getAccountnumber());
		ps.setString(6,register.getAddress());
		//System.out.println("99999999999"+register.getAddress());
		ps.setString(7,register.getPhone());
		System.out.println("12345566778"+register.getPhone());
		status=ps.executeUpdate();
                
	}catch(Exception e){System.out.println(e);}
	return status;
}
}