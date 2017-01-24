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
 * The entity of enterprise as TABLE. <br />
 * <pre>
 * [primary-key]
 *     enterprise_id
 * 
 * [column]
 *     enterprise_id, user_id, name, founding_date, founder_name, address, capital, president_name, num_of_employees, business, phone_number, url, one_thing, mail_address
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     enterprise_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     login
 * 
 * [referrer table]
 *     enterprise_offer
 * 
 * [foreign property]
 *     login
 * 
 * [referrer property]
 *     enterpriseOfferList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer enterpriseId = entity.getEnterpriseId();
 * String userId = entity.getUserId();
 * String name = entity.getName();
 * String foundingDate = entity.getFoundingDate();
 * String founderName = entity.getFounderName();
 * String address = entity.getAddress();
 * String capital = entity.getCapital();
 * String presidentName = entity.getPresidentName();
 * String numOfEmployees = entity.getNumOfEmployees();
 * String business = entity.getBusiness();
 * String phoneNumber = entity.getPhoneNumber();
 * String url = entity.getUrl();
 * String oneThing = entity.getOneThing();
 * String mailAddress = entity.getMailAddress();
 * entity.setEnterpriseId(enterpriseId);
 * entity.setUserId(userId);
 * entity.setName(name);
 * entity.setFoundingDate(foundingDate);
 * entity.setFounderName(founderName);
 * entity.setAddress(address);
 * entity.setCapital(capital);
 * entity.setPresidentName(presidentName);
 * entity.setNumOfEmployees(numOfEmployees);
 * entity.setBusiness(business);
 * entity.setPhoneNumber(phoneNumber);
 * entity.setUrl(url);
 * entity.setOneThing(oneThing);
 * entity.setMailAddress(mailAddress);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEnterprise implements Entity, Serializable, Cloneable {

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
    /** enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _enterpriseId;

    /** user_id: {IX, NotNull, VARCHAR(12), FK to login} */
    protected String _userId;

    /** name: {NotNull, VARCHAR(50)} */
    protected String _name;

    /** founding_date: {VARCHAR(20)} */
    protected String _foundingDate;

    /** founder_name: {VARCHAR(20)} */
    protected String _founderName;

    /** address: {VARCHAR(100)} */
    protected String _address;

    /** capital: {VARCHAR(20)} */
    protected String _capital;

    /** president_name: {VARCHAR(20)} */
    protected String _presidentName;

    /** num_of_employees: {VARCHAR(20)} */
    protected String _numOfEmployees;

    /** business: {VARCHAR(20)} */
    protected String _business;

    /** phone_number: {NotNull, VARCHAR(12)} */
    protected String _phoneNumber;

    /** url: {VARCHAR(100)} */
    protected String _url;

    /** one_thing: {VARCHAR(100)} */
    protected String _oneThing;

    /** mail_address: {NotNull, VARCHAR(100)} */
    protected String _mailAddress;

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
        return "enterprise";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "enterprise";
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
        if (getEnterpriseId() == null) { return false; }
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
    /** enterprise_offer by your enterprise_id, named 'enterpriseOfferList'. */
    protected List<EnterpriseOffer> _enterpriseOfferList;

    /**
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferList'.
     * @return The entity list of referrer property 'enterpriseOfferList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<EnterpriseOffer> getEnterpriseOfferList() {
        if (_enterpriseOfferList == null) { _enterpriseOfferList = newReferrerList(); }
        return _enterpriseOfferList;
    }

    /**
     * enterprise_offer by your enterprise_id, named 'enterpriseOfferList'.
     * @param enterpriseOfferList The entity list of referrer property 'enterpriseOfferList'. (NullAllowed)
     */
    public void setEnterpriseOfferList(List<EnterpriseOffer> enterpriseOfferList) {
        _enterpriseOfferList = enterpriseOfferList;
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
        if (other == null || !(other instanceof BsEnterprise)) { return false; }
        BsEnterprise otherEntity = (BsEnterprise)other;
        if (!xSV(getEnterpriseId(), otherEntity.getEnterpriseId())) { return false; }
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
        result = xCH(result, getEnterpriseId());
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
        if (_enterpriseOfferList != null) { for (Entity e : _enterpriseOfferList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "enterpriseOfferList")); } } }
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
        sb.append(delimiter).append(getEnterpriseId());
        sb.append(delimiter).append(getUserId());
        sb.append(delimiter).append(getName());
        sb.append(delimiter).append(getFoundingDate());
        sb.append(delimiter).append(getFounderName());
        sb.append(delimiter).append(getAddress());
        sb.append(delimiter).append(getCapital());
        sb.append(delimiter).append(getPresidentName());
        sb.append(delimiter).append(getNumOfEmployees());
        sb.append(delimiter).append(getBusiness());
        sb.append(delimiter).append(getPhoneNumber());
        sb.append(delimiter).append(getUrl());
        sb.append(delimiter).append(getOneThing());
        sb.append(delimiter).append(getMailAddress());
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
        if (_enterpriseOfferList != null && !_enterpriseOfferList.isEmpty())
        { sb.append(c).append("enterpriseOfferList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Enterprise clone() {
        try {
            return (Enterprise)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'enterprise_id'. (NullAllowed)
     */
    public Integer getEnterpriseId() {
        return _enterpriseId;
    }

    /**
     * [set] enterprise_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @param enterpriseId The value of the column 'enterprise_id'. (NullAllowed)
     */
    public void setEnterpriseId(Integer enterpriseId) {
        __modifiedProperties.addPropertyName("enterpriseId");
        this._enterpriseId = enterpriseId;
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
     * [get] founding_date: {VARCHAR(20)} <br />
     * @return The value of the column 'founding_date'. (NullAllowed)
     */
    public String getFoundingDate() {
        return _foundingDate;
    }

    /**
     * [set] founding_date: {VARCHAR(20)} <br />
     * @param foundingDate The value of the column 'founding_date'. (NullAllowed)
     */
    public void setFoundingDate(String foundingDate) {
        __modifiedProperties.addPropertyName("foundingDate");
        this._foundingDate = foundingDate;
    }

    /**
     * [get] founder_name: {VARCHAR(20)} <br />
     * @return The value of the column 'founder_name'. (NullAllowed)
     */
    public String getFounderName() {
        return _founderName;
    }

    /**
     * [set] founder_name: {VARCHAR(20)} <br />
     * @param founderName The value of the column 'founder_name'. (NullAllowed)
     */
    public void setFounderName(String founderName) {
        __modifiedProperties.addPropertyName("founderName");
        this._founderName = founderName;
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

    /**
     * [get] capital: {VARCHAR(20)} <br />
     * @return The value of the column 'capital'. (NullAllowed)
     */
    public String getCapital() {
        return _capital;
    }

    /**
     * [set] capital: {VARCHAR(20)} <br />
     * @param capital The value of the column 'capital'. (NullAllowed)
     */
    public void setCapital(String capital) {
        __modifiedProperties.addPropertyName("capital");
        this._capital = capital;
    }

    /**
     * [get] president_name: {VARCHAR(20)} <br />
     * @return The value of the column 'president_name'. (NullAllowed)
     */
    public String getPresidentName() {
        return _presidentName;
    }

    /**
     * [set] president_name: {VARCHAR(20)} <br />
     * @param presidentName The value of the column 'president_name'. (NullAllowed)
     */
    public void setPresidentName(String presidentName) {
        __modifiedProperties.addPropertyName("presidentName");
        this._presidentName = presidentName;
    }

    /**
     * [get] num_of_employees: {VARCHAR(20)} <br />
     * @return The value of the column 'num_of_employees'. (NullAllowed)
     */
    public String getNumOfEmployees() {
        return _numOfEmployees;
    }

    /**
     * [set] num_of_employees: {VARCHAR(20)} <br />
     * @param numOfEmployees The value of the column 'num_of_employees'. (NullAllowed)
     */
    public void setNumOfEmployees(String numOfEmployees) {
        __modifiedProperties.addPropertyName("numOfEmployees");
        this._numOfEmployees = numOfEmployees;
    }

    /**
     * [get] business: {VARCHAR(20)} <br />
     * @return The value of the column 'business'. (NullAllowed)
     */
    public String getBusiness() {
        return _business;
    }

    /**
     * [set] business: {VARCHAR(20)} <br />
     * @param business The value of the column 'business'. (NullAllowed)
     */
    public void setBusiness(String business) {
        __modifiedProperties.addPropertyName("business");
        this._business = business;
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
}
