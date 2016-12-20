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
 * The entity of enterprise_aplicant as TABLE. <br />
 * <pre>
 * [primary-key]
 *     job_offer_id, student_id
 * 
 * [column]
 *     job_offer_id, student_id, title, content
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
 *     enterprise_offer, student
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     enterpriseOffer, student
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer jobOfferId = entity.getJobOfferId();
 * Integer studentId = entity.getStudentId();
 * String title = entity.getTitle();
 * String content = entity.getContent();
 * entity.setJobOfferId(jobOfferId);
 * entity.setStudentId(studentId);
 * entity.setTitle(title);
 * entity.setContent(content);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEnterpriseAplicant implements Entity, Serializable, Cloneable {

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
    /** job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer} */
    protected Integer _jobOfferId;

    /** student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student} */
    protected Integer _studentId;

    /** title: {VARCHAR(100)} */
    protected String _title;

    /** content: {VARCHAR(400)} */
    protected String _content;

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
        return "enterprise_aplicant";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "enterpriseAplicant";
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
        if (getStudentId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** enterprise_offer by my job_offer_id, named 'enterpriseOffer'. */
    protected EnterpriseOffer _enterpriseOffer;

    /**
     * enterprise_offer by my job_offer_id, named 'enterpriseOffer'.
     * @return The entity of foreign property 'enterpriseOffer'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public EnterpriseOffer getEnterpriseOffer() {
        return _enterpriseOffer;
    }

    /**
     * enterprise_offer by my job_offer_id, named 'enterpriseOffer'.
     * @param enterpriseOffer The entity of foreign property 'enterpriseOffer'. (NullAllowed)
     */
    public void setEnterpriseOffer(EnterpriseOffer enterpriseOffer) {
        _enterpriseOffer = enterpriseOffer;
    }

    /** student by my student_id, named 'student'. */
    protected Student _student;

    /**
     * student by my student_id, named 'student'.
     * @return The entity of foreign property 'student'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public Student getStudent() {
        return _student;
    }

    /**
     * student by my student_id, named 'student'.
     * @param student The entity of foreign property 'student'. (NullAllowed)
     */
    public void setStudent(Student student) {
        _student = student;
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
        if (other == null || !(other instanceof BsEnterpriseAplicant)) { return false; }
        BsEnterpriseAplicant otherEntity = (BsEnterpriseAplicant)other;
        if (!xSV(getJobOfferId(), otherEntity.getJobOfferId())) { return false; }
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
        result = xCH(result, getJobOfferId());
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
        if (_enterpriseOffer != null)
        { sb.append(l).append(xbRDS(_enterpriseOffer, "enterpriseOffer")); }
        if (_student != null)
        { sb.append(l).append(xbRDS(_student, "student")); }
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
        sb.append(delimiter).append(getStudentId());
        sb.append(delimiter).append(getTitle());
        sb.append(delimiter).append(getContent());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_enterpriseOffer != null) { sb.append(c).append("enterpriseOffer"); }
        if (_student != null) { sb.append(c).append("student"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public EnterpriseAplicant clone() {
        try {
            return (EnterpriseAplicant)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer} <br />
     * @return The value of the column 'job_offer_id'. (NullAllowed)
     */
    public Integer getJobOfferId() {
        return _jobOfferId;
    }

    /**
     * [set] job_offer_id: {PK, NotNull, INT UNSIGNED(10), FK to enterprise_offer} <br />
     * @param jobOfferId The value of the column 'job_offer_id'. (NullAllowed)
     */
    public void setJobOfferId(Integer jobOfferId) {
        __modifiedProperties.addPropertyName("jobOfferId");
        this._jobOfferId = jobOfferId;
    }

    /**
     * [get] student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student} <br />
     * @return The value of the column 'student_id'. (NullAllowed)
     */
    public Integer getStudentId() {
        return _studentId;
    }

    /**
     * [set] student_id: {PK, IX, NotNull, INT UNSIGNED(10), FK to student} <br />
     * @param studentId The value of the column 'student_id'. (NullAllowed)
     */
    public void setStudentId(Integer studentId) {
        __modifiedProperties.addPropertyName("studentId");
        this._studentId = studentId;
    }

    /**
     * [get] title: {VARCHAR(100)} <br />
     * @return The value of the column 'title'. (NullAllowed)
     */
    public String getTitle() {
        return _title;
    }

    /**
     * [set] title: {VARCHAR(100)} <br />
     * @param title The value of the column 'title'. (NullAllowed)
     */
    public void setTitle(String title) {
        __modifiedProperties.addPropertyName("title");
        this._title = title;
    }

    /**
     * [get] content: {VARCHAR(400)} <br />
     * @return The value of the column 'content'. (NullAllowed)
     */
    public String getContent() {
        return _content;
    }

    /**
     * [set] content: {VARCHAR(400)} <br />
     * @param content The value of the column 'content'. (NullAllowed)
     */
    public void setContent(String content) {
        __modifiedProperties.addPropertyName("content");
        this._content = content;
    }
}
