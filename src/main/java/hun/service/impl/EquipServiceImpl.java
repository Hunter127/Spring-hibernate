package hun.service.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import hun.model.vo.DataGrid;
import hun.model.vo.Equip;
import hun.service.EquipServiceI;
@Service("equipService")
public class EquipServiceImpl implements EquipServiceI {

	@Override
	public void save(Equip equip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Equip equip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataGrid datagrid(Equip equip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exportExcelFile(HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
