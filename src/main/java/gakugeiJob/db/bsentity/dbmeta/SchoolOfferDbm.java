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
 * The DB meta of school_offer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SchoolOfferDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SchoolOfferDbm _instance = new SchoolOfferDbm();
    private SchoolOfferDbm() {}
    public static SchoolOfferDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgSchoolId(), "schoolId");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgSalary(), "salary");
        setupEpg(_epgMap, new EpgWorkSchedule(), "workSchedule");
        setupEpg(_epgMap, new EpgPeriod(), "period");
        setupEpg(_epgMap, new EpgAddress(), "address");
        setupEpg(_epgMap, new EpgStation(), "station");
        setupEpg(_epgMap, new EpgQualification(), "qualification");
        setupEpg(_epgMap, new EpgWelfare(), "welfare");
        setupEpg(_epgMap, new EpgOneThing(), "oneThing");
        setupEpg(_epgMap, new EpgFavo(), "favo");
        setupEpg(_epgMap, new EpgRegistrationDate(), "registrationDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSchoolOfferId implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getSchoolOfferId(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setSchoolOfferId(cti(v)); }
    }
    public static class EpgSchoolId implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getSchoolId(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setSchoolId(cti(v)); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getDescription(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setDescription((String)v); }
    }
    public static class EpgSalary implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getSalary(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setSalary((String)v); }
    }
    public static class EpgWorkSchedule implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getWorkSchedule(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setWorkSchedule((String)v); }
    }
    public static class EpgPeriod implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getPeriod(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setPeriod((String)v); }
    }
    public static class EpgAddress implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getAddress(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setAddress((String)v); }
    }
    public static class EpgStation implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getStation(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setStation((String)v); }
    }
    public static class EpgQualification implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getQualification(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setQualification((String)v); }
    }
    public static class EpgWelfare implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getWelfare(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setWelfare((String)v); }
    }
    public static class EpgOneThing implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getOneThing(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setOneThing((String)v); }
    }
    public static class EpgFavo implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getFavo(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setFavo(cti(v)); }
    }
    public static class EpgRegistrationDate implements PropertyGateway {
        public Object read(Entity e) { return ((SchoolOffer)e).getRegistrationDate(); }
        public void write(Entity e, Object v) { ((SchoolOffer)e).setRegistrationDate((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "school_offer";
    protected final String _tablePropertyName = "schoolOffer";
    protected final TableSqlName _tableSqlName = new TableSqlName("school_offer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSchoolOfferId = cci("school_offer_id", "school_offer_id", null, null, true, "schoolOfferId", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "schoolAplicantList,schoolFavoList", null);
    protected final ColumnInfo _columnSchoolId = cci("school_id", "school_id", null, null, false, "schoolId", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, "school", null, null);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, true, "description", String.class, false, false, "VARCHAR", 1000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSalary = cci("salary", "salary", null, null, true, "salary", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWorkSchedule = cci("work_schedule", "work_schedule", null, null, false, "workSchedule", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPeriod = cci("period", "period", null, null, false, "period", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, null, false, "address", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStation = cci("station", "station", null, null, false, "station", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQualification = cci("qualification", "qualification", null, null, false, "qualification", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWelfare = cci("welfare", "welfare", null, null, false, "welfare", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOneThing = cci("one_thing", "one_thing", null, null, false, "oneThing", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFavo = cci("favo", "favo", null, null, false, "favo", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegistrationDate = cci("registration_date", "registration_date", null, null, false, "registrationDate", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSchoolOfferId() { return _columnSchoolOfferId; }
    public ColumnInfo columnSchoolId() { return _columnSchoolId; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnSalary() { return _columnSalary; }
    public ColumnInfo columnWorkSchedule() { return _columnWorkSchedule; }
    public ColumnInfo columnPeriod() { return _columnPeriod; }
    public ColumnInfo columnAddress() { return _columnAddress; }
    public ColumnInfo columnStation() { return _columnStation; }
    public ColumnInfo columnQualification() { return _columnQualification; }
    public ColumnInfo columnWelfare() { return _columnWelfare; }
    public ColumnInfo columnOneThing() { return _columnOneThing; }
    public ColumnInfo columnFavo() { return _columnFavo; }
    public ColumnInfo columnRegistrationDate() { return _columnRegistrationDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSchoolOfferId());
        ls.add(columnSchoolId());
        ls.add(columnDescription());
        ls.add(columnSalary());
        ls.add(columnWorkSchedule());
        ls.add(columnPeriod());
        ls.add(columnAddress());
        ls.add(columnStation());
        ls.add(columnQualification());
        ls.add(columnWelfare());
        ls.add(columnOneThing());
        ls.add(columnFavo());
        ls.add(columnRegistrationDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnSchoolOfferId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignSchool() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSchoolId(), SchoolDbm.getInstance().columnSchoolId());
        return cfi("school_offer_ibfk_1", "school", this, SchoolDbm.getInstance(), map, 0, false, false, false, false, null, false, "schoolOfferList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerSchoolAplicantList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSchoolOfferId(), SchoolAplicantDbm.getInstance().columnSchoolOfferId());
        return cri("school_aplicant_ibfk_1", "schoolAplicantList", this, SchoolAplicantDbm.getInstance(), map, false, "schoolOffer");
    }
    public ReferrerInfo referrerSchoolFavoList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSchoolOfferId(), SchoolFavoDbm.getInstance().columnSchoolOfferId());
        return cri("school_favo_ibfk_1", "schoolFavoList", this, SchoolFavoDbm.getInstance(), map, false, "schoolOffer");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.SchoolOffer"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.SchoolOfferCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.SchoolOfferDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.SchoolOfferBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SchoolOffer> getEntityType() { return SchoolOffer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SchoolOffer newMyEntity() { return new SchoolOffer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SchoolOffer)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SchoolOffer)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
