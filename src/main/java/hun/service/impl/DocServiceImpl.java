package hun.service.impl;

import org.springframework.stereotype.Service;

import hun.model.vo.DataGrid;
import hun.model.vo.Doc;
import hun.service.DocServiceI;
/**
 * 多个实现类，还是写一下注解名
 * @author hun
 * @Description: TODO
 * @date 2015年12月1日 下午1:35:49
 */
@Service("docService")
public class DocServiceImpl implements DocServiceI {

	@Override
	public void save(Doc doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Doc doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataGrid datagrid(Doc doc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void upload(Doc doc, String fileName) {
		// TODO Auto-generated method stub
		
	}

}
