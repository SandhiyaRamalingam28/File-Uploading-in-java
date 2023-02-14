import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.oreilly.servlet.MultipartRequest;


@WebServlet("/MFUploading")
@MultipartConfig
public class MultipleFileUploading extends HttpServlet{

    private static final long serialVersionUID = 1L;

    // @Override
    // protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //     // String path="src\\main\\webapp\\files"; 
    //     String path=getServletContext().getRealPath("");
    //     for(Part p : req.getParts())
    //     {
    //         p.write(path+File.separator+extractFileName(p));
    //     }
         
    //     resp.getWriter().println("Your files are uploaded!");
    // }
    // private String extractFileName(Part part) {
    //     String contentDisp = part.getHeader("content-disposition");
    //     String[] items = contentDisp.split(";");
    //     for (String s : items) {
    //         if (s.trim().startsWith("filename")) {
    //             return s.substring(s.indexOf("=") + 3, s.length()-1);
    //         }
    //     }
    //     return "";
    // }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();
        response.setContentType("text/html");
         
        // String path=getServletContext().getRealPath("");
        String path="src\\main\\webapp\\files";
        MultipartRequest mpr=new MultipartRequest(request,path,20*1024*1024);
         
        writer.println("Your files are uploaded!");
    }

}
