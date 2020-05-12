package com.plate.publicmag.model;

import java.io.Serializable;
import java.util.Date;

public class PublicLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_user_id
     *
     * @mbggenerated
     */
    private String actUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_time
     *
     * @mbggenerated
     */
    private Date actTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_type
     *
     * @mbggenerated
     */
    private String actType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_url
     *
     * @mbggenerated
     */
    private String actUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_params
     *
     * @mbggenerated
     */
    private String actParams;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_status
     *
     * @mbggenerated
     */
    private String actStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_ip
     *
     * @mbggenerated
     */
    private String actIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_log.act_mac
     *
     * @mbggenerated
     */
    private String actMac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.id
     *
     * @return the value of public_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.id
     *
     * @param id the value for public_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_user_id
     *
     * @return the value of public_log.act_user_id
     *
     * @mbggenerated
     */
    public String getActUserId() {
        return actUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_user_id
     *
     * @param actUserId the value for public_log.act_user_id
     *
     * @mbggenerated
     */
    public void setActUserId(String actUserId) {
        this.actUserId = actUserId == null ? null : actUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_time
     *
     * @return the value of public_log.act_time
     *
     * @mbggenerated
     */
    public Date getActTime() {
        return actTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_time
     *
     * @param actTime the value for public_log.act_time
     *
     * @mbggenerated
     */
    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_type
     *
     * @return the value of public_log.act_type
     *
     * @mbggenerated
     */
    public String getActType() {
        return actType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_type
     *
     * @param actType the value for public_log.act_type
     *
     * @mbggenerated
     */
    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_url
     *
     * @return the value of public_log.act_url
     *
     * @mbggenerated
     */
    public String getActUrl() {
        return actUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_url
     *
     * @param actUrl the value for public_log.act_url
     *
     * @mbggenerated
     */
    public void setActUrl(String actUrl) {
        this.actUrl = actUrl == null ? null : actUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_params
     *
     * @return the value of public_log.act_params
     *
     * @mbggenerated
     */
    public String getActParams() {
        return actParams;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_params
     *
     * @param actParams the value for public_log.act_params
     *
     * @mbggenerated
     */
    public void setActParams(String actParams) {
        this.actParams = actParams == null ? null : actParams.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_status
     *
     * @return the value of public_log.act_status
     *
     * @mbggenerated
     */
    public String getActStatus() {
        return actStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_status
     *
     * @param actStatus the value for public_log.act_status
     *
     * @mbggenerated
     */
    public void setActStatus(String actStatus) {
        this.actStatus = actStatus == null ? null : actStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_ip
     *
     * @return the value of public_log.act_ip
     *
     * @mbggenerated
     */
    public String getActIp() {
        return actIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_ip
     *
     * @param actIp the value for public_log.act_ip
     *
     * @mbggenerated
     */
    public void setActIp(String actIp) {
        this.actIp = actIp == null ? null : actIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_log.act_mac
     *
     * @return the value of public_log.act_mac
     *
     * @mbggenerated
     */
    public String getActMac() {
        return actMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_log.act_mac
     *
     * @param actMac the value for public_log.act_mac
     *
     * @mbggenerated
     */
    public void setActMac(String actMac) {
        this.actMac = actMac == null ? null : actMac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_log
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actUserId=").append(actUserId);
        sb.append(", actTime=").append(actTime);
        sb.append(", actType=").append(actType);
        sb.append(", actUrl=").append(actUrl);
        sb.append(", actParams=").append(actParams);
        sb.append(", actStatus=").append(actStatus);
        sb.append(", actIp=").append(actIp);
        sb.append(", actMac=").append(actMac);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}