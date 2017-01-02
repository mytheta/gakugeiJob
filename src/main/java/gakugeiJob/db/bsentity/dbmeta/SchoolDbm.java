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
 * The DB meta of school. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SchoolDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SchoolDbm _instance = new SchoolDbm();
    private SchoolDbm() {}
    public static SchoolDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgSchoolId(), "schoolId");
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgName(), "name");
        setupEpg(_epgMap, new EpgKinds(), "kinds");
        setupEpg(_epgMap, new EpgPhoneNumber(), "phoneNumber");
        setupEpg(_epgMap, new EpgMailAddress(), "mailAddress");
        setupEpg(_epgMap, new EpgUrl(), "url");
        setupEpg(_epgMap, new EpgOneThing(), "oneThing");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgSchoolId implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getSchoolId(); }
        public void write(Entity e, Object v) { ((School)e).setSchoolId(cti(v)); }
    }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getUserId(); }
        public void write(Entity e, Object v) { ((School)e).setUserId((String)v); }
    }
    public static class EpgName implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getName(); }
        public void write(Entity e, Object v) { ((School)e).setName((String)v); }
    }
    public static class EpgKinds implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getKinds(); }
        public void write(Entity e, Object v) { ((School)e).setKinds((String)v); }
    }
    public static class EpgPhoneNumber implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getPhoneNumber(); }
        public void write(Entity e, Object v) { ((School)e).setPhoneNumber((String)v); }
    }
    public static class EpgMailAddress implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getMailAddress(); }
        public void write(Entity e, Object v) { ((School)e).setMailAddress((String)v); }
    }
    public static class EpgUrl implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getUrl(); }
        public void write(Entity e, Object v) { ((School)e).setUrl((String)v); }
    }
    public static class EpgOneThing implements PropertyGateway {
        public Object read(Entity e) { return ((School)e).getOneThing(); }
        public void write(Entity e, Object v) { ((School)e).setOneThing((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "school";
    protected final String _tablePropertyName = "school";
    protected final TableSqlName _tableSqlName = new TableSqlName("school", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnSchoolId = cci("school_id", "school_id", null, null, true, "schoolId", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "schoolOfferList", null);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, false, "userId", String.class, false, false, "VARCHAR", 12, 0, null, false, null, null, "login", null, null);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, true, "name", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnKinds = cci("kinds", "kinds", null, null, false, "kinds", String.class, false, false, "VARCHAR", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPhoneNumber = cci("phone_number", "phone_number", null, null, true, "phoneNumber", String.class, false, false, "VARCHAR", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMailAddress = cci("mail_address", "mail_address", null, null, true, "mailAddress", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUrl = cci("url", "url", null, null, false, "url", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnOneThing = cci("one_thing", "one_thing", null, null, false, "oneThing", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnSchoolId() { return _columnSchoolId; }
    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnKinds() { return _columnKinds; }
    public ColumnInfo columnPhoneNumber() { return _columnPhoneNumber; }
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    public ColumnInfo columnUrl() { return _columnUrl; }
    public ColumnInfo columnOneThing() { return _columnOneThing; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnSchoolId());
        ls.add(columnUserId());
        ls.add(columnName());
        ls.add(columnKinds());
        ls.add(columnPhoneNumber());
        ls.add(columnMailAddress());
        ls.add(columnUrl());
        ls.add(columnOneThing());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnSchoolId()); }
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
        return cfi("school_ibfk_1", "login", this, LoginDbm.getInstance(), map, 0, false, false, false, false, null, false, "schoolList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerSchoolOfferList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnSchoolId(), SchoolOfferDbm.getInstance().columnSchoolId());
        return cri("school_offer_ibfk_1", "schoolOfferList", this, SchoolOfferDbm.getInstance(), map, false, "school");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.School"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.SchoolCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.SchoolDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.SchoolBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<School> getEntityType() { return School.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public School newMyEntity() { return new School(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((School)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((School)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
