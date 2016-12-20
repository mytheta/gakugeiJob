package gakugeiJob.db.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import gakugeiJob.db.cbean.*;
import gakugeiJob.db.cbean.cq.bs.*;
import gakugeiJob.db.cbean.cq.*;

/**
 * The condition-query for in-line of student.
 * @author DBFlute(AutoGenerator)
 */
public class StudentCIQ extends AbstractBsStudentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsStudentCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public StudentCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsStudentCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueStudentId() { return _myCQ.getStudentId(); }
    public String keepStudentId_ExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStudentId_ExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStudentId_ExistsReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStudentId_ExistsReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepStudentId_NotExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStudentId_NotExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStudentId_NotExistsReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStudentId_NotExistsReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepStudentId_InScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { return _myCQ.keepStudentId_InScopeRelation_EnterpriseAplicantList(sq); }
    public String keepStudentId_InScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { return _myCQ.keepStudentId_InScopeRelation_EnterpriseFavoList(sq); }
    public String keepStudentId_InScopeRelation_SchoolAplicantList(SchoolAplicantCQ sq)
    { return _myCQ.keepStudentId_InScopeRelation_SchoolAplicantList(sq); }
    public String keepStudentId_InScopeRelation_SchoolFavoList(SchoolFavoCQ sq)
    { return _myCQ.keepStudentId_InScopeRelation_SchoolFavoList(sq); }
    public String keepStudentId_NotInScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { return _myCQ.keepStudentId_NotInScopeRelation_EnterpriseAplicantList(sq); }
    public String keepStudentId_NotInScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { return _myCQ.keepStudentId_NotInScopeRelation_EnterpriseFavoList(sq); }
    public String keepStudentId_NotInScopeRelation_SchoolAplicantList(SchoolAplicantCQ sq)
    { return _myCQ.keepStudentId_NotInScopeRelation_SchoolAplicantList(sq); }
    public String keepStudentId_NotInScopeRelation_SchoolFavoList(SchoolFavoCQ sq)
    { return _myCQ.keepStudentId_NotInScopeRelation_SchoolFavoList(sq); }
    public String keepStudentId_SpecifyDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStudentId_SpecifyDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStudentId_SpecifyDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStudentId_SpecifyDerivedReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseAplicantListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_EnterpriseFavoListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_SchoolAplicantListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepStudentId_QueryDerivedReferrer_SchoolFavoListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueUserId() { return _myCQ.getUserId(); }
    public String keepUserId_InScopeRelation_Login(LoginCQ sq)
    { return _myCQ.keepUserId_InScopeRelation_Login(sq); }
    public String keepUserId_NotInScopeRelation_Login(LoginCQ sq)
    { return _myCQ.keepUserId_NotInScopeRelation_Login(sq); }
    protected ConditionValue getCValueName() { return _myCQ.getName(); }
    protected ConditionValue getCValueBirthday() { return _myCQ.getBirthday(); }
    protected ConditionValue getCValueSex() { return _myCQ.getSex(); }
    protected ConditionValue getCValuePhoneNumber() { return _myCQ.getPhoneNumber(); }
    protected ConditionValue getCValueMailAddress() { return _myCQ.getMailAddress(); }
    protected ConditionValue getCValueAddress() { return _myCQ.getAddress(); }
    public String keepScalarCondition(StudentCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(StudentCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(StudentCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(StudentCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(StudentCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return StudentCB.class.getName(); }
    protected String xinCQ() { return StudentCQ.class.getName(); }
}
