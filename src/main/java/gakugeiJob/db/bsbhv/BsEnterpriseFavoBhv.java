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
 * The behavior of enterprise_favo as TABLE. <br />
 * <pre>
 * [primary key]
 *     job_offer_id, student_id
 * 
 * [column]
 *     job_offer_id, student_id
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
 *     enterprise_offer, student
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     enterpriseOffer, student
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEnterpriseFavoBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "enterprise_favo"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return EnterpriseFavoDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EnterpriseFavoDbm getMyDBMeta() { return EnterpriseFavoDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public EnterpriseFavo newMyEntity() { return new EnterpriseFavo(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EnterpriseFavoCB newMyConditionBean() { return new EnterpriseFavoCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * int count = enterpriseFavoBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The selected count.
     */
    public int selectCount(EnterpriseFavoCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(EnterpriseFavoCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(EnterpriseFavoCB cb) { // called by selectPage(cb)
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
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * enterpriseFavoBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;EnterpriseFavo&gt;() {
     *     public void handle(EnterpriseFavo entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @param entityRowHandler The handler of entity row of EnterpriseFavo. (NotNull)
     */
    public void selectCursor(EnterpriseFavoCB cb, EntityRowHandler<EnterpriseFavo> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> void doSelectCursor(EnterpriseFavoCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<EnterpriseFavo>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * EnterpriseFavo enterpriseFavo = enterpriseFavoBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (enterpriseFavo != null) {
     *     ... = enterpriseFavo.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseFavo selectEntity(EnterpriseFavoCB cb) {
        return doSelectEntity(cb, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> ENTITY doSelectEntity(final EnterpriseFavoCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, EnterpriseFavoCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseFavoCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * EnterpriseFavo enterpriseFavo = enterpriseFavoBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = enterpriseFavo.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseFavo selectEntityWithDeletedCheck(EnterpriseFavoCB cb) {
        return doSelectEntityWithDeletedCheck(cb, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> ENTITY doSelectEntityWithDeletedCheck(final EnterpriseFavoCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, EnterpriseFavoCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseFavoCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param jobOfferId The one of primary key. (NotNull)
     * @param studentId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseFavo selectByPKValue(Integer jobOfferId, Integer studentId) {
        return doSelectByPKValue(jobOfferId, studentId, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> ENTITY doSelectByPKValue(Integer jobOfferId, Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(jobOfferId, studentId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param jobOfferId The one of primary key. (NotNull)
     * @param studentId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseFavo selectByPKValueWithDeletedCheck(Integer jobOfferId, Integer studentId) {
        return doSelectByPKValueWithDeletedCheck(jobOfferId, studentId, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> ENTITY doSelectByPKValueWithDeletedCheck(Integer jobOfferId, Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(jobOfferId, studentId), entityType);
    }

    private EnterpriseFavoCB buildPKCB(Integer jobOfferId, Integer studentId) {
        assertObjectNotNull("jobOfferId", jobOfferId);assertObjectNotNull("studentId", studentId);
        EnterpriseFavoCB cb = newMyConditionBean();
        cb.query().setJobOfferId_Equal(jobOfferId);cb.query().setStudentId_Equal(studentId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;EnterpriseFavo&gt; enterpriseFavoList = enterpriseFavoBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (EnterpriseFavo enterpriseFavo : enterpriseFavoList) {
     *     ... = enterpriseFavo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<EnterpriseFavo> selectList(EnterpriseFavoCB cb) {
        return doSelectList(cb, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> ListResultBean<ENTITY> doSelectList(EnterpriseFavoCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, EnterpriseFavoCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseFavoCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;EnterpriseFavo&gt; page = enterpriseFavoBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (EnterpriseFavo enterpriseFavo : page) {
     *     ... = enterpriseFavo.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<EnterpriseFavo> selectPage(EnterpriseFavoCB cb) {
        return doSelectPage(cb, EnterpriseFavo.class);
    }

    protected <ENTITY extends EnterpriseFavo> PagingResultBean<ENTITY> doSelectPage(EnterpriseFavoCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, EnterpriseFavoCB>() {
            public int callbackSelectCount(EnterpriseFavoCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(EnterpriseFavoCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * enterpriseFavoBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(EnterpriseFavoCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<EnterpriseFavoCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends EnterpriseFavoCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'EnterpriseOffer'.
     * @param enterpriseFavoList The list of enterpriseFavo. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<EnterpriseOffer> pulloutEnterpriseOffer(List<EnterpriseFavo> enterpriseFavoList) {
        return helpPulloutInternally(enterpriseFavoList, new InternalPulloutCallback<EnterpriseFavo, EnterpriseOffer>() {
            public EnterpriseOffer getFr(EnterpriseFavo e) { return e.getEnterpriseOffer(); }
            public boolean hasRf() { return true; }
            public void setRfLs(EnterpriseOffer e, List<EnterpriseFavo> ls)
            { e.setEnterpriseFavoList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'Student'.
     * @param enterpriseFavoList The list of enterpriseFavo. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Student> pulloutStudent(List<EnterpriseFavo> enterpriseFavoList) {
        return helpPulloutInternally(enterpriseFavoList, new InternalPulloutCallback<EnterpriseFavo, Student>() {
            public Student getFr(EnterpriseFavo e) { return e.getStudent(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Student e, List<EnterpriseFavo> ls)
            { e.setEnterpriseFavoList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterpriseFavo.setFoo...(value);
     * enterpriseFavo.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.set...;</span>
     * enterpriseFavoBhv.<span style="color: #FD4747">insert</span>(enterpriseFavo);
     * ... = enterpriseFavo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterpriseFavo The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(EnterpriseFavo enterpriseFavo) {
        doInsert(enterpriseFavo, null);
    }

    protected void doInsert(EnterpriseFavo enterpriseFavo, InsertOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavo", enterpriseFavo);
        prepareInsertOption(option);
        delegateInsert(enterpriseFavo, option);
    }

    protected void prepareInsertOption(InsertOption<EnterpriseFavoCB> option) {
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
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * enterpriseFavo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterpriseFavo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseFavo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseFavoBhv.<span style="color: #FD4747">update</span>(enterpriseFavo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterpriseFavo The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final EnterpriseFavo enterpriseFavo) {
        doUpdate(enterpriseFavo, null);
    }

    protected void doUpdate(EnterpriseFavo enterpriseFavo, final UpdateOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavo", enterpriseFavo);
        prepareUpdateOption(option);
        helpUpdateInternally(enterpriseFavo, new InternalUpdateCallback<EnterpriseFavo>() {
            public int callbackDelegateUpdate(EnterpriseFavo entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<EnterpriseFavoCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected EnterpriseFavoCB createCBForVaryingUpdate() {
        EnterpriseFavoCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected EnterpriseFavoCB createCBForSpecifiedUpdate() {
        EnterpriseFavoCB cb = newMyConditionBean();
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
     * @param enterpriseFavo The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(EnterpriseFavo enterpriseFavo) {
        doInesrtOrUpdate(enterpriseFavo, null, null);
    }

    protected void doInesrtOrUpdate(EnterpriseFavo enterpriseFavo, final InsertOption<EnterpriseFavoCB> insertOption, final UpdateOption<EnterpriseFavoCB> updateOption) {
        helpInsertOrUpdateInternally(enterpriseFavo, new InternalInsertOrUpdateCallback<EnterpriseFavo, EnterpriseFavoCB>() {
            public void callbackInsert(EnterpriseFavo entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(EnterpriseFavo entity) { doUpdate(entity, updateOption); }
            public EnterpriseFavoCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(EnterpriseFavoCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<EnterpriseFavoCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<EnterpriseFavoCB>() : updateOption;
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
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * enterpriseFavo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseFavo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseFavoBhv.<span style="color: #FD4747">delete</span>(enterpriseFavo);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterpriseFavo The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(EnterpriseFavo enterpriseFavo) {
        doDelete(enterpriseFavo, null);
    }

    protected void doDelete(EnterpriseFavo enterpriseFavo, final DeleteOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavo", enterpriseFavo);
        prepareDeleteOption(option);
        helpDeleteInternally(enterpriseFavo, new InternalDeleteCallback<EnterpriseFavo>() {
            public int callbackDelegateDelete(EnterpriseFavo entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<EnterpriseFavoCB> option) {
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
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<EnterpriseFavo> enterpriseFavoList) {
        return doBatchInsert(enterpriseFavoList, null);
    }

    protected int[] doBatchInsert(List<EnterpriseFavo> enterpriseFavoList, InsertOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavoList", enterpriseFavoList);
        prepareInsertOption(option);
        return delegateBatchInsert(enterpriseFavoList, option);
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
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<EnterpriseFavo> enterpriseFavoList) {
        return doBatchUpdate(enterpriseFavoList, null);
    }

    protected int[] doBatchUpdate(List<EnterpriseFavo> enterpriseFavoList, UpdateOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavoList", enterpriseFavoList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(enterpriseFavoList, option);
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
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<EnterpriseFavo> enterpriseFavoList, SpecifyQuery<EnterpriseFavoCB> updateColumnSpec) {
        return doBatchUpdate(enterpriseFavoList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<EnterpriseFavo> enterpriseFavoList) {
        return doBatchDelete(enterpriseFavoList, null);
    }

    protected int[] doBatchDelete(List<EnterpriseFavo> enterpriseFavoList, DeleteOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavoList", enterpriseFavoList);
        prepareDeleteOption(option);
        return delegateBatchDelete(enterpriseFavoList, option);
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
     * enterpriseFavoBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;EnterpriseFavo, EnterpriseFavoCB&gt;() {
     *     public ConditionBean setup(enterpriseFavo entity, EnterpriseFavoCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<EnterpriseFavo, EnterpriseFavoCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<EnterpriseFavo, EnterpriseFavoCB> setupper, InsertOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        EnterpriseFavo entity = new EnterpriseFavo();
        EnterpriseFavoCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected EnterpriseFavoCB createCBForQueryInsert() {
        EnterpriseFavoCB cb = newMyConditionBean();
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
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setPK...(value);</span>
     * enterpriseFavo.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setVersionNo(value);</span>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * enterpriseFavoBhv.<span style="color: #FD4747">queryUpdate</span>(enterpriseFavo, cb);
     * </pre>
     * @param enterpriseFavo The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(EnterpriseFavo enterpriseFavo, EnterpriseFavoCB cb) {
        return doQueryUpdate(enterpriseFavo, cb, null);
    }

    protected int doQueryUpdate(EnterpriseFavo enterpriseFavo, EnterpriseFavoCB cb, UpdateOption<EnterpriseFavoCB> option) {
        assertObjectNotNull("enterpriseFavo", enterpriseFavo); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(enterpriseFavo, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (EnterpriseFavoCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (EnterpriseFavoCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * enterpriseFavoBhv.<span style="color: #FD4747">queryDelete</span>(enterpriseFavo, cb);
     * </pre>
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EnterpriseFavoCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(EnterpriseFavoCB cb, DeleteOption<EnterpriseFavoCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((EnterpriseFavoCB)cb); }
        else { return varyingQueryDelete((EnterpriseFavoCB)cb, downcast(option)); }
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
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterpriseFavo.setFoo...(value);
     * enterpriseFavo.setBar...(value);
     * InsertOption<EnterpriseFavoCB> option = new InsertOption<EnterpriseFavoCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * enterpriseFavoBhv.<span style="color: #FD4747">varyingInsert</span>(enterpriseFavo, option);
     * ... = enterpriseFavo.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterpriseFavo The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(EnterpriseFavo enterpriseFavo, InsertOption<EnterpriseFavoCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(enterpriseFavo, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * enterpriseFavo.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterpriseFavo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseFavo.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;EnterpriseFavoCB&gt; option = new UpdateOption&lt;EnterpriseFavoCB&gt;();
     *     option.self(new SpecifyQuery&lt;EnterpriseFavoCB&gt;() {
     *         public void specify(EnterpriseFavoCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     enterpriseFavoBhv.<span style="color: #FD4747">varyingUpdate</span>(enterpriseFavo, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param enterpriseFavo The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(EnterpriseFavo enterpriseFavo, UpdateOption<EnterpriseFavoCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(enterpriseFavo, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param enterpriseFavo The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(EnterpriseFavo enterpriseFavo, InsertOption<EnterpriseFavoCB> insertOption, UpdateOption<EnterpriseFavoCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(enterpriseFavo, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param enterpriseFavo The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(EnterpriseFavo enterpriseFavo, DeleteOption<EnterpriseFavoCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(enterpriseFavo, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<EnterpriseFavo> enterpriseFavoList, InsertOption<EnterpriseFavoCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(enterpriseFavoList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<EnterpriseFavo> enterpriseFavoList, UpdateOption<EnterpriseFavoCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(enterpriseFavoList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param enterpriseFavoList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<EnterpriseFavo> enterpriseFavoList, DeleteOption<EnterpriseFavoCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(enterpriseFavoList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<EnterpriseFavo, EnterpriseFavoCB> setupper, InsertOption<EnterpriseFavoCB> option) {
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
     * EnterpriseFavo enterpriseFavo = new EnterpriseFavo();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setPK...(value);</span>
     * enterpriseFavo.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterpriseFavo.setVersionNo(value);</span>
     * EnterpriseFavoCB cb = new EnterpriseFavoCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;EnterpriseFavoCB&gt; option = new UpdateOption&lt;EnterpriseFavoCB&gt;();
     * option.self(new SpecifyQuery&lt;EnterpriseFavoCB&gt;() {
     *     public void specify(EnterpriseFavoCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * enterpriseFavoBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(enterpriseFavo, cb, option);
     * </pre>
     * @param enterpriseFavo The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(EnterpriseFavo enterpriseFavo, EnterpriseFavoCB cb, UpdateOption<EnterpriseFavoCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(enterpriseFavo, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of EnterpriseFavo. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EnterpriseFavoCB cb, DeleteOption<EnterpriseFavoCB> option) {
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
    public OutsideSqlBasicExecutor<EnterpriseFavoBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(EnterpriseFavoCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(EnterpriseFavoCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends EnterpriseFavo> void delegateSelectCursor(EnterpriseFavoCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends EnterpriseFavo> List<ENTITY> delegateSelectList(EnterpriseFavoCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(EnterpriseFavo e, InsertOption<EnterpriseFavoCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(EnterpriseFavo e, UpdateOption<EnterpriseFavoCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(EnterpriseFavo e, UpdateOption<EnterpriseFavoCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(EnterpriseFavo e, DeleteOption<EnterpriseFavoCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(EnterpriseFavo e, DeleteOption<EnterpriseFavoCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<EnterpriseFavo> ls, InsertOption<EnterpriseFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<EnterpriseFavo> ls, UpdateOption<EnterpriseFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<EnterpriseFavo> ls, UpdateOption<EnterpriseFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<EnterpriseFavo> ls, DeleteOption<EnterpriseFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<EnterpriseFavo> ls, DeleteOption<EnterpriseFavoCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(EnterpriseFavo e, EnterpriseFavoCB inCB, ConditionBean resCB, InsertOption<EnterpriseFavoCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(EnterpriseFavo e, EnterpriseFavoCB cb, UpdateOption<EnterpriseFavoCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(EnterpriseFavoCB cb, DeleteOption<EnterpriseFavoCB> op)
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
    protected EnterpriseFavo downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, EnterpriseFavo.class);
    }

    protected EnterpriseFavoCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, EnterpriseFavoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<EnterpriseFavo> downcast(List<? extends Entity> entityList) {
        return (List<EnterpriseFavo>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<EnterpriseFavoCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<EnterpriseFavoCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<EnterpriseFavoCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<EnterpriseFavoCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<EnterpriseFavoCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<EnterpriseFavoCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<EnterpriseFavo, EnterpriseFavoCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<EnterpriseFavo, EnterpriseFavoCB>)option;
    }
}
