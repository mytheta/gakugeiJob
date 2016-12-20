package gakugeiJob.db.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import gakugeiJob.db.allcommon.*;
import gakugeiJob.db.exentity.*;

/**
 * The DB meta of enterprise_aplicant. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseAplicantDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EnterpriseAplicantDbm _instance = new EnterpriseAplicantDbm();
    private EnterpriseAplicantDbm() {}
    public static EnterpriseAplicantDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgJobOfferId(), "jobOfferId");
        setupEpg(_epgMap, new EpgStudentId(), "studentId");
        setupEpg(_epgMap, new EpgTitle(), "title");
        setupEpg(_epgMap, new EpgContent(), "content");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgJobOfferId implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseAplicant)e).getJobOfferId(); }
        public void write(Entity e, Object v) { ((EnterpriseAplicant)e).setJobOfferId(cti(v)); }
    }
    public static class EpgStudentId implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseAplicant)e).getStudentId(); }
        public void write(Entity e, Object v) { ((EnterpriseAplicant)e).setStudentId(cti(v)); }
    }
    public static class EpgTitle implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseAplicant)e).getTitle(); }
        public void write(Entity e, Object v) { ((EnterpriseAplicant)e).setTitle((String)v); }
    }
    public static class EpgContent implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseAplicant)e).getContent(); }
        public void write(Entity e, Object v) { ((EnterpriseAplicant)e).setContent((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "enterprise_aplicant";
    protected final String _tablePropertyName = "enterpriseAplicant";
    protected final TableSqlName _tableSqlName = new TableSqlName("enterprise_aplicant", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJobOfferId = cci("job_offer_id", "job_offer_id", null, null, true, "jobOfferId", Integer.class, true, false, "INT UNSIGNED", 10, 0, null, false, null, null, "enterpriseOffer", null, null);
    protected final ColumnInfo _columnStudentId = cci("student_id", "student_id", null, null, true, "studentId", Integer.class, true, false, "INT UNSIGNED", 10, 0, null, false, null, null, "student", null, null);
    protected final ColumnInfo _columnTitle = cci("title", "title", null, null, false, "title", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnContent = cci("content", "content", null, null, false, "content", String.class, false, false, "VARCHAR", 400, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnJobOfferId() { return _columnJobOfferId; }
    public ColumnInfo columnStudentId() { return _columnStudentId; }
    public ColumnInfo columnTitle() { return _columnTitle; }
    public ColumnInfo columnContent() { return _columnContent; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnJobOfferId());
        ls.add(columnStudentId());
        ls.add(columnTitle());
        ls.add(columnContent());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnJobOfferId());
        ls.add(columnStudentId());
        return cpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignEnterpriseOffer() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnJobOfferId(), EnterpriseOfferDbm.getInstance().columnJobOfferId());
        return cfi("enterprise_aplicant_ibfk_1", "enterpriseOffer", this, EnterpriseOfferDbm.getInstance(), map, 0, false, false, false, false, null, false, "enterpriseAplicantList");
    }
    public ForeignInfo foreignStudent() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), StudentDbm.getInstance().columnStudentId());
        return cfi("enterprise_aplicant_ibfk_2", "student", this, StudentDbm.getInstance(), map, 1, false, false, false, false, null, false, "enterpriseAplicantList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.EnterpriseAplicant"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.EnterpriseAplicantCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.EnterpriseAplicantDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.EnterpriseAplicantBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EnterpriseAplicant> getEntityType() { return EnterpriseAplicant.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public EnterpriseAplicant newMyEntity() { return new EnterpriseAplicant(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((EnterpriseAplicant)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((EnterpriseAplicant)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
