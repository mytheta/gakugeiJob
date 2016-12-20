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
 * The abstract condition-query of school_favo.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSchoolFavoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSchoolFavoCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "school_favo";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
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
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
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
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @param schoolOfferId The value of schoolOfferId as greaterThan.
     */
    public void setSchoolOfferId_GreaterThan(Integer schoolOfferId) {
        regSchoolOfferId(CK_GT, schoolOfferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @param schoolOfferId The value of schoolOfferId as lessThan.
     */
    public void setSchoolOfferId_LessThan(Integer schoolOfferId) {
        regSchoolOfferId(CK_LT, schoolOfferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @param schoolOfferId The value of schoolOfferId as greaterEqual.
     */
    public void setSchoolOfferId_GreaterEqual(Integer schoolOfferId) {
        regSchoolOfferId(CK_GE, schoolOfferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @param schoolOfferId The value of schoolOfferId as lessEqual.
     */
    public void setSchoolOfferId_LessEqual(Integer schoolOfferId) {
        regSchoolOfferId(CK_LE, schoolOfferId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @param minNumber The min number of schoolOfferId. (NullAllowed)
     * @param maxNumber The max number of schoolOfferId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSchoolOfferId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueSchoolOfferId(), "school_offer_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
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
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     * @param schoolOfferIdList The collection of schoolOfferId as notInScope.
     */
    public void setSchoolOfferId_NotInScope(Collection<Integer> schoolOfferIdList) {
        doSetSchoolOfferId_NotInScope(schoolOfferIdList);
    }

    protected void doSetSchoolOfferId_NotInScope(Collection<Integer> schoolOfferIdList) {
        regINS(CK_NINS, cTL(schoolOfferIdList), getCValueSchoolOfferId(), "school_offer_id");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select school_offer_id from school_offer where ...)} <br />
     * school_offer by my school_offer_id, named 'schoolOffer'.
     * @param subQuery The sub-query of SchoolOffer for 'in-scope'. (NotNull)
     */
    public void inScopeSchoolOffer(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_InScopeRelation_SchoolOffer(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolOffer");
    }
    public abstract String keepSchoolOfferId_InScopeRelation_SchoolOffer(SchoolOfferCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select school_offer_id from school_offer where ...)} <br />
     * school_offer by my school_offer_id, named 'schoolOffer'.
     * @param subQuery The sub-query of SchoolOffer for 'not in-scope'. (NotNull)
     */
    public void notInScopeSchoolOffer(SubQuery<SchoolOfferCB> subQuery) {
        assertObjectNotNull("subQuery<SchoolOfferCB>", subQuery);
        SchoolOfferCB cb = new SchoolOfferCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepSchoolOfferId_NotInScopeRelation_SchoolOffer(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "school_offer_id", "school_offer_id", subQueryPropertyName, "schoolOffer");
    }
    public abstract String keepSchoolOfferId_NotInScopeRelation_SchoolOffer(SchoolOfferCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     */
    public void setSchoolOfferId_IsNull() { regSchoolOfferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
     */
    public void setSchoolOfferId_IsNotNull() { regSchoolOfferId(CK_ISNN, DOBJ); }

    protected void regSchoolOfferId(ConditionKey k, Object v) { regQ(k, v, getCValueSchoolOfferId(), "school_offer_id"); }
    abstract protected ConditionValue getCValueSchoolOfferId();
    
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return SchoolFavoCB.class.getName(); }
    protected String xabCQ() { return SchoolFavoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
