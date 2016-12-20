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
 * The base condition-query of school_offer.
 * @author DBFlute(AutoGenerator)
 */
public class BsSchoolOfferCQ extends AbstractBsSchoolOfferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolOfferCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSchoolOfferCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from school_offer) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public SchoolOfferCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected SchoolOfferCIQ xcreateCIQ() {
        SchoolOfferCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected SchoolOfferCIQ xnewCIQ() {
        return new SchoolOfferCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join school_offer on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public SchoolOfferCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        SchoolOfferCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    protected Map<String, SchoolAplicantCQ> _schoolOfferId_ExistsReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getSchoolOfferId_ExistsReferrer_SchoolAplicantList() { return _schoolOfferId_ExistsReferrer_SchoolAplicantListMap; }
    public String keepSchoolOfferId_ExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_schoolOfferId_ExistsReferrer_SchoolAplicantListMap == null) { _schoolOfferId_ExistsReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_ExistsReferrer_SchoolAplicantListMap.size() + 1);
        _schoolOfferId_ExistsReferrer_SchoolAplicantListMap.put(key, subQuery); return "schoolOfferId_ExistsReferrer_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _schoolOfferId_ExistsReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getSchoolOfferId_ExistsReferrer_SchoolFavoList() { return _schoolOfferId_ExistsReferrer_SchoolFavoListMap; }
    public String keepSchoolOfferId_ExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_schoolOfferId_ExistsReferrer_SchoolFavoListMap == null) { _schoolOfferId_ExistsReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_ExistsReferrer_SchoolFavoListMap.size() + 1);
        _schoolOfferId_ExistsReferrer_SchoolFavoListMap.put(key, subQuery); return "schoolOfferId_ExistsReferrer_SchoolFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _schoolOfferId_NotExistsReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getSchoolOfferId_NotExistsReferrer_SchoolAplicantList() { return _schoolOfferId_NotExistsReferrer_SchoolAplicantListMap; }
    public String keepSchoolOfferId_NotExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_schoolOfferId_NotExistsReferrer_SchoolAplicantListMap == null) { _schoolOfferId_NotExistsReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_NotExistsReferrer_SchoolAplicantListMap.size() + 1);
        _schoolOfferId_NotExistsReferrer_SchoolAplicantListMap.put(key, subQuery); return "schoolOfferId_NotExistsReferrer_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _schoolOfferId_NotExistsReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getSchoolOfferId_NotExistsReferrer_SchoolFavoList() { return _schoolOfferId_NotExistsReferrer_SchoolFavoListMap; }
    public String keepSchoolOfferId_NotExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_schoolOfferId_NotExistsReferrer_SchoolFavoListMap == null) { _schoolOfferId_NotExistsReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_NotExistsReferrer_SchoolFavoListMap.size() + 1);
        _schoolOfferId_NotExistsReferrer_SchoolFavoListMap.put(key, subQuery); return "schoolOfferId_NotExistsReferrer_SchoolFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getSchoolOfferId_SpecifyDerivedReferrer_SchoolAplicantList() { return _schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantListMap; }
    public String keepSchoolOfferId_SpecifyDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantListMap == null) { _schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantListMap.size() + 1);
        _schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantListMap.put(key, subQuery); return "schoolOfferId_SpecifyDerivedReferrer_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _schoolOfferId_SpecifyDerivedReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getSchoolOfferId_SpecifyDerivedReferrer_SchoolFavoList() { return _schoolOfferId_SpecifyDerivedReferrer_SchoolFavoListMap; }
    public String keepSchoolOfferId_SpecifyDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_schoolOfferId_SpecifyDerivedReferrer_SchoolFavoListMap == null) { _schoolOfferId_SpecifyDerivedReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_SpecifyDerivedReferrer_SchoolFavoListMap.size() + 1);
        _schoolOfferId_SpecifyDerivedReferrer_SchoolFavoListMap.put(key, subQuery); return "schoolOfferId_SpecifyDerivedReferrer_SchoolFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _schoolOfferId_InScopeRelation_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getSchoolOfferId_InScopeRelation_SchoolAplicantList() { return _schoolOfferId_InScopeRelation_SchoolAplicantListMap; }
    public String keepSchoolOfferId_InScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_schoolOfferId_InScopeRelation_SchoolAplicantListMap == null) { _schoolOfferId_InScopeRelation_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_InScopeRelation_SchoolAplicantListMap.size() + 1);
        _schoolOfferId_InScopeRelation_SchoolAplicantListMap.put(key, subQuery); return "schoolOfferId_InScopeRelation_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _schoolOfferId_InScopeRelation_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getSchoolOfferId_InScopeRelation_SchoolFavoList() { return _schoolOfferId_InScopeRelation_SchoolFavoListMap; }
    public String keepSchoolOfferId_InScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_schoolOfferId_InScopeRelation_SchoolFavoListMap == null) { _schoolOfferId_InScopeRelation_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_InScopeRelation_SchoolFavoListMap.size() + 1);
        _schoolOfferId_InScopeRelation_SchoolFavoListMap.put(key, subQuery); return "schoolOfferId_InScopeRelation_SchoolFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _schoolOfferId_NotInScopeRelation_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getSchoolOfferId_NotInScopeRelation_SchoolAplicantList() { return _schoolOfferId_NotInScopeRelation_SchoolAplicantListMap; }
    public String keepSchoolOfferId_NotInScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_schoolOfferId_NotInScopeRelation_SchoolAplicantListMap == null) { _schoolOfferId_NotInScopeRelation_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_NotInScopeRelation_SchoolAplicantListMap.size() + 1);
        _schoolOfferId_NotInScopeRelation_SchoolAplicantListMap.put(key, subQuery); return "schoolOfferId_NotInScopeRelation_SchoolAplicantList." + key;
    }

    protected Map<String, SchoolFavoCQ> _schoolOfferId_NotInScopeRelation_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getSchoolOfferId_NotInScopeRelation_SchoolFavoList() { return _schoolOfferId_NotInScopeRelation_SchoolFavoListMap; }
    public String keepSchoolOfferId_NotInScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_schoolOfferId_NotInScopeRelation_SchoolFavoListMap == null) { _schoolOfferId_NotInScopeRelation_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_NotInScopeRelation_SchoolFavoListMap.size() + 1);
        _schoolOfferId_NotInScopeRelation_SchoolFavoListMap.put(key, subQuery); return "schoolOfferId_NotInScopeRelation_SchoolFavoList." + key;
    }

    protected Map<String, SchoolAplicantCQ> _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListMap;
    public Map<String, SchoolAplicantCQ> getSchoolOfferId_QueryDerivedReferrer_SchoolAplicantList() { return _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListMap; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery) {
        if (_schoolOfferId_QueryDerivedReferrer_SchoolAplicantListMap == null) { _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_QueryDerivedReferrer_SchoolAplicantListMap.size() + 1);
        _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListMap.put(key, subQuery); return "schoolOfferId_QueryDerivedReferrer_SchoolAplicantList." + key;
    }
    protected Map<String, Object> _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameterMap;
    public Map<String, Object> getSchoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameter() { return _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameterMap; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameter(Object parameterValue) {
        if (_schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameterMap == null) { _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameterMap.size() + 1);
        _schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameterMap.put(key, parameterValue); return "schoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameter." + key;
    }

    protected Map<String, SchoolFavoCQ> _schoolOfferId_QueryDerivedReferrer_SchoolFavoListMap;
    public Map<String, SchoolFavoCQ> getSchoolOfferId_QueryDerivedReferrer_SchoolFavoList() { return _schoolOfferId_QueryDerivedReferrer_SchoolFavoListMap; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery) {
        if (_schoolOfferId_QueryDerivedReferrer_SchoolFavoListMap == null) { _schoolOfferId_QueryDerivedReferrer_SchoolFavoListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolOfferId_QueryDerivedReferrer_SchoolFavoListMap.size() + 1);
        _schoolOfferId_QueryDerivedReferrer_SchoolFavoListMap.put(key, subQuery); return "schoolOfferId_QueryDerivedReferrer_SchoolFavoList." + key;
    }
    protected Map<String, Object> _schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameterMap;
    public Map<String, Object> getSchoolOfferId_QueryDerivedReferrer_SchoolFavoListParameter() { return _schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameterMap; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoListParameter(Object parameterValue) {
        if (_schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameterMap == null) { _schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameterMap.size() + 1);
        _schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameterMap.put(key, parameterValue); return "schoolOfferId_QueryDerivedReferrer_SchoolFavoListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_SchoolOfferId_Asc() { regOBA("school_offer_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_SchoolOfferId_Desc() { regOBD("school_offer_id"); return this; }

    protected ConditionValue _schoolId;
    public ConditionValue getSchoolId() {
        if (_schoolId == null) { _schoolId = nCV(); }
        return _schoolId;
    }
    protected ConditionValue getCValueSchoolId() { return getSchoolId(); }

    protected Map<String, SchoolCQ> _schoolId_InScopeRelation_SchoolMap;
    public Map<String, SchoolCQ> getSchoolId_InScopeRelation_School() { return _schoolId_InScopeRelation_SchoolMap; }
    public String keepSchoolId_InScopeRelation_School(SchoolCQ subQuery) {
        if (_schoolId_InScopeRelation_SchoolMap == null) { _schoolId_InScopeRelation_SchoolMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_InScopeRelation_SchoolMap.size() + 1);
        _schoolId_InScopeRelation_SchoolMap.put(key, subQuery); return "schoolId_InScopeRelation_School." + key;
    }

    protected Map<String, SchoolCQ> _schoolId_NotInScopeRelation_SchoolMap;
    public Map<String, SchoolCQ> getSchoolId_NotInScopeRelation_School() { return _schoolId_NotInScopeRelation_SchoolMap; }
    public String keepSchoolId_NotInScopeRelation_School(SchoolCQ subQuery) {
        if (_schoolId_NotInScopeRelation_SchoolMap == null) { _schoolId_NotInScopeRelation_SchoolMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_schoolId_NotInScopeRelation_SchoolMap.size() + 1);
        _schoolId_NotInScopeRelation_SchoolMap.put(key, subQuery); return "schoolId_NotInScopeRelation_School." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_SchoolId_Asc() { regOBA("school_id"); return this; }

    /**
     * Add order-by as descend. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_SchoolId_Desc() { regOBD("school_id"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Description_Asc() { regOBA("description"); return this; }

    /**
     * Add order-by as descend. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Description_Desc() { regOBD("description"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Salary_Asc() { regOBA("salary"); return this; }

    /**
     * Add order-by as descend. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Salary_Desc() { regOBD("salary"); return this; }

    protected ConditionValue _workSchedule;
    public ConditionValue getWorkSchedule() {
        if (_workSchedule == null) { _workSchedule = nCV(); }
        return _workSchedule;
    }
    protected ConditionValue getCValueWorkSchedule() { return getWorkSchedule(); }

    /** 
     * Add order-by as ascend. <br />
     * work_schedule: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_WorkSchedule_Asc() { regOBA("work_schedule"); return this; }

    /**
     * Add order-by as descend. <br />
     * work_schedule: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_WorkSchedule_Desc() { regOBD("work_schedule"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Period_Asc() { regOBA("period"); return this; }

    /**
     * Add order-by as descend. <br />
     * period: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Period_Desc() { regOBD("period"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Address_Asc() { regOBA("address"); return this; }

    /**
     * Add order-by as descend. <br />
     * address: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Address_Desc() { regOBD("address"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Station_Asc() { regOBA("station"); return this; }

    /**
     * Add order-by as descend. <br />
     * station: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Station_Desc() { regOBD("station"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Qualification_Asc() { regOBA("qualification"); return this; }

    /**
     * Add order-by as descend. <br />
     * qualification: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Qualification_Desc() { regOBD("qualification"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Welfare_Asc() { regOBA("welfare"); return this; }

    /**
     * Add order-by as descend. <br />
     * welfare: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Welfare_Desc() { regOBD("welfare"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_OneThing_Asc() { regOBA("one_thing"); return this; }

    /**
     * Add order-by as descend. <br />
     * one_thing: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_OneThing_Desc() { regOBD("one_thing"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_Favo_Asc() { regOBA("favo"); return this; }

    /**
     * Add order-by as descend. <br />
     * favo: {INT UNSIGNED(10)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_Favo_Desc() { regOBD("favo"); return this; }

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
    public BsSchoolOfferCQ addOrderBy_RegistrationDate_Asc() { regOBA("registration_date"); return this; }

    /**
     * Add order-by as descend. <br />
     * registration_date: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsSchoolOfferCQ addOrderBy_RegistrationDate_Desc() { regOBD("registration_date"); return this; }

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
    public BsSchoolOfferCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsSchoolOfferCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        SchoolOfferCQ baseQuery = (SchoolOfferCQ)baseQueryAsSuper;
        SchoolOfferCQ unionQuery = (SchoolOfferCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQuerySchool()) {
            unionQuery.querySchool().reflectRelationOnUnionQuery(baseQuery.querySchool(), unionQuery.querySchool());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * school by my school_id, named 'school'.
     * @return The instance of condition-query. (NotNull)
     */
    public SchoolCQ querySchool() {
        return getConditionQuerySchool();
    }
    protected SchoolCQ _conditionQuerySchool;
    public SchoolCQ getConditionQuerySchool() {
        if (_conditionQuerySchool == null) {
            _conditionQuerySchool = xcreateQuerySchool();
            xsetupOuterJoinSchool();
        }
        return _conditionQuerySchool;
    }
    protected SchoolCQ xcreateQuerySchool() {
        String nrp = resolveNextRelationPath("school_offer", "school");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        SchoolCQ cq = new SchoolCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("school");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinSchool() {
        SchoolCQ cq = getConditionQuerySchool();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("school_id", "school_id");
        registerOuterJoin(cq, joinOnMap, "school");
    }
    public boolean hasConditionQuerySchool() {
        return _conditionQuerySchool != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, SchoolOfferCQ> _scalarConditionMap;
    public Map<String, SchoolOfferCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(SchoolOfferCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, SchoolOfferCQ> _specifyMyselfDerivedMap;
    public Map<String, SchoolOfferCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(SchoolOfferCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, SchoolOfferCQ> _queryMyselfDerivedMap;
    public Map<String, SchoolOfferCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(SchoolOfferCQ subQuery) {
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
    protected Map<String, SchoolOfferCQ> _myselfExistsMap;
    public Map<String, SchoolOfferCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(SchoolOfferCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, SchoolOfferCQ> _myselfInScopeMap;
    public Map<String, SchoolOfferCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(SchoolOfferCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return SchoolOfferCB.class.getName(); }
    protected String xCQ() { return SchoolOfferCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
