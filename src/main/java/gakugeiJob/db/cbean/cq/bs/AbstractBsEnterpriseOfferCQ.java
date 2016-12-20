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
 * The abstract condition-query of enterprise_offer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEnterpriseOfferCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEnterpriseOfferCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "enterprise_offer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferId The value of jobOfferId as equal.
     */
    public void setJobOfferId_Equal(Integer jobOfferId) {
        doSetJobOfferId_Equal(jobOfferId);
    }

    protected void doSetJobOfferId_Equal(Integer jobOfferId) {
        regJobOfferId(CK_EQ, jobOfferId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferId The value of jobOfferId as notEqual.
     */
    public void setJobOfferId_NotEqual(Integer jobOfferId) {
        doSetJobOfferId_NotEqual(jobOfferId);
    }

    protected void doSetJobOfferId_NotEqual(Integer jobOfferId) {
        regJobOfferId(CK_NES, jobOfferId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferId The value of jobOfferId as greaterThan.
     */
    public void setJobOfferId_GreaterThan(Integer jobOfferId) {
        regJobOfferId(CK_GT, jobOfferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferId The value of jobOfferId as lessThan.
     */
    public void setJobOfferId_LessThan(Integer jobOfferId) {
        regJobOfferId(CK_LT, jobOfferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferId The value of jobOfferId as greaterEqual.
     */
    public void setJobOfferId_GreaterEqual(Integer jobOfferId) {
        regJobOfferId(CK_GE, jobOfferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferId The value of jobOfferId as lessEqual.
     */
    public void setJobOfferId_LessEqual(Integer jobOfferId) {
        regJobOfferId(CK_LE, jobOfferId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of jobOfferId. (NullAllowed)
     * @param maxNumber The max number of jobOfferId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setJobOfferId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueJobOfferId(), "job_offer_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferIdList The collection of jobOfferId as inScope.
     */
    public void setJobOfferId_InScope(Collection<Integer> jobOfferIdList) {
        doSetJobOfferId_InScope(jobOfferIdList);
    }

    protected void doSetJobOfferId_InScope(Collection<Integer> jobOfferIdList) {
        regINS(CK_INS, cTL(jobOfferIdList), getCValueJobOfferId(), "job_offer_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param jobOfferIdList The collection of jobOfferId as notInScope.
     */
    public void setJobOfferId_NotInScope(Collection<Integer> jobOfferIdList) {
        doSetJobOfferId_NotInScope(jobOfferIdList);
    }

    protected void doSetJobOfferId_NotInScope(Collection<Integer> jobOfferIdList) {
        regINS(CK_NINS, cTL(jobOfferIdList), getCValueJobOfferId(), "job_offer_id");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select job_offer_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsEnterpriseAplicantList</span>(new SubQuery&lt;EnterpriseAplicantCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseAplicantList for 'exists'. (NotNull)
     */
    public void existsEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_ExistsReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepJobOfferId_ExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select job_offer_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsEnterpriseFavoList</span>(new SubQuery&lt;EnterpriseFavoCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseFavoList for 'exists'. (NotNull)
     */
    public void existsEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_ExistsReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepJobOfferId_ExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select job_offer_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsEnterpriseAplicantList</span>(new SubQuery&lt;EnterpriseAplicantCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of JobOfferId_NotExistsReferrer_EnterpriseAplicantList for 'not exists'. (NotNull)
     */
    public void notExistsEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_NotExistsReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepJobOfferId_NotExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select job_offer_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsEnterpriseFavoList</span>(new SubQuery&lt;EnterpriseFavoCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of JobOfferId_NotExistsReferrer_EnterpriseFavoList for 'not exists'. (NotNull)
     */
    public void notExistsEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_NotExistsReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepJobOfferId_NotExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select job_offer_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantAsOne'.
     * @param subQuery The sub-query of EnterpriseAplicantList for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_InScopeRelation_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepJobOfferId_InScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select job_offer_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoAsOne'.
     * @param subQuery The sub-query of EnterpriseFavoList for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_InScopeRelation_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepJobOfferId_InScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select job_offer_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantAsOne'.
     * @param subQuery The sub-query of EnterpriseAplicantList for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_NotInScopeRelation_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepJobOfferId_NotInScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select job_offer_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoAsOne'.
     * @param subQuery The sub-query of EnterpriseFavoList for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_NotInScopeRelation_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepJobOfferId_NotInScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    public void xsderiveEnterpriseAplicantList(String function, SubQuery<EnterpriseAplicantCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseAplicantList", aliasName, option);
    }
    public abstract String keepJobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    public void xsderiveEnterpriseFavoList(String function, SubQuery<EnterpriseFavoCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_SpecifyDerivedReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseFavoList", aliasName, option);
    }
    public abstract String keepJobOfferId_SpecifyDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantAsOne'.
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
    public HpQDRFunction<EnterpriseAplicantCB> derivedEnterpriseAplicantList() {
        return xcreateQDRFunctionEnterpriseAplicantList();
    }
    protected HpQDRFunction<EnterpriseAplicantCB> xcreateQDRFunctionEnterpriseAplicantList() {
        return new HpQDRFunction<EnterpriseAplicantCB>(new HpQDRSetupper<EnterpriseAplicantCB>() {
            public void setup(String function, SubQuery<EnterpriseAplicantCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveEnterpriseAplicantList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveEnterpriseAplicantList(String function, SubQuery<EnterpriseAplicantCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseAplicantList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);
    public abstract String keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from enterprise_favo where ...)} <br />
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoAsOne'.
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
    public HpQDRFunction<EnterpriseFavoCB> derivedEnterpriseFavoList() {
        return xcreateQDRFunctionEnterpriseFavoList();
    }
    protected HpQDRFunction<EnterpriseFavoCB> xcreateQDRFunctionEnterpriseFavoList() {
        return new HpQDRFunction<EnterpriseFavoCB>(new HpQDRSetupper<EnterpriseFavoCB>() {
            public void setup(String function, SubQuery<EnterpriseFavoCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveEnterpriseFavoList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveEnterpriseFavoList(String function, SubQuery<EnterpriseFavoCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseFavoList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);
    public abstract String keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setJobOfferId_IsNull() { regJobOfferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setJobOfferId_IsNotNull() { regJobOfferId(CK_ISNN, DOBJ); }

    protected void regJobOfferId(ConditionKey k, Object v) { regQ(k, v, getCValueJobOfferId(), "job_offer_id"); }
    abstract protected ConditionValue getCValueJobOfferId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseId The value of enterpriseId as equal.
     */
    public void setEnterpriseId_Equal(Integer enterpriseId) {
        doSetEnterpriseId_Equal(enterpriseId);
    }

    protected void doSetEnterpriseId_Equal(Integer enterpriseId) {
        regEnterpriseId(CK_EQ, enterpriseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseId The value of enterpriseId as notEqual.
     */
    public void setEnterpriseId_NotEqual(Integer enterpriseId) {
        doSetEnterpriseId_NotEqual(enterpriseId);
    }

    protected void doSetEnterpriseId_NotEqual(Integer enterpriseId) {
        regEnterpriseId(CK_NES, enterpriseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseId The value of enterpriseId as greaterThan.
     */
    public void setEnterpriseId_GreaterThan(Integer enterpriseId) {
        regEnterpriseId(CK_GT, enterpriseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseId The value of enterpriseId as lessThan.
     */
    public void setEnterpriseId_LessThan(Integer enterpriseId) {
        regEnterpriseId(CK_LT, enterpriseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseId The value of enterpriseId as greaterEqual.
     */
    public void setEnterpriseId_GreaterEqual(Integer enterpriseId) {
        regEnterpriseId(CK_GE, enterpriseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseId The value of enterpriseId as lessEqual.
     */
    public void setEnterpriseId_LessEqual(Integer enterpriseId) {
        regEnterpriseId(CK_LE, enterpriseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param minNumber The min number of enterpriseId. (NullAllowed)
     * @param maxNumber The max number of enterpriseId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEnterpriseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueEnterpriseId(), "enterprise_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseIdList The collection of enterpriseId as inScope.
     */
    public void setEnterpriseId_InScope(Collection<Integer> enterpriseIdList) {
        doSetEnterpriseId_InScope(enterpriseIdList);
    }

    protected void doSetEnterpriseId_InScope(Collection<Integer> enterpriseIdList) {
        regINS(CK_INS, cTL(enterpriseIdList), getCValueEnterpriseId(), "enterprise_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     * @param enterpriseIdList The collection of enterpriseId as notInScope.
     */
    public void setEnterpriseId_NotInScope(Collection<Integer> enterpriseIdList) {
        doSetEnterpriseId_NotInScope(enterpriseIdList);
    }

    protected void doSetEnterpriseId_NotInScope(Collection<Integer> enterpriseIdList) {
        regINS(CK_NINS, cTL(enterpriseIdList), getCValueEnterpriseId(), "enterprise_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select enterprise_id from enterprise where ...)} <br />
     * enterprise by my enterprise_id, named 'enterprise'.
     * @param subQuery The sub-query of Enterprise for 'in-scope'. (NotNull)
     */
    public void inScopeEnterprise(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_InScopeRelation_Enterprise(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterprise");
    }
    public abstract String keepEnterpriseId_InScopeRelation_Enterprise(EnterpriseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select enterprise_id from enterprise where ...)} <br />
     * enterprise by my enterprise_id, named 'enterprise'.
     * @param subQuery The sub-query of Enterprise for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterprise(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_NotInScopeRelation_Enterprise(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterprise");
    }
    public abstract String keepEnterpriseId_NotInScopeRelation_Enterprise(EnterpriseCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     */
    public void setEnterpriseId_IsNull() { regEnterpriseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
     */
    public void setEnterpriseId_IsNotNull() { regEnterpriseId(CK_ISNN, DOBJ); }

    protected void regEnterpriseId(ConditionKey k, Object v) { regQ(k, v, getCValueEnterpriseId(), "enterprise_id"); }
    abstract protected ConditionValue getCValueEnterpriseId();

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
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as equal.
     */
    public void setOfficeName_Equal(String officeName) {
        doSetOfficeName_Equal(fRES(officeName));
    }

    protected void doSetOfficeName_Equal(String officeName) {
        regOfficeName(CK_EQ, officeName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as notEqual.
     */
    public void setOfficeName_NotEqual(String officeName) {
        doSetOfficeName_NotEqual(fRES(officeName));
    }

    protected void doSetOfficeName_NotEqual(String officeName) {
        regOfficeName(CK_NES, officeName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as greaterThan.
     */
    public void setOfficeName_GreaterThan(String officeName) {
        regOfficeName(CK_GT, fRES(officeName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as lessThan.
     */
    public void setOfficeName_LessThan(String officeName) {
        regOfficeName(CK_LT, fRES(officeName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as greaterEqual.
     */
    public void setOfficeName_GreaterEqual(String officeName) {
        regOfficeName(CK_GE, fRES(officeName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as lessEqual.
     */
    public void setOfficeName_LessEqual(String officeName) {
        regOfficeName(CK_LE, fRES(officeName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeNameList The collection of officeName as inScope.
     */
    public void setOfficeName_InScope(Collection<String> officeNameList) {
        doSetOfficeName_InScope(officeNameList);
    }

    public void doSetOfficeName_InScope(Collection<String> officeNameList) {
        regINS(CK_INS, cTL(officeNameList), getCValueOfficeName(), "office_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeNameList The collection of officeName as notInScope.
     */
    public void setOfficeName_NotInScope(Collection<String> officeNameList) {
        doSetOfficeName_NotInScope(officeNameList);
    }

    public void doSetOfficeName_NotInScope(Collection<String> officeNameList) {
        regINS(CK_NINS, cTL(officeNameList), getCValueOfficeName(), "office_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as prefixSearch.
     */
    public void setOfficeName_PrefixSearch(String officeName) {
        setOfficeName_LikeSearch(officeName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOfficeName_LikeSearch(String officeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(officeName), getCValueOfficeName(), "office_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * office_name: {NotNull, VARCHAR(50)}
     * @param officeName The value of officeName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOfficeName_NotLikeSearch(String officeName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(officeName), getCValueOfficeName(), "office_name", likeSearchOption);
    }

    protected void regOfficeName(ConditionKey k, Object v) { regQ(k, v, getCValueOfficeName(), "office_name"); }
    abstract protected ConditionValue getCValueOfficeName();

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
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as equal.
     */
    public void setHoliday_Equal(String holiday) {
        doSetHoliday_Equal(fRES(holiday));
    }

    protected void doSetHoliday_Equal(String holiday) {
        regHoliday(CK_EQ, holiday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as notEqual.
     */
    public void setHoliday_NotEqual(String holiday) {
        doSetHoliday_NotEqual(fRES(holiday));
    }

    protected void doSetHoliday_NotEqual(String holiday) {
        regHoliday(CK_NES, holiday);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as greaterThan.
     */
    public void setHoliday_GreaterThan(String holiday) {
        regHoliday(CK_GT, fRES(holiday));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as lessThan.
     */
    public void setHoliday_LessThan(String holiday) {
        regHoliday(CK_LT, fRES(holiday));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as greaterEqual.
     */
    public void setHoliday_GreaterEqual(String holiday) {
        regHoliday(CK_GE, fRES(holiday));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as lessEqual.
     */
    public void setHoliday_LessEqual(String holiday) {
        regHoliday(CK_LE, fRES(holiday));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holidayList The collection of holiday as inScope.
     */
    public void setHoliday_InScope(Collection<String> holidayList) {
        doSetHoliday_InScope(holidayList);
    }

    public void doSetHoliday_InScope(Collection<String> holidayList) {
        regINS(CK_INS, cTL(holidayList), getCValueHoliday(), "holiday");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holidayList The collection of holiday as notInScope.
     */
    public void setHoliday_NotInScope(Collection<String> holidayList) {
        doSetHoliday_NotInScope(holidayList);
    }

    public void doSetHoliday_NotInScope(Collection<String> holidayList) {
        regINS(CK_NINS, cTL(holidayList), getCValueHoliday(), "holiday");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as prefixSearch.
     */
    public void setHoliday_PrefixSearch(String holiday) {
        setHoliday_LikeSearch(holiday, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHoliday_LikeSearch(String holiday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(holiday), getCValueHoliday(), "holiday", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * holiday: {VARCHAR(100)}
     * @param holiday The value of holiday as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHoliday_NotLikeSearch(String holiday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(holiday), getCValueHoliday(), "holiday", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     */
    public void setHoliday_IsNull() { regHoliday(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     */
    public void setHoliday_IsNullOrEmpty() { regHoliday(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * holiday: {VARCHAR(100)}
     */
    public void setHoliday_IsNotNull() { regHoliday(CK_ISNN, DOBJ); }

    protected void regHoliday(ConditionKey k, Object v) { regQ(k, v, getCValueHoliday(), "holiday"); }
    abstract protected ConditionValue getCValueHoliday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as equal.
     */
    public void setWorkingTime_Equal(String workingTime) {
        doSetWorkingTime_Equal(fRES(workingTime));
    }

    protected void doSetWorkingTime_Equal(String workingTime) {
        regWorkingTime(CK_EQ, workingTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as notEqual.
     */
    public void setWorkingTime_NotEqual(String workingTime) {
        doSetWorkingTime_NotEqual(fRES(workingTime));
    }

    protected void doSetWorkingTime_NotEqual(String workingTime) {
        regWorkingTime(CK_NES, workingTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as greaterThan.
     */
    public void setWorkingTime_GreaterThan(String workingTime) {
        regWorkingTime(CK_GT, fRES(workingTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as lessThan.
     */
    public void setWorkingTime_LessThan(String workingTime) {
        regWorkingTime(CK_LT, fRES(workingTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as greaterEqual.
     */
    public void setWorkingTime_GreaterEqual(String workingTime) {
        regWorkingTime(CK_GE, fRES(workingTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as lessEqual.
     */
    public void setWorkingTime_LessEqual(String workingTime) {
        regWorkingTime(CK_LE, fRES(workingTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTimeList The collection of workingTime as inScope.
     */
    public void setWorkingTime_InScope(Collection<String> workingTimeList) {
        doSetWorkingTime_InScope(workingTimeList);
    }

    public void doSetWorkingTime_InScope(Collection<String> workingTimeList) {
        regINS(CK_INS, cTL(workingTimeList), getCValueWorkingTime(), "working_time");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTimeList The collection of workingTime as notInScope.
     */
    public void setWorkingTime_NotInScope(Collection<String> workingTimeList) {
        doSetWorkingTime_NotInScope(workingTimeList);
    }

    public void doSetWorkingTime_NotInScope(Collection<String> workingTimeList) {
        regINS(CK_NINS, cTL(workingTimeList), getCValueWorkingTime(), "working_time");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as prefixSearch.
     */
    public void setWorkingTime_PrefixSearch(String workingTime) {
        setWorkingTime_LikeSearch(workingTime, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkingTime_LikeSearch(String workingTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workingTime), getCValueWorkingTime(), "working_time", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * working_time: {VARCHAR(100)}
     * @param workingTime The value of workingTime as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkingTime_NotLikeSearch(String workingTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workingTime), getCValueWorkingTime(), "working_time", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     */
    public void setWorkingTime_IsNull() { regWorkingTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     */
    public void setWorkingTime_IsNullOrEmpty() { regWorkingTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * working_time: {VARCHAR(100)}
     */
    public void setWorkingTime_IsNotNull() { regWorkingTime(CK_ISNN, DOBJ); }

    protected void regWorkingTime(ConditionKey k, Object v) { regQ(k, v, getCValueWorkingTime(), "working_time"); }
    abstract protected ConditionValue getCValueWorkingTime();

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseOfferCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseOfferCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseOfferCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseOfferCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseOfferCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseOfferCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<EnterpriseOfferCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<EnterpriseOfferCB>(new HpSSQSetupper<EnterpriseOfferCB>() {
            public void setup(String function, SubQuery<EnterpriseOfferCB> subQuery, HpSSQOption<EnterpriseOfferCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<EnterpriseOfferCB> subQuery, String operand, HpSSQOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(EnterpriseOfferCQ subQuery);

    protected EnterpriseOfferCB xcreateScalarConditionCB() {
        EnterpriseOfferCB cb = new EnterpriseOfferCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected EnterpriseOfferCB xcreateScalarConditionPartitionByCB() {
        EnterpriseOfferCB cb = new EnterpriseOfferCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<EnterpriseOfferCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(EnterpriseOfferCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EnterpriseOfferCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<EnterpriseOfferCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<EnterpriseOfferCB>(new HpQDRSetupper<EnterpriseOfferCB>() {
            public void setup(String function, SubQuery<EnterpriseOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<EnterpriseOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(EnterpriseOfferCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(EnterpriseOfferCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(EnterpriseOfferCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return EnterpriseOfferCB.class.getName(); }
    protected String xabCQ() { return EnterpriseOfferCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
