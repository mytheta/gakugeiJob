package gakugeiJob.db.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import gakugeiJob.db.allcommon.*;
import gakugeiJob.db.cbean.*;
import gakugeiJob.db.cbean.cq.*;

/**
 * The abstract condition-query of school_offer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSchoolOfferCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSchoolOfferCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "school_offer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferId The value of schoolOfferId as equal.
     */
    public void setSchoolOfferId_Equal(Integer schoolOfferId) {
        doSetSchoolOfferId_Equal(schoolOfferId);
    }

    protected void doSetSchoolOfferId_Equal(Integer schoolOfferId) {
        regSchoolOfferId(CK_EQ, schoolOfferId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferId The value of schoolOfferId as notEqual.
     */
    public void setSchoolOfferId_NotEqual(Integer schoolOfferId) {
        doSetSchoolOfferId_NotEqual(schoolOfferId);
    }

    protected void doSetSchoolOfferId_NotEqual(Integer schoolOfferId) {
        regSchoolOfferId(CK_NES, schoolOfferId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferId The value of schoolOfferId as greaterThan.
     */
    public void setSchoolOfferId_GreaterThan(Integer schoolOfferId) {
        regSchoolOfferId(CK_GT, schoolOfferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferId The value of schoolOfferId as lessThan.
     */
    public void setSchoolOfferId_LessThan(Integer schoolOfferId) {
        regSchoolOfferId(CK_LT, schoolOfferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferId The value of schoolOfferId as greaterEqual.
     */
    public void setSchoolOfferId_GreaterEqual(Integer schoolOfferId) {
        regSchoolOfferId(CK_GE, schoolOfferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferId The value of schoolOfferId as lessEqual.
     */
    public void setSchoolOfferId_LessEqual(Integer schoolOfferId) {
        regSchoolOfferId(CK_LE, schoolOfferId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of schoolOfferId. (NullAllowed)
     * @param maxNumber The max number of schoolOfferId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSchoolOfferId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSchoolOfferId(), "school_offer_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferIdList The collection of schoolOfferId as inScope.
     */
    public void setSchoolOfferId_InScope(Collection<Integer> schoolOfferIdList) {
        doSetSchoolOfferId_InScope(schoolOfferIdList);
    }

    protected void doSetSchoolOfferId_InScope(Collection<Integer> schoolOfferIdList) {
        regINS(CK_INS, cTL(schoolOfferIdList), getCValueSchoolOfferId(), "school_offer_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolOfferIdList The collection of schoolOfferId as notInScope.
     */
    public void setSchoolOfferId_NotInScope(Collection<Integer> schoolOfferIdList) {
        doSetSchoolOfferId_NotInScope(schoolOfferIdList);
    }

    protected void doSetSchoolOfferId_NotInScope(Collection<Integer> schoolOfferIdList) {
        regINS(CK_NINS, cTL(schoolOfferIdList), getCValueSchoolOfferId(), "school_offer_id");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select school_offer_id from school_aplicant where ...)} <br />
     * school_aplicant by your school_offer_id, named 'schoolAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSchoolAplicantList</span>(new SubQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolAplicantList for 'exists'. (NotNull)
     */
    public void existsSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_ExistsReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepSchoolOfferId_ExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select school_offer_id from school_favo where ...)} <br />
     * school_favo by your school_offer_id, named 'schoolFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSchoolFavoList</span>(new SubQuery&lt;SchoolFavoCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolFavoList for 'exists'. (NotNull)
     */
    public void existsSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_ExistsReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepSchoolOfferId_ExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select school_offer_id from school_aplicant where ...)} <br />
     * school_aplicant by your school_offer_id, named 'schoolAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSchoolAplicantList</span>(new SubQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolOfferId_NotExistsReferrer_SchoolAplicantList for 'not exists'. (NotNull)
     */
    public void notExistsSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_NotExistsReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepSchoolOfferId_NotExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select school_offer_id from school_favo where ...)} <br />
     * school_favo by your school_offer_id, named 'schoolFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSchoolFavoList</span>(new SubQuery&lt;SchoolFavoCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolOfferId_NotExistsReferrer_SchoolFavoList for 'not exists'. (NotNull)
     */
    public void notExistsSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_NotExistsReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepSchoolOfferId_NotExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select school_offer_id from school_aplicant where ...)} <br />
     * school_aplicant by your school_offer_id, named 'schoolAplicantAsOne'.
     * @param subQuery The sub-query of SchoolAplicantList for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_InScopeRelation_SchoolAplicantList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepSchoolOfferId_InScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select school_offer_id from school_favo where ...)} <br />
     * school_favo by your school_offer_id, named 'schoolFavoAsOne'.
     * @param subQuery The sub-query of SchoolFavoList for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_InScopeRelation_SchoolFavoList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepSchoolOfferId_InScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select school_offer_id from school_aplicant where ...)} <br />
     * school_aplicant by your school_offer_id, named 'schoolAplicantAsOne'.
     * @param subQuery The sub-query of SchoolAplicantList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_NotInScopeRelation_SchoolAplicantList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepSchoolOfferId_NotInScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select school_offer_id from school_favo where ...)} <br />
     * school_favo by your school_offer_id, named 'schoolFavoAsOne'.
     * @param subQuery The sub-query of SchoolFavoList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_NotInScopeRelation_SchoolFavoList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepSchoolOfferId_NotInScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery);

    public void xsderiveSchoolAplicantList(String function, SubQuery<SchoolAplicantCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_SpecifyDerivedReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolAplicantList", aliasName, option);
    }
    public abstract String keepSchoolOfferId_SpecifyDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);

    public void xsderiveSchoolFavoList(String function, SubQuery<SchoolFavoCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_SpecifyDerivedReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolFavoList", aliasName, option);
    }
    public abstract String keepSchoolOfferId_SpecifyDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from school_aplicant where ...)} <br />
     * school_aplicant by your school_offer_id, named 'schoolAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derived${tmpPropertyNameInitCap}()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;${tmpCBClassName}&gt;() {
     *     public void query(${tmpCBClassName} subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SchoolAplicantCB> derivedSchoolAplicantList() {
        return xcreateQDRFunctionSchoolAplicantList();
    }
    protected HpQDRFunction<SchoolAplicantCB> xcreateQDRFunctionSchoolAplicantList() {
        return new HpQDRFunction<SchoolAplicantCB>(new HpQDRSetupper<SchoolAplicantCB>() {
            public void setup(String function, SubQuery<SchoolAplicantCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveSchoolAplicantList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveSchoolAplicantList(String function, SubQuery<SchoolAplicantCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolAplicantList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);
    public abstract String keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from school_favo where ...)} <br />
     * school_favo by your school_offer_id, named 'schoolFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derived${tmpPropertyNameInitCap}()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;${tmpCBClassName}&gt;() {
     *     public void query(${tmpCBClassName} subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<SchoolFavoCB> derivedSchoolFavoList() {
        return xcreateQDRFunctionSchoolFavoList();
    }
    protected HpQDRFunction<SchoolFavoCB> xcreateQDRFunctionSchoolFavoList() {
        return new HpQDRFunction<SchoolFavoCB>(new HpQDRSetupper<SchoolFavoCB>() {
            public void setup(String function, SubQuery<SchoolFavoCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveSchoolFavoList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveSchoolFavoList(String function, SubQuery<SchoolFavoCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolFavoList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery);
    public abstract String keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setSchoolOfferId_IsNull() { regSchoolOfferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setSchoolOfferId_IsNotNull() { regSchoolOfferId(CK_ISNN, DOBJ); }

    protected void regSchoolOfferId(ConditionKey k, Object v) { regQ(k, v, getCValueSchoolOfferId(), "school_offer_id"); }
    abstract protected ConditionValue getCValueSchoolOfferId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolId The value of schoolId as equal.
     */
    public void setSchoolId_Equal(Integer schoolId) {
        doSetSchoolId_Equal(schoolId);
    }

    protected void doSetSchoolId_Equal(Integer schoolId) {
        regSchoolId(CK_EQ, schoolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolId The value of schoolId as notEqual.
     */
    public void setSchoolId_NotEqual(Integer schoolId) {
        doSetSchoolId_NotEqual(schoolId);
    }

    protected void doSetSchoolId_NotEqual(Integer schoolId) {
        regSchoolId(CK_NES, schoolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolId The value of schoolId as greaterThan.
     */
    public void setSchoolId_GreaterThan(Integer schoolId) {
        regSchoolId(CK_GT, schoolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolId The value of schoolId as lessThan.
     */
    public void setSchoolId_LessThan(Integer schoolId) {
        regSchoolId(CK_LT, schoolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolId The value of schoolId as greaterEqual.
     */
    public void setSchoolId_GreaterEqual(Integer schoolId) {
        regSchoolId(CK_GE, schoolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolId The value of schoolId as lessEqual.
     */
    public void setSchoolId_LessEqual(Integer schoolId) {
        regSchoolId(CK_LE, schoolId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param minNumber The min number of schoolId. (NullAllowed)
     * @param maxNumber The max number of schoolId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSchoolId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSchoolId(), "school_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolIdList The collection of schoolId as inScope.
     */
    public void setSchoolId_InScope(Collection<Integer> schoolIdList) {
        doSetSchoolId_InScope(schoolIdList);
    }

    protected void doSetSchoolId_InScope(Collection<Integer> schoolIdList) {
        regINS(CK_INS, cTL(schoolIdList), getCValueSchoolId(), "school_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     * @param schoolIdList The collection of schoolId as notInScope.
     */
    public void setSchoolId_NotInScope(Collection<Integer> schoolIdList) {
        doSetSchoolId_NotInScope(schoolIdList);
    }

    protected void doSetSchoolId_NotInScope(Collection<Integer> schoolIdList) {
        regINS(CK_NINS, cTL(schoolIdList), getCValueSchoolId(), "school_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select school_id from school where ...)} <br />
     * school by my school_id, named 'school'.
     * @param subQuery The sub-query of School for 'in-scope'. (NotNull)
     */
    public void inScopeSchool(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_InScopeRelation_School(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "school_id", "school_id", subQueryPropertyName, "school");
    }
    public abstract String keepSchoolId_InScopeRelation_School(SchoolCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select school_id from school where ...)} <br />
     * school by my school_id, named 'school'.
     * @param subQuery The sub-query of School for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchool(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_NotInScopeRelation_School(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "school_id", "school_id", subQueryPropertyName, "school");
    }
    public abstract String keepSchoolId_NotInScopeRelation_School(SchoolCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     */
    public void setSchoolId_IsNull() { regSchoolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * school_id: {IX, INT UNSIGNED(10), FK to school}
     */
    public void setSchoolId_IsNotNull() { regSchoolId(CK_ISNN, DOBJ); }

    protected void regSchoolId(ConditionKey k, Object v) { regQ(k, v, getCValueSchoolId(), "school_id"); }
    abstract protected ConditionValue getCValueSchoolId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as equal.
     */
    public void setDescription_Equal(String description) {
        doSetDescription_Equal(fRES(description));
    }

    protected void doSetDescription_Equal(String description) {
        regDescription(CK_EQ, description);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as notEqual.
     */
    public void setDescription_NotEqual(String description) {
        doSetDescription_NotEqual(fRES(description));
    }

    protected void doSetDescription_NotEqual(String description) {
        regDescription(CK_NES, description);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as greaterThan.
     */
    public void setDescription_GreaterThan(String description) {
        regDescription(CK_GT, fRES(description));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as lessThan.
     */
    public void setDescription_LessThan(String description) {
        regDescription(CK_LT, fRES(description));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as greaterEqual.
     */
    public void setDescription_GreaterEqual(String description) {
        regDescription(CK_GE, fRES(description));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as lessEqual.
     */
    public void setDescription_LessEqual(String description) {
        regDescription(CK_LE, fRES(description));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param descriptionList The collection of description as inScope.
     */
    public void setDescription_InScope(Collection<String> descriptionList) {
        doSetDescription_InScope(descriptionList);
    }

    public void doSetDescription_InScope(Collection<String> descriptionList) {
        regINS(CK_INS, cTL(descriptionList), getCValueDescription(), "description");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param descriptionList The collection of description as notInScope.
     */
    public void setDescription_NotInScope(Collection<String> descriptionList) {
        doSetDescription_NotInScope(descriptionList);
    }

    public void doSetDescription_NotInScope(Collection<String> descriptionList) {
        regINS(CK_NINS, cTL(descriptionList), getCValueDescription(), "description");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as prefixSearch.
     */
    public void setDescription_PrefixSearch(String description) {
        setDescription_LikeSearch(description, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDescription_LikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(description), getCValueDescription(), "description", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * description: {NotNull, VARCHAR(1000)}
     * @param description The value of description as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDescription_NotLikeSearch(String description, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(description), getCValueDescription(), "description", likeSearchOption);
    }

    protected void regDescription(ConditionKey k, Object v) { regQ(k, v, getCValueDescription(), "description"); }
    abstract protected ConditionValue getCValueDescription();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as equal.
     */
    public void setSalary_Equal(String salary) {
        doSetSalary_Equal(fRES(salary));
    }

    protected void doSetSalary_Equal(String salary) {
        regSalary(CK_EQ, salary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as notEqual.
     */
    public void setSalary_NotEqual(String salary) {
        doSetSalary_NotEqual(fRES(salary));
    }

    protected void doSetSalary_NotEqual(String salary) {
        regSalary(CK_NES, salary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as greaterThan.
     */
    public void setSalary_GreaterThan(String salary) {
        regSalary(CK_GT, fRES(salary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as lessThan.
     */
    public void setSalary_LessThan(String salary) {
        regSalary(CK_LT, fRES(salary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as greaterEqual.
     */
    public void setSalary_GreaterEqual(String salary) {
        regSalary(CK_GE, fRES(salary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as lessEqual.
     */
    public void setSalary_LessEqual(String salary) {
        regSalary(CK_LE, fRES(salary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salaryList The collection of salary as inScope.
     */
    public void setSalary_InScope(Collection<String> salaryList) {
        doSetSalary_InScope(salaryList);
    }

    public void doSetSalary_InScope(Collection<String> salaryList) {
        regINS(CK_INS, cTL(salaryList), getCValueSalary(), "salary");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salaryList The collection of salary as notInScope.
     */
    public void setSalary_NotInScope(Collection<String> salaryList) {
        doSetSalary_NotInScope(salaryList);
    }

    public void doSetSalary_NotInScope(Collection<String> salaryList) {
        regINS(CK_NINS, cTL(salaryList), getCValueSalary(), "salary");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as prefixSearch.
     */
    public void setSalary_PrefixSearch(String salary) {
        setSalary_LikeSearch(salary, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalary_LikeSearch(String salary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salary), getCValueSalary(), "salary", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * salary: {NotNull, VARCHAR(100)}
     * @param salary The value of salary as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalary_NotLikeSearch(String salary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salary), getCValueSalary(), "salary", likeSearchOption);
    }

    protected void regSalary(ConditionKey k, Object v) { regQ(k, v, getCValueSalary(), "salary"); }
    abstract protected ConditionValue getCValueSalary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as equal.
     */
    public void setWorkSchedule_Equal(String workSchedule) {
        doSetWorkSchedule_Equal(fRES(workSchedule));
    }

    protected void doSetWorkSchedule_Equal(String workSchedule) {
        regWorkSchedule(CK_EQ, workSchedule);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as notEqual.
     */
    public void setWorkSchedule_NotEqual(String workSchedule) {
        doSetWorkSchedule_NotEqual(fRES(workSchedule));
    }

    protected void doSetWorkSchedule_NotEqual(String workSchedule) {
        regWorkSchedule(CK_NES, workSchedule);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as greaterThan.
     */
    public void setWorkSchedule_GreaterThan(String workSchedule) {
        regWorkSchedule(CK_GT, fRES(workSchedule));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as lessThan.
     */
    public void setWorkSchedule_LessThan(String workSchedule) {
        regWorkSchedule(CK_LT, fRES(workSchedule));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as greaterEqual.
     */
    public void setWorkSchedule_GreaterEqual(String workSchedule) {
        regWorkSchedule(CK_GE, fRES(workSchedule));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as lessEqual.
     */
    public void setWorkSchedule_LessEqual(String workSchedule) {
        regWorkSchedule(CK_LE, fRES(workSchedule));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workScheduleList The collection of workSchedule as inScope.
     */
    public void setWorkSchedule_InScope(Collection<String> workScheduleList) {
        doSetWorkSchedule_InScope(workScheduleList);
    }

    public void doSetWorkSchedule_InScope(Collection<String> workScheduleList) {
        regINS(CK_INS, cTL(workScheduleList), getCValueWorkSchedule(), "work_schedule");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workScheduleList The collection of workSchedule as notInScope.
     */
    public void setWorkSchedule_NotInScope(Collection<String> workScheduleList) {
        doSetWorkSchedule_NotInScope(workScheduleList);
    }

    public void doSetWorkSchedule_NotInScope(Collection<String> workScheduleList) {
        regINS(CK_NINS, cTL(workScheduleList), getCValueWorkSchedule(), "work_schedule");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as prefixSearch.
     */
    public void setWorkSchedule_PrefixSearch(String workSchedule) {
        setWorkSchedule_LikeSearch(workSchedule, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkSchedule_LikeSearch(String workSchedule, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workSchedule), getCValueWorkSchedule(), "work_schedule", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     * @param workSchedule The value of workSchedule as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkSchedule_NotLikeSearch(String workSchedule, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workSchedule), getCValueWorkSchedule(), "work_schedule", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     */
    public void setWorkSchedule_IsNull() { regWorkSchedule(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     */
    public void setWorkSchedule_IsNullOrEmpty() { regWorkSchedule(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * work_schedule: {VARCHAR(100)}
     */
    public void setWorkSchedule_IsNotNull() { regWorkSchedule(CK_ISNN, DOBJ); }

    protected void regWorkSchedule(ConditionKey k, Object v) { regQ(k, v, getCValueWorkSchedule(), "work_schedule"); }
    abstract protected ConditionValue getCValueWorkSchedule();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as equal.
     */
    public void setPeriod_Equal(String period) {
        doSetPeriod_Equal(fRES(period));
    }

    protected void doSetPeriod_Equal(String period) {
        regPeriod(CK_EQ, period);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as notEqual.
     */
    public void setPeriod_NotEqual(String period) {
        doSetPeriod_NotEqual(fRES(period));
    }

    protected void doSetPeriod_NotEqual(String period) {
        regPeriod(CK_NES, period);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as greaterThan.
     */
    public void setPeriod_GreaterThan(String period) {
        regPeriod(CK_GT, fRES(period));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as lessThan.
     */
    public void setPeriod_LessThan(String period) {
        regPeriod(CK_LT, fRES(period));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as greaterEqual.
     */
    public void setPeriod_GreaterEqual(String period) {
        regPeriod(CK_GE, fRES(period));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as lessEqual.
     */
    public void setPeriod_LessEqual(String period) {
        regPeriod(CK_LE, fRES(period));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * period: {VARCHAR(100)}
     * @param periodList The collection of period as inScope.
     */
    public void setPeriod_InScope(Collection<String> periodList) {
        doSetPeriod_InScope(periodList);
    }

    public void doSetPeriod_InScope(Collection<String> periodList) {
        regINS(CK_INS, cTL(periodList), getCValuePeriod(), "period");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * period: {VARCHAR(100)}
     * @param periodList The collection of period as notInScope.
     */
    public void setPeriod_NotInScope(Collection<String> periodList) {
        doSetPeriod_NotInScope(periodList);
    }

    public void doSetPeriod_NotInScope(Collection<String> periodList) {
        regINS(CK_NINS, cTL(periodList), getCValuePeriod(), "period");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as prefixSearch.
     */
    public void setPeriod_PrefixSearch(String period) {
        setPeriod_LikeSearch(period, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPeriod_LikeSearch(String period, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(period), getCValuePeriod(), "period", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * period: {VARCHAR(100)}
     * @param period The value of period as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPeriod_NotLikeSearch(String period, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(period), getCValuePeriod(), "period", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     */
    public void setPeriod_IsNull() { regPeriod(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     */
    public void setPeriod_IsNullOrEmpty() { regPeriod(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * period: {VARCHAR(100)}
     */
    public void setPeriod_IsNotNull() { regPeriod(CK_ISNN, DOBJ); }

    protected void regPeriod(ConditionKey k, Object v) { regQ(k, v, getCValuePeriod(), "period"); }
    abstract protected ConditionValue getCValuePeriod();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as equal.
     */
    public void setAddress_Equal(String address) {
        doSetAddress_Equal(fRES(address));
    }

    protected void doSetAddress_Equal(String address) {
        regAddress(CK_EQ, address);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as notEqual.
     */
    public void setAddress_NotEqual(String address) {
        doSetAddress_NotEqual(fRES(address));
    }

    protected void doSetAddress_NotEqual(String address) {
        regAddress(CK_NES, address);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as greaterThan.
     */
    public void setAddress_GreaterThan(String address) {
        regAddress(CK_GT, fRES(address));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as lessThan.
     */
    public void setAddress_LessThan(String address) {
        regAddress(CK_LT, fRES(address));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as greaterEqual.
     */
    public void setAddress_GreaterEqual(String address) {
        regAddress(CK_GE, fRES(address));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as lessEqual.
     */
    public void setAddress_LessEqual(String address) {
        regAddress(CK_LE, fRES(address));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * address: {VARCHAR(100)}
     * @param addressList The collection of address as inScope.
     */
    public void setAddress_InScope(Collection<String> addressList) {
        doSetAddress_InScope(addressList);
    }

    public void doSetAddress_InScope(Collection<String> addressList) {
        regINS(CK_INS, cTL(addressList), getCValueAddress(), "address");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * address: {VARCHAR(100)}
     * @param addressList The collection of address as notInScope.
     */
    public void setAddress_NotInScope(Collection<String> addressList) {
        doSetAddress_NotInScope(addressList);
    }

    public void doSetAddress_NotInScope(Collection<String> addressList) {
        regINS(CK_NINS, cTL(addressList), getCValueAddress(), "address");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as prefixSearch.
     */
    public void setAddress_PrefixSearch(String address) {
        setAddress_LikeSearch(address, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress_LikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address), getCValueAddress(), "address", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * address: {VARCHAR(100)}
     * @param address The value of address as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress_NotLikeSearch(String address, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address), getCValueAddress(), "address", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     */
    public void setAddress_IsNull() { regAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     */
    public void setAddress_IsNullOrEmpty() { regAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * address: {VARCHAR(100)}
     */
    public void setAddress_IsNotNull() { regAddress(CK_ISNN, DOBJ); }

    protected void regAddress(ConditionKey k, Object v) { regQ(k, v, getCValueAddress(), "address"); }
    abstract protected ConditionValue getCValueAddress();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as equal.
     */
    public void setStation_Equal(String station) {
        doSetStation_Equal(fRES(station));
    }

    protected void doSetStation_Equal(String station) {
        regStation(CK_EQ, station);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as notEqual.
     */
    public void setStation_NotEqual(String station) {
        doSetStation_NotEqual(fRES(station));
    }

    protected void doSetStation_NotEqual(String station) {
        regStation(CK_NES, station);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as greaterThan.
     */
    public void setStation_GreaterThan(String station) {
        regStation(CK_GT, fRES(station));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as lessThan.
     */
    public void setStation_LessThan(String station) {
        regStation(CK_LT, fRES(station));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as greaterEqual.
     */
    public void setStation_GreaterEqual(String station) {
        regStation(CK_GE, fRES(station));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as lessEqual.
     */
    public void setStation_LessEqual(String station) {
        regStation(CK_LE, fRES(station));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * station: {VARCHAR(100)}
     * @param stationList The collection of station as inScope.
     */
    public void setStation_InScope(Collection<String> stationList) {
        doSetStation_InScope(stationList);
    }

    public void doSetStation_InScope(Collection<String> stationList) {
        regINS(CK_INS, cTL(stationList), getCValueStation(), "station");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * station: {VARCHAR(100)}
     * @param stationList The collection of station as notInScope.
     */
    public void setStation_NotInScope(Collection<String> stationList) {
        doSetStation_NotInScope(stationList);
    }

    public void doSetStation_NotInScope(Collection<String> stationList) {
        regINS(CK_NINS, cTL(stationList), getCValueStation(), "station");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as prefixSearch.
     */
    public void setStation_PrefixSearch(String station) {
        setStation_LikeSearch(station, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStation_LikeSearch(String station, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(station), getCValueStation(), "station", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * station: {VARCHAR(100)}
     * @param station The value of station as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStation_NotLikeSearch(String station, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(station), getCValueStation(), "station", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     */
    public void setStation_IsNull() { regStation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     */
    public void setStation_IsNullOrEmpty() { regStation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * station: {VARCHAR(100)}
     */
    public void setStation_IsNotNull() { regStation(CK_ISNN, DOBJ); }

    protected void regStation(ConditionKey k, Object v) { regQ(k, v, getCValueStation(), "station"); }
    abstract protected ConditionValue getCValueStation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as equal.
     */
    public void setQualification_Equal(String qualification) {
        doSetQualification_Equal(fRES(qualification));
    }

    protected void doSetQualification_Equal(String qualification) {
        regQualification(CK_EQ, qualification);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as notEqual.
     */
    public void setQualification_NotEqual(String qualification) {
        doSetQualification_NotEqual(fRES(qualification));
    }

    protected void doSetQualification_NotEqual(String qualification) {
        regQualification(CK_NES, qualification);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as greaterThan.
     */
    public void setQualification_GreaterThan(String qualification) {
        regQualification(CK_GT, fRES(qualification));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as lessThan.
     */
    public void setQualification_LessThan(String qualification) {
        regQualification(CK_LT, fRES(qualification));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as greaterEqual.
     */
    public void setQualification_GreaterEqual(String qualification) {
        regQualification(CK_GE, fRES(qualification));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as lessEqual.
     */
    public void setQualification_LessEqual(String qualification) {
        regQualification(CK_LE, fRES(qualification));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualificationList The collection of qualification as inScope.
     */
    public void setQualification_InScope(Collection<String> qualificationList) {
        doSetQualification_InScope(qualificationList);
    }

    public void doSetQualification_InScope(Collection<String> qualificationList) {
        regINS(CK_INS, cTL(qualificationList), getCValueQualification(), "qualification");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualificationList The collection of qualification as notInScope.
     */
    public void setQualification_NotInScope(Collection<String> qualificationList) {
        doSetQualification_NotInScope(qualificationList);
    }

    public void doSetQualification_NotInScope(Collection<String> qualificationList) {
        regINS(CK_NINS, cTL(qualificationList), getCValueQualification(), "qualification");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as prefixSearch.
     */
    public void setQualification_PrefixSearch(String qualification) {
        setQualification_LikeSearch(qualification, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQualification_LikeSearch(String qualification, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qualification), getCValueQualification(), "qualification", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * qualification: {VARCHAR(100)}
     * @param qualification The value of qualification as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQualification_NotLikeSearch(String qualification, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qualification), getCValueQualification(), "qualification", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     */
    public void setQualification_IsNull() { regQualification(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     */
    public void setQualification_IsNullOrEmpty() { regQualification(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * qualification: {VARCHAR(100)}
     */
    public void setQualification_IsNotNull() { regQualification(CK_ISNN, DOBJ); }

    protected void regQualification(ConditionKey k, Object v) { regQ(k, v, getCValueQualification(), "qualification"); }
    abstract protected ConditionValue getCValueQualification();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as equal.
     */
    public void setWelfare_Equal(String welfare) {
        doSetWelfare_Equal(fRES(welfare));
    }

    protected void doSetWelfare_Equal(String welfare) {
        regWelfare(CK_EQ, welfare);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as notEqual.
     */
    public void setWelfare_NotEqual(String welfare) {
        doSetWelfare_NotEqual(fRES(welfare));
    }

    protected void doSetWelfare_NotEqual(String welfare) {
        regWelfare(CK_NES, welfare);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as greaterThan.
     */
    public void setWelfare_GreaterThan(String welfare) {
        regWelfare(CK_GT, fRES(welfare));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as lessThan.
     */
    public void setWelfare_LessThan(String welfare) {
        regWelfare(CK_LT, fRES(welfare));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as greaterEqual.
     */
    public void setWelfare_GreaterEqual(String welfare) {
        regWelfare(CK_GE, fRES(welfare));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as lessEqual.
     */
    public void setWelfare_LessEqual(String welfare) {
        regWelfare(CK_LE, fRES(welfare));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfareList The collection of welfare as inScope.
     */
    public void setWelfare_InScope(Collection<String> welfareList) {
        doSetWelfare_InScope(welfareList);
    }

    public void doSetWelfare_InScope(Collection<String> welfareList) {
        regINS(CK_INS, cTL(welfareList), getCValueWelfare(), "welfare");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfareList The collection of welfare as notInScope.
     */
    public void setWelfare_NotInScope(Collection<String> welfareList) {
        doSetWelfare_NotInScope(welfareList);
    }

    public void doSetWelfare_NotInScope(Collection<String> welfareList) {
        regINS(CK_NINS, cTL(welfareList), getCValueWelfare(), "welfare");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as prefixSearch.
     */
    public void setWelfare_PrefixSearch(String welfare) {
        setWelfare_LikeSearch(welfare, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWelfare_LikeSearch(String welfare, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(welfare), getCValueWelfare(), "welfare", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * welfare: {VARCHAR(100)}
     * @param welfare The value of welfare as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWelfare_NotLikeSearch(String welfare, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(welfare), getCValueWelfare(), "welfare", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     */
    public void setWelfare_IsNull() { regWelfare(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     */
    public void setWelfare_IsNullOrEmpty() { regWelfare(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * welfare: {VARCHAR(100)}
     */
    public void setWelfare_IsNotNull() { regWelfare(CK_ISNN, DOBJ); }

    protected void regWelfare(ConditionKey k, Object v) { regQ(k, v, getCValueWelfare(), "welfare"); }
    abstract protected ConditionValue getCValueWelfare();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as equal.
     */
    public void setOneThing_Equal(String oneThing) {
        doSetOneThing_Equal(fRES(oneThing));
    }

    protected void doSetOneThing_Equal(String oneThing) {
        regOneThing(CK_EQ, oneThing);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as notEqual.
     */
    public void setOneThing_NotEqual(String oneThing) {
        doSetOneThing_NotEqual(fRES(oneThing));
    }

    protected void doSetOneThing_NotEqual(String oneThing) {
        regOneThing(CK_NES, oneThing);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as greaterThan.
     */
    public void setOneThing_GreaterThan(String oneThing) {
        regOneThing(CK_GT, fRES(oneThing));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as lessThan.
     */
    public void setOneThing_LessThan(String oneThing) {
        regOneThing(CK_LT, fRES(oneThing));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as greaterEqual.
     */
    public void setOneThing_GreaterEqual(String oneThing) {
        regOneThing(CK_GE, fRES(oneThing));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as lessEqual.
     */
    public void setOneThing_LessEqual(String oneThing) {
        regOneThing(CK_LE, fRES(oneThing));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThingList The collection of oneThing as inScope.
     */
    public void setOneThing_InScope(Collection<String> oneThingList) {
        doSetOneThing_InScope(oneThingList);
    }

    public void doSetOneThing_InScope(Collection<String> oneThingList) {
        regINS(CK_INS, cTL(oneThingList), getCValueOneThing(), "one_thing");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThingList The collection of oneThing as notInScope.
     */
    public void setOneThing_NotInScope(Collection<String> oneThingList) {
        doSetOneThing_NotInScope(oneThingList);
    }

    public void doSetOneThing_NotInScope(Collection<String> oneThingList) {
        regINS(CK_NINS, cTL(oneThingList), getCValueOneThing(), "one_thing");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as prefixSearch.
     */
    public void setOneThing_PrefixSearch(String oneThing) {
        setOneThing_LikeSearch(oneThing, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOneThing_LikeSearch(String oneThing, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(oneThing), getCValueOneThing(), "one_thing", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * one_thing: {VARCHAR(100)}
     * @param oneThing The value of oneThing as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOneThing_NotLikeSearch(String oneThing, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(oneThing), getCValueOneThing(), "one_thing", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     */
    public void setOneThing_IsNull() { regOneThing(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     */
    public void setOneThing_IsNullOrEmpty() { regOneThing(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * one_thing: {VARCHAR(100)}
     */
    public void setOneThing_IsNotNull() { regOneThing(CK_ISNN, DOBJ); }

    protected void regOneThing(ConditionKey k, Object v) { regQ(k, v, getCValueOneThing(), "one_thing"); }
    abstract protected ConditionValue getCValueOneThing();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favo The value of favo as equal.
     */
    public void setFavo_Equal(Integer favo) {
        doSetFavo_Equal(favo);
    }

    protected void doSetFavo_Equal(Integer favo) {
        regFavo(CK_EQ, favo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favo The value of favo as notEqual.
     */
    public void setFavo_NotEqual(Integer favo) {
        doSetFavo_NotEqual(favo);
    }

    protected void doSetFavo_NotEqual(Integer favo) {
        regFavo(CK_NES, favo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favo The value of favo as greaterThan.
     */
    public void setFavo_GreaterThan(Integer favo) {
        regFavo(CK_GT, favo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favo The value of favo as lessThan.
     */
    public void setFavo_LessThan(Integer favo) {
        regFavo(CK_LT, favo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favo The value of favo as greaterEqual.
     */
    public void setFavo_GreaterEqual(Integer favo) {
        regFavo(CK_GE, favo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favo The value of favo as lessEqual.
     */
    public void setFavo_LessEqual(Integer favo) {
        regFavo(CK_LE, favo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param minNumber The min number of favo. (NullAllowed)
     * @param maxNumber The max number of favo. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFavo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueFavo(), "favo", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favoList The collection of favo as inScope.
     */
    public void setFavo_InScope(Collection<Integer> favoList) {
        doSetFavo_InScope(favoList);
    }

    protected void doSetFavo_InScope(Collection<Integer> favoList) {
        regINS(CK_INS, cTL(favoList), getCValueFavo(), "favo");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     * @param favoList The collection of favo as notInScope.
     */
    public void setFavo_NotInScope(Collection<Integer> favoList) {
        doSetFavo_NotInScope(favoList);
    }

    protected void doSetFavo_NotInScope(Collection<Integer> favoList) {
        regINS(CK_NINS, cTL(favoList), getCValueFavo(), "favo");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     */
    public void setFavo_IsNull() { regFavo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * favo: {INT UNSIGNED(10)}
     */
    public void setFavo_IsNotNull() { regFavo(CK_ISNN, DOBJ); }

    protected void regFavo(ConditionKey k, Object v) { regQ(k, v, getCValueFavo(), "favo"); }
    abstract protected ConditionValue getCValueFavo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * @param registrationDate The value of registrationDate as equal.
     */
    public void setRegistrationDate_Equal(java.sql.Timestamp registrationDate) {
        regRegistrationDate(CK_EQ,  registrationDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * @param registrationDate The value of registrationDate as greaterThan.
     */
    public void setRegistrationDate_GreaterThan(java.sql.Timestamp registrationDate) {
        regRegistrationDate(CK_GT,  registrationDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * @param registrationDate The value of registrationDate as lessThan.
     */
    public void setRegistrationDate_LessThan(java.sql.Timestamp registrationDate) {
        regRegistrationDate(CK_LT,  registrationDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * @param registrationDate The value of registrationDate as greaterEqual.
     */
    public void setRegistrationDate_GreaterEqual(java.sql.Timestamp registrationDate) {
        regRegistrationDate(CK_GE,  registrationDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * @param registrationDate The value of registrationDate as lessEqual.
     */
    public void setRegistrationDate_LessEqual(java.sql.Timestamp registrationDate) {
        regRegistrationDate(CK_LE, registrationDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registrationDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registrationDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegistrationDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueRegistrationDate(), "registration_date", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registrationDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of registrationDate. (NullAllowed)
     */
    public void setRegistrationDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setRegistrationDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     */
    public void setRegistrationDate_IsNull() { regRegistrationDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * registration_date: {DATETIME(19)}
     */
    public void setRegistrationDate_IsNotNull() { regRegistrationDate(CK_ISNN, DOBJ); }

    protected void regRegistrationDate(ConditionKey k, Object v) { regQ(k, v, getCValueRegistrationDate(), "registration_date"); }
    abstract protected ConditionValue getCValueRegistrationDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolOfferCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolOfferCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolOfferCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolOfferCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolOfferCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolOfferCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<SchoolOfferCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<SchoolOfferCB>(new HpSSQSetupper<SchoolOfferCB>() {
            public void setup(String function, SubQuery<SchoolOfferCB> subQuery, HpSSQOption<SchoolOfferCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<SchoolOfferCB> subQuery, String operand, HpSSQOption<SchoolOfferCB> option) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(SchoolOfferCQ subQuery);

    protected SchoolOfferCB xcreateScalarConditionCB() {
        SchoolOfferCB cb = new SchoolOfferCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected SchoolOfferCB xcreateScalarConditionPartitionByCB() {
        SchoolOfferCB cb = new SchoolOfferCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<SchoolOfferCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(SchoolOfferCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SchoolOfferCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<SchoolOfferCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<SchoolOfferCB>(new HpQDRSetupper<SchoolOfferCB>() {
            public void setup(String function, SubQuery<SchoolOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<SchoolOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(SchoolOfferCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(SchoolOfferCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(SchoolOfferCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return SchoolOfferCB.class.getName(); }
    protected String xabCQ() { return SchoolOfferCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
