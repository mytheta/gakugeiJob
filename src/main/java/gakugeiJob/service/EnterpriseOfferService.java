package gakugeiJob.service;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.EnterpriseAplicantCB;
import gakugeiJob.db.cbean.EnterpriseFavoCB;
import gakugeiJob.db.cbean.EnterpriseOfferCB;
import gakugeiJob.db.exbhv.EnterpriseAplicantBhv;
import gakugeiJob.db.exbhv.EnterpriseFavoBhv;
import gakugeiJob.db.exbhv.EnterpriseOfferBhv;
import gakugeiJob.db.exentity.EnterpriseAplicant;
import gakugeiJob.db.exentity.EnterpriseFavo;
import gakugeiJob.db.exentity.EnterpriseOffer;

public class EnterpriseOfferService {
	@Binding(bindingType = BindingType.MUST)
	protected EnterpriseOfferBhv enterpriseOfferBhv;
	
	@Binding(bindingType = BindingType.MUST)
	protected EnterpriseAplicantBhv enterpriseAplicantBhv;
	
	@Binding(bindingType = BindingType.MUST)
	protected EnterpriseFavoBhv enterpriseFavoBhv;
	
	public ListResultBean<EnterpriseOffer> selectAll(){
		EnterpriseOfferCB enterpriseOfferCB = new EnterpriseOfferCB();
		enterpriseOfferCB.query().addOrderBy_JobOfferId_Desc();
		return enterpriseOfferBhv.selectList(enterpriseOfferCB);
	}
	
	public ListResultBean<EnterpriseAplicant> selectAllAplicant(){
		EnterpriseAplicantCB enterpriseAplicantCB = new EnterpriseAplicantCB();
		return enterpriseAplicantBhv.selectList(enterpriseAplicantCB);
	}
	
	public ListResultBean<EnterpriseFavo> selectAllFavo(){
		EnterpriseFavoCB enterpriseFavoCB = new EnterpriseFavoCB();
		return enterpriseFavoBhv.selectList(enterpriseFavoCB);
	}
	
	public void insertEnterpriseAplicant(int jobOfferId, int studentId, String title, String content){
		EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
		enterpriseAplicant.setJobOfferId(jobOfferId);
		enterpriseAplicant.setStudentId(studentId);
		enterpriseAplicant.setTitle(title);
		enterpriseAplicant.setContent(content);
		enterpriseAplicantBhv.insert(enterpriseAplicant);
	}
	
	public void insertEnterpriseFavo(int jobOfferId, int studentId){
		EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
		enterpriseFavo.setJobOfferId(jobOfferId);
		enterpriseFavo.setStudentId(studentId);
		enterpriseFavoBhv.insert(enterpriseFavo);
	}
	
	public void updateEnterpriseFavo(int enterpriseOfferId){
		EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
		enterpriseOffer = enterpriseOfferBhv.selectByPKValue(enterpriseOfferId);
		int fixedFavo = enterpriseOffer.getFavo() + 1;
		enterpriseOffer.setFavo(fixedFavo);
		enterpriseOfferBhv.update(enterpriseOffer);
	}
	
	public void deleteFavo(int jobOfferId, int studentId){
		EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
		enterpriseFavo.setJobOfferId(jobOfferId);
		enterpriseFavo.setStudentId(studentId);
		enterpriseFavoBhv.delete(enterpriseFavo);
		
		EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
		enterpriseOffer = enterpriseOfferBhv.selectByPKValue(jobOfferId);
		int fixedFavo = enterpriseOffer.getFavo() - 1;
		enterpriseOffer.setFavo(fixedFavo);
		enterpriseOfferBhv.update(enterpriseOffer);
	}
	
	public void deleteAplicant(int jobOfferId, int studentId){
		EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
		enterpriseAplicant.setJobOfferId(jobOfferId);
		enterpriseAplicant.setStudentId(studentId);
		enterpriseAplicantBhv.delete(enterpriseAplicant);
	}

	public ListResultBean<EnterpriseAplicant> selectAplicant(int jobOfferId) {
		EnterpriseAplicantCB enterpriseAplicantCB = new EnterpriseAplicantCB();
		EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
		enterpriseAplicant.setJobOfferId(jobOfferId);
		enterpriseAplicantCB.query().equals(enterpriseAplicant);
		return enterpriseAplicantBhv.selectList(enterpriseAplicantCB);
	}
}
