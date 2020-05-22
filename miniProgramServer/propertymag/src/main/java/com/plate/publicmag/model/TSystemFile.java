package com.plate.publicmag.model;

import java.io.Serializable;
import java.util.Date;

public class TSystemFile implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_file.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_file.file_name
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_file.file_type
     *
     * @mbggenerated
     */
    private Integer fileType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_file.file_address
     *
     * @mbggenerated
     */
    private String fileAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_file.file_url
     *
     * @mbggenerated
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_system_file.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_system_file
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_file.id
     *
     * @return the value of t_system_file.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_file.id
     *
     * @param id the value for t_system_file.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_file.file_name
     *
     * @return the value of t_system_file.file_name
     *
     * @mbggenerated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_file.file_name
     *
     * @param fileName the value for t_system_file.file_name
     *
     * @mbggenerated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_file.file_type
     *
     * @return the value of t_system_file.file_type
     *
     * @mbggenerated
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_file.file_type
     *
     * @param fileType the value for t_system_file.file_type
     *
     * @mbggenerated
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_file.file_address
     *
     * @return the value of t_system_file.file_address
     *
     * @mbggenerated
     */
    public String getFileAddress() {
        return fileAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_file.file_address
     *
     * @param fileAddress the value for t_system_file.file_address
     *
     * @mbggenerated
     */
    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress == null ? null : fileAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_file.file_url
     *
     * @return the value of t_system_file.file_url
     *
     * @mbggenerated
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_file.file_url
     *
     * @param fileUrl the value for t_system_file.file_url
     *
     * @mbggenerated
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_system_file.create_time
     *
     * @return the value of t_system_file.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_system_file.create_time
     *
     * @param createTime the value for t_system_file.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_file
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
        sb.append(", fileName=").append(fileName);
        sb.append(", fileType=").append(fileType);
        sb.append(", fileAddress=").append(fileAddress);
        sb.append(", fileUrl=").append(fileUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}