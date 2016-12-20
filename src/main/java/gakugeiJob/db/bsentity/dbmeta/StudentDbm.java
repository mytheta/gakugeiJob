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
 * The DB meta of student. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class StudentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final StudentDbm _instance = new StudentDbm();
    private StudentDbm() {}
    public static StudentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgStudentId(), "studentId");
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgName(), "name");
        setupEpg(_epgMap, new EpgBirthday(), "birthday");
        setupEpg(_epgMap, new EpgSex(), "sex");
        setupEpg(_epgMap, new EpgPhoneNumber(), "phoneNumber");
        setupEpg(_epgMap, new EpgMailAddress(), "mailAddress");
        setupEpg(_epgMap, new EpgAddress(), "address");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgStudentId implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getStudentId(); }
        public void write(Entity e, Object v) { ((Student)e).setStudentId(cti(v)); }
    }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getUserId(); }
        public void write(Entity e, Object v) { ((Student)e).setUserId((String)v); }
    }
    public static class EpgName implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getName(); }
        public void write(Entity e, Object v) { ((Student)e).setName((String)v); }
    }
    public static class EpgBirthday implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getBirthday(); }
        public void write(Entity e, Object v) { ((Student)e).setBirthday((java.sql.Timestamp)v); }
    }
    public static class EpgSex implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getSex(); }
        public void write(Entity e, Object v) { ((Student)e).setSex(cti(v)); }
    }
    public static class EpgPhoneNumber implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getPhoneNumber(); }
        public void write(Entity e, Object v) { ((Student)e).setPhoneNumber((String)v); }
    }
    public static class EpgMailAddress implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getMailAddress(); }
        public void write(Entity e, Object v) { ((Student)e).setMailAddress((String)v); }
    }
    public static class EpgAddress implements PropertyGateway {
        public Object read(Entity e) { return ((Student)e).getAddress(); }
        public void write(Entity e, Object v) { ((Student)e).setAddress((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "student";
    protected final String _tablePropertyName = "student";
    protected final TableSqlName _tableSqlName = new TableSqlName("student", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStudentId = cci("student_id", "student_id", null, null, true, "studentId", Integer.class, true, true, "INT UNSIGNED", 10, 0, null, false, null, null, null, "enterpriseAplicantList,enterpriseFavoList,schoolAplicantList,schoolFavoList", null);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, true, "userId", String.class, false, false, "VARCHAR", 12, 0, null, false, null, null, "login", null, null);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, false, "name", String.class, false, false, "VARCHAR", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBirthday = cci("birthday", "birthday", null, null, false, "birthday", java.sql.Timestamp.class, false, false, "DATETIME", 19, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnSex = cci("sex", "sex", null, null, false, "sex", Integer.class, false, false, "INT", 10, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPhoneNumber = cci("phone_number", "phone_number", null, null, false, "phoneNumber", String.class, false, false, "VARCHAR", 12, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMailAddress = cci("mail_address", "mail_address", null, null, false, "mailAddress", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAddress = cci("address", "address", null, null, false, "address", String.class, false, false, "VARCHAR", 100, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnStudentId() { return _columnStudentId; }
    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnName() { return _columnName; }
    public ColumnInfo columnBirthday() { return _columnBirthday; }
    public ColumnInfo columnSex() { return _columnSex; }
    public ColumnInfo columnPhoneNumber() { return _columnPhoneNumber; }
    public ColumnInfo columnMailAddress() { return _columnMailAddress; }
    public ColumnInfo columnAddress() { return _columnAddress; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnStudentId());
        ls.add(columnUserId());
        ls.add(columnName());
        ls.add(columnBirthday());
        ls.add(columnSex());
        ls.add(columnPhoneNumber());
        ls.add(columnMailAddress());
        ls.add(columnAddress());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnStudentId()); }
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
        return cfi("student_ibfk_1", "login", this, LoginDbm.getInstance(), map, 0, false, false, false, false, null, false, "studentList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerEnterpriseAplicantList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), EnterpriseAplicantDbm.getInstance().columnStudentId());
        return cri("enterprise_aplicant_ibfk_2", "enterpriseAplicantList", this, EnterpriseAplicantDbm.getInstance(), map, false, "student");
    }
    public ReferrerInfo referrerEnterpriseFavoList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), EnterpriseFavoDbm.getInstance().columnStudentId());
        return cri("enterprise_favo_ibfk_2", "enterpriseFavoList", this, EnterpriseFavoDbm.getInstance(), map, false, "student");
    }
    public ReferrerInfo referrerSchoolAplicantList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), SchoolAplicantDbm.getInstance().columnStudentId());
        return cri("school_aplicant_ibfk_2", "schoolAplicantList", this, SchoolAplicantDbm.getInstance(), map, false, "student");
    }
    public ReferrerInfo referrerSchoolFavoList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStudentId(), SchoolFavoDbm.getInstance().columnStudentId());
        return cri("school_favo_ibfk_2", "schoolFavoList", this, SchoolFavoDbm.getInstance(), map, false, "student");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "gakugeiJob.db.exentity.Student"; }
    public String getConditionBeanTypeName() { return "gakugeiJob.db.cbean.StudentCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.StudentDao"; }
    public String getBehaviorTypeName() { return "gakugeiJob.db.exbhv.StudentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Student> getEntityType() { return Student.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Student newMyEntity() { return new Student(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Student)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Student)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
