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
 * The abstract condition-query of admin.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsAdminCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsAdminCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "admin";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
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
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
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
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as greaterThan.
     */
    public void setUserId_GreaterThan(String userId) {
        regUserId(CK_GT, fRES(userId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as lessThan.
     */
    public void setUserId_LessThan(String userId) {
        regUserId(CK_LT, fRES(userId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as greaterEqual.
     */
    public void setUserId_GreaterEqual(String userId) {
        regUserId(CK_GE, fRES(userId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as lessEqual.
     */
    public void setUserId_LessEqual(String userId) {
        regUserId(CK_LE, fRES(userId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
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
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
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
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as prefixSearch.
     */
    public void setUserId_PrefixSearch(String userId) {
        setUserId_LikeSearch(userId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     * @param userId The value of userId as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserId_LikeSearch(String userId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userId), getCValueUserId(), "user_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
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
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12), FK to login}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey k, Object v) { regQ(k, v, getCValueUserId(), "user_id"); }
    abstract protected ConditionValue getCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as equal.
     */
    public void setAdminPass1_Equal(String adminPass1) {
        doSetAdminPass1_Equal(fRES(adminPass1));
    }

    protected void doSetAdminPass1_Equal(String adminPass1) {
        regAdminPass1(CK_EQ, adminPass1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as notEqual.
     */
    public void setAdminPass1_NotEqual(String adminPass1) {
        doSetAdminPass1_NotEqual(fRES(adminPass1));
    }

    protected void doSetAdminPass1_NotEqual(String adminPass1) {
        regAdminPass1(CK_NES, adminPass1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as greaterThan.
     */
    public void setAdminPass1_GreaterThan(String adminPass1) {
        regAdminPass1(CK_GT, fRES(adminPass1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as lessThan.
     */
    public void setAdminPass1_LessThan(String adminPass1) {
        regAdminPass1(CK_LT, fRES(adminPass1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as greaterEqual.
     */
    public void setAdminPass1_GreaterEqual(String adminPass1) {
        regAdminPass1(CK_GE, fRES(adminPass1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as lessEqual.
     */
    public void setAdminPass1_LessEqual(String adminPass1) {
        regAdminPass1(CK_LE, fRES(adminPass1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1List The collection of adminPass1 as inScope.
     */
    public void setAdminPass1_InScope(Collection<String> adminPass1List) {
        doSetAdminPass1_InScope(adminPass1List);
    }

    public void doSetAdminPass1_InScope(Collection<String> adminPass1List) {
        regINS(CK_INS, cTL(adminPass1List), getCValueAdminPass1(), "admin_pass1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1List The collection of adminPass1 as notInScope.
     */
    public void setAdminPass1_NotInScope(Collection<String> adminPass1List) {
        doSetAdminPass1_NotInScope(adminPass1List);
    }

    public void doSetAdminPass1_NotInScope(Collection<String> adminPass1List) {
        regINS(CK_NINS, cTL(adminPass1List), getCValueAdminPass1(), "admin_pass1");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as prefixSearch.
     */
    public void setAdminPass1_PrefixSearch(String adminPass1) {
        setAdminPass1_LikeSearch(adminPass1, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdminPass1_LikeSearch(String adminPass1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adminPass1), getCValueAdminPass1(), "admin_pass1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * admin_pass1: {NotNull, VARCHAR(256)}
     * @param adminPass1 The value of adminPass1 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdminPass1_NotLikeSearch(String adminPass1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adminPass1), getCValueAdminPass1(), "admin_pass1", likeSearchOption);
    }

    protected void regAdminPass1(ConditionKey k, Object v) { regQ(k, v, getCValueAdminPass1(), "admin_pass1"); }
    abstract protected ConditionValue getCValueAdminPass1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as equal.
     */
    public void setAdminPass2_Equal(String adminPass2) {
        doSetAdminPass2_Equal(fRES(adminPass2));
    }

    protected void doSetAdminPass2_Equal(String adminPass2) {
        regAdminPass2(CK_EQ, adminPass2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as notEqual.
     */
    public void setAdminPass2_NotEqual(String adminPass2) {
        doSetAdminPass2_NotEqual(fRES(adminPass2));
    }

    protected void doSetAdminPass2_NotEqual(String adminPass2) {
        regAdminPass2(CK_NES, adminPass2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as greaterThan.
     */
    public void setAdminPass2_GreaterThan(String adminPass2) {
        regAdminPass2(CK_GT, fRES(adminPass2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as lessThan.
     */
    public void setAdminPass2_LessThan(String adminPass2) {
        regAdminPass2(CK_LT, fRES(adminPass2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as greaterEqual.
     */
    public void setAdminPass2_GreaterEqual(String adminPass2) {
        regAdminPass2(CK_GE, fRES(adminPass2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as lessEqual.
     */
    public void setAdminPass2_LessEqual(String adminPass2) {
        regAdminPass2(CK_LE, fRES(adminPass2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2List The collection of adminPass2 as inScope.
     */
    public void setAdminPass2_InScope(Collection<String> adminPass2List) {
        doSetAdminPass2_InScope(adminPass2List);
    }

    public void doSetAdminPass2_InScope(Collection<String> adminPass2List) {
        regINS(CK_INS, cTL(adminPass2List), getCValueAdminPass2(), "admin_pass2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2List The collection of adminPass2 as notInScope.
     */
    public void setAdminPass2_NotInScope(Collection<String> adminPass2List) {
        doSetAdminPass2_NotInScope(adminPass2List);
    }

    public void doSetAdminPass2_NotInScope(Collection<String> adminPass2List) {
        regINS(CK_NINS, cTL(adminPass2List), getCValueAdminPass2(), "admin_pass2");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as prefixSearch.
     */
    public void setAdminPass2_PrefixSearch(String adminPass2) {
        setAdminPass2_LikeSearch(adminPass2, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAdminPass2_LikeSearch(String adminPass2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(adminPass2), getCValueAdminPass2(), "admin_pass2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * admin_pass2: {NotNull, VARCHAR(256)}
     * @param adminPass2 The value of adminPass2 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAdminPass2_NotLikeSearch(String adminPass2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(adminPass2), getCValueAdminPass2(), "admin_pass2", likeSearchOption);
    }

    protected void regAdminPass2(ConditionKey k, Object v) { regQ(k, v, getCValueAdminPass2(), "admin_pass2"); }
    abstract protected ConditionValue getCValueAdminPass2();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(AdminCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AdminCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(AdminCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AdminCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(AdminCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AdminCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(AdminCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AdminCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(AdminCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AdminCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(AdminCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<AdminCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<AdminCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<AdminCB>(new HpSSQSetupper<AdminCB>() {
            public void setup(String function, SubQuery<AdminCB> subQuery, HpSSQOption<AdminCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<AdminCB> subQuery, String operand, HpSSQOption<AdminCB> option) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(AdminCQ subQuery);

    protected AdminCB xcreateScalarConditionCB() {
        AdminCB cb = new AdminCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected AdminCB xcreateScalarConditionPartitionByCB() {
        AdminCB cb = new AdminCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<AdminCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(AdminCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<AdminCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<AdminCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<AdminCB>(new HpQDRSetupper<AdminCB>() {
            public void setup(String function, SubQuery<AdminCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<AdminCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(AdminCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<AdminCB> subQuery) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(AdminCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<AdminCB> subQuery) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(AdminCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return AdminCB.class.getName(); }
    protected String xabCQ() { return AdminCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
