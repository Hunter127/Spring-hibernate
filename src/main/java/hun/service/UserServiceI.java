package hun.service;

import hun.model.vo.DataGrid;
import hun.model.vo.RoleChart;
import hun.model.vo.User;

import java.util.List;

public interface UserServiceI {
	public User login(User user);

	public void save(User user);

	public void update(User user);

	public void delete(User user);

	public void roleEdit(User user);

	public DataGrid datagrid(User user);

	public List<User> combobx(User user);

	public List<RoleChart> countRole();

}
