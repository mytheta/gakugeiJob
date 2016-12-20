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
 * The abstract condition-query of student.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsStudentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsStudentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "student";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentId The value of studentId as equal.
     */
    public void setStudentId_Equal(Integer studentId) {
        doSetStudentId_Equal(studentId);
    }

    protected void doSetStudentId_Equal(Integer studentId) {
        regStudentId(CK_EQ, studentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentId The value of studentId as notEqual.
     */
    public void setStudentId_NotEqual(Integer studentId) {
        doSetStudentId_NotEqual(studentId);
    }

    protected void doSetStudentId_NotEqual(Integer studentId) {
        regStudentId(CK_NES, studentId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentId The value of studentId as greaterThan.
     */
    public void setStudentId_GreaterThan(Integer studentId) {
        regStudentId(CK_GT, studentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentId The value of studentId as lessThan.
     */
    public void setStudentId_LessThan(Integer studentId) {
        regStudentId(CK_LT, studentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentId The value of studentId as greaterEqual.
     */
    public void setStudentId_GreaterEqual(Integer studentId) {
        regStudentId(CK_GE, studentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentId The value of studentId as lessEqual.
     */
    public void setStudentId_LessEqual(Integer studentId) {
        regStudentId(CK_LE, studentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param minNumber The min number of studentId. (NullAllowed)
     * @param maxNumber The max number of studentId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStudentId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStudentId(), "student_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentIdList The collection of studentId as inScope.
     */
    public void setStudentId_InScope(Collection<Integer> studentIdList) {
        doSetStudentId_InScope(studentIdList);
    }

    protected void doSetStudentId_InScope(Collection<Integer> studentIdList) {
        regINS(CK_INS, cTL(studentIdList), getCValueStudentId(), "student_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @param studentIdList The collection of studentId as notInScope.
     */
    public void setStudentId_NotInScope(Collection<Integer> studentIdList) {
        doSetStudentId_NotInScope(studentIdList);
    }

    protected void doSetStudentId_NotInScope(Collection<Integer> studentIdList) {
        regINS(CK_NINS, cTL(studentIdList), getCValueStudentId(), "student_id");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select student_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsEnterpriseAplicantList</span>(new SubQuery&lt;EnterpriseAplicantCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseAplicantList for 'exists'. (NotNull)
     */
    public void existsEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_ExistsReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepStudentId_ExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select student_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your student_id, named 'enterpriseFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsEnterpriseFavoList</span>(new SubQuery&lt;EnterpriseFavoCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of EnterpriseFavoList for 'exists'. (NotNull)
     */
    public void existsEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_ExistsReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepStudentId_ExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select student_id from school_aplicant where ...)} <br />
     * school_aplicant by your student_id, named 'schoolAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSchoolAplicantList</span>(new SubQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolAplicantList for 'exists'. (NotNull)
     */
    public void existsSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_ExistsReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepStudentId_ExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select student_id from school_favo where ...)} <br />
     * school_favo by your student_id, named 'schoolFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsSchoolFavoList</span>(new SubQuery&lt;SchoolFavoCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of SchoolFavoList for 'exists'. (NotNull)
     */
    public void existsSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_ExistsReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepStudentId_ExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select student_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsEnterpriseAplicantList</span>(new SubQuery&lt;EnterpriseAplicantCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StudentId_NotExistsReferrer_EnterpriseAplicantList for 'not exists'. (NotNull)
     */
    public void notExistsEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotExistsReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepStudentId_NotExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select student_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your student_id, named 'enterpriseFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsEnterpriseFavoList</span>(new SubQuery&lt;EnterpriseFavoCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StudentId_NotExistsReferrer_EnterpriseFavoList for 'not exists'. (NotNull)
     */
    public void notExistsEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotExistsReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepStudentId_NotExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select student_id from school_aplicant where ...)} <br />
     * school_aplicant by your student_id, named 'schoolAplicantAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSchoolAplicantList</span>(new SubQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StudentId_NotExistsReferrer_SchoolAplicantList for 'not exists'. (NotNull)
     */
    public void notExistsSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotExistsReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepStudentId_NotExistsReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select student_id from school_favo where ...)} <br />
     * school_favo by your student_id, named 'schoolFavoAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsSchoolFavoList</span>(new SubQuery&lt;SchoolFavoCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StudentId_NotExistsReferrer_SchoolFavoList for 'not exists'. (NotNull)
     */
    public void notExistsSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotExistsReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepStudentId_NotExistsReferrer_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select student_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantAsOne'.
     * @param subQuery The sub-query of EnterpriseAplicantList for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_InScopeRelation_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepStudentId_InScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select student_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your student_id, named 'enterpriseFavoAsOne'.
     * @param subQuery The sub-query of EnterpriseFavoList for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_InScopeRelation_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepStudentId_InScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select student_id from school_aplicant where ...)} <br />
     * school_aplicant by your student_id, named 'schoolAplicantAsOne'.
     * @param subQuery The sub-query of SchoolAplicantList for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_InScopeRelation_SchoolAplicantList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepStudentId_InScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select student_id from school_favo where ...)} <br />
     * school_favo by your student_id, named 'schoolFavoAsOne'.
     * @param subQuery The sub-query of SchoolFavoList for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_InScopeRelation_SchoolFavoList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepStudentId_InScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select student_id from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantAsOne'.
     * @param subQuery The sub-query of EnterpriseAplicantList for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseAplicantList(SubQuery<EnterpriseAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotInScopeRelation_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseAplicantList");
    }
    public abstract String keepStudentId_NotInScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select student_id from enterprise_favo where ...)} <br />
     * enterprise_favo by your student_id, named 'enterpriseFavoAsOne'.
     * @param subQuery The sub-query of EnterpriseFavoList for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseFavoList(SubQuery<EnterpriseFavoCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotInScopeRelation_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseFavoList");
    }
    public abstract String keepStudentId_NotInScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select student_id from school_aplicant where ...)} <br />
     * school_aplicant by your student_id, named 'schoolAplicantAsOne'.
     * @param subQuery The sub-query of SchoolAplicantList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolAplicantList(SubQuery<SchoolAplicantCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotInScopeRelation_SchoolAplicantList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolAplicantList");
    }
    public abstract String keepStudentId_NotInScopeRelation_SchoolAplicantList(SchoolAplicantCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select student_id from school_favo where ...)} <br />
     * school_favo by your student_id, named 'schoolFavoAsOne'.
     * @param subQuery The sub-query of SchoolFavoList for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolFavoList(SubQuery<SchoolFavoCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotInScopeRelation_SchoolFavoList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolFavoList");
    }
    public abstract String keepStudentId_NotInScopeRelation_SchoolFavoList(SchoolFavoCQ subQuery);

    public void xsderiveEnterpriseAplicantList(String function, SubQuery<EnterpriseAplicantCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseAplicantCB>", subQuery);
        EnterpriseAplicantCB cb = new EnterpriseAplicantCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_SpecifyDerivedReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseAplicantList", aliasName, option);
    }
    public abstract String keepStudentId_SpecifyDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);

    public void xsderiveEnterpriseFavoList(String function, SubQuery<EnterpriseFavoCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<EnterpriseFavoCB>", subQuery);
        EnterpriseFavoCB cb = new EnterpriseFavoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_SpecifyDerivedReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseFavoList", aliasName, option);
    }
    public abstract String keepStudentId_SpecifyDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);

    public void xsderiveSchoolAplicantList(String function, SubQuery<SchoolAplicantCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolAplicantCB>", subQuery);
        SchoolAplicantCB cb = new SchoolAplicantCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_SpecifyDerivedReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolAplicantList", aliasName, option);
    }
    public abstract String keepStudentId_SpecifyDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);

    public void xsderiveSchoolFavoList(String function, SubQuery<SchoolFavoCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<SchoolFavoCB>", subQuery);
        SchoolFavoCB cb = new SchoolFavoCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_SpecifyDerivedReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolFavoList", aliasName, option);
    }
    public abstract String keepStudentId_SpecifyDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from enterprise_aplicant where ...)} <br />
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantAsOne'.
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
        String subQueryPropertyName = keepStudentId_QueryDerivedReferrer_EnterpriseAplicantList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepStudentId_QueryDerivedReferrer_EnterpriseAplicantListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseAplicantList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepStudentId_QueryDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ subQuery);
    public abstract String keepStudentId_QueryDerivedReferrer_EnterpriseAplicantListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from enterprise_favo where ...)} <br />
     * enterprise_favo by your student_id, named 'enterpriseFavoAsOne'.
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
        String subQueryPropertyName = keepStudentId_QueryDerivedReferrer_EnterpriseFavoList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepStudentId_QueryDerivedReferrer_EnterpriseFavoListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "enterpriseFavoList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepStudentId_QueryDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ subQuery);
    public abstract String keepStudentId_QueryDerivedReferrer_EnterpriseFavoListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from school_aplicant where ...)} <br />
     * school_aplicant by your student_id, named 'schoolAplicantAsOne'.
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
        String subQueryPropertyName = keepStudentId_QueryDerivedReferrer_SchoolAplicantList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepStudentId_QueryDerivedReferrer_SchoolAplicantListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolAplicantList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepStudentId_QueryDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ subQuery);
    public abstract String keepStudentId_QueryDerivedReferrer_SchoolAplicantListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from school_favo where ...)} <br />
     * school_favo by your student_id, named 'schoolFavoAsOne'.
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
        String subQueryPropertyName = keepStudentId_QueryDerivedReferrer_SchoolFavoList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepStudentId_QueryDerivedReferrer_SchoolFavoListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "schoolFavoList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepStudentId_QueryDerivedReferrer_SchoolFavoList(SchoolFavoCQ subQuery);
    public abstract String keepStudentId_QueryDerivedReferrer_SchoolFavoListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setStudentId_IsNull() { regStudentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * student_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     */
    public void setStudentId_IsNotNull() { regStudentId(CK_ISNN, DOBJ); }

    protected void regStudentId(ConditionKey k, Object v) { regQ(k, v, getCValueStudentId(), "student_id"); }
    abstract protected ConditionValue getCValueStudentId();

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
     * name: {VARCHAR(10)}
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
     * name: {VARCHAR(10)}
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
     * name: {VARCHAR(10)}
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(10)}
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(10)}
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * name: {VARCHAR(10)}
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(10)}
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
     * name: {VARCHAR(10)}
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
     * name: {VARCHAR(10)}
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        setName_LikeSearch(name, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(10)}
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * name: {VARCHAR(10)}
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * name: {VARCHAR(10)}
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * name: {VARCHAR(10)}
     */
    public void setName_IsNullOrEmpty() { regName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * name: {VARCHAR(10)}
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey k, Object v) { regQ(k, v, getCValueName(), "name"); }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * @param birthday The value of birthday as equal.
     */
    public void setBirthday_Equal(java.sql.Timestamp birthday) {
        regBirthday(CK_EQ,  birthday);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * @param birthday The value of birthday as greaterThan.
     */
    public void setBirthday_GreaterThan(java.sql.Timestamp birthday) {
        regBirthday(CK_GT,  birthday);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * @param birthday The value of birthday as lessThan.
     */
    public void setBirthday_LessThan(java.sql.Timestamp birthday) {
        regBirthday(CK_LT,  birthday);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * @param birthday The value of birthday as greaterEqual.
     */
    public void setBirthday_GreaterEqual(java.sql.Timestamp birthday) {
        regBirthday(CK_GE,  birthday);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * @param birthday The value of birthday as lessEqual.
     */
    public void setBirthday_LessEqual(java.sql.Timestamp birthday) {
        regBirthday(CK_LE, birthday);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of birthday. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBirthday_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueBirthday(), "birthday", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of birthday. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of birthday. (NullAllowed)
     */
    public void setBirthday_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setBirthday_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     */
    public void setBirthday_IsNull() { regBirthday(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * birthday: {DATETIME(19)}
     */
    public void setBirthday_IsNotNull() { regBirthday(CK_ISNN, DOBJ); }

    protected void regBirthday(ConditionKey k, Object v) { regQ(k, v, getCValueBirthday(), "birthday"); }
    abstract protected ConditionValue getCValueBirthday();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param sex The value of sex as equal.
     */
    public void setSex_Equal(Integer sex) {
        doSetSex_Equal(sex);
    }

    protected void doSetSex_Equal(Integer sex) {
        regSex(CK_EQ, sex);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param sex The value of sex as notEqual.
     */
    public void setSex_NotEqual(Integer sex) {
        doSetSex_NotEqual(sex);
    }

    protected void doSetSex_NotEqual(Integer sex) {
        regSex(CK_NES, sex);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param sex The value of sex as greaterThan.
     */
    public void setSex_GreaterThan(Integer sex) {
        regSex(CK_GT, sex);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param sex The value of sex as lessThan.
     */
    public void setSex_LessThan(Integer sex) {
        regSex(CK_LT, sex);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param sex The value of sex as greaterEqual.
     */
    public void setSex_GreaterEqual(Integer sex) {
        regSex(CK_GE, sex);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param sex The value of sex as lessEqual.
     */
    public void setSex_LessEqual(Integer sex) {
        regSex(CK_LE, sex);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     * @param minNumber The min number of sex. (NullAllowed)
     * @param maxNumber The max number of sex. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSex_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSex(), "sex", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * sex: {INT(10)}
     * @param sexList The collection of sex as inScope.
     */
    public void setSex_InScope(Collection<Integer> sexList) {
        doSetSex_InScope(sexList);
    }

    protected void doSetSex_InScope(Collection<Integer> sexList) {
        regINS(CK_INS, cTL(sexList), getCValueSex(), "sex");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * sex: {INT(10)}
     * @param sexList The collection of sex as notInScope.
     */
    public void setSex_NotInScope(Collection<Integer> sexList) {
        doSetSex_NotInScope(sexList);
    }

    protected void doSetSex_NotInScope(Collection<Integer> sexList) {
        regINS(CK_NINS, cTL(sexList), getCValueSex(), "sex");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     */
    public void setSex_IsNull() { regSex(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * sex: {INT(10)}
     */
    public void setSex_IsNotNull() { regSex(CK_ISNN, DOBJ); }

    protected void regSex(ConditionKey k, Object v) { regQ(k, v, getCValueSex(), "sex"); }
    abstract protected ConditionValue getCValueSex();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
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
     * phone_number: {VARCHAR(12)}
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
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as greaterThan.
     */
    public void setPhoneNumber_GreaterThan(String phoneNumber) {
        regPhoneNumber(CK_GT, fRES(phoneNumber));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as lessThan.
     */
    public void setPhoneNumber_LessThan(String phoneNumber) {
        regPhoneNumber(CK_LT, fRES(phoneNumber));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as greaterEqual.
     */
    public void setPhoneNumber_GreaterEqual(String phoneNumber) {
        regPhoneNumber(CK_GE, fRES(phoneNumber));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as lessEqual.
     */
    public void setPhoneNumber_LessEqual(String phoneNumber) {
        regPhoneNumber(CK_LE, fRES(phoneNumber));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * phone_number: {VARCHAR(12)}
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
     * phone_number: {VARCHAR(12)}
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
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as prefixSearch.
     */
    public void setPhoneNumber_PrefixSearch(String phoneNumber) {
        setPhoneNumber_LikeSearch(phoneNumber, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhoneNumber_LikeSearch(String phoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phoneNumber), getCValuePhoneNumber(), "phone_number", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * phone_number: {VARCHAR(12)}
     * @param phoneNumber The value of phoneNumber as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhoneNumber_NotLikeSearch(String phoneNumber, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phoneNumber), getCValuePhoneNumber(), "phone_number", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
     */
    public void setPhoneNumber_IsNull() { regPhoneNumber(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
     */
    public void setPhoneNumber_IsNullOrEmpty() { regPhoneNumber(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * phone_number: {VARCHAR(12)}
     */
    public void setPhoneNumber_IsNotNull() { regPhoneNumber(CK_ISNN, DOBJ); }

    protected void regPhoneNumber(ConditionKey k, Object v) { regQ(k, v, getCValuePhoneNumber(), "phone_number"); }
    abstract protected ConditionValue getCValuePhoneNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
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
     * mail_address: {VARCHAR(50)}
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
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as greaterThan.
     */
    public void setMailAddress_GreaterThan(String mailAddress) {
        regMailAddress(CK_GT, fRES(mailAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as lessThan.
     */
    public void setMailAddress_LessThan(String mailAddress) {
        regMailAddress(CK_LT, fRES(mailAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as greaterEqual.
     */
    public void setMailAddress_GreaterEqual(String mailAddress) {
        regMailAddress(CK_GE, fRES(mailAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as lessEqual.
     */
    public void setMailAddress_LessEqual(String mailAddress) {
        regMailAddress(CK_LE, fRES(mailAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * mail_address: {VARCHAR(50)}
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
     * mail_address: {VARCHAR(50)}
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
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as prefixSearch.
     */
    public void setMailAddress_PrefixSearch(String mailAddress) {
        setMailAddress_LikeSearch(mailAddress, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMailAddress_LikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mailAddress), getCValueMailAddress(), "mail_address", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * mail_address: {VARCHAR(50)}
     * @param mailAddress The value of mailAddress as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMailAddress_NotLikeSearch(String mailAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mailAddress), getCValueMailAddress(), "mail_address", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
     */
    public void setMailAddress_IsNull() { regMailAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
     */
    public void setMailAddress_IsNullOrEmpty() { regMailAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * mail_address: {VARCHAR(50)}
     */
    public void setMailAddress_IsNotNull() { regMailAddress(CK_ISNN, DOBJ); }

    protected void regMailAddress(ConditionKey k, Object v) { regQ(k, v, getCValueMailAddress(), "mail_address"); }
    abstract protected ConditionValue getCValueMailAddress();

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

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<StudentCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<StudentCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<StudentCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<StudentCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<StudentCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;StudentCB&gt;() {
     *     public void query(StudentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<StudentCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<StudentCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<StudentCB>(new HpSSQSetupper<StudentCB>() {
            public void setup(String function, SubQuery<StudentCB> subQuery, HpSSQOption<StudentCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<StudentCB> subQuery, String operand, HpSSQOption<StudentCB> option) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(StudentCQ subQuery);

    protected StudentCB xcreateScalarConditionCB() {
        StudentCB cb = new StudentCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected StudentCB xcreateScalarConditionPartitionByCB() {
        StudentCB cb = new StudentCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<StudentCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(StudentCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<StudentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<StudentCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<StudentCB>(new HpQDRSetupper<StudentCB>() {
            public void setup(String function, SubQuery<StudentCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<StudentCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "student_id", "student_id", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(StudentCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(StudentCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(StudentCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return StudentCB.class.getName(); }
    protected String xabCQ() { return StudentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
