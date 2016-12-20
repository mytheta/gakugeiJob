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
 * The DB meta of login. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LoginDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LoginDbm _instance = new LoginDbm();
    private LoginDbm() {}
    public static LoginDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgUserPass(), "userPass");
        setupEpg(_epgMap, new EpgRole(), "role");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((Login)e).getUserId(); }
        public void write(Entity e, Object v) { ((Login)e).setUserId((String)v); }
    }
    public static class EpgUserPass implements PropertyGateway {
        public Object read(Entity e) { return ((Login)e).getUserPass(); }
        public void write(Entity e, Object v) { ((Login)e).setUserPass((String)v); }
    }
    public static class EpgRole implements PropertyGateway {
        public Object read(Entity e) { return ((Login)e).getRole(); }
        public void write(Entity e, Object v) { ((Login)e).setRole(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "login";
    protected final String _tablePropertyName = "login";
    protected final TableSqlName _tableSqlName = new TableSqlName("login", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, true, "userId", String.class, true, false, "VARCHAR", 12, 0, null, false, null, null, null, "enterpriseList,schoolList,studentList", null);
    protected final ColumnInfo _columnUserPass = cci("user_pass", "user_pass", null, null, true, "userPass", String.class, false, false, "VARCHAR", 256, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRole = cci("role", "role", null, null, true, "role", Integer.class, false, false, "INT UNSIGNED", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnUserPass() { return _columnUserPass; }
    public ColumnInfo columnRole() { return _columnRole; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnUserPass());
        ls.add(columnRole());
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
    public ForeignInfo foreignAdminAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), AdminDbm.getInstance().columnUserId());
        return cfi("admin_ibfk_1", "adminAsOne", this, AdminDbm.getInstance(), map, 0, true, false, true, false, null, false, "login");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerEnterpriseList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), EnterpriseDbm.getInstance().columnUserId());
        return cri("enterprise_ibfk_1", "enterpriseList", this, EnterpriseDbm.getInstance(), map, false, "login");
    }
    public ReferrerInfo referrerSchoolList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), SchoolDbm.getInstance().columnUserId());
        return cri("school_ibfk_1", "schoolList", this, SchoolDbm.getInstance(), map, false, "login");
    }
    public ReferrerInfo referrerStudentList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), StudentDbm.getInstance().columnUserId());
        return cri("student_ibfk_1", "studentList", this, StudentDbm.getInstance(), map, false, "login");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.Login"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.LoginCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.LoginDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.LoginBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Login> getEntityType() { return Login.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Login newMyEntity() { return new Login(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Login)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Login)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
