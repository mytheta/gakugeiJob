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
 * The base condition-query of admin.
 * @author DBFlute(AutoGenerator)
 */
public class BsAdminCQ extends AbstractBsAdminCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AdminCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsAdminCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from admin) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public AdminCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected AdminCIQ xcreateCIQ() {
        AdminCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected AdminCIQ xnewCIQ() {
        return new AdminCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join admin on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public AdminCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        AdminCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @return this. (NotNull)
     */
    public BsAdminCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @return this. (NotNull)
     */
    public BsAdminCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _adminPass1;
    public ConditionValue getAdminPass1() {
        if (_adminPass1 == null) { _adminPass1 = nCV(); }
        return _adminPass1;
    }
    protected ConditionValue getCValueAdminPass1() { return getAdminPass1(); }

    /** 
     * Add order-by as ascend. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAdminCQ addOrderBy_AdminPass1_Asc() { regOBA("admin_pass1"); return this; }

    /**
     * Add order-by as descend. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAdminCQ addOrderBy_AdminPass1_Desc() { regOBD("admin_pass1"); return this; }

    protected ConditionValue _adminPass2;
    public ConditionValue getAdminPass2() {
        if (_adminPass2 == null) { _adminPass2 = nCV(); }
        return _adminPass2;
    }
    protected ConditionValue getCValueAdminPass2() { return getAdminPass2(); }

    /** 
     * Add order-by as ascend. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAdminCQ addOrderBy_AdminPass2_Asc() { regOBA("admin_pass2"); return this; }

    /**
     * Add order-by as descend. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @return this. (NotNull)
     */
    public BsAdminCQ addOrderBy_AdminPass2_Desc() { regOBD("admin_pass2"); return this; }

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
    public BsAdminCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsAdminCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        AdminCQ baseQuery = (AdminCQ)baseQueryAsSuper;
        AdminCQ unionQuery = (AdminCQ)unionQueryAsSuper;
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
        String nrp = resolveNextRelationPath("admin", "login");
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
    protected Map<String, AdminCQ> _scalarConditionMap;
    public Map<String, AdminCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(AdminCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, AdminCQ> _specifyMyselfDerivedMap;
    public Map<String, AdminCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(AdminCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, AdminCQ> _queryMyselfDerivedMap;
    public Map<String, AdminCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(AdminCQ subQuery) {
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
    protected Map<String, AdminCQ> _myselfExistsMap;
    public Map<String, AdminCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(AdminCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, AdminCQ> _myselfInScopeMap;
    public Map<String, AdminCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(AdminCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return AdminCB.class.getName(); }
    protected String xCQ() { return AdminCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
