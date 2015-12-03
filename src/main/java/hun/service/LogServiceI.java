package hun.service;

import hun.model.vo.DataGrid;
import hun.model.vo.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public interface LogServiceI {

	public void beforeLog(JoinPoint point);

	public void afterLog(JoinPoint point);

	public Object aroundLog(ProceedingJoinPoint point);

	public DataGrid datagrid(Log log);
}
