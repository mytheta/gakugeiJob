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
 * The base condition-query of student.
 * @author DBFlute(AutoGenerator)
 */
public class BsStudentCQ extends AbstractBsStudentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StudentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsStudentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from student) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public StudentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected StudentCIQ xcreateCIQ() {
        StudentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected StudentCIQ xnewCIQ() {
        return new StudentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join student on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public StudentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        StudentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _studentId;
    public ConditionValue getStudentId() {
        if (_studentId == null) { _studentId = nCV(); }
        return _studentId;
    }
    protected ConditionValue getCValueStudentId() { return getStudentId(); }

    protected Map<String, EnterpriseAplicantCQ> _studentId_ExistsReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getStudentId_ExistsReferrer_EnterpriseAplicantList() { return _studentId_ExistsReferrer_EnterpriseAplicantListMap; }
    public String keepStudentId_ExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_studentId_ExistsReferrer_EnterpriseAplicantListMap == null) { _studentId_ExistsReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_ExistsReferrer_EnterpriseAplicantListMap.size() + 1);
        _studentId_ExistsReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "studentId_ExistsReferrer_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _studentId_ExistsReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getStudentId_ExistsReferrer_EnterpriseFavoList() { return _studentId_ExistsReferrer_EnterpriseFavoListMap; }
    public String keepStudentId_ExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_studentId_ExistsReferrer_EnterpriseFavoListMap == null) { _studentId_ExistsReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_ExistsReferrer_EnterpriseFavoListMap.size() + 1);
        _studentId_ExistsReferrer_EnterpriseFavoListMap.put(key, subQuery); return "studentId_ExistsReferrer_EnterpriseFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _studentId_ExistsReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getStudentId_ExistsReferrer_SchoolAplicantList() { return _studentId_ExistsReferrer_SchoolAplicantListMap; }
    public String keepStudentId_ExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_studentId_ExistsReferrer_SchoolAplicantListMap == null) { _studentId_ExistsReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_ExistsReferrer_SchoolAplicantListMap.size() + 1);
        _studentId_ExistsReferrer_SchoolAplicantListMap.put(key, subQuery); return "studentId_ExistsReferrer_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _studentId_ExistsReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getStudentId_ExistsReferrer_SchoolFavoList() { return _studentId_ExistsReferrer_SchoolFavoListMap; }
    public String keepStudentId_ExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_studentId_ExistsReferrer_SchoolFavoListMap == null) { _studentId_ExistsReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_ExistsReferrer_SchoolFavoListMap.size() + 1);
        _studentId_ExistsReferrer_SchoolFavoListMap.put(key, subQuery); return "studentId_ExistsReferrer_SchoolFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _studentId_NotExistsReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getStudentId_NotExistsReferrer_EnterpriseAplicantList() { return _studentId_NotExistsReferrer_EnterpriseAplicantListMap; }
    public String keepStudentId_NotExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_studentId_NotExistsReferrer_EnterpriseAplicantListMap == null) { _studentId_NotExistsReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotExistsReferrer_EnterpriseAplicantListMap.size() + 1);
        _studentId_NotExistsReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "studentId_NotExistsReferrer_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _studentId_NotExistsReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getStudentId_NotExistsReferrer_EnterpriseFavoList() { return _studentId_NotExistsReferrer_EnterpriseFavoListMap; }
    public String keepStudentId_NotExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_studentId_NotExistsReferrer_EnterpriseFavoListMap == null) { _studentId_NotExistsReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotExistsReferrer_EnterpriseFavoListMap.size() + 1);
        _studentId_NotExistsReferrer_EnterpriseFavoListMap.put(key, subQuery); return "studentId_NotExistsReferrer_EnterpriseFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _studentId_NotExistsReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getStudentId_NotExistsReferrer_SchoolAplicantList() { return _studentId_NotExistsReferrer_SchoolAplicantListMap; }
    public String keepStudentId_NotExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_studentId_NotExistsReferrer_SchoolAplicantListMap == null) { _studentId_NotExistsReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotExistsReferrer_SchoolAplicantListMap.size() + 1);
        _studentId_NotExistsReferrer_SchoolAplicantListMap.put(key, subQuery); return "studentId_NotExistsReferrer_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _studentId_NotExistsReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getStudentId_NotExistsReferrer_SchoolFavoList() { return _studentId_NotExistsReferrer_SchoolFavoListMap; }
    public String keepStudentId_NotExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_studentId_NotExistsReferrer_SchoolFavoListMap == null) { _studentId_NotExistsReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotExistsReferrer_SchoolFavoListMap.size() + 1);
        _studentId_NotExistsReferrer_SchoolFavoListMap.put(key, subQuery); return "studentId_NotExistsReferrer_SchoolFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _studentId_SpecifyDerivedReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getStudentId_SpecifyDerivedReferrer_EnterpriseAplicantList() { return _studentId_SpecifyDerivedReferrer_EnterpriseAplicantListMap; }
    public String keepStudentId_SpecifyDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_studentId_SpecifyDerivedReferrer_EnterpriseAplicantListMap == null) { _studentId_SpecifyDerivedReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_SpecifyDerivedReferrer_EnterpriseAplicantListMap.size() + 1);
        _studentId_SpecifyDerivedReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "studentId_SpecifyDerivedReferrer_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _studentId_SpecifyDerivedReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getStudentId_SpecifyDerivedReferrer_EnterpriseFavoList() { return _studentId_SpecifyDerivedReferrer_EnterpriseFavoListMap; }
    public String keepStudentId_SpecifyDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_studentId_SpecifyDerivedReferrer_EnterpriseFavoListMap == null) { _studentId_SpecifyDerivedReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_SpecifyDerivedReferrer_EnterpriseFavoListMap.size() + 1);
        _studentId_SpecifyDerivedReferrer_EnterpriseFavoListMap.put(key, subQuery); return "studentId_SpecifyDerivedReferrer_EnterpriseFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _studentId_SpecifyDerivedReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getStudentId_SpecifyDerivedReferrer_SchoolAplicantList() { return _studentId_SpecifyDerivedReferrer_SchoolAplicantListMap; }
    public String keepStudentId_SpecifyDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_studentId_SpecifyDerivedReferrer_SchoolAplicantListMap == null) { _studentId_SpecifyDerivedReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_SpecifyDerivedReferrer_SchoolAplicantListMap.size() + 1);
        _studentId_SpecifyDerivedReferrer_SchoolAplicantListMap.put(key, subQuery); return "studentId_SpecifyDerivedReferrer_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _studentId_SpecifyDerivedReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getStudentId_SpecifyDerivedReferrer_SchoolFavoList() { return _studentId_SpecifyDerivedReferrer_SchoolFavoListMap; }
    public String keepStudentId_SpecifyDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_studentId_SpecifyDerivedReferrer_SchoolFavoListMap == null) { _studentId_SpecifyDerivedReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_SpecifyDerivedReferrer_SchoolFavoListMap.size() + 1);
        _studentId_SpecifyDerivedReferrer_SchoolFavoListMap.put(key, subQuery); return "studentId_SpecifyDerivedReferrer_SchoolFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _studentId_InScopeRelation_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getStudentId_InScopeRelation_EnterpriseAplicantList() { return _studentId_InScopeRelation_EnterpriseAplicantListMap; }
    public String keepStudentId_InScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_studentId_InScopeRelation_EnterpriseAplicantListMap == null) { _studentId_InScopeRelation_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_InScopeRelation_EnterpriseAplicantListMap.size() + 1);
        _studentId_InScopeRelation_EnterpriseAplicantListMap.put(key, subQuery); return "studentId_InScopeRelation_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _studentId_InScopeRelation_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getStudentId_InScopeRelation_EnterpriseFavoList() { return _studentId_InScopeRelation_EnterpriseFavoListMap; }
    public String keepStudentId_InScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_studentId_InScopeRelation_EnterpriseFavoListMap == null) { _studentId_InScopeRelation_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_InScopeRelation_EnterpriseFavoListMap.size() + 1);
        _studentId_InScopeRelation_EnterpriseFavoListMap.put(key, subQuery); return "studentId_InScopeRelation_EnterpriseFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _studentId_InScopeRelation_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getStudentId_InScopeRelation_SchoolAplicantList() { return _studentId_InScopeRelation_SchoolAplicantListMap; }
    public String keepStudentId_InScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_studentId_InScopeRelation_SchoolAplicantListMap == null) { _studentId_InScopeRelation_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_InScopeRelation_SchoolAplicantListMap.size() + 1);
        _studentId_InScopeRelation_SchoolAplicantListMap.put(key, subQuery); return "studentId_InScopeRelation_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _studentId_InScopeRelation_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getStudentId_InScopeRelation_SchoolFavoList() { return _studentId_InScopeRelation_SchoolFavoListMap; }
    public String keepStudentId_InScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_studentId_InScopeRelation_SchoolFavoListMap == null) { _studentId_InScopeRelation_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_InScopeRelation_SchoolFavoListMap.size() + 1);
        _studentId_InScopeRelation_SchoolFavoListMap.put(key, subQuery); return "studentId_InScopeRelation_SchoolFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _studentId_NotInScopeRelation_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getStudentId_NotInScopeRelation_EnterpriseAplicantList() { return _studentId_NotInScopeRelation_EnterpriseAplicantListMap; }
    public String keepStudentId_NotInScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_studentId_NotInScopeRelation_EnterpriseAplicantListMap == null) { _studentId_NotInScopeRelation_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotInScopeRelation_EnterpriseAplicantListMap.size() + 1);
        _studentId_NotInScopeRelation_EnterpriseAplicantListMap.put(key, subQuery); return "studentId_NotInScopeRelation_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _studentId_NotInScopeRelation_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getStudentId_NotInScopeRelation_EnterpriseFavoList() { return _studentId_NotInScopeRelation_EnterpriseFavoListMap; }
    public String keepStudentId_NotInScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_studentId_NotInScopeRelation_EnterpriseFavoListMap == null) { _studentId_NotInScopeRelation_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotInScopeRelation_EnterpriseFavoListMap.size() + 1);
        _studentId_NotInScopeRelation_EnterpriseFavoListMap.put(key, subQuery); return "studentId_NotInScopeRelation_EnterpriseFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _studentId_NotInScopeRelation_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getStudentId_NotInScopeRelation_SchoolAplicantList() { return _studentId_NotInScopeRelation_SchoolAplicantListMap; }
    public String keepStudentId_NotInScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_studentId_NotInScopeRelation_SchoolAplicantListMap == null) { _studentId_NotInScopeRelation_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotInScopeRelation_SchoolAplicantListMap.size() + 1);
        _studentId_NotInScopeRelation_SchoolAplicantListMap.put(key, subQuery); return "studentId_NotInScopeRelation_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _studentId_NotInScopeRelation_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getStudentId_NotInScopeRelation_SchoolFavoList() { return _studentId_NotInScopeRelation_SchoolFavoListMap; }
    public String keepStudentId_NotInScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_studentId_NotInScopeRelation_SchoolFavoListMap == null) { _studentId_NotInScopeRelation_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_NotInScopeRelation_SchoolFavoListMap.size() + 1);
        _studentId_NotInScopeRelation_SchoolFavoListMap.put(key, subQuery); return "studentId_NotInScopeRelation_SchoolFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _studentId_QueryDerivedReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getStudentId_QueryDerivedReferrer_EnterpriseAplicantList() { return _studentId_QueryDerivedReferrer_EnterpriseAplicantListMap; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_studentId_QueryDerivedReferrer_EnterpriseAplicantListMap == null) { _studentId_QueryDerivedReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_QueryDerivedReferrer_EnterpriseAplicantListMap.size() + 1);
        _studentId_QueryDerivedReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "studentId_QueryDerivedReferrer_EnterpriseAplicantList." + key;
    }
    protected Map<String, Object> _studentId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap;
    public Map<String, Object> getStudentId_QueryDerivedReferrer_EnterpriseAplicantListParameter() { return _studentId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseAplicantListParameter(Object parameterValue) {
        if (_studentId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap == null) { _studentId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_studentId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap.size() + 1);
        _studentId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap.put(key, parameterValue); return "studentId_QueryDerivedReferrer_EnterpriseAplicantListParameter." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _studentId_QueryDerivedReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getStudentId_QueryDerivedReferrer_EnterpriseFavoList() { return _studentId_QueryDerivedReferrer_EnterpriseFavoListMap; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_studentId_QueryDerivedReferrer_EnterpriseFavoListMap == null) { _studentId_QueryDerivedReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_QueryDerivedReferrer_EnterpriseFavoListMap.size() + 1);
        _studentId_QueryDerivedReferrer_EnterpriseFavoListMap.put(key, subQuery); return "studentId_QueryDerivedReferrer_EnterpriseFavoList." + key;
    }
    protected Map<String, Object> _studentId_QueryDerivedReferrer_EnterpriseFavoListParameterMap;
    public Map<String, Object> getStudentId_QueryDerivedReferrer_EnterpriseFavoListParameter() { return _studentId_QueryDerivedReferrer_EnterpriseFavoListParameterMap; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseFavoListParameter(Object parameterValue) {
        if (_studentId_QueryDerivedReferrer_EnterpriseFavoListParameterMap == null) { _studentId_QueryDerivedReferrer_EnterpriseFavoListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_studentId_QueryDerivedReferrer_EnterpriseFavoListParameterMap.size() + 1);
        _studentId_QueryDerivedReferrer_EnterpriseFavoListParameterMap.put(key, parameterValue); return "studentId_QueryDerivedReferrer_EnterpriseFavoListParameter." + key;
    }

    protected Map<String, SchoolAplicantCQ> _studentId_QueryDerivedReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getStudentId_QueryDerivedReferrer_SchoolAplicantList() { return _studentId_QueryDerivedReferrer_SchoolAplicantListMap; }
    public String keepStudentId_QueryDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_studentId_QueryDerivedReferrer_SchoolAplicantListMap == null) { _studentId_QueryDerivedReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_QueryDerivedReferrer_SchoolAplicantListMap.size() + 1);
        _studentId_QueryDerivedReferrer_SchoolAplicantListMap.put(key, subQuery); return "studentId_QueryDerivedReferrer_SchoolAplicantList." + key;
    }
    protected Map<String, Object> _studentId_QueryDerivedReferrer_SchoolAplicantListParameterMap;
    public Map<String, Object> getStudentId_QueryDerivedReferrer_SchoolAplicantListParameter() { return _studentId_QueryDerivedReferrer_SchoolAplicantListParameterMap; }
    public String keepStudentId_QueryDerivedReferrer_SchoolAplicantListParameter(Object parameterValue) {
        if (_studentId_QueryDerivedReferrer_SchoolAplicantListParameterMap == null) { _studentId_QueryDerivedReferrer_SchoolAplicantListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_studentId_QueryDerivedReferrer_SchoolAplicantListParameterMap.size() + 1);
        _studentId_QueryDerivedReferrer_SchoolAplicantListParameterMap.put(key, parameterValue); return "studentId_QueryDerivedReferrer_SchoolAplicantListParameter." + key;
    }

    protected Map<String, SchoolFavoCQ> _studentId_QueryDerivedReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getStudentId_QueryDerivedReferrer_SchoolFavoList() { return _studentId_QueryDerivedReferrer_SchoolFavoListMap; }
    public String keepStudentId_QueryDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_studentId_QueryDerivedReferrer_SchoolFavoListMap == null) { _studentId_QueryDerivedReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_studentId_QueryDerivedReferrer_SchoolFavoListMap.size() + 1);
        _studentId_QueryDerivedReferrer_SchoolFavoListMap.put(key, subQuery); return "studentId_QueryDerivedReferrer_SchoolFavoList." + key;
    }
    protected Map<String, Object> _studentId_QueryDerivedReferrer_SchoolFavoListParameterMap;
    public Map<String, Object> getStudentId_QueryDerivedReferrer_SchoolFavoListParameter() { return _studentId_QueryDerivedReferrer_SchoolFavoListParameterMap; }
    public String keepStudentId_QueryDerivedReferrer_SchoolFavoListParameter(Object parameterValue) {
        if (_studentId_QueryDerivedReferrer_SchoolFavoListParameterMap == null) { _studentId_QueryDerivedReferrer_SchoolFavoListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_studentId_QueryDerivedReferrer_SchoolFavoListParameterMap.size() + 1);
        _studentId_QueryDerivedReferrer_SchoolFavoListParameterMap.put(key, parameterValue); return "studentId_QueryDerivedReferrer_SchoolFavoListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_StudentId_Asc() { regOBA("student_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_StudentId_Desc() { regOBD("student_id"); return this; }

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
    public BsStudentCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = nCV(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    /** 
     * Add order-by as ascend. <br />
     * name: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Name_Asc() { regOBA("name"); return this; }

    /**
     * Add order-by as descend. <br />
     * name: {VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Name_Desc() { regOBD("name"); return this; }

    protected ConditionValue _birthday;
    public ConditionValue getBirthday() {
        if (_birthday == null) { _birthday = nCV(); }
        return _birthday;
    }
    protected ConditionValue getCValueBirthday() { return getBirthday(); }

    /** 
     * Add order-by as ascend. <br />
     * birthday: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Birthday_Asc() { regOBA("birthday"); return this; }

    /**
     * Add order-by as descend. <br />
     * birthday: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Birthday_Desc() { regOBD("birthday"); return this; }

    protected ConditionValue _sex;
    public ConditionValue getSex() {
        if (_sex == null) { _sex = nCV(); }
        return _sex;
    }
    protected ConditionValue getCValueSex() { return getSex(); }

    /** 
     * Add order-by as ascend. <br />
     * sex: {INT(10)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Sex_Asc() { regOBA("sex"); return this; }

    /**
     * Add order-by as descend. <br />
     * sex: {INT(10)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Sex_Desc() { regOBD("sex"); return this; }

    protected ConditionValue _phoneNumber;
    public ConditionValue getPhoneNumber() {
        if (_phoneNumber == null) { _phoneNumber = nCV(); }
        return _phoneNumber;
    }
    protected ConditionValue getCValuePhoneNumber() { return getPhoneNumber(); }

    /** 
     * Add order-by as ascend. <br />
     * phone_number: {VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_PhoneNumber_Asc() { regOBA("phone_number"); return this; }

    /**
     * Add order-by as descend. <br />
     * phone_number: {VARCHAR(12)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_PhoneNumber_Desc() { regOBD("phone_number"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue getMailAddress() {
        if (_mailAddress == null) { _mailAddress = nCV(); }
        return _mailAddress;
    }
    protected ConditionValue getCValueMailAddress() { return getMailAddress(); }

    /** 
     * Add order-by as ascend. <br />
     * mail_address: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_MailAddress_Asc() { regOBA("mail_address"); return this; }

    /**
     * Add order-by as descend. <br />
     * mail_address: {VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_MailAddress_Desc() { regOBD("mail_address"); return this; }

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
    public BsStudentCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br />
     * address: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsStudentCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

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
    public BsStudentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsStudentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        StudentCQ baseQuery = (StudentCQ)baseQueryAsSuper;
        StudentCQ unionQuery = (StudentCQ)unionQueryAsSuper;
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
        String nrp = resolveNextRelationPath("student", "login");
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
    protected Map<String, StudentCQ> _scalarConditionMap;
    public Map<String, StudentCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(StudentCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, StudentCQ> _specifyMyselfDerivedMap;
    public Map<String, StudentCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(StudentCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, StudentCQ> _queryMyselfDerivedMap;
    public Map<String, StudentCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(StudentCQ subQuery) {
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
    protected Map<String, StudentCQ> _myselfExistsMap;
    public Map<String, StudentCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(StudentCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, StudentCQ> _myselfInScopeMap;
    public Map<String, StudentCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(StudentCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return StudentCB.class.getName(); }
    protected String xCQ() { return StudentCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
