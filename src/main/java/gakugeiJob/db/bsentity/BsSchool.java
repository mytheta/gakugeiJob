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
 * The entity of school as TABLE. <br />
 * <pre>
 * [primary-key]
 *     school_id
 * 
 * [column]
 *     school_id, user_id, name, kinds, phone_number, mail_address, url, one_thing
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     school_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     login
 * 
 * [referrer table]
 *     school_offer
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     schoolOfferList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer schoolId = entity.getSchoolId();
 * String userId = entity.getUserId();
 * String name = entity.getName();
 * String kinds = entity.getKinds();
 * String phoneNumber = entity.getPhoneNumber();
 * String mailAddress = entity.getMailAddress();
 * String url = entity.getUrl();
 * String oneThing = entity.getOneThing();
 * entity.setSchoolId(schoolId);
 * entity.setUserId(userId);
 * entity.setName(name);
 * entity.setKinds(kinds);
 * entity.setPhoneNumber(phoneNumber);
 * entity.setMailAddress(mailAddress);
 * entity.setUrl(url);
 * entity.setOneThing(oneThing);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSchool implements Entity, Serializable, Cloneable {

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
    /** school_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _schoolId;

    /** user_id: {IX, VARCHAR(12), FK to login} */
    protected String _userId;

    /** name: {NotNull, VARCHAR(50)} */
    protected String _name;

    /** kinds: {VARCHAR(20)} */
    protected String _kinds;

    /** phone_number: {NotNull, VARCHAR(12)} */
    protected String _phoneNumber;

    /** mail_address: {NotNull, VARCHAR(100)} */
    protected String _mailAddress;

    /** url: {VARCHAR(100)} */
    protected String _url;

    /** one_thing: {VARCHAR(100)} */
    protected String _oneThing;

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
        return "school";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "school";
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
        if (getSchoolId() == null) { return false; }
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
    /** school_offer by your school_id, named 'schoolOfferList'. */
    protected List<SchoolOffer> _schoolOfferList;

    /**
     * school_offer by your school_id, named 'schoolOfferList'.
     * @return The entity list of referrer property 'schoolOfferList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<SchoolOffer> getSchoolOfferList() {
        if (_schoolOfferList == null) { _schoolOfferList = newReferrerList(); }
        return _schoolOfferList;
    }

    /**
     * school_offer by your school_id, named 'schoolOfferList'.
     * @param schoolOfferList The entity list of referrer property 'schoolOfferList'. (NullAllowed)
     */
    public void setSchoolOfferList(List<SchoolOffer> schoolOfferList) {
        _schoolOfferList = schoolOfferList;
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
        if (other == null || !(other instanceof BsSchool)) { return false; }
        BsSchool otherEntity = (BsSchool)other;
        if (!xSV(getSchoolId(), otherEntity.getSchoolId())) { return false; }
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
        result = xCH(result, getSchoolId());
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
        if (_schoolOfferList != null) { for (Entity e : _schoolOfferList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "schoolOfferList")); } } }
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
        sb.append(delimiter).append(getSchoolId());
        sb.append(delimiter).append(getUserId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getKinds());
        sb.append(delimiter).append(getPhoneNumber());
        sb.append(delimiter).append(getMailAddress());
        sb.append(delimiter).append(getUrl());
        sb.append(delimiter).append(getOneThing());
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
        if (_schoolOfferList != null && !_schoolOfferList.isEmpty())
        { sb.append(c).append("schoolOfferList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public School clone() {
        try {
            return (School)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] school_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'school_id'. (NullAllowed)
     */
    public Integer getSchoolId() {
        return _schoolId;
    }

    /**
     * [set] school_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @param schoolId The value of the column 'school_id'. (NullAllowed)
     */
    public void setSchoolId(Integer schoolId) {
        __modifiedProperties.addPropertyName("schoolId");
        this._schoolId = schoolId;
    }

    /**
     * [get] user_id: {IX, VARCHAR(12), FK to login} <br />
     * @return The value of the column 'user_id'. (NullAllowed)
     */
    public String getUserId() {
        return _userId;
    }

    /**
     * [set] user_id: {IX, VARCHAR(12), FK to login} <br />
     * @param userId The value of the column 'user_id'. (NullAllowed)
     */
    public void setUserId(String userId) {
        __modifiedProperties.addPropertyName("userId");
        this._userId = userId;
    }

    /**
     * [get] name: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'name'. (NullAllowed)
     */
    public String getName() {
        return _name;
    }

    /**
     * [set] name: {NotNull, VARCHAR(50)} <br />
     * @param name The value of the column 'name'. (NullAllowed)
     */
    public void setName(String name) {
        __modifiedProperties.addPropertyName("name");
        this._name = name;
    }

    /**
     * [get] kinds: {VARCHAR(20)} <br />
     * @return The value of the column 'kinds'. (NullAllowed)
     */
    public String getKinds() {
        return _kinds;
    }

    /**
     * [set] kinds: {VARCHAR(20)} <br />
     * @param kinds The value of the column 'kinds'. (NullAllowed)
     */
    public void setKinds(String kinds) {
        __modifiedProperties.addPropertyName("kinds");
        this._kinds = kinds;
    }

    /**
     * [get] phone_number: {NotNull, VARCHAR(12)} <br />
     * @return The value of the column 'phone_number'. (NullAllowed)
     */
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    /**
     * [set] phone_number: {NotNull, VARCHAR(12)} <br />
     * @param phoneNumber The value of the column 'phone_number'. (NullAllowed)
     */
    public void setPhoneNumber(String phoneNumber) {
        __modifiedProperties.addPropertyName("phoneNumber");
        this._phoneNumber = phoneNumber;
    }

    /**
     * [get] mail_address: {NotNull, VARCHAR(100)} <br />
     * @return The value of the column 'mail_address'. (NullAllowed)
     */
    public String getMailAddress() {
        return _mailAddress;
    }

    /**
     * [set] mail_address: {NotNull, VARCHAR(100)} <br />
     * @param mailAddress The value of the column 'mail_address'. (NullAllowed)
     */
    public void setMailAddress(String mailAddress) {
        __modifiedProperties.addPropertyName("mailAddress");
        this._mailAddress = mailAddress;
    }

    /**
     * [get] url: {VARCHAR(100)} <br />
     * @return The value of the column 'url'. (NullAllowed)
     */
    public String getUrl() {
        return _url;
    }

    /**
     * [set] url: {VARCHAR(100)} <br />
     * @param url The value of the column 'url'. (NullAllowed)
     */
    public void setUrl(String url) {
        __modifiedProperties.addPropertyName("url");
        this._url = url;
    }

    /**
     * [get] one_thing: {VARCHAR(100)} <br />
     * @return The value of the column 'one_thing'. (NullAllowed)
     */
    public String getOneThing() {
        return _oneThing;
    }

    /**
     * [set] one_thing: {VARCHAR(100)} <br />
     * @param oneThing The value of the column 'one_thing'. (NullAllowed)
     */
    public void setOneThing(String oneThing) {
        __modifiedProperties.addPropertyName("oneThing");
        this._oneThing = oneThing;
    }
}
