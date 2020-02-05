package com.greenplatform.dao;

import com.greenplatform.model.PlateCodeDmz;
import com.greenplatform.model.PlateCodeDmzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlateCodeDmzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int countByExample(PlateCodeDmzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int deleteByExample(PlateCodeDmzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("cDm") String cDm, @Param("cDmlb") String cDmlb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int insert(PlateCodeDmz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int insertSelective(PlateCodeDmz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    List<PlateCodeDmz> selectByExample(PlateCodeDmzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    PlateCodeDmz selectByPrimaryKey(@Param("cDm") String cDm, @Param("cDmlb") String cDmlb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PlateCodeDmz record, @Param("example") PlateCodeDmzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PlateCodeDmz record, @Param("example") PlateCodeDmzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlateCodeDmz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmz
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlateCodeDmz record);
}