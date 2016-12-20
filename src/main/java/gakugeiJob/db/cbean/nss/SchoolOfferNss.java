package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.SchoolOfferCQ;

/**
 * The nest select set-upper of school_offer.
 * @author DBFlute(AutoGenerator)
 */
public class SchoolOfferNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolOfferCQ _query;
    public SchoolOfferNss(SchoolOfferCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public SchoolNss withSchool() {
        _query.doNss(new SchoolOfferCQ.NssCall() { public ConditionQuery qf() { return _query.querySchool(); }});
		return new SchoolNss(_query.querySchool());
    }

}
