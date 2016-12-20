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
 * The behavior of student as TABLE. <br />
 * <pre>
 * [primary key]
 *     student_id
 * 
 * [column]
 *     student_id, user_id, name, birthday, sex, phone_number, mail_address, address
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     student_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     login
 * 
 * [referrer table]
 *     enterprise_aplicant, enterprise_favo, school_aplicant, school_favo
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     enterpriseAplicantList, enterpriseFavoList, schoolAplicantList, schoolFavoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsStudentBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "student"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return StudentDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public StudentDbm getMyDBMeta() { return StudentDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Student newMyEntity() { return new Student(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public StudentCB newMyConditionBean() { return new StudentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * int count = studentBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @return The selected count.
     */
    public int selectCount(StudentCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(StudentCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(StudentCB cb) { // called by selectPage(cb)
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
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * studentBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Student&gt;() {
     *     public void handle(Student entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @param entityRowHandler The handler of entity row of Student. (NotNull)
     */
    public void selectCursor(StudentCB cb, EntityRowHandler<Student> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Student.class);
    }

    protected <ENTITY extends Student> void doSelectCursor(StudentCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<Student>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * Student student = studentBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (student != null) {
     *     ... = student.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Student selectEntity(StudentCB cb) {
        return doSelectEntity(cb, Student.class);
    }

    protected <ENTITY extends Student> ENTITY doSelectEntity(final StudentCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, StudentCB>() {
            public List<ENTITY> callbackSelectList(StudentCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * Student student = studentBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = student.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Student selectEntityWithDeletedCheck(StudentCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Student.class);
    }

    protected <ENTITY extends Student> ENTITY doSelectEntityWithDeletedCheck(final StudentCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, StudentCB>() {
            public List<ENTITY> callbackSelectList(StudentCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param studentId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Student selectByPKValue(Integer studentId) {
        return doSelectByPKValue(studentId, Student.class);
    }

    protected <ENTITY extends Student> ENTITY doSelectByPKValue(Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(studentId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param studentId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Student selectByPKValueWithDeletedCheck(Integer studentId) {
        return doSelectByPKValueWithDeletedCheck(studentId, Student.class);
    }

    protected <ENTITY extends Student> ENTITY doSelectByPKValueWithDeletedCheck(Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(studentId), entityType);
    }

    private StudentCB buildPKCB(Integer studentId) {
        assertObjectNotNull("studentId", studentId);
        StudentCB cb = newMyConditionBean();
        cb.query().setStudentId_Equal(studentId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Student&gt; studentList = studentBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Student student : studentList) {
     *     ... = student.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Student> selectList(StudentCB cb) {
        return doSelectList(cb, Student.class);
    }

    protected <ENTITY extends Student> ListResultBean<ENTITY> doSelectList(StudentCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, StudentCB>() {
            public List<ENTITY> callbackSelectList(StudentCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Student&gt; page = studentBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Student student : page) {
     *     ... = student.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Student> selectPage(StudentCB cb) {
        return doSelectPage(cb, Student.class);
    }

    protected <ENTITY extends Student> PagingResultBean<ENTITY> doSelectPage(StudentCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, StudentCB>() {
            public int callbackSelectCount(StudentCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(StudentCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * studentBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(StudentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<StudentCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends StudentCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param student The entity of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseAplicantList(Student student, ConditionBeanSetupper<EnterpriseAplicantCB> conditionBeanSetupper) {
        xassLRArg(student, conditionBeanSetupper);
        loadEnterpriseAplicantList(xnewLRLs(student), conditionBeanSetupper);
    }
    /**
     * Load referrer of enterpriseAplicantList with the set-upper for condition-bean of referrer. <br />
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantList'.
     * <pre>
     * studentBhv.<span style="color: #FD4747">loadEnterpriseAplicantList</span>(studentList, new ConditionBeanSetupper&lt;EnterpriseAplicantCB&gt;() {
     *     public void setup(EnterpriseAplicantCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Student student : studentList) {
     *     ... = student.<span style="color: #FD4747">getEnterpriseAplicantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setStudentId_InScope(pkList);
     * cb.query().addOrderBy_StudentId_Asc();
     * </pre>
     * @param studentList The entity list of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseAplicantList(List<Student> studentList, ConditionBeanSetupper<EnterpriseAplicantCB> conditionBeanSetupper) {
        xassLRArg(studentList, conditionBeanSetupper);
        loadEnterpriseAplicantList(studentList, new LoadReferrerOption<EnterpriseAplicantCB, EnterpriseAplicant>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseAplicantList(Student student, LoadReferrerOption<EnterpriseAplicantCB, EnterpriseAplicant> loadReferrerOption) {
        xassLRArg(student, loadReferrerOption);
        loadEnterpriseAplicantList(xnewLRLs(student), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param studentList The entity list of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseAplicantList(List<Student> studentList, LoadReferrerOption<EnterpriseAplicantCB, EnterpriseAplicant> loadReferrerOption) {
        xassLRArg(studentList, loadReferrerOption);
        if (studentList.isEmpty()) { return; }
        final EnterpriseAplicantBhv referrerBhv = xgetBSFLR().select(EnterpriseAplicantBhv.class);
        helpLoadReferrerInternally(studentList, loadReferrerOption, new InternalLoadReferrerCallback<Student, Integer, EnterpriseAplicantCB, EnterpriseAplicant>() {
            public Integer getPKVal(Student e)
            { return e.getStudentId(); }
            public void setRfLs(Student e, List<EnterpriseAplicant> ls)
            { e.setEnterpriseAplicantList(ls); }
            public EnterpriseAplicantCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(EnterpriseAplicantCB cb, List<Integer> ls)
            { cb.query().setStudentId_InScope(ls); }
            public void qyOdFKAsc(EnterpriseAplicantCB cb) { cb.query().addOrderBy_StudentId_Asc(); }
            public void spFKCol(EnterpriseAplicantCB cb) { cb.specify().columnStudentId(); }
            public List<EnterpriseAplicant> selRfLs(EnterpriseAplicantCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(EnterpriseAplicant e) { return e.getStudentId(); }
            public void setlcEt(EnterpriseAplicant re, Student le)
            { re.setStudent(le); }
            public String getRfPrNm() { return "enterpriseAplicantList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseFavoList(Student student, ConditionBeanSetupper<EnterpriseFavoCB> conditionBeanSetupper) {
        xassLRArg(student, conditionBeanSetupper);
        loadEnterpriseFavoList(xnewLRLs(student), conditionBeanSetupper);
    }
    /**
     * Load referrer of enterpriseFavoList with the set-upper for condition-bean of referrer. <br />
     * enterprise_favo by your student_id, named 'enterpriseFavoList'.
     * <pre>
     * studentBhv.<span style="color: #FD4747">loadEnterpriseFavoList</span>(studentList, new ConditionBeanSetupper&lt;EnterpriseFavoCB&gt;() {
     *     public void setup(EnterpriseFavoCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Student student : studentList) {
     *     ... = student.<span style="color: #FD4747">getEnterpriseFavoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setStudentId_InScope(pkList);
     * cb.query().addOrderBy_StudentId_Asc();
     * </pre>
     * @param studentList The entity list of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseFavoList(List<Student> studentList, ConditionBeanSetupper<EnterpriseFavoCB> conditionBeanSetupper) {
        xassLRArg(studentList, conditionBeanSetupper);
        loadEnterpriseFavoList(studentList, new LoadReferrerOption<EnterpriseFavoCB, EnterpriseFavo>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseFavoList(Student student, LoadReferrerOption<EnterpriseFavoCB, EnterpriseFavo> loadReferrerOption) {
        xassLRArg(student, loadReferrerOption);
        loadEnterpriseFavoList(xnewLRLs(student), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param studentList The entity list of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseFavoList(List<Student> studentList, LoadReferrerOption<EnterpriseFavoCB, EnterpriseFavo> loadReferrerOption) {
        xassLRArg(studentList, loadReferrerOption);
        if (studentList.isEmpty()) { return; }
        final EnterpriseFavoBhv referrerBhv = xgetBSFLR().select(EnterpriseFavoBhv.class);
        helpLoadReferrerInternally(studentList, loadReferrerOption, new InternalLoadReferrerCallback<Student, Integer, EnterpriseFavoCB, EnterpriseFavo>() {
            public Integer getPKVal(Student e)
            { return e.getStudentId(); }
            public void setRfLs(Student e, List<EnterpriseFavo> ls)
            { e.setEnterpriseFavoList(ls); }
            public EnterpriseFavoCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(EnterpriseFavoCB cb, List<Integer> ls)
            { cb.query().setStudentId_InScope(ls); }
            public void qyOdFKAsc(EnterpriseFavoCB cb) { cb.query().addOrderBy_StudentId_Asc(); }
            public void spFKCol(EnterpriseFavoCB cb) { cb.specify().columnStudentId(); }
            public List<EnterpriseFavo> selRfLs(EnterpriseFavoCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(EnterpriseFavo e) { return e.getStudentId(); }
            public void setlcEt(EnterpriseFavo re, Student le)
            { re.setStudent(le); }
            public String getRfPrNm() { return "enterpriseFavoList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolAplicantList(Student student, ConditionBeanSetupper<SchoolAplicantCB> conditionBeanSetupper) {
        xassLRArg(student, conditionBeanSetupper);
        loadSchoolAplicantList(xnewLRLs(student), conditionBeanSetupper);
    }
    /**
     * Load referrer of schoolAplicantList with the set-upper for condition-bean of referrer. <br />
     * school_aplicant by your student_id, named 'schoolAplicantList'.
     * <pre>
     * studentBhv.<span style="color: #FD4747">loadSchoolAplicantList</span>(studentList, new ConditionBeanSetupper&lt;SchoolAplicantCB&gt;() {
     *     public void setup(SchoolAplicantCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Student student : studentList) {
     *     ... = student.<span style="color: #FD4747">getSchoolAplicantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setStudentId_InScope(pkList);
     * cb.query().addOrderBy_StudentId_Asc();
     * </pre>
     * @param studentList The entity list of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolAplicantList(List<Student> studentList, ConditionBeanSetupper<SchoolAplicantCB> conditionBeanSetupper) {
        xassLRArg(studentList, conditionBeanSetupper);
        loadSchoolAplicantList(studentList, new LoadReferrerOption<SchoolAplicantCB, SchoolAplicant>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolAplicantList(Student student, LoadReferrerOption<SchoolAplicantCB, SchoolAplicant> loadReferrerOption) {
        xassLRArg(student, loadReferrerOption);
        loadSchoolAplicantList(xnewLRLs(student), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param studentList The entity list of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolAplicantList(List<Student> studentList, LoadReferrerOption<SchoolAplicantCB, SchoolAplicant> loadReferrerOption) {
        xassLRArg(studentList, loadReferrerOption);
        if (studentList.isEmpty()) { return; }
        final SchoolAplicantBhv referrerBhv = xgetBSFLR().select(SchoolAplicantBhv.class);
        helpLoadReferrerInternally(studentList, loadReferrerOption, new InternalLoadReferrerCallback<Student, Integer, SchoolAplicantCB, SchoolAplicant>() {
            public Integer getPKVal(Student e)
            { return e.getStudentId(); }
            public void setRfLs(Student e, List<SchoolAplicant> ls)
            { e.setSchoolAplicantList(ls); }
            public SchoolAplicantCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SchoolAplicantCB cb, List<Integer> ls)
            { cb.query().setStudentId_InScope(ls); }
            public void qyOdFKAsc(SchoolAplicantCB cb) { cb.query().addOrderBy_StudentId_Asc(); }
            public void spFKCol(SchoolAplicantCB cb) { cb.specify().columnStudentId(); }
            public List<SchoolAplicant> selRfLs(SchoolAplicantCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(SchoolAplicant e) { return e.getStudentId(); }
            public void setlcEt(SchoolAplicant re, Student le)
            { re.setStudent(le); }
            public String getRfPrNm() { return "schoolAplicantList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolFavoList(Student student, ConditionBeanSetupper<SchoolFavoCB> conditionBeanSetupper) {
        xassLRArg(student, conditionBeanSetupper);
        loadSchoolFavoList(xnewLRLs(student), conditionBeanSetupper);
    }
    /**
     * Load referrer of schoolFavoList with the set-upper for condition-bean of referrer. <br />
     * school_favo by your student_id, named 'schoolFavoList'.
     * <pre>
     * studentBhv.<span style="color: #FD4747">loadSchoolFavoList</span>(studentList, new ConditionBeanSetupper&lt;SchoolFavoCB&gt;() {
     *     public void setup(SchoolFavoCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Student student : studentList) {
     *     ... = student.<span style="color: #FD4747">getSchoolFavoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setStudentId_InScope(pkList);
     * cb.query().addOrderBy_StudentId_Asc();
     * </pre>
     * @param studentList The entity list of student. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolFavoList(List<Student> studentList, ConditionBeanSetupper<SchoolFavoCB> conditionBeanSetupper) {
        xassLRArg(studentList, conditionBeanSetupper);
        loadSchoolFavoList(studentList, new LoadReferrerOption<SchoolFavoCB, SchoolFavo>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param student The entity of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolFavoList(Student student, LoadReferrerOption<SchoolFavoCB, SchoolFavo> loadReferrerOption) {
        xassLRArg(student, loadReferrerOption);
        loadSchoolFavoList(xnewLRLs(student), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param studentList The entity list of student. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolFavoList(List<Student> studentList, LoadReferrerOption<SchoolFavoCB, SchoolFavo> loadReferrerOption) {
        xassLRArg(studentList, loadReferrerOption);
        if (studentList.isEmpty()) { return; }
        final SchoolFavoBhv referrerBhv = xgetBSFLR().select(SchoolFavoBhv.class);
        helpLoadReferrerInternally(studentList, loadReferrerOption, new InternalLoadReferrerCallback<Student, Integer, SchoolFavoCB, SchoolFavo>() {
            public Integer getPKVal(Student e)
            { return e.getStudentId(); }
            public void setRfLs(Student e, List<SchoolFavo> ls)
            { e.setSchoolFavoList(ls); }
            public SchoolFavoCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SchoolFavoCB cb, List<Integer> ls)
            { cb.query().setStudentId_InScope(ls); }
            public void qyOdFKAsc(SchoolFavoCB cb) { cb.query().addOrderBy_StudentId_Asc(); }
            public void spFKCol(SchoolFavoCB cb) { cb.specify().columnStudentId(); }
            public List<SchoolFavo> selRfLs(SchoolFavoCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(SchoolFavo e) { return e.getStudentId(); }
            public void setlcEt(SchoolFavo re, Student le)
            { re.setStudent(le); }
            public String getRfPrNm() { return "schoolFavoList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'Login'.
     * @param studentList The list of student. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Login> pulloutLogin(List<Student> studentList) {
        return helpPulloutInternally(studentList, new InternalPulloutCallback<Student, Login>() {
            public Login getFr(Student e) { return e.getLogin(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Login e, List<Student> ls)
            { e.setStudentList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * Student student = new Student();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * student.setFoo...(value);
     * student.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//student.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//student.set...;</span>
     * studentBhv.<span style="color: #FD4747">insert</span>(student);
     * ... = student.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param student The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(Student student) {
        doInsert(student, null);
    }

    protected void doInsert(Student student, InsertOption<StudentCB> option) {
        assertObjectNotNull("student", student);
        prepareInsertOption(option);
        delegateInsert(student, option);
    }

    protected void prepareInsertOption(InsertOption<StudentCB> option) {
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
     * Student student = new Student();
     * student.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * student.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//student.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//student.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * student.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     studentBhv.<span style="color: #FD4747">update</span>(student);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param student The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final Student student) {
        doUpdate(student, null);
    }

    protected void doUpdate(Student student, final UpdateOption<StudentCB> option) {
        assertObjectNotNull("student", student);
        prepareUpdateOption(option);
        helpUpdateInternally(student, new InternalUpdateCallback<Student>() {
            public int callbackDelegateUpdate(Student entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<StudentCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected StudentCB createCBForVaryingUpdate() {
        StudentCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected StudentCB createCBForSpecifiedUpdate() {
        StudentCB cb = newMyConditionBean();
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
     * @param student The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(Student student) {
        doInesrtOrUpdate(student, null, null);
    }

    protected void doInesrtOrUpdate(Student student, final InsertOption<StudentCB> insertOption, final UpdateOption<StudentCB> updateOption) {
        helpInsertOrUpdateInternally(student, new InternalInsertOrUpdateCallback<Student, StudentCB>() {
            public void callbackInsert(Student entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(Student entity) { doUpdate(entity, updateOption); }
            public StudentCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(StudentCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<StudentCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<StudentCB>() : updateOption;
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
     * Student student = new Student();
     * student.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * student.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     studentBhv.<span style="color: #FD4747">delete</span>(student);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param student The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Student student) {
        doDelete(student, null);
    }

    protected void doDelete(Student student, final DeleteOption<StudentCB> option) {
        assertObjectNotNull("student", student);
        prepareDeleteOption(option);
        helpDeleteInternally(student, new InternalDeleteCallback<Student>() {
            public int callbackDelegateDelete(Student entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<StudentCB> option) {
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
     * @param studentList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<Student> studentList) {
        return doBatchInsert(studentList, null);
    }

    protected int[] doBatchInsert(List<Student> studentList, InsertOption<StudentCB> option) {
        assertObjectNotNull("studentList", studentList);
        prepareInsertOption(option);
        return delegateBatchInsert(studentList, option);
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
     * @param studentList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Student> studentList) {
        return doBatchUpdate(studentList, null);
    }

    protected int[] doBatchUpdate(List<Student> studentList, UpdateOption<StudentCB> option) {
        assertObjectNotNull("studentList", studentList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(studentList, option);
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
     * @param studentList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Student> studentList, SpecifyQuery<StudentCB> updateColumnSpec) {
        return doBatchUpdate(studentList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param studentList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<Student> studentList) {
        return doBatchDelete(studentList, null);
    }

    protected int[] doBatchDelete(List<Student> studentList, DeleteOption<StudentCB> option) {
        assertObjectNotNull("studentList", studentList);
        prepareDeleteOption(option);
        return delegateBatchDelete(studentList, option);
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
     * studentBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Student, StudentCB&gt;() {
     *     public ConditionBean setup(student entity, StudentCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Student, StudentCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Student, StudentCB> setupper, InsertOption<StudentCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        Student entity = new Student();
        StudentCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected StudentCB createCBForQueryInsert() {
        StudentCB cb = newMyConditionBean();
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
     * Student student = new Student();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//student.setPK...(value);</span>
     * student.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//student.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//student.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//student.setVersionNo(value);</span>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * studentBhv.<span style="color: #FD4747">queryUpdate</span>(student, cb);
     * </pre>
     * @param student The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Student. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Student student, StudentCB cb) {
        return doQueryUpdate(student, cb, null);
    }

    protected int doQueryUpdate(Student student, StudentCB cb, UpdateOption<StudentCB> option) {
        assertObjectNotNull("student", student); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(student, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (StudentCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (StudentCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * studentBhv.<span style="color: #FD4747">queryDelete</span>(student, cb);
     * </pre>
     * @param cb The condition-bean of Student. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(StudentCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(StudentCB cb, DeleteOption<StudentCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((StudentCB)cb); }
        else { return varyingQueryDelete((StudentCB)cb, downcast(option)); }
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
     * Student student = new Student();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * student.setFoo...(value);
     * student.setBar...(value);
     * InsertOption<StudentCB> option = new InsertOption<StudentCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * studentBhv.<span style="color: #FD4747">varyingInsert</span>(student, option);
     * ... = student.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param student The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(Student student, InsertOption<StudentCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(student, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Student student = new Student();
     * student.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * student.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * student.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;StudentCB&gt; option = new UpdateOption&lt;StudentCB&gt;();
     *     option.self(new SpecifyQuery&lt;StudentCB&gt;() {
     *         public void specify(StudentCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     studentBhv.<span style="color: #FD4747">varyingUpdate</span>(student, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param student The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(Student student, UpdateOption<StudentCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(student, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param student The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(Student student, InsertOption<StudentCB> insertOption, UpdateOption<StudentCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(student, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param student The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Student student, DeleteOption<StudentCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(student, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param studentList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<Student> studentList, InsertOption<StudentCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(studentList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param studentList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<Student> studentList, UpdateOption<StudentCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(studentList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param studentList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<Student> studentList, DeleteOption<StudentCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(studentList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Student, StudentCB> setupper, InsertOption<StudentCB> option) {
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
     * Student student = new Student();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//student.setPK...(value);</span>
     * student.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//student.setVersionNo(value);</span>
     * StudentCB cb = new StudentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;StudentCB&gt; option = new UpdateOption&lt;StudentCB&gt;();
     * option.self(new SpecifyQuery&lt;StudentCB&gt;() {
     *     public void specify(StudentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * studentBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(student, cb, option);
     * </pre>
     * @param student The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Student. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Student student, StudentCB cb, UpdateOption<StudentCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(student, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Student. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(StudentCB cb, DeleteOption<StudentCB> option) {
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
    public OutsideSqlBasicExecutor<StudentBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(StudentCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(StudentCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Student> void delegateSelectCursor(StudentCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends Student> List<ENTITY> delegateSelectList(StudentCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Student e, InsertOption<StudentCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(Student e, UpdateOption<StudentCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(Student e, UpdateOption<StudentCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(Student e, DeleteOption<StudentCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(Student e, DeleteOption<StudentCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<Student> ls, InsertOption<StudentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Student> ls, UpdateOption<StudentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Student> ls, UpdateOption<StudentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Student> ls, DeleteOption<StudentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Student> ls, DeleteOption<StudentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Student e, StudentCB inCB, ConditionBean resCB, InsertOption<StudentCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Student e, StudentCB cb, UpdateOption<StudentCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(StudentCB cb, DeleteOption<StudentCB> op)
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
    protected Student downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, Student.class);
    }

    protected StudentCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, StudentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Student> downcast(List<? extends Entity> entityList) {
        return (List<Student>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<StudentCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<StudentCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<StudentCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<StudentCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<StudentCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<StudentCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Student, StudentCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<Student, StudentCB>)option;
    }
}
