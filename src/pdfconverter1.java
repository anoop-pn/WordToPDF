import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

/**
@ Author: Anoop P N


***/
/**
 * Servlet implementation class pdfconverter1
 */
@WebServlet("/pdfconverter1")
public class pdfconverter1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public pdfconverter1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String inputFile =request.getParameter("inputfile");
		String outputFile =request.getParameter("outfile");
        PrintWriter out=response.getWriter();

		Document pdfDocument = new Document();
		String pdfFilePath = outputFile;
		try
		{
		FileOutputStream fileOutputStream = new FileOutputStream(pdfFilePath);
		PdfWriter writer = null;
		writer = PdfWriter.getInstance(pdfDocument, fileOutputStream);
		writer.open();
		pdfDocument.open();

		File file1 = new File(inputFile);
		pdfDocument.add(new Paragraph(org.apache.commons.io.FileUtils.readFileToString(file1)));

		 out.println("<center><h1>succesfully created pdf file</center><h1>");
		 Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +outputFile);
		pdfDocument.close();
		writer.close();
		}
		catch (Exception exception)
		{
		out.println("Document Exception!" + exception);
		}
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

