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
 * ��ʾһ�����ߵ���ϸ��Ϣ
 */
public class PatientShow extends HttpServlet {
	/**
	 * Ϊʲôֻ����get��ʽ<br>
	 * ���û����һ�����������ʱ��������������ѣ�����Ҫ����ַ�������������͸����ѣ���ʱ����ַ��Ӧ���ǰ���������Ϣ�ģ����磺���ŵ�id
	 *
	 */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//�õ���ַ�а����Ļ���id
		int id = Integer.parseInt(req.getParameter("id"));

		//����ҵ���߼������ȡ�û��߶���
		PatientService patientService = new PatientServiceImpl();
		Patient patient = patientService.getPatient(id);

		//����������ӵ�req���jspҳ����ʾ
		req.setAttribute("PatientShow_patient",patient);

		//��ת����ʾһƪ���ŵ�ҳ�棬�˲���Ϊ�ض������
		req.getRequestDispatcher("/wisdommedical/showdetail.jsp").forward(req, resp);
	}


}
