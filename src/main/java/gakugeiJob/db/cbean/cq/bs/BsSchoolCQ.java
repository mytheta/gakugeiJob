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
 * The base condition-query of school.
 * @author DBFlute(AutoGenerator)
 */
public class BsSchoolCQ extends AbstractBsSchoolCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSchoolCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from school) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SchoolCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SchoolCIQ xcreateCIQ() {
        SchoolCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SchoolCIQ xnewCIQ() {
        return new SchoolCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join school on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SchoolCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SchoolCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _schoolId;
    public ConditionValue getSchoolId() {
        if (_schoolId == null) { _schoolId = nCV(); }
        return _schoolId;
    }
    protected ConditionValue getCValueSchoolId() { return getSchoolId(); }

    protected Map<String, SchoolOfferCQ> _schoolId_ExistsReferrer_SchoolOfferListMap;
    public Map<String, SchoolOfferCQ> getSchoolId_ExistsReferrer_SchoolOfferList() { return _schoolId_ExistsReferrer_SchoolOfferListMap; }
    public String keepSchoolId_ExistsReferrer_SchoolOfferList(SchoolOfferCQ subQuery) {
        if (_schoolId_ExistsReferrer_SchoolOfferListMap == null) { _schoolId_ExistsReferrer_SchoolOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_ExistsReferrer_SchoolOfferListMap.size() + 1);
        _schoolId_ExistsReferrer_SchoolOfferListMap.put(key, subQuery); return "schoolId_ExistsReferrer_SchoolOfferList." + key;
    }

    protected Map<String, SchoolOfferCQ> _schoolId_NotExistsReferrer_SchoolOfferListMap;
    public Map<String, SchoolOfferCQ> getSchoolId_NotExistsReferrer_SchoolOfferList() { return _schoolId_NotExistsReferrer_SchoolOfferListMap; }
    public String keepSchoolId_NotExistsReferrer_SchoolOfferList(SchoolOfferCQ subQuery) {
        if (_schoolId_NotExistsReferrer_SchoolOfferListMap == null) { _schoolId_NotExistsReferrer_SchoolOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_NotExistsReferrer_SchoolOfferListMap.size() + 1);
        _schoolId_NotExistsReferrer_SchoolOfferListMap.put(key, subQuery); return "schoolId_NotExistsReferrer_SchoolOfferList." + key;
    }

    protected Map<String, SchoolOfferCQ> _schoolId_SpecifyDerivedReferrer_SchoolOfferListMap;
    public Map<String, SchoolOfferCQ> getSchoolId_SpecifyDerivedReferrer_SchoolOfferList() { return _schoolId_SpecifyDerivedReferrer_SchoolOfferListMap; }
    public String keepSchoolId_SpecifyDerivedReferrer_SchoolOfferList(SchoolOfferCQ subQuery) {
        if (_schoolId_SpecifyDerivedReferrer_SchoolOfferListMap == null) { _schoolId_SpecifyDerivedReferrer_SchoolOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_SpecifyDerivedReferrer_SchoolOfferListMap.size() + 1);
        _schoolId_SpecifyDerivedReferrer_SchoolOfferListMap.put(key, subQuery); return "schoolId_SpecifyDerivedReferrer_SchoolOfferList." + key;
    }

    protected Map<String, SchoolOfferCQ> _schoolId_InScopeRelation_SchoolOfferListMap;
    public Map<String, SchoolOfferCQ> getSchoolId_InScopeRelation_SchoolOfferList() { return _schoolId_InScopeRelation_SchoolOfferListMap; }
    public String keepSchoolId_InScopeRelation_SchoolOfferList(SchoolOfferCQ subQuery) {
        if (_schoolId_InScopeRelation_SchoolOfferListMap == null) { _schoolId_InScopeRelation_SchoolOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_InScopeRelation_SchoolOfferListMap.size() + 1);
        _schoolId_InScopeRelation_SchoolOfferListMap.put(key, subQuery); return "schoolId_InScopeRelation_SchoolOfferList." + key;
    }

    protected Map<String, SchoolOfferCQ> _schoolId_NotInScopeRelation_SchoolOfferListMap;
    public Map<String, SchoolOfferCQ> getSchoolId_NotInScopeRelation_SchoolOfferList() { return _schoolId_NotInScopeRelation_SchoolOfferListMap; }
    public String keepSchoolId_NotInScopeRelation_SchoolOfferList(SchoolOfferCQ subQuery) {
        if (_schoolId_NotInScopeRelation_SchoolOfferListMap == null) { _schoolId_NotInScopeRelation_SchoolOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_NotInScopeRelation_SchoolOfferListMap.size() + 1);
        _schoolId_NotInScopeRelation_SchoolOfferListMap.put(key, subQuery); return "schoolId_NotInScopeRelation_SchoolOfferList." + key;
    }

    protected Map<String, SchoolOfferCQ> _schoolId_QueryDerivedReferrer_SchoolOfferListMap;
    public Map<String, SchoolOfferCQ> getSchoolId_QueryDerivedReferrer_SchoolOfferList() { return _schoolId_QueryDerivedReferrer_SchoolOfferListMap; }
    public String keepSchoolId_QueryDerivedReferrer_SchoolOfferList(SchoolOfferCQ subQuery) {
        if (_schoolId_QueryDerivedReferrer_SchoolOfferListMap == null) { _schoolId_QueryDerivedReferrer_SchoolOfferListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_QueryDerivedReferrer_SchoolOfferListMap.size() + 1);
        _schoolId_QueryDerivedReferrer_SchoolOfferListMap.put(key, subQuery); return "schoolId_QueryDerivedReferrer_SchoolOfferList." + key;
    }
    protected Map<String, Object> _schoolId_QueryDerivedReferrer_SchoolOfferListParameterMap;
    public Map<String, Object> getSchoolId_QueryDerivedReferrer_SchoolOfferListParameter() { return _schoolId_QueryDerivedReferrer_SchoolOfferListParameterMap; }
    public String keepSchoolId_QueryDerivedReferrer_SchoolOfferListParameter(Object parameterValue) {
        if (_schoolId_QueryDerivedReferrer_SchoolOfferListParameterMap == null) { _schoolId_QueryDerivedReferrer_SchoolOfferListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_schoolId_QueryDerivedReferrer_SchoolOfferListParameterMap.size() + 1);
        _schoolId_QueryDerivedReferrer_SchoolOfferListParameterMap.put(key, parameterValue); return "schoolId_QueryDerivedReferrer_SchoolOfferListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_SchoolId_Asc() { regOBA("school_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_SchoolId_Desc() { regOBD("school_id"); return this; }

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
    public BsSchoolCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

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
    public BsSchoolCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br />
     * name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _kinds;
    public ConditionValue getKinds() {
        if (_kinds == null) { _kinds = nCV(); }
        return _kinds;
    }
    protected ConditionValue getCValueKinds() { return getKinds(); }

    /** 
     * Add order-by as ascend. <br />
     * kinds: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_Kinds_Asc() { regOBA("kinds"); return this; }

    /**
     * Add order-by as descend. <br />
     * kinds: {VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_Kinds_Desc() { regOBD("kinds"); return this; }

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
    public BsSchoolCQ addOrderBy_PhoneNumber_Asc() { regOBA("phone_number"); return this; }

    /**
     * Add order-by as descend. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_PhoneNumber_Desc() { regOBD("phone_number"); return this; }

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
    public BsSchoolCQ addOrderBy_MailAddress_Asc() { regOBA("mail_address"); return this; }

    /**
     * Add order-by as descend. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_MailAddress_Desc() { regOBD("mail_address"); return this; }

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
    public BsSchoolCQ addOrderBy_Url_Asc() { regOBA("url"); return this; }

    /**
     * Add order-by as descend. <br />
     * url: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_Url_Desc() { regOBD("url"); return this; }

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
    public BsSchoolCQ addOrderBy_OneThing_Asc() { regOBA("one_thing"); return this; }

    /**
     * Add order-by as descend. <br />
     * one_thing: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolCQ addOrderBy_OneThing_Desc() { regOBD("one_thing"); return this; }

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
    public BsSchoolCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSchoolCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        SchoolCQ baseQuery = (SchoolCQ)baseQueryAsSuper;
        SchoolCQ unionQuery = (SchoolCQ)unionQueryAsSuper;
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
        String nrp = resolveNextRelationPath("school", "login");
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
    protected Map<String, SchoolCQ> _scalarConditionMap;
    public Map<String, SchoolCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SchoolCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SchoolCQ> _specifyMyselfDerivedMap;
    public Map<String, SchoolCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SchoolCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, SchoolCQ> _queryMyselfDerivedMap;
    public Map<String, SchoolCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SchoolCQ subQuery) {
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
    protected Map<String, SchoolCQ> _myselfExistsMap;
    public Map<String, SchoolCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SchoolCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SchoolCQ> _myselfInScopeMap;
    public Map<String, SchoolCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SchoolCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SchoolCB.class.getName(); }
    protected String xCQ() { return SchoolCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
