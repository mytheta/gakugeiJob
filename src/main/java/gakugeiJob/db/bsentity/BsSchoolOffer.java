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
 * The entity of school_offer as TABLE. <br />
 * <pre>
 * [primary-key]
 *     school_offer_id
 * 
 * [column]
 *     school_offer_id, school_id, description, salary, work_schedule, period, address, station, qualification, welfare, one_thing, favo, registration_date
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     school_offer_id
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     school
 * 
 * [referrer table]
 *     school_aplicant, school_favo
 * 
 * [foreign property]
 *     school
 * 
 * [referrer property]
 *     schoolAplicantList, schoolFavoList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer schoolOfferId = entity.getSchoolOfferId();
 * Integer schoolId = entity.getSchoolId();
 * String description = entity.getDescription();
 * String salary = entity.getSalary();
 * String workSchedule = entity.getWorkSchedule();
 * String period = entity.getPeriod();
 * String address = entity.getAddress();
 * String station = entity.getStation();
 * String qualification = entity.getQualification();
 * String welfare = entity.getWelfare();
 * String oneThing = entity.getOneThing();
 * Integer favo = entity.getFavo();
 * java.sql.Timestamp registrationDate = entity.getRegistrationDate();
 * entity.setSchoolOfferId(schoolOfferId);
 * entity.setSchoolId(schoolId);
 * entity.setDescription(description);
 * entity.setSalary(salary);
 * entity.setWorkSchedule(workSchedule);
 * entity.setPeriod(period);
 * entity.setAddress(address);
 * entity.setStation(station);
 * entity.setQualification(qualification);
 * entity.setWelfare(welfare);
 * entity.setOneThing(oneThing);
 * entity.setFavo(favo);
 * entity.setRegistrationDate(registrationDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSchoolOffer implements Entity, Serializable, Cloneable {

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
    /** school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _schoolOfferId;

    /** school_id: {IX, INT UNSIGNED(10), FK to school} */
    protected Integer _schoolId;

    /** description: {NotNull, VARCHAR(1000)} */
    protected String _description;

    /** salary: {NotNull, VARCHAR(100)} */
    protected String _salary;

    /** work_schedule: {VARCHAR(100)} */
    protected String _workSchedule;

    /** period: {VARCHAR(100)} */
    protected String _period;

    /** address: {VARCHAR(100)} */
    protected String _address;

    /** station: {VARCHAR(100)} */
    protected String _station;

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
        return "school_offer";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "schoolOffer";
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
        if (getSchoolOfferId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** school by my school_id, named 'school'. */
    protected School _school;

    /**
     * school by my school_id, named 'school'.
     * @return The entity of foreign property 'school'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public School getSchool() {
        return _school;
    }

    /**
     * school by my school_id, named 'school'.
     * @param school The entity of foreign property 'school'. (NullAllowed)
     */
    public void setSchool(School school) {
        _school = school;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** school_aplicant by your school_offer_id, named 'schoolAplicantList'. */
    protected List<SchoolAplicant> _schoolAplicantList;

    /**
     * school_aplicant by your school_offer_id, named 'schoolAplicantList'.
     * @return The entity list of referrer property 'schoolAplicantList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<SchoolAplicant> getSchoolAplicantList() {
        if (_schoolAplicantList == null) { _schoolAplicantList = newReferrerList(); }
        return _schoolAplicantList;
    }

    /**
     * school_aplicant by your school_offer_id, named 'schoolAplicantList'.
     * @param schoolAplicantList The entity list of referrer property 'schoolAplicantList'. (NullAllowed)
     */
    public void setSchoolAplicantList(List<SchoolAplicant> schoolAplicantList) {
        _schoolAplicantList = schoolAplicantList;
    }

    /** school_favo by your school_offer_id, named 'schoolFavoList'. */
    protected List<SchoolFavo> _schoolFavoList;

    /**
     * school_favo by your school_offer_id, named 'schoolFavoList'.
     * @return The entity list of referrer property 'schoolFavoList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<SchoolFavo> getSchoolFavoList() {
        if (_schoolFavoList == null) { _schoolFavoList = newReferrerList(); }
        return _schoolFavoList;
    }

    /**
     * school_favo by your school_offer_id, named 'schoolFavoList'.
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
        if (other == null || !(other instanceof BsSchoolOffer)) { return false; }
        BsSchoolOffer otherEntity = (BsSchoolOffer)other;
        if (!xSV(getSchoolOfferId(), otherEntity.getSchoolOfferId())) { return false; }
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
        result = xCH(result, getSchoolOfferId());
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
        if (_school != null)
        { sb.append(l).append(xbRDS(_school, "school")); }
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
        sb.append(delimiter).append(getSchoolOfferId());
        sb.append(delimiter).append(getSchoolId());
        sb.append(delimiter).append(getDescription());
        sb.append(delimiter).append(getSalary());
        sb.append(delimiter).append(getWorkSchedule());
        sb.append(delimiter).append(getPeriod());
        sb.append(delimiter).append(getAddress());
        sb.append(delimiter).append(getStation());
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
        if (_school != null) { sb.append(c).append("school"); }
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
    public SchoolOffer clone() {
        try {
            return (SchoolOffer)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @return The value of the column 'school_offer_id'. (NullAllowed)
     */
    public Integer getSchoolOfferId() {
        return _schoolOfferId;
    }

    /**
     * [set] school_offer_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br />
     * @param schoolOfferId The value of the column 'school_offer_id'. (NullAllowed)
     */
    public void setSchoolOfferId(Integer schoolOfferId) {
        __modifiedProperties.addPropertyName("schoolOfferId");
        this._schoolOfferId = schoolOfferId;
    }

    /**
     * [get] school_id: {IX, INT UNSIGNED(10), FK to school} <br />
     * @return The value of the column 'school_id'. (NullAllowed)
     */
    public Integer getSchoolId() {
        return _schoolId;
    }

    /**
     * [set] school_id: {IX, INT UNSIGNED(10), FK to school} <br />
     * @param schoolId The value of the column 'school_id'. (NullAllowed)
     */
    public void setSchoolId(Integer schoolId) {
        __modifiedProperties.addPropertyName("schoolId");
        this._schoolId = schoolId;
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
     * [get] work_schedule: {VARCHAR(100)} <br />
     * @return The value of the column 'work_schedule'. (NullAllowed)
     */
    public String getWorkSchedule() {
        return _workSchedule;
    }

    /**
     * [set] work_schedule: {VARCHAR(100)} <br />
     * @param workSchedule The value of the column 'work_schedule'. (NullAllowed)
     */
    public void setWorkSchedule(String workSchedule) {
        __modifiedProperties.addPropertyName("workSchedule");
        this._workSchedule = workSchedule;
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
