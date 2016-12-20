package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.EnterpriseFavoCQ;

/**
 * The nest select set-upper of enterprise_favo.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseFavoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseFavoCQ _query;
    public EnterpriseFavoNss(EnterpriseFavoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public EnterpriseOfferNss withEnterpriseOffer() {
        _query.doNss(new EnterpriseFavoCQ.NssCall() { public ConditionQuery qf() { return _query.queryEnterpriseOffer(); }});
		return new EnterpriseOfferNss(_query.queryEnterpriseOffer());
    }
    public StudentNss withStudent() {
        _query.doNss(new EnterpriseFavoCQ.NssCall() { public ConditionQuery qf() { return _query.queryStudent(); }});
		return new StudentNss(_query.queryStudent());
    }

}
