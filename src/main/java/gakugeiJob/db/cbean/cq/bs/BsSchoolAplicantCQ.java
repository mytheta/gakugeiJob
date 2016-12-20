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
 * The base condition-query of school_aplicant.
 * @author DBFlute(AutoGenerator)
 */
public class BsSchoolAplicantCQ extends AbstractBsSchoolAplicantCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolAplicantCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSchoolAplicantCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from school_aplicant) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SchoolAplicantCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SchoolAplicantCIQ xcreateCIQ() {
        SchoolAplicantCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SchoolAplicantCIQ xnewCIQ() {
        return new SchoolAplicantCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join school_aplicant on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SchoolAplicantCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SchoolAplicantCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _schoolOfferId;
    public ConditionValue getSchoolOfferId() {
        if (_schoolOfferId == null) { _schoolOfferId = nCV(); }
        return _schoolOfferId;
    }
    protected ConditionValue getCValueSchoolOfferId() { return getSchoolOfferId(); }

    protected Map<String, SchoolOfferCQ> _schoolOfferId_InScopeRelation_SchoolOfferMap;
    public Map<String, SchoolOfferCQ> getSchoolOfferId_InScopeRelation_SchoolOffer() { return _schoolOfferId_InScopeRelation_SchoolOfferMap; }
    public String keepSchoolOfferId_InScopeRelation_SchoolOffer(SchoolOfferCQ subQuery) {
        if (_schoolOfferId_InScopeRelation_SchoolOfferMap == null) { _schoolOfferId_InScopeRelation_SchoolOfferMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_InScopeRelation_SchoolOfferMap.size() + 1);
        _schoolOfferId_InScopeRelation_SchoolOfferMap.put(key, subQuery); return "schoolOfferId_InScopeRelation_SchoolOffer." + key;
    }

    protected Map<String, SchoolOfferCQ> _schoolOfferId_NotInScopeRelation_SchoolOfferMap;
    public Map<String, SchoolOfferCQ> getSchoolOfferId_NotInScopeRelation_SchoolOffer() { return _schoolOfferId_NotInScopeRelation_SchoolOfferMap; }
    public String keepSchoolOfferId_NotInScopeRelation_SchoolOffer(SchoolOfferCQ subQuery) {
        if (_schoolOfferId_NotInScopeRelation_SchoolOfferMap == null) { _schoolOfferId_NotInScopeRelation_SchoolOfferMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_NotInScopeRelation_SchoolOfferMap.size() + 1);
        _schoolOfferId_NotInScopeRelation_SchoolOfferMap.put(key, subQuery); return "schoolOfferId_NotInScopeRelation_SchoolOffer." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_SchoolOfferId_Asc() { regOBA("school_offer_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_SchoolOfferId_Desc() { regOBD("school_offer_id"); return this; }

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
    public BsSchoolAplicantCQ addOrderBy_StudentId_Asc() { regOBA("student_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_StudentId_Desc() { regOBD("student_id"); return this; }

    protected ConditionValue _title;
    public ConditionValue getTitle() {
        if (_title == null) { _title = nCV(); }
        return _title;
    }
    protected ConditionValue getCValueTitle() { return getTitle(); }

    /** 
     * Add order-by as ascend. <br />
     * title: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_Title_Asc() { regOBA("title"); return this; }

    /**
     * Add order-by as descend. <br />
     * title: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_Title_Desc() { regOBD("title"); return this; }

    protected ConditionValue _content;
    public ConditionValue getContent() {
        if (_content == null) { _content = nCV(); }
        return _content;
    }
    protected ConditionValue getCValueContent() { return getContent(); }

    /** 
     * Add order-by as ascend. <br />
     * content: {VARCHAR(400)}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_Content_Asc() { regOBA("content"); return this; }

    /**
     * Add order-by as descend. <br />
     * content: {VARCHAR(400)}
     * @return this. (NotNull)
     */
    public BsSchoolAplicantCQ addOrderBy_Content_Desc() { regOBD("content"); return this; }

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
    public BsSchoolAplicantCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSchoolAplicantCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        SchoolAplicantCQ baseQuery = (SchoolAplicantCQ)baseQueryAsSuper;
        SchoolAplicantCQ unionQuery = (SchoolAplicantCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQuerySchoolOffer()) {
            unionQuery.querySchoolOffer().reflectRelationOnUnionQuery(baseQuery.querySchoolOffer(), unionQuery.querySchoolOffer());
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
     * school_offer by my school_offer_id, named 'schoolOffer'.
     * @return The instance of condition-query. (NotNull)
     */
    public SchoolOfferCQ querySchoolOffer() {
        return getConditionQuerySchoolOffer();
    }
    protected SchoolOfferCQ _conditionQuerySchoolOffer;
    public SchoolOfferCQ getConditionQuerySchoolOffer() {
        if (_conditionQuerySchoolOffer == null) {
            _conditionQuerySchoolOffer = xcreateQuerySchoolOffer();
            xsetupOuterJoinSchoolOffer();
        }
        return _conditionQuerySchoolOffer;
    }
    protected SchoolOfferCQ xcreateQuerySchoolOffer() {
        String nrp = resolveNextRelationPath("school_aplicant", "schoolOffer");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SchoolOfferCQ cq = new SchoolOfferCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("schoolOffer");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSchoolOffer() {
        SchoolOfferCQ cq = getConditionQuerySchoolOffer();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("school_offer_id", "school_offer_id");
        registerOuterJoin(cq, joinOnMap, "schoolOffer");
    }
    public boolean hasConditionQuerySchoolOffer() {
        return _conditionQuerySchoolOffer != null;
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
        String nrp = resolveNextRelationPath("school_aplicant", "student");
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
    protected String xCB() { return SchoolAplicantCB.class.getName(); }
    protected String xCQ() { return SchoolAplicantCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
