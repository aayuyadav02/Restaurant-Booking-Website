package com.booking;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        int guests = Integer.parseInt(request.getParameter("guests"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "");
            String sql = "INSERT INTO bookings (name, email, booking_date, booking_time, guests) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, date);
            ps.setString(4, time);
            ps.setInt(5, guests);

            ps.executeUpdate();
            conn.close();
            response.sendRedirect("success.html");
        } catch(Exception e) {
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
        }
    }
}
