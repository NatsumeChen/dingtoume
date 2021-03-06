package me.dingtou.mapper;

import me.dingtou.domain.FundGroupDetail;
import me.dingtou.domain.FundGroupDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FundGroupDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    long countByExample(FundGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int deleteByExample(FundGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int insert(FundGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int insertSelective(FundGroupDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    List<FundGroupDetail> selectByExample(FundGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByExampleSelective(@Param("record") FundGroupDetail record, @Param("example") FundGroupDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_group_detail
     *
     * @mbg.generated Sun Jun 18 17:09:13 CST 2017
     */
    int updateByExample(@Param("record") FundGroupDetail record, @Param("example") FundGroupDetailExample example);
}