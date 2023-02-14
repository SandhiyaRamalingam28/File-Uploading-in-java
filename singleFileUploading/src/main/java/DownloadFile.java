import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/download")
@WebServlet("/servlet/DownloadServlet")
public class DownloadFile extends HttpServlet {

    // @Override
    // protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
    // ServletException, IOException {
    // // Get PrintWriter object
    // PrintWriter out = resp.getWriter();
    // // File name
    // String pdfName = "DataStructureDownload.txt";
    // // File path
    // String pdfPath = "D:\\sandhiya";

    // // Set the content type and header of the response.
    // resp.setContentType("application/msword");
    // resp.setHeader("Content-Disposition",
    // "attachment; filename=\""
    // + pdfName + "\"");

    // // Get FileInputStream object to identify the path
    // FileInputStream inputStream
    // = new FileInputStream(pdfPath + pdfName);

    // // Loop through the document and write into the
    // // output.
    // int in;
    // while ((in = inputStream.read()) != -1) {
    // out.write(in);
    // }

    // // Close FileInputStream and PrintWriter object
    // inputStream.close();
    // out.close();
    // }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String filename = "welcome.txt"; 
        String filepath = "D:\\";
        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

        FileInputStream fileInputStream = new FileInputStream(filepath + filename);

        int i;
        while ((i = fileInputStream.read()) != -1) {
            out.write(i);
        }
        fileInputStream.close();
        out.close();
    }
}
