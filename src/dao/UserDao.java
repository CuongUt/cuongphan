package dao;

import java.sql.ResultSet;


import model.MyConnectDB;
import model.User;


public class UserDao{

	

	public model.User layThongTinTaiKhoan(String username) {
		try {
			ResultSet rs = new MyConnectDB().selectData("select * from dangnhap31 where username='" + username + "'");
			while (rs.next()) {
				String user = rs.getString(1);
				String pass = rs.getString(2);
				String name = rs.getString(3);
				return new User(user, pass, name);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;

	}

	public boolean kiemTraDangNhap(String username, String pass) {

		try {
			ResultSet rs = new MyConnectDB().selectData("select * from dangnhap31 where username='" + username + "'");
			while (rs.next()) {
				if (rs.getString(1).equals(username) && rs.getString(2).equals(pass)) {
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return false; 
	}
	
	
	public static void main(String[] args) {

	}



}
