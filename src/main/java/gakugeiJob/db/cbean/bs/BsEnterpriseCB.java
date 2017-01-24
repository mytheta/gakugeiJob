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
 * The base condition-bean of enterprise.
 * @author DBFlute(AutoGenerator)
 */
public class BsEnterpriseCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EnterpriseCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEnterpriseCB() {
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
        return "enterprise";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer enterpriseId) {
        assertObjectNotNull("enterpriseId", enterpriseId);
        BsEnterpriseCB cb = this;
        cb.query().setEnterpriseId_Equal(enterpriseId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_EnterpriseId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_EnterpriseId_Desc();
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
    public EnterpriseCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public EnterpriseCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected EnterpriseCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected EnterpriseCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        EnterpriseCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected EnterpriseCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new EnterpriseCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<EnterpriseCB> unionQuery) {
        final EnterpriseCB cb = new EnterpriseCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final EnterpriseCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<EnterpriseCB> unionQuery) {
        final EnterpriseCB cb = new EnterpriseCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final EnterpriseCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected LoginNss _nssLogin;
    public LoginNss getNssLogin() {
        if (_nssLogin == null) { _nssLogin = new LoginNss(null); }
        return _nssLogin;
    }
    /**
     * Set up relation columns to select clause. <br />
     * login by my user_id, named 'login'.
     * <pre>
     * EnterpriseCB cb = new EnterpriseCB();
     * cb.<span style="color: #FD4747">setupSelect_Login()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Enterprise enterprise = enterpriseBhv.selectEntityWithDeletedCheck(cb);
     * ... = enterprise.<span style="color: #FD4747">getLogin()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public LoginNss setupSelect_Login() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnUserId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryLogin(); } });
        if (_nssLogin == null || !_nssLogin.hasConditionQuery())
        { _nssLogin = new LoginNss(query().queryLogin()); }
        return _nssLogin;
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
            , new HpSpQyCall<EnterpriseCQ>() {
                public boolean has() { return true; }
                public EnterpriseCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<EnterpriseCQ> {
        protected LoginCB.HpSpecification _login;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<EnterpriseCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnEnterpriseId() { return doColumn("enterprise_id"); }
        /**
         * user_id: {IX, NotNull, VARCHAR(12), FK to login}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUserId() { return doColumn("user_id"); }
        /**
         * name: {NotNull, VARCHAR(50)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnName() { return doColumn("name"); }
        /**
         * founding_date: {VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFoundingDate() { return doColumn("founding_date"); }
        /**
         * founder_name: {VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnFounderName() { return doColumn("founder_name"); }
        /**
         * address: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnAddress() { return doColumn("address"); }
        /**
         * capital: {VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnCapital() { return doColumn("capital"); }
        /**
         * president_name: {VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPresidentName() { return doColumn("president_name"); }
        /**
         * num_of_employees: {VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnNumOfEmployees() { return doColumn("num_of_employees"); }
        /**
         * business: {VARCHAR(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBusiness() { return doColumn("business"); }
        /**
         * phone_number: {NotNull, VARCHAR(12)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPhoneNumber() { return doColumn("phone_number"); }
        /**
         * url: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUrl() { return doColumn("url"); }
        /**
         * one_thing: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnOneThing() { return doColumn("one_thing"); }
        /**
         * mail_address: {NotNull, VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnMailAddress() { return doColumn("mail_address"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnEnterpriseId(); // PK
            if (qyCall().qy().hasConditionQueryLogin()
                    || qyCall().qy().xgetReferrerQuery() instanceof LoginCQ) {
                columnUserId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "enterprise"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * login by my user_id, named 'login'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public LoginCB.HpSpecification specifyLogin() {
            assertRelation("login");
            if (_login == null) {
                _login = new LoginCB.HpSpecification(_baseCB, new HpSpQyCall<LoginCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryLogin(); }
                    public LoginCQ qy() { return _qyCall.qy().queryLogin(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _login.xsetSyncQyCall(new HpSpQyCall<LoginCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryLogin(); }
                        public LoginCQ qy() { return xsyncQyCall().qy().queryLogin(); }
                    });
                }
            }
            return _login;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from enterprise_offer where ...) as FOO_MAX} <br />
         * enterprise_offer by your enterprise_id, named 'enterpriseOfferList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedEnterpriseOfferList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;EnterpriseOfferCB&gt;() {
         *     public void query(EnterpriseOfferCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, EnterpriseOffer.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<EnterpriseOfferCB, EnterpriseCQ> derivedEnterpriseOfferList() {
            assertDerived("enterpriseOfferList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<EnterpriseOfferCB, EnterpriseCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<EnterpriseOfferCB, EnterpriseCQ>() {
                public void setup(String function, SubQuery<EnterpriseOfferCB> subQuery, EnterpriseCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveEnterpriseOfferList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<EnterpriseCB, EnterpriseCQ> myselfDerived() {
            assertDerived("enterpriseOfferList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<EnterpriseCB, EnterpriseCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<EnterpriseCB, EnterpriseCQ>() {
                public void setup(String function, SubQuery<EnterpriseCB> subQuery, EnterpriseCQ cq, String aliasName, DerivedReferrerOption option) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<EnterpriseCB> columnQuery(final SpecifyQuery<EnterpriseCB> leftSpecifyQuery) {
        return new HpColQyOperand<EnterpriseCB>(new HpColQyHandler<EnterpriseCB>() {
            public HpCalculator handle(SpecifyQuery<EnterpriseCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected EnterpriseCB xcreateColumnQueryCB() {
        EnterpriseCB cb = new EnterpriseCB();
        cb.xsetupForColumnQuery((EnterpriseCB)this);
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
    public EnterpriseCB dreamCruiseCB() {
        EnterpriseCB cb = new EnterpriseCB();
        cb.xsetupForDreamCruise((EnterpriseCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<EnterpriseCB> orQuery) {
        xorSQ((EnterpriseCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;EnterpriseCB&gt;() {
     *     public void query(EnterpriseCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;EnterpriseCB&gt;() {
     *             public void query(EnterpriseCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<EnterpriseCB> andQuery) {
        xorSQAP((EnterpriseCB)this, andQuery);
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
        final EnterpriseCB cb;
        if (mainCB != null) {
            cb = (EnterpriseCB)mainCB;
        } else {
            cb = new EnterpriseCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<EnterpriseCQ>() {
            public boolean has() { return true; }
            public EnterpriseCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return EnterpriseCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return EnterpriseCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
