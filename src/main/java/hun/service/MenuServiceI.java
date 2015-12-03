package hun.service;

import hun.model.vo.Menu;
import hun.model.vo.TreeNode;

import java.util.List;

public interface MenuServiceI {
	public List<Menu> treegrid(Menu menu);
	
	public List<TreeNode> tree(Menu menu,Boolean b);

}
