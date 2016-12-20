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
 * The condition-query for in-line of enterprise_offer.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseOfferCIQ extends AbstractBsEnterpriseOfferCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEnterpriseOfferCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EnterpriseOfferCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEnterpriseOfferCQ myCQ) {
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
    protected ConditionValue getCValueJobOfferId() { return _myCQ.getJobOfferId(); }
    public String keepJobOfferId_ExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJobOfferId_ExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepJobOfferId_NotExistsReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJobOfferId_NotExistsReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepJobOfferId_InScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { return _myCQ.keepJobOfferId_InScopeRelation_EnterpriseAplicantList(sq); }
    public String keepJobOfferId_InScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { return _myCQ.keepJobOfferId_InScopeRelation_EnterpriseFavoList(sq); }
    public String keepJobOfferId_NotInScopeRelation_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { return _myCQ.keepJobOfferId_NotInScopeRelation_EnterpriseAplicantList(sq); }
    public String keepJobOfferId_NotInScopeRelation_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { return _myCQ.keepJobOfferId_NotInScopeRelation_EnterpriseFavoList(sq); }
    public String keepJobOfferId_SpecifyDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJobOfferId_SpecifyDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantList(EnterpriseAplicantCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseAplicantListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoList(EnterpriseFavoCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepJobOfferId_QueryDerivedReferrer_EnterpriseFavoListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueEnterpriseId() { return _myCQ.getEnterpriseId(); }
    public String keepEnterpriseId_InScopeRelation_Enterprise(EnterpriseCQ sq)
    { return _myCQ.keepEnterpriseId_InScopeRelation_Enterprise(sq); }
    public String keepEnterpriseId_NotInScopeRelation_Enterprise(EnterpriseCQ sq)
    { return _myCQ.keepEnterpriseId_NotInScopeRelation_Enterprise(sq); }
    protected ConditionValue getCValueDescription() { return _myCQ.getDescription(); }
    protected ConditionValue getCValueOfficeName() { return _myCQ.getOfficeName(); }
    protected ConditionValue getCValueAddress() { return _myCQ.getAddress(); }
    protected ConditionValue getCValueStation() { return _myCQ.getStation(); }
    protected ConditionValue getCValuePeriod() { return _myCQ.getPeriod(); }
    protected ConditionValue getCValueHoliday() { return _myCQ.getHoliday(); }
    protected ConditionValue getCValueWorkingTime() { return _myCQ.getWorkingTime(); }
    protected ConditionValue getCValueSalary() { return _myCQ.getSalary(); }
    protected ConditionValue getCValueQualification() { return _myCQ.getQualification(); }
    protected ConditionValue getCValueWelfare() { return _myCQ.getWelfare(); }
    protected ConditionValue getCValueOneThing() { return _myCQ.getOneThing(); }
    protected ConditionValue getCValueFavo() { return _myCQ.getFavo(); }
    protected ConditionValue getCValueRegistrationDate() { return _myCQ.getRegistrationDate(); }
    public String keepScalarCondition(EnterpriseOfferCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EnterpriseOfferCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EnterpriseOfferCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EnterpriseOfferCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(EnterpriseOfferCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EnterpriseOfferCB.class.getName(); }
    protected String xinCQ() { return EnterpriseOfferCQ.class.getName(); }
}
