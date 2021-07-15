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
 * 显示一个患者的详细信息
 */
public class PatientShow extends HttpServlet {
	/**
	 * 为什么只处理get方式<br>
	 * 当用户浏览一个具体的新闻时，如果想分享给朋友，就需要将网址复制下来，发送给朋友，这时，网址中应当是包含新闻信息的，例如：新闻的id
	 *
	 */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//得到网址中包含的患者id
		int id = Integer.parseInt(req.getParameter("id"));

		//创建业务逻辑对象获取该患者对象
		PatientService patientService = new PatientServiceImpl();
		Patient patient = patientService.getPatient(id);

		//将该新闻添加到req里，供jsp页面显示
		req.setAttribute("PatientShow_patient",patient);

		//跳转到显示一篇新闻的页面，此操作为重定向操作
		req.getRequestDispatcher("/wisdommedical/showdetail.jsp").forward(req, resp);
	}


}
