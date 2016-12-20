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
 * The abstract condition-query of login.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsLoginCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "login";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
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
     * user_id: {PK, NotNull, VARCHAR(12)}
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
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as greaterThan.
     */
    public void setUserId_GreaterThan(String userId) {
        regUserId(CK_GT, fRES(userId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as lessThan.
     */
    public void setUserId_LessThan(String userId) {
        regUserId(CK_LT, fRES(userId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as greaterEqual.
     */
    public void setUserId_GreaterEqual(String userId) {
        regUserId(CK_GE, fRES(userId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as lessEqual.
     */
    public void setUserId_LessEqual(String userId) {
        regUserId(CK_LE, fRES(userId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
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
     * user_id: {PK, NotNull, VARCHAR(12)}
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
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as prefixSearch.
     */
    public void setUserId_PrefixSearch(String userId) {
        setUserId_LikeSearch(userId, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserId_LikeSearch(String userId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userId), getCValueUserId(), "user_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     * @param userId The value of userId as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserId_NotLikeSearch(String userId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userId), getCValueUserId(), "user_id", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select user_id from admin where ...)} <br />
     * admin by your user_id, named 'adminAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsAdminAsOne</span>(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of AdminAsOne for 'exists'. (NotNull)
     */
    public void existsAdminAsOne(SubQuery<AdminCB> subQuery) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_ExistsReferrer_AdminAsOne(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "adminAsOne");
    }
    public abstract String keepUserId_ExistsReferrer_AdminAsOne(AdminCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select user_id from enterprise where ...)} <br />
     * enterprise by your user_id, named 'enterpriseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsEnterpriseList</span>(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseList for 'exists'. (NotNull)
     */
    public void existsEnterpriseList(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_ExistsReferrer_EnterpriseList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "enterpriseList");
    }
    public abstract String keepUserId_ExistsReferrer_EnterpriseList(EnterpriseCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select user_id from school where ...)} <br />
     * school by your user_id, named 'schoolAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSchoolList</span>(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolList for 'exists'. (NotNull)
     */
    public void existsSchoolList(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_ExistsReferrer_SchoolList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "schoolList");
    }
    public abstract String keepUserId_ExistsReferrer_SchoolList(SchoolCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select user_id from student where ...)} <br />
     * student by your user_id, named 'studentAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsStudentList</span>(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StudentList for 'exists'. (NotNull)
     */
    public void existsStudentList(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_ExistsReferrer_StudentList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "studentList");
    }
    public abstract String keepUserId_ExistsReferrer_StudentList(StudentCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select user_id from admin where ...)} <br />
     * admin by your user_id, named 'adminAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsAdminAsOne</span>(new SubQuery&lt;AdminCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UserId_NotExistsReferrer_AdminAsOne for 'not exists'. (NotNull)
     */
    public void notExistsAdminAsOne(SubQuery<AdminCB> subQuery) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotExistsReferrer_AdminAsOne(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "adminAsOne");
    }
    public abstract String keepUserId_NotExistsReferrer_AdminAsOne(AdminCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select user_id from enterprise where ...)} <br />
     * enterprise by your user_id, named 'enterpriseAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsEnterpriseList</span>(new SubQuery&lt;EnterpriseCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UserId_NotExistsReferrer_EnterpriseList for 'not exists'. (NotNull)
     */
    public void notExistsEnterpriseList(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotExistsReferrer_EnterpriseList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "enterpriseList");
    }
    public abstract String keepUserId_NotExistsReferrer_EnterpriseList(EnterpriseCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select user_id from school where ...)} <br />
     * school by your user_id, named 'schoolAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSchoolList</span>(new SubQuery&lt;SchoolCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UserId_NotExistsReferrer_SchoolList for 'not exists'. (NotNull)
     */
    public void notExistsSchoolList(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotExistsReferrer_SchoolList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "schoolList");
    }
    public abstract String keepUserId_NotExistsReferrer_SchoolList(SchoolCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select user_id from student where ...)} <br />
     * student by your user_id, named 'studentAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsStudentList</span>(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of UserId_NotExistsReferrer_StudentList for 'not exists'. (NotNull)
     */
    public void notExistsStudentList(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotExistsReferrer_StudentList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "user_id", "user_id", subQueryPropertyName, "studentList");
    }
    public abstract String keepUserId_NotExistsReferrer_StudentList(StudentCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from admin where ...)} <br />
     * admin by your user_id, named 'adminAsOne'.
     * @param subQuery The sub-query of AdminAsOne for 'in-scope'. (NotNull)
     */
    public void inScopeAdminAsOne(SubQuery<AdminCB> subQuery) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_InScopeRelation_AdminAsOne(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "adminAsOne");
    }
    public abstract String keepUserId_InScopeRelation_AdminAsOne(AdminCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from enterprise where ...)} <br />
     * enterprise by your user_id, named 'enterpriseAsOne'.
     * @param subQuery The sub-query of EnterpriseList for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseList(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_InScopeRelation_EnterpriseList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "enterpriseList");
    }
    public abstract String keepUserId_InScopeRelation_EnterpriseList(EnterpriseCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from school where ...)} <br />
     * school by your user_id, named 'schoolAsOne'.
     * @param subQuery The sub-query of SchoolList for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolList(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_InScopeRelation_SchoolList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "schoolList");
    }
    public abstract String keepUserId_InScopeRelation_SchoolList(SchoolCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select user_id from student where ...)} <br />
     * student by your user_id, named 'studentAsOne'.
     * @param subQuery The sub-query of StudentList for 'in-scope'. (NotNull)
     */
    public void inScopeStudentList(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_InScopeRelation_StudentList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "studentList");
    }
    public abstract String keepUserId_InScopeRelation_StudentList(StudentCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from admin where ...)} <br />
     * admin by your user_id, named 'adminAsOne'.
     * @param subQuery The sub-query of AdminAsOne for 'not in-scope'. (NotNull)
     */
    public void notInScopeAdminAsOne(SubQuery<AdminCB> subQuery) {
        assertObjectNotNull("subQuery<AdminCB>", subQuery);
        AdminCB cb = new AdminCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotInScopeRelation_AdminAsOne(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "adminAsOne");
    }
    public abstract String keepUserId_NotInScopeRelation_AdminAsOne(AdminCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from enterprise where ...)} <br />
     * enterprise by your user_id, named 'enterpriseAsOne'.
     * @param subQuery The sub-query of EnterpriseList for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseList(SubQuery<EnterpriseCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotInScopeRelation_EnterpriseList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "enterpriseList");
    }
    public abstract String keepUserId_NotInScopeRelation_EnterpriseList(EnterpriseCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from school where ...)} <br />
     * school by your user_id, named 'schoolAsOne'.
     * @param subQuery The sub-query of SchoolList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolList(SubQuery<SchoolCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotInScopeRelation_SchoolList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "schoolList");
    }
    public abstract String keepUserId_NotInScopeRelation_SchoolList(SchoolCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select user_id from student where ...)} <br />
     * student by your user_id, named 'studentAsOne'.
     * @param subQuery The sub-query of StudentList for 'not in-scope'. (NotNull)
     */
    public void notInScopeStudentList(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_NotInScopeRelation_StudentList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "user_id", "user_id", subQueryPropertyName, "studentList");
    }
    public abstract String keepUserId_NotInScopeRelation_StudentList(StudentCQ subQuery);

    public void xsderiveEnterpriseList(String function, SubQuery<EnterpriseCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_SpecifyDerivedReferrer_EnterpriseList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "enterpriseList", aliasName, option);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_EnterpriseList(EnterpriseCQ subQuery);

    public void xsderiveSchoolList(String function, SubQuery<SchoolCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_SpecifyDerivedReferrer_SchoolList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "schoolList", aliasName, option);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_SchoolList(SchoolCQ subQuery);

    public void xsderiveStudentList(String function, SubQuery<StudentCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_SpecifyDerivedReferrer_StudentList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "studentList", aliasName, option);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_StudentList(StudentCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from enterprise where ...)} <br />
     * enterprise by your user_id, named 'enterpriseAsOne'.
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
    public HpQDRFunction<EnterpriseCB> derivedEnterpriseList() {
        return xcreateQDRFunctionEnterpriseList();
    }
    protected HpQDRFunction<EnterpriseCB> xcreateQDRFunctionEnterpriseList() {
        return new HpQDRFunction<EnterpriseCB>(new HpQDRSetupper<EnterpriseCB>() {
            public void setup(String function, SubQuery<EnterpriseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveEnterpriseList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveEnterpriseList(String function, SubQuery<EnterpriseCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseCB>", subQuery);
        EnterpriseCB cb = new EnterpriseCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_QueryDerivedReferrer_EnterpriseList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepUserId_QueryDerivedReferrer_EnterpriseListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "enterpriseList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepUserId_QueryDerivedReferrer_EnterpriseList(EnterpriseCQ subQuery);
    public abstract String keepUserId_QueryDerivedReferrer_EnterpriseListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from school where ...)} <br />
     * school by your user_id, named 'schoolAsOne'.
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
    public HpQDRFunction<SchoolCB> derivedSchoolList() {
        return xcreateQDRFunctionSchoolList();
    }
    protected HpQDRFunction<SchoolCB> xcreateQDRFunctionSchoolList() {
        return new HpQDRFunction<SchoolCB>(new HpQDRSetupper<SchoolCB>() {
            public void setup(String function, SubQuery<SchoolCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveSchoolList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveSchoolList(String function, SubQuery<SchoolCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolCB>", subQuery);
        SchoolCB cb = new SchoolCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_QueryDerivedReferrer_SchoolList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepUserId_QueryDerivedReferrer_SchoolListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "schoolList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepUserId_QueryDerivedReferrer_SchoolList(SchoolCQ subQuery);
    public abstract String keepUserId_QueryDerivedReferrer_SchoolListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from student where ...)} <br />
     * student by your user_id, named 'studentAsOne'.
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
    public HpQDRFunction<StudentCB> derivedStudentList() {
        return xcreateQDRFunctionStudentList();
    }
    protected HpQDRFunction<StudentCB> xcreateQDRFunctionStudentList() {
        return new HpQDRFunction<StudentCB>(new HpQDRSetupper<StudentCB>() {
            public void setup(String function, SubQuery<StudentCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveStudentList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveStudentList(String function, SubQuery<StudentCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepUserId_QueryDerivedReferrer_StudentList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepUserId_QueryDerivedReferrer_StudentListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "studentList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepUserId_QueryDerivedReferrer_StudentList(StudentCQ subQuery);
    public abstract String keepUserId_QueryDerivedReferrer_StudentListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * user_id: {PK, NotNull, VARCHAR(12)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey k, Object v) { regQ(k, v, getCValueUserId(), "user_id"); }
    abstract protected ConditionValue getCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as equal.
     */
    public void setUserPass_Equal(String userPass) {
        doSetUserPass_Equal(fRES(userPass));
    }

    protected void doSetUserPass_Equal(String userPass) {
        regUserPass(CK_EQ, userPass);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as notEqual.
     */
    public void setUserPass_NotEqual(String userPass) {
        doSetUserPass_NotEqual(fRES(userPass));
    }

    protected void doSetUserPass_NotEqual(String userPass) {
        regUserPass(CK_NES, userPass);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as greaterThan.
     */
    public void setUserPass_GreaterThan(String userPass) {
        regUserPass(CK_GT, fRES(userPass));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as lessThan.
     */
    public void setUserPass_LessThan(String userPass) {
        regUserPass(CK_LT, fRES(userPass));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as greaterEqual.
     */
    public void setUserPass_GreaterEqual(String userPass) {
        regUserPass(CK_GE, fRES(userPass));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as lessEqual.
     */
    public void setUserPass_LessEqual(String userPass) {
        regUserPass(CK_LE, fRES(userPass));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPassList The collection of userPass as inScope.
     */
    public void setUserPass_InScope(Collection<String> userPassList) {
        doSetUserPass_InScope(userPassList);
    }

    public void doSetUserPass_InScope(Collection<String> userPassList) {
        regINS(CK_INS, cTL(userPassList), getCValueUserPass(), "user_pass");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPassList The collection of userPass as notInScope.
     */
    public void setUserPass_NotInScope(Collection<String> userPassList) {
        doSetUserPass_NotInScope(userPassList);
    }

    public void doSetUserPass_NotInScope(Collection<String> userPassList) {
        regINS(CK_NINS, cTL(userPassList), getCValueUserPass(), "user_pass");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as prefixSearch.
     */
    public void setUserPass_PrefixSearch(String userPass) {
        setUserPass_LikeSearch(userPass, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserPass_LikeSearch(String userPass, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userPass), getCValueUserPass(), "user_pass", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * user_pass: {NotNull, VARCHAR(256)}
     * @param userPass The value of userPass as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserPass_NotLikeSearch(String userPass, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userPass), getCValueUserPass(), "user_pass", likeSearchOption);
    }

    protected void regUserPass(ConditionKey k, Object v) { regQ(k, v, getCValueUserPass(), "user_pass"); }
    abstract protected ConditionValue getCValueUserPass();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param role The value of role as equal.
     */
    public void setRole_Equal(Integer role) {
        doSetRole_Equal(role);
    }

    protected void doSetRole_Equal(Integer role) {
        regRole(CK_EQ, role);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param role The value of role as notEqual.
     */
    public void setRole_NotEqual(Integer role) {
        doSetRole_NotEqual(role);
    }

    protected void doSetRole_NotEqual(Integer role) {
        regRole(CK_NES, role);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param role The value of role as greaterThan.
     */
    public void setRole_GreaterThan(Integer role) {
        regRole(CK_GT, role);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param role The value of role as lessThan.
     */
    public void setRole_LessThan(Integer role) {
        regRole(CK_LT, role);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param role The value of role as greaterEqual.
     */
    public void setRole_GreaterEqual(Integer role) {
        regRole(CK_GE, role);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param role The value of role as lessEqual.
     */
    public void setRole_LessEqual(Integer role) {
        regRole(CK_LE, role);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of role. (NullAllowed)
     * @param maxNumber The max number of role. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRole_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRole(), "role", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param roleList The collection of role as inScope.
     */
    public void setRole_InScope(Collection<Integer> roleList) {
        doSetRole_InScope(roleList);
    }

    protected void doSetRole_InScope(Collection<Integer> roleList) {
        regINS(CK_INS, cTL(roleList), getCValueRole(), "role");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * role: {NotNull, INT UNSIGNED(10)}
     * @param roleList The collection of role as notInScope.
     */
    public void setRole_NotInScope(Collection<Integer> roleList) {
        doSetRole_NotInScope(roleList);
    }

    protected void doSetRole_NotInScope(Collection<Integer> roleList) {
        regINS(CK_NINS, cTL(roleList), getCValueRole(), "role");
    }

    protected void regRole(ConditionKey k, Object v) { regQ(k, v, getCValueRole(), "role"); }
    abstract protected ConditionValue getCValueRole();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;LoginCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LoginCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;LoginCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LoginCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;LoginCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LoginCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;LoginCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LoginCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;LoginCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LoginCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;LoginCB&gt;() {
     *     public void query(LoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<LoginCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<LoginCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<LoginCB>(new HpSSQSetupper<LoginCB>() {
            public void setup(String function, SubQuery<LoginCB> subQuery, HpSSQOption<LoginCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<LoginCB> subQuery, String operand, HpSSQOption<LoginCB> option) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(LoginCQ subQuery);

    protected LoginCB xcreateScalarConditionCB() {
        LoginCB cb = new LoginCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected LoginCB xcreateScalarConditionPartitionByCB() {
        LoginCB cb = new LoginCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<LoginCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = new LoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(LoginCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<LoginCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<LoginCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<LoginCB>(new HpQDRSetupper<LoginCB>() {
            public void setup(String function, SubQuery<LoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<LoginCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = new LoginCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "user_id", "user_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(LoginCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<LoginCB> subQuery) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = new LoginCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(LoginCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<LoginCB> subQuery) {
        assertObjectNotNull("subQuery<LoginCB>", subQuery);
        LoginCB cb = new LoginCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(LoginCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return LoginCB.class.getName(); }
    protected String xabCQ() { return LoginCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
