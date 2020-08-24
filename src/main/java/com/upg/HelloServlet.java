package com.upg;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        PrintWriter writer = httpServletResponse.getWriter();
        writer.print("<!Doctype html>");
        writer.print("<html>");
        writer.print("<head>");
        writer.print("<title>Hello</title>");
        writer.print("<head>");
        writer.print("<body>");
        writer.print("<p>This page is rendered from hello world servlet</p>");
        writer.print("<body>");
        writer.print("</html>");
        writer.close();
    }
}
