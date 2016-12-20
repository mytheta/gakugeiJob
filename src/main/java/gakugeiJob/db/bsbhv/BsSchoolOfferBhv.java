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
 * The behavior of school_offer as TABLE. <br />
 * <pre>
 * [primary key]
 *     school_offer_id
 * 
 * [column]
 *     school_offer_id, school_id, description, salary, work_schedule, period, address, station, qualification, welfare, one_thing, favo, registration_date
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     school_offer_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     school
 * 
 * [referrer table]
 *     school_aplicant, school_favo
 * 
 * [foreign property]
 *     school
 * 
 * [referrer property]
 *     schoolAplicantList, schoolFavoList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSchoolOfferBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "school_offer"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SchoolOfferDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SchoolOfferDbm getMyDBMeta() { return SchoolOfferDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SchoolOffer newMyEntity() { return new SchoolOffer(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SchoolOfferCB newMyConditionBean() { return new SchoolOfferCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * int count = schoolOfferBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The selected count.
     */
    public int selectCount(SchoolOfferCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SchoolOfferCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SchoolOfferCB cb) { // called by selectPage(cb)
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
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * schoolOfferBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SchoolOffer&gt;() {
     *     public void handle(SchoolOffer entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @param entityRowHandler The handler of entity row of SchoolOffer. (NotNull)
     */
    public void selectCursor(SchoolOfferCB cb, EntityRowHandler<SchoolOffer> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> void doSelectCursor(SchoolOfferCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<SchoolOffer>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * SchoolOffer schoolOffer = schoolOfferBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (schoolOffer != null) {
     *     ... = schoolOffer.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolOffer selectEntity(SchoolOfferCB cb) {
        return doSelectEntity(cb, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> ENTITY doSelectEntity(final SchoolOfferCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, SchoolOfferCB>() {
            public List<ENTITY> callbackSelectList(SchoolOfferCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * SchoolOffer schoolOffer = schoolOfferBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = schoolOffer.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolOffer selectEntityWithDeletedCheck(SchoolOfferCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> ENTITY doSelectEntityWithDeletedCheck(final SchoolOfferCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SchoolOfferCB>() {
            public List<ENTITY> callbackSelectList(SchoolOfferCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param schoolOfferId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolOffer selectByPKValue(Integer schoolOfferId) {
        return doSelectByPKValue(schoolOfferId, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> ENTITY doSelectByPKValue(Integer schoolOfferId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(schoolOfferId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param schoolOfferId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SchoolOffer selectByPKValueWithDeletedCheck(Integer schoolOfferId) {
        return doSelectByPKValueWithDeletedCheck(schoolOfferId, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> ENTITY doSelectByPKValueWithDeletedCheck(Integer schoolOfferId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(schoolOfferId), entityType);
    }

    private SchoolOfferCB buildPKCB(Integer schoolOfferId) {
        assertObjectNotNull("schoolOfferId", schoolOfferId);
        SchoolOfferCB cb = newMyConditionBean();
        cb.query().setSchoolOfferId_Equal(schoolOfferId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SchoolOffer&gt; schoolOfferList = schoolOfferBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (SchoolOffer schoolOffer : schoolOfferList) {
     *     ... = schoolOffer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SchoolOffer> selectList(SchoolOfferCB cb) {
        return doSelectList(cb, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> ListResultBean<ENTITY> doSelectList(SchoolOfferCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, SchoolOfferCB>() {
            public List<ENTITY> callbackSelectList(SchoolOfferCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SchoolOffer&gt; page = schoolOfferBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SchoolOffer schoolOffer : page) {
     *     ... = schoolOffer.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SchoolOffer> selectPage(SchoolOfferCB cb) {
        return doSelectPage(cb, SchoolOffer.class);
    }

    protected <ENTITY extends SchoolOffer> PagingResultBean<ENTITY> doSelectPage(SchoolOfferCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, SchoolOfferCB>() {
            public int callbackSelectCount(SchoolOfferCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SchoolOfferCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * schoolOfferBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SchoolOfferCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<SchoolOfferCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SchoolOfferCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param schoolOffer The entity of schoolOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolAplicantList(SchoolOffer schoolOffer, ConditionBeanSetupper<SchoolAplicantCB> conditionBeanSetupper) {
        xassLRArg(schoolOffer, conditionBeanSetupper);
        loadSchoolAplicantList(xnewLRLs(schoolOffer), conditionBeanSetupper);
    }
    /**
     * Load referrer of schoolAplicantList with the set-upper for condition-bean of referrer. <br />
     * school_aplicant by your school_offer_id, named 'schoolAplicantList'.
     * <pre>
     * schoolOfferBhv.<span style="color: #FD4747">loadSchoolAplicantList</span>(schoolOfferList, new ConditionBeanSetupper&lt;SchoolAplicantCB&gt;() {
     *     public void setup(SchoolAplicantCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (SchoolOffer schoolOffer : schoolOfferList) {
     *     ... = schoolOffer.<span style="color: #FD4747">getSchoolAplicantList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setSchoolOfferId_InScope(pkList);
     * cb.query().addOrderBy_SchoolOfferId_Asc();
     * </pre>
     * @param schoolOfferList The entity list of schoolOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolAplicantList(List<SchoolOffer> schoolOfferList, ConditionBeanSetupper<SchoolAplicantCB> conditionBeanSetupper) {
        xassLRArg(schoolOfferList, conditionBeanSetupper);
        loadSchoolAplicantList(schoolOfferList, new LoadReferrerOption<SchoolAplicantCB, SchoolAplicant>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param schoolOffer The entity of schoolOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolAplicantList(SchoolOffer schoolOffer, LoadReferrerOption<SchoolAplicantCB, SchoolAplicant> loadReferrerOption) {
        xassLRArg(schoolOffer, loadReferrerOption);
        loadSchoolAplicantList(xnewLRLs(schoolOffer), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param schoolOfferList The entity list of schoolOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolAplicantList(List<SchoolOffer> schoolOfferList, LoadReferrerOption<SchoolAplicantCB, SchoolAplicant> loadReferrerOption) {
        xassLRArg(schoolOfferList, loadReferrerOption);
        if (schoolOfferList.isEmpty()) { return; }
        final SchoolAplicantBhv referrerBhv = xgetBSFLR().select(SchoolAplicantBhv.class);
        helpLoadReferrerInternally(schoolOfferList, loadReferrerOption, new InternalLoadReferrerCallback<SchoolOffer, Integer, SchoolAplicantCB, SchoolAplicant>() {
            public Integer getPKVal(SchoolOffer e)
            { return e.getSchoolOfferId(); }
            public void setRfLs(SchoolOffer e, List<SchoolAplicant> ls)
            { e.setSchoolAplicantList(ls); }
            public SchoolAplicantCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SchoolAplicantCB cb, List<Integer> ls)
            { cb.query().setSchoolOfferId_InScope(ls); }
            public void qyOdFKAsc(SchoolAplicantCB cb) { cb.query().addOrderBy_SchoolOfferId_Asc(); }
            public void spFKCol(SchoolAplicantCB cb) { cb.specify().columnSchoolOfferId(); }
            public List<SchoolAplicant> selRfLs(SchoolAplicantCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(SchoolAplicant e) { return e.getSchoolOfferId(); }
            public void setlcEt(SchoolAplicant re, SchoolOffer le)
            { re.setSchoolOffer(le); }
            public String getRfPrNm() { return "schoolAplicantList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param schoolOffer The entity of schoolOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolFavoList(SchoolOffer schoolOffer, ConditionBeanSetupper<SchoolFavoCB> conditionBeanSetupper) {
        xassLRArg(schoolOffer, conditionBeanSetupper);
        loadSchoolFavoList(xnewLRLs(schoolOffer), conditionBeanSetupper);
    }
    /**
     * Load referrer of schoolFavoList with the set-upper for condition-bean of referrer. <br />
     * school_favo by your school_offer_id, named 'schoolFavoList'.
     * <pre>
     * schoolOfferBhv.<span style="color: #FD4747">loadSchoolFavoList</span>(schoolOfferList, new ConditionBeanSetupper&lt;SchoolFavoCB&gt;() {
     *     public void setup(SchoolFavoCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (SchoolOffer schoolOffer : schoolOfferList) {
     *     ... = schoolOffer.<span style="color: #FD4747">getSchoolFavoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setSchoolOfferId_InScope(pkList);
     * cb.query().addOrderBy_SchoolOfferId_Asc();
     * </pre>
     * @param schoolOfferList The entity list of schoolOffer. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadSchoolFavoList(List<SchoolOffer> schoolOfferList, ConditionBeanSetupper<SchoolFavoCB> conditionBeanSetupper) {
        xassLRArg(schoolOfferList, conditionBeanSetupper);
        loadSchoolFavoList(schoolOfferList, new LoadReferrerOption<SchoolFavoCB, SchoolFavo>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param schoolOffer The entity of schoolOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolFavoList(SchoolOffer schoolOffer, LoadReferrerOption<SchoolFavoCB, SchoolFavo> loadReferrerOption) {
        xassLRArg(schoolOffer, loadReferrerOption);
        loadSchoolFavoList(xnewLRLs(schoolOffer), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param schoolOfferList The entity list of schoolOffer. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadSchoolFavoList(List<SchoolOffer> schoolOfferList, LoadReferrerOption<SchoolFavoCB, SchoolFavo> loadReferrerOption) {
        xassLRArg(schoolOfferList, loadReferrerOption);
        if (schoolOfferList.isEmpty()) { return; }
        final SchoolFavoBhv referrerBhv = xgetBSFLR().select(SchoolFavoBhv.class);
        helpLoadReferrerInternally(schoolOfferList, loadReferrerOption, new InternalLoadReferrerCallback<SchoolOffer, Integer, SchoolFavoCB, SchoolFavo>() {
            public Integer getPKVal(SchoolOffer e)
            { return e.getSchoolOfferId(); }
            public void setRfLs(SchoolOffer e, List<SchoolFavo> ls)
            { e.setSchoolFavoList(ls); }
            public SchoolFavoCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(SchoolFavoCB cb, List<Integer> ls)
            { cb.query().setSchoolOfferId_InScope(ls); }
            public void qyOdFKAsc(SchoolFavoCB cb) { cb.query().addOrderBy_SchoolOfferId_Asc(); }
            public void spFKCol(SchoolFavoCB cb) { cb.specify().columnSchoolOfferId(); }
            public List<SchoolFavo> selRfLs(SchoolFavoCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(SchoolFavo e) { return e.getSchoolOfferId(); }
            public void setlcEt(SchoolFavo re, SchoolOffer le)
            { re.setSchoolOffer(le); }
            public String getRfPrNm() { return "schoolFavoList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'School'.
     * @param schoolOfferList The list of schoolOffer. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<School> pulloutSchool(List<SchoolOffer> schoolOfferList) {
        return helpPulloutInternally(schoolOfferList, new InternalPulloutCallback<SchoolOffer, School>() {
            public School getFr(SchoolOffer e) { return e.getSchool(); }
            public boolean hasRf() { return true; }
            public void setRfLs(School e, List<SchoolOffer> ls)
            { e.setSchoolOfferList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * SchoolOffer schoolOffer = new SchoolOffer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * schoolOffer.setFoo...(value);
     * schoolOffer.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolOffer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolOffer.set...;</span>
     * schoolOfferBhv.<span style="color: #FD4747">insert</span>(schoolOffer);
     * ... = schoolOffer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param schoolOffer The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(SchoolOffer schoolOffer) {
        doInsert(schoolOffer, null);
    }

    protected void doInsert(SchoolOffer schoolOffer, InsertOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOffer", schoolOffer);
        prepareInsertOption(option);
        delegateInsert(schoolOffer, option);
    }

    protected void prepareInsertOption(InsertOption<SchoolOfferCB> option) {
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
     * SchoolOffer schoolOffer = new SchoolOffer();
     * schoolOffer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * schoolOffer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolOffer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolOffer.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolOffer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolOfferBhv.<span style="color: #FD4747">update</span>(schoolOffer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param schoolOffer The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final SchoolOffer schoolOffer) {
        doUpdate(schoolOffer, null);
    }

    protected void doUpdate(SchoolOffer schoolOffer, final UpdateOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOffer", schoolOffer);
        prepareUpdateOption(option);
        helpUpdateInternally(schoolOffer, new InternalUpdateCallback<SchoolOffer>() {
            public int callbackDelegateUpdate(SchoolOffer entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<SchoolOfferCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SchoolOfferCB createCBForVaryingUpdate() {
        SchoolOfferCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SchoolOfferCB createCBForSpecifiedUpdate() {
        SchoolOfferCB cb = newMyConditionBean();
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
     * @param schoolOffer The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(SchoolOffer schoolOffer) {
        doInesrtOrUpdate(schoolOffer, null, null);
    }

    protected void doInesrtOrUpdate(SchoolOffer schoolOffer, final InsertOption<SchoolOfferCB> insertOption, final UpdateOption<SchoolOfferCB> updateOption) {
        helpInsertOrUpdateInternally(schoolOffer, new InternalInsertOrUpdateCallback<SchoolOffer, SchoolOfferCB>() {
            public void callbackInsert(SchoolOffer entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(SchoolOffer entity) { doUpdate(entity, updateOption); }
            public SchoolOfferCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SchoolOfferCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<SchoolOfferCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<SchoolOfferCB>() : updateOption;
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
     * SchoolOffer schoolOffer = new SchoolOffer();
     * schoolOffer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolOffer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     schoolOfferBhv.<span style="color: #FD4747">delete</span>(schoolOffer);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param schoolOffer The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SchoolOffer schoolOffer) {
        doDelete(schoolOffer, null);
    }

    protected void doDelete(SchoolOffer schoolOffer, final DeleteOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOffer", schoolOffer);
        prepareDeleteOption(option);
        helpDeleteInternally(schoolOffer, new InternalDeleteCallback<SchoolOffer>() {
            public int callbackDelegateDelete(SchoolOffer entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<SchoolOfferCB> option) {
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
     * @param schoolOfferList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<SchoolOffer> schoolOfferList) {
        return doBatchInsert(schoolOfferList, null);
    }

    protected int[] doBatchInsert(List<SchoolOffer> schoolOfferList, InsertOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOfferList", schoolOfferList);
        prepareInsertOption(option);
        return delegateBatchInsert(schoolOfferList, option);
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
     * @param schoolOfferList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<SchoolOffer> schoolOfferList) {
        return doBatchUpdate(schoolOfferList, null);
    }

    protected int[] doBatchUpdate(List<SchoolOffer> schoolOfferList, UpdateOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOfferList", schoolOfferList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(schoolOfferList, option);
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
     * @param schoolOfferList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<SchoolOffer> schoolOfferList, SpecifyQuery<SchoolOfferCB> updateColumnSpec) {
        return doBatchUpdate(schoolOfferList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param schoolOfferList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<SchoolOffer> schoolOfferList) {
        return doBatchDelete(schoolOfferList, null);
    }

    protected int[] doBatchDelete(List<SchoolOffer> schoolOfferList, DeleteOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOfferList", schoolOfferList);
        prepareDeleteOption(option);
        return delegateBatchDelete(schoolOfferList, option);
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
     * schoolOfferBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;SchoolOffer, SchoolOfferCB&gt;() {
     *     public ConditionBean setup(schoolOffer entity, SchoolOfferCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<SchoolOffer, SchoolOfferCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SchoolOffer, SchoolOfferCB> setupper, InsertOption<SchoolOfferCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        SchoolOffer entity = new SchoolOffer();
        SchoolOfferCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected SchoolOfferCB createCBForQueryInsert() {
        SchoolOfferCB cb = newMyConditionBean();
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
     * SchoolOffer schoolOffer = new SchoolOffer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//schoolOffer.setPK...(value);</span>
     * schoolOffer.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//schoolOffer.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//schoolOffer.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//schoolOffer.setVersionNo(value);</span>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * schoolOfferBhv.<span style="color: #FD4747">queryUpdate</span>(schoolOffer, cb);
     * </pre>
     * @param schoolOffer The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SchoolOffer schoolOffer, SchoolOfferCB cb) {
        return doQueryUpdate(schoolOffer, cb, null);
    }

    protected int doQueryUpdate(SchoolOffer schoolOffer, SchoolOfferCB cb, UpdateOption<SchoolOfferCB> option) {
        assertObjectNotNull("schoolOffer", schoolOffer); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(schoolOffer, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (SchoolOfferCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (SchoolOfferCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * schoolOfferBhv.<span style="color: #FD4747">queryDelete</span>(schoolOffer, cb);
     * </pre>
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SchoolOfferCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SchoolOfferCB cb, DeleteOption<SchoolOfferCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((SchoolOfferCB)cb); }
        else { return varyingQueryDelete((SchoolOfferCB)cb, downcast(option)); }
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
     * SchoolOffer schoolOffer = new SchoolOffer();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * schoolOffer.setFoo...(value);
     * schoolOffer.setBar...(value);
     * InsertOption<SchoolOfferCB> option = new InsertOption<SchoolOfferCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * schoolOfferBhv.<span style="color: #FD4747">varyingInsert</span>(schoolOffer, option);
     * ... = schoolOffer.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param schoolOffer The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(SchoolOffer schoolOffer, InsertOption<SchoolOfferCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(schoolOffer, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SchoolOffer schoolOffer = new SchoolOffer();
     * schoolOffer.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * schoolOffer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * schoolOffer.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SchoolOfferCB&gt; option = new UpdateOption&lt;SchoolOfferCB&gt;();
     *     option.self(new SpecifyQuery&lt;SchoolOfferCB&gt;() {
     *         public void specify(SchoolOfferCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     schoolOfferBhv.<span style="color: #FD4747">varyingUpdate</span>(schoolOffer, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param schoolOffer The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(SchoolOffer schoolOffer, UpdateOption<SchoolOfferCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(schoolOffer, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param schoolOffer The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(SchoolOffer schoolOffer, InsertOption<SchoolOfferCB> insertOption, UpdateOption<SchoolOfferCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(schoolOffer, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param schoolOffer The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SchoolOffer schoolOffer, DeleteOption<SchoolOfferCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(schoolOffer, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param schoolOfferList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<SchoolOffer> schoolOfferList, InsertOption<SchoolOfferCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(schoolOfferList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param schoolOfferList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<SchoolOffer> schoolOfferList, UpdateOption<SchoolOfferCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(schoolOfferList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param schoolOfferList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<SchoolOffer> schoolOfferList, DeleteOption<SchoolOfferCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(schoolOfferList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<SchoolOffer, SchoolOfferCB> setupper, InsertOption<SchoolOfferCB> option) {
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
     * SchoolOffer schoolOffer = new SchoolOffer();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//schoolOffer.setPK...(value);</span>
     * schoolOffer.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//schoolOffer.setVersionNo(value);</span>
     * SchoolOfferCB cb = new SchoolOfferCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SchoolOfferCB&gt; option = new UpdateOption&lt;SchoolOfferCB&gt;();
     * option.self(new SpecifyQuery&lt;SchoolOfferCB&gt;() {
     *     public void specify(SchoolOfferCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * schoolOfferBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(schoolOffer, cb, option);
     * </pre>
     * @param schoolOffer The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SchoolOffer schoolOffer, SchoolOfferCB cb, UpdateOption<SchoolOfferCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(schoolOffer, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SchoolOffer. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SchoolOfferCB cb, DeleteOption<SchoolOfferCB> option) {
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
    public OutsideSqlBasicExecutor<SchoolOfferBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SchoolOfferCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SchoolOfferCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SchoolOffer> void delegateSelectCursor(SchoolOfferCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends SchoolOffer> List<ENTITY> delegateSelectList(SchoolOfferCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SchoolOffer e, InsertOption<SchoolOfferCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(SchoolOffer e, UpdateOption<SchoolOfferCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(SchoolOffer e, UpdateOption<SchoolOfferCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(SchoolOffer e, DeleteOption<SchoolOfferCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(SchoolOffer e, DeleteOption<SchoolOfferCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<SchoolOffer> ls, InsertOption<SchoolOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SchoolOffer> ls, UpdateOption<SchoolOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SchoolOffer> ls, UpdateOption<SchoolOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SchoolOffer> ls, DeleteOption<SchoolOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SchoolOffer> ls, DeleteOption<SchoolOfferCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SchoolOffer e, SchoolOfferCB inCB, ConditionBean resCB, InsertOption<SchoolOfferCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SchoolOffer e, SchoolOfferCB cb, UpdateOption<SchoolOfferCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(SchoolOfferCB cb, DeleteOption<SchoolOfferCB> op)
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
    protected SchoolOffer downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, SchoolOffer.class);
    }

    protected SchoolOfferCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SchoolOfferCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SchoolOffer> downcast(List<? extends Entity> entityList) {
        return (List<SchoolOffer>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SchoolOfferCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<SchoolOfferCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SchoolOfferCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<SchoolOfferCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SchoolOfferCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<SchoolOfferCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SchoolOffer, SchoolOfferCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<SchoolOffer, SchoolOfferCB>)option;
    }
}
