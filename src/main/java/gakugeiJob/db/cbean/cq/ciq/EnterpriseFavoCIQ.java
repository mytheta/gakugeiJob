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
 * The condition-query for in-line of enterprise_favo.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseFavoCIQ extends AbstractBsEnterpriseFavoCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsEnterpriseFavoCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public EnterpriseFavoCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsEnterpriseFavoCQ myCQ) {
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
    public String keepJobOfferId_InScopeRelation_EnterpriseOffer(EnterpriseOfferCQ sq)
    { return _myCQ.keepJobOfferId_InScopeRelation_EnterpriseOffer(sq); }
    public String keepJobOfferId_NotInScopeRelation_EnterpriseOffer(EnterpriseOfferCQ sq)
    { return _myCQ.keepJobOfferId_NotInScopeRelation_EnterpriseOffer(sq); }
    protected ConditionValue getCValueStudentId() { return _myCQ.getStudentId(); }
    public String keepStudentId_InScopeRelation_Student(StudentCQ sq)
    { return _myCQ.keepStudentId_InScopeRelation_Student(sq); }
    public String keepStudentId_NotInScopeRelation_Student(StudentCQ sq)
    { return _myCQ.keepStudentId_NotInScopeRelation_Student(sq); }

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return EnterpriseFavoCB.class.getName(); }
    protected String xinCQ() { return EnterpriseFavoCQ.class.getName(); }
}
