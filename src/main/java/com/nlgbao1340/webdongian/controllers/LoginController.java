package com.nlgbao1340.webdongian.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginController extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("<h1>" + username + "</h1>");
//        printWriter.println("<h1>" + password + "</h1>");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/login.html");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("<h1>" + username + "</h1>");
//        printWriter.println("<h1>" + password + "</h1>");
        // Return JSP form
        boolean check = false;
        if (username.equals("nlgbao1340") && password.equals("123"))
        {
            check = true;
            req.setAttribute("uName", username);
            req.setAttribute("pass", password);
        }
        req.setAttribute("msg", check);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/login.jsp");
        requestDispatcher.forward(req, resp);
    }
}
