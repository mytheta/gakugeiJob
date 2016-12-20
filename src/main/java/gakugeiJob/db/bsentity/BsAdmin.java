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
 * The entity of admin as TABLE. <br />
 * <pre>
 * [primary-key]
 *     user_id
 * 
 * [column]
 *     user_id, admin_pass1, admin_pass2
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
 *     login
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String userId = entity.getUserId();
 * String adminPass1 = entity.getAdminPass1();
 * String adminPass2 = entity.getAdminPass2();
 * entity.setUserId(userId);
 * entity.setAdminPass1(adminPass1);
 * entity.setAdminPass2(adminPass2);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsAdmin implements Entity, Serializable, Cloneable {

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
    /** user_id: {PK, NotNull, VARCHAR(12), FK to login} */
    protected String _userId;

    /** admin_pass1: {NotNull, VARCHAR(256)} */
    protected String _adminPass1;

    /** admin_pass2: {NotNull, VARCHAR(256)} */
    protected String _adminPass2;

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
        return "admin";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "admin";
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
        if (other == null || !(other instanceof BsAdmin)) { return false; }
        BsAdmin otherEntity = (BsAdmin)other;
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
        if (_login != null)
        { sb.append(l).append(xbRDS(_login, "login")); }
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
        sb.append(delimiter).append(getAdminPass1());
        sb.append(delimiter).append(getAdminPass2());
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
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Admin clone() {
        try {
            return (Admin)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, NotNull, VARCHAR(12), FK to login} <br />
     * @return The value of the column 'user_id'. (NullAllowed)
     */
    public String getUserId() {
        return _userId;
    }

    /**
     * [set] user_id: {PK, NotNull, VARCHAR(12), FK to login} <br />
     * @param userId The value of the column 'user_id'. (NullAllowed)
     */
    public void setUserId(String userId) {
        __modifiedProperties.addPropertyName("userId");
        this._userId = userId;
    }

    /**
     * [get] admin_pass1: {NotNull, VARCHAR(256)} <br />
     * @return The value of the column 'admin_pass1'. (NullAllowed)
     */
    public String getAdminPass1() {
        return _adminPass1;
    }

    /**
     * [set] admin_pass1: {NotNull, VARCHAR(256)} <br />
     * @param adminPass1 The value of the column 'admin_pass1'. (NullAllowed)
     */
    public void setAdminPass1(String adminPass1) {
        __modifiedProperties.addPropertyName("adminPass1");
        this._adminPass1 = adminPass1;
    }

    /**
     * [get] admin_pass2: {NotNull, VARCHAR(256)} <br />
     * @return The value of the column 'admin_pass2'. (NullAllowed)
     */
    public String getAdminPass2() {
        return _adminPass2;
    }

    /**
     * [set] admin_pass2: {NotNull, VARCHAR(256)} <br />
     * @param adminPass2 The value of the column 'admin_pass2'. (NullAllowed)
     */
    public void setAdminPass2(String adminPass2) {
        __modifiedProperties.addPropertyName("adminPass2");
        this._adminPass2 = adminPass2;
    }
}
