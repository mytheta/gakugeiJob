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
 * The abstract condition-query of enterprise_aplicant.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEnterpriseAplicantCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEnterpriseAplicantCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "enterprise_aplicant";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
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
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
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
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @param jobOfferId The value of jobOfferId as greaterThan.
     */
    public void setJobOfferId_GreaterThan(Integer jobOfferId) {
        regJobOfferId(CK_GT, jobOfferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @param jobOfferId The value of jobOfferId as lessThan.
     */
    public void setJobOfferId_LessThan(Integer jobOfferId) {
        regJobOfferId(CK_LT, jobOfferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @param jobOfferId The value of jobOfferId as greaterEqual.
     */
    public void setJobOfferId_GreaterEqual(Integer jobOfferId) {
        regJobOfferId(CK_GE, jobOfferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @param jobOfferId The value of jobOfferId as lessEqual.
     */
    public void setJobOfferId_LessEqual(Integer jobOfferId) {
        regJobOfferId(CK_LE, jobOfferId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @param minNumber The min number of jobOfferId. (NullAllowed)
     * @param maxNumber The max number of jobOfferId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setJobOfferId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueJobOfferId(), "job_offer_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
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
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     * @param jobOfferIdList The collection of jobOfferId as notInScope.
     */
    public void setJobOfferId_NotInScope(Collection<Integer> jobOfferIdList) {
        doSetJobOfferId_NotInScope(jobOfferIdList);
    }

    protected void doSetJobOfferId_NotInScope(Collection<Integer> jobOfferIdList) {
        regINS(CK_NINS, cTL(jobOfferIdList), getCValueJobOfferId(), "job_offer_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select job_offer_id from enterprise_offer where ...)} <br />
     * enterprise_offer by my job_offer_id, named 'enterpriseOffer'.
     * @param subQuery The sub-query of EnterpriseOffer for 'in-scope'. (NotNull)
     */
    public void inScopeEnterpriseOffer(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_InScopeRelation_EnterpriseOffer(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseOffer");
    }
    public abstract String keepJobOfferId_InScopeRelation_EnterpriseOffer(EnterpriseOfferCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select job_offer_id from enterprise_offer where ...)} <br />
     * enterprise_offer by my job_offer_id, named 'enterpriseOffer'.
     * @param subQuery The sub-query of EnterpriseOffer for 'not in-scope'. (NotNull)
     */
    public void notInScopeEnterpriseOffer(SubQuery<EnterpriseOfferCB> subQuery) {
        assertObjectNotNull("subQuery<EnterpriseOfferCB>", subQuery);
        EnterpriseOfferCB cb = new EnterpriseOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepJobOfferId_NotInScopeRelation_EnterpriseOffer(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "job_offer_id", "job_offer_id", subQueryPropertyName, "enterpriseOffer");
    }
    public abstract String keepJobOfferId_NotInScopeRelation_EnterpriseOffer(EnterpriseOfferCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     */
    public void setJobOfferId_IsNull() { regJobOfferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer}
     */
    public void setJobOfferId_IsNotNull() { regJobOfferId(CK_ISNN, DOBJ); }

    protected void regJobOfferId(ConditionKey k, Object v) { regQ(k, v, getCValueJobOfferId(), "job_offer_id"); }
    abstract protected ConditionValue getCValueJobOfferId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
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
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
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
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @param studentId The value of studentId as greaterThan.
     */
    public void setStudentId_GreaterThan(Integer studentId) {
        regStudentId(CK_GT, studentId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @param studentId The value of studentId as lessThan.
     */
    public void setStudentId_LessThan(Integer studentId) {
        regStudentId(CK_LT, studentId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @param studentId The value of studentId as greaterEqual.
     */
    public void setStudentId_GreaterEqual(Integer studentId) {
        regStudentId(CK_GE, studentId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @param studentId The value of studentId as lessEqual.
     */
    public void setStudentId_LessEqual(Integer studentId) {
        regStudentId(CK_LE, studentId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @param minNumber The min number of studentId. (NullAllowed)
     * @param maxNumber The max number of studentId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStudentId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStudentId(), "student_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
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
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     * @param studentIdList The collection of studentId as notInScope.
     */
    public void setStudentId_NotInScope(Collection<Integer> studentIdList) {
        doSetStudentId_NotInScope(studentIdList);
    }

    protected void doSetStudentId_NotInScope(Collection<Integer> studentIdList) {
        regINS(CK_NINS, cTL(studentIdList), getCValueStudentId(), "student_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select student_id from student where ...)} <br />
     * student by my student_id, named 'student'.
     * @param subQuery The sub-query of Student for 'in-scope'. (NotNull)
     */
    public void inScopeStudent(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_InScopeRelation_Student(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "student");
    }
    public abstract String keepStudentId_InScopeRelation_Student(StudentCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select student_id from student where ...)} <br />
     * student by my student_id, named 'student'.
     * @param subQuery The sub-query of Student for 'not in-scope'. (NotNull)
     */
    public void notInScopeStudent(SubQuery<StudentCB> subQuery) {
        assertObjectNotNull("subQuery<StudentCB>", subQuery);
        StudentCB cb = new StudentCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStudentId_NotInScopeRelation_Student(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "student_id", "student_id", subQueryPropertyName, "student");
    }
    public abstract String keepStudentId_NotInScopeRelation_Student(StudentCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     */
    public void setStudentId_IsNull() { regStudentId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
     */
    public void setStudentId_IsNotNull() { regStudentId(CK_ISNN, DOBJ); }

    protected void regStudentId(ConditionKey k, Object v) { regQ(k, v, getCValueStudentId(), "student_id"); }
    abstract protected ConditionValue getCValueStudentId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as equal.
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as notEqual.
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as greaterThan.
     */
    public void setTitle_GreaterThan(String title) {
        regTitle(CK_GT, fRES(title));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as lessThan.
     */
    public void setTitle_LessThan(String title) {
        regTitle(CK_LT, fRES(title));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as greaterEqual.
     */
    public void setTitle_GreaterEqual(String title) {
        regTitle(CK_GE, fRES(title));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as lessEqual.
     */
    public void setTitle_LessEqual(String title) {
        regTitle(CK_LE, fRES(title));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * title: {VARCHAR(100)}
     * @param titleList The collection of title as inScope.
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    public void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), getCValueTitle(), "title");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * title: {VARCHAR(100)}
     * @param titleList The collection of title as notInScope.
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    public void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), getCValueTitle(), "title");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as prefixSearch.
     */
    public void setTitle_PrefixSearch(String title) {
        setTitle_LikeSearch(title, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), getCValueTitle(), "title", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * title: {VARCHAR(100)}
     * @param title The value of title as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), getCValueTitle(), "title", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     */
    public void setTitle_IsNull() { regTitle(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     */
    public void setTitle_IsNullOrEmpty() { regTitle(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * title: {VARCHAR(100)}
     */
    public void setTitle_IsNotNull() { regTitle(CK_ISNN, DOBJ); }

    protected void regTitle(ConditionKey k, Object v) { regQ(k, v, getCValueTitle(), "title"); }
    abstract protected ConditionValue getCValueTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as equal.
     */
    public void setContent_Equal(String content) {
        doSetContent_Equal(fRES(content));
    }

    protected void doSetContent_Equal(String content) {
        regContent(CK_EQ, content);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as notEqual.
     */
    public void setContent_NotEqual(String content) {
        doSetContent_NotEqual(fRES(content));
    }

    protected void doSetContent_NotEqual(String content) {
        regContent(CK_NES, content);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as greaterThan.
     */
    public void setContent_GreaterThan(String content) {
        regContent(CK_GT, fRES(content));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as lessThan.
     */
    public void setContent_LessThan(String content) {
        regContent(CK_LT, fRES(content));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as greaterEqual.
     */
    public void setContent_GreaterEqual(String content) {
        regContent(CK_GE, fRES(content));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as lessEqual.
     */
    public void setContent_LessEqual(String content) {
        regContent(CK_LE, fRES(content));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * content: {VARCHAR(400)}
     * @param contentList The collection of content as inScope.
     */
    public void setContent_InScope(Collection<String> contentList) {
        doSetContent_InScope(contentList);
    }

    public void doSetContent_InScope(Collection<String> contentList) {
        regINS(CK_INS, cTL(contentList), getCValueContent(), "content");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * content: {VARCHAR(400)}
     * @param contentList The collection of content as notInScope.
     */
    public void setContent_NotInScope(Collection<String> contentList) {
        doSetContent_NotInScope(contentList);
    }

    public void doSetContent_NotInScope(Collection<String> contentList) {
        regINS(CK_NINS, cTL(contentList), getCValueContent(), "content");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as prefixSearch.
     */
    public void setContent_PrefixSearch(String content) {
        setContent_LikeSearch(content, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContent_LikeSearch(String content, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(content), getCValueContent(), "content", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * content: {VARCHAR(400)}
     * @param content The value of content as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setContent_NotLikeSearch(String content, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(content), getCValueContent(), "content", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     */
    public void setContent_IsNull() { regContent(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     */
    public void setContent_IsNullOrEmpty() { regContent(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * content: {VARCHAR(400)}
     */
    public void setContent_IsNotNull() { regContent(CK_ISNN, DOBJ); }

    protected void regContent(ConditionKey k, Object v) { regQ(k, v, getCValueContent(), "content"); }
    abstract protected ConditionValue getCValueContent();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return EnterpriseAplicantCB.class.getName(); }
    protected String xabCQ() { return EnterpriseAplicantCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
