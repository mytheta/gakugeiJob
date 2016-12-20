package gakugeiJob.db.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import gakugeiJob.db.allcommon.DBMetaInstanceHandler;
import gakugeiJob.db.exentity.*;

/**
 * The entity of student as TABLE. <br />
 * <pre>
 * [primary-key]
 *     student_id
 * 
 * [column]
 *     student_id, user_id, name, birthday, sex, phone_number, mail_address, address
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     student_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     login
 * 
 * [referrer table]
 *     enterprise_aplicant, enterprise_favo, school_aplicant, school_favo
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     enterpriseAplicantList, enterpriseFavoList, schoolAplicantList, schoolFavoList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer studentId = entity.getStudentId();
 * String userId = entity.getUserId();
 * String name = entity.getName();
 * java.sql.Timestamp birthday = entity.getBirthday();
 * Integer sex = entity.getSex();
 * String phoneNumber = entity.getPhoneNumber();
 * String mailAddress = entity.getMailAddress();
 * String address = entity.getAddress();
 * entity.setStudentId(studentId);
 * entity.setUserId(userId);
 * entity.setName(name);
 * entity.setBirthday(birthday);
 * entity.setSex(sex);
 * entity.setPhoneNumber(phoneNumber);
 * entity.setMailAddress(mailAddress);
 * entity.setAddress(address);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsStudent implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** student_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _studentId;

    /** user_id: {IX, NotNull, VARCHAR(12), FK to login} */
    protected String _userId;

    /** name: {VARCHAR(10)} */
    protected String _name;

    /** birthday: {DATETIME(19)} */
    protected java.sql.Timestamp _birthday;

    /** sex: {INT(10)} */
    protected Integer _sex;

    /** phone_number: {VARCHAR(12)} */
    protected String _phoneNumber;

    /** mail_address: {VARCHAR(50)} */
    protected String _mailAddress;

    /** address: {VARCHAR(100)} */
    protected String _address;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "student";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "student";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getStudentId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** login by my user_id, named 'login'. */
    protected Login _login;

    /**
     * login by my user_id, named 'login'.
     * @return The entity of foreign property 'login'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public Login getLogin() {
        return _login;
    }

    /**
     * login by my user_id, named 'login'.
     * @param login The entity of foreign property 'login'. (NullAllowed)
     */
    public void setLogin(Login login) {
        _login = login;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** enterprise_aplicant by your student_id, named 'enterpriseAplicantList'. */
    protected List<EnterpriseAplicant> _enterpriseAplicantList;

    /**
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantList'.
     * @return The entity list of referrer property 'enterpriseAplicantList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<EnterpriseAplicant> getEnterpriseAplicantList() {
        if (_enterpriseAplicantList == null) { _enterpriseAplicantList = newReferrerList(); }
        return _enterpriseAplicantList;
    }

    /**
     * enterprise_aplicant by your student_id, named 'enterpriseAplicantList'.
     * @param enterpriseAplicantList The entity list of referrer property 'enterpriseAplicantList'. (NullAllowed)
     */
    public void setEnterpriseAplicantList(List<EnterpriseAplicant> enterpriseAplicantList) {
        _enterpriseAplicantList = enterpriseAplicantList;
    }

    /** enterprise_favo by your student_id, named 'enterpriseFavoList'. */
    protected List<EnterpriseFavo> _enterpriseFavoList;

    /**
     * enterprise_favo by your student_id, named 'enterpriseFavoList'.
     * @return The entity list of referrer property 'enterpriseFavoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<EnterpriseFavo> getEnterpriseFavoList() {
        if (_enterpriseFavoList == null) { _enterpriseFavoList = newReferrerList(); }
        return _enterpriseFavoList;
    }

    /**
     * enterprise_favo by your student_id, named 'enterpriseFavoList'.
     * @param enterpriseFavoList The entity list of referrer property 'enterpriseFavoList'. (NullAllowed)
     */
    public void setEnterpriseFavoList(List<EnterpriseFavo> enterpriseFavoList) {
        _enterpriseFavoList = enterpriseFavoList;
    }

    /** school_aplicant by your student_id, named 'schoolAplicantList'. */
    protected List<SchoolAplicant> _schoolAplicantList;

    /**
     * school_aplicant by your student_id, named 'schoolAplicantList'.
     * @return The entity list of referrer property 'schoolAplicantList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<SchoolAplicant> getSchoolAplicantList() {
        if (_schoolAplicantList == null) { _schoolAplicantList = newReferrerList(); }
        return _schoolAplicantList;
    }

    /**
     * school_aplicant by your student_id, named 'schoolAplicantList'.
     * @param schoolAplicantList The entity list of referrer property 'schoolAplicantList'. (NullAllowed)
     */
    public void setSchoolAplicantList(List<SchoolAplicant> schoolAplicantList) {
        _schoolAplicantList = schoolAplicantList;
    }

    /** school_favo by your student_id, named 'schoolFavoList'. */
    protected List<SchoolFavo> _schoolFavoList;

    /**
     * school_favo by your student_id, named 'schoolFavoList'.
     * @return The entity list of referrer property 'schoolFavoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<SchoolFavo> getSchoolFavoList() {
        if (_schoolFavoList == null) { _schoolFavoList = newReferrerList(); }
        return _schoolFavoList;
    }

    /**
     * school_favo by your student_id, named 'schoolFavoList'.
     * @param schoolFavoList The entity list of referrer property 'schoolFavoList'. (NullAllowed)
     */
    public void setSchoolFavoList(List<SchoolFavo> schoolFavoList) {
        _schoolFavoList = schoolFavoList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsStudent)) { return false; }
        BsStudent otherEntity = (BsStudent)other;
        if (!xSV(getStudentId(), otherEntity.getStudentId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getStudentId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_login != null)
        { sb.append(l).append(xbRDS(_login, "login")); }
        if (_enterpriseAplicantList != null) { for (Entity e : _enterpriseAplicantList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "enterpriseAplicantList")); } } }
        if (_enterpriseFavoList != null) { for (Entity e : _enterpriseFavoList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "enterpriseFavoList")); } } }
        if (_schoolAplicantList != null) { for (Entity e : _schoolAplicantList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "schoolAplicantList")); } } }
        if (_schoolFavoList != null) { for (Entity e : _schoolFavoList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "schoolFavoList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getStudentId());
        sb.append(delimiter).append(getUserId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getBirthday());
        sb.append(delimiter).append(getSex());
        sb.append(delimiter).append(getPhoneNumber());
        sb.append(delimiter).append(getMailAddress());
        sb.append(delimiter).append(getAddress());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_login != null) { sb.append(c).append("login"); }
        if (_enterpriseAplicantList != null && !_enterpriseAplicantList.isEmpty())
        { sb.append(c).append("enterpriseAplicantList"); }
        if (_enterpriseFavoList != null && !_enterpriseFavoList.isEmpty())
        { sb.append(c).append("enterpriseFavoList"); }
        if (_schoolAplicantList != null && !_schoolAplicantList.isEmpty())
        { sb.append(c).append("schoolAplicantList"); }
        if (_schoolFavoList != null && !_schoolFavoList.isEmpty())
        { sb.append(c).append("schoolFavoList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Student clone() {
        try {
            return (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] student_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'student_id'. (NullAllowed)
     */
    public Integer getStudentId() {
        return _studentId;
    }

    /**
     * [set] student_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @param studentId The value of the column 'student_id'. (NullAllowed)
     */
    public void setStudentId(Integer studentId) {
        __modifiedProperties.addPropertyName("studentId");
        this._studentId = studentId;
    }

    /**
     * [get] user_id: {IX, NotNull, VARCHAR(12), FK to login} <br />
     * @return The value of the column 'user_id'. (NullAllowed)
     */
    public String getUserId() {
        return _userId;
    }

    /**
     * [set] user_id: {IX, NotNull, VARCHAR(12), FK to login} <br />
     * @param userId The value of the column 'user_id'. (NullAllowed)
     */
    public void setUserId(String userId) {
        __modifiedProperties.addPropertyName("userId");
        this._userId = userId;
    }

    /**
     * [get] name: {VARCHAR(10)} <br />
     * @return The value of the column 'name'. (NullAllowed)
     */
    public String getName() {
        return _name;
    }

    /**
     * [set] name: {VARCHAR(10)} <br />
     * @param name The value of the column 'name'. (NullAllowed)
     */
    public void setName(String name) {
        __modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * [get] birthday: {DATETIME(19)} <br />
     * @return The value of the column 'birthday'. (NullAllowed)
     */
    public java.sql.Timestamp getBirthday() {
        return _birthday;
    }

    /**
     * [set] birthday: {DATETIME(19)} <br />
     * @param birthday The value of the column 'birthday'. (NullAllowed)
     */
    public void setBirthday(java.sql.Timestamp birthday) {
        __modifiedProperties.addPropertyName("birthday");
        this._birthday = birthday;
    }

    /**
     * [get] sex: {INT(10)} <br />
     * @return The value of the column 'sex'. (NullAllowed)
     */
    public Integer getSex() {
        return _sex;
    }

    /**
     * [set] sex: {INT(10)} <br />
     * @param sex The value of the column 'sex'. (NullAllowed)
     */
    public void setSex(Integer sex) {
        __modifiedProperties.addPropertyName("sex");
        this._sex = sex;
    }

    /**
     * [get] phone_number: {VARCHAR(12)} <br />
     * @return The value of the column 'phone_number'. (NullAllowed)
     */
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    /**
     * [set] phone_number: {VARCHAR(12)} <br />
     * @param phoneNumber The value of the column 'phone_number'. (NullAllowed)
     */
    public void setPhoneNumber(String phoneNumber) {
        __modifiedProperties.addPropertyName("phoneNumber");
        this._phoneNumber = phoneNumber;
    }

    /**
     * [get] mail_address: {VARCHAR(50)} <br />
     * @return The value of the column 'mail_address'. (NullAllowed)
     */
    public String getMailAddress() {
        return _mailAddress;
    }

    /**
     * [set] mail_address: {VARCHAR(50)} <br />
     * @param mailAddress The value of the column 'mail_address'. (NullAllowed)
     */
    public void setMailAddress(String mailAddress) {
        __modifiedProperties.addPropertyName("mailAddress");
        this._mailAddress = mailAddress;
    }

    /**
     * [get] address: {VARCHAR(100)} <br />
     * @return The value of the column 'address'. (NullAllowed)
     */
    public String getAddress() {
        return _address;
    }

    /**
     * [set] address: {VARCHAR(100)} <br />
     * @param address The value of the column 'address'. (NullAllowed)
     */
    public void setAddress(String address) {
        __modifiedProperties.addPropertyName("address");
        this._address = address;
    }
}
