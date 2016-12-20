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
 * The condition-query for in-line of school_offer.
 * @author DBFlute(AutoGenerator)
 */
public class SchoolOfferCIQ extends AbstractBsSchoolOfferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsSchoolOfferCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public SchoolOfferCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsSchoolOfferCQ myCQ) {
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
    protected ConditionValue getCValueSchoolOfferId() { return _myCQ.getSchoolOfferId(); }
    public String keepSchoolOfferId_ExistsReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSchoolOfferId_ExistsReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepSchoolOfferId_NotExistsReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSchoolOfferId_NotExistsReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepSchoolOfferId_InScopeRelation_SchoolAplicantList(SchoolAplicantCQ sq)
    { return _myCQ.keepSchoolOfferId_InScopeRelation_SchoolAplicantList(sq); }
    public String keepSchoolOfferId_InScopeRelation_SchoolFavoList(SchoolFavoCQ sq)
    { return _myCQ.keepSchoolOfferId_InScopeRelation_SchoolFavoList(sq); }
    public String keepSchoolOfferId_NotInScopeRelation_SchoolAplicantList(SchoolAplicantCQ sq)
    { return _myCQ.keepSchoolOfferId_NotInScopeRelation_SchoolAplicantList(sq); }
    public String keepSchoolOfferId_NotInScopeRelation_SchoolFavoList(SchoolFavoCQ sq)
    { return _myCQ.keepSchoolOfferId_NotInScopeRelation_SchoolFavoList(sq); }
    public String keepSchoolOfferId_SpecifyDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSchoolOfferId_SpecifyDerivedReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantList(SchoolAplicantCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolAplicantListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoList(SchoolFavoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepSchoolOfferId_QueryDerivedReferrer_SchoolFavoListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueSchoolId() { return _myCQ.getSchoolId(); }
    public String keepSchoolId_InScopeRelation_School(SchoolCQ sq)
    { return _myCQ.keepSchoolId_InScopeRelation_School(sq); }
    public String keepSchoolId_NotInScopeRelation_School(SchoolCQ sq)
    { return _myCQ.keepSchoolId_NotInScopeRelation_School(sq); }
    protected ConditionValue getCValueDescription() { return _myCQ.getDescription(); }
    protected ConditionValue getCValueSalary() { return _myCQ.getSalary(); }
    protected ConditionValue getCValueWorkSchedule() { return _myCQ.getWorkSchedule(); }
    protected ConditionValue getCValuePeriod() { return _myCQ.getPeriod(); }
    protected ConditionValue getCValueAddress() { return _myCQ.getAddress(); }
    protected ConditionValue getCValueStation() { return _myCQ.getStation(); }
    protected ConditionValue getCValueQualification() { return _myCQ.getQualification(); }
    protected ConditionValue getCValueWelfare() { return _myCQ.getWelfare(); }
    protected ConditionValue getCValueOneThing() { return _myCQ.getOneThing(); }
    protected ConditionValue getCValueFavo() { return _myCQ.getFavo(); }
    protected ConditionValue getCValueRegistrationDate() { return _myCQ.getRegistrationDate(); }
    public String keepScalarCondition(SchoolOfferCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(SchoolOfferCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(SchoolOfferCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(SchoolOfferCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(SchoolOfferCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return SchoolOfferCB.class.getName(); }
    protected String xinCQ() { return SchoolOfferCQ.class.getName(); }
}
