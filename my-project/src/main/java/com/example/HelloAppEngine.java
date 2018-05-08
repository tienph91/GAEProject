package com.example;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloAppEngine extends HttpServlet {

    public static int count = 0;
    public static StringBuilder cache = new StringBuilder();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        cache.append("121211121212121212121212112111111111111111111" + cache.toString());
        count++;
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        System.out.println("Count = " + count);
        response.getWriter().println("Hello App Engine! : " + count);

    }
}