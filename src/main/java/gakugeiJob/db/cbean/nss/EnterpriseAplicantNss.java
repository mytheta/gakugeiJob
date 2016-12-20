package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.EnterpriseAplicantCQ;

/**
 * The nest select set-upper of enterprise_aplicant.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseAplicantNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseAplicantCQ _query;
    public EnterpriseAplicantNss(EnterpriseAplicantCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public EnterpriseOfferNss withEnterpriseOffer() {
        _query.doNss(new EnterpriseAplicantCQ.NssCall() { public ConditionQuery qf() { return _query.queryEnterpriseOffer(); }});
		return new EnterpriseOfferNss(_query.queryEnterpriseOffer());
    }
    public StudentNss withStudent() {
        _query.doNss(new EnterpriseAplicantCQ.NssCall() { public ConditionQuery qf() { return _query.queryStudent(); }});
		return new StudentNss(_query.queryStudent());
    }

}
