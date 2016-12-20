package gakugeiJob.requestprocessor;


import java.io.IOException;
import java.lang.annotation.Annotation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gakugeiJob.dto.StudentDto;
import gakugeiJob.dto.AdminDto;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.dto.SchoolDto;

import org.apache.struts.action.ActionMapping;
import org.apache.struts.config.ForwardConfig;
import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.struts.action.S2RequestProcessor;
import org.seasar.struts.config.S2ExecuteConfig;
import org.seasar.struts.util.S2ExecuteConfigUtil;

public class AuthRequestProcessor extends S2RequestProcessor{
	@Override
	protected boolean processRoles(HttpServletRequest request, HttpServletResponse response, ActionMapping mapping) throws IOException, ServletException{
		S2ExecuteConfig executeConfig = S2ExecuteConfigUtil.getExecuteConfig();
		Annotation[] annotations = executeConfig.getMethod().getAnnotations();

		for(Annotation annotation: annotations){
			// Check @AdminAuth
			if(annotation.annotationType().getName().equals("gakugeiJob.annotation.AdminAuth")){
				Object object = SingletonS2Container.getComponent(AdminDto.class);
				BeanDesc beanDesc = BeanDescFactory.getBeanDesc(object.getClass());
				Boolean isLogin = (Boolean)beanDesc.invoke(object, "isLogin", null);
				if(!isLogin){
					ForwardConfig forwardConfig = new ForwardConfig();
					forwardConfig.setPath("/");
					forwardConfig.setRedirect(true);
					super.processForwardConfig(request, response, forwardConfig);
					return false;
				}
			}

			// Check @StudentAuth
			if(annotation.annotationType().getName().equals("gakugeiJob.annotation.StudentAuth")){
				Object object = SingletonS2Container.getComponent(StudentDto.class);
				BeanDesc beanDesc = BeanDescFactory.getBeanDesc(object.getClass());
				Boolean isLogin = (Boolean)beanDesc.invoke(object, "isLogin", null);

				if(!isLogin){
					ForwardConfig forwardConfig = new ForwardConfig();
					forwardConfig.setPath("/");
					forwardConfig.setRedirect(true);
					super.processForwardConfig(request, response, forwardConfig);
					return false;
				}
			}
			// Check @EnterpriseAuth
			if(annotation.annotationType().getName().equals("gakugeiJob.annotation.EnterpriseAuth")){
				Object object = SingletonS2Container.getComponent(StudentDto.class);
				BeanDesc beanDesc = BeanDescFactory.getBeanDesc(object.getClass());
				Boolean isLogin = (Boolean)beanDesc.invoke(object, "isLogin", null);

				if(!isLogin){
					ForwardConfig forwardConfig = new ForwardConfig();
					forwardConfig.setPath("/");
					forwardConfig.setRedirect(true);
					super.processForwardConfig(request, response, forwardConfig);
					return false;
				}
			}
			// Check @SchoolAuth
				if(annotation.annotationType().getName().equals("gakugeiJob.annotation.SchoolAuth")){
					Object object = SingletonS2Container.getComponent(StudentDto.class);
					BeanDesc beanDesc = BeanDescFactory.getBeanDesc(object.getClass());
					Boolean isLogin = (Boolean)beanDesc.invoke(object, "isLogin", null);

					if(!isLogin){
						ForwardConfig forwardConfig = new ForwardConfig();
						forwardConfig.setPath("/");
						forwardConfig.setRedirect(true);
						super.processForwardConfig(request, response, forwardConfig);
						return false;
				}
			}			
		}
		return super.processRoles(request, response, mapping);
	}
}