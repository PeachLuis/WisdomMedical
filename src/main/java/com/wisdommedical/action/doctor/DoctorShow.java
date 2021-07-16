package com.wisdommedical.action.doctor;

import com.wisdommedical.entity.Patient;
import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.PatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * 显示医生姓名为name的患者列表
 */
public class DoctorShow extends HttpServlet {

	/**
	 * 为什么只处理get方式<br>
	 * 当用户浏览一个具体的新闻时，如果想分享给朋友，就需要将网址复制下来，发送给朋友，这时，网址中应当是包含新闻信息的，例如：新闻的id
	 *
	 */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//得到网址中包含的医生 姓名name
		String name = req.getParameter("name");

//		//获取选择name医生的患者列表
//		BookingFormBiz biz = new BookingForBiz();
//		List<Patient> patients = biz.getPatientsByDoctorName(name);
//
//		req.setAttribute("DoctorShow_patients", patients);
//		req.setAttribute("DoctorShow_doctor_name", name);

		req.getRequestDispatcher("/wisdommedical/doctor/showdoctordetail.jsp").forward(req, resp);

	}


}
