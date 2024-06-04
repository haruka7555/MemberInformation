package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jp.co.aforce.bean.User;

public class UserDAO extends DAO {
	public int addUser(User user) throws Exception {
		int result = 0;
		
		try (Connection con = getConnection();
	             PreparedStatement st = con.prepareStatement("INSERT INTO member (member_id, login_id, last_name, first_name, sex, birthday, job, phone_number, mail_address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
	            st.setString(1, user.getMemberId());
	            st.setString(2, user.getLoginId());
	            st.setString(3, user.getLastName());
	            st.setString(4, user.getFirstName());
	            st.setString(5, user.getSex());
	            st.setString(6, user.getBirthday());
	            st.setString(7, user.getJob());
	            st.setString(8, user.getPhoneNumber());
	            st.setString(9, user.getMailAddress());
	            result = st.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return result;
	}
	
	public int addLogin(String name, String password, String id) throws Exception {
        int result = 0;

        try (Connection con = getConnection();
             PreparedStatement st = con.prepareStatement("INSERT INTO login (name, password, id) VALUES (?, ?, ?)")) {
            st.setString(1, name);
            st.setString(2, password);
            st.setString(3, id);
            result = st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}