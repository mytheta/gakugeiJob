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
 * The base condition-query of login.
 * @author DBFlute(AutoGenerator)
 */
public class BsLoginCQ extends AbstractBsLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from login) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LoginCIQ xcreateCIQ() {
        LoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LoginCIQ xnewCIQ() {
        return new LoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join login on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _userId;
    public ConditionValue getUserId() {
        if (_userId == null) { _userId = nCV(); }
        return _userId;
    }
    protected ConditionValue getCValueUserId() { return getUserId(); }

    protected Map<String, AdminCQ> _userId_ExistsReferrer_AdminAsOneMap;
    public Map<String, AdminCQ> getUserId_ExistsReferrer_AdminAsOne() { return _userId_ExistsReferrer_AdminAsOneMap; }
    public String keepUserId_ExistsReferrer_AdminAsOne(AdminCQ subQuery) {
        if (_userId_ExistsReferrer_AdminAsOneMap == null) { _userId_ExistsReferrer_AdminAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_ExistsReferrer_AdminAsOneMap.size() + 1);
        _userId_ExistsReferrer_AdminAsOneMap.put(key, subQuery); return "userId_ExistsReferrer_AdminAsOne." + key;
    }

    protected Map<String, EnterpriseCQ> _userId_ExistsReferrer_EnterpriseListMap;
    public Map<String, EnterpriseCQ> getUserId_ExistsReferrer_EnterpriseList() { return _userId_ExistsReferrer_EnterpriseListMap; }
    public String keepUserId_ExistsReferrer_EnterpriseList(EnterpriseCQ subQuery) {
        if (_userId_ExistsReferrer_EnterpriseListMap == null) { _userId_ExistsReferrer_EnterpriseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_ExistsReferrer_EnterpriseListMap.size() + 1);
        _userId_ExistsReferrer_EnterpriseListMap.put(key, subQuery); return "userId_ExistsReferrer_EnterpriseList." + key;
    }

    protected Map<String, SchoolCQ> _userId_ExistsReferrer_SchoolListMap;
    public Map<String, SchoolCQ> getUserId_ExistsReferrer_SchoolList() { return _userId_ExistsReferrer_SchoolListMap; }
    public String keepUserId_ExistsReferrer_SchoolList(SchoolCQ subQuery) {
        if (_userId_ExistsReferrer_SchoolListMap == null) { _userId_ExistsReferrer_SchoolListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_ExistsReferrer_SchoolListMap.size() + 1);
        _userId_ExistsReferrer_SchoolListMap.put(key, subQuery); return "userId_ExistsReferrer_SchoolList." + key;
    }

    protected Map<String, StudentCQ> _userId_ExistsReferrer_StudentListMap;
    public Map<String, StudentCQ> getUserId_ExistsReferrer_StudentList() { return _userId_ExistsReferrer_StudentListMap; }
    public String keepUserId_ExistsReferrer_StudentList(StudentCQ subQuery) {
        if (_userId_ExistsReferrer_StudentListMap == null) { _userId_ExistsReferrer_StudentListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_ExistsReferrer_StudentListMap.size() + 1);
        _userId_ExistsReferrer_StudentListMap.put(key, subQuery); return "userId_ExistsReferrer_StudentList." + key;
    }

    protected Map<String, AdminCQ> _userId_NotExistsReferrer_AdminAsOneMap;
    public Map<String, AdminCQ> getUserId_NotExistsReferrer_AdminAsOne() { return _userId_NotExistsReferrer_AdminAsOneMap; }
    public String keepUserId_NotExistsReferrer_AdminAsOne(AdminCQ subQuery) {
        if (_userId_NotExistsReferrer_AdminAsOneMap == null) { _userId_NotExistsReferrer_AdminAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotExistsReferrer_AdminAsOneMap.size() + 1);
        _userId_NotExistsReferrer_AdminAsOneMap.put(key, subQuery); return "userId_NotExistsReferrer_AdminAsOne." + key;
    }

    protected Map<String, EnterpriseCQ> _userId_NotExistsReferrer_EnterpriseListMap;
    public Map<String, EnterpriseCQ> getUserId_NotExistsReferrer_EnterpriseList() { return _userId_NotExistsReferrer_EnterpriseListMap; }
    public String keepUserId_NotExistsReferrer_EnterpriseList(EnterpriseCQ subQuery) {
        if (_userId_NotExistsReferrer_EnterpriseListMap == null) { _userId_NotExistsReferrer_EnterpriseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotExistsReferrer_EnterpriseListMap.size() + 1);
        _userId_NotExistsReferrer_EnterpriseListMap.put(key, subQuery); return "userId_NotExistsReferrer_EnterpriseList." + key;
    }

    protected Map<String, SchoolCQ> _userId_NotExistsReferrer_SchoolListMap;
    public Map<String, SchoolCQ> getUserId_NotExistsReferrer_SchoolList() { return _userId_NotExistsReferrer_SchoolListMap; }
    public String keepUserId_NotExistsReferrer_SchoolList(SchoolCQ subQuery) {
        if (_userId_NotExistsReferrer_SchoolListMap == null) { _userId_NotExistsReferrer_SchoolListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotExistsReferrer_SchoolListMap.size() + 1);
        _userId_NotExistsReferrer_SchoolListMap.put(key, subQuery); return "userId_NotExistsReferrer_SchoolList." + key;
    }

    protected Map<String, StudentCQ> _userId_NotExistsReferrer_StudentListMap;
    public Map<String, StudentCQ> getUserId_NotExistsReferrer_StudentList() { return _userId_NotExistsReferrer_StudentListMap; }
    public String keepUserId_NotExistsReferrer_StudentList(StudentCQ subQuery) {
        if (_userId_NotExistsReferrer_StudentListMap == null) { _userId_NotExistsReferrer_StudentListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotExistsReferrer_StudentListMap.size() + 1);
        _userId_NotExistsReferrer_StudentListMap.put(key, subQuery); return "userId_NotExistsReferrer_StudentList." + key;
    }

    protected Map<String, AdminCQ> _userId_InScopeRelation_AdminAsOneMap;
    public Map<String, AdminCQ> getUserId_InScopeRelation_AdminAsOne() { return _userId_InScopeRelation_AdminAsOneMap; }
    public String keepUserId_InScopeRelation_AdminAsOne(AdminCQ subQuery) {
        if (_userId_InScopeRelation_AdminAsOneMap == null) { _userId_InScopeRelation_AdminAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_AdminAsOneMap.size() + 1);
        _userId_InScopeRelation_AdminAsOneMap.put(key, subQuery); return "userId_InScopeRelation_AdminAsOne." + key;
    }

    protected Map<String, EnterpriseCQ> _userId_InScopeRelation_EnterpriseListMap;
    public Map<String, EnterpriseCQ> getUserId_InScopeRelation_EnterpriseList() { return _userId_InScopeRelation_EnterpriseListMap; }
    public String keepUserId_InScopeRelation_EnterpriseList(EnterpriseCQ subQuery) {
        if (_userId_InScopeRelation_EnterpriseListMap == null) { _userId_InScopeRelation_EnterpriseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_EnterpriseListMap.size() + 1);
        _userId_InScopeRelation_EnterpriseListMap.put(key, subQuery); return "userId_InScopeRelation_EnterpriseList." + key;
    }

    protected Map<String, SchoolCQ> _userId_InScopeRelation_SchoolListMap;
    public Map<String, SchoolCQ> getUserId_InScopeRelation_SchoolList() { return _userId_InScopeRelation_SchoolListMap; }
    public String keepUserId_InScopeRelation_SchoolList(SchoolCQ subQuery) {
        if (_userId_InScopeRelation_SchoolListMap == null) { _userId_InScopeRelation_SchoolListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_SchoolListMap.size() + 1);
        _userId_InScopeRelation_SchoolListMap.put(key, subQuery); return "userId_InScopeRelation_SchoolList." + key;
    }

    protected Map<String, StudentCQ> _userId_InScopeRelation_StudentListMap;
    public Map<String, StudentCQ> getUserId_InScopeRelation_StudentList() { return _userId_InScopeRelation_StudentListMap; }
    public String keepUserId_InScopeRelation_StudentList(StudentCQ subQuery) {
        if (_userId_InScopeRelation_StudentListMap == null) { _userId_InScopeRelation_StudentListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_StudentListMap.size() + 1);
        _userId_InScopeRelation_StudentListMap.put(key, subQuery); return "userId_InScopeRelation_StudentList." + key;
    }

    protected Map<String, AdminCQ> _userId_NotInScopeRelation_AdminAsOneMap;
    public Map<String, AdminCQ> getUserId_NotInScopeRelation_AdminAsOne() { return _userId_NotInScopeRelation_AdminAsOneMap; }
    public String keepUserId_NotInScopeRelation_AdminAsOne(AdminCQ subQuery) {
        if (_userId_NotInScopeRelation_AdminAsOneMap == null) { _userId_NotInScopeRelation_AdminAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_AdminAsOneMap.size() + 1);
        _userId_NotInScopeRelation_AdminAsOneMap.put(key, subQuery); return "userId_NotInScopeRelation_AdminAsOne." + key;
    }

    protected Map<String, EnterpriseCQ> _userId_NotInScopeRelation_EnterpriseListMap;
    public Map<String, EnterpriseCQ> getUserId_NotInScopeRelation_EnterpriseList() { return _userId_NotInScopeRelation_EnterpriseListMap; }
    public String keepUserId_NotInScopeRelation_EnterpriseList(EnterpriseCQ subQuery) {
        if (_userId_NotInScopeRelation_EnterpriseListMap == null) { _userId_NotInScopeRelation_EnterpriseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_EnterpriseListMap.size() + 1);
        _userId_NotInScopeRelation_EnterpriseListMap.put(key, subQuery); return "userId_NotInScopeRelation_EnterpriseList." + key;
    }

    protected Map<String, SchoolCQ> _userId_NotInScopeRelation_SchoolListMap;
    public Map<String, SchoolCQ> getUserId_NotInScopeRelation_SchoolList() { return _userId_NotInScopeRelation_SchoolListMap; }
    public String keepUserId_NotInScopeRelation_SchoolList(SchoolCQ subQuery) {
        if (_userId_NotInScopeRelation_SchoolListMap == null) { _userId_NotInScopeRelation_SchoolListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_SchoolListMap.size() + 1);
        _userId_NotInScopeRelation_SchoolListMap.put(key, subQuery); return "userId_NotInScopeRelation_SchoolList." + key;
    }

    protected Map<String, StudentCQ> _userId_NotInScopeRelation_StudentListMap;
    public Map<String, StudentCQ> getUserId_NotInScopeRelation_StudentList() { return _userId_NotInScopeRelation_StudentListMap; }
    public String keepUserId_NotInScopeRelation_StudentList(StudentCQ subQuery) {
        if (_userId_NotInScopeRelation_StudentListMap == null) { _userId_NotInScopeRelation_StudentListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_StudentListMap.size() + 1);
        _userId_NotInScopeRelation_StudentListMap.put(key, subQuery); return "userId_NotInScopeRelation_StudentList." + key;
    }

    protected Map<String, EnterpriseCQ> _userId_SpecifyDerivedReferrer_EnterpriseListMap;
    public Map<String, EnterpriseCQ> getUserId_SpecifyDerivedReferrer_EnterpriseList() { return _userId_SpecifyDerivedReferrer_EnterpriseListMap; }
    public String keepUserId_SpecifyDerivedReferrer_EnterpriseList(EnterpriseCQ subQuery) {
        if (_userId_SpecifyDerivedReferrer_EnterpriseListMap == null) { _userId_SpecifyDerivedReferrer_EnterpriseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_SpecifyDerivedReferrer_EnterpriseListMap.size() + 1);
        _userId_SpecifyDerivedReferrer_EnterpriseListMap.put(key, subQuery); return "userId_SpecifyDerivedReferrer_EnterpriseList." + key;
    }

    protected Map<String, SchoolCQ> _userId_SpecifyDerivedReferrer_SchoolListMap;
    public Map<String, SchoolCQ> getUserId_SpecifyDerivedReferrer_SchoolList() { return _userId_SpecifyDerivedReferrer_SchoolListMap; }
    public String keepUserId_SpecifyDerivedReferrer_SchoolList(SchoolCQ subQuery) {
        if (_userId_SpecifyDerivedReferrer_SchoolListMap == null) { _userId_SpecifyDerivedReferrer_SchoolListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_SpecifyDerivedReferrer_SchoolListMap.size() + 1);
        _userId_SpecifyDerivedReferrer_SchoolListMap.put(key, subQuery); return "userId_SpecifyDerivedReferrer_SchoolList." + key;
    }

    protected Map<String, StudentCQ> _userId_SpecifyDerivedReferrer_StudentListMap;
    public Map<String, StudentCQ> getUserId_SpecifyDerivedReferrer_StudentList() { return _userId_SpecifyDerivedReferrer_StudentListMap; }
    public String keepUserId_SpecifyDerivedReferrer_StudentList(StudentCQ subQuery) {
        if (_userId_SpecifyDerivedReferrer_StudentListMap == null) { _userId_SpecifyDerivedReferrer_StudentListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_SpecifyDerivedReferrer_StudentListMap.size() + 1);
        _userId_SpecifyDerivedReferrer_StudentListMap.put(key, subQuery); return "userId_SpecifyDerivedReferrer_StudentList." + key;
    }

    protected Map<String, EnterpriseCQ> _userId_QueryDerivedReferrer_EnterpriseListMap;
    public Map<String, EnterpriseCQ> getUserId_QueryDerivedReferrer_EnterpriseList() { return _userId_QueryDerivedReferrer_EnterpriseListMap; }
    public String keepUserId_QueryDerivedReferrer_EnterpriseList(EnterpriseCQ subQuery) {
        if (_userId_QueryDerivedReferrer_EnterpriseListMap == null) { _userId_QueryDerivedReferrer_EnterpriseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_QueryDerivedReferrer_EnterpriseListMap.size() + 1);
        _userId_QueryDerivedReferrer_EnterpriseListMap.put(key, subQuery); return "userId_QueryDerivedReferrer_EnterpriseList." + key;
    }
    protected Map<String, Object> _userId_QueryDerivedReferrer_EnterpriseListParameterMap;
    public Map<String, Object> getUserId_QueryDerivedReferrer_EnterpriseListParameter() { return _userId_QueryDerivedReferrer_EnterpriseListParameterMap; }
    public String keepUserId_QueryDerivedReferrer_EnterpriseListParameter(Object parameterValue) {
        if (_userId_QueryDerivedReferrer_EnterpriseListParameterMap == null) { _userId_QueryDerivedReferrer_EnterpriseListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_userId_QueryDerivedReferrer_EnterpriseListParameterMap.size() + 1);
        _userId_QueryDerivedReferrer_EnterpriseListParameterMap.put(key, parameterValue); return "userId_QueryDerivedReferrer_EnterpriseListParameter." + key;
    }

    protected Map<String, SchoolCQ> _userId_QueryDerivedReferrer_SchoolListMap;
    public Map<String, SchoolCQ> getUserId_QueryDerivedReferrer_SchoolList() { return _userId_QueryDerivedReferrer_SchoolListMap; }
    public String keepUserId_QueryDerivedReferrer_SchoolList(SchoolCQ subQuery) {
        if (_userId_QueryDerivedReferrer_SchoolListMap == null) { _userId_QueryDerivedReferrer_SchoolListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_QueryDerivedReferrer_SchoolListMap.size() + 1);
        _userId_QueryDerivedReferrer_SchoolListMap.put(key, subQuery); return "userId_QueryDerivedReferrer_SchoolList." + key;
    }
    protected Map<String, Object> _userId_QueryDerivedReferrer_SchoolListParameterMap;
    public Map<String, Object> getUserId_QueryDerivedReferrer_SchoolListParameter() { return _userId_QueryDerivedReferrer_SchoolListParameterMap; }
    public String keepUserId_QueryDerivedReferrer_SchoolListParameter(Object parameterValue) {
        if (_userId_QueryDerivedReferrer_SchoolListParameterMap == null) { _userId_QueryDerivedReferrer_SchoolListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_userId_QueryDerivedReferrer_SchoolListParameterMap.size() + 1);
        _userId_QueryDerivedReferrer_SchoolListParameterMap.put(key, parameterValue); return "userId_QueryDerivedReferrer_SchoolListParameter." + key;
    }

    protected Map<String, StudentCQ> _userId_QueryDerivedReferrer_StudentListMap;
    public Map<String, StudentCQ> getUserId_QueryDerivedReferrer_StudentList() { return _userId_QueryDerivedReferrer_StudentListMap; }
    public String keepUserId_QueryDerivedReferrer_StudentList(StudentCQ subQuery) {
        if (_userId_QueryDerivedReferrer_StudentListMap == null) { _userId_QueryDerivedReferrer_StudentListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_QueryDerivedReferrer_StudentListMap.size() + 1);
        _userId_QueryDerivedReferrer_StudentListMap.put(key, subQuery); return "userId_QueryDerivedReferrer_StudentList." + key;
    }
    protected Map<String, Object> _userId_QueryDerivedReferrer_StudentListParameterMap;
    public Map<String, Object> getUserId_QueryDerivedReferrer_StudentListParameter() { return _userId_QueryDerivedReferrer_StudentListParameterMap; }
    public String keepUserId_QueryDerivedReferrer_StudentListParameter(Object parameterValue) {
        if (_userId_QueryDerivedReferrer_StudentListParameterMap == null) { _userId_QueryDerivedReferrer_StudentListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_userId_QueryDerivedReferrer_StudentListParameterMap.size() + 1);
        _userId_QueryDerivedReferrer_StudentListParameterMap.put(key, parameterValue); return "userId_QueryDerivedReferrer_StudentListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _userPass;
    public ConditionValue getUserPass() {
        if (_userPass == null) { _userPass = nCV(); }
        return _userPass;
    }
    protected ConditionValue getCValueUserPass() { return getUserPass(); }

    /** 
     * Add order-by as ascend. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_UserPass_Asc() { regOBA("user_pass"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_UserPass_Desc() { regOBD("user_pass"); return this; }

    protected ConditionValue _role;
    public ConditionValue getRole() {
        if (_role == null) { _role = nCV(); }
        return _role;
    }
    protected ConditionValue getCValueRole() { return getRole(); }

    /** 
     * Add order-by as ascend. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_Role_Asc() { regOBA("role"); return this; }

    /**
     * Add order-by as descend. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_Role_Desc() { regOBD("role"); return this; }

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
    public BsLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        LoginCQ baseQuery = (LoginCQ)baseQueryAsSuper;
        LoginCQ unionQuery = (LoginCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryAdminAsOne()) {
            unionQuery.queryAdminAsOne().reflectRelationOnUnionQuery(baseQuery.queryAdminAsOne(), unionQuery.queryAdminAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * admin by your user_id, named 'adminAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public AdminCQ queryAdminAsOne() {
        return getConditionQueryAdminAsOne();
    }
    protected AdminCQ _conditionQueryAdminAsOne;
    public AdminCQ getConditionQueryAdminAsOne() {
        if (_conditionQueryAdminAsOne == null) {
            _conditionQueryAdminAsOne = xcreateQueryAdminAsOne();
            xsetupOuterJoinAdminAsOne();
        }
        return _conditionQueryAdminAsOne;
    }
    protected AdminCQ xcreateQueryAdminAsOne() {
        String nrp = resolveNextRelationPath("login", "adminAsOne");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        AdminCQ cq = new AdminCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("adminAsOne");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinAdminAsOne() {
        AdminCQ cq = getConditionQueryAdminAsOne();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("user_id", "user_id");
        registerOuterJoin(cq, joinOnMap, "adminAsOne");
    }
    public boolean hasConditionQueryAdminAsOne() {
        return _conditionQueryAdminAsOne != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, LoginCQ> _scalarConditionMap;
    public Map<String, LoginCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(LoginCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, LoginCQ> _specifyMyselfDerivedMap;
    public Map<String, LoginCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(LoginCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, LoginCQ> _queryMyselfDerivedMap;
    public Map<String, LoginCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(LoginCQ subQuery) {
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
    protected Map<String, LoginCQ> _myselfExistsMap;
    public Map<String, LoginCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(LoginCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, LoginCQ> _myselfInScopeMap;
    public Map<String, LoginCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(LoginCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LoginCB.class.getName(); }
    protected String xCQ() { return LoginCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
