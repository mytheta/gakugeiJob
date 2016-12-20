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
 * The base condition-query of enterprise_offer.
 * @author DBFlute(AutoGenerator)
 */
public class BsEnterpriseOfferCQ extends AbstractBsEnterpriseOfferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseOfferCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEnterpriseOfferCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from enterprise_offer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public EnterpriseOfferCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected EnterpriseOfferCIQ xcreateCIQ() {
        EnterpriseOfferCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected EnterpriseOfferCIQ xnewCIQ() {
        return new EnterpriseOfferCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join enterprise_offer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public EnterpriseOfferCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        EnterpriseOfferCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, EnterpriseAplicantCQ> _jobOfferId_ExistsReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getJobOfferId_ExistsReferrer_EnterpriseAplicantList() { return _jobOfferId_ExistsReferrer_EnterpriseAplicantListMap; }
    public String keepJobOfferId_ExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_jobOfferId_ExistsReferrer_EnterpriseAplicantListMap == null) { _jobOfferId_ExistsReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_ExistsReferrer_EnterpriseAplicantListMap.size() + 1);
        _jobOfferId_ExistsReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "jobOfferId_ExistsReferrer_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _jobOfferId_ExistsReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getJobOfferId_ExistsReferrer_EnterpriseFavoList() { return _jobOfferId_ExistsReferrer_EnterpriseFavoListMap; }
    public String keepJobOfferId_ExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_jobOfferId_ExistsReferrer_EnterpriseFavoListMap == null) { _jobOfferId_ExistsReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_ExistsReferrer_EnterpriseFavoListMap.size() + 1);
        _jobOfferId_ExistsReferrer_EnterpriseFavoListMap.put(key, subQuery); return "jobOfferId_ExistsReferrer_EnterpriseFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _jobOfferId_NotExistsReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getJobOfferId_NotExistsReferrer_EnterpriseAplicantList() { return _jobOfferId_NotExistsReferrer_EnterpriseAplicantListMap; }
    public String keepJobOfferId_NotExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_jobOfferId_NotExistsReferrer_EnterpriseAplicantListMap == null) { _jobOfferId_NotExistsReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_NotExistsReferrer_EnterpriseAplicantListMap.size() + 1);
        _jobOfferId_NotExistsReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "jobOfferId_NotExistsReferrer_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _jobOfferId_NotExistsReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getJobOfferId_NotExistsReferrer_EnterpriseFavoList() { return _jobOfferId_NotExistsReferrer_EnterpriseFavoListMap; }
    public String keepJobOfferId_NotExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_jobOfferId_NotExistsReferrer_EnterpriseFavoListMap == null) { _jobOfferId_NotExistsReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_NotExistsReferrer_EnterpriseFavoListMap.size() + 1);
        _jobOfferId_NotExistsReferrer_EnterpriseFavoListMap.put(key, subQuery); return "jobOfferId_NotExistsReferrer_EnterpriseFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getJobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantList() { return _jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantListMap; }
    public String keepJobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantListMap == null) { _jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantListMap.size() + 1);
        _jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "jobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getJobOfferId_SpecifyDerivedReferrer_EnterpriseFavoList() { return _jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoListMap; }
    public String keepJobOfferId_SpecifyDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoListMap == null) { _jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoListMap.size() + 1);
        _jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoListMap.put(key, subQuery); return "jobOfferId_SpecifyDerivedReferrer_EnterpriseFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _jobOfferId_InScopeRelation_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getJobOfferId_InScopeRelation_EnterpriseAplicantList() { return _jobOfferId_InScopeRelation_EnterpriseAplicantListMap; }
    public String keepJobOfferId_InScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_jobOfferId_InScopeRelation_EnterpriseAplicantListMap == null) { _jobOfferId_InScopeRelation_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_InScopeRelation_EnterpriseAplicantListMap.size() + 1);
        _jobOfferId_InScopeRelation_EnterpriseAplicantListMap.put(key, subQuery); return "jobOfferId_InScopeRelation_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _jobOfferId_InScopeRelation_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getJobOfferId_InScopeRelation_EnterpriseFavoList() { return _jobOfferId_InScopeRelation_EnterpriseFavoListMap; }
    public String keepJobOfferId_InScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_jobOfferId_InScopeRelation_EnterpriseFavoListMap == null) { _jobOfferId_InScopeRelation_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_InScopeRelation_EnterpriseFavoListMap.size() + 1);
        _jobOfferId_InScopeRelation_EnterpriseFavoListMap.put(key, subQuery); return "jobOfferId_InScopeRelation_EnterpriseFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _jobOfferId_NotInScopeRelation_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getJobOfferId_NotInScopeRelation_EnterpriseAplicantList() { return _jobOfferId_NotInScopeRelation_EnterpriseAplicantListMap; }
    public String keepJobOfferId_NotInScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_jobOfferId_NotInScopeRelation_EnterpriseAplicantListMap == null) { _jobOfferId_NotInScopeRelation_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_NotInScopeRelation_EnterpriseAplicantListMap.size() + 1);
        _jobOfferId_NotInScopeRelation_EnterpriseAplicantListMap.put(key, subQuery); return "jobOfferId_NotInScopeRelation_EnterpriseAplicantList." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _jobOfferId_NotInScopeRelation_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getJobOfferId_NotInScopeRelation_EnterpriseFavoList() { return _jobOfferId_NotInScopeRelation_EnterpriseFavoListMap; }
    public String keepJobOfferId_NotInScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_jobOfferId_NotInScopeRelation_EnterpriseFavoListMap == null) { _jobOfferId_NotInScopeRelation_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_NotInScopeRelation_EnterpriseFavoListMap.size() + 1);
        _jobOfferId_NotInScopeRelation_EnterpriseFavoListMap.put(key, subQuery); return "jobOfferId_NotInScopeRelation_EnterpriseFavoList." + key;
    }

    protected Map<String, EnterpriseAplicantCQ> _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListMap;
    public Map<String, EnterpriseAplicantCQ> getJobOfferId_QueryDerivedReferrer_EnterpriseAplicantList() { return _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListMap; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery) {
        if (_jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListMap == null) { _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListMap.size() + 1);
        _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListMap.put(key, subQuery); return "jobOfferId_QueryDerivedReferrer_EnterpriseAplicantList." + key;
    }
    protected Map<String, Object> _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap;
    public Map<String, Object> getJobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameter() { return _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameter(Object parameterValue) {
        if (_jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap == null) { _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap.size() + 1);
        _jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameterMap.put(key, parameterValue); return "jobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameter." + key;
    }

    protected Map<String, EnterpriseFavoCQ> _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListMap;
    public Map<String, EnterpriseFavoCQ> getJobOfferId_QueryDerivedReferrer_EnterpriseFavoList() { return _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListMap; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery) {
        if (_jobOfferId_QueryDerivedReferrer_EnterpriseFavoListMap == null) { _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_jobOfferId_QueryDerivedReferrer_EnterpriseFavoListMap.size() + 1);
        _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListMap.put(key, subQuery); return "jobOfferId_QueryDerivedReferrer_EnterpriseFavoList." + key;
    }
    protected Map<String, Object> _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameterMap;
    public Map<String, Object> getJobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameter() { return _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameterMap; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameter(Object parameterValue) {
        if (_jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameterMap == null) { _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameterMap.size() + 1);
        _jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameterMap.put(key, parameterValue); return "jobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_JobOfferId_Asc() { regOBA("job_offer_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_JobOfferId_Desc() { regOBD("job_offer_id"); return this; }

    protected ConditionValue _enterpriseId;
    public ConditionValue getEnterpriseId() {
        if (_enterpriseId == null) { _enterpriseId = nCV(); }
        return _enterpriseId;
    }
    protected ConditionValue getCValueEnterpriseId() { return getEnterpriseId(); }

    protected Map<String, EnterpriseCQ> _enterpriseId_InScopeRelation_EnterpriseMap;
    public Map<String, EnterpriseCQ> getEnterpriseId_InScopeRelation_Enterprise() { return _enterpriseId_InScopeRelation_EnterpriseMap; }
    public String keepEnterpriseId_InScopeRelation_Enterprise(EnterpriseCQ subQuery) {
        if (_enterpriseId_InScopeRelation_EnterpriseMap == null) { _enterpriseId_InScopeRelation_EnterpriseMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_InScopeRelation_EnterpriseMap.size() + 1);
        _enterpriseId_InScopeRelation_EnterpriseMap.put(key, subQuery); return "enterpriseId_InScopeRelation_Enterprise." + key;
    }

    protected Map<String, EnterpriseCQ> _enterpriseId_NotInScopeRelation_EnterpriseMap;
    public Map<String, EnterpriseCQ> getEnterpriseId_NotInScopeRelation_Enterprise() { return _enterpriseId_NotInScopeRelation_EnterpriseMap; }
    public String keepEnterpriseId_NotInScopeRelation_Enterprise(EnterpriseCQ subQuery) {
        if (_enterpriseId_NotInScopeRelation_EnterpriseMap == null) { _enterpriseId_NotInScopeRelation_EnterpriseMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_enterpriseId_NotInScopeRelation_EnterpriseMap.size() + 1);
        _enterpriseId_NotInScopeRelation_EnterpriseMap.put(key, subQuery); return "enterpriseId_NotInScopeRelation_Enterprise." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_EnterpriseId_Asc() { regOBA("enterprise_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_EnterpriseId_Desc() { regOBD("enterprise_id"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = nCV(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    /** 
     * Add order-by as ascend. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

    protected ConditionValue _officeName;
    public ConditionValue getOfficeName() {
        if (_officeName == null) { _officeName = nCV(); }
        return _officeName;
    }
    protected ConditionValue getCValueOfficeName() { return getOfficeName(); }

    /** 
     * Add order-by as ascend. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_OfficeName_Asc() { regOBA("office_name"); return this; }

    /**
     * Add order-by as descend. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_OfficeName_Desc() { regOBD("office_name"); return this; }

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
    public BsEnterpriseOfferCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br />
     * address: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

    protected ConditionValue _station;
    public ConditionValue getStation() {
        if (_station == null) { _station = nCV(); }
        return _station;
    }
    protected ConditionValue getCValueStation() { return getStation(); }

    /** 
     * Add order-by as ascend. <br />
     * station: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Station_Asc() { regOBA("station"); return this; }

    /**
     * Add order-by as descend. <br />
     * station: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Station_Desc() { regOBD("station"); return this; }

    protected ConditionValue _period;
    public ConditionValue getPeriod() {
        if (_period == null) { _period = nCV(); }
        return _period;
    }
    protected ConditionValue getCValuePeriod() { return getPeriod(); }

    /** 
     * Add order-by as ascend. <br />
     * period: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Period_Asc() { regOBA("period"); return this; }

    /**
     * Add order-by as descend. <br />
     * period: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Period_Desc() { regOBD("period"); return this; }

    protected ConditionValue _holiday;
    public ConditionValue getHoliday() {
        if (_holiday == null) { _holiday = nCV(); }
        return _holiday;
    }
    protected ConditionValue getCValueHoliday() { return getHoliday(); }

    /** 
     * Add order-by as ascend. <br />
     * holiday: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Holiday_Asc() { regOBA("holiday"); return this; }

    /**
     * Add order-by as descend. <br />
     * holiday: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Holiday_Desc() { regOBD("holiday"); return this; }

    protected ConditionValue _workingTime;
    public ConditionValue getWorkingTime() {
        if (_workingTime == null) { _workingTime = nCV(); }
        return _workingTime;
    }
    protected ConditionValue getCValueWorkingTime() { return getWorkingTime(); }

    /** 
     * Add order-by as ascend. <br />
     * working_time: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_WorkingTime_Asc() { regOBA("working_time"); return this; }

    /**
     * Add order-by as descend. <br />
     * working_time: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_WorkingTime_Desc() { regOBD("working_time"); return this; }

    protected ConditionValue _salary;
    public ConditionValue getSalary() {
        if (_salary == null) { _salary = nCV(); }
        return _salary;
    }
    protected ConditionValue getCValueSalary() { return getSalary(); }

    /** 
     * Add order-by as ascend. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Salary_Asc() { regOBA("salary"); return this; }

    /**
     * Add order-by as descend. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Salary_Desc() { regOBD("salary"); return this; }

    protected ConditionValue _qualification;
    public ConditionValue getQualification() {
        if (_qualification == null) { _qualification = nCV(); }
        return _qualification;
    }
    protected ConditionValue getCValueQualification() { return getQualification(); }

    /** 
     * Add order-by as ascend. <br />
     * qualification: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Qualification_Asc() { regOBA("qualification"); return this; }

    /**
     * Add order-by as descend. <br />
     * qualification: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Qualification_Desc() { regOBD("qualification"); return this; }

    protected ConditionValue _welfare;
    public ConditionValue getWelfare() {
        if (_welfare == null) { _welfare = nCV(); }
        return _welfare;
    }
    protected ConditionValue getCValueWelfare() { return getWelfare(); }

    /** 
     * Add order-by as ascend. <br />
     * welfare: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Welfare_Asc() { regOBA("welfare"); return this; }

    /**
     * Add order-by as descend. <br />
     * welfare: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Welfare_Desc() { regOBD("welfare"); return this; }

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
    public BsEnterpriseOfferCQ addOrderBy_OneThing_Asc() { regOBA("one_thing"); return this; }

    /**
     * Add order-by as descend. <br />
     * one_thing: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_OneThing_Desc() { regOBD("one_thing"); return this; }

    protected ConditionValue _favo;
    public ConditionValue getFavo() {
        if (_favo == null) { _favo = nCV(); }
        return _favo;
    }
    protected ConditionValue getCValueFavo() { return getFavo(); }

    /** 
     * Add order-by as ascend. <br />
     * favo: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Favo_Asc() { regOBA("favo"); return this; }

    /**
     * Add order-by as descend. <br />
     * favo: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_Favo_Desc() { regOBD("favo"); return this; }

    protected ConditionValue _registrationDate;
    public ConditionValue getRegistrationDate() {
        if (_registrationDate == null) { _registrationDate = nCV(); }
        return _registrationDate;
    }
    protected ConditionValue getCValueRegistrationDate() { return getRegistrationDate(); }

    /** 
     * Add order-by as ascend. <br />
     * registration_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_RegistrationDate_Asc() { regOBA("registration_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * registration_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsEnterpriseOfferCQ addOrderBy_RegistrationDate_Desc() { regOBD("registration_date"); return this; }

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
    public BsEnterpriseOfferCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsEnterpriseOfferCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        EnterpriseOfferCQ baseQuery = (EnterpriseOfferCQ)baseQueryAsSuper;
        EnterpriseOfferCQ unionQuery = (EnterpriseOfferCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryEnterprise()) {
            unionQuery.queryEnterprise().reflectRelationOnUnionQuery(baseQuery.queryEnterprise(), unionQuery.queryEnterprise());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * enterprise by my enterprise_id, named 'enterprise'.
     * @return The instance of condition-query. (NotNull)
     */
    public EnterpriseCQ queryEnterprise() {
        return getConditionQueryEnterprise();
    }
    protected EnterpriseCQ _conditionQueryEnterprise;
    public EnterpriseCQ getConditionQueryEnterprise() {
        if (_conditionQueryEnterprise == null) {
            _conditionQueryEnterprise = xcreateQueryEnterprise();
            xsetupOuterJoinEnterprise();
        }
        return _conditionQueryEnterprise;
    }
    protected EnterpriseCQ xcreateQueryEnterprise() {
        String nrp = resolveNextRelationPath("enterprise_offer", "enterprise");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        EnterpriseCQ cq = new EnterpriseCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("enterprise");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinEnterprise() {
        EnterpriseCQ cq = getConditionQueryEnterprise();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("enterprise_id", "enterprise_id");
        registerOuterJoin(cq, joinOnMap, "enterprise");
    }
    public boolean hasConditionQueryEnterprise() {
        return _conditionQueryEnterprise != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, EnterpriseOfferCQ> _scalarConditionMap;
    public Map<String, EnterpriseOfferCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(EnterpriseOfferCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, EnterpriseOfferCQ> _specifyMyselfDerivedMap;
    public Map<String, EnterpriseOfferCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(EnterpriseOfferCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, EnterpriseOfferCQ> _queryMyselfDerivedMap;
    public Map<String, EnterpriseOfferCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(EnterpriseOfferCQ subQuery) {
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
    protected Map<String, EnterpriseOfferCQ> _myselfExistsMap;
    public Map<String, EnterpriseOfferCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(EnterpriseOfferCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, EnterpriseOfferCQ> _myselfInScopeMap;
    public Map<String, EnterpriseOfferCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(EnterpriseOfferCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return EnterpriseOfferCB.class.getName(); }
    protected String xCQ() { return EnterpriseOfferCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
