package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.LoginCQ;

/**
 * The nest select set-upper of login.
 * @author DBFlute(AutoGenerator)
 */
public class LoginNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LoginCQ _query;
    public LoginNss(LoginCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============

    public AdminNss withAdminAsOne() {
        _query.doNss(new LoginCQ.NssCall() { public ConditionQuery qf() { return _query.queryAdminAsOne(); }});
		return new AdminNss(_query.queryAdminAsOne());
    }
}
