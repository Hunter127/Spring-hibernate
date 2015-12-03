package hun.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import hun.model.vo.Menu;
import hun.model.vo.TreeNode;
import hun.service.MenuServiceI;
@Service("menuService")
public class MenuServiceImpl implements MenuServiceI {

	@Override
	public List<Menu> treegrid(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TreeNode> tree(Menu menu, Boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}
