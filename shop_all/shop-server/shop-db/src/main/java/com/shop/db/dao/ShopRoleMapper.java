package com.shop.db.dao;

import com.shop.db.domain.ShopRole;
import com.shop.db.domain.ShopRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    long countByExample(ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int deleteByExample(ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int insert(ShopRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int insertSelective(ShopRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    ShopRole selectOneByExample(ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    ShopRole selectOneByExampleSelective(@Param("example") ShopRoleExample example, @Param("selective") ShopRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    List<ShopRole> selectByExampleSelective(@Param("example") ShopRoleExample example, @Param("selective") ShopRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    List<ShopRole> selectByExample(ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    ShopRole selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShopRole.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    ShopRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    ShopRole selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShopRole record, @Param("example") ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShopRole record, @Param("example") ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShopRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShopRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") ShopRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_role
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}