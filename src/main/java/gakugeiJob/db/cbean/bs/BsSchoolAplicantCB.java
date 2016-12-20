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
 * The base condition-bean of school_aplicant.
 * @author DBFlute(AutoGenerator)
 */
public class BsSchoolAplicantCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SchoolAplicantCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSchoolAplicantCB() {
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
        return "school_aplicant";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer schoolOfferId, Integer studentId) {
        assertObjectNotNull("schoolOfferId", schoolOfferId);assertObjectNotNull("studentId", studentId);
        BsSchoolAplicantCB cb = this;
        cb.query().setSchoolOfferId_Equal(schoolOfferId);cb.query().setStudentId_Equal(studentId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_SchoolOfferId_Asc();
        query().addOrderBy_StudentId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_SchoolOfferId_Desc();
        query().addOrderBy_StudentId_Desc();
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
    public SchoolAplicantCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public SchoolAplicantCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected SchoolAplicantCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected SchoolAplicantCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        SchoolAplicantCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected SchoolAplicantCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new SchoolAplicantCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolAplicantCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<SchoolAplicantCB> unionQuery) {
        final SchoolAplicantCB cb = new SchoolAplicantCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final SchoolAplicantCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolAplicantCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<SchoolAplicantCB> unionQuery) {
        final SchoolAplicantCB cb = new SchoolAplicantCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final SchoolAplicantCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected SchoolOfferNss _nssSchoolOffer;
    public SchoolOfferNss getNssSchoolOffer() {
        if (_nssSchoolOffer == null) { _nssSchoolOffer = new SchoolOfferNss(null); }
        return _nssSchoolOffer;
    }
    /**
     * Set up relation columns to select clause. <br />
     * school_offer by my school_offer_id, named 'schoolOffer'.
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.<span style="color: #FD4747">setupSelect_SchoolOffer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SchoolAplicant schoolAplicant = schoolAplicantBhv.selectEntityWithDeletedCheck(cb);
     * ... = schoolAplicant.<span style="color: #FD4747">getSchoolOffer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public SchoolOfferNss setupSelect_SchoolOffer() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().querySchoolOffer(); } });
        if (_nssSchoolOffer == null || !_nssSchoolOffer.hasConditionQuery())
        { _nssSchoolOffer = new SchoolOfferNss(query().querySchoolOffer()); }
        return _nssSchoolOffer;
    }
    protected StudentNss _nssStudent;
    public StudentNss getNssStudent() {
        if (_nssStudent == null) { _nssStudent = new StudentNss(null); }
        return _nssStudent;
    }
    /**
     * Set up relation columns to select clause. <br />
     * student by my student_id, named 'student'.
     * <pre>
     * SchoolAplicantCB cb = new SchoolAplicantCB();
     * cb.<span style="color: #FD4747">setupSelect_Student()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * SchoolAplicant schoolAplicant = schoolAplicantBhv.selectEntityWithDeletedCheck(cb);
     * ... = schoolAplicant.<span style="color: #FD4747">getStudent()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public StudentNss setupSelect_Student() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryStudent(); } });
        if (_nssStudent == null || !_nssStudent.hasConditionQuery())
        { _nssStudent = new StudentNss(query().queryStudent()); }
        return _nssStudent;
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
            , new HpSpQyCall<SchoolAplicantCQ>() {
                public boolean has() { return true; }
                public SchoolAplicantCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<SchoolAplicantCQ> {
        protected SchoolOfferCB.HpSpecification _schoolOffer;
        protected StudentCB.HpSpecification _student;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<SchoolAplicantCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * school_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to school_offer}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnSchoolOfferId() { return doColumn("school_offer_id"); }
        /**
         * student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStudentId() { return doColumn("student_id"); }
        /**
         * title: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTitle() { return doColumn("title"); }
        /**
         * content: {VARCHAR(400)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnContent() { return doColumn("content"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnSchoolOfferId(); // PK
            columnStudentId(); // PK
        }
        @Override
        protected String getTableDbName() { return "school_aplicant"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * school_offer by my school_offer_id, named 'schoolOffer'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public SchoolOfferCB.HpSpecification specifySchoolOffer() {
            assertRelation("schoolOffer");
            if (_schoolOffer == null) {
                _schoolOffer = new SchoolOfferCB.HpSpecification(_baseCB, new HpSpQyCall<SchoolOfferCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQuerySchoolOffer(); }
                    public SchoolOfferCQ qy() { return _qyCall.qy().querySchoolOffer(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _schoolOffer.xsetSyncQyCall(new HpSpQyCall<SchoolOfferCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQuerySchoolOffer(); }
                        public SchoolOfferCQ qy() { return xsyncQyCall().qy().querySchoolOffer(); }
                    });
                }
            }
            return _schoolOffer;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * student by my student_id, named 'student'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public StudentCB.HpSpecification specifyStudent() {
            assertRelation("student");
            if (_student == null) {
                _student = new StudentCB.HpSpecification(_baseCB, new HpSpQyCall<StudentCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryStudent(); }
                    public StudentCQ qy() { return _qyCall.qy().queryStudent(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _student.xsetSyncQyCall(new HpSpQyCall<StudentCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryStudent(); }
                        public StudentCQ qy() { return xsyncQyCall().qy().queryStudent(); }
                    });
                }
            }
            return _student;
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolAplicantCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolAplicantCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<SchoolAplicantCB> columnQuery(final SpecifyQuery<SchoolAplicantCB> leftSpecifyQuery) {
        return new HpColQyOperand<SchoolAplicantCB>(new HpColQyHandler<SchoolAplicantCB>() {
            public HpCalculator handle(SpecifyQuery<SchoolAplicantCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected SchoolAplicantCB xcreateColumnQueryCB() {
        SchoolAplicantCB cb = new SchoolAplicantCB();
        cb.xsetupForColumnQuery((SchoolAplicantCB)this);
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
    public SchoolAplicantCB dreamCruiseCB() {
        SchoolAplicantCB cb = new SchoolAplicantCB();
        cb.xsetupForDreamCruise((SchoolAplicantCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolAplicantCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<SchoolAplicantCB> orQuery) {
        xorSQ((SchoolAplicantCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;SchoolAplicantCB&gt;() {
     *     public void query(SchoolAplicantCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;SchoolAplicantCB&gt;() {
     *             public void query(SchoolAplicantCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<SchoolAplicantCB> andQuery) {
        xorSQAP((SchoolAplicantCB)this, andQuery);
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
        final SchoolAplicantCB cb;
        if (mainCB != null) {
            cb = (SchoolAplicantCB)mainCB;
        } else {
            cb = new SchoolAplicantCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<SchoolAplicantCQ>() {
            public boolean has() { return true; }
            public SchoolAplicantCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return SchoolAplicantCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return SchoolAplicantCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
