package hun.service.impl;

import org.springframework.stereotype.Service;

import hun.model.vo.DataGrid;
import hun.model.vo.Online;
import hun.service.OnlineServiceI;
@Service("onlineService")
public class OnlineServiceImpl implements OnlineServiceI {

	@Override
	public void saveOrUpdateTonlineByLoginAndIp(String loginName, String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTonlineByLoginNameAndIp(String loginName, String ip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataGrid datagrid(Online online) {
		// TODO Auto-generated method stub
		return null;
	}

}
