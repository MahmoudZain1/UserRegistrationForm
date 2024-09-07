package dempApp;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@MultipartConfig
public class project extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String email = req.getParameter("Email");
        String password = req.getParameter("password");
        String city = req.getParameter("city");
        Part filePart = req.getPart("cvFile");
        String fileName = filePart != null ? filePart.getSubmittedFileName() : "No file uploaded";
        String age = req.getParameter("age");
        String hearAboutUs = req.getParameter("hearAboutUs");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Registration Information</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Field</th><th>Value</th></tr>");
        out.println("<tr><td>First Name</td><td>" + fname + "</td></tr>");
        out.println("<tr><td>Last Name</td><td>" + lname + "</td></tr>");
        out.println("<tr><td>Email</td><td>" + email + "</td></tr>");
        out.println("<tr><td>Password</td><td>" + password + "</td></tr>");
        out.println("<tr><td>City</td><td>" + city + "</td></tr>");
        out.println("<tr><td>CV File</td><td>" + fileName + "</td></tr>");
        out.println("<tr><td>Age</td><td>" + age + "</td></tr>");
        out.println("<tr><td>Hear About Us</td><td>" + hearAboutUs + "</td></tr>");
        out.println("</table>");
        out.println("</body></html>");
        
       
        req.setAttribute("fname", fname);
        req.setAttribute("lname", lname);
        req.setAttribute("email", email);
        req.setAttribute("city", city);
        req.setAttribute("password", password);
        req.setAttribute("fileName", fileName);
        req.setAttribute("age", age);
        req.setAttribute("hearAboutUs", hearAboutUs);
        req.getRequestDispatcher("displayinfo.jsp").forward(req, res);
        
    }
}