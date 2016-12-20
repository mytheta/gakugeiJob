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
 * The behavior of enterprise_aplicant as TABLE. <br />
 * <pre>
 * [primary key]
 *     job_offer_id, student_id
 * 
 * [column]
 *     job_offer_id, student_id, title, content
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
public abstract class BsEnterpriseAplicantBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "enterprise_aplicant"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return EnterpriseAplicantDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EnterpriseAplicantDbm getMyDBMeta() { return EnterpriseAplicantDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public EnterpriseAplicant newMyEntity() { return new EnterpriseAplicant(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EnterpriseAplicantCB newMyConditionBean() { return new EnterpriseAplicantCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * int count = enterpriseAplicantBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The selected count.
     */
    public int selectCount(EnterpriseAplicantCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(EnterpriseAplicantCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(EnterpriseAplicantCB cb) { // called by selectPage(cb)
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
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * enterpriseAplicantBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;EnterpriseAplicant&gt;() {
     *     public void handle(EnterpriseAplicant entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @param entityRowHandler The handler of entity row of EnterpriseAplicant. (NotNull)
     */
    public void selectCursor(EnterpriseAplicantCB cb, EntityRowHandler<EnterpriseAplicant> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> void doSelectCursor(EnterpriseAplicantCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<EnterpriseAplicant>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * EnterpriseAplicant enterpriseAplicant = enterpriseAplicantBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (enterpriseAplicant != null) {
     *     ... = enterpriseAplicant.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseAplicant selectEntity(EnterpriseAplicantCB cb) {
        return doSelectEntity(cb, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> ENTITY doSelectEntity(final EnterpriseAplicantCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, EnterpriseAplicantCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseAplicantCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * EnterpriseAplicant enterpriseAplicant = enterpriseAplicantBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = enterpriseAplicant.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseAplicant selectEntityWithDeletedCheck(EnterpriseAplicantCB cb) {
        return doSelectEntityWithDeletedCheck(cb, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> ENTITY doSelectEntityWithDeletedCheck(final EnterpriseAplicantCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, EnterpriseAplicantCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseAplicantCB cb) { return doSelectList(cb, entityType); } });
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
    public EnterpriseAplicant selectByPKValue(Integer jobOfferId, Integer studentId) {
        return doSelectByPKValue(jobOfferId, studentId, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> ENTITY doSelectByPKValue(Integer jobOfferId, Integer studentId, Class<ENTITY> entityType) {
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
    public EnterpriseAplicant selectByPKValueWithDeletedCheck(Integer jobOfferId, Integer studentId) {
        return doSelectByPKValueWithDeletedCheck(jobOfferId, studentId, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> ENTITY doSelectByPKValueWithDeletedCheck(Integer jobOfferId, Integer studentId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(jobOfferId, studentId), entityType);
    }

    private EnterpriseAplicantCB buildPKCB(Integer jobOfferId, Integer studentId) {
        assertObjectNotNull("jobOfferId", jobOfferId);assertObjectNotNull("studentId", studentId);
        EnterpriseAplicantCB cb = newMyConditionBean();
        cb.query().setJobOfferId_Equal(jobOfferId);cb.query().setStudentId_Equal(studentId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;EnterpriseAplicant&gt; enterpriseAplicantList = enterpriseAplicantBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (EnterpriseAplicant enterpriseAplicant : enterpriseAplicantList) {
     *     ... = enterpriseAplicant.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<EnterpriseAplicant> selectList(EnterpriseAplicantCB cb) {
        return doSelectList(cb, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> ListResultBean<ENTITY> doSelectList(EnterpriseAplicantCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, EnterpriseAplicantCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseAplicantCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;EnterpriseAplicant&gt; page = enterpriseAplicantBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (EnterpriseAplicant enterpriseAplicant : page) {
     *     ... = enterpriseAplicant.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<EnterpriseAplicant> selectPage(EnterpriseAplicantCB cb) {
        return doSelectPage(cb, EnterpriseAplicant.class);
    }

    protected <ENTITY extends EnterpriseAplicant> PagingResultBean<ENTITY> doSelectPage(EnterpriseAplicantCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, EnterpriseAplicantCB>() {
            public int callbackSelectCount(EnterpriseAplicantCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(EnterpriseAplicantCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * enterpriseAplicantBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(EnterpriseAplicantCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<EnterpriseAplicantCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends EnterpriseAplicantCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param enterpriseAplicantList The list of enterpriseAplicant. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<EnterpriseOffer> pulloutEnterpriseOffer(List<EnterpriseAplicant> enterpriseAplicantList) {
        return helpPulloutInternally(enterpriseAplicantList, new InternalPulloutCallback<EnterpriseAplicant, EnterpriseOffer>() {
            public EnterpriseOffer getFr(EnterpriseAplicant e) { return e.getEnterpriseOffer(); }
            public boolean hasRf() { return true; }
            public void setRfLs(EnterpriseOffer e, List<EnterpriseAplicant> ls)
            { e.setEnterpriseAplicantList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'Student'.
     * @param enterpriseAplicantList The list of enterpriseAplicant. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Student> pulloutStudent(List<EnterpriseAplicant> enterpriseAplicantList) {
        return helpPulloutInternally(enterpriseAplicantList, new InternalPulloutCallback<EnterpriseAplicant, Student>() {
            public Student getFr(EnterpriseAplicant e) { return e.getStudent(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Student e, List<EnterpriseAplicant> ls)
            { e.setEnterpriseAplicantList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterpriseAplicant.setFoo...(value);
     * enterpriseAplicant.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.set...;</span>
     * enterpriseAplicantBhv.<span style="color: #FD4747">insert</span>(enterpriseAplicant);
     * ... = enterpriseAplicant.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterpriseAplicant The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(EnterpriseAplicant enterpriseAplicant) {
        doInsert(enterpriseAplicant, null);
    }

    protected void doInsert(EnterpriseAplicant enterpriseAplicant, InsertOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicant", enterpriseAplicant);
        prepareInsertOption(option);
        delegateInsert(enterpriseAplicant, option);
    }

    protected void prepareInsertOption(InsertOption<EnterpriseAplicantCB> option) {
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
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * enterpriseAplicant.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterpriseAplicant.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseAplicant.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseAplicantBhv.<span style="color: #FD4747">update</span>(enterpriseAplicant);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterpriseAplicant The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final EnterpriseAplicant enterpriseAplicant) {
        doUpdate(enterpriseAplicant, null);
    }

    protected void doUpdate(EnterpriseAplicant enterpriseAplicant, final UpdateOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicant", enterpriseAplicant);
        prepareUpdateOption(option);
        helpUpdateInternally(enterpriseAplicant, new InternalUpdateCallback<EnterpriseAplicant>() {
            public int callbackDelegateUpdate(EnterpriseAplicant entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<EnterpriseAplicantCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected EnterpriseAplicantCB createCBForVaryingUpdate() {
        EnterpriseAplicantCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected EnterpriseAplicantCB createCBForSpecifiedUpdate() {
        EnterpriseAplicantCB cb = newMyConditionBean();
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
     * @param enterpriseAplicant The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(EnterpriseAplicant enterpriseAplicant) {
        doInesrtOrUpdate(enterpriseAplicant, null, null);
    }

    protected void doInesrtOrUpdate(EnterpriseAplicant enterpriseAplicant, final InsertOption<EnterpriseAplicantCB> insertOption, final UpdateOption<EnterpriseAplicantCB> updateOption) {
        helpInsertOrUpdateInternally(enterpriseAplicant, new InternalInsertOrUpdateCallback<EnterpriseAplicant, EnterpriseAplicantCB>() {
            public void callbackInsert(EnterpriseAplicant entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(EnterpriseAplicant entity) { doUpdate(entity, updateOption); }
            public EnterpriseAplicantCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(EnterpriseAplicantCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<EnterpriseAplicantCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<EnterpriseAplicantCB>() : updateOption;
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
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * enterpriseAplicant.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseAplicant.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseAplicantBhv.<span style="color: #FD4747">delete</span>(enterpriseAplicant);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterpriseAplicant The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(EnterpriseAplicant enterpriseAplicant) {
        doDelete(enterpriseAplicant, null);
    }

    protected void doDelete(EnterpriseAplicant enterpriseAplicant, final DeleteOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicant", enterpriseAplicant);
        prepareDeleteOption(option);
        helpDeleteInternally(enterpriseAplicant, new InternalDeleteCallback<EnterpriseAplicant>() {
            public int callbackDelegateDelete(EnterpriseAplicant entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<EnterpriseAplicantCB> option) {
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
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<EnterpriseAplicant> enterpriseAplicantList) {
        return doBatchInsert(enterpriseAplicantList, null);
    }

    protected int[] doBatchInsert(List<EnterpriseAplicant> enterpriseAplicantList, InsertOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicantList", enterpriseAplicantList);
        prepareInsertOption(option);
        return delegateBatchInsert(enterpriseAplicantList, option);
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
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<EnterpriseAplicant> enterpriseAplicantList) {
        return doBatchUpdate(enterpriseAplicantList, null);
    }

    protected int[] doBatchUpdate(List<EnterpriseAplicant> enterpriseAplicantList, UpdateOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicantList", enterpriseAplicantList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(enterpriseAplicantList, option);
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
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<EnterpriseAplicant> enterpriseAplicantList, SpecifyQuery<EnterpriseAplicantCB> updateColumnSpec) {
        return doBatchUpdate(enterpriseAplicantList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<EnterpriseAplicant> enterpriseAplicantList) {
        return doBatchDelete(enterpriseAplicantList, null);
    }

    protected int[] doBatchDelete(List<EnterpriseAplicant> enterpriseAplicantList, DeleteOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicantList", enterpriseAplicantList);
        prepareDeleteOption(option);
        return delegateBatchDelete(enterpriseAplicantList, option);
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
     * enterpriseAplicantBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;EnterpriseAplicant, EnterpriseAplicantCB&gt;() {
     *     public ConditionBean setup(enterpriseAplicant entity, EnterpriseAplicantCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<EnterpriseAplicant, EnterpriseAplicantCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<EnterpriseAplicant, EnterpriseAplicantCB> setupper, InsertOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        EnterpriseAplicant entity = new EnterpriseAplicant();
        EnterpriseAplicantCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected EnterpriseAplicantCB createCBForQueryInsert() {
        EnterpriseAplicantCB cb = newMyConditionBean();
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
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setPK...(value);</span>
     * enterpriseAplicant.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setVersionNo(value);</span>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * enterpriseAplicantBhv.<span style="color: #FD4747">queryUpdate</span>(enterpriseAplicant, cb);
     * </pre>
     * @param enterpriseAplicant The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(EnterpriseAplicant enterpriseAplicant, EnterpriseAplicantCB cb) {
        return doQueryUpdate(enterpriseAplicant, cb, null);
    }

    protected int doQueryUpdate(EnterpriseAplicant enterpriseAplicant, EnterpriseAplicantCB cb, UpdateOption<EnterpriseAplicantCB> option) {
        assertObjectNotNull("enterpriseAplicant", enterpriseAplicant); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(enterpriseAplicant, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (EnterpriseAplicantCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (EnterpriseAplicantCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * enterpriseAplicantBhv.<span style="color: #FD4747">queryDelete</span>(enterpriseAplicant, cb);
     * </pre>
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EnterpriseAplicantCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(EnterpriseAplicantCB cb, DeleteOption<EnterpriseAplicantCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((EnterpriseAplicantCB)cb); }
        else { return varyingQueryDelete((EnterpriseAplicantCB)cb, downcast(option)); }
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
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterpriseAplicant.setFoo...(value);
     * enterpriseAplicant.setBar...(value);
     * InsertOption<EnterpriseAplicantCB> option = new InsertOption<EnterpriseAplicantCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * enterpriseAplicantBhv.<span style="color: #FD4747">varyingInsert</span>(enterpriseAplicant, option);
     * ... = enterpriseAplicant.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterpriseAplicant The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(EnterpriseAplicant enterpriseAplicant, InsertOption<EnterpriseAplicantCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(enterpriseAplicant, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * enterpriseAplicant.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterpriseAplicant.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseAplicant.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;EnterpriseAplicantCB&gt; option = new UpdateOption&lt;EnterpriseAplicantCB&gt;();
     *     option.self(new SpecifyQuery&lt;EnterpriseAplicantCB&gt;() {
     *         public void specify(EnterpriseAplicantCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     enterpriseAplicantBhv.<span style="color: #FD4747">varyingUpdate</span>(enterpriseAplicant, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param enterpriseAplicant The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(EnterpriseAplicant enterpriseAplicant, UpdateOption<EnterpriseAplicantCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(enterpriseAplicant, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param enterpriseAplicant The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(EnterpriseAplicant enterpriseAplicant, InsertOption<EnterpriseAplicantCB> insertOption, UpdateOption<EnterpriseAplicantCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(enterpriseAplicant, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param enterpriseAplicant The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(EnterpriseAplicant enterpriseAplicant, DeleteOption<EnterpriseAplicantCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(enterpriseAplicant, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<EnterpriseAplicant> enterpriseAplicantList, InsertOption<EnterpriseAplicantCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(enterpriseAplicantList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<EnterpriseAplicant> enterpriseAplicantList, UpdateOption<EnterpriseAplicantCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(enterpriseAplicantList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param enterpriseAplicantList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<EnterpriseAplicant> enterpriseAplicantList, DeleteOption<EnterpriseAplicantCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(enterpriseAplicantList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<EnterpriseAplicant, EnterpriseAplicantCB> setupper, InsertOption<EnterpriseAplicantCB> option) {
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
     * EnterpriseAplicant enterpriseAplicant = new EnterpriseAplicant();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setPK...(value);</span>
     * enterpriseAplicant.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterpriseAplicant.setVersionNo(value);</span>
     * EnterpriseAplicantCB cb = new EnterpriseAplicantCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;EnterpriseAplicantCB&gt; option = new UpdateOption&lt;EnterpriseAplicantCB&gt;();
     * option.self(new SpecifyQuery&lt;EnterpriseAplicantCB&gt;() {
     *     public void specify(EnterpriseAplicantCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * enterpriseAplicantBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(enterpriseAplicant, cb, option);
     * </pre>
     * @param enterpriseAplicant The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(EnterpriseAplicant enterpriseAplicant, EnterpriseAplicantCB cb, UpdateOption<EnterpriseAplicantCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(enterpriseAplicant, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of EnterpriseAplicant. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EnterpriseAplicantCB cb, DeleteOption<EnterpriseAplicantCB> option) {
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
    public OutsideSqlBasicExecutor<EnterpriseAplicantBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(EnterpriseAplicantCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(EnterpriseAplicantCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends EnterpriseAplicant> void delegateSelectCursor(EnterpriseAplicantCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends EnterpriseAplicant> List<ENTITY> delegateSelectList(EnterpriseAplicantCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(EnterpriseAplicant e, InsertOption<EnterpriseAplicantCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(EnterpriseAplicant e, UpdateOption<EnterpriseAplicantCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(EnterpriseAplicant e, UpdateOption<EnterpriseAplicantCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(EnterpriseAplicant e, DeleteOption<EnterpriseAplicantCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(EnterpriseAplicant e, DeleteOption<EnterpriseAplicantCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<EnterpriseAplicant> ls, InsertOption<EnterpriseAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<EnterpriseAplicant> ls, UpdateOption<EnterpriseAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<EnterpriseAplicant> ls, UpdateOption<EnterpriseAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<EnterpriseAplicant> ls, DeleteOption<EnterpriseAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<EnterpriseAplicant> ls, DeleteOption<EnterpriseAplicantCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(EnterpriseAplicant e, EnterpriseAplicantCB inCB, ConditionBean resCB, InsertOption<EnterpriseAplicantCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(EnterpriseAplicant e, EnterpriseAplicantCB cb, UpdateOption<EnterpriseAplicantCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(EnterpriseAplicantCB cb, DeleteOption<EnterpriseAplicantCB> op)
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
    protected EnterpriseAplicant downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, EnterpriseAplicant.class);
    }

    protected EnterpriseAplicantCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, EnterpriseAplicantCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<EnterpriseAplicant> downcast(List<? extends Entity> entityList) {
        return (List<EnterpriseAplicant>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<EnterpriseAplicantCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<EnterpriseAplicantCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<EnterpriseAplicantCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<EnterpriseAplicantCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<EnterpriseAplicantCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<EnterpriseAplicantCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<EnterpriseAplicant, EnterpriseAplicantCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<EnterpriseAplicant, EnterpriseAplicantCB>)option;
    }
}
