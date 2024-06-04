package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jp.co.aforce.bean.User;
import jp.co.aforce.dao.UserDAO;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	public void doPost(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("member_id");
		String loginId = request.getParameter("login_id");
		String lastName = request.getParameter("last_name");
		String firstName = request.getParameter("first_name");
		String sex = request.getParameter("sex");
		String birthday = request.getParameter("birthday");
		String job = request.getParameter("job");
		String phoneNumber = request.getParameter("phone_number");
		String mailAddress = request.getParameter("mail_address");

		User user = new User();
		
        user.setMemberId(memberId);
        user.setLoginId(loginId);
        user.setLastName(lastName);
        user.setFirstName(firstName);
        user.setSex(sex);
        user.setBirthday(birthday);
        user.setJob(job);
        user.setPhoneNumber(phoneNumber);
        user.setMailAddress(mailAddress);
        
        UserDAO dao = new UserDAO(); 

        try {
            dao.addLogin(lastName + " " + firstName, loginId, memberId);
            dao.addUser(user);
            response.sendRedirect("/MemberInformation/views/login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
}
