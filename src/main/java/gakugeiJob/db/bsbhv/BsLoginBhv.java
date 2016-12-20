package gakugeiJob.db.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import gakugeiJob.db.exbhv.*;
import gakugeiJob.db.exentity.*;
import gakugeiJob.db.bsentity.dbmeta.*;
import gakugeiJob.db.cbean.*;

/**
 * The behavior of login as TABLE. <br />
 * <pre>
 * [primary key]
 *     user_id
 * 
 * [column]
 *     user_id, user_pass, role
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     admin(AsOne)
 * 
 * [referrer table]
 *     enterprise, school, student, admin
 * 
 * [foreign property]
 *     adminAsOne
 * 
 * [referrer property]
 *     enterpriseList, schoolList, studentList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLoginBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "login"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return LoginDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LoginDbm getMyDBMeta() { return LoginDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Login newMyEntity() { return new Login(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public LoginCB newMyConditionBean() { return new LoginCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * int count = loginBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LoginCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(LoginCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(LoginCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * loginBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Login&gt;() {
     *     public void handle(Login entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @param entityRowHandler The handler of entity row of Login. (NotNull)
     */
    public void selectCursor(LoginCB cb, EntityRowHandler<Login> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Login.class);
    }

    protected <ENTITY extends Login> void doSelectCursor(LoginCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<Login>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * Login login = loginBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (login != null) {
     *     ... = login.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Login selectEntity(LoginCB cb) {
        return doSelectEntity(cb, Login.class);
    }

    protected <ENTITY extends Login> ENTITY doSelectEntity(final LoginCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, LoginCB>() {
            public List<ENTITY> callbackSelectList(LoginCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * Login login = loginBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = login.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Login selectEntityWithDeletedCheck(LoginCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Login.class);
    }

    protected <ENTITY extends Login> ENTITY doSelectEntityWithDeletedCheck(final LoginCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, LoginCB>() {
            public List<ENTITY> callbackSelectList(LoginCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param userId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Login selectByPKValue(String userId) {
        return doSelectByPKValue(userId, Login.class);
    }

    protected <ENTITY extends Login> ENTITY doSelectByPKValue(String userId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(userId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param userId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Login selectByPKValueWithDeletedCheck(String userId) {
        return doSelectByPKValueWithDeletedCheck(userId, Login.class);
    }

    protected <ENTITY extends Login> ENTITY doSelectByPKValueWithDeletedCheck(String userId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(userId), entityType);
    }

    private LoginCB buildPKCB(String userId) {
        assertObjectNotNull("userId", userId);
        LoginCB cb = newMyConditionBean();
        cb.query().setUserId_Equal(userId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Login&gt; loginList = loginBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Login login : loginList) {
     *     ... = login.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Login> selectList(LoginCB cb) {
        return doSelectList(cb, Login.class);
    }

    protected <ENTITY extends Login> ListResultBean<ENTITY> doSelectList(LoginCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, LoginCB>() {
            public List<ENTITY> callbackSelectList(LoginCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Login&gt; page = loginBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Login login : page) {
     *     ... = login.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Login> selectPage(LoginCB cb) {
        return doSelectPage(cb, Login.class);
    }

    protected <ENTITY extends Login> PagingResultBean<ENTITY> doSelectPage(LoginCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, LoginCB>() {
            public int callbackSelectCount(LoginCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(LoginCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * loginBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(LoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<LoginCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends LoginCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param login The entity of login. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseList(Login login, ConditionBeanSetupper<EnterpriseCB> conditionBeanSetupper) {
        xassLRArg(login, conditionBeanSetupper);
        loadEnterpriseList(xnewLRLs(login), conditionBeanSetupper);
    }
    /**
     * Load referrer of enterpriseList with the set-upper for condition-bean of referrer. <br />
     * enterprise by your user_id, named 'enterpriseList'.
     * <pre>
     * loginBhv.<span style="color: #FD4747">loadEnterpriseList</span>(loginList, new ConditionBeanSetupper&lt;EnterpriseCB&gt;() {
     *     public void setup(EnterpriseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Login login : loginList) {
     *     ... = login.<span style="color: #FD4747">getEnterpriseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param loginList The entity list of login. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseList(List<Login> loginList, ConditionBeanSetupper<EnterpriseCB> conditionBeanSetupper) {
        xassLRArg(loginList, conditionBeanSetupper);
        loadEnterpriseList(loginList, new LoadReferrerOption<EnterpriseCB, Enterprise>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param login The entity of login. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseList(Login login, LoadReferrerOption<EnterpriseCB, Enterprise> loadReferrerOption) {
        xassLRArg(login, loadReferrerOption);
        loadEnterpriseList(xnewLRLs(login), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param loginList The entity list of login. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseList(List<Login> loginList, LoadReferrerOption<EnterpriseCB, Enterprise> loadReferrerOption) {
        xassLRArg(loginList, loadReferrerOption);
        if (loginList.isEmpty()) { return; }
        final EnterpriseBhv referrerBhv = xgetBSFLR().select(EnterpriseBhv.class);
        helpLoadReferrerInternally(loginList, loadReferrerOption, new InternalLoadReferrerCallback<Login, String, EnterpriseCB, Enterprise>() {
            public String getPKVal(Login e)
            { return e.getUserId(); }
            public void setRfLs(Login e, List<Enterprise> ls)
            { e.setEnterpriseList(ls); }
            public EnterpriseCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(EnterpriseCB cb, List<String> ls)
            { cb.query().setUserId_InScope(ls); }
            public void qyOdFKAsc(EnterpriseCB cb) { cb.query().addOrderBy_UserId_Asc(); }
            public void spFKCol(EnterpriseCB cb) { cb.specify().columnUserId(); }
            public List<Enterprise> selRfLs(EnterpriseCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(Enterprise e) { return e.getUserId(); }
            public void setlcEt(Enterprise re, Login le)
            { re.setLogin(le); }
            public String getRfPrNm() { return "enterpriseList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param login The entity of login. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolList(Login login, ConditionBeanSetupper<SchoolCB> conditionBeanSetupper) {
        xassLRArg(login, conditionBeanSetupper);
        loadSchoolList(xnewLRLs(login), conditionBeanSetupper);
    }
    /**
     * Load referrer of schoolList with the set-upper for condition-bean of referrer. <br />
     * school by your user_id, named 'schoolList'.
     * <pre>
     * loginBhv.<span style="color: #FD4747">loadSchoolList</span>(loginList, new ConditionBeanSetupper&lt;SchoolCB&gt;() {
     *     public void setup(SchoolCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Login login : loginList) {
     *     ... = login.<span style="color: #FD4747">getSchoolList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param loginList The entity list of login. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolList(List<Login> loginList, ConditionBeanSetupper<SchoolCB> conditionBeanSetupper) {
        xassLRArg(loginList, conditionBeanSetupper);
        loadSchoolList(loginList, new LoadReferrerOption<SchoolCB, School>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param login The entity of login. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolList(Login login, LoadReferrerOption<SchoolCB, School> loadReferrerOption) {
        xassLRArg(login, loadReferrerOption);
        loadSchoolList(xnewLRLs(login), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param loginList The entity list of login. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolList(List<Login> loginList, LoadReferrerOption<SchoolCB, School> loadReferrerOption) {
        xassLRArg(loginList, loadReferrerOption);
        if (loginList.isEmpty()) { return; }
        final SchoolBhv referrerBhv = xgetBSFLR().select(SchoolBhv.class);
        helpLoadReferrerInternally(loginList, loadReferrerOption, new InternalLoadReferrerCallback<Login, String, SchoolCB, School>() {
            public String getPKVal(Login e)
            { return e.getUserId(); }
            public void setRfLs(Login e, List<School> ls)
            { e.setSchoolList(ls); }
            public SchoolCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SchoolCB cb, List<String> ls)
            { cb.query().setUserId_InScope(ls); }
            public void qyOdFKAsc(SchoolCB cb) { cb.query().addOrderBy_UserId_Asc(); }
            public void spFKCol(SchoolCB cb) { cb.specify().columnUserId(); }
            public List<School> selRfLs(SchoolCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(School e) { return e.getUserId(); }
            public void setlcEt(School re, Login le)
            { re.setLogin(le); }
            public String getRfPrNm() { return "schoolList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param login The entity of login. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadStudentList(Login login, ConditionBeanSetupper<StudentCB> conditionBeanSetupper) {
        xassLRArg(login, conditionBeanSetupper);
        loadStudentList(xnewLRLs(login), conditionBeanSetupper);
    }
    /**
     * Load referrer of studentList with the set-upper for condition-bean of referrer. <br />
     * student by your user_id, named 'studentList'.
     * <pre>
     * loginBhv.<span style="color: #FD4747">loadStudentList</span>(loginList, new ConditionBeanSetupper&lt;StudentCB&gt;() {
     *     public void setup(StudentCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Login login : loginList) {
     *     ... = login.<span style="color: #FD4747">getStudentList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param loginList The entity list of login. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadStudentList(List<Login> loginList, ConditionBeanSetupper<StudentCB> conditionBeanSetupper) {
        xassLRArg(loginList, conditionBeanSetupper);
        loadStudentList(loginList, new LoadReferrerOption<StudentCB, Student>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param login The entity of login. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadStudentList(Login login, LoadReferrerOption<StudentCB, Student> loadReferrerOption) {
        xassLRArg(login, loadReferrerOption);
        loadStudentList(xnewLRLs(login), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param loginList The entity list of login. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadStudentList(List<Login> loginList, LoadReferrerOption<StudentCB, Student> loadReferrerOption) {
        xassLRArg(loginList, loadReferrerOption);
        if (loginList.isEmpty()) { return; }
        final StudentBhv referrerBhv = xgetBSFLR().select(StudentBhv.class);
        helpLoadReferrerInternally(loginList, loadReferrerOption, new InternalLoadReferrerCallback<Login, String, StudentCB, Student>() {
            public String getPKVal(Login e)
            { return e.getUserId(); }
            public void setRfLs(Login e, List<Student> ls)
            { e.setStudentList(ls); }
            public StudentCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(StudentCB cb, List<String> ls)
            { cb.query().setUserId_InScope(ls); }
            public void qyOdFKAsc(StudentCB cb) { cb.query().addOrderBy_UserId_Asc(); }
            public void spFKCol(StudentCB cb) { cb.specify().columnUserId(); }
            public List<Student> selRfLs(StudentCB cb) { return referrerBhv.selectList(cb); }
            public String getFKVal(Student e) { return e.getUserId(); }
            public void setlcEt(Student re, Login le)
            { re.setLogin(le); }
            public String getRfPrNm() { return "studentList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of referrer-as-one table 'Admin'.
     * @param loginList The list of login. (NotNull)
     * @return The list of referrer-as-one table. (NotNull)
     */
    public List<Admin> pulloutAdminAsOne(List<Login> loginList) {
        return helpPulloutInternally(loginList, new InternalPulloutCallback<Login, Admin>() {
            public Admin getFr(Login e) { return e.getAdminAsOne(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Admin e, List<Login> ls)
            { if (!ls.isEmpty()) { e.setLogin(ls.get(0)); } }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * Login login = new Login();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * login.setFoo...(value);
     * login.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//login.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//login.set...;</span>
     * loginBhv.<span style="color: #FD4747">insert</span>(login);
     * ... = login.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param login The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(Login login) {
        doInsert(login, null);
    }

    protected void doInsert(Login login, InsertOption<LoginCB> option) {
        assertObjectNotNull("login", login);
        prepareInsertOption(option);
        delegateInsert(login, option);
    }

    protected void prepareInsertOption(InsertOption<LoginCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * Login login = new Login();
     * login.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * login.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//login.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//login.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * login.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     loginBhv.<span style="color: #FD4747">update</span>(login);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param login The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final Login login) {
        doUpdate(login, null);
    }

    protected void doUpdate(Login login, final UpdateOption<LoginCB> option) {
        assertObjectNotNull("login", login);
        prepareUpdateOption(option);
        helpUpdateInternally(login, new InternalUpdateCallback<Login>() {
            public int callbackDelegateUpdate(Login entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<LoginCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected LoginCB createCBForVaryingUpdate() {
        LoginCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected LoginCB createCBForSpecifiedUpdate() {
        LoginCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param login The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(Login login) {
        doInesrtOrUpdate(login, null, null);
    }

    protected void doInesrtOrUpdate(Login login, final InsertOption<LoginCB> insertOption, final UpdateOption<LoginCB> updateOption) {
        helpInsertOrUpdateInternally(login, new InternalInsertOrUpdateCallback<Login, LoginCB>() {
            public void callbackInsert(Login entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(Login entity) { doUpdate(entity, updateOption); }
            public LoginCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LoginCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<LoginCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<LoginCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * Login login = new Login();
     * login.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * login.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     loginBhv.<span style="color: #FD4747">delete</span>(login);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param login The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Login login) {
        doDelete(login, null);
    }

    protected void doDelete(Login login, final DeleteOption<LoginCB> option) {
        assertObjectNotNull("login", login);
        prepareDeleteOption(option);
        helpDeleteInternally(login, new InternalDeleteCallback<Login>() {
            public int callbackDelegateDelete(Login entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<LoginCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are insert target. (so default constraints are not available) <br />
     * And if the table has an identity, entities after the process do not have incremented values.
     * (When you use the (normal) insert(), an entity after the process has an incremented value)
     * @param loginList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<Login> loginList) {
        return doBatchInsert(loginList, null);
    }

    protected int[] doBatchInsert(List<Login> loginList, InsertOption<LoginCB> option) {
        assertObjectNotNull("loginList", loginList);
        prepareInsertOption(option);
        return delegateBatchInsert(loginList, option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param loginList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Login> loginList) {
        return doBatchUpdate(loginList, null);
    }

    protected int[] doBatchUpdate(List<Login> loginList, UpdateOption<LoginCB> option) {
        assertObjectNotNull("loginList", loginList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(loginList, option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param loginList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Login> loginList, SpecifyQuery<LoginCB> updateColumnSpec) {
        return doBatchUpdate(loginList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param loginList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<Login> loginList) {
        return doBatchDelete(loginList, null);
    }

    protected int[] doBatchDelete(List<Login> loginList, DeleteOption<LoginCB> option) {
        assertObjectNotNull("loginList", loginList);
        prepareDeleteOption(option);
        return delegateBatchDelete(loginList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * loginBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Login, LoginCB&gt;() {
     *     public ConditionBean setup(login entity, LoginCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<Login, LoginCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Login, LoginCB> setupper, InsertOption<LoginCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        Login entity = new Login();
        LoginCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected LoginCB createCBForQueryInsert() {
        LoginCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. {NonExclusiveControl}
     * <pre>
     * Login login = new Login();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//login.setPK...(value);</span>
     * login.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//login.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//login.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//login.setVersionNo(value);</span>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * loginBhv.<span style="color: #FD4747">queryUpdate</span>(login, cb);
     * </pre>
     * @param login The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Login. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Login login, LoginCB cb) {
        return doQueryUpdate(login, cb, null);
    }

    protected int doQueryUpdate(Login login, LoginCB cb, UpdateOption<LoginCB> option) {
        assertObjectNotNull("login", login); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(login, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (LoginCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (LoginCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * loginBhv.<span style="color: #FD4747">queryDelete</span>(login, cb);
     * </pre>
     * @param cb The condition-bean of Login. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(LoginCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(LoginCB cb, DeleteOption<LoginCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((LoginCB)cb); }
        else { return varyingQueryDelete((LoginCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * Login login = new Login();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * login.setFoo...(value);
     * login.setBar...(value);
     * InsertOption<LoginCB> option = new InsertOption<LoginCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * loginBhv.<span style="color: #FD4747">varyingInsert</span>(login, option);
     * ... = login.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param login The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(Login login, InsertOption<LoginCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(login, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Login login = new Login();
     * login.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * login.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * login.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;LoginCB&gt; option = new UpdateOption&lt;LoginCB&gt;();
     *     option.self(new SpecifyQuery&lt;LoginCB&gt;() {
     *         public void specify(LoginCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     loginBhv.<span style="color: #FD4747">varyingUpdate</span>(login, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param login The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(Login login, UpdateOption<LoginCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(login, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param login The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(Login login, InsertOption<LoginCB> insertOption, UpdateOption<LoginCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(login, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param login The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Login login, DeleteOption<LoginCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(login, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param loginList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<Login> loginList, InsertOption<LoginCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(loginList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param loginList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<Login> loginList, UpdateOption<LoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(loginList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param loginList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<Login> loginList, DeleteOption<LoginCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(loginList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<Login, LoginCB> setupper, InsertOption<LoginCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * Login login = new Login();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//login.setPK...(value);</span>
     * login.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//login.setVersionNo(value);</span>
     * LoginCB cb = new LoginCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;LoginCB&gt; option = new UpdateOption&lt;LoginCB&gt;();
     * option.self(new SpecifyQuery&lt;LoginCB&gt;() {
     *     public void specify(LoginCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * loginBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(login, cb, option);
     * </pre>
     * @param login The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Login. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Login login, LoginCB cb, UpdateOption<LoginCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(login, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Login. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(LoginCB cb, DeleteOption<LoginCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     * 
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     * 
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<LoginBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(LoginCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(LoginCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Login> void delegateSelectCursor(LoginCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends Login> List<ENTITY> delegateSelectList(LoginCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Login e, InsertOption<LoginCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(Login e, UpdateOption<LoginCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(Login e, UpdateOption<LoginCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(Login e, DeleteOption<LoginCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(Login e, DeleteOption<LoginCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<Login> ls, InsertOption<LoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Login> ls, UpdateOption<LoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Login> ls, UpdateOption<LoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Login> ls, DeleteOption<LoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Login> ls, DeleteOption<LoginCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Login e, LoginCB inCB, ConditionBean resCB, InsertOption<LoginCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Login e, LoginCB cb, UpdateOption<LoginCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(LoginCB cb, DeleteOption<LoginCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected Login downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, Login.class);
    }

    protected LoginCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, LoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Login> downcast(List<? extends Entity> entityList) {
        return (List<Login>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<LoginCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<LoginCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<LoginCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<LoginCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<LoginCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<LoginCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Login, LoginCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<Login, LoginCB>)option;
    }
}
