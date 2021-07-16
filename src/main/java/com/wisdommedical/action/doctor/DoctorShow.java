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
 * ��ʾҽ������Ϊname�Ļ����б�
 */
public class DoctorShow extends HttpServlet {

	/**
	 * Ϊʲôֻ����get��ʽ<br>
	 * ���û����һ�����������ʱ��������������ѣ�����Ҫ����ַ�������������͸����ѣ���ʱ����ַ��Ӧ���ǰ���������Ϣ�ģ����磺���ŵ�id
	 *
	 */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//�õ���ַ�а�����ҽ�� ����name
		String name = req.getParameter("name");

//		//��ȡѡ��nameҽ���Ļ����б�
//		BookingFormBiz biz = new BookingForBiz();
//		List<Patient> patients = biz.getPatientsByDoctorName(name);
//
//		req.setAttribute("DoctorShow_patients", patients);
//		req.setAttribute("DoctorShow_doctor_name", name);

		req.getRequestDispatcher("/wisdommedical/doctor/showdoctordetail.jsp").forward(req, resp);

	}


}
