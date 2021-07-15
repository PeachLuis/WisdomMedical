package com.wisdommedical.action.patient;

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
 * 登录进入系统后，显示的此页：一个患者信息列表
 */
public class PatientShowList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PatientService patientService = new PatientServiceImpl();
        List<Patient> patients = patientService.getAllPatient();

        //通过req设置属性，使得jsp页面得到patients列表
        req.setAttribute("PatientShowList_patients", patients);

        //由于jsp页面并没有通过form表单链接到该Servlet
        //所有需要通过getRequestDispatcher方法，重定向页面未知
        req.getRequestDispatcher("/wisdommedical/showpatient.jsp").forward(req, resp);
    }
}
