package com.highradius;

import java.io.IOException;
import java.io.*;
/**
 * Servlet implementation class formdataservlet
 */
@WebServlet("/formdataservlet")
public class formdataservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public formdataservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param <HttpServletRequest>
	 * @param <HttpServletResponse>
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected <HttpServletRequest, HttpServletResponse> void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
