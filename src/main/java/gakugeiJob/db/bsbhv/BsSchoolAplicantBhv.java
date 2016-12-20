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
 * The behavior of school_aplicant as TABLE. <br />
 * <pre>
 * [primary key]
 *     school_offer_id, student_id
 * 
 * [column]
 *     school_offer_id, student_id, title, content
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
 *     school_offer, student
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     schoolOffer, student
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSchoolAplicantBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "school_aplicant"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SchoolAplicantDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SchoolAplicantDbm getMyDBMeta() { return SchoolAplicantDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SchoolAplicant newMyEntity() { return new SchoolAplicant(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SchoolAplicantCB newMyConditionBean() { return new SchoolAplicantCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * int count = schoolAplicantBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The selected count.
     */
    public int selectCount(SchoolAplicantCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SchoolAplicantCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SchoolAplicantCB cb) { // called by selectPage(cb)
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
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * schoolAplicantBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SchoolAplicant&gt;() {
     *     public void handle(SchoolAplicant entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @param entityRowHandler The handler of entity row of SchoolAplicant. (NotNull)
     */
    public void selectCursor(SchoolAplicantCB cb, EntityRowHandler<SchoolAplicant> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> void doSelectCursor(SchoolAplicantCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<SchoolAplicant>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * SchoolAplicant schoolAplicant = schoolAplicantBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (schoolAplicant != null) {
     *     ... = schoolAplicant.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolAplicant selectEntity(SchoolAplicantCB cb) {
        return doSelectEntity(cb, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> ENTITY doSelectEntity(final SchoolAplicantCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, SchoolAplicantCB>() {
            public List<ENTITY> callbackSelectList(SchoolAplicantCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * SchoolAplicant schoolAplicant = schoolAplicantBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = schoolAplicant.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolAplicant selectEntityWithDeletedCheck(SchoolAplicantCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> ENTITY doSelectEntityWithDeletedCheck(final SchoolAplicantCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SchoolAplicantCB>() {
            public List<ENTITY> callbackSelectList(SchoolAplicantCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param schoolOfferId The one of primary key. (NotNull)
     * @param studentId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolAplicant selectByPKValue(Integer schoolOfferId, Integer studentId) {
        return doSelectByPKValue(schoolOfferId, studentId, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> ENTITY doSelectByPKValue(Integer schoolOfferId, Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(schoolOfferId, studentId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param schoolOfferId The one of primary key. (NotNull)
     * @param studentId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolAplicant selectByPKValueWithDeletedCheck(Integer schoolOfferId, Integer studentId) {
        return doSelectByPKValueWithDeletedCheck(schoolOfferId, studentId, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> ENTITY doSelectByPKValueWithDeletedCheck(Integer schoolOfferId, Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(schoolOfferId, studentId), entityType);
    }

    private SchoolAplicantCB buildPKCB(Integer schoolOfferId, Integer studentId) {
        assertObjectNotNull("schoolOfferId", schoolOfferId);assertObjectNotNull("studentId", studentId);
        SchoolAplicantCB cb = newMyConditionBean();
        cb.query().setSchoolOfferId_Equal(schoolOfferId);cb.query().setStudentId_Equal(studentId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SchoolAplicant&gt; schoolAplicantList = schoolAplicantBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SchoolAplicant schoolAplicant : schoolAplicantList) {
     *     ... = schoolAplicant.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SchoolAplicant> selectList(SchoolAplicantCB cb) {
        return doSelectList(cb, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> ListResultBean<ENTITY> doSelectList(SchoolAplicantCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, SchoolAplicantCB>() {
            public List<ENTITY> callbackSelectList(SchoolAplicantCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SchoolAplicant&gt; page = schoolAplicantBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SchoolAplicant schoolAplicant : page) {
     *     ... = schoolAplicant.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SchoolAplicant> selectPage(SchoolAplicantCB cb) {
        return doSelectPage(cb, SchoolAplicant.class);
    }

    protected <ENTITY extends SchoolAplicant> PagingResultBean<ENTITY> doSelectPage(SchoolAplicantCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, SchoolAplicantCB>() {
            public int callbackSelectCount(SchoolAplicantCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SchoolAplicantCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * schoolAplicantBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SchoolAplicantCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<SchoolAplicantCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SchoolAplicantCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'SchoolOffer'.
     * @param schoolAplicantList The list of schoolAplicant. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<SchoolOffer> pulloutSchoolOffer(List<SchoolAplicant> schoolAplicantList) {
        return helpPulloutInternally(schoolAplicantList, new InternalPulloutCallback<SchoolAplicant, SchoolOffer>() {
            public SchoolOffer getFr(SchoolAplicant e) { return e.getSchoolOffer(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SchoolOffer e, List<SchoolAplicant> ls)
            { e.setSchoolAplicantList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'Student'.
     * @param schoolAplicantList The list of schoolAplicant. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Student> pulloutStudent(List<SchoolAplicant> schoolAplicantList) {
        return helpPulloutInternally(schoolAplicantList, new InternalPulloutCallback<SchoolAplicant, Student>() {
            public Student getFr(SchoolAplicant e) { return e.getStudent(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Student e, List<SchoolAplicant> ls)
            { e.setSchoolAplicantList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * schoolAplicant.setFoo...(value);
     * schoolAplicant.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolAplicant.set...;</span>
     * schoolAplicantBhv.<span style="color: #FD4747">insert</span>(schoolAplicant);
     * ... = schoolAplicant.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param schoolAplicant The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(SchoolAplicant schoolAplicant) {
        doInsert(schoolAplicant, null);
    }

    protected void doInsert(SchoolAplicant schoolAplicant, InsertOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicant", schoolAplicant);
        prepareInsertOption(option);
        delegateInsert(schoolAplicant, option);
    }

    protected void prepareInsertOption(InsertOption<SchoolAplicantCB> option) {
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
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * schoolAplicant.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * schoolAplicant.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolAplicant.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolAplicant.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolAplicantBhv.<span style="color: #FD4747">update</span>(schoolAplicant);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param schoolAplicant The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final SchoolAplicant schoolAplicant) {
        doUpdate(schoolAplicant, null);
    }

    protected void doUpdate(SchoolAplicant schoolAplicant, final UpdateOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicant", schoolAplicant);
        prepareUpdateOption(option);
        helpUpdateInternally(schoolAplicant, new InternalUpdateCallback<SchoolAplicant>() {
            public int callbackDelegateUpdate(SchoolAplicant entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<SchoolAplicantCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SchoolAplicantCB createCBForVaryingUpdate() {
        SchoolAplicantCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SchoolAplicantCB createCBForSpecifiedUpdate() {
        SchoolAplicantCB cb = newMyConditionBean();
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
     * @param schoolAplicant The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(SchoolAplicant schoolAplicant) {
        doInesrtOrUpdate(schoolAplicant, null, null);
    }

    protected void doInesrtOrUpdate(SchoolAplicant schoolAplicant, final InsertOption<SchoolAplicantCB> insertOption, final UpdateOption<SchoolAplicantCB> updateOption) {
        helpInsertOrUpdateInternally(schoolAplicant, new InternalInsertOrUpdateCallback<SchoolAplicant, SchoolAplicantCB>() {
            public void callbackInsert(SchoolAplicant entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(SchoolAplicant entity) { doUpdate(entity, updateOption); }
            public SchoolAplicantCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SchoolAplicantCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<SchoolAplicantCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<SchoolAplicantCB>() : updateOption;
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
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * schoolAplicant.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolAplicant.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolAplicantBhv.<span style="color: #FD4747">delete</span>(schoolAplicant);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param schoolAplicant The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SchoolAplicant schoolAplicant) {
        doDelete(schoolAplicant, null);
    }

    protected void doDelete(SchoolAplicant schoolAplicant, final DeleteOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicant", schoolAplicant);
        prepareDeleteOption(option);
        helpDeleteInternally(schoolAplicant, new InternalDeleteCallback<SchoolAplicant>() {
            public int callbackDelegateDelete(SchoolAplicant entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<SchoolAplicantCB> option) {
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
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<SchoolAplicant> schoolAplicantList) {
        return doBatchInsert(schoolAplicantList, null);
    }

    protected int[] doBatchInsert(List<SchoolAplicant> schoolAplicantList, InsertOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicantList", schoolAplicantList);
        prepareInsertOption(option);
        return delegateBatchInsert(schoolAplicantList, option);
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
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<SchoolAplicant> schoolAplicantList) {
        return doBatchUpdate(schoolAplicantList, null);
    }

    protected int[] doBatchUpdate(List<SchoolAplicant> schoolAplicantList, UpdateOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicantList", schoolAplicantList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(schoolAplicantList, option);
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
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<SchoolAplicant> schoolAplicantList, SpecifyQuery<SchoolAplicantCB> updateColumnSpec) {
        return doBatchUpdate(schoolAplicantList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<SchoolAplicant> schoolAplicantList) {
        return doBatchDelete(schoolAplicantList, null);
    }

    protected int[] doBatchDelete(List<SchoolAplicant> schoolAplicantList, DeleteOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicantList", schoolAplicantList);
        prepareDeleteOption(option);
        return delegateBatchDelete(schoolAplicantList, option);
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
     * schoolAplicantBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SchoolAplicant, SchoolAplicantCB&gt;() {
     *     public ConditionBean setup(schoolAplicant entity, SchoolAplicantCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SchoolAplicant, SchoolAplicantCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SchoolAplicant, SchoolAplicantCB> setupper, InsertOption<SchoolAplicantCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        SchoolAplicant entity = new SchoolAplicant();
        SchoolAplicantCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected SchoolAplicantCB createCBForQueryInsert() {
        SchoolAplicantCB cb = newMyConditionBean();
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
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setPK...(value);</span>
     * schoolAplicant.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolAplicant.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setVersionNo(value);</span>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * schoolAplicantBhv.<span style="color: #FD4747">queryUpdate</span>(schoolAplicant, cb);
     * </pre>
     * @param schoolAplicant The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SchoolAplicant schoolAplicant, SchoolAplicantCB cb) {
        return doQueryUpdate(schoolAplicant, cb, null);
    }

    protected int doQueryUpdate(SchoolAplicant schoolAplicant, SchoolAplicantCB cb, UpdateOption<SchoolAplicantCB> option) {
        assertObjectNotNull("schoolAplicant", schoolAplicant); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(schoolAplicant, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (SchoolAplicantCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (SchoolAplicantCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * schoolAplicantBhv.<span style="color: #FD4747">queryDelete</span>(schoolAplicant, cb);
     * </pre>
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SchoolAplicantCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SchoolAplicantCB cb, DeleteOption<SchoolAplicantCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((SchoolAplicantCB)cb); }
        else { return varyingQueryDelete((SchoolAplicantCB)cb, downcast(option)); }
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
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * schoolAplicant.setFoo...(value);
     * schoolAplicant.setBar...(value);
     * InsertOption<SchoolAplicantCB> option = new InsertOption<SchoolAplicantCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * schoolAplicantBhv.<span style="color: #FD4747">varyingInsert</span>(schoolAplicant, option);
     * ... = schoolAplicant.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param schoolAplicant The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(SchoolAplicant schoolAplicant, InsertOption<SchoolAplicantCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(schoolAplicant, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * schoolAplicant.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * schoolAplicant.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolAplicant.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SchoolAplicantCB&gt; option = new UpdateOption&lt;SchoolAplicantCB&gt;();
     *     option.self(new SpecifyQuery&lt;SchoolAplicantCB&gt;() {
     *         public void specify(SchoolAplicantCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     schoolAplicantBhv.<span style="color: #FD4747">varyingUpdate</span>(schoolAplicant, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param schoolAplicant The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(SchoolAplicant schoolAplicant, UpdateOption<SchoolAplicantCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(schoolAplicant, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param schoolAplicant The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(SchoolAplicant schoolAplicant, InsertOption<SchoolAplicantCB> insertOption, UpdateOption<SchoolAplicantCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(schoolAplicant, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param schoolAplicant The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SchoolAplicant schoolAplicant, DeleteOption<SchoolAplicantCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(schoolAplicant, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<SchoolAplicant> schoolAplicantList, InsertOption<SchoolAplicantCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(schoolAplicantList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<SchoolAplicant> schoolAplicantList, UpdateOption<SchoolAplicantCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(schoolAplicantList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param schoolAplicantList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<SchoolAplicant> schoolAplicantList, DeleteOption<SchoolAplicantCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(schoolAplicantList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SchoolAplicant, SchoolAplicantCB> setupper, InsertOption<SchoolAplicantCB> option) {
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
     * SchoolAplicant schoolAplicant = new SchoolAplicant();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setPK...(value);</span>
     * schoolAplicant.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//schoolAplicant.setVersionNo(value);</span>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SchoolAplicantCB&gt; option = new UpdateOption&lt;SchoolAplicantCB&gt;();
     * option.self(new SpecifyQuery&lt;SchoolAplicantCB&gt;() {
     *     public void specify(SchoolAplicantCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * schoolAplicantBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(schoolAplicant, cb, option);
     * </pre>
     * @param schoolAplicant The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SchoolAplicant schoolAplicant, SchoolAplicantCB cb, UpdateOption<SchoolAplicantCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(schoolAplicant, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SchoolAplicant. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SchoolAplicantCB cb, DeleteOption<SchoolAplicantCB> option) {
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
    public OutsideSqlBasicExecutor<SchoolAplicantBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SchoolAplicantCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SchoolAplicantCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SchoolAplicant> void delegateSelectCursor(SchoolAplicantCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends SchoolAplicant> List<ENTITY> delegateSelectList(SchoolAplicantCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SchoolAplicant e, InsertOption<SchoolAplicantCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(SchoolAplicant e, UpdateOption<SchoolAplicantCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(SchoolAplicant e, UpdateOption<SchoolAplicantCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(SchoolAplicant e, DeleteOption<SchoolAplicantCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(SchoolAplicant e, DeleteOption<SchoolAplicantCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<SchoolAplicant> ls, InsertOption<SchoolAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SchoolAplicant> ls, UpdateOption<SchoolAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SchoolAplicant> ls, UpdateOption<SchoolAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SchoolAplicant> ls, DeleteOption<SchoolAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SchoolAplicant> ls, DeleteOption<SchoolAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SchoolAplicant e, SchoolAplicantCB inCB, ConditionBean resCB, InsertOption<SchoolAplicantCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SchoolAplicant e, SchoolAplicantCB cb, UpdateOption<SchoolAplicantCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(SchoolAplicantCB cb, DeleteOption<SchoolAplicantCB> op)
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
    protected SchoolAplicant downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, SchoolAplicant.class);
    }

    protected SchoolAplicantCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SchoolAplicantCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SchoolAplicant> downcast(List<? extends Entity> entityList) {
        return (List<SchoolAplicant>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SchoolAplicantCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<SchoolAplicantCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SchoolAplicantCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<SchoolAplicantCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SchoolAplicantCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<SchoolAplicantCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SchoolAplicant, SchoolAplicantCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<SchoolAplicant, SchoolAplicantCB>)option;
    }
}
