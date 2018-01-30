package mutation.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mutation.model.ResultModel;

/**
 * Servlet implementation class MutationServelet
 */
@WebServlet("/MutationServelet")
public class MutationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MutationServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		
		String proteinid=request.getParameter("proteinid");  
        String mutation=request.getParameter("mutation");
        
        //Recuperar no banco a sequêcia e a família
        //Verificar no Banco se o aa original e a posição conferem na sequência
        //Calcular a conservação para ambos os aminoacidos
        //Calcular uma mini rede de correlação contendo os resíduos envolvidos e seus vizinhos
        //Verificar se há anotações relativas a sítio
        //Recuperar estruturas e calcular distâncias para os sítios
        //Gerar um mutante com o modeller
        //Calcular área acessível ao solvente
        //Verificar se existem webservices de predição de efeito de mutação
        //Gerar relatórios
        //Implantar sistema de filas
        //Paralelamente implementar front-end e visualizações de dados
        
        
        
        
        
        ResultModel result = new ResultModel(proteinid,mutation);
        
        request.setAttribute("result", result);
        RequestDispatcher rd=request.getRequestDispatcher("jsp/result.jsp");  
        rd.forward(request, response);
	}

}
