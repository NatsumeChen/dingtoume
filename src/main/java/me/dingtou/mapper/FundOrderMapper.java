package me.dingtou.mapper;

import me.dingtou.domain.FundOrder;
import me.dingtou.domain.FundOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FundOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    long countByExample(FundOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int deleteByExample(FundOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int insert(FundOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int insertSelective(FundOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    List<FundOrder> selectByExample(FundOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    FundOrder selectByPrimaryKey(Long orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByExampleSelective(@Param("record") FundOrder record, @Param("example") FundOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByExample(@Param("record") FundOrder record, @Param("example") FundOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByPrimaryKeySelective(FundOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_order
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByPrimaryKey(FundOrder record);
}