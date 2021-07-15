package com.wisdommedical.action.patient;

import com.wisdommedical.entity.Patient;
import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.PatientService;
import ruanko.newspublish.biz.ArticleBiz;
import ruanko.newspublish.entity.Article;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Ҫ�޸����ţ�����Ҫ��������ʾ���û������������޸ģ��������ڽ�������ʾ���û�
 * 
 * @author
 *
 */
public class PatientUpdate extends HttpServlet {

	/**
	 * ������������postҲ������getû��̫������𣬲���Ϊ�˼����������ֻ������get����
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�õ�Ҫ�޸����ŵ�id
		int id = Integer.parseInt(request.getParameter("id"));
		
		//����ҵ���߼����󣬲�ȡ�ø�����
		PatientService patientService = new PatientServiceImpl();
		Patient patient = patientService.getPatient(id);

		//����������ӵ�request���jsp��ʾ��������������ʾ�ڱ༭���ﻹ��ʲô�ط��Ҿ͹ܲ����ˣ������Ҹ�����
//		request.setAttribute("article", article);
		request.setAttribute("PatientUpdate_patient",patient);
		//��ת���޸�ҳ��
		request.getRequestDispatcher("/wisdommedical/updatedetail.jsp").forward(request, response);
	}
}
