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
 * The DB meta of school_favo. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SchoolFavoDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SchoolFavoDbm _instance = new SchoolFavoDbm();
    private SchoolFavoDbm() {}
    public static SchoolFavoDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSchoolOfferId(), "schoolOfferId");
        setupEpg(_epgMap, new EpgStudentId(), "studentId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSchoolOfferId implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolFavo)e).getSchoolOfferId(); }
        public void write(Entity e, Object v) { ((SchoolFavo)e).setSchoolOfferId(cti(v)); }
    }
    public static class EpgStudentId implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolFavo)e).getStudentId(); }
        public void write(Entity e, Object v) { ((SchoolFavo)e).setStudentId(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "school_favo";
    protected final String _tablePropertyName = "schoolFavo";
    protected final TableSqlName _tableSqlName = new TableSqlName("school_favo", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSchoolOfferId = cci("school_offer_id", "school_offer_id", null, null, true, "schoolOfferId", Integer.class, true, false, "INT UNSIGNED", 10, 0, null, false, null, null, "schoolOffer", null, null);
    protected final ColumnInfo _columnStudentId = cci("student_id", "student_id", null, null, true, "studentId", Integer.class, true, false, "INT UNSIGNED", 10, 0, null, false, null, null, "student", null, null);

    public ColumnInfo columnSchoolOfferId() { return _columnSchoolOfferId; }
    public ColumnInfo columnStudentId() { return _columnStudentId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSchoolOfferId());
        ls.add(columnStudentId());
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
        ls.add(columnSchoolOfferId());
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
    public ForeignInfo foreignSchoolOffer() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSchoolOfferId(), SchoolOfferDbm.getInstance().columnSchoolOfferId());
        return cfi("school_favo_ibfk_1", "schoolOffer", this, SchoolOfferDbm.getInstance(), map, 0, false, false, false, false, null, false, "schoolFavoList");
    }
    public ForeignInfo foreignStudent() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), StudentDbm.getInstance().columnStudentId());
        return cfi("school_favo_ibfk_2", "student", this, StudentDbm.getInstance(), map, 1, false, false, false, false, null, false, "schoolFavoList");
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
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.SchoolFavo"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.SchoolFavoCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.SchoolFavoDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.SchoolFavoBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SchoolFavo> getEntityType() { return SchoolFavo.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SchoolFavo newMyEntity() { return new SchoolFavo(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SchoolFavo)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SchoolFavo)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
