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
 * The DB meta of enterprise_offer. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseOfferDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EnterpriseOfferDbm _instance = new EnterpriseOfferDbm();
    private EnterpriseOfferDbm() {}
    public static EnterpriseOfferDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgEnterpriseId(), "enterpriseId");
        setupEpg(_epgMap, new EpgDescription(), "description");
        setupEpg(_epgMap, new EpgOfficeName(), "officeName");
        setupEpg(_epgMap, new EpgAddress(), "address");
        setupEpg(_epgMap, new EpgStation(), "station");
        setupEpg(_epgMap, new EpgPeriod(), "period");
        setupEpg(_epgMap, new EpgHoliday(), "holiday");
        setupEpg(_epgMap, new EpgWorkingTime(), "workingTime");
        setupEpg(_epgMap, new EpgSalary(), "salary");
        setupEpg(_epgMap, new EpgQualification(), "qualification");
        setupEpg(_epgMap, new EpgWelfare(), "welfare");
        setupEpg(_epgMap, new EpgOneThing(), "oneThing");
        setupEpg(_epgMap, new EpgFavo(), "favo");
        setupEpg(_epgMap, new EpgRegistrationDate(), "registrationDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgJobOfferId implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getJobOfferId(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setJobOfferId(cti(v)); }
    }
    public static class EpgEnterpriseId implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getEnterpriseId(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setEnterpriseId(cti(v)); }
    }
    public static class EpgDescription implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getDescription(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setDescription((String)v); }
    }
    public static class EpgOfficeName implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getOfficeName(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setOfficeName((String)v); }
    }
    public static class EpgAddress implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getAddress(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setAddress((String)v); }
    }
    public static class EpgStation implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getStation(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setStation((String)v); }
    }
    public static class EpgPeriod implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getPeriod(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setPeriod((String)v); }
    }
    public static class EpgHoliday implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getHoliday(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setHoliday((String)v); }
    }
    public static class EpgWorkingTime implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getWorkingTime(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setWorkingTime((String)v); }
    }
    public static class EpgSalary implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getSalary(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setSalary((String)v); }
    }
    public static class EpgQualification implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getQualification(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setQualification((String)v); }
    }
    public static class EpgWelfare implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getWelfare(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setWelfare((String)v); }
    }
    public static class EpgOneThing implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getOneThing(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setOneThing((String)v); }
    }
    public static class EpgFavo implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getFavo(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setFavo(cti(v)); }
    }
    public static class EpgRegistrationDate implements PropertyGateway {
        public Object read(Entity e) { return ((EnterpriseOffer)e).getRegistrationDate(); }
        public void write(Entity e, Object v) { ((EnterpriseOffer)e).setRegistrationDate((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "enterprise_offer";
    protected final String _tablePropertyName = "enterpriseOffer";
    protected final TableSqlName _tableSqlName = new TableSqlName("enterprise_offer", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnJobOfferId = cci("job_offer_id", "job_offer_id", null, null, true, "jobOfferId", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "enterpriseAplicantList,enterpriseFavoList", null);
    protected final ColumnInfo _columnEnterpriseId = cci("enterprise_id", "enterprise_id", null, null, false, "enterpriseId", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, "enterprise", null, null);
    protected final ColumnInfo _columnDescription = cci("description", "description", null, null, true, "description", String.class, false, false, "VARCHAR", 1000, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOfficeName = cci("office_name", "office_name", null, null, true, "officeName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, null, false, "address", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStation = cci("station", "station", null, null, false, "station", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPeriod = cci("period", "period", null, null, false, "period", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnHoliday = cci("holiday", "holiday", null, null, false, "holiday", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWorkingTime = cci("working_time", "working_time", null, null, false, "workingTime", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSalary = cci("salary", "salary", null, null, true, "salary", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnQualification = cci("qualification", "qualification", null, null, false, "qualification", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnWelfare = cci("welfare", "welfare", null, null, false, "welfare", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOneThing = cci("one_thing", "one_thing", null, null, false, "oneThing", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFavo = cci("favo", "favo", null, null, false, "favo", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegistrationDate = cci("registration_date", "registration_date", null, null, false, "registrationDate", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnJobOfferId() { return _columnJobOfferId; }
    public ColumnInfo columnEnterpriseId() { return _columnEnterpriseId; }
    public ColumnInfo columnDescription() { return _columnDescription; }
    public ColumnInfo columnOfficeName() { return _columnOfficeName; }
    public ColumnInfo columnAddress() { return _columnAddress; }
    public ColumnInfo columnStation() { return _columnStation; }
    public ColumnInfo columnPeriod() { return _columnPeriod; }
    public ColumnInfo columnHoliday() { return _columnHoliday; }
    public ColumnInfo columnWorkingTime() { return _columnWorkingTime; }
    public ColumnInfo columnSalary() { return _columnSalary; }
    public ColumnInfo columnQualification() { return _columnQualification; }
    public ColumnInfo columnWelfare() { return _columnWelfare; }
    public ColumnInfo columnOneThing() { return _columnOneThing; }
    public ColumnInfo columnFavo() { return _columnFavo; }
    public ColumnInfo columnRegistrationDate() { return _columnRegistrationDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnJobOfferId());
        ls.add(columnEnterpriseId());
        ls.add(columnDescription());
        ls.add(columnOfficeName());
        ls.add(columnAddress());
        ls.add(columnStation());
        ls.add(columnPeriod());
        ls.add(columnHoliday());
        ls.add(columnWorkingTime());
        ls.add(columnSalary());
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
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnJobOfferId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignEnterprise() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnEnterpriseId(), EnterpriseDbm.getInstance().columnEnterpriseId());
        return cfi("enterprise_offer_ibfk_1", "enterprise", this, EnterpriseDbm.getInstance(), map, 0, false, false, false, false, null, false, "enterpriseOfferList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerEnterpriseAplicantList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnJobOfferId(), EnterpriseAplicantDbm.getInstance().columnJobOfferId());
        return cri("enterprise_aplicant_ibfk_1", "enterpriseAplicantList", this, EnterpriseAplicantDbm.getInstance(), map, false, "enterpriseOffer");
    }
    public ReferrerInfo referrerEnterpriseFavoList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnJobOfferId(), EnterpriseFavoDbm.getInstance().columnJobOfferId());
        return cri("enterprise_favo_ibfk_1", "enterpriseFavoList", this, EnterpriseFavoDbm.getInstance(), map, false, "enterpriseOffer");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.EnterpriseOffer"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.EnterpriseOfferCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.EnterpriseOfferDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.EnterpriseOfferBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EnterpriseOffer> getEntityType() { return EnterpriseOffer.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public EnterpriseOffer newMyEntity() { return new EnterpriseOffer(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((EnterpriseOffer)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((EnterpriseOffer)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
