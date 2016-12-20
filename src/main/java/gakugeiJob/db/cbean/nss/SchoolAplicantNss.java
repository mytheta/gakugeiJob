package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.SchoolAplicantCQ;

/**
 * The nest select set-upper of school_aplicant.
 * @author DBFlute(AutoGenerator)
 */
public class SchoolAplicantNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolAplicantCQ _query;
    public SchoolAplicantNss(SchoolAplicantCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public SchoolOfferNss withSchoolOffer() {
        _query.doNss(new SchoolAplicantCQ.NssCall() { public ConditionQuery qf() { return _query.querySchoolOffer(); }});
		return new SchoolOfferNss(_query.querySchoolOffer());
    }
    public StudentNss withStudent() {
        _query.doNss(new SchoolAplicantCQ.NssCall() { public ConditionQuery qf() { return _query.queryStudent(); }});
		return new StudentNss(_query.queryStudent());
    }

}
