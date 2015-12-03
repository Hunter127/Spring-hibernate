package hun.util;

import java.util.ResourceBundle;

/**
 * 配置参数
 * 使用国际化资源配置         直接加载config.properties   
 * 
 * @author hun
 * @Description: TODO
 * @date 2015年12月1日 上午11:37:05
 */
public class ResourceUtil {
	private static final ResourceBundle bundle = java.util.ResourceBundle
			.getBundle("config");

	private void ResourceUtil() {

	}

	public static final String getSessionInfoName() {
		return bundle.getString("sessionInfoName");
	}

	public static final String getUploadFieldName() {
		// TODO Auto-generated method stub
		return bundle.getString("uploadFieldName");
	}
	public static final long getUploadFileMaxSize(){
		return Long.valueOf(bundle.getString("uploadFileMaxSize"));
	}
	public static final String getUploadFileExts(){
		return bundle.getString("uploadFileExts");
	}

	public static final String getUploadDirectory(){
		return bundle.getString("uploadDirectory");
	}
}
