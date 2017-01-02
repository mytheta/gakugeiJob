package gakugeiJob.dto;

import java.io.Serializable;

import org.seasar.framework.container.annotation.tiger.Component;
import org.seasar.framework.container.annotation.tiger.InstanceType;

@Component(instance = InstanceType.SESSION)
public class EnterpriseDto implements Serializable{
	private static final long serialVersionUID = 1L;

	public String userId = null;
	
	public Integer enterpriseId = null;
	
	public Boolean isLogin(){
		if(userId != null){
			return true;
		} else{
			return false;
		}
	}
}
