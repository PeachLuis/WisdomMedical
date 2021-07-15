package com.wisdommedical.action.patient;

import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.PatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 删除新闻
 * 
 * @author
 *
 */
public class PatientDelete extends HttpServlet {

	/**
	 * 删新闻毕竟是一个危险操作，不能想删就删啊，所以用了post方式，给删除增加了一小点点难度
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//得到要删除id
//		int id = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("id");
		
		//创建业务逻辑对象，删除该新闻
		PatientService patientService = new PatientServiceImpl();
		patientService.deletePatient(id);

		//跳转到主页
		//不过好像这里跳转到新闻列表页会更合适一些
		//也许这个问题会在下一版的《最小新闻发布系统》在解决吧
//		request.getRequestDispatcher("/wisdommedical/index.jsp").forward(request, response);
		response.sendRedirect("/WisdomMedical/PatientShowList");

	}
}
