package hun.filter;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
/**
 * If there if error in uploading a file, return a picture.
 * @author hun
 * @Description: TODO
 * @date 2015年12月1日 下午12:13:52
 */
public class ErrorImgFilter extends HttpServlet implements Filter{
	private static final Logger logger = Logger.getLogger(ErrorImgFilter.class);

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse res = (HttpServletResponse) arg1;
		String realPath = req.getSession().getServletContext().getRealPath("/");
		String contextpath = req.getContextPath();
		String requestURL = req.getRequestURL().toString();
		
		String fileUrl = realPath + requestURL.substring(contextpath.length());
		File f = new File(fileUrl);
		if(!f.exists()){
			arg0.getRequestDispatcher("/error/notfound.png").forward(arg0, arg1);
			return;
		}
		arg2.doFilter(arg0, arg1);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
