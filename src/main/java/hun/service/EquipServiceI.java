package hun.service;

import hun.model.vo.DataGrid;
import hun.model.vo.Equip;

import javax.servlet.http.HttpServletResponse;

public interface EquipServiceI {
	public void save(Equip equip);

	public void update(Equip equip);

	public void delete(String ids);

	public DataGrid datagrid(Equip equip);

	public void exportExcelFile(HttpServletResponse response);

}
