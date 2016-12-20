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
 * The behavior of enterprise as TABLE. <br />
 * <pre>
 * [primary key]
 *     enterprise_id
 * 
 * [column]
 *     enterprise_id, user_id, name, founding_date, founder_name, address, capital, president_name, num_of_employees, business, phone_number, url, one_thing, mail_address
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     enterprise_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     login
 * 
 * [referrer table]
 *     enterprise_offer
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     enterpriseOfferList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEnterpriseBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "enterprise"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return EnterpriseDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EnterpriseDbm getMyDBMeta() { return EnterpriseDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Enterprise newMyEntity() { return new Enterprise(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EnterpriseCB newMyConditionBean() { return new EnterpriseCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * int count = enterpriseBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The selected count.
     */
    public int selectCount(EnterpriseCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(EnterpriseCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(EnterpriseCB cb) { // called by selectPage(cb)
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
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * enterpriseBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Enterprise&gt;() {
     *     public void handle(Enterprise entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @param entityRowHandler The handler of entity row of Enterprise. (NotNull)
     */
    public void selectCursor(EnterpriseCB cb, EntityRowHandler<Enterprise> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> void doSelectCursor(EnterpriseCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<Enterprise>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * Enterprise enterprise = enterpriseBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (enterprise != null) {
     *     ... = enterprise.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Enterprise selectEntity(EnterpriseCB cb) {
        return doSelectEntity(cb, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> ENTITY doSelectEntity(final EnterpriseCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, EnterpriseCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * Enterprise enterprise = enterpriseBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = enterprise.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Enterprise selectEntityWithDeletedCheck(EnterpriseCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> ENTITY doSelectEntityWithDeletedCheck(final EnterpriseCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, EnterpriseCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param enterpriseId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Enterprise selectByPKValue(Integer enterpriseId) {
        return doSelectByPKValue(enterpriseId, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> ENTITY doSelectByPKValue(Integer enterpriseId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(enterpriseId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param enterpriseId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Enterprise selectByPKValueWithDeletedCheck(Integer enterpriseId) {
        return doSelectByPKValueWithDeletedCheck(enterpriseId, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> ENTITY doSelectByPKValueWithDeletedCheck(Integer enterpriseId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(enterpriseId), entityType);
    }

    private EnterpriseCB buildPKCB(Integer enterpriseId) {
        assertObjectNotNull("enterpriseId", enterpriseId);
        EnterpriseCB cb = newMyConditionBean();
        cb.query().setEnterpriseId_Equal(enterpriseId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Enterprise&gt; enterpriseList = enterpriseBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Enterprise enterprise : enterpriseList) {
     *     ... = enterprise.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Enterprise> selectList(EnterpriseCB cb) {
        return doSelectList(cb, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> ListResultBean<ENTITY> doSelectList(EnterpriseCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, EnterpriseCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Enterprise&gt; page = enterpriseBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Enterprise enterprise : page) {
     *     ... = enterprise.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Enterprise> selectPage(EnterpriseCB cb) {
        return doSelectPage(cb, Enterprise.class);
    }

    protected <ENTITY extends Enterprise> PagingResultBean<ENTITY> doSelectPage(EnterpriseCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, EnterpriseCB>() {
            public int callbackSelectCount(EnterpriseCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(EnterpriseCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * enterpriseBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(EnterpriseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<EnterpriseCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends EnterpriseCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param enterprise The entity of enterprise. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseOfferList(Enterprise enterprise, ConditionBeanSetupper<EnterpriseOfferCB> conditionBeanSetupper) {
        xassLRArg(enterprise, conditionBeanSetupper);
        loadEnterpriseOfferList(xnewLRLs(enterprise), conditionBeanSetupper);
    }
    /**
     * Load referrer of enterpriseOfferList with the set-upper for condition-bean of referrer. <br />
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferList'.
     * <pre>
     * enterpriseBhv.<span style="color: #FD4747">loadEnterpriseOfferList</span>(enterpriseList, new ConditionBeanSetupper&lt;EnterpriseOfferCB&gt;() {
     *     public void setup(EnterpriseOfferCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Enterprise enterprise : enterpriseList) {
     *     ... = enterprise.<span style="color: #FD4747">getEnterpriseOfferList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setEnterpriseId_InScope(pkList);
     * cb.query().addOrderBy_EnterpriseId_Asc();
     * </pre>
     * @param enterpriseList The entity list of enterprise. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseOfferList(List<Enterprise> enterpriseList, ConditionBeanSetupper<EnterpriseOfferCB> conditionBeanSetupper) {
        xassLRArg(enterpriseList, conditionBeanSetupper);
        loadEnterpriseOfferList(enterpriseList, new LoadReferrerOption<EnterpriseOfferCB, EnterpriseOffer>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param enterprise The entity of enterprise. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseOfferList(Enterprise enterprise, LoadReferrerOption<EnterpriseOfferCB, EnterpriseOffer> loadReferrerOption) {
        xassLRArg(enterprise, loadReferrerOption);
        loadEnterpriseOfferList(xnewLRLs(enterprise), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param enterpriseList The entity list of enterprise. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseOfferList(List<Enterprise> enterpriseList, LoadReferrerOption<EnterpriseOfferCB, EnterpriseOffer> loadReferrerOption) {
        xassLRArg(enterpriseList, loadReferrerOption);
        if (enterpriseList.isEmpty()) { return; }
        final EnterpriseOfferBhv referrerBhv = xgetBSFLR().select(EnterpriseOfferBhv.class);
        helpLoadReferrerInternally(enterpriseList, loadReferrerOption, new InternalLoadReferrerCallback<Enterprise, Integer, EnterpriseOfferCB, EnterpriseOffer>() {
            public Integer getPKVal(Enterprise e)
            { return e.getEnterpriseId(); }
            public void setRfLs(Enterprise e, List<EnterpriseOffer> ls)
            { e.setEnterpriseOfferList(ls); }
            public EnterpriseOfferCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(EnterpriseOfferCB cb, List<Integer> ls)
            { cb.query().setEnterpriseId_InScope(ls); }
            public void qyOdFKAsc(EnterpriseOfferCB cb) { cb.query().addOrderBy_EnterpriseId_Asc(); }
            public void spFKCol(EnterpriseOfferCB cb) { cb.specify().columnEnterpriseId(); }
            public List<EnterpriseOffer> selRfLs(EnterpriseOfferCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(EnterpriseOffer e) { return e.getEnterpriseId(); }
            public void setlcEt(EnterpriseOffer re, Enterprise le)
            { re.setEnterprise(le); }
            public String getRfPrNm() { return "enterpriseOfferList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'Login'.
     * @param enterpriseList The list of enterprise. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Login> pulloutLogin(List<Enterprise> enterpriseList) {
        return helpPulloutInternally(enterpriseList, new InternalPulloutCallback<Enterprise, Login>() {
            public Login getFr(Enterprise e) { return e.getLogin(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Login e, List<Enterprise> ls)
            { e.setEnterpriseList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * Enterprise enterprise = new Enterprise();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterprise.setFoo...(value);
     * enterprise.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterprise.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterprise.set...;</span>
     * enterpriseBhv.<span style="color: #FD4747">insert</span>(enterprise);
     * ... = enterprise.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterprise The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(Enterprise enterprise) {
        doInsert(enterprise, null);
    }

    protected void doInsert(Enterprise enterprise, InsertOption<EnterpriseCB> option) {
        assertObjectNotNull("enterprise", enterprise);
        prepareInsertOption(option);
        delegateInsert(enterprise, option);
    }

    protected void prepareInsertOption(InsertOption<EnterpriseCB> option) {
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
     * Enterprise enterprise = new Enterprise();
     * enterprise.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterprise.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterprise.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterprise.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterprise.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseBhv.<span style="color: #FD4747">update</span>(enterprise);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterprise The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final Enterprise enterprise) {
        doUpdate(enterprise, null);
    }

    protected void doUpdate(Enterprise enterprise, final UpdateOption<EnterpriseCB> option) {
        assertObjectNotNull("enterprise", enterprise);
        prepareUpdateOption(option);
        helpUpdateInternally(enterprise, new InternalUpdateCallback<Enterprise>() {
            public int callbackDelegateUpdate(Enterprise entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<EnterpriseCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected EnterpriseCB createCBForVaryingUpdate() {
        EnterpriseCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected EnterpriseCB createCBForSpecifiedUpdate() {
        EnterpriseCB cb = newMyConditionBean();
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
     * @param enterprise The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(Enterprise enterprise) {
        doInesrtOrUpdate(enterprise, null, null);
    }

    protected void doInesrtOrUpdate(Enterprise enterprise, final InsertOption<EnterpriseCB> insertOption, final UpdateOption<EnterpriseCB> updateOption) {
        helpInsertOrUpdateInternally(enterprise, new InternalInsertOrUpdateCallback<Enterprise, EnterpriseCB>() {
            public void callbackInsert(Enterprise entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(Enterprise entity) { doUpdate(entity, updateOption); }
            public EnterpriseCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(EnterpriseCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<EnterpriseCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<EnterpriseCB>() : updateOption;
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
     * Enterprise enterprise = new Enterprise();
     * enterprise.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterprise.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseBhv.<span style="color: #FD4747">delete</span>(enterprise);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterprise The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Enterprise enterprise) {
        doDelete(enterprise, null);
    }

    protected void doDelete(Enterprise enterprise, final DeleteOption<EnterpriseCB> option) {
        assertObjectNotNull("enterprise", enterprise);
        prepareDeleteOption(option);
        helpDeleteInternally(enterprise, new InternalDeleteCallback<Enterprise>() {
            public int callbackDelegateDelete(Enterprise entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<EnterpriseCB> option) {
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
     * @param enterpriseList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<Enterprise> enterpriseList) {
        return doBatchInsert(enterpriseList, null);
    }

    protected int[] doBatchInsert(List<Enterprise> enterpriseList, InsertOption<EnterpriseCB> option) {
        assertObjectNotNull("enterpriseList", enterpriseList);
        prepareInsertOption(option);
        return delegateBatchInsert(enterpriseList, option);
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
     * @param enterpriseList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Enterprise> enterpriseList) {
        return doBatchUpdate(enterpriseList, null);
    }

    protected int[] doBatchUpdate(List<Enterprise> enterpriseList, UpdateOption<EnterpriseCB> option) {
        assertObjectNotNull("enterpriseList", enterpriseList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(enterpriseList, option);
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
     * @param enterpriseList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Enterprise> enterpriseList, SpecifyQuery<EnterpriseCB> updateColumnSpec) {
        return doBatchUpdate(enterpriseList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param enterpriseList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<Enterprise> enterpriseList) {
        return doBatchDelete(enterpriseList, null);
    }

    protected int[] doBatchDelete(List<Enterprise> enterpriseList, DeleteOption<EnterpriseCB> option) {
        assertObjectNotNull("enterpriseList", enterpriseList);
        prepareDeleteOption(option);
        return delegateBatchDelete(enterpriseList, option);
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
     * enterpriseBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Enterprise, EnterpriseCB&gt;() {
     *     public ConditionBean setup(enterprise entity, EnterpriseCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Enterprise, EnterpriseCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Enterprise, EnterpriseCB> setupper, InsertOption<EnterpriseCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        Enterprise entity = new Enterprise();
        EnterpriseCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected EnterpriseCB createCBForQueryInsert() {
        EnterpriseCB cb = newMyConditionBean();
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
     * Enterprise enterprise = new Enterprise();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterprise.setPK...(value);</span>
     * enterprise.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterprise.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterprise.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterprise.setVersionNo(value);</span>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * enterpriseBhv.<span style="color: #FD4747">queryUpdate</span>(enterprise, cb);
     * </pre>
     * @param enterprise The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Enterprise enterprise, EnterpriseCB cb) {
        return doQueryUpdate(enterprise, cb, null);
    }

    protected int doQueryUpdate(Enterprise enterprise, EnterpriseCB cb, UpdateOption<EnterpriseCB> option) {
        assertObjectNotNull("enterprise", enterprise); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(enterprise, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (EnterpriseCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (EnterpriseCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * enterpriseBhv.<span style="color: #FD4747">queryDelete</span>(enterprise, cb);
     * </pre>
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EnterpriseCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(EnterpriseCB cb, DeleteOption<EnterpriseCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((EnterpriseCB)cb); }
        else { return varyingQueryDelete((EnterpriseCB)cb, downcast(option)); }
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
     * Enterprise enterprise = new Enterprise();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterprise.setFoo...(value);
     * enterprise.setBar...(value);
     * InsertOption<EnterpriseCB> option = new InsertOption<EnterpriseCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * enterpriseBhv.<span style="color: #FD4747">varyingInsert</span>(enterprise, option);
     * ... = enterprise.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterprise The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(Enterprise enterprise, InsertOption<EnterpriseCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(enterprise, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Enterprise enterprise = new Enterprise();
     * enterprise.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterprise.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterprise.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;EnterpriseCB&gt; option = new UpdateOption&lt;EnterpriseCB&gt;();
     *     option.self(new SpecifyQuery&lt;EnterpriseCB&gt;() {
     *         public void specify(EnterpriseCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     enterpriseBhv.<span style="color: #FD4747">varyingUpdate</span>(enterprise, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param enterprise The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(Enterprise enterprise, UpdateOption<EnterpriseCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(enterprise, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param enterprise The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(Enterprise enterprise, InsertOption<EnterpriseCB> insertOption, UpdateOption<EnterpriseCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(enterprise, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param enterprise The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Enterprise enterprise, DeleteOption<EnterpriseCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(enterprise, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param enterpriseList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<Enterprise> enterpriseList, InsertOption<EnterpriseCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(enterpriseList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param enterpriseList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<Enterprise> enterpriseList, UpdateOption<EnterpriseCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(enterpriseList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param enterpriseList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<Enterprise> enterpriseList, DeleteOption<EnterpriseCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(enterpriseList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Enterprise, EnterpriseCB> setupper, InsertOption<EnterpriseCB> option) {
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
     * Enterprise enterprise = new Enterprise();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterprise.setPK...(value);</span>
     * enterprise.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterprise.setVersionNo(value);</span>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;EnterpriseCB&gt; option = new UpdateOption&lt;EnterpriseCB&gt;();
     * option.self(new SpecifyQuery&lt;EnterpriseCB&gt;() {
     *     public void specify(EnterpriseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * enterpriseBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(enterprise, cb, option);
     * </pre>
     * @param enterprise The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Enterprise enterprise, EnterpriseCB cb, UpdateOption<EnterpriseCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(enterprise, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Enterprise. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EnterpriseCB cb, DeleteOption<EnterpriseCB> option) {
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
    public OutsideSqlBasicExecutor<EnterpriseBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(EnterpriseCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(EnterpriseCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Enterprise> void delegateSelectCursor(EnterpriseCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends Enterprise> List<ENTITY> delegateSelectList(EnterpriseCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Enterprise e, InsertOption<EnterpriseCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(Enterprise e, UpdateOption<EnterpriseCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(Enterprise e, UpdateOption<EnterpriseCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(Enterprise e, DeleteOption<EnterpriseCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(Enterprise e, DeleteOption<EnterpriseCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<Enterprise> ls, InsertOption<EnterpriseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Enterprise> ls, UpdateOption<EnterpriseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Enterprise> ls, UpdateOption<EnterpriseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Enterprise> ls, DeleteOption<EnterpriseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Enterprise> ls, DeleteOption<EnterpriseCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Enterprise e, EnterpriseCB inCB, ConditionBean resCB, InsertOption<EnterpriseCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Enterprise e, EnterpriseCB cb, UpdateOption<EnterpriseCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(EnterpriseCB cb, DeleteOption<EnterpriseCB> op)
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
    protected Enterprise downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, Enterprise.class);
    }

    protected EnterpriseCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, EnterpriseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Enterprise> downcast(List<? extends Entity> entityList) {
        return (List<Enterprise>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<EnterpriseCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<EnterpriseCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<EnterpriseCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<EnterpriseCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<EnterpriseCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<EnterpriseCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Enterprise, EnterpriseCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<Enterprise, EnterpriseCB>)option;
    }
}
