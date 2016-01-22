package fckeditor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hengshuo.baibx.model.Admin;

import net.fckeditor.requestcycle.UserPathBuilder;

public class MyUserPath implements UserPathBuilder {

	public String getUserFilesPath(HttpServletRequest request) {
		//����һ��·�������·�������û���Ŀ¼
		HttpSession session = request.getSession();
		Admin admin=(Admin)session.getAttribute("aa");
		if(admin==null){
			Admin admin1=(Admin)session.getAttribute("User");
			System.out.print(admin1);
			String Adminid=admin1.getAdminid();
			return "/Admin/"+Adminid/* + username*/;
		}
		else {
			
			String Adminid=admin.getAdminid();
			return "/user/"+Adminid/* + username*/;
		}
		
		/*User user2=(User) session.getAttribute("user");
		String username=user2.getUserid();*/
		//String username = (String) session.getAttribute("username");
		
	}

}
