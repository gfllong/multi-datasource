package com.wbb.mapper;

import com.wbb.bean.Logs;

public interface LogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Wed Jul 25 17:44:26 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Wed Jul 25 17:44:26 CST 2018
     */
    int insert(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Wed Jul 25 17:44:26 CST 2018
     */
    int insertSelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Wed Jul 25 17:44:26 CST 2018
     */
    Logs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Wed Jul 25 17:44:26 CST 2018
     */
    int updateByPrimaryKeySelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Wed Jul 25 17:44:26 CST 2018
     */
    int updateByPrimaryKey(Logs record);
}