package com.le.tomcat.servlets;

import com.le.standard.ServletException;
import com.le.standard.http.HttpServlet;
import com.le.standard.http.HttpServletRequest;
import com.le.standard.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GrammarErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ClassNotFoundException {
        resp.setStatus(400);
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>请求语法错误</h1>");
    }
}
