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
 * The behavior of school_favo as TABLE. <br />
 * <pre>
 * [primary key]
 *     school_offer_id, student_id
 * 
 * [column]
 *     school_offer_id, student_id
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
public abstract class BsSchoolFavoBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "school_favo"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SchoolFavoDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SchoolFavoDbm getMyDBMeta() { return SchoolFavoDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SchoolFavo newMyEntity() { return new SchoolFavo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SchoolFavoCB newMyConditionBean() { return new SchoolFavoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * int count = schoolFavoBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The selected count.
     */
    public int selectCount(SchoolFavoCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SchoolFavoCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SchoolFavoCB cb) { // called by selectPage(cb)
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
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * schoolFavoBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SchoolFavo&gt;() {
     *     public void handle(SchoolFavo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @param entityRowHandler The handler of entity row of SchoolFavo. (NotNull)
     */
    public void selectCursor(SchoolFavoCB cb, EntityRowHandler<SchoolFavo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> void doSelectCursor(SchoolFavoCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<SchoolFavo>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * SchoolFavo schoolFavo = schoolFavoBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (schoolFavo != null) {
     *     ... = schoolFavo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolFavo selectEntity(SchoolFavoCB cb) {
        return doSelectEntity(cb, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> ENTITY doSelectEntity(final SchoolFavoCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, SchoolFavoCB>() {
            public List<ENTITY> callbackSelectList(SchoolFavoCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * SchoolFavo schoolFavo = schoolFavoBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = schoolFavo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolFavo selectEntityWithDeletedCheck(SchoolFavoCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> ENTITY doSelectEntityWithDeletedCheck(final SchoolFavoCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SchoolFavoCB>() {
            public List<ENTITY> callbackSelectList(SchoolFavoCB cb) { return doSelectList(cb, entityType); } });
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
    public SchoolFavo selectByPKValue(Integer schoolOfferId, Integer studentId) {
        return doSelectByPKValue(schoolOfferId, studentId, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> ENTITY doSelectByPKValue(Integer schoolOfferId, Integer studentId, Class<ENTITY> entityType) {
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
    public SchoolFavo selectByPKValueWithDeletedCheck(Integer schoolOfferId, Integer studentId) {
        return doSelectByPKValueWithDeletedCheck(schoolOfferId, studentId, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> ENTITY doSelectByPKValueWithDeletedCheck(Integer schoolOfferId, Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(schoolOfferId, studentId), entityType);
    }

    private SchoolFavoCB buildPKCB(Integer schoolOfferId, Integer studentId) {
        assertObjectNotNull("schoolOfferId", schoolOfferId);assertObjectNotNull("studentId", studentId);
        SchoolFavoCB cb = newMyConditionBean();
        cb.query().setSchoolOfferId_Equal(schoolOfferId);cb.query().setStudentId_Equal(studentId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SchoolFavo&gt; schoolFavoList = schoolFavoBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SchoolFavo schoolFavo : schoolFavoList) {
     *     ... = schoolFavo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SchoolFavo> selectList(SchoolFavoCB cb) {
        return doSelectList(cb, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> ListResultBean<ENTITY> doSelectList(SchoolFavoCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, SchoolFavoCB>() {
            public List<ENTITY> callbackSelectList(SchoolFavoCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SchoolFavo&gt; page = schoolFavoBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SchoolFavo schoolFavo : page) {
     *     ... = schoolFavo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SchoolFavo> selectPage(SchoolFavoCB cb) {
        return doSelectPage(cb, SchoolFavo.class);
    }

    protected <ENTITY extends SchoolFavo> PagingResultBean<ENTITY> doSelectPage(SchoolFavoCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, SchoolFavoCB>() {
            public int callbackSelectCount(SchoolFavoCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SchoolFavoCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * schoolFavoBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SchoolFavoCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<SchoolFavoCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SchoolFavoCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param schoolFavoList The list of schoolFavo. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<SchoolOffer> pulloutSchoolOffer(List<SchoolFavo> schoolFavoList) {
        return helpPulloutInternally(schoolFavoList, new InternalPulloutCallback<SchoolFavo, SchoolOffer>() {
            public SchoolOffer getFr(SchoolFavo e) { return e.getSchoolOffer(); }
            public boolean hasRf() { return true; }
            public void setRfLs(SchoolOffer e, List<SchoolFavo> ls)
            { e.setSchoolFavoList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'Student'.
     * @param schoolFavoList The list of schoolFavo. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Student> pulloutStudent(List<SchoolFavo> schoolFavoList) {
        return helpPulloutInternally(schoolFavoList, new InternalPulloutCallback<SchoolFavo, Student>() {
            public Student getFr(SchoolFavo e) { return e.getStudent(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Student e, List<SchoolFavo> ls)
            { e.setSchoolFavoList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * SchoolFavo schoolFavo = new SchoolFavo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * schoolFavo.setFoo...(value);
     * schoolFavo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolFavo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolFavo.set...;</span>
     * schoolFavoBhv.<span style="color: #FD4747">insert</span>(schoolFavo);
     * ... = schoolFavo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param schoolFavo The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(SchoolFavo schoolFavo) {
        doInsert(schoolFavo, null);
    }

    protected void doInsert(SchoolFavo schoolFavo, InsertOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavo", schoolFavo);
        prepareInsertOption(option);
        delegateInsert(schoolFavo, option);
    }

    protected void prepareInsertOption(InsertOption<SchoolFavoCB> option) {
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
     * SchoolFavo schoolFavo = new SchoolFavo();
     * schoolFavo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * schoolFavo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolFavo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolFavo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolFavo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolFavoBhv.<span style="color: #FD4747">update</span>(schoolFavo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param schoolFavo The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final SchoolFavo schoolFavo) {
        doUpdate(schoolFavo, null);
    }

    protected void doUpdate(SchoolFavo schoolFavo, final UpdateOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavo", schoolFavo);
        prepareUpdateOption(option);
        helpUpdateInternally(schoolFavo, new InternalUpdateCallback<SchoolFavo>() {
            public int callbackDelegateUpdate(SchoolFavo entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<SchoolFavoCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SchoolFavoCB createCBForVaryingUpdate() {
        SchoolFavoCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SchoolFavoCB createCBForSpecifiedUpdate() {
        SchoolFavoCB cb = newMyConditionBean();
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
     * @param schoolFavo The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(SchoolFavo schoolFavo) {
        doInesrtOrUpdate(schoolFavo, null, null);
    }

    protected void doInesrtOrUpdate(SchoolFavo schoolFavo, final InsertOption<SchoolFavoCB> insertOption, final UpdateOption<SchoolFavoCB> updateOption) {
        helpInsertOrUpdateInternally(schoolFavo, new InternalInsertOrUpdateCallback<SchoolFavo, SchoolFavoCB>() {
            public void callbackInsert(SchoolFavo entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(SchoolFavo entity) { doUpdate(entity, updateOption); }
            public SchoolFavoCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SchoolFavoCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<SchoolFavoCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<SchoolFavoCB>() : updateOption;
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
     * SchoolFavo schoolFavo = new SchoolFavo();
     * schoolFavo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolFavo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolFavoBhv.<span style="color: #FD4747">delete</span>(schoolFavo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param schoolFavo The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SchoolFavo schoolFavo) {
        doDelete(schoolFavo, null);
    }

    protected void doDelete(SchoolFavo schoolFavo, final DeleteOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavo", schoolFavo);
        prepareDeleteOption(option);
        helpDeleteInternally(schoolFavo, new InternalDeleteCallback<SchoolFavo>() {
            public int callbackDelegateDelete(SchoolFavo entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<SchoolFavoCB> option) {
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
     * @param schoolFavoList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<SchoolFavo> schoolFavoList) {
        return doBatchInsert(schoolFavoList, null);
    }

    protected int[] doBatchInsert(List<SchoolFavo> schoolFavoList, InsertOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavoList", schoolFavoList);
        prepareInsertOption(option);
        return delegateBatchInsert(schoolFavoList, option);
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
     * @param schoolFavoList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<SchoolFavo> schoolFavoList) {
        return doBatchUpdate(schoolFavoList, null);
    }

    protected int[] doBatchUpdate(List<SchoolFavo> schoolFavoList, UpdateOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavoList", schoolFavoList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(schoolFavoList, option);
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
     * @param schoolFavoList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<SchoolFavo> schoolFavoList, SpecifyQuery<SchoolFavoCB> updateColumnSpec) {
        return doBatchUpdate(schoolFavoList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param schoolFavoList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<SchoolFavo> schoolFavoList) {
        return doBatchDelete(schoolFavoList, null);
    }

    protected int[] doBatchDelete(List<SchoolFavo> schoolFavoList, DeleteOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavoList", schoolFavoList);
        prepareDeleteOption(option);
        return delegateBatchDelete(schoolFavoList, option);
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
     * schoolFavoBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SchoolFavo, SchoolFavoCB&gt;() {
     *     public ConditionBean setup(schoolFavo entity, SchoolFavoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SchoolFavo, SchoolFavoCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SchoolFavo, SchoolFavoCB> setupper, InsertOption<SchoolFavoCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        SchoolFavo entity = new SchoolFavo();
        SchoolFavoCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected SchoolFavoCB createCBForQueryInsert() {
        SchoolFavoCB cb = newMyConditionBean();
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
     * SchoolFavo schoolFavo = new SchoolFavo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//schoolFavo.setPK...(value);</span>
     * schoolFavo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolFavo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolFavo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//schoolFavo.setVersionNo(value);</span>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * schoolFavoBhv.<span style="color: #FD4747">queryUpdate</span>(schoolFavo, cb);
     * </pre>
     * @param schoolFavo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SchoolFavo schoolFavo, SchoolFavoCB cb) {
        return doQueryUpdate(schoolFavo, cb, null);
    }

    protected int doQueryUpdate(SchoolFavo schoolFavo, SchoolFavoCB cb, UpdateOption<SchoolFavoCB> option) {
        assertObjectNotNull("schoolFavo", schoolFavo); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(schoolFavo, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (SchoolFavoCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (SchoolFavoCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * schoolFavoBhv.<span style="color: #FD4747">queryDelete</span>(schoolFavo, cb);
     * </pre>
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SchoolFavoCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SchoolFavoCB cb, DeleteOption<SchoolFavoCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((SchoolFavoCB)cb); }
        else { return varyingQueryDelete((SchoolFavoCB)cb, downcast(option)); }
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
     * SchoolFavo schoolFavo = new SchoolFavo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * schoolFavo.setFoo...(value);
     * schoolFavo.setBar...(value);
     * InsertOption<SchoolFavoCB> option = new InsertOption<SchoolFavoCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * schoolFavoBhv.<span style="color: #FD4747">varyingInsert</span>(schoolFavo, option);
     * ... = schoolFavo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param schoolFavo The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(SchoolFavo schoolFavo, InsertOption<SchoolFavoCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(schoolFavo, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SchoolFavo schoolFavo = new SchoolFavo();
     * schoolFavo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * schoolFavo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolFavo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SchoolFavoCB&gt; option = new UpdateOption&lt;SchoolFavoCB&gt;();
     *     option.self(new SpecifyQuery&lt;SchoolFavoCB&gt;() {
     *         public void specify(SchoolFavoCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     schoolFavoBhv.<span style="color: #FD4747">varyingUpdate</span>(schoolFavo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param schoolFavo The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(SchoolFavo schoolFavo, UpdateOption<SchoolFavoCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(schoolFavo, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param schoolFavo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(SchoolFavo schoolFavo, InsertOption<SchoolFavoCB> insertOption, UpdateOption<SchoolFavoCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(schoolFavo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param schoolFavo The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SchoolFavo schoolFavo, DeleteOption<SchoolFavoCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(schoolFavo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param schoolFavoList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<SchoolFavo> schoolFavoList, InsertOption<SchoolFavoCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(schoolFavoList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param schoolFavoList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<SchoolFavo> schoolFavoList, UpdateOption<SchoolFavoCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(schoolFavoList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param schoolFavoList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<SchoolFavo> schoolFavoList, DeleteOption<SchoolFavoCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(schoolFavoList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SchoolFavo, SchoolFavoCB> setupper, InsertOption<SchoolFavoCB> option) {
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
     * SchoolFavo schoolFavo = new SchoolFavo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//schoolFavo.setPK...(value);</span>
     * schoolFavo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//schoolFavo.setVersionNo(value);</span>
     * SchoolFavoCB cb = new SchoolFavoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SchoolFavoCB&gt; option = new UpdateOption&lt;SchoolFavoCB&gt;();
     * option.self(new SpecifyQuery&lt;SchoolFavoCB&gt;() {
     *     public void specify(SchoolFavoCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * schoolFavoBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(schoolFavo, cb, option);
     * </pre>
     * @param schoolFavo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SchoolFavo schoolFavo, SchoolFavoCB cb, UpdateOption<SchoolFavoCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(schoolFavo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SchoolFavo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SchoolFavoCB cb, DeleteOption<SchoolFavoCB> option) {
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
    public OutsideSqlBasicExecutor<SchoolFavoBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SchoolFavoCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SchoolFavoCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SchoolFavo> void delegateSelectCursor(SchoolFavoCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends SchoolFavo> List<ENTITY> delegateSelectList(SchoolFavoCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SchoolFavo e, InsertOption<SchoolFavoCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(SchoolFavo e, UpdateOption<SchoolFavoCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(SchoolFavo e, UpdateOption<SchoolFavoCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(SchoolFavo e, DeleteOption<SchoolFavoCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(SchoolFavo e, DeleteOption<SchoolFavoCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<SchoolFavo> ls, InsertOption<SchoolFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SchoolFavo> ls, UpdateOption<SchoolFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SchoolFavo> ls, UpdateOption<SchoolFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SchoolFavo> ls, DeleteOption<SchoolFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SchoolFavo> ls, DeleteOption<SchoolFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SchoolFavo e, SchoolFavoCB inCB, ConditionBean resCB, InsertOption<SchoolFavoCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SchoolFavo e, SchoolFavoCB cb, UpdateOption<SchoolFavoCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(SchoolFavoCB cb, DeleteOption<SchoolFavoCB> op)
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
    protected SchoolFavo downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, SchoolFavo.class);
    }

    protected SchoolFavoCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SchoolFavoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SchoolFavo> downcast(List<? extends Entity> entityList) {
        return (List<SchoolFavo>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SchoolFavoCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<SchoolFavoCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SchoolFavoCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<SchoolFavoCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SchoolFavoCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<SchoolFavoCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SchoolFavo, SchoolFavoCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<SchoolFavo, SchoolFavoCB>)option;
    }
}
