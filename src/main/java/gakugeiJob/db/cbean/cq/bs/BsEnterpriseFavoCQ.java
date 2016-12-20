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
 * The base condition-query of enterprise_favo.
 * @author DBFlute(AutoGenerator)
 */
public class BsEnterpriseFavoCQ extends AbstractBsEnterpriseFavoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseFavoCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEnterpriseFavoCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from enterprise_favo) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EnterpriseFavoCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EnterpriseFavoCIQ xcreateCIQ() {
        EnterpriseFavoCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EnterpriseFavoCIQ xnewCIQ() {
        return new EnterpriseFavoCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join enterprise_favo on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EnterpriseFavoCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EnterpriseFavoCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _jobOfferId;
    public ConditionValue getJobOfferId() {
        if (_jobOfferId == null) { _jobOfferId = nCV(); }
        return _jobOfferId;
    }
    protected ConditionValue getCValueJobOfferId() { return getJobOfferId(); }

    protected Map<String, EnterpriseOfferCQ> _jobOfferId_InScopeRelation_EnterpriseOfferMap;
    public Map<String, EnterpriseOfferCQ> getJobOfferId_InScopeRelation_EnterpriseOffer() { return _jobOfferId_InScopeRelation_EnterpriseOfferMap; }
    public String keepJobOfferId_InScopeRelation_EnterpriseOffer(EnterpriseOfferCQ subQuery) {
        if (_jobOfferId_InScopeRelation_EnterpriseOfferMap == null) { _jobOfferId_InScopeRelation_EnterpriseOfferMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_InScopeRelation_EnterpriseOfferMap.size() + 1);
        _jobOfferId_InScopeRelation_EnterpriseOfferMap.put(key, subQuery); return "jobOfferId_InScopeRelation_EnterpriseOffer." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _jobOfferId_NotInScopeRelation_EnterpriseOfferMap;
    public Map<String, EnterpriseOfferCQ> getJobOfferId_NotInScopeRelation_EnterpriseOffer() { return _jobOfferId_NotInScopeRelation_EnterpriseOfferMap; }
    public String keepJobOfferId_NotInScopeRelation_EnterpriseOffer(EnterpriseOfferCQ subQuery) {
        if (_jobOfferId_NotInScopeRelation_EnterpriseOfferMap == null) { _jobOfferId_NotInScopeRelation_EnterpriseOfferMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_NotInScopeRelation_EnterpriseOfferMap.size() + 1);
        _jobOfferId_NotInScopeRelation_EnterpriseOfferMap.put(key, subQuery); return "jobOfferId_NotInScopeRelation_EnterpriseOffer." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @return this. (NotNull)
     */
    public BsEnterpriseFavoCQ addOrderBy_JobOfferId_Asc() { regOBA("job_offer_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @return this. (NotNull)
     */
    public BsEnterpriseFavoCQ addOrderBy_JobOfferId_Desc() { regOBD("job_offer_id"); return this; }

    protected ConditionValue _studentId;
    public ConditionValue getStudentId() {
        if (_studentId == null) { _studentId = nCV(); }
        return _studentId;
    }
    protected ConditionValue getCValueStudentId() { return getStudentId(); }

    protected Map<String, StudentCQ> _studentId_InScopeRelation_StudentMap;
    public Map<String, StudentCQ> getStudentId_InScopeRelation_Student() { return _studentId_InScopeRelation_StudentMap; }
    public String keepStudentId_InScopeRelation_Student(StudentCQ subQuery) {
        if (_studentId_InScopeRelation_StudentMap == null) { _studentId_InScopeRelation_StudentMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_InScopeRelation_StudentMap.size() + 1);
        _studentId_InScopeRelation_StudentMap.put(key, subQuery); return "studentId_InScopeRelation_Student." + key;
    }

    protected Map<String, StudentCQ> _studentId_NotInScopeRelation_StudentMap;
    public Map<String, StudentCQ> getStudentId_NotInScopeRelation_Student() { return _studentId_NotInScopeRelation_StudentMap; }
    public String keepStudentId_NotInScopeRelation_Student(StudentCQ subQuery) {
        if (_studentId_NotInScopeRelation_StudentMap == null) { _studentId_NotInScopeRelation_StudentMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotInScopeRelation_StudentMap.size() + 1);
        _studentId_NotInScopeRelation_StudentMap.put(key, subQuery); return "studentId_NotInScopeRelation_Student." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @return this. (NotNull)
     */
    public BsEnterpriseFavoCQ addOrderBy_StudentId_Asc() { regOBA("student_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @return this. (NotNull)
     */
    public BsEnterpriseFavoCQ addOrderBy_StudentId_Desc() { regOBD("student_id"); return this; }

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
    public BsEnterpriseFavoCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsEnterpriseFavoCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        EnterpriseFavoCQ baseQuery = (EnterpriseFavoCQ)baseQueryAsSuper;
        EnterpriseFavoCQ unionQuery = (EnterpriseFavoCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryEnterpriseOffer()) {
            unionQuery.queryEnterpriseOffer().reflectRelationOnUnionQuery(baseQuery.queryEnterpriseOffer(), unionQuery.queryEnterpriseOffer());
        }
        if (baseQuery.hasConditionQueryStudent()) {
            unionQuery.queryStudent().reflectRelationOnUnionQuery(baseQuery.queryStudent(), unionQuery.queryStudent());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * enterprise_offer by my job_offer_id, named 'enterpriseOffer'.
     * @return The instance of condition-query. (NotNull)
     */
    public EnterpriseOfferCQ queryEnterpriseOffer() {
        return getConditionQueryEnterpriseOffer();
    }
    protected EnterpriseOfferCQ _conditionQueryEnterpriseOffer;
    public EnterpriseOfferCQ getConditionQueryEnterpriseOffer() {
        if (_conditionQueryEnterpriseOffer == null) {
            _conditionQueryEnterpriseOffer = xcreateQueryEnterpriseOffer();
            xsetupOuterJoinEnterpriseOffer();
        }
        return _conditionQueryEnterpriseOffer;
    }
    protected EnterpriseOfferCQ xcreateQueryEnterpriseOffer() {
        String nrp = resolveNextRelationPath("enterprise_favo", "enterpriseOffer");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        EnterpriseOfferCQ cq = new EnterpriseOfferCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("enterpriseOffer");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinEnterpriseOffer() {
        EnterpriseOfferCQ cq = getConditionQueryEnterpriseOffer();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("job_offer_id", "job_offer_id");
        registerOuterJoin(cq, joinOnMap, "enterpriseOffer");
    }
    public boolean hasConditionQueryEnterpriseOffer() {
        return _conditionQueryEnterpriseOffer != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * student by my student_id, named 'student'.
     * @return The instance of condition-query. (NotNull)
     */
    public StudentCQ queryStudent() {
        return getConditionQueryStudent();
    }
    protected StudentCQ _conditionQueryStudent;
    public StudentCQ getConditionQueryStudent() {
        if (_conditionQueryStudent == null) {
            _conditionQueryStudent = xcreateQueryStudent();
            xsetupOuterJoinStudent();
        }
        return _conditionQueryStudent;
    }
    protected StudentCQ xcreateQueryStudent() {
        String nrp = resolveNextRelationPath("enterprise_favo", "student");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        StudentCQ cq = new StudentCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("student");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinStudent() {
        StudentCQ cq = getConditionQueryStudent();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("student_id", "student_id");
        registerOuterJoin(cq, joinOnMap, "student");
    }
    public boolean hasConditionQueryStudent() {
        return _conditionQueryStudent != null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EnterpriseFavoCB.class.getName(); }
    protected String xCQ() { return EnterpriseFavoCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
