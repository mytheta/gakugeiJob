package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.SchoolCQ;

/**
 * The nest select set-upper of school.
 * @author DBFlute(AutoGenerator)
 */
public class SchoolNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolCQ _query;
    public SchoolNss(SchoolCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public LoginNss withLogin() {
        _query.doNss(new SchoolCQ.NssCall() { public ConditionQuery qf() { return _query.queryLogin(); }});
		return new LoginNss(_query.queryLogin());
    }

}
