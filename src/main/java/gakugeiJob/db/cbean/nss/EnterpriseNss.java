package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.EnterpriseCQ;

/**
 * The nest select set-upper of enterprise.
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseCQ _query;
    public EnterpriseNss(EnterpriseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public LoginNss withLogin() {
        _query.doNss(new EnterpriseCQ.NssCall() { public ConditionQuery qf() { return _query.queryLogin(); }});
		return new LoginNss(_query.queryLogin());
    }

}
