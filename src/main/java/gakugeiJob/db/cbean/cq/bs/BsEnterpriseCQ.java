package gakugeiJob.db.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import gakugeiJob.db.cbean.cq.ciq.*;
import gakugeiJob.db.cbean.*;
import gakugeiJob.db.cbean.cq.*;

/**
 * The base condition-query of enterprise.
 * @author DBFlute(AutoGenerator)
 */
public class BsEnterpriseCQ extends AbstractBsEnterpriseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEnterpriseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from enterprise) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EnterpriseCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EnterpriseCIQ xcreateCIQ() {
        EnterpriseCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EnterpriseCIQ xnewCIQ() {
        return new EnterpriseCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join enterprise on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EnterpriseCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EnterpriseCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _enterpriseId;
    public ConditionValue getEnterpriseId() {
        if (_enterpriseId == null) { _enterpriseId = nCV(); }
        return _enterpriseId;
    }
    protected ConditionValue getCValueEnterpriseId() { return getEnterpriseId(); }

    protected Map<String, EnterpriseOfferCQ> _enterpriseId_ExistsReferrer_EnterpriseOfferListMap;
    public Map<String, EnterpriseOfferCQ> getEnterpriseId_ExistsReferrer_EnterpriseOfferList() { return _enterpriseId_ExistsReferrer_EnterpriseOfferListMap; }
    public String keepEnterpriseId_ExistsReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery) {
        if (_enterpriseId_ExistsReferrer_EnterpriseOfferListMap == null) { _enterpriseId_ExistsReferrer_EnterpriseOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_ExistsReferrer_EnterpriseOfferListMap.size() + 1);
        _enterpriseId_ExistsReferrer_EnterpriseOfferListMap.put(key, subQuery); return "enterpriseId_ExistsReferrer_EnterpriseOfferList." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _enterpriseId_NotExistsReferrer_EnterpriseOfferListMap;
    public Map<String, EnterpriseOfferCQ> getEnterpriseId_NotExistsReferrer_EnterpriseOfferList() { return _enterpriseId_NotExistsReferrer_EnterpriseOfferListMap; }
    public String keepEnterpriseId_NotExistsReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery) {
        if (_enterpriseId_NotExistsReferrer_EnterpriseOfferListMap == null) { _enterpriseId_NotExistsReferrer_EnterpriseOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_NotExistsReferrer_EnterpriseOfferListMap.size() + 1);
        _enterpriseId_NotExistsReferrer_EnterpriseOfferListMap.put(key, subQuery); return "enterpriseId_NotExistsReferrer_EnterpriseOfferList." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferListMap;
    public Map<String, EnterpriseOfferCQ> getEnterpriseId_SpecifyDerivedReferrer_EnterpriseOfferList() { return _enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferListMap; }
    public String keepEnterpriseId_SpecifyDerivedReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery) {
        if (_enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferListMap == null) { _enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferListMap.size() + 1);
        _enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferListMap.put(key, subQuery); return "enterpriseId_SpecifyDerivedReferrer_EnterpriseOfferList." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _enterpriseId_InScopeRelation_EnterpriseOfferListMap;
    public Map<String, EnterpriseOfferCQ> getEnterpriseId_InScopeRelation_EnterpriseOfferList() { return _enterpriseId_InScopeRelation_EnterpriseOfferListMap; }
    public String keepEnterpriseId_InScopeRelation_EnterpriseOfferList(EnterpriseOfferCQ subQuery) {
        if (_enterpriseId_InScopeRelation_EnterpriseOfferListMap == null) { _enterpriseId_InScopeRelation_EnterpriseOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_InScopeRelation_EnterpriseOfferListMap.size() + 1);
        _enterpriseId_InScopeRelation_EnterpriseOfferListMap.put(key, subQuery); return "enterpriseId_InScopeRelation_EnterpriseOfferList." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _enterpriseId_NotInScopeRelation_EnterpriseOfferListMap;
    public Map<String, EnterpriseOfferCQ> getEnterpriseId_NotInScopeRelation_EnterpriseOfferList() { return _enterpriseId_NotInScopeRelation_EnterpriseOfferListMap; }
    public String keepEnterpriseId_NotInScopeRelation_EnterpriseOfferList(EnterpriseOfferCQ subQuery) {
        if (_enterpriseId_NotInScopeRelation_EnterpriseOfferListMap == null) { _enterpriseId_NotInScopeRelation_EnterpriseOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_NotInScopeRelation_EnterpriseOfferListMap.size() + 1);
        _enterpriseId_NotInScopeRelation_EnterpriseOfferListMap.put(key, subQuery); return "enterpriseId_NotInScopeRelation_EnterpriseOfferList." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListMap;
    public Map<String, EnterpriseOfferCQ> getEnterpriseId_QueryDerivedReferrer_EnterpriseOfferList() { return _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListMap; }
    public String keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery) {
        if (_enterpriseId_QueryDerivedReferrer_EnterpriseOfferListMap == null) { _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_QueryDerivedReferrer_EnterpriseOfferListMap.size() + 1);
        _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListMap.put(key, subQuery); return "enterpriseId_QueryDerivedReferrer_EnterpriseOfferList." + key;
    }
    protected Map<String, Object> _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameterMap;
    public Map<String, Object> getEnterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameter() { return _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameterMap; }
    public String keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameter(Object parameterValue) {
        if (_enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameterMap == null) { _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameterMap.size() + 1);
        _enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameterMap.put(key, parameterValue); return "enterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_EnterpriseId_Asc() { regOBA("enterprise_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_EnterpriseId_Desc() { regOBD("enterprise_id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue getUserId() {
        if (_userId == null) { _userId = nCV(); }
        return _userId;
    }
    protected ConditionValue getCValueUserId() { return getUserId(); }

    protected Map<String, LoginCQ> _userId_InScopeRelation_LoginMap;
    public Map<String, LoginCQ> getUserId_InScopeRelation_Login() { return _userId_InScopeRelation_LoginMap; }
    public String keepUserId_InScopeRelation_Login(LoginCQ subQuery) {
        if (_userId_InScopeRelation_LoginMap == null) { _userId_InScopeRelation_LoginMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_LoginMap.size() + 1);
        _userId_InScopeRelation_LoginMap.put(key, subQuery); return "userId_InScopeRelation_Login." + key;
    }

    protected Map<String, LoginCQ> _userId_NotInScopeRelation_LoginMap;
    public Map<String, LoginCQ> getUserId_NotInScopeRelation_Login() { return _userId_NotInScopeRelation_LoginMap; }
    public String keepUserId_NotInScopeRelation_Login(LoginCQ subQuery) {
        if (_userId_NotInScopeRelation_LoginMap == null) { _userId_NotInScopeRelation_LoginMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_LoginMap.size() + 1);
        _userId_NotInScopeRelation_LoginMap.put(key, subQuery); return "userId_NotInScopeRelation_Login." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = nCV(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    /** 
     * Add order-by as ascend. <br />
     * name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br />
     * name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _foundingDate;
    public ConditionValue getFoundingDate() {
        if (_foundingDate == null) { _foundingDate = nCV(); }
        return _foundingDate;
    }
    protected ConditionValue getCValueFoundingDate() { return getFoundingDate(); }

    /** 
     * Add order-by as ascend. <br />
     * founding_date: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_FoundingDate_Asc() { regOBA("founding_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * founding_date: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_FoundingDate_Desc() { regOBD("founding_date"); return this; }

    protected ConditionValue _founderName;
    public ConditionValue getFounderName() {
        if (_founderName == null) { _founderName = nCV(); }
        return _founderName;
    }
    protected ConditionValue getCValueFounderName() { return getFounderName(); }

    /** 
     * Add order-by as ascend. <br />
     * founder_name: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_FounderName_Asc() { regOBA("founder_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * founder_name: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_FounderName_Desc() { regOBD("founder_name"); return this; }

    protected ConditionValue _address;
    public ConditionValue getAddress() {
        if (_address == null) { _address = nCV(); }
        return _address;
    }
    protected ConditionValue getCValueAddress() { return getAddress(); }

    /** 
     * Add order-by as ascend. <br />
     * address: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br />
     * address: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

    protected ConditionValue _capital;
    public ConditionValue getCapital() {
        if (_capital == null) { _capital = nCV(); }
        return _capital;
    }
    protected ConditionValue getCValueCapital() { return getCapital(); }

    /** 
     * Add order-by as ascend. <br />
     * capital: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Capital_Asc() { regOBA("capital"); return this; }

    /**
     * Add order-by as descend. <br />
     * capital: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Capital_Desc() { regOBD("capital"); return this; }

    protected ConditionValue _presidentName;
    public ConditionValue getPresidentName() {
        if (_presidentName == null) { _presidentName = nCV(); }
        return _presidentName;
    }
    protected ConditionValue getCValuePresidentName() { return getPresidentName(); }

    /** 
     * Add order-by as ascend. <br />
     * president_name: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_PresidentName_Asc() { regOBA("president_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * president_name: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_PresidentName_Desc() { regOBD("president_name"); return this; }

    protected ConditionValue _numOfEmployees;
    public ConditionValue getNumOfEmployees() {
        if (_numOfEmployees == null) { _numOfEmployees = nCV(); }
        return _numOfEmployees;
    }
    protected ConditionValue getCValueNumOfEmployees() { return getNumOfEmployees(); }

    /** 
     * Add order-by as ascend. <br />
     * num_of_employees: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_NumOfEmployees_Asc() { regOBA("num_of_employees"); return this; }

    /**
     * Add order-by as descend. <br />
     * num_of_employees: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_NumOfEmployees_Desc() { regOBD("num_of_employees"); return this; }

    protected ConditionValue _business;
    public ConditionValue getBusiness() {
        if (_business == null) { _business = nCV(); }
        return _business;
    }
    protected ConditionValue getCValueBusiness() { return getBusiness(); }

    /** 
     * Add order-by as ascend. <br />
     * business: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Business_Asc() { regOBA("business"); return this; }

    /**
     * Add order-by as descend. <br />
     * business: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Business_Desc() { regOBD("business"); return this; }

    protected ConditionValue _phoneNumber;
    public ConditionValue getPhoneNumber() {
        if (_phoneNumber == null) { _phoneNumber = nCV(); }
        return _phoneNumber;
    }
    protected ConditionValue getCValuePhoneNumber() { return getPhoneNumber(); }

    /** 
     * Add order-by as ascend. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_PhoneNumber_Asc() { regOBA("phone_number"); return this; }

    /**
     * Add order-by as descend. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_PhoneNumber_Desc() { regOBD("phone_number"); return this; }

    protected ConditionValue _url;
    public ConditionValue getUrl() {
        if (_url == null) { _url = nCV(); }
        return _url;
    }
    protected ConditionValue getCValueUrl() { return getUrl(); }

    /** 
     * Add order-by as ascend. <br />
     * url: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Url_Asc() { regOBA("url"); return this; }

    /**
     * Add order-by as descend. <br />
     * url: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_Url_Desc() { regOBD("url"); return this; }

    protected ConditionValue _oneThing;
    public ConditionValue getOneThing() {
        if (_oneThing == null) { _oneThing = nCV(); }
        return _oneThing;
    }
    protected ConditionValue getCValueOneThing() { return getOneThing(); }

    /** 
     * Add order-by as ascend. <br />
     * one_thing: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_OneThing_Asc() { regOBA("one_thing"); return this; }

    /**
     * Add order-by as descend. <br />
     * one_thing: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_OneThing_Desc() { regOBD("one_thing"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue getMailAddress() {
        if (_mailAddress == null) { _mailAddress = nCV(); }
        return _mailAddress;
    }
    protected ConditionValue getCValueMailAddress() { return getMailAddress(); }

    /** 
     * Add order-by as ascend. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_MailAddress_Asc() { regOBA("mail_address"); return this; }

    /**
     * Add order-by as descend. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addOrderBy_MailAddress_Desc() { regOBD("mail_address"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsEnterpriseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        EnterpriseCQ baseQuery = (EnterpriseCQ)baseQueryAsSuper;
        EnterpriseCQ unionQuery = (EnterpriseCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryLogin()) {
            unionQuery.queryLogin().reflectRelationOnUnionQuery(baseQuery.queryLogin(), unionQuery.queryLogin());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * login by my user_id, named 'login'.
     * @return The instance of condition-query. (NotNull)
     */
    public LoginCQ queryLogin() {
        return getConditionQueryLogin();
    }
    protected LoginCQ _conditionQueryLogin;
    public LoginCQ getConditionQueryLogin() {
        if (_conditionQueryLogin == null) {
            _conditionQueryLogin = xcreateQueryLogin();
            xsetupOuterJoinLogin();
        }
        return _conditionQueryLogin;
    }
    protected LoginCQ xcreateQueryLogin() {
        String nrp = resolveNextRelationPath("enterprise", "login");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        LoginCQ cq = new LoginCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("login");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLogin() {
        LoginCQ cq = getConditionQueryLogin();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("user_id", "user_id");
        registerOuterJoin(cq, joinOnMap, "login");
    }
    public boolean hasConditionQueryLogin() {
        return _conditionQueryLogin != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, EnterpriseCQ> _scalarConditionMap;
    public Map<String, EnterpriseCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(EnterpriseCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, EnterpriseCQ> _specifyMyselfDerivedMap;
    public Map<String, EnterpriseCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(EnterpriseCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, EnterpriseCQ> _queryMyselfDerivedMap;
    public Map<String, EnterpriseCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(EnterpriseCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, EnterpriseCQ> _myselfExistsMap;
    public Map<String, EnterpriseCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(EnterpriseCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, EnterpriseCQ> _myselfInScopeMap;
    public Map<String, EnterpriseCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(EnterpriseCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EnterpriseCB.class.getName(); }
    protected String xCQ() { return EnterpriseCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
