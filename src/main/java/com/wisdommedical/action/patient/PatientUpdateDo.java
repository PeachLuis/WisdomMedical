package com.wisdommedical.action.patient;

import com.wisdommedical.entity.Patient;
import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.PatientService;
import ruanko.newspublish.action.article.ArticleUpdate;
import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * ִ�����������¸��²���,ָ�û�����˱༭������������ִ�еĲ���
 * 
 * @author
 * @see ArticleUpdate
 */
public class PatientUpdateDo extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�漰�û�������Ϣ�ĵط���Ҫ����������������
		//��������������⣬��ȡ����ǰ̨jspҳ�������õı����ʽ
		request.setCharacterEncoding("utf-8");
		
		//�ɼ��û����������
		Patient patient = new Patient(request.getParameter("id"),
				request.getParameter("name"),
				Integer.parseInt(request.getParameter("age")));

		//����ҵ���߼�����ִ�и���(�޸�)����
		PatientService patientService = new PatientServiceImpl();
		patientService.updatePatient(patient);

		//��ת����ҳ
		//��������������ת�������б�ҳ�������һЩ
		//Ҳ��������������һ��ġ���С���ŷ���ϵͳ���ڽ����
//		request.getRequestDispatcher("/wisdommedical/index.jsp").forward(request, response);
		response.sendRedirect("/WisdomMedical/PatientShowList");

	}
}
