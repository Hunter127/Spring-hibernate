package hun.service;

import hun.model.vo.DataGrid;
import hun.model.vo.Online;

public interface OnlineServiceI {
	public void saveOrUpdateTonlineByLoginAndIp(String loginName, String id);

	public void deleteTonlineByLoginNameAndIp(String loginName, String ip);

	public DataGrid datagrid(Online online);

}
