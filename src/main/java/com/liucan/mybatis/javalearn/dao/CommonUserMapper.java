package com.liucan.mybatis.javalearn.dao;

import com.liucan.mybatis.javalearn.mode.CommonUser;
import com.liucan.mybatis.javalearn.mode.CommonUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommonUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    long countByExample(CommonUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    int deleteByExample(CommonUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    int insert(CommonUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    int insertSelective(CommonUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    List<CommonUser> selectByExample(CommonUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") CommonUser record, @Param("example") CommonUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table common_user
     *
     * @mbg.generated Sun Oct 21 16:10:31 CST 2018
     */
    int updateByExample(@Param("record") CommonUser record, @Param("example") CommonUserExample example);
}