package com.wisdommedical.action.doctor;

import com.wisdommedical.entity.Doctor;
import com.wisdommedical.entity.Patient;
import com.wisdommedical.service.impl.DoctorServiceImpl;
import com.wisdommedical.service.impl.PatientServiceImpl;
import com.wisdommedical.service.interf.DoctorService;
import com.wisdommedical.service.interf.PatientService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 显示所有医生的列表
 * 通过点击表中的医生姓名，跳转到挂了该医生号的患者列表
 */
public class DoctorShowList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DoctorService service = new DoctorServiceImpl();
        List<Doctor> doctors = service.getAllDoctor();

        //通过req设置属性，使得jsp页面得到patients列表
        req.setAttribute("DoctorShowList_doctors", doctors);

        //由于jsp页面并没有通过form表单链接到该Servlet
        //所有需要通过getRequestDispatcher方法，重定向页面未知
        req.getRequestDispatcher("/wisdommedical/doctor/showdoctor.jsp").forward(req, resp);
    }
}
