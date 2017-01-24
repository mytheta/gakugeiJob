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
 * The DB meta of enterprise. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EnterpriseDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EnterpriseDbm _instance = new EnterpriseDbm();
    private EnterpriseDbm() {}
    public static EnterpriseDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgEnterpriseId(), "enterpriseId");
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgName(), "name");
        setupEpg(_epgMap, new EpgFoundingDate(), "foundingDate");
        setupEpg(_epgMap, new EpgFounderName(), "founderName");
        setupEpg(_epgMap, new EpgAddress(), "address");
        setupEpg(_epgMap, new EpgCapital(), "capital");
        setupEpg(_epgMap, new EpgPresidentName(), "presidentName");
        setupEpg(_epgMap, new EpgNumOfEmployees(), "numOfEmployees");
        setupEpg(_epgMap, new EpgBusiness(), "business");
        setupEpg(_epgMap, new EpgPhoneNumber(), "phoneNumber");
        setupEpg(_epgMap, new EpgUrl(), "url");
        setupEpg(_epgMap, new EpgOneThing(), "oneThing");
        setupEpg(_epgMap, new EpgMailAddress(), "mailAddress");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgEnterpriseId implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getEnterpriseId(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setEnterpriseId(cti(v)); }
    }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getUserId(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setUserId((String)v); }
    }
    public static class EpgName implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getName(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setName((String)v); }
    }
    public static class EpgFoundingDate implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getFoundingDate(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setFoundingDate((String)v); }
    }
    public static class EpgFounderName implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getFounderName(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setFounderName((String)v); }
    }
    public static class EpgAddress implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getAddress(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setAddress((String)v); }
    }
    public static class EpgCapital implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getCapital(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setCapital((String)v); }
    }
    public static class EpgPresidentName implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getPresidentName(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setPresidentName((String)v); }
    }
    public static class EpgNumOfEmployees implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getNumOfEmployees(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setNumOfEmployees((String)v); }
    }
    public static class EpgBusiness implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getBusiness(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setBusiness((String)v); }
    }
    public static class EpgPhoneNumber implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getPhoneNumber(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setPhoneNumber((String)v); }
    }
    public static class EpgUrl implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getUrl(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setUrl((String)v); }
    }
    public static class EpgOneThing implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getOneThing(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setOneThing((String)v); }
    }
    public static class EpgMailAddress implements PropertyGateway {
        public Object read(Entity e) { return ((Enterprise)e).getMailAddress(); }
        public void write(Entity e, Object v) { ((Enterprise)e).setMailAddress((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "enterprise";
    protected final String _tablePropertyName = "enterprise";
    protected final TableSqlName _tableSqlName = new TableSqlName("enterprise", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEnterpriseId = cci("enterprise_id", "enterprise_id", null, null, true, "enterpriseId", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "enterpriseOfferList", null);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, true, "userId", String.class, false, false, "VARCHAR", 12, 0, null, false, null, null, "login", null, null);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, true, "name", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFoundingDate = cci("founding_date", "founding_date", null, null, false, "foundingDate", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnFounderName = cci("founder_name", "founder_name", null, null, false, "founderName", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, null, false, "address", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnCapital = cci("capital", "capital", null, null, false, "capital", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPresidentName = cci("president_name", "president_name", null, null, false, "presidentName", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnNumOfEmployees = cci("num_of_employees", "num_of_employees", null, null, false, "numOfEmployees", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBusiness = cci("business", "business", null, null, false, "business", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPhoneNumber = cci("phone_number", "phone_number", null, null, true, "phoneNumber", String.class, false, false, "VARCHAR", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUrl = cci("url", "url", null, null, false, "url", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOneThing = cci("one_thing", "one_thing", null, null, false, "oneThing", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMailAddress = cci("mail_address", "mail_address", null, null, true, "mailAddress", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnEnterpriseId() { return _columnEnterpriseId; }
    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnFoundingDate() { return _columnFoundingDate; }
    public ColumnInfo columnFounderName() { return _columnFounderName; }
    public ColumnInfo columnAddress() { return _columnAddress; }
    public ColumnInfo columnCapital() { return _columnCapital; }
    public ColumnInfo columnPresidentName() { return _columnPresidentName; }
    public ColumnInfo columnNumOfEmployees() { return _columnNumOfEmployees; }
    public ColumnInfo columnBusiness() { return _columnBusiness; }
    public ColumnInfo columnPhoneNumber() { return _columnPhoneNumber; }
    public ColumnInfo columnUrl() { return _columnUrl; }
    public ColumnInfo columnOneThing() { return _columnOneThing; }
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEnterpriseId());
        ls.add(columnUserId());
        ls.add(columnName());
        ls.add(columnFoundingDate());
        ls.add(columnFounderName());
        ls.add(columnAddress());
        ls.add(columnCapital());
        ls.add(columnPresidentName());
        ls.add(columnNumOfEmployees());
        ls.add(columnBusiness());
        ls.add(columnPhoneNumber());
        ls.add(columnUrl());
        ls.add(columnOneThing());
        ls.add(columnMailAddress());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnEnterpriseId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignLogin() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), LoginDbm.getInstance().columnUserId());
        return cfi("enterprise_ibfk_1", "login", this, LoginDbm.getInstance(), map, 0, false, false, false, false, null, false, "enterpriseList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerEnterpriseOfferList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnEnterpriseId(), EnterpriseOfferDbm.getInstance().columnEnterpriseId());
        return cri("enterprise_offer_ibfk_1", "enterpriseOfferList", this, EnterpriseOfferDbm.getInstance(), map, false, "enterprise");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.Enterprise"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.EnterpriseCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.EnterpriseDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.EnterpriseBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Enterprise> getEntityType() { return Enterprise.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Enterprise newMyEntity() { return new Enterprise(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Enterprise)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Enterprise)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
