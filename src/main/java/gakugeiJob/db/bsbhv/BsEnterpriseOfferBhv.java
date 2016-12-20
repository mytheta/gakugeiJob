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
 * The behavior of enterprise_offer as TABLE. <br />
 * <pre>
 * [primary key]
 *     job_offer_id
 * 
 * [column]
 *     job_offer_id, enterprise_id, description, office_name, address, station, period, holiday, working_time, salary, qualification, welfare, one_thing, favo, registration_date
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     job_offer_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     enterprise
 * 
 * [referrer table]
 *     enterprise_aplicant, enterprise_favo
 * 
 * [foreign property]
 *     enterprise
 * 
 * [referrer property]
 *     enterpriseAplicantList, enterpriseFavoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEnterpriseOfferBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "enterprise_offer"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return EnterpriseOfferDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EnterpriseOfferDbm getMyDBMeta() { return EnterpriseOfferDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public EnterpriseOffer newMyEntity() { return new EnterpriseOffer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EnterpriseOfferCB newMyConditionBean() { return new EnterpriseOfferCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * int count = enterpriseOfferBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The selected count.
     */
    public int selectCount(EnterpriseOfferCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(EnterpriseOfferCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(EnterpriseOfferCB cb) { // called by selectPage(cb)
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
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * enterpriseOfferBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;EnterpriseOffer&gt;() {
     *     public void handle(EnterpriseOffer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @param entityRowHandler The handler of entity row of EnterpriseOffer. (NotNull)
     */
    public void selectCursor(EnterpriseOfferCB cb, EntityRowHandler<EnterpriseOffer> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> void doSelectCursor(EnterpriseOfferCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<EnterpriseOffer>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * EnterpriseOffer enterpriseOffer = enterpriseOfferBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (enterpriseOffer != null) {
     *     ... = enterpriseOffer.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseOffer selectEntity(EnterpriseOfferCB cb) {
        return doSelectEntity(cb, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> ENTITY doSelectEntity(final EnterpriseOfferCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, EnterpriseOfferCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseOfferCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * EnterpriseOffer enterpriseOffer = enterpriseOfferBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = enterpriseOffer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseOffer selectEntityWithDeletedCheck(EnterpriseOfferCB cb) {
        return doSelectEntityWithDeletedCheck(cb, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> ENTITY doSelectEntityWithDeletedCheck(final EnterpriseOfferCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, EnterpriseOfferCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseOfferCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param jobOfferId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseOffer selectByPKValue(Integer jobOfferId) {
        return doSelectByPKValue(jobOfferId, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> ENTITY doSelectByPKValue(Integer jobOfferId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(jobOfferId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param jobOfferId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EnterpriseOffer selectByPKValueWithDeletedCheck(Integer jobOfferId) {
        return doSelectByPKValueWithDeletedCheck(jobOfferId, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> ENTITY doSelectByPKValueWithDeletedCheck(Integer jobOfferId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(jobOfferId), entityType);
    }

    private EnterpriseOfferCB buildPKCB(Integer jobOfferId) {
        assertObjectNotNull("jobOfferId", jobOfferId);
        EnterpriseOfferCB cb = newMyConditionBean();
        cb.query().setJobOfferId_Equal(jobOfferId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;EnterpriseOffer&gt; enterpriseOfferList = enterpriseOfferBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (EnterpriseOffer enterpriseOffer : enterpriseOfferList) {
     *     ... = enterpriseOffer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<EnterpriseOffer> selectList(EnterpriseOfferCB cb) {
        return doSelectList(cb, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> ListResultBean<ENTITY> doSelectList(EnterpriseOfferCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, EnterpriseOfferCB>() {
            public List<ENTITY> callbackSelectList(EnterpriseOfferCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;EnterpriseOffer&gt; page = enterpriseOfferBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (EnterpriseOffer enterpriseOffer : page) {
     *     ... = enterpriseOffer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<EnterpriseOffer> selectPage(EnterpriseOfferCB cb) {
        return doSelectPage(cb, EnterpriseOffer.class);
    }

    protected <ENTITY extends EnterpriseOffer> PagingResultBean<ENTITY> doSelectPage(EnterpriseOfferCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, EnterpriseOfferCB>() {
            public int callbackSelectCount(EnterpriseOfferCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(EnterpriseOfferCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * enterpriseOfferBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(EnterpriseOfferCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<EnterpriseOfferCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends EnterpriseOfferCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param enterpriseOffer The entity of enterpriseOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseAplicantList(EnterpriseOffer enterpriseOffer, ConditionBeanSetupper<EnterpriseAplicantCB> conditionBeanSetupper) {
        xassLRArg(enterpriseOffer, conditionBeanSetupper);
        loadEnterpriseAplicantList(xnewLRLs(enterpriseOffer), conditionBeanSetupper);
    }
    /**
     * Load referrer of enterpriseAplicantList with the set-upper for condition-bean of referrer. <br />
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantList'.
     * <pre>
     * enterpriseOfferBhv.<span style="color: #FD4747">loadEnterpriseAplicantList</span>(enterpriseOfferList, new ConditionBeanSetupper&lt;EnterpriseAplicantCB&gt;() {
     *     public void setup(EnterpriseAplicantCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (EnterpriseOffer enterpriseOffer : enterpriseOfferList) {
     *     ... = enterpriseOffer.<span style="color: #FD4747">getEnterpriseAplicantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setJobOfferId_InScope(pkList);
     * cb.query().addOrderBy_JobOfferId_Asc();
     * </pre>
     * @param enterpriseOfferList The entity list of enterpriseOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseAplicantList(List<EnterpriseOffer> enterpriseOfferList, ConditionBeanSetupper<EnterpriseAplicantCB> conditionBeanSetupper) {
        xassLRArg(enterpriseOfferList, conditionBeanSetupper);
        loadEnterpriseAplicantList(enterpriseOfferList, new LoadReferrerOption<EnterpriseAplicantCB, EnterpriseAplicant>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param enterpriseOffer The entity of enterpriseOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseAplicantList(EnterpriseOffer enterpriseOffer, LoadReferrerOption<EnterpriseAplicantCB, EnterpriseAplicant> loadReferrerOption) {
        xassLRArg(enterpriseOffer, loadReferrerOption);
        loadEnterpriseAplicantList(xnewLRLs(enterpriseOffer), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param enterpriseOfferList The entity list of enterpriseOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseAplicantList(List<EnterpriseOffer> enterpriseOfferList, LoadReferrerOption<EnterpriseAplicantCB, EnterpriseAplicant> loadReferrerOption) {
        xassLRArg(enterpriseOfferList, loadReferrerOption);
        if (enterpriseOfferList.isEmpty()) { return; }
        final EnterpriseAplicantBhv referrerBhv = xgetBSFLR().select(EnterpriseAplicantBhv.class);
        helpLoadReferrerInternally(enterpriseOfferList, loadReferrerOption, new InternalLoadReferrerCallback<EnterpriseOffer, Integer, EnterpriseAplicantCB, EnterpriseAplicant>() {
            public Integer getPKVal(EnterpriseOffer e)
            { return e.getJobOfferId(); }
            public void setRfLs(EnterpriseOffer e, List<EnterpriseAplicant> ls)
            { e.setEnterpriseAplicantList(ls); }
            public EnterpriseAplicantCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(EnterpriseAplicantCB cb, List<Integer> ls)
            { cb.query().setJobOfferId_InScope(ls); }
            public void qyOdFKAsc(EnterpriseAplicantCB cb) { cb.query().addOrderBy_JobOfferId_Asc(); }
            public void spFKCol(EnterpriseAplicantCB cb) { cb.specify().columnJobOfferId(); }
            public List<EnterpriseAplicant> selRfLs(EnterpriseAplicantCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(EnterpriseAplicant e) { return e.getJobOfferId(); }
            public void setlcEt(EnterpriseAplicant re, EnterpriseOffer le)
            { re.setEnterpriseOffer(le); }
            public String getRfPrNm() { return "enterpriseAplicantList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param enterpriseOffer The entity of enterpriseOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseFavoList(EnterpriseOffer enterpriseOffer, ConditionBeanSetupper<EnterpriseFavoCB> conditionBeanSetupper) {
        xassLRArg(enterpriseOffer, conditionBeanSetupper);
        loadEnterpriseFavoList(xnewLRLs(enterpriseOffer), conditionBeanSetupper);
    }
    /**
     * Load referrer of enterpriseFavoList with the set-upper for condition-bean of referrer. <br />
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoList'.
     * <pre>
     * enterpriseOfferBhv.<span style="color: #FD4747">loadEnterpriseFavoList</span>(enterpriseOfferList, new ConditionBeanSetupper&lt;EnterpriseFavoCB&gt;() {
     *     public void setup(EnterpriseFavoCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (EnterpriseOffer enterpriseOffer : enterpriseOfferList) {
     *     ... = enterpriseOffer.<span style="color: #FD4747">getEnterpriseFavoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setJobOfferId_InScope(pkList);
     * cb.query().addOrderBy_JobOfferId_Asc();
     * </pre>
     * @param enterpriseOfferList The entity list of enterpriseOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadEnterpriseFavoList(List<EnterpriseOffer> enterpriseOfferList, ConditionBeanSetupper<EnterpriseFavoCB> conditionBeanSetupper) {
        xassLRArg(enterpriseOfferList, conditionBeanSetupper);
        loadEnterpriseFavoList(enterpriseOfferList, new LoadReferrerOption<EnterpriseFavoCB, EnterpriseFavo>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param enterpriseOffer The entity of enterpriseOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseFavoList(EnterpriseOffer enterpriseOffer, LoadReferrerOption<EnterpriseFavoCB, EnterpriseFavo> loadReferrerOption) {
        xassLRArg(enterpriseOffer, loadReferrerOption);
        loadEnterpriseFavoList(xnewLRLs(enterpriseOffer), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param enterpriseOfferList The entity list of enterpriseOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadEnterpriseFavoList(List<EnterpriseOffer> enterpriseOfferList, LoadReferrerOption<EnterpriseFavoCB, EnterpriseFavo> loadReferrerOption) {
        xassLRArg(enterpriseOfferList, loadReferrerOption);
        if (enterpriseOfferList.isEmpty()) { return; }
        final EnterpriseFavoBhv referrerBhv = xgetBSFLR().select(EnterpriseFavoBhv.class);
        helpLoadReferrerInternally(enterpriseOfferList, loadReferrerOption, new InternalLoadReferrerCallback<EnterpriseOffer, Integer, EnterpriseFavoCB, EnterpriseFavo>() {
            public Integer getPKVal(EnterpriseOffer e)
            { return e.getJobOfferId(); }
            public void setRfLs(EnterpriseOffer e, List<EnterpriseFavo> ls)
            { e.setEnterpriseFavoList(ls); }
            public EnterpriseFavoCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(EnterpriseFavoCB cb, List<Integer> ls)
            { cb.query().setJobOfferId_InScope(ls); }
            public void qyOdFKAsc(EnterpriseFavoCB cb) { cb.query().addOrderBy_JobOfferId_Asc(); }
            public void spFKCol(EnterpriseFavoCB cb) { cb.specify().columnJobOfferId(); }
            public List<EnterpriseFavo> selRfLs(EnterpriseFavoCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(EnterpriseFavo e) { return e.getJobOfferId(); }
            public void setlcEt(EnterpriseFavo re, EnterpriseOffer le)
            { re.setEnterpriseOffer(le); }
            public String getRfPrNm() { return "enterpriseFavoList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'Enterprise'.
     * @param enterpriseOfferList The list of enterpriseOffer. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Enterprise> pulloutEnterprise(List<EnterpriseOffer> enterpriseOfferList) {
        return helpPulloutInternally(enterpriseOfferList, new InternalPulloutCallback<EnterpriseOffer, Enterprise>() {
            public Enterprise getFr(EnterpriseOffer e) { return e.getEnterprise(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Enterprise e, List<EnterpriseOffer> ls)
            { e.setEnterpriseOfferList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterpriseOffer.setFoo...(value);
     * enterpriseOffer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.set...;</span>
     * enterpriseOfferBhv.<span style="color: #FD4747">insert</span>(enterpriseOffer);
     * ... = enterpriseOffer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterpriseOffer The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(EnterpriseOffer enterpriseOffer) {
        doInsert(enterpriseOffer, null);
    }

    protected void doInsert(EnterpriseOffer enterpriseOffer, InsertOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOffer", enterpriseOffer);
        prepareInsertOption(option);
        delegateInsert(enterpriseOffer, option);
    }

    protected void prepareInsertOption(InsertOption<EnterpriseOfferCB> option) {
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
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * enterpriseOffer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterpriseOffer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseOffer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseOfferBhv.<span style="color: #FD4747">update</span>(enterpriseOffer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterpriseOffer The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final EnterpriseOffer enterpriseOffer) {
        doUpdate(enterpriseOffer, null);
    }

    protected void doUpdate(EnterpriseOffer enterpriseOffer, final UpdateOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOffer", enterpriseOffer);
        prepareUpdateOption(option);
        helpUpdateInternally(enterpriseOffer, new InternalUpdateCallback<EnterpriseOffer>() {
            public int callbackDelegateUpdate(EnterpriseOffer entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<EnterpriseOfferCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected EnterpriseOfferCB createCBForVaryingUpdate() {
        EnterpriseOfferCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected EnterpriseOfferCB createCBForSpecifiedUpdate() {
        EnterpriseOfferCB cb = newMyConditionBean();
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
     * @param enterpriseOffer The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(EnterpriseOffer enterpriseOffer) {
        doInesrtOrUpdate(enterpriseOffer, null, null);
    }

    protected void doInesrtOrUpdate(EnterpriseOffer enterpriseOffer, final InsertOption<EnterpriseOfferCB> insertOption, final UpdateOption<EnterpriseOfferCB> updateOption) {
        helpInsertOrUpdateInternally(enterpriseOffer, new InternalInsertOrUpdateCallback<EnterpriseOffer, EnterpriseOfferCB>() {
            public void callbackInsert(EnterpriseOffer entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(EnterpriseOffer entity) { doUpdate(entity, updateOption); }
            public EnterpriseOfferCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(EnterpriseOfferCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<EnterpriseOfferCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<EnterpriseOfferCB>() : updateOption;
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
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * enterpriseOffer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseOffer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     enterpriseOfferBhv.<span style="color: #FD4747">delete</span>(enterpriseOffer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param enterpriseOffer The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(EnterpriseOffer enterpriseOffer) {
        doDelete(enterpriseOffer, null);
    }

    protected void doDelete(EnterpriseOffer enterpriseOffer, final DeleteOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOffer", enterpriseOffer);
        prepareDeleteOption(option);
        helpDeleteInternally(enterpriseOffer, new InternalDeleteCallback<EnterpriseOffer>() {
            public int callbackDelegateDelete(EnterpriseOffer entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<EnterpriseOfferCB> option) {
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
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<EnterpriseOffer> enterpriseOfferList) {
        return doBatchInsert(enterpriseOfferList, null);
    }

    protected int[] doBatchInsert(List<EnterpriseOffer> enterpriseOfferList, InsertOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOfferList", enterpriseOfferList);
        prepareInsertOption(option);
        return delegateBatchInsert(enterpriseOfferList, option);
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
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<EnterpriseOffer> enterpriseOfferList) {
        return doBatchUpdate(enterpriseOfferList, null);
    }

    protected int[] doBatchUpdate(List<EnterpriseOffer> enterpriseOfferList, UpdateOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOfferList", enterpriseOfferList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(enterpriseOfferList, option);
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
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<EnterpriseOffer> enterpriseOfferList, SpecifyQuery<EnterpriseOfferCB> updateColumnSpec) {
        return doBatchUpdate(enterpriseOfferList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<EnterpriseOffer> enterpriseOfferList) {
        return doBatchDelete(enterpriseOfferList, null);
    }

    protected int[] doBatchDelete(List<EnterpriseOffer> enterpriseOfferList, DeleteOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOfferList", enterpriseOfferList);
        prepareDeleteOption(option);
        return delegateBatchDelete(enterpriseOfferList, option);
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
     * enterpriseOfferBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;EnterpriseOffer, EnterpriseOfferCB&gt;() {
     *     public ConditionBean setup(enterpriseOffer entity, EnterpriseOfferCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<EnterpriseOffer, EnterpriseOfferCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<EnterpriseOffer, EnterpriseOfferCB> setupper, InsertOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        EnterpriseOffer entity = new EnterpriseOffer();
        EnterpriseOfferCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected EnterpriseOfferCB createCBForQueryInsert() {
        EnterpriseOfferCB cb = newMyConditionBean();
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
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setPK...(value);</span>
     * enterpriseOffer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setVersionNo(value);</span>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * enterpriseOfferBhv.<span style="color: #FD4747">queryUpdate</span>(enterpriseOffer, cb);
     * </pre>
     * @param enterpriseOffer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(EnterpriseOffer enterpriseOffer, EnterpriseOfferCB cb) {
        return doQueryUpdate(enterpriseOffer, cb, null);
    }

    protected int doQueryUpdate(EnterpriseOffer enterpriseOffer, EnterpriseOfferCB cb, UpdateOption<EnterpriseOfferCB> option) {
        assertObjectNotNull("enterpriseOffer", enterpriseOffer); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(enterpriseOffer, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (EnterpriseOfferCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (EnterpriseOfferCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * enterpriseOfferBhv.<span style="color: #FD4747">queryDelete</span>(enterpriseOffer, cb);
     * </pre>
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EnterpriseOfferCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(EnterpriseOfferCB cb, DeleteOption<EnterpriseOfferCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((EnterpriseOfferCB)cb); }
        else { return varyingQueryDelete((EnterpriseOfferCB)cb, downcast(option)); }
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
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * enterpriseOffer.setFoo...(value);
     * enterpriseOffer.setBar...(value);
     * InsertOption<EnterpriseOfferCB> option = new InsertOption<EnterpriseOfferCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * enterpriseOfferBhv.<span style="color: #FD4747">varyingInsert</span>(enterpriseOffer, option);
     * ... = enterpriseOffer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param enterpriseOffer The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(EnterpriseOffer enterpriseOffer, InsertOption<EnterpriseOfferCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(enterpriseOffer, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * enterpriseOffer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * enterpriseOffer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * enterpriseOffer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;EnterpriseOfferCB&gt; option = new UpdateOption&lt;EnterpriseOfferCB&gt;();
     *     option.self(new SpecifyQuery&lt;EnterpriseOfferCB&gt;() {
     *         public void specify(EnterpriseOfferCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     enterpriseOfferBhv.<span style="color: #FD4747">varyingUpdate</span>(enterpriseOffer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param enterpriseOffer The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(EnterpriseOffer enterpriseOffer, UpdateOption<EnterpriseOfferCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(enterpriseOffer, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param enterpriseOffer The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(EnterpriseOffer enterpriseOffer, InsertOption<EnterpriseOfferCB> insertOption, UpdateOption<EnterpriseOfferCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(enterpriseOffer, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param enterpriseOffer The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(EnterpriseOffer enterpriseOffer, DeleteOption<EnterpriseOfferCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(enterpriseOffer, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<EnterpriseOffer> enterpriseOfferList, InsertOption<EnterpriseOfferCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(enterpriseOfferList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<EnterpriseOffer> enterpriseOfferList, UpdateOption<EnterpriseOfferCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(enterpriseOfferList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param enterpriseOfferList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<EnterpriseOffer> enterpriseOfferList, DeleteOption<EnterpriseOfferCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(enterpriseOfferList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<EnterpriseOffer, EnterpriseOfferCB> setupper, InsertOption<EnterpriseOfferCB> option) {
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
     * EnterpriseOffer enterpriseOffer = new EnterpriseOffer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setPK...(value);</span>
     * enterpriseOffer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//enterpriseOffer.setVersionNo(value);</span>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;EnterpriseOfferCB&gt; option = new UpdateOption&lt;EnterpriseOfferCB&gt;();
     * option.self(new SpecifyQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void specify(EnterpriseOfferCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * enterpriseOfferBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(enterpriseOffer, cb, option);
     * </pre>
     * @param enterpriseOffer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(EnterpriseOffer enterpriseOffer, EnterpriseOfferCB cb, UpdateOption<EnterpriseOfferCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(enterpriseOffer, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of EnterpriseOffer. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EnterpriseOfferCB cb, DeleteOption<EnterpriseOfferCB> option) {
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
    public OutsideSqlBasicExecutor<EnterpriseOfferBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(EnterpriseOfferCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(EnterpriseOfferCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends EnterpriseOffer> void delegateSelectCursor(EnterpriseOfferCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends EnterpriseOffer> List<ENTITY> delegateSelectList(EnterpriseOfferCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(EnterpriseOffer e, InsertOption<EnterpriseOfferCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(EnterpriseOffer e, UpdateOption<EnterpriseOfferCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(EnterpriseOffer e, UpdateOption<EnterpriseOfferCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(EnterpriseOffer e, DeleteOption<EnterpriseOfferCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(EnterpriseOffer e, DeleteOption<EnterpriseOfferCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<EnterpriseOffer> ls, InsertOption<EnterpriseOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<EnterpriseOffer> ls, UpdateOption<EnterpriseOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<EnterpriseOffer> ls, UpdateOption<EnterpriseOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<EnterpriseOffer> ls, DeleteOption<EnterpriseOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<EnterpriseOffer> ls, DeleteOption<EnterpriseOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(EnterpriseOffer e, EnterpriseOfferCB inCB, ConditionBean resCB, InsertOption<EnterpriseOfferCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(EnterpriseOffer e, EnterpriseOfferCB cb, UpdateOption<EnterpriseOfferCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(EnterpriseOfferCB cb, DeleteOption<EnterpriseOfferCB> op)
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
    protected EnterpriseOffer downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, EnterpriseOffer.class);
    }

    protected EnterpriseOfferCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, EnterpriseOfferCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<EnterpriseOffer> downcast(List<? extends Entity> entityList) {
        return (List<EnterpriseOffer>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<EnterpriseOfferCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<EnterpriseOfferCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<EnterpriseOfferCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<EnterpriseOfferCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<EnterpriseOfferCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<EnterpriseOfferCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<EnterpriseOffer, EnterpriseOfferCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<EnterpriseOffer, EnterpriseOfferCB>)option;
    }
}
