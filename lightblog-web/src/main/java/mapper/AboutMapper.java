package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.About;
import pojo.AboutExample;

public interface AboutMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int countByExample(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int deleteByExample(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int deleteByPrimaryKey(String aboutUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int insert(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int insertSelective(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    List<About> selectByExampleWithBLOBs(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    List<About> selectByExample(AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    About selectByPrimaryKey(String aboutUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") About record, @Param("example") AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") About record, @Param("example") AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int updateByExample(@Param("record") About record, @Param("example") AboutExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int updateByPrimaryKeySelective(About record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table about
     *
     * @mbggenerated Thu Jan 04 16:58:35 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(About record);
}