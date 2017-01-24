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
 * The abstract condition-query of enterprise.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEnterpriseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEnterpriseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "enterprise";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param enterpriseId The value of enterpriseId as greaterThan.
     */
    public void setEnterpriseId_GreaterThan(Integer enterpriseId) {
        regEnterpriseId(CK_GT, enterpriseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param enterpriseId The value of enterpriseId as lessThan.
     */
    public void setEnterpriseId_LessThan(Integer enterpriseId) {
        regEnterpriseId(CK_LT, enterpriseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param enterpriseId The value of enterpriseId as greaterEqual.
     */
    public void setEnterpriseId_GreaterEqual(Integer enterpriseId) {
        regEnterpriseId(CK_GE, enterpriseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param enterpriseId The value of enterpriseId as lessEqual.
     */
    public void setEnterpriseId_LessEqual(Integer enterpriseId) {
        regEnterpriseId(CK_LE, enterpriseId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of enterpriseId. (NullAllowed)
     * @param maxNumber The max number of enterpriseId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setEnterpriseId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueEnterpriseId(), "enterprise_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param enterpriseIdList The collection of enterpriseId as notInScope.
     */
    public void setEnterpriseId_NotInScope(Collection<Integer> enterpriseIdList) {
        doSetEnterpriseId_NotInScope(enterpriseIdList);
    }

    protected void doSetEnterpriseId_NotInScope(Collection<Integer> enterpriseIdList) {
        regINS(CK_NINS, cTL(enterpriseIdList), getCValueEnterpriseId(), "enterprise_id");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select enterprise_id from enterprise_offer where ...)} <br />
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsEnterpriseOfferList</span>(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseOfferList for 'exists'. (NotNull)
     */
    public void existsEnterpriseOfferList(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_ExistsReferrer_EnterpriseOfferList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterpriseOfferList");
    }
    public abstract String keepEnterpriseId_ExistsReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select enterprise_id from enterprise_offer where ...)} <br />
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsEnterpriseOfferList</span>(new SubQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseId_NotExistsReferrer_EnterpriseOfferList for 'not exists'. (NotNull)
     */
    public void notExistsEnterpriseOfferList(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_NotExistsReferrer_EnterpriseOfferList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterpriseOfferList");
    }
    public abstract String keepEnterpriseId_NotExistsReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select enterprise_id from enterprise_offer where ...)} <br />
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferAsOne'.
     * @param subQuery The sub-query of EnterpriseOfferList for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseOfferList(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_InScopeRelation_EnterpriseOfferList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterpriseOfferList");
    }
    public abstract String keepEnterpriseId_InScopeRelation_EnterpriseOfferList(EnterpriseOfferCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select enterprise_id from enterprise_offer where ...)} <br />
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferAsOne'.
     * @param subQuery The sub-query of EnterpriseOfferList for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseOfferList(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_NotInScopeRelation_EnterpriseOfferList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterpriseOfferList");
    }
    public abstract String keepEnterpriseId_NotInScopeRelation_EnterpriseOfferList(EnterpriseOfferCQ subQuery);

    public void xsderiveEnterpriseOfferList(String function, SubQuery<EnterpriseOfferCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_SpecifyDerivedReferrer_EnterpriseOfferList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterpriseOfferList", aliasName, option);
    }
    public abstract String keepEnterpriseId_SpecifyDerivedReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from enterprise_offer where ...)} <br />
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferAsOne'.
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
    public HpQDRFunction<EnterpriseOfferCB> derivedEnterpriseOfferList() {
        return xcreateQDRFunctionEnterpriseOfferList();
    }
    protected HpQDRFunction<EnterpriseOfferCB> xcreateQDRFunctionEnterpriseOfferList() {
        return new HpQDRFunction<EnterpriseOfferCB>(new HpQDRSetupper<EnterpriseOfferCB>() {
            public void setup(String function, SubQuery<EnterpriseOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveEnterpriseOfferList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveEnterpriseOfferList(String function, SubQuery<EnterpriseOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "enterpriseOfferList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferList(EnterpriseOfferCQ subQuery);
    public abstract String keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setEnterpriseId_IsNull() { regEnterpriseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setEnterpriseId_IsNotNull() { regEnterpriseId(CK_ISNN, DOBJ); }

    protected void regEnterpriseId(ConditionKey k, Object v) { regQ(k, v, getCValueEnterpriseId(), "enterprise_id"); }
    abstract protected ConditionValue getCValueEnterpriseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as equal.
     */
    public void setUserId_Equal(String userId) {
        doSetUserId_Equal(fRES(userId));
    }

    protected void doSetUserId_Equal(String userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as notEqual.
     */
    public void setUserId_NotEqual(String userId) {
        doSetUserId_NotEqual(fRES(userId));
    }

    protected void doSetUserId_NotEqual(String userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as greaterThan.
     */
    public void setUserId_GreaterThan(String userId) {
        regUserId(CK_GT, fRES(userId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as lessThan.
     */
    public void setUserId_LessThan(String userId) {
        regUserId(CK_LT, fRES(userId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as greaterEqual.
     */
    public void setUserId_GreaterEqual(String userId) {
        regUserId(CK_GE, fRES(userId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as lessEqual.
     */
    public void setUserId_LessEqual(String userId) {
        regUserId(CK_LE, fRES(userId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userIdList The collection of userId as inScope.
     */
    public void setUserId_InScope(Collection<String> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    public void doSetUserId_InScope(Collection<String> userIdList) {
        regINS(CK_INS, cTL(userIdList), getCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userIdList The collection of userId as notInScope.
     */
    public void setUserId_NotInScope(Collection<String> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    public void doSetUserId_NotInScope(Collection<String> userIdList) {
        regINS(CK_NINS, cTL(userIdList), getCValueUserId(), "user_id");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as prefixSearch.
     */
    public void setUserId_PrefixSearch(String userId) {
        setUserId_LikeSearch(userId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserId_LikeSearch(String userId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userId), getCValueUserId(), "user_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {IX, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserId_NotLikeSearch(String userId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userId), getCValueUserId(), "user_id", likeSearchOption);
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from login where ...)} <br />
     * login by my user_id, named 'login'.
     * @param subQuery The sub-query of Login for 'in-scope'. (NotNull)
     */
    public void inScopeLogin(SubQuery<LoginCB> subQuery) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = new LoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_InScopeRelation_Login(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "login");
    }
    public abstract String keepUserId_InScopeRelation_Login(LoginCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from login where ...)} <br />
     * login by my user_id, named 'login'.
     * @param subQuery The sub-query of Login for 'not in-scope'. (NotNull)
     */
    public void notInScopeLogin(SubQuery<LoginCB> subQuery) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = new LoginCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotInScopeRelation_Login(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "login");
    }
    public abstract String keepUserId_NotInScopeRelation_Login(LoginCQ subQuery);

    protected void regUserId(ConditionKey k, Object v) { regQ(k, v, getCValueUserId(), "user_id"); }
    abstract protected ConditionValue getCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    public void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), getCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param nameList The collection of name as notInScope.
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    public void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), getCValueName(), "name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        setName_LikeSearch(name, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {NotNull, VARCHAR(50)}
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    protected void regName(ConditionKey k, Object v) { regQ(k, v, getCValueName(), "name"); }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as equal.
     */
    public void setFoundingDate_Equal(String foundingDate) {
        doSetFoundingDate_Equal(fRES(foundingDate));
    }

    protected void doSetFoundingDate_Equal(String foundingDate) {
        regFoundingDate(CK_EQ, foundingDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as notEqual.
     */
    public void setFoundingDate_NotEqual(String foundingDate) {
        doSetFoundingDate_NotEqual(fRES(foundingDate));
    }

    protected void doSetFoundingDate_NotEqual(String foundingDate) {
        regFoundingDate(CK_NES, foundingDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as greaterThan.
     */
    public void setFoundingDate_GreaterThan(String foundingDate) {
        regFoundingDate(CK_GT, fRES(foundingDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as lessThan.
     */
    public void setFoundingDate_LessThan(String foundingDate) {
        regFoundingDate(CK_LT, fRES(foundingDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as greaterEqual.
     */
    public void setFoundingDate_GreaterEqual(String foundingDate) {
        regFoundingDate(CK_GE, fRES(foundingDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as lessEqual.
     */
    public void setFoundingDate_LessEqual(String foundingDate) {
        regFoundingDate(CK_LE, fRES(foundingDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDateList The collection of foundingDate as inScope.
     */
    public void setFoundingDate_InScope(Collection<String> foundingDateList) {
        doSetFoundingDate_InScope(foundingDateList);
    }

    public void doSetFoundingDate_InScope(Collection<String> foundingDateList) {
        regINS(CK_INS, cTL(foundingDateList), getCValueFoundingDate(), "founding_date");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDateList The collection of foundingDate as notInScope.
     */
    public void setFoundingDate_NotInScope(Collection<String> foundingDateList) {
        doSetFoundingDate_NotInScope(foundingDateList);
    }

    public void doSetFoundingDate_NotInScope(Collection<String> foundingDateList) {
        regINS(CK_NINS, cTL(foundingDateList), getCValueFoundingDate(), "founding_date");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as prefixSearch.
     */
    public void setFoundingDate_PrefixSearch(String foundingDate) {
        setFoundingDate_LikeSearch(foundingDate, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFoundingDate_LikeSearch(String foundingDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(foundingDate), getCValueFoundingDate(), "founding_date", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * founding_date: {VARCHAR(20)}
     * @param foundingDate The value of foundingDate as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFoundingDate_NotLikeSearch(String foundingDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(foundingDate), getCValueFoundingDate(), "founding_date", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     */
    public void setFoundingDate_IsNull() { regFoundingDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     */
    public void setFoundingDate_IsNullOrEmpty() { regFoundingDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * founding_date: {VARCHAR(20)}
     */
    public void setFoundingDate_IsNotNull() { regFoundingDate(CK_ISNN, DOBJ); }

    protected void regFoundingDate(ConditionKey k, Object v) { regQ(k, v, getCValueFoundingDate(), "founding_date"); }
    abstract protected ConditionValue getCValueFoundingDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as equal.
     */
    public void setFounderName_Equal(String founderName) {
        doSetFounderName_Equal(fRES(founderName));
    }

    protected void doSetFounderName_Equal(String founderName) {
        regFounderName(CK_EQ, founderName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as notEqual.
     */
    public void setFounderName_NotEqual(String founderName) {
        doSetFounderName_NotEqual(fRES(founderName));
    }

    protected void doSetFounderName_NotEqual(String founderName) {
        regFounderName(CK_NES, founderName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as greaterThan.
     */
    public void setFounderName_GreaterThan(String founderName) {
        regFounderName(CK_GT, fRES(founderName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as lessThan.
     */
    public void setFounderName_LessThan(String founderName) {
        regFounderName(CK_LT, fRES(founderName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as greaterEqual.
     */
    public void setFounderName_GreaterEqual(String founderName) {
        regFounderName(CK_GE, fRES(founderName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as lessEqual.
     */
    public void setFounderName_LessEqual(String founderName) {
        regFounderName(CK_LE, fRES(founderName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderNameList The collection of founderName as inScope.
     */
    public void setFounderName_InScope(Collection<String> founderNameList) {
        doSetFounderName_InScope(founderNameList);
    }

    public void doSetFounderName_InScope(Collection<String> founderNameList) {
        regINS(CK_INS, cTL(founderNameList), getCValueFounderName(), "founder_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderNameList The collection of founderName as notInScope.
     */
    public void setFounderName_NotInScope(Collection<String> founderNameList) {
        doSetFounderName_NotInScope(founderNameList);
    }

    public void doSetFounderName_NotInScope(Collection<String> founderNameList) {
        regINS(CK_NINS, cTL(founderNameList), getCValueFounderName(), "founder_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as prefixSearch.
     */
    public void setFounderName_PrefixSearch(String founderName) {
        setFounderName_LikeSearch(founderName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFounderName_LikeSearch(String founderName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(founderName), getCValueFounderName(), "founder_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * founder_name: {VARCHAR(20)}
     * @param founderName The value of founderName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFounderName_NotLikeSearch(String founderName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(founderName), getCValueFounderName(), "founder_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     */
    public void setFounderName_IsNull() { regFounderName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     */
    public void setFounderName_IsNullOrEmpty() { regFounderName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * founder_name: {VARCHAR(20)}
     */
    public void setFounderName_IsNotNull() { regFounderName(CK_ISNN, DOBJ); }

    protected void regFounderName(ConditionKey k, Object v) { regQ(k, v, getCValueFounderName(), "founder_name"); }
    abstract protected ConditionValue getCValueFounderName();

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
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as equal.
     */
    public void setCapital_Equal(String capital) {
        doSetCapital_Equal(fRES(capital));
    }

    protected void doSetCapital_Equal(String capital) {
        regCapital(CK_EQ, capital);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as notEqual.
     */
    public void setCapital_NotEqual(String capital) {
        doSetCapital_NotEqual(fRES(capital));
    }

    protected void doSetCapital_NotEqual(String capital) {
        regCapital(CK_NES, capital);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as greaterThan.
     */
    public void setCapital_GreaterThan(String capital) {
        regCapital(CK_GT, fRES(capital));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as lessThan.
     */
    public void setCapital_LessThan(String capital) {
        regCapital(CK_LT, fRES(capital));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as greaterEqual.
     */
    public void setCapital_GreaterEqual(String capital) {
        regCapital(CK_GE, fRES(capital));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as lessEqual.
     */
    public void setCapital_LessEqual(String capital) {
        regCapital(CK_LE, fRES(capital));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capitalList The collection of capital as inScope.
     */
    public void setCapital_InScope(Collection<String> capitalList) {
        doSetCapital_InScope(capitalList);
    }

    public void doSetCapital_InScope(Collection<String> capitalList) {
        regINS(CK_INS, cTL(capitalList), getCValueCapital(), "capital");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capitalList The collection of capital as notInScope.
     */
    public void setCapital_NotInScope(Collection<String> capitalList) {
        doSetCapital_NotInScope(capitalList);
    }

    public void doSetCapital_NotInScope(Collection<String> capitalList) {
        regINS(CK_NINS, cTL(capitalList), getCValueCapital(), "capital");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as prefixSearch.
     */
    public void setCapital_PrefixSearch(String capital) {
        setCapital_LikeSearch(capital, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCapital_LikeSearch(String capital, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(capital), getCValueCapital(), "capital", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * capital: {VARCHAR(20)}
     * @param capital The value of capital as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCapital_NotLikeSearch(String capital, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(capital), getCValueCapital(), "capital", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     */
    public void setCapital_IsNull() { regCapital(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     */
    public void setCapital_IsNullOrEmpty() { regCapital(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * capital: {VARCHAR(20)}
     */
    public void setCapital_IsNotNull() { regCapital(CK_ISNN, DOBJ); }

    protected void regCapital(ConditionKey k, Object v) { regQ(k, v, getCValueCapital(), "capital"); }
    abstract protected ConditionValue getCValueCapital();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as equal.
     */
    public void setPresidentName_Equal(String presidentName) {
        doSetPresidentName_Equal(fRES(presidentName));
    }

    protected void doSetPresidentName_Equal(String presidentName) {
        regPresidentName(CK_EQ, presidentName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as notEqual.
     */
    public void setPresidentName_NotEqual(String presidentName) {
        doSetPresidentName_NotEqual(fRES(presidentName));
    }

    protected void doSetPresidentName_NotEqual(String presidentName) {
        regPresidentName(CK_NES, presidentName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as greaterThan.
     */
    public void setPresidentName_GreaterThan(String presidentName) {
        regPresidentName(CK_GT, fRES(presidentName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as lessThan.
     */
    public void setPresidentName_LessThan(String presidentName) {
        regPresidentName(CK_LT, fRES(presidentName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as greaterEqual.
     */
    public void setPresidentName_GreaterEqual(String presidentName) {
        regPresidentName(CK_GE, fRES(presidentName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as lessEqual.
     */
    public void setPresidentName_LessEqual(String presidentName) {
        regPresidentName(CK_LE, fRES(presidentName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentNameList The collection of presidentName as inScope.
     */
    public void setPresidentName_InScope(Collection<String> presidentNameList) {
        doSetPresidentName_InScope(presidentNameList);
    }

    public void doSetPresidentName_InScope(Collection<String> presidentNameList) {
        regINS(CK_INS, cTL(presidentNameList), getCValuePresidentName(), "president_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentNameList The collection of presidentName as notInScope.
     */
    public void setPresidentName_NotInScope(Collection<String> presidentNameList) {
        doSetPresidentName_NotInScope(presidentNameList);
    }

    public void doSetPresidentName_NotInScope(Collection<String> presidentNameList) {
        regINS(CK_NINS, cTL(presidentNameList), getCValuePresidentName(), "president_name");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as prefixSearch.
     */
    public void setPresidentName_PrefixSearch(String presidentName) {
        setPresidentName_LikeSearch(presidentName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPresidentName_LikeSearch(String presidentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(presidentName), getCValuePresidentName(), "president_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * president_name: {VARCHAR(20)}
     * @param presidentName The value of presidentName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPresidentName_NotLikeSearch(String presidentName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(presidentName), getCValuePresidentName(), "president_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     */
    public void setPresidentName_IsNull() { regPresidentName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     */
    public void setPresidentName_IsNullOrEmpty() { regPresidentName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * president_name: {VARCHAR(20)}
     */
    public void setPresidentName_IsNotNull() { regPresidentName(CK_ISNN, DOBJ); }

    protected void regPresidentName(ConditionKey k, Object v) { regQ(k, v, getCValuePresidentName(), "president_name"); }
    abstract protected ConditionValue getCValuePresidentName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as equal.
     */
    public void setNumOfEmployees_Equal(String numOfEmployees) {
        doSetNumOfEmployees_Equal(fRES(numOfEmployees));
    }

    protected void doSetNumOfEmployees_Equal(String numOfEmployees) {
        regNumOfEmployees(CK_EQ, numOfEmployees);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as notEqual.
     */
    public void setNumOfEmployees_NotEqual(String numOfEmployees) {
        doSetNumOfEmployees_NotEqual(fRES(numOfEmployees));
    }

    protected void doSetNumOfEmployees_NotEqual(String numOfEmployees) {
        regNumOfEmployees(CK_NES, numOfEmployees);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as greaterThan.
     */
    public void setNumOfEmployees_GreaterThan(String numOfEmployees) {
        regNumOfEmployees(CK_GT, fRES(numOfEmployees));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as lessThan.
     */
    public void setNumOfEmployees_LessThan(String numOfEmployees) {
        regNumOfEmployees(CK_LT, fRES(numOfEmployees));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as greaterEqual.
     */
    public void setNumOfEmployees_GreaterEqual(String numOfEmployees) {
        regNumOfEmployees(CK_GE, fRES(numOfEmployees));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as lessEqual.
     */
    public void setNumOfEmployees_LessEqual(String numOfEmployees) {
        regNumOfEmployees(CK_LE, fRES(numOfEmployees));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployeesList The collection of numOfEmployees as inScope.
     */
    public void setNumOfEmployees_InScope(Collection<String> numOfEmployeesList) {
        doSetNumOfEmployees_InScope(numOfEmployeesList);
    }

    public void doSetNumOfEmployees_InScope(Collection<String> numOfEmployeesList) {
        regINS(CK_INS, cTL(numOfEmployeesList), getCValueNumOfEmployees(), "num_of_employees");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployeesList The collection of numOfEmployees as notInScope.
     */
    public void setNumOfEmployees_NotInScope(Collection<String> numOfEmployeesList) {
        doSetNumOfEmployees_NotInScope(numOfEmployeesList);
    }

    public void doSetNumOfEmployees_NotInScope(Collection<String> numOfEmployeesList) {
        regINS(CK_NINS, cTL(numOfEmployeesList), getCValueNumOfEmployees(), "num_of_employees");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as prefixSearch.
     */
    public void setNumOfEmployees_PrefixSearch(String numOfEmployees) {
        setNumOfEmployees_LikeSearch(numOfEmployees, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumOfEmployees_LikeSearch(String numOfEmployees, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numOfEmployees), getCValueNumOfEmployees(), "num_of_employees", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     * @param numOfEmployees The value of numOfEmployees as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumOfEmployees_NotLikeSearch(String numOfEmployees, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numOfEmployees), getCValueNumOfEmployees(), "num_of_employees", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     */
    public void setNumOfEmployees_IsNull() { regNumOfEmployees(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     */
    public void setNumOfEmployees_IsNullOrEmpty() { regNumOfEmployees(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * num_of_employees: {VARCHAR(20)}
     */
    public void setNumOfEmployees_IsNotNull() { regNumOfEmployees(CK_ISNN, DOBJ); }

    protected void regNumOfEmployees(ConditionKey k, Object v) { regQ(k, v, getCValueNumOfEmployees(), "num_of_employees"); }
    abstract protected ConditionValue getCValueNumOfEmployees();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as equal.
     */
    public void setBusiness_Equal(String business) {
        doSetBusiness_Equal(fRES(business));
    }

    protected void doSetBusiness_Equal(String business) {
        regBusiness(CK_EQ, business);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as notEqual.
     */
    public void setBusiness_NotEqual(String business) {
        doSetBusiness_NotEqual(fRES(business));
    }

    protected void doSetBusiness_NotEqual(String business) {
        regBusiness(CK_NES, business);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as greaterThan.
     */
    public void setBusiness_GreaterThan(String business) {
        regBusiness(CK_GT, fRES(business));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as lessThan.
     */
    public void setBusiness_LessThan(String business) {
        regBusiness(CK_LT, fRES(business));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as greaterEqual.
     */
    public void setBusiness_GreaterEqual(String business) {
        regBusiness(CK_GE, fRES(business));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as lessEqual.
     */
    public void setBusiness_LessEqual(String business) {
        regBusiness(CK_LE, fRES(business));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * business: {VARCHAR(20)}
     * @param businessList The collection of business as inScope.
     */
    public void setBusiness_InScope(Collection<String> businessList) {
        doSetBusiness_InScope(businessList);
    }

    public void doSetBusiness_InScope(Collection<String> businessList) {
        regINS(CK_INS, cTL(businessList), getCValueBusiness(), "business");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * business: {VARCHAR(20)}
     * @param businessList The collection of business as notInScope.
     */
    public void setBusiness_NotInScope(Collection<String> businessList) {
        doSetBusiness_NotInScope(businessList);
    }

    public void doSetBusiness_NotInScope(Collection<String> businessList) {
        regINS(CK_NINS, cTL(businessList), getCValueBusiness(), "business");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as prefixSearch.
     */
    public void setBusiness_PrefixSearch(String business) {
        setBusiness_LikeSearch(business, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBusiness_LikeSearch(String business, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(business), getCValueBusiness(), "business", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * business: {VARCHAR(20)}
     * @param business The value of business as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBusiness_NotLikeSearch(String business, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(business), getCValueBusiness(), "business", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     */
    public void setBusiness_IsNull() { regBusiness(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     */
    public void setBusiness_IsNullOrEmpty() { regBusiness(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * business: {VARCHAR(20)}
     */
    public void setBusiness_IsNotNull() { regBusiness(CK_ISNN, DOBJ); }

    protected void regBusiness(ConditionKey k, Object v) { regQ(k, v, getCValueBusiness(), "business"); }
    abstract protected ConditionValue getCValueBusiness();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as equal.
     */
    public void setPhoneNumber_Equal(String phoneNumber) {
        doSetPhoneNumber_Equal(fRES(phoneNumber));
    }

    protected void doSetPhoneNumber_Equal(String phoneNumber) {
        regPhoneNumber(CK_EQ, phoneNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as notEqual.
     */
    public void setPhoneNumber_NotEqual(String phoneNumber) {
        doSetPhoneNumber_NotEqual(fRES(phoneNumber));
    }

    protected void doSetPhoneNumber_NotEqual(String phoneNumber) {
        regPhoneNumber(CK_NES, phoneNumber);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as greaterThan.
     */
    public void setPhoneNumber_GreaterThan(String phoneNumber) {
        regPhoneNumber(CK_GT, fRES(phoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as lessThan.
     */
    public void setPhoneNumber_LessThan(String phoneNumber) {
        regPhoneNumber(CK_LT, fRES(phoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as greaterEqual.
     */
    public void setPhoneNumber_GreaterEqual(String phoneNumber) {
        regPhoneNumber(CK_GE, fRES(phoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as lessEqual.
     */
    public void setPhoneNumber_LessEqual(String phoneNumber) {
        regPhoneNumber(CK_LE, fRES(phoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumberList The collection of phoneNumber as inScope.
     */
    public void setPhoneNumber_InScope(Collection<String> phoneNumberList) {
        doSetPhoneNumber_InScope(phoneNumberList);
    }

    public void doSetPhoneNumber_InScope(Collection<String> phoneNumberList) {
        regINS(CK_INS, cTL(phoneNumberList), getCValuePhoneNumber(), "phone_number");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumberList The collection of phoneNumber as notInScope.
     */
    public void setPhoneNumber_NotInScope(Collection<String> phoneNumberList) {
        doSetPhoneNumber_NotInScope(phoneNumberList);
    }

    public void doSetPhoneNumber_NotInScope(Collection<String> phoneNumberList) {
        regINS(CK_NINS, cTL(phoneNumberList), getCValuePhoneNumber(), "phone_number");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as prefixSearch.
     */
    public void setPhoneNumber_PrefixSearch(String phoneNumber) {
        setPhoneNumber_LikeSearch(phoneNumber, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhoneNumber_LikeSearch(String phoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneNumber), getCValuePhoneNumber(), "phone_number", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * phone_number: {NotNull, VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhoneNumber_NotLikeSearch(String phoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneNumber), getCValuePhoneNumber(), "phone_number", likeSearchOption);
    }

    protected void regPhoneNumber(ConditionKey k, Object v) { regQ(k, v, getCValuePhoneNumber(), "phone_number"); }
    abstract protected ConditionValue getCValuePhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as equal.
     */
    public void setUrl_Equal(String url) {
        doSetUrl_Equal(fRES(url));
    }

    protected void doSetUrl_Equal(String url) {
        regUrl(CK_EQ, url);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as notEqual.
     */
    public void setUrl_NotEqual(String url) {
        doSetUrl_NotEqual(fRES(url));
    }

    protected void doSetUrl_NotEqual(String url) {
        regUrl(CK_NES, url);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as greaterThan.
     */
    public void setUrl_GreaterThan(String url) {
        regUrl(CK_GT, fRES(url));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as lessThan.
     */
    public void setUrl_LessThan(String url) {
        regUrl(CK_LT, fRES(url));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as greaterEqual.
     */
    public void setUrl_GreaterEqual(String url) {
        regUrl(CK_GE, fRES(url));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as lessEqual.
     */
    public void setUrl_LessEqual(String url) {
        regUrl(CK_LE, fRES(url));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * url: {VARCHAR(100)}
     * @param urlList The collection of url as inScope.
     */
    public void setUrl_InScope(Collection<String> urlList) {
        doSetUrl_InScope(urlList);
    }

    public void doSetUrl_InScope(Collection<String> urlList) {
        regINS(CK_INS, cTL(urlList), getCValueUrl(), "url");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * url: {VARCHAR(100)}
     * @param urlList The collection of url as notInScope.
     */
    public void setUrl_NotInScope(Collection<String> urlList) {
        doSetUrl_NotInScope(urlList);
    }

    public void doSetUrl_NotInScope(Collection<String> urlList) {
        regINS(CK_NINS, cTL(urlList), getCValueUrl(), "url");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as prefixSearch.
     */
    public void setUrl_PrefixSearch(String url) {
        setUrl_LikeSearch(url, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUrl_LikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(url), getCValueUrl(), "url", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * url: {VARCHAR(100)}
     * @param url The value of url as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUrl_NotLikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(url), getCValueUrl(), "url", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     */
    public void setUrl_IsNull() { regUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     */
    public void setUrl_IsNullOrEmpty() { regUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * url: {VARCHAR(100)}
     */
    public void setUrl_IsNotNull() { regUrl(CK_ISNN, DOBJ); }

    protected void regUrl(ConditionKey k, Object v) { regQ(k, v, getCValueUrl(), "url"); }
    abstract protected ConditionValue getCValueUrl();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as equal.
     */
    public void setMailAddress_Equal(String mailAddress) {
        doSetMailAddress_Equal(fRES(mailAddress));
    }

    protected void doSetMailAddress_Equal(String mailAddress) {
        regMailAddress(CK_EQ, mailAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as notEqual.
     */
    public void setMailAddress_NotEqual(String mailAddress) {
        doSetMailAddress_NotEqual(fRES(mailAddress));
    }

    protected void doSetMailAddress_NotEqual(String mailAddress) {
        regMailAddress(CK_NES, mailAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as greaterThan.
     */
    public void setMailAddress_GreaterThan(String mailAddress) {
        regMailAddress(CK_GT, fRES(mailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as lessThan.
     */
    public void setMailAddress_LessThan(String mailAddress) {
        regMailAddress(CK_LT, fRES(mailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as greaterEqual.
     */
    public void setMailAddress_GreaterEqual(String mailAddress) {
        regMailAddress(CK_GE, fRES(mailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as lessEqual.
     */
    public void setMailAddress_LessEqual(String mailAddress) {
        regMailAddress(CK_LE, fRES(mailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddressList The collection of mailAddress as inScope.
     */
    public void setMailAddress_InScope(Collection<String> mailAddressList) {
        doSetMailAddress_InScope(mailAddressList);
    }

    public void doSetMailAddress_InScope(Collection<String> mailAddressList) {
        regINS(CK_INS, cTL(mailAddressList), getCValueMailAddress(), "mail_address");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddressList The collection of mailAddress as notInScope.
     */
    public void setMailAddress_NotInScope(Collection<String> mailAddressList) {
        doSetMailAddress_NotInScope(mailAddressList);
    }

    public void doSetMailAddress_NotInScope(Collection<String> mailAddressList) {
        regINS(CK_NINS, cTL(mailAddressList), getCValueMailAddress(), "mail_address");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as prefixSearch.
     */
    public void setMailAddress_PrefixSearch(String mailAddress) {
        setMailAddress_LikeSearch(mailAddress, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), getCValueMailAddress(), "mail_address", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_address: {NotNull, VARCHAR(100)}
     * @param mailAddress The value of mailAddress as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), getCValueMailAddress(), "mail_address", likeSearchOption);
    }

    protected void regMailAddress(ConditionKey k, Object v) { regQ(k, v, getCValueMailAddress(), "mail_address"); }
    abstract protected ConditionValue getCValueMailAddress();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<EnterpriseCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<EnterpriseCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<EnterpriseCB>(new HpSSQSetupper<EnterpriseCB>() {
            public void setup(String function, SubQuery<EnterpriseCB> subQuery, HpSSQOption<EnterpriseCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<EnterpriseCB> subQuery, String operand, HpSSQOption<EnterpriseCB> option) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(EnterpriseCQ subQuery);

    protected EnterpriseCB xcreateScalarConditionCB() {
        EnterpriseCB cb = new EnterpriseCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected EnterpriseCB xcreateScalarConditionPartitionByCB() {
        EnterpriseCB cb = new EnterpriseCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<EnterpriseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(EnterpriseCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EnterpriseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<EnterpriseCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<EnterpriseCB>(new HpQDRSetupper<EnterpriseCB>() {
            public void setup(String function, SubQuery<EnterpriseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<EnterpriseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "enterprise_id", "enterprise_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(EnterpriseCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(EnterpriseCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(EnterpriseCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return EnterpriseCB.class.getName(); }
    protected String xabCQ() { return EnterpriseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
