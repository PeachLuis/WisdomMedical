package com.wisdommedical.action.patient;

import com.wisdommedical.entity.Patient;
import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.PatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 执行添加操作
 * 
 * @author
 *
 */
public class PatientAdd extends HttpServlet {

	/**
	 * 只允许post方式添加
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		//解决中文乱码问题，这取决于前台jsp页面上设置的编码格式
		request.setCharacterEncoding("utf-8");

		//采集用户输入的文章信息
		Patient patient = new Patient(request.getParameter("id"),
				request.getParameter("name"),
				Integer.parseInt(request.getParameter("age")));

		//创建业务逻辑对象并执行添加新闻操作
		PatientService patientService = new PatientServiceImpl();
		patientService.addPatient(patient);

		//跳转到主页
		//不过好像这里跳转到新闻列表页会更合适一些
		//也许这个问题会在下一版的《最小新闻发布系统》在解决吧
//		request.getRequestDispatcher("/wisdommedical/index.jsp").forward(request, response);
		response.sendRedirect("/WisdomMedical/PatientShowList");

	}
}
