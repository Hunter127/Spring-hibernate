package hun.interceptors;

import hun.model.vo.SessionInfo;
import hun.util.ResourceUtil;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 实现Spring拦截器的安全验证
 * @author hun
 * @Description: TODO
 * @date 2015年12月1日 上午10:34:13
 */
public class SecurityInterceptor implements HandlerInterceptor {
	
	private static final Logger logger = Logger.getLogger(SecurityInterceptor.class);

	private List<String> excludeUrls;

	public List<String> getExcludeUrls() {
		return excludeUrls;
	}

	public void setExcludeUrls(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		String requestUrl = arg0.getRequestURI();
		String contextPath = arg0.getContextPath();
		String url = requestUrl.substring(contextPath.length());
		//路径验证
		if(url.indexOf("/baseController/") > -1 || excludeUrls.contains(url)){
			return true;
		}
		SessionInfo sInfo = (SessionInfo)arg0.getSession().getAttribute(ResourceUtil.getSessionInfoName());
	    
		if(sInfo ==null || sInfo.getLoginName().equalsIgnoreCase("")){
			logger.info("没登录...");
			arg0.getRequestDispatcher("/error/404.jsp").forward(arg0, arg1);
		}
		if(!sInfo.getAuthUrls().contains(url)){
			logger.info("has no authority");
			return false;
		}
		return true;
	}

}
