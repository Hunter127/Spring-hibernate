package hun.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDaoI<T> {
	public Serializable save(T o);
	public void delect(T o);
	public void update(T o);
	public void saveOrUpdate(T o);
	
	public List<T> find(String hql);
	public List findSQL(String hql);
	public List findSQL(String hql,Class T);
	public List<T> find(String hql,Object[] param);
	public List<T> find(String hql,List<Object> param);
	public List<T> find(String hql,Object[] param,Integer page,Integer rows);
	public List<T> find(String hql,List<Object> param,Integer page,Integer rows);

	public T get(Class<T> c,Serializable id);
	public T get(String hql,Object[] param);
	public T get(String hql,List<Object> param);
	
	public Long count(String hql);
	public Long count(String hql,Object[] param);
	public Long count(String hql,List<Object> param);
	
	public Integer excuteHql(String hql);
	public Integer excuteHql(String hql,Object[] param);
	public Integer excuteHql(String hql,List<Object> param);
}
