package gakugeiJob.db.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import gakugeiJob.db.cbean.cq.StudentCQ;

/**
 * The nest select set-upper of student.
 * @author DBFlute(AutoGenerator)
 */
public class StudentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected StudentCQ _query;
    public StudentNss(StudentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public LoginNss withLogin() {
        _query.doNss(new StudentCQ.NssCall() { public ConditionQuery qf() { return _query.queryLogin(); }});
		return new LoginNss(_query.queryLogin());
    }

}
