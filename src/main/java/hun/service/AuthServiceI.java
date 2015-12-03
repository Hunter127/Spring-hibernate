package hun.service;

import hun.model.vo.Auth;
import hun.model.vo.TreeNode;

import java.util.List;

public interface AuthServiceI {
	
	public void add(Auth auth);

	public void edit(Auth auth);

	public void delete(Auth auth);

	public List<Auth> treegrid(Auth auth);

	public List<TreeNode> tree(Auth auth, boolean b);

}
