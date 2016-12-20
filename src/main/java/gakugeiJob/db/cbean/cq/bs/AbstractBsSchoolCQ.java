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
 * The abstract condition-query of school.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSchoolCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSchoolCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "school";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolId The value of schoolId as greaterThan.
     */
    public void setSchoolId_GreaterThan(Integer schoolId) {
        regSchoolId(CK_GT, schoolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolId The value of schoolId as lessThan.
     */
    public void setSchoolId_LessThan(Integer schoolId) {
        regSchoolId(CK_LT, schoolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolId The value of schoolId as greaterEqual.
     */
    public void setSchoolId_GreaterEqual(Integer schoolId) {
        regSchoolId(CK_GE, schoolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolId The value of schoolId as lessEqual.
     */
    public void setSchoolId_LessEqual(Integer schoolId) {
        regSchoolId(CK_LE, schoolId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of schoolId. (NullAllowed)
     * @param maxNumber The max number of schoolId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSchoolId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSchoolId(), "school_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
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
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param schoolIdList The collection of schoolId as notInScope.
     */
    public void setSchoolId_NotInScope(Collection<Integer> schoolIdList) {
        doSetSchoolId_NotInScope(schoolIdList);
    }

    protected void doSetSchoolId_NotInScope(Collection<Integer> schoolIdList) {
        regINS(CK_NINS, cTL(schoolIdList), getCValueSchoolId(), "school_id");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select school_id from school_offer where ...)} <br />
     * school_offer by your school_id, named 'schoolOfferAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSchoolOfferList</span>(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolOfferList for 'exists'. (NotNull)
     */
    public void existsSchoolOfferList(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_ExistsReferrer_SchoolOfferList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "school_id", "school_id", subQueryPropertyName, "schoolOfferList");
    }
    public abstract String keepSchoolId_ExistsReferrer_SchoolOfferList(SchoolOfferCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select school_id from school_offer where ...)} <br />
     * school_offer by your school_id, named 'schoolOfferAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSchoolOfferList</span>(new SubQuery&lt;SchoolOfferCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolId_NotExistsReferrer_SchoolOfferList for 'not exists'. (NotNull)
     */
    public void notExistsSchoolOfferList(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_NotExistsReferrer_SchoolOfferList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "school_id", "school_id", subQueryPropertyName, "schoolOfferList");
    }
    public abstract String keepSchoolId_NotExistsReferrer_SchoolOfferList(SchoolOfferCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select school_id from school_offer where ...)} <br />
     * school_offer by your school_id, named 'schoolOfferAsOne'.
     * @param subQuery The sub-query of SchoolOfferList for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolOfferList(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_InScopeRelation_SchoolOfferList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "school_id", "school_id", subQueryPropertyName, "schoolOfferList");
    }
    public abstract String keepSchoolId_InScopeRelation_SchoolOfferList(SchoolOfferCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select school_id from school_offer where ...)} <br />
     * school_offer by your school_id, named 'schoolOfferAsOne'.
     * @param subQuery The sub-query of SchoolOfferList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolOfferList(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_NotInScopeRelation_SchoolOfferList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "school_id", "school_id", subQueryPropertyName, "schoolOfferList");
    }
    public abstract String keepSchoolId_NotInScopeRelation_SchoolOfferList(SchoolOfferCQ subQuery);

    public void xsderiveSchoolOfferList(String function, SubQuery<SchoolOfferCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_SpecifyDerivedReferrer_SchoolOfferList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "school_id", "school_id", subQueryPropertyName, "schoolOfferList", aliasName, option);
    }
    public abstract String keepSchoolId_SpecifyDerivedReferrer_SchoolOfferList(SchoolOfferCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from school_offer where ...)} <br />
     * school_offer by your school_id, named 'schoolOfferAsOne'.
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
    public HpQDRFunction<SchoolOfferCB> derivedSchoolOfferList() {
        return xcreateQDRFunctionSchoolOfferList();
    }
    protected HpQDRFunction<SchoolOfferCB> xcreateQDRFunctionSchoolOfferList() {
        return new HpQDRFunction<SchoolOfferCB>(new HpQDRSetupper<SchoolOfferCB>() {
            public void setup(String function, SubQuery<SchoolOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveSchoolOfferList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveSchoolOfferList(String function, SubQuery<SchoolOfferCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolId_QueryDerivedReferrer_SchoolOfferList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepSchoolId_QueryDerivedReferrer_SchoolOfferListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "school_id", "school_id", subQueryPropertyName, "schoolOfferList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepSchoolId_QueryDerivedReferrer_SchoolOfferList(SchoolOfferCQ subQuery);
    public abstract String keepSchoolId_QueryDerivedReferrer_SchoolOfferListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setSchoolId_IsNull() { regSchoolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * school_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setSchoolId_IsNotNull() { regSchoolId(CK_ISNN, DOBJ); }

    protected void regSchoolId(ConditionKey k, Object v) { regQ(k, v, getCValueSchoolId(), "school_id"); }
    abstract protected ConditionValue getCValueSchoolId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
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
     * user_id: {IX, VARCHAR(12), FK to login}
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
     * user_id: {IX, VARCHAR(12), FK to login}
     * @param userId The value of userId as greaterThan.
     */
    public void setUserId_GreaterThan(String userId) {
        regUserId(CK_GT, fRES(userId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     * @param userId The value of userId as lessThan.
     */
    public void setUserId_LessThan(String userId) {
        regUserId(CK_LT, fRES(userId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     * @param userId The value of userId as greaterEqual.
     */
    public void setUserId_GreaterEqual(String userId) {
        regUserId(CK_GE, fRES(userId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     * @param userId The value of userId as lessEqual.
     */
    public void setUserId_LessEqual(String userId) {
        regUserId(CK_LE, fRES(userId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
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
     * user_id: {IX, VARCHAR(12), FK to login}
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
     * user_id: {IX, VARCHAR(12), FK to login}
     * @param userId The value of userId as prefixSearch.
     */
    public void setUserId_PrefixSearch(String userId) {
        setUserId_LikeSearch(userId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     * @param userId The value of userId as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserId_LikeSearch(String userId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userId), getCValueUserId(), "user_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     */
    public void setUserId_IsNullOrEmpty() { regUserId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * user_id: {IX, VARCHAR(12), FK to login}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

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
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as equal.
     */
    public void setKinds_Equal(String kinds) {
        doSetKinds_Equal(fRES(kinds));
    }

    protected void doSetKinds_Equal(String kinds) {
        regKinds(CK_EQ, kinds);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as notEqual.
     */
    public void setKinds_NotEqual(String kinds) {
        doSetKinds_NotEqual(fRES(kinds));
    }

    protected void doSetKinds_NotEqual(String kinds) {
        regKinds(CK_NES, kinds);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as greaterThan.
     */
    public void setKinds_GreaterThan(String kinds) {
        regKinds(CK_GT, fRES(kinds));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as lessThan.
     */
    public void setKinds_LessThan(String kinds) {
        regKinds(CK_LT, fRES(kinds));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as greaterEqual.
     */
    public void setKinds_GreaterEqual(String kinds) {
        regKinds(CK_GE, fRES(kinds));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as lessEqual.
     */
    public void setKinds_LessEqual(String kinds) {
        regKinds(CK_LE, fRES(kinds));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kindsList The collection of kinds as inScope.
     */
    public void setKinds_InScope(Collection<String> kindsList) {
        doSetKinds_InScope(kindsList);
    }

    public void doSetKinds_InScope(Collection<String> kindsList) {
        regINS(CK_INS, cTL(kindsList), getCValueKinds(), "kinds");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kindsList The collection of kinds as notInScope.
     */
    public void setKinds_NotInScope(Collection<String> kindsList) {
        doSetKinds_NotInScope(kindsList);
    }

    public void doSetKinds_NotInScope(Collection<String> kindsList) {
        regINS(CK_NINS, cTL(kindsList), getCValueKinds(), "kinds");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as prefixSearch.
     */
    public void setKinds_PrefixSearch(String kinds) {
        setKinds_LikeSearch(kinds, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKinds_LikeSearch(String kinds, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kinds), getCValueKinds(), "kinds", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * kinds: {VARCHAR(20)}
     * @param kinds The value of kinds as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKinds_NotLikeSearch(String kinds, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kinds), getCValueKinds(), "kinds", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     */
    public void setKinds_IsNull() { regKinds(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     */
    public void setKinds_IsNullOrEmpty() { regKinds(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * kinds: {VARCHAR(20)}
     */
    public void setKinds_IsNotNull() { regKinds(CK_ISNN, DOBJ); }

    protected void regKinds(ConditionKey k, Object v) { regQ(k, v, getCValueKinds(), "kinds"); }
    abstract protected ConditionValue getCValueKinds();

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

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(SchoolCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<SchoolCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<SchoolCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<SchoolCB>(new HpSSQSetupper<SchoolCB>() {
            public void setup(String function, SubQuery<SchoolCB> subQuery, HpSSQOption<SchoolCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<SchoolCB> subQuery, String operand, HpSSQOption<SchoolCB> option) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(SchoolCQ subQuery);

    protected SchoolCB xcreateScalarConditionCB() {
        SchoolCB cb = new SchoolCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected SchoolCB xcreateScalarConditionPartitionByCB() {
        SchoolCB cb = new SchoolCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<SchoolCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "school_id", "school_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(SchoolCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<SchoolCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<SchoolCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<SchoolCB>(new HpQDRSetupper<SchoolCB>() {
            public void setup(String function, SubQuery<SchoolCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<SchoolCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "school_id", "school_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(SchoolCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(SchoolCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(SchoolCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return SchoolCB.class.getName(); }
    protected String xabCQ() { return SchoolCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
