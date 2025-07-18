# 🍽️ Restaurant Booking Website

A responsive and dynamic web application that allows users to book restaurant tables online. Built using Java Servlets and deployed on Apache Tomcat with MySQL as the backend database.

## 🚀 Features

- 📅 Online restaurant table booking with real-time form submission
- 📬 Form fields: Name, Email, Date, Time, and Number of Guests
- 💡 Input validation on both client-side (JavaScript) and server-side (Java Servlet)
- 💾 Stores booking details in a MySQL database using JDBC
- 📂 Deployed on Apache Tomcat 9
- ✅ Success page confirmation upon successful booking

## 🛠️ Tech Stack

- **Frontend**: HTML, CSS, JavaScript  
- **Backend**: Java Servlet, JDBC  
- **Database**: MySQL  
- **Server**: Apache Tomcat 9
- **Tools**: Visual Studio Code, MySQL WorkBench

Create a table in MySQL WorkBench:

CREATE TABLE bookings (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  booking_date DATE,
  booking_time TIME,
  guests INT
);




   
