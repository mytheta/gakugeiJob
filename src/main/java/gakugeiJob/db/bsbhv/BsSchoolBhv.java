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
 * The behavior of school as TABLE. <br />
 * <pre>
 * [primary key]
 *     school_id
 * 
 * [column]
 *     school_id, user_id, name, kinds, phone_number, mail_address, url, one_thing
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     school_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     login
 * 
 * [referrer table]
 *     school_offer
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     schoolOfferList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSchoolBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "school"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SchoolDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SchoolDbm getMyDBMeta() { return SchoolDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public School newMyEntity() { return new School(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SchoolCB newMyConditionBean() { return new SchoolCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * int count = schoolBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @return The selected count.
     */
    public int selectCount(SchoolCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SchoolCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SchoolCB cb) { // called by selectPage(cb)
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
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * schoolBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;School&gt;() {
     *     public void handle(School entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @param entityRowHandler The handler of entity row of School. (NotNull)
     */
    public void selectCursor(SchoolCB cb, EntityRowHandler<School> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, School.class);
    }

    protected <ENTITY extends School> void doSelectCursor(SchoolCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<School>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * School school = schoolBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (school != null) {
     *     ... = school.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public School selectEntity(SchoolCB cb) {
        return doSelectEntity(cb, School.class);
    }

    protected <ENTITY extends School> ENTITY doSelectEntity(final SchoolCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, SchoolCB>() {
            public List<ENTITY> callbackSelectList(SchoolCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * School school = schoolBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = school.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public School selectEntityWithDeletedCheck(SchoolCB cb) {
        return doSelectEntityWithDeletedCheck(cb, School.class);
    }

    protected <ENTITY extends School> ENTITY doSelectEntityWithDeletedCheck(final SchoolCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SchoolCB>() {
            public List<ENTITY> callbackSelectList(SchoolCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param schoolId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public School selectByPKValue(Integer schoolId) {
        return doSelectByPKValue(schoolId, School.class);
    }

    protected <ENTITY extends School> ENTITY doSelectByPKValue(Integer schoolId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(schoolId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param schoolId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public School selectByPKValueWithDeletedCheck(Integer schoolId) {
        return doSelectByPKValueWithDeletedCheck(schoolId, School.class);
    }

    protected <ENTITY extends School> ENTITY doSelectByPKValueWithDeletedCheck(Integer schoolId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(schoolId), entityType);
    }

    private SchoolCB buildPKCB(Integer schoolId) {
        assertObjectNotNull("schoolId", schoolId);
        SchoolCB cb = newMyConditionBean();
        cb.query().setSchoolId_Equal(schoolId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;School&gt; schoolList = schoolBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (School school : schoolList) {
     *     ... = school.get...();
     * }
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<School> selectList(SchoolCB cb) {
        return doSelectList(cb, School.class);
    }

    protected <ENTITY extends School> ListResultBean<ENTITY> doSelectList(SchoolCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, SchoolCB>() {
            public List<ENTITY> callbackSelectList(SchoolCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;School&gt; page = schoolBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (School school : page) {
     *     ... = school.get...();
     * }
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<School> selectPage(SchoolCB cb) {
        return doSelectPage(cb, School.class);
    }

    protected <ENTITY extends School> PagingResultBean<ENTITY> doSelectPage(SchoolCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, SchoolCB>() {
            public int callbackSelectCount(SchoolCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SchoolCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * schoolBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SchoolCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<SchoolCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SchoolCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param school The entity of school. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolOfferList(School school, ConditionBeanSetupper<SchoolOfferCB> conditionBeanSetupper) {
        xassLRArg(school, conditionBeanSetupper);
        loadSchoolOfferList(xnewLRLs(school), conditionBeanSetupper);
    }
    /**
     * Load referrer of schoolOfferList with the set-upper for condition-bean of referrer. <br />
     * school_offer by your school_id, named 'schoolOfferList'.
     * <pre>
     * schoolBhv.<span style="color: #FD4747">loadSchoolOfferList</span>(schoolList, new ConditionBeanSetupper&lt;SchoolOfferCB&gt;() {
     *     public void setup(SchoolOfferCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (School school : schoolList) {
     *     ... = school.<span style="color: #FD4747">getSchoolOfferList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setSchoolId_InScope(pkList);
     * cb.query().addOrderBy_SchoolId_Asc();
     * </pre>
     * @param schoolList The entity list of school. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolOfferList(List<School> schoolList, ConditionBeanSetupper<SchoolOfferCB> conditionBeanSetupper) {
        xassLRArg(schoolList, conditionBeanSetupper);
        loadSchoolOfferList(schoolList, new LoadReferrerOption<SchoolOfferCB, SchoolOffer>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param school The entity of school. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolOfferList(School school, LoadReferrerOption<SchoolOfferCB, SchoolOffer> loadReferrerOption) {
        xassLRArg(school, loadReferrerOption);
        loadSchoolOfferList(xnewLRLs(school), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param schoolList The entity list of school. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolOfferList(List<School> schoolList, LoadReferrerOption<SchoolOfferCB, SchoolOffer> loadReferrerOption) {
        xassLRArg(schoolList, loadReferrerOption);
        if (schoolList.isEmpty()) { return; }
        final SchoolOfferBhv referrerBhv = xgetBSFLR().select(SchoolOfferBhv.class);
        helpLoadReferrerInternally(schoolList, loadReferrerOption, new InternalLoadReferrerCallback<School, Integer, SchoolOfferCB, SchoolOffer>() {
            public Integer getPKVal(School e)
            { return e.getSchoolId(); }
            public void setRfLs(School e, List<SchoolOffer> ls)
            { e.setSchoolOfferList(ls); }
            public SchoolOfferCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SchoolOfferCB cb, List<Integer> ls)
            { cb.query().setSchoolId_InScope(ls); }
            public void qyOdFKAsc(SchoolOfferCB cb) { cb.query().addOrderBy_SchoolId_Asc(); }
            public void spFKCol(SchoolOfferCB cb) { cb.specify().columnSchoolId(); }
            public List<SchoolOffer> selRfLs(SchoolOfferCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(SchoolOffer e) { return e.getSchoolId(); }
            public void setlcEt(SchoolOffer re, School le)
            { re.setSchool(le); }
            public String getRfPrNm() { return "schoolOfferList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'Login'.
     * @param schoolList The list of school. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Login> pulloutLogin(List<School> schoolList) {
        return helpPulloutInternally(schoolList, new InternalPulloutCallback<School, Login>() {
            public Login getFr(School e) { return e.getLogin(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Login e, List<School> ls)
            { e.setSchoolList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * School school = new School();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * school.setFoo...(value);
     * school.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//school.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//school.set...;</span>
     * schoolBhv.<span style="color: #FD4747">insert</span>(school);
     * ... = school.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param school The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(School school) {
        doInsert(school, null);
    }

    protected void doInsert(School school, InsertOption<SchoolCB> option) {
        assertObjectNotNull("school", school);
        prepareInsertOption(option);
        delegateInsert(school, option);
    }

    protected void prepareInsertOption(InsertOption<SchoolCB> option) {
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
     * School school = new School();
     * school.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * school.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//school.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//school.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * school.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolBhv.<span style="color: #FD4747">update</span>(school);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param school The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final School school) {
        doUpdate(school, null);
    }

    protected void doUpdate(School school, final UpdateOption<SchoolCB> option) {
        assertObjectNotNull("school", school);
        prepareUpdateOption(option);
        helpUpdateInternally(school, new InternalUpdateCallback<School>() {
            public int callbackDelegateUpdate(School entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<SchoolCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SchoolCB createCBForVaryingUpdate() {
        SchoolCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SchoolCB createCBForSpecifiedUpdate() {
        SchoolCB cb = newMyConditionBean();
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
     * @param school The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(School school) {
        doInesrtOrUpdate(school, null, null);
    }

    protected void doInesrtOrUpdate(School school, final InsertOption<SchoolCB> insertOption, final UpdateOption<SchoolCB> updateOption) {
        helpInsertOrUpdateInternally(school, new InternalInsertOrUpdateCallback<School, SchoolCB>() {
            public void callbackInsert(School entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(School entity) { doUpdate(entity, updateOption); }
            public SchoolCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SchoolCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<SchoolCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<SchoolCB>() : updateOption;
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
     * School school = new School();
     * school.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * school.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolBhv.<span style="color: #FD4747">delete</span>(school);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param school The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(School school) {
        doDelete(school, null);
    }

    protected void doDelete(School school, final DeleteOption<SchoolCB> option) {
        assertObjectNotNull("school", school);
        prepareDeleteOption(option);
        helpDeleteInternally(school, new InternalDeleteCallback<School>() {
            public int callbackDelegateDelete(School entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<SchoolCB> option) {
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
     * @param schoolList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<School> schoolList) {
        return doBatchInsert(schoolList, null);
    }

    protected int[] doBatchInsert(List<School> schoolList, InsertOption<SchoolCB> option) {
        assertObjectNotNull("schoolList", schoolList);
        prepareInsertOption(option);
        return delegateBatchInsert(schoolList, option);
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
     * @param schoolList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<School> schoolList) {
        return doBatchUpdate(schoolList, null);
    }

    protected int[] doBatchUpdate(List<School> schoolList, UpdateOption<SchoolCB> option) {
        assertObjectNotNull("schoolList", schoolList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(schoolList, option);
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
     * @param schoolList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<School> schoolList, SpecifyQuery<SchoolCB> updateColumnSpec) {
        return doBatchUpdate(schoolList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param schoolList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<School> schoolList) {
        return doBatchDelete(schoolList, null);
    }

    protected int[] doBatchDelete(List<School> schoolList, DeleteOption<SchoolCB> option) {
        assertObjectNotNull("schoolList", schoolList);
        prepareDeleteOption(option);
        return delegateBatchDelete(schoolList, option);
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
     * schoolBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;School, SchoolCB&gt;() {
     *     public ConditionBean setup(school entity, SchoolCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<School, SchoolCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<School, SchoolCB> setupper, InsertOption<SchoolCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        School entity = new School();
        SchoolCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected SchoolCB createCBForQueryInsert() {
        SchoolCB cb = newMyConditionBean();
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
     * School school = new School();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//school.setPK...(value);</span>
     * school.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//school.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//school.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//school.setVersionNo(value);</span>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * schoolBhv.<span style="color: #FD4747">queryUpdate</span>(school, cb);
     * </pre>
     * @param school The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of School. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(School school, SchoolCB cb) {
        return doQueryUpdate(school, cb, null);
    }

    protected int doQueryUpdate(School school, SchoolCB cb, UpdateOption<SchoolCB> option) {
        assertObjectNotNull("school", school); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(school, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (SchoolCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (SchoolCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * schoolBhv.<span style="color: #FD4747">queryDelete</span>(school, cb);
     * </pre>
     * @param cb The condition-bean of School. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SchoolCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SchoolCB cb, DeleteOption<SchoolCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((SchoolCB)cb); }
        else { return varyingQueryDelete((SchoolCB)cb, downcast(option)); }
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
     * School school = new School();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * school.setFoo...(value);
     * school.setBar...(value);
     * InsertOption<SchoolCB> option = new InsertOption<SchoolCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * schoolBhv.<span style="color: #FD4747">varyingInsert</span>(school, option);
     * ... = school.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param school The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(School school, InsertOption<SchoolCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(school, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * School school = new School();
     * school.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * school.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * school.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SchoolCB&gt; option = new UpdateOption&lt;SchoolCB&gt;();
     *     option.self(new SpecifyQuery&lt;SchoolCB&gt;() {
     *         public void specify(SchoolCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     schoolBhv.<span style="color: #FD4747">varyingUpdate</span>(school, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param school The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(School school, UpdateOption<SchoolCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(school, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param school The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(School school, InsertOption<SchoolCB> insertOption, UpdateOption<SchoolCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(school, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param school The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(School school, DeleteOption<SchoolCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(school, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param schoolList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<School> schoolList, InsertOption<SchoolCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(schoolList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param schoolList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<School> schoolList, UpdateOption<SchoolCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(schoolList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param schoolList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<School> schoolList, DeleteOption<SchoolCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(schoolList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<School, SchoolCB> setupper, InsertOption<SchoolCB> option) {
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
     * School school = new School();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//school.setPK...(value);</span>
     * school.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//school.setVersionNo(value);</span>
     * SchoolCB cb = new SchoolCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SchoolCB&gt; option = new UpdateOption&lt;SchoolCB&gt;();
     * option.self(new SpecifyQuery&lt;SchoolCB&gt;() {
     *     public void specify(SchoolCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * schoolBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(school, cb, option);
     * </pre>
     * @param school The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of School. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(School school, SchoolCB cb, UpdateOption<SchoolCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(school, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of School. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SchoolCB cb, DeleteOption<SchoolCB> option) {
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
    public OutsideSqlBasicExecutor<SchoolBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SchoolCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SchoolCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends School> void delegateSelectCursor(SchoolCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends School> List<ENTITY> delegateSelectList(SchoolCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(School e, InsertOption<SchoolCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(School e, UpdateOption<SchoolCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(School e, UpdateOption<SchoolCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(School e, DeleteOption<SchoolCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(School e, DeleteOption<SchoolCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<School> ls, InsertOption<SchoolCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<School> ls, UpdateOption<SchoolCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<School> ls, UpdateOption<SchoolCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<School> ls, DeleteOption<SchoolCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<School> ls, DeleteOption<SchoolCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(School e, SchoolCB inCB, ConditionBean resCB, InsertOption<SchoolCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(School e, SchoolCB cb, UpdateOption<SchoolCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(SchoolCB cb, DeleteOption<SchoolCB> op)
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
    protected School downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, School.class);
    }

    protected SchoolCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SchoolCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<School> downcast(List<? extends Entity> entityList) {
        return (List<School>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SchoolCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<SchoolCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SchoolCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<SchoolCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SchoolCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<SchoolCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<School, SchoolCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<School, SchoolCB>)option;
    }
}
