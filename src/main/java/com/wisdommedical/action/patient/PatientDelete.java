package com.wisdommedical.action.patient;

import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.PatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * ɾ������
 * 
 * @author
 *
 */
public class PatientDelete extends HttpServlet {

	/**
	 * ɾ���űϾ���һ��Σ�ղ�����������ɾ��ɾ������������post��ʽ����ɾ��������һС����Ѷ�
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�õ�Ҫɾ��id
//		int id = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("id");
		
		//����ҵ���߼�����ɾ��������
		PatientService patientService = new PatientServiceImpl();
		patientService.deletePatient(id);

		//��ת����ҳ
		//��������������ת�������б�ҳ�������һЩ
		//Ҳ��������������һ��ġ���С���ŷ���ϵͳ���ڽ����
//		request.getRequestDispatcher("/wisdommedical/index.jsp").forward(request, response);
		response.sendRedirect("/WisdomMedical/PatientShowList");

	}
}
