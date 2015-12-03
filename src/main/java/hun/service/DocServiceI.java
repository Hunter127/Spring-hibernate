package hun.service;

import hun.model.vo.DataGrid;
import hun.model.vo.Doc;

public interface DocServiceI {
	public void save(Doc doc);

	public void update(Doc doc);

	public void delete(String ids);

	public DataGrid datagrid(Doc doc);

	public void upload(Doc doc, String fileName);

}
