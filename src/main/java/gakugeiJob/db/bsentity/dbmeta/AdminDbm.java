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
 * The DB meta of admin. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AdminDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AdminDbm _instance = new AdminDbm();
    private AdminDbm() {}
    public static AdminDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgAdminPass1(), "adminPass1");
        setupEpg(_epgMap, new EpgAdminPass2(), "adminPass2");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((Admin)e).getUserId(); }
        public void write(Entity e, Object v) { ((Admin)e).setUserId((String)v); }
    }
    public static class EpgAdminPass1 implements PropertyGateway {
        public Object read(Entity e) { return ((Admin)e).getAdminPass1(); }
        public void write(Entity e, Object v) { ((Admin)e).setAdminPass1((String)v); }
    }
    public static class EpgAdminPass2 implements PropertyGateway {
        public Object read(Entity e) { return ((Admin)e).getAdminPass2(); }
        public void write(Entity e, Object v) { ((Admin)e).setAdminPass2((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "admin";
    protected final String _tablePropertyName = "admin";
    protected final TableSqlName _tableSqlName = new TableSqlName("admin", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, true, "userId", String.class, true, false, "VARCHAR", 12, 0, null, false, null, null, "login", null, null);
    protected final ColumnInfo _columnAdminPass1 = cci("admin_pass1", "admin_pass1", null, null, true, "adminPass1", String.class, false, false, "VARCHAR", 256, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAdminPass2 = cci("admin_pass2", "admin_pass2", null, null, true, "adminPass2", String.class, false, false, "VARCHAR", 256, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnAdminPass1() { return _columnAdminPass1; }
    public ColumnInfo columnAdminPass2() { return _columnAdminPass2; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnAdminPass1());
        ls.add(columnAdminPass2());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnUserId()); }
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
        return cfi("admin_ibfk_1", "login", this, LoginDbm.getInstance(), map, 0, true, false, false, false, null, false, "adminAsOne");
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
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.Admin"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.AdminCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.AdminDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.AdminBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Admin> getEntityType() { return Admin.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Admin newMyEntity() { return new Admin(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Admin)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Admin)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
