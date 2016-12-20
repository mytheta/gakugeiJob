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
 * The entity of enterprise_offer as TABLE. <br />
 * <pre>
 * [primary-key]
 *     job_offer_id
 * 
 * [column]
 *     job_offer_id, enterprise_id, description, office_name, address, station, period, holiday, working_time, salary, qualification, welfare, one_thing, favo, registration_date
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     job_offer_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     enterprise
 * 
 * [referrer table]
 *     enterprise_aplicant, enterprise_favo
 * 
 * [foreign property]
 *     enterprise
 * 
 * [referrer property]
 *     enterpriseAplicantList, enterpriseFavoList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer jobOfferId = entity.getJobOfferId();
 * Integer enterpriseId = entity.getEnterpriseId();
 * String description = entity.getDescription();
 * String officeName = entity.getOfficeName();
 * String address = entity.getAddress();
 * String station = entity.getStation();
 * String period = entity.getPeriod();
 * String holiday = entity.getHoliday();
 * String workingTime = entity.getWorkingTime();
 * String salary = entity.getSalary();
 * String qualification = entity.getQualification();
 * String welfare = entity.getWelfare();
 * String oneThing = entity.getOneThing();
 * Integer favo = entity.getFavo();
 * java.sql.Timestamp registrationDate = entity.getRegistrationDate();
 * entity.setJobOfferId(jobOfferId);
 * entity.setEnterpriseId(enterpriseId);
 * entity.setDescription(description);
 * entity.setOfficeName(officeName);
 * entity.setAddress(address);
 * entity.setStation(station);
 * entity.setPeriod(period);
 * entity.setHoliday(holiday);
 * entity.setWorkingTime(workingTime);
 * entity.setSalary(salary);
 * entity.setQualification(qualification);
 * entity.setWelfare(welfare);
 * entity.setOneThing(oneThing);
 * entity.setFavo(favo);
 * entity.setRegistrationDate(registrationDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEnterpriseOffer implements Entity, Serializable, Cloneable {

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
    /** job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _jobOfferId;

    /** enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise} */
    protected Integer _enterpriseId;

    /** description: {NotNull, VARCHAR(1000)} */
    protected String _description;

    /** office_name: {NotNull, VARCHAR(50)} */
    protected String _officeName;

    /** address: {VARCHAR(100)} */
    protected String _address;

    /** station: {VARCHAR(100)} */
    protected String _station;

    /** period: {VARCHAR(100)} */
    protected String _period;

    /** holiday: {VARCHAR(100)} */
    protected String _holiday;

    /** working_time: {VARCHAR(100)} */
    protected String _workingTime;

    /** salary: {NotNull, VARCHAR(100)} */
    protected String _salary;

    /** qualification: {VARCHAR(100)} */
    protected String _qualification;

    /** welfare: {VARCHAR(100)} */
    protected String _welfare;

    /** one_thing: {VARCHAR(100)} */
    protected String _oneThing;

    /** favo: {INT UNSIGNED(10)} */
    protected Integer _favo;

    /** registration_date: {DATETIME(19)} */
    protected java.sql.Timestamp _registrationDate;

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
        return "enterprise_offer";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "enterpriseOffer";
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
        if (getJobOfferId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** enterprise by my enterprise_id, named 'enterprise'. */
    protected Enterprise _enterprise;

    /**
     * enterprise by my enterprise_id, named 'enterprise'.
     * @return The entity of foreign property 'enterprise'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public Enterprise getEnterprise() {
        return _enterprise;
    }

    /**
     * enterprise by my enterprise_id, named 'enterprise'.
     * @param enterprise The entity of foreign property 'enterprise'. (NullAllowed)
     */
    public void setEnterprise(Enterprise enterprise) {
        _enterprise = enterprise;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantList'. */
    protected List<EnterpriseAplicant> _enterpriseAplicantList;

    /**
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantList'.
     * @return The entity list of referrer property 'enterpriseAplicantList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<EnterpriseAplicant> getEnterpriseAplicantList() {
        if (_enterpriseAplicantList == null) { _enterpriseAplicantList = newReferrerList(); }
        return _enterpriseAplicantList;
    }

    /**
     * enterprise_aplicant by your job_offer_id, named 'enterpriseAplicantList'.
     * @param enterpriseAplicantList The entity list of referrer property 'enterpriseAplicantList'. (NullAllowed)
     */
    public void setEnterpriseAplicantList(List<EnterpriseAplicant> enterpriseAplicantList) {
        _enterpriseAplicantList = enterpriseAplicantList;
    }

    /** enterprise_favo by your job_offer_id, named 'enterpriseFavoList'. */
    protected List<EnterpriseFavo> _enterpriseFavoList;

    /**
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoList'.
     * @return The entity list of referrer property 'enterpriseFavoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<EnterpriseFavo> getEnterpriseFavoList() {
        if (_enterpriseFavoList == null) { _enterpriseFavoList = newReferrerList(); }
        return _enterpriseFavoList;
    }

    /**
     * enterprise_favo by your job_offer_id, named 'enterpriseFavoList'.
     * @param enterpriseFavoList The entity list of referrer property 'enterpriseFavoList'. (NullAllowed)
     */
    public void setEnterpriseFavoList(List<EnterpriseFavo> enterpriseFavoList) {
        _enterpriseFavoList = enterpriseFavoList;
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
        if (other == null || !(other instanceof BsEnterpriseOffer)) { return false; }
        BsEnterpriseOffer otherEntity = (BsEnterpriseOffer)other;
        if (!xSV(getJobOfferId(), otherEntity.getJobOfferId())) { return false; }
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
        result = xCH(result, getJobOfferId());
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
        if (_enterprise != null)
        { sb.append(l).append(xbRDS(_enterprise, "enterprise")); }
        if (_enterpriseAplicantList != null) { for (Entity e : _enterpriseAplicantList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "enterpriseAplicantList")); } } }
        if (_enterpriseFavoList != null) { for (Entity e : _enterpriseFavoList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "enterpriseFavoList")); } } }
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
        sb.append(delimiter).append(getJobOfferId());
        sb.append(delimiter).append(getEnterpriseId());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getOfficeName());
        sb.append(delimiter).append(getAddress());
        sb.append(delimiter).append(getStation());
        sb.append(delimiter).append(getPeriod());
        sb.append(delimiter).append(getHoliday());
        sb.append(delimiter).append(getWorkingTime());
        sb.append(delimiter).append(getSalary());
        sb.append(delimiter).append(getQualification());
        sb.append(delimiter).append(getWelfare());
        sb.append(delimiter).append(getOneThing());
        sb.append(delimiter).append(getFavo());
        sb.append(delimiter).append(getRegistrationDate());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_enterprise != null) { sb.append(c).append("enterprise"); }
        if (_enterpriseAplicantList != null && !_enterpriseAplicantList.isEmpty())
        { sb.append(c).append("enterpriseAplicantList"); }
        if (_enterpriseFavoList != null && !_enterpriseFavoList.isEmpty())
        { sb.append(c).append("enterpriseFavoList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public EnterpriseOffer clone() {
        try {
            return (EnterpriseOffer)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'job_offer_id'. (NullAllowed)
     */
    public Integer getJobOfferId() {
        return _jobOfferId;
    }

    /**
     * [set] job_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @param jobOfferId The value of the column 'job_offer_id'. (NullAllowed)
     */
    public void setJobOfferId(Integer jobOfferId) {
        __modifiedProperties.addPropertyName("jobOfferId");
        this._jobOfferId = jobOfferId;
    }

    /**
     * [get] enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise} <br />
     * @return The value of the column 'enterprise_id'. (NullAllowed)
     */
    public Integer getEnterpriseId() {
        return _enterpriseId;
    }

    /**
     * [set] enterprise_id: {IX, INT UNSIGNED(10), FK to enterprise} <br />
     * @param enterpriseId The value of the column 'enterprise_id'. (NullAllowed)
     */
    public void setEnterpriseId(Integer enterpriseId) {
        __modifiedProperties.addPropertyName("enterpriseId");
        this._enterpriseId = enterpriseId;
    }

    /**
     * [get] description: {NotNull, VARCHAR(1000)} <br />
     * @return The value of the column 'description'. (NullAllowed)
     */
    public String getDescription() {
        return _description;
    }

    /**
     * [set] description: {NotNull, VARCHAR(1000)} <br />
     * @param description The value of the column 'description'. (NullAllowed)
     */
    public void setDescription(String description) {
        __modifiedProperties.addPropertyName("description");
        this._description = description;
    }

    /**
     * [get] office_name: {NotNull, VARCHAR(50)} <br />
     * @return The value of the column 'office_name'. (NullAllowed)
     */
    public String getOfficeName() {
        return _officeName;
    }

    /**
     * [set] office_name: {NotNull, VARCHAR(50)} <br />
     * @param officeName The value of the column 'office_name'. (NullAllowed)
     */
    public void setOfficeName(String officeName) {
        __modifiedProperties.addPropertyName("officeName");
        this._officeName = officeName;
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
     * [get] station: {VARCHAR(100)} <br />
     * @return The value of the column 'station'. (NullAllowed)
     */
    public String getStation() {
        return _station;
    }

    /**
     * [set] station: {VARCHAR(100)} <br />
     * @param station The value of the column 'station'. (NullAllowed)
     */
    public void setStation(String station) {
        __modifiedProperties.addPropertyName("station");
        this._station = station;
    }

    /**
     * [get] period: {VARCHAR(100)} <br />
     * @return The value of the column 'period'. (NullAllowed)
     */
    public String getPeriod() {
        return _period;
    }

    /**
     * [set] period: {VARCHAR(100)} <br />
     * @param period The value of the column 'period'. (NullAllowed)
     */
    public void setPeriod(String period) {
        __modifiedProperties.addPropertyName("period");
        this._period = period;
    }

    /**
     * [get] holiday: {VARCHAR(100)} <br />
     * @return The value of the column 'holiday'. (NullAllowed)
     */
    public String getHoliday() {
        return _holiday;
    }

    /**
     * [set] holiday: {VARCHAR(100)} <br />
     * @param holiday The value of the column 'holiday'. (NullAllowed)
     */
    public void setHoliday(String holiday) {
        __modifiedProperties.addPropertyName("holiday");
        this._holiday = holiday;
    }

    /**
     * [get] working_time: {VARCHAR(100)} <br />
     * @return The value of the column 'working_time'. (NullAllowed)
     */
    public String getWorkingTime() {
        return _workingTime;
    }

    /**
     * [set] working_time: {VARCHAR(100)} <br />
     * @param workingTime The value of the column 'working_time'. (NullAllowed)
     */
    public void setWorkingTime(String workingTime) {
        __modifiedProperties.addPropertyName("workingTime");
        this._workingTime = workingTime;
    }

    /**
     * [get] salary: {NotNull, VARCHAR(100)} <br />
     * @return The value of the column 'salary'. (NullAllowed)
     */
    public String getSalary() {
        return _salary;
    }

    /**
     * [set] salary: {NotNull, VARCHAR(100)} <br />
     * @param salary The value of the column 'salary'. (NullAllowed)
     */
    public void setSalary(String salary) {
        __modifiedProperties.addPropertyName("salary");
        this._salary = salary;
    }

    /**
     * [get] qualification: {VARCHAR(100)} <br />
     * @return The value of the column 'qualification'. (NullAllowed)
     */
    public String getQualification() {
        return _qualification;
    }

    /**
     * [set] qualification: {VARCHAR(100)} <br />
     * @param qualification The value of the column 'qualification'. (NullAllowed)
     */
    public void setQualification(String qualification) {
        __modifiedProperties.addPropertyName("qualification");
        this._qualification = qualification;
    }

    /**
     * [get] welfare: {VARCHAR(100)} <br />
     * @return The value of the column 'welfare'. (NullAllowed)
     */
    public String getWelfare() {
        return _welfare;
    }

    /**
     * [set] welfare: {VARCHAR(100)} <br />
     * @param welfare The value of the column 'welfare'. (NullAllowed)
     */
    public void setWelfare(String welfare) {
        __modifiedProperties.addPropertyName("welfare");
        this._welfare = welfare;
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
     * [get] favo: {INT UNSIGNED(10)} <br />
     * @return The value of the column 'favo'. (NullAllowed)
     */
    public Integer getFavo() {
        return _favo;
    }

    /**
     * [set] favo: {INT UNSIGNED(10)} <br />
     * @param favo The value of the column 'favo'. (NullAllowed)
     */
    public void setFavo(Integer favo) {
        __modifiedProperties.addPropertyName("favo");
        this._favo = favo;
    }

    /**
     * [get] registration_date: {DATETIME(19)} <br />
     * @return The value of the column 'registration_date'. (NullAllowed)
     */
    public java.sql.Timestamp getRegistrationDate() {
        return _registrationDate;
    }

    /**
     * [set] registration_date: {DATETIME(19)} <br />
     * @param registrationDate The value of the column 'registration_date'. (NullAllowed)
     */
    public void setRegistrationDate(java.sql.Timestamp registrationDate) {
        __modifiedProperties.addPropertyName("registrationDate");
        this._registrationDate = registrationDate;
    }
}
