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
 * The entity of login as TABLE. <br />
 * <pre>
 * [primary-key]
 *     user_id
 * 
 * [column]
 *     user_id, user_pass, role
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     admin(AsOne)
 * 
 * [referrer table]
 *     enterprise, school, student, admin
 * 
 * [foreign property]
 *     adminAsOne
 * 
 * [referrer property]
 *     enterpriseList, schoolList, studentList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String userId = entity.getUserId();
 * String userPass = entity.getUserPass();
 * Integer role = entity.getRole();
 * entity.setUserId(userId);
 * entity.setUserPass(userPass);
 * entity.setRole(role);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLogin implements Entity, Serializable, Cloneable {

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
    /** user_id: {PK, NotNull, VARCHAR(12)} */
    protected String _userId;

    /** user_pass: {NotNull, VARCHAR(256)} */
    protected String _userPass;

    /** role: {NotNull, INT UNSIGNED(10)} */
    protected Integer _role;

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
        return "login";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "login";
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
        if (getUserId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** admin by your user_id, named 'adminAsOne'. */
    protected Admin _adminAsOne;

    /**
     * admin by your user_id, named 'adminAsOne'.
     * @return the entity of foreign property(referrer-as-one) 'adminAsOne'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public Admin getAdminAsOne() {
        return _adminAsOne;
    }

    /**
     * admin by your user_id, named 'adminAsOne'.
     * @param adminAsOne The entity of foreign property(referrer-as-one) 'adminAsOne'. (NullAllowed)
     */
    public void setAdminAsOne(Admin adminAsOne) {
        _adminAsOne = adminAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** enterprise by your user_id, named 'enterpriseList'. */
    protected List<Enterprise> _enterpriseList;

    /**
     * enterprise by your user_id, named 'enterpriseList'.
     * @return The entity list of referrer property 'enterpriseList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<Enterprise> getEnterpriseList() {
        if (_enterpriseList == null) { _enterpriseList = newReferrerList(); }
        return _enterpriseList;
    }

    /**
     * enterprise by your user_id, named 'enterpriseList'.
     * @param enterpriseList The entity list of referrer property 'enterpriseList'. (NullAllowed)
     */
    public void setEnterpriseList(List<Enterprise> enterpriseList) {
        _enterpriseList = enterpriseList;
    }

    /** school by your user_id, named 'schoolList'. */
    protected List<School> _schoolList;

    /**
     * school by your user_id, named 'schoolList'.
     * @return The entity list of referrer property 'schoolList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<School> getSchoolList() {
        if (_schoolList == null) { _schoolList = newReferrerList(); }
        return _schoolList;
    }

    /**
     * school by your user_id, named 'schoolList'.
     * @param schoolList The entity list of referrer property 'schoolList'. (NullAllowed)
     */
    public void setSchoolList(List<School> schoolList) {
        _schoolList = schoolList;
    }

    /** student by your user_id, named 'studentList'. */
    protected List<Student> _studentList;

    /**
     * student by your user_id, named 'studentList'.
     * @return The entity list of referrer property 'studentList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<Student> getStudentList() {
        if (_studentList == null) { _studentList = newReferrerList(); }
        return _studentList;
    }

    /**
     * student by your user_id, named 'studentList'.
     * @param studentList The entity list of referrer property 'studentList'. (NullAllowed)
     */
    public void setStudentList(List<Student> studentList) {
        _studentList = studentList;
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
        if (other == null || !(other instanceof BsLogin)) { return false; }
        BsLogin otherEntity = (BsLogin)other;
        if (!xSV(getUserId(), otherEntity.getUserId())) { return false; }
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
        result = xCH(result, getUserId());
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
        if (_adminAsOne != null)
        { sb.append(l).append(xbRDS(_adminAsOne, "adminAsOne")); }
        if (_enterpriseList != null) { for (Entity e : _enterpriseList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "enterpriseList")); } } }
        if (_schoolList != null) { for (Entity e : _schoolList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "schoolList")); } } }
        if (_studentList != null) { for (Entity e : _studentList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "studentList")); } } }
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
        sb.append(delimiter).append(getUserId());
        sb.append(delimiter).append(getUserPass());
        sb.append(delimiter).append(getRole());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_adminAsOne != null) { sb.append(c).append("adminAsOne"); }
        if (_enterpriseList != null && !_enterpriseList.isEmpty())
        { sb.append(c).append("enterpriseList"); }
        if (_schoolList != null && !_schoolList.isEmpty())
        { sb.append(c).append("schoolList"); }
        if (_studentList != null && !_studentList.isEmpty())
        { sb.append(c).append("studentList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Login clone() {
        try {
            return (Login)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, NotNull, VARCHAR(12)} <br />
     * @return The value of the column 'user_id'. (NullAllowed)
     */
    public String getUserId() {
        return _userId;
    }

    /**
     * [set] user_id: {PK, NotNull, VARCHAR(12)} <br />
     * @param userId The value of the column 'user_id'. (NullAllowed)
     */
    public void setUserId(String userId) {
        __modifiedProperties.addPropertyName("userId");
        this._userId = userId;
    }

    /**
     * [get] user_pass: {NotNull, VARCHAR(256)} <br />
     * @return The value of the column 'user_pass'. (NullAllowed)
     */
    public String getUserPass() {
        return _userPass;
    }

    /**
     * [set] user_pass: {NotNull, VARCHAR(256)} <br />
     * @param userPass The value of the column 'user_pass'. (NullAllowed)
     */
    public void setUserPass(String userPass) {
        __modifiedProperties.addPropertyName("userPass");
        this._userPass = userPass;
    }

    /**
     * [get] role: {NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'role'. (NullAllowed)
     */
    public Integer getRole() {
        return _role;
    }

    /**
     * [set] role: {NotNull, INT UNSIGNED(10)} <br />
     * @param role The value of the column 'role'. (NullAllowed)
     */
    public void setRole(Integer role) {
        __modifiedProperties.addPropertyName("role");
        this._role = role;
    }
}
