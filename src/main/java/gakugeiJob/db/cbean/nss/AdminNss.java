package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.AdminCQ;

/**
 * The nest select set-upper of admin.
 * @author DBFlute(AutoGenerator)
 */
public class AdminNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected AdminCQ _query;
    public AdminNss(AdminCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public LoginNss withLogin() {
        _query.doNss(new AdminCQ.NssCall() { public ConditionQuery qf() { return _query.queryLogin(); }});
		return new LoginNss(_query.queryLogin());
    }

}
