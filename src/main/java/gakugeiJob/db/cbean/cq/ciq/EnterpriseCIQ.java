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
 * The condition-query for in-line of enterprise.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseCIQ extends AbstractBsEnterpriseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEnterpriseCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EnterpriseCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEnterpriseCQ myCQ) {
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
    protected ConditionValue getCValueEnterpriseId() { return _myCQ.getEnterpriseId(); }
    public String keepEnterpriseId_ExistsReferrer_EnterpriseOfferList(EnterpriseOfferCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepEnterpriseId_NotExistsReferrer_EnterpriseOfferList(EnterpriseOfferCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepEnterpriseId_InScopeRelation_EnterpriseOfferList(EnterpriseOfferCQ sq)
    { return _myCQ.keepEnterpriseId_InScopeRelation_EnterpriseOfferList(sq); }
    public String keepEnterpriseId_NotInScopeRelation_EnterpriseOfferList(EnterpriseOfferCQ sq)
    { return _myCQ.keepEnterpriseId_NotInScopeRelation_EnterpriseOfferList(sq); }
    public String keepEnterpriseId_SpecifyDerivedReferrer_EnterpriseOfferList(EnterpriseOfferCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferList(EnterpriseOfferCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepEnterpriseId_QueryDerivedReferrer_EnterpriseOfferListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueUserId() { return _myCQ.getUserId(); }
    public String keepUserId_InScopeRelation_Login(LoginCQ sq)
    { return _myCQ.keepUserId_InScopeRelation_Login(sq); }
    public String keepUserId_NotInScopeRelation_Login(LoginCQ sq)
    { return _myCQ.keepUserId_NotInScopeRelation_Login(sq); }
    protected ConditionValue getCValueName() { return _myCQ.getName(); }
    protected ConditionValue getCValueFoundingDate() { return _myCQ.getFoundingDate(); }
    protected ConditionValue getCValueFounderName() { return _myCQ.getFounderName(); }
    protected ConditionValue getCValueAddress() { return _myCQ.getAddress(); }
    protected ConditionValue getCValueCapital() { return _myCQ.getCapital(); }
    protected ConditionValue getCValuePresidentName() { return _myCQ.getPresidentName(); }
    protected ConditionValue getCValueNumOfEmployees() { return _myCQ.getNumOfEmployees(); }
    protected ConditionValue getCValueBusiness() { return _myCQ.getBusiness(); }
    protected ConditionValue getCValuePhoneNumber() { return _myCQ.getPhoneNumber(); }
    protected ConditionValue getCValueUrl() { return _myCQ.getUrl(); }
    protected ConditionValue getCValueOneThing() { return _myCQ.getOneThing(); }
    protected ConditionValue getCValueMailAddress() { return _myCQ.getMailAddress(); }
    public String keepScalarCondition(EnterpriseCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(EnterpriseCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(EnterpriseCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(EnterpriseCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(EnterpriseCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EnterpriseCB.class.getName(); }
    protected String xinCQ() { return EnterpriseCQ.class.getName(); }
}
