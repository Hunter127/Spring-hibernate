package hun.service.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

import hun.model.vo.DataGrid;
import hun.model.vo.Log;
import hun.service.LogServiceI;
@Service("logService")
public class LogServiceImpl implements LogServiceI {

	@Override
	public void beforeLog(JoinPoint point) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterLog(JoinPoint point) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object aroundLog(ProceedingJoinPoint point) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataGrid datagrid(Log log) {
		// TODO Auto-generated method stub
		return null;
	}

}
