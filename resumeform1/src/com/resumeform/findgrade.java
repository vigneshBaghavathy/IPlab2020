package com.resumeform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class findgrade extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("m1"));
		int j = Integer.parseInt(req.getParameter("m2"));
		String k = req.getParameter("clggrade");
		String space = " ";
		String fname = req.getParameter("fname");
		String lname = space.concat(req.getParameter("lname"));
		String name = fname.concat(lname);
		
		PrintWriter out = res.getWriter();
		
		out.println("This is SERVER page");
		out.println("Resume Data");
		out.println("NAME : "+ name);
		String email = req.getParameter("emailid");
		String phone = req.getParameter("phnno");
		out.println("Contact information Email: "+email+" Phone : "+phone);
		String school = req.getParameter("school");
		String schlyear = req.getParameter("schoolyear");
		
		out.println(name+" completed his scooling at "+school+" in "+schlyear);
		
		
		out.println(name+" has scored "+k+" grade in his college");
		out.println(name+" has scored "+i+" marks in his primary school exams");
		out.println(name+" has scored "+j+" marks in his higher secondary school exams");
		String a1 = req.getParameter("addqual1");
		String a2 = req.getParameter("addqual2");
		String a3 = req.getParameter("addqual3");
		out.println(name+" Has interest in the feild of  "+a1+","+a2+","+a3+". etc..");
		
	}
	

}
