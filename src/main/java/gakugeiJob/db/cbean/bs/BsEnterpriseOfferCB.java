package gakugeiJob.db.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import gakugeiJob.db.allcommon.DBFluteConfig;
import gakugeiJob.db.allcommon.DBMetaInstanceHandler;
import gakugeiJob.db.allcommon.ImplementedInvokerAssistant;
import gakugeiJob.db.allcommon.ImplementedSqlClauseCreator;
import gakugeiJob.db.cbean.*;
import gakugeiJob.db.cbean.cq.*;
import gakugeiJob.db.cbean.nss.*;

/**
 * The base condition-bean of enterprise_offer.
 * @author DBFlute(AutoGenerator)
 */
public class BsEnterpriseOfferCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseOfferCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEnterpriseOfferCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "enterprise_offer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer jobOfferId) {
        assertObjectNotNull("jobOfferId", jobOfferId);
        BsEnterpriseOfferCB cb = this;
        cb.query().setJobOfferId_Equal(jobOfferId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_JobOfferId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_JobOfferId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (co-related sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (co-related sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public EnterpriseOfferCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public EnterpriseOfferCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected EnterpriseOfferCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected EnterpriseOfferCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        EnterpriseOfferCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected EnterpriseOfferCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new EnterpriseOfferCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<EnterpriseOfferCB> unionQuery) {
        final EnterpriseOfferCB cb = new EnterpriseOfferCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final EnterpriseOfferCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<EnterpriseOfferCB> unionQuery) {
        final EnterpriseOfferCB cb = new EnterpriseOfferCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final EnterpriseOfferCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected EnterpriseNss _nssEnterprise;
    public EnterpriseNss getNssEnterprise() {
        if (_nssEnterprise == null) { _nssEnterprise = new EnterpriseNss(null); }
        return _nssEnterprise;
    }
    /**
     * Set up relation columns to select clause. <br />
     * enterprise by my enterprise_id, named 'enterprise'.
     * <pre>
     * EnterpriseOfferCB cb = new EnterpriseOfferCB();
     * cb.<span style="color: #FD4747">setupSelect_Enterprise()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * EnterpriseOffer enterpriseOffer = enterpriseOfferBhv.selectEntityWithDeletedCheck(cb);
     * ... = enterpriseOffer.<span style="color: #FD4747">getEnterprise()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public EnterpriseNss setupSelect_Enterprise() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnEnterpriseId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryEnterprise(); } });
        if (_nssEnterprise == null || !_nssEnterprise.hasConditionQuery())
        { _nssEnterprise = new EnterpriseNss(query().queryEnterprise()); }
        return _nssEnterprise;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<EnterpriseOfferCQ>() {
                public boolean has() { return true; }
                public EnterpriseOfferCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    protected boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    protected HpAbstractSpecification<? extends ConditionQuery> localSp() {
        return specify();
    }

    public static class HpSpecification extends HpAbstractSpecification<EnterpriseOfferCQ> {
        protected EnterpriseCB.HpSpecification _enterprise;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<EnterpriseOfferCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnJobOfferId() { return doColumn("job_offer_id"); }
        /**
         * enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnEnterpriseId() { return doColumn("enterprise_id"); }
        /**
         * description: {NotNull, VARCHAR(1000)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDescription() { return doColumn("description"); }
        /**
         * office_name: {NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnOfficeName() { return doColumn("office_name"); }
        /**
         * address: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnAddress() { return doColumn("address"); }
        /**
         * station: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStation() { return doColumn("station"); }
        /**
         * period: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPeriod() { return doColumn("period"); }
        /**
         * holiday: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnHoliday() { return doColumn("holiday"); }
        /**
         * working_time: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWorkingTime() { return doColumn("working_time"); }
        /**
         * salary: {NotNull, VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSalary() { return doColumn("salary"); }
        /**
         * qualification: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnQualification() { return doColumn("qualification"); }
        /**
         * welfare: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnWelfare() { return doColumn("welfare"); }
        /**
         * one_thing: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnOneThing() { return doColumn("one_thing"); }
        /**
         * favo: {INT UNSIGNED(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFavo() { return doColumn("favo"); }
        /**
         * registration_date: {DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegistrationDate() { return doColumn("registration_date"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnJobOfferId(); // PK
            if (qyCall().qy().hasConditionQueryEnterprise()
                    || qyCall().qy().xgetReferrerQuery() instanceof EnterpriseCQ) {
                columnEnterpriseId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "enterprise_offer"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * enterprise by my enterprise_id, named 'enterprise'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public EnterpriseCB.HpSpecification specifyEnterprise() {
            assertRelation("enterprise");
            if (_enterprise == null) {
                _enterprise = new EnterpriseCB.HpSpecification(_baseCB, new HpSpQyCall<EnterpriseCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryEnterprise(); }
                    public EnterpriseCQ qy() { return _qyCall.qy().queryEnterprise(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _enterprise.xsetSyncQyCall(new HpSpQyCall<EnterpriseCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryEnterprise(); }
                        public EnterpriseCQ qy() { return xsyncQyCall().qy().queryEnterprise(); }
                    });
                }
            }
            return _enterprise;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from enterprise_aplicant where ...) as FOO_MAX} <br />
         * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedEnterpriseAplicantList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;EnterpriseAplicantCB&gt;() {
         *     public void query(EnterpriseAplicantCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, EnterpriseAplicant.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<EnterpriseAplicantCB, EnterpriseOfferCQ> derivedEnterpriseAplicantList() {
            assertDerived("enterpriseAplicantList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<EnterpriseAplicantCB, EnterpriseOfferCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<EnterpriseAplicantCB, EnterpriseOfferCQ>() {
                public void setup(String function, SubQuery<EnterpriseAplicantCB> subQuery, EnterpriseOfferCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveEnterpriseAplicantList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from enterprise_favo where ...) as FOO_MAX} <br />
         * enterprise_favo by your job_offer_id, named 'enterpriseFavoList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedEnterpriseFavoList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;EnterpriseFavoCB&gt;() {
         *     public void query(EnterpriseFavoCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, EnterpriseFavo.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<EnterpriseFavoCB, EnterpriseOfferCQ> derivedEnterpriseFavoList() {
            assertDerived("enterpriseFavoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<EnterpriseFavoCB, EnterpriseOfferCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<EnterpriseFavoCB, EnterpriseOfferCQ>() {
                public void setup(String function, SubQuery<EnterpriseFavoCB> subQuery, EnterpriseOfferCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveEnterpriseFavoList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<EnterpriseOfferCB, EnterpriseOfferCQ> myselfDerived() {
            assertDerived("enterpriseFavoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<EnterpriseOfferCB, EnterpriseOfferCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<EnterpriseOfferCB, EnterpriseOfferCQ>() {
                public void setup(String function, SubQuery<EnterpriseOfferCB> subQuery, EnterpriseOfferCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsmyselfDerive(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<EnterpriseOfferCB> columnQuery(final SpecifyQuery<EnterpriseOfferCB> leftSpecifyQuery) {
        return new HpColQyOperand<EnterpriseOfferCB>(new HpColQyHandler<EnterpriseOfferCB>() {
            public HpCalculator handle(SpecifyQuery<EnterpriseOfferCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected EnterpriseOfferCB xcreateColumnQueryCB() {
        EnterpriseOfferCB cb = new EnterpriseOfferCB();
        cb.xsetupForColumnQuery((EnterpriseOfferCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public EnterpriseOfferCB dreamCruiseCB() {
        EnterpriseOfferCB cb = new EnterpriseOfferCB();
        cb.xsetupForDreamCruise((EnterpriseOfferCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                        OrScopeQuery
    //                                                                        ============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<EnterpriseOfferCB> orQuery) {
        xorSQ((EnterpriseOfferCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;EnterpriseOfferCB&gt;() {
     *     public void query(EnterpriseOfferCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;EnterpriseOfferCB&gt;() {
     *             public void query(EnterpriseOfferCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<EnterpriseOfferCB> andQuery) {
        xorSQAP((EnterpriseOfferCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final EnterpriseOfferCB cb;
        if (mainCB != null) {
            cb = (EnterpriseOfferCB)mainCB;
        } else {
            cb = new EnterpriseOfferCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<EnterpriseOfferCQ>() {
            public boolean has() { return true; }
            public EnterpriseOfferCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return EnterpriseOfferCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return EnterpriseOfferCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
