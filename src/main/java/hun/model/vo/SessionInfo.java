package hun.model.vo;
/**
 * 构建session对象的视图模型
 * @author hun
 * @Description: TODO
 * @date 2015年12月1日 上午11:51:25
 */
public class SessionInfo {
	private String userId;
	private String loginName;
	private String loginPassword;
	private String ip;
	private String authIds;
	private String authUrls;
	private String roleIds;
	private String roleNames;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAuthIds() {
		return authIds;
	}
	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}
	public String getAuthUrls() {
		return authUrls;
	}
	public void setAuthUrls(String authUrls) {
		this.authUrls = authUrls;
	}
	public String getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}
	public String getRoleNames() {
		return roleNames;
	}
	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}
	@Override
	public String toString() {
		return loginName;
	}
	
	

}
