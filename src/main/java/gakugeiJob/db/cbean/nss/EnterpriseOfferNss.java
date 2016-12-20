package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.EnterpriseOfferCQ;

/**
 * The nest select set-upper of enterprise_offer.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseOfferNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseOfferCQ _query;
    public EnterpriseOfferNss(EnterpriseOfferCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public EnterpriseNss withEnterprise() {
        _query.doNss(new EnterpriseOfferCQ.NssCall() { public ConditionQuery qf() { return _query.queryEnterprise(); }});
		return new EnterpriseNss(_query.queryEnterprise());
    }

}
