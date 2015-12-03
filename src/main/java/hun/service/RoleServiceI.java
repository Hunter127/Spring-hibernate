package hun.service;

import hun.model.vo.DataGrid;
import hun.model.vo.Role;

import java.util.List;

public interface RoleServiceI {
	public void add(Role role);

	public void edit(Role role);

	public void delete(String ids);

	public DataGrid datagrid(Role role);

	public List<Role> combobox();

}
