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
 * ִ����Ӳ���
 * 
 * @author
 *
 */
public class PatientAdd extends HttpServlet {

	/**
	 * ֻ����post��ʽ���
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		//��������������⣬��ȡ����ǰ̨jspҳ�������õı����ʽ
		request.setCharacterEncoding("utf-8");

		//�ɼ��û������������Ϣ
		Patient patient = new Patient(request.getParameter("id"),
				request.getParameter("name"),
				Integer.parseInt(request.getParameter("age")));

		//����ҵ���߼�����ִ��������Ų���
		PatientService patientService = new PatientServiceImpl();
		patientService.addPatient(patient);

		//��ת����ҳ
		//��������������ת�������б�ҳ�������һЩ
		//Ҳ��������������һ��ġ���С���ŷ���ϵͳ���ڽ����
//		request.getRequestDispatcher("/wisdommedical/index.jsp").forward(request, response);
		response.sendRedirect("/WisdomMedical/PatientShowList");

	}
}
