package pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
@Scope("prototype")
public class InteractExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public InteractExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andToActIdIsNull() {
            addCriterion("to_act_id is null");
            return (Criteria) this;
        }

        public Criteria andToActIdIsNotNull() {
            addCriterion("to_act_id is not null");
            return (Criteria) this;
        }

        public Criteria andToActIdEqualTo(Integer value) {
            addCriterion("to_act_id =", value, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdNotEqualTo(Integer value) {
            addCriterion("to_act_id <>", value, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdGreaterThan(Integer value) {
            addCriterion("to_act_id >", value, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_act_id >=", value, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdLessThan(Integer value) {
            addCriterion("to_act_id <", value, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_act_id <=", value, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdIn(List<Integer> values) {
            addCriterion("to_act_id in", values, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdNotIn(List<Integer> values) {
            addCriterion("to_act_id not in", values, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdBetween(Integer value1, Integer value2) {
            addCriterion("to_act_id between", value1, value2, "toActId");
            return (Criteria) this;
        }

        public Criteria andToActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_act_id not between", value1, value2, "toActId");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActorIdIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActorIdEqualTo(String value) {
            addCriterion("actor_id =", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotEqualTo(String value) {
            addCriterion("actor_id <>", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThan(String value) {
            addCriterion("actor_id >", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("actor_id >=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThan(String value) {
            addCriterion("actor_id <", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLessThanOrEqualTo(String value) {
            addCriterion("actor_id <=", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdLike(String value) {
            addCriterion("actor_id like", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotLike(String value) {
            addCriterion("actor_id not like", value, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdIn(List<String> values) {
            addCriterion("actor_id in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotIn(List<String> values) {
            addCriterion("actor_id not in", values, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdBetween(String value1, String value2) {
            addCriterion("actor_id between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActorIdNotBetween(String value1, String value2) {
            addCriterion("actor_id not between", value1, value2, "actorId");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNull() {
            addCriterion("act_type is null");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNotNull() {
            addCriterion("act_type is not null");
            return (Criteria) this;
        }

        public Criteria andActTypeEqualTo(String value) {
            addCriterion("act_type =", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotEqualTo(String value) {
            addCriterion("act_type <>", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThan(String value) {
            addCriterion("act_type >", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThanOrEqualTo(String value) {
            addCriterion("act_type >=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThan(String value) {
            addCriterion("act_type <", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThanOrEqualTo(String value) {
            addCriterion("act_type <=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLike(String value) {
            addCriterion("act_type like", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotLike(String value) {
            addCriterion("act_type not like", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeIn(List<String> values) {
            addCriterion("act_type in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotIn(List<String> values) {
            addCriterion("act_type not in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeBetween(String value1, String value2) {
            addCriterion("act_type between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotBetween(String value1, String value2) {
            addCriterion("act_type not between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andToActorIdIsNull() {
            addCriterion("to_actor_id is null");
            return (Criteria) this;
        }

        public Criteria andToActorIdIsNotNull() {
            addCriterion("to_actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andToActorIdEqualTo(String value) {
            addCriterion("to_actor_id =", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdNotEqualTo(String value) {
            addCriterion("to_actor_id <>", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdGreaterThan(String value) {
            addCriterion("to_actor_id >", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_actor_id >=", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdLessThan(String value) {
            addCriterion("to_actor_id <", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdLessThanOrEqualTo(String value) {
            addCriterion("to_actor_id <=", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdLike(String value) {
            addCriterion("to_actor_id like", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdNotLike(String value) {
            addCriterion("to_actor_id not like", value, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdIn(List<String> values) {
            addCriterion("to_actor_id in", values, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdNotIn(List<String> values) {
            addCriterion("to_actor_id not in", values, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdBetween(String value1, String value2) {
            addCriterion("to_actor_id between", value1, value2, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToActorIdNotBetween(String value1, String value2) {
            addCriterion("to_actor_id not between", value1, value2, "toActorId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdIsNull() {
            addCriterion("to_work_id is null");
            return (Criteria) this;
        }

        public Criteria andToWorkIdIsNotNull() {
            addCriterion("to_work_id is not null");
            return (Criteria) this;
        }

        public Criteria andToWorkIdEqualTo(Integer value) {
            addCriterion("to_work_id =", value, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdNotEqualTo(Integer value) {
            addCriterion("to_work_id <>", value, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdGreaterThan(Integer value) {
            addCriterion("to_work_id >", value, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_work_id >=", value, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdLessThan(Integer value) {
            addCriterion("to_work_id <", value, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_work_id <=", value, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdIn(List<Integer> values) {
            addCriterion("to_work_id in", values, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdNotIn(List<Integer> values) {
            addCriterion("to_work_id not in", values, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("to_work_id between", value1, value2, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andToWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_work_id not between", value1, value2, "toWorkId");
            return (Criteria) this;
        }

        public Criteria andActContentIsNull() {
            addCriterion("act_content is null");
            return (Criteria) this;
        }

        public Criteria andActContentIsNotNull() {
            addCriterion("act_content is not null");
            return (Criteria) this;
        }

        public Criteria andActContentEqualTo(String value) {
            addCriterion("act_content =", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotEqualTo(String value) {
            addCriterion("act_content <>", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThan(String value) {
            addCriterion("act_content >", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentGreaterThanOrEqualTo(String value) {
            addCriterion("act_content >=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThan(String value) {
            addCriterion("act_content <", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLessThanOrEqualTo(String value) {
            addCriterion("act_content <=", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentLike(String value) {
            addCriterion("act_content like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotLike(String value) {
            addCriterion("act_content not like", value, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentIn(List<String> values) {
            addCriterion("act_content in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotIn(List<String> values) {
            addCriterion("act_content not in", values, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentBetween(String value1, String value2) {
            addCriterion("act_content between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andActContentNotBetween(String value1, String value2) {
            addCriterion("act_content not between", value1, value2, "actContent");
            return (Criteria) this;
        }

        public Criteria andToActContentIsNull() {
            addCriterion("to_act_content is null");
            return (Criteria) this;
        }

        public Criteria andToActContentIsNotNull() {
            addCriterion("to_act_content is not null");
            return (Criteria) this;
        }

        public Criteria andToActContentEqualTo(String value) {
            addCriterion("to_act_content =", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentNotEqualTo(String value) {
            addCriterion("to_act_content <>", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentGreaterThan(String value) {
            addCriterion("to_act_content >", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentGreaterThanOrEqualTo(String value) {
            addCriterion("to_act_content >=", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentLessThan(String value) {
            addCriterion("to_act_content <", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentLessThanOrEqualTo(String value) {
            addCriterion("to_act_content <=", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentLike(String value) {
            addCriterion("to_act_content like", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentNotLike(String value) {
            addCriterion("to_act_content not like", value, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentIn(List<String> values) {
            addCriterion("to_act_content in", values, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentNotIn(List<String> values) {
            addCriterion("to_act_content not in", values, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentBetween(String value1, String value2) {
            addCriterion("to_act_content between", value1, value2, "toActContent");
            return (Criteria) this;
        }

        public Criteria andToActContentNotBetween(String value1, String value2) {
            addCriterion("to_act_content not between", value1, value2, "toActContent");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeIsNull() {
            addCriterion("act_generate_time is null");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeIsNotNull() {
            addCriterion("act_generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeEqualTo(Date value) {
            addCriterion("act_generate_time =", value, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeNotEqualTo(Date value) {
            addCriterion("act_generate_time <>", value, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeGreaterThan(Date value) {
            addCriterion("act_generate_time >", value, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("act_generate_time >=", value, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeLessThan(Date value) {
            addCriterion("act_generate_time <", value, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeLessThanOrEqualTo(Date value) {
            addCriterion("act_generate_time <=", value, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeIn(List<Date> values) {
            addCriterion("act_generate_time in", values, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeNotIn(List<Date> values) {
            addCriterion("act_generate_time not in", values, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeBetween(Date value1, Date value2) {
            addCriterion("act_generate_time between", value1, value2, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActGenerateTimeNotBetween(Date value1, Date value2) {
            addCriterion("act_generate_time not between", value1, value2, "actGenerateTime");
            return (Criteria) this;
        }

        public Criteria andActIsReadIsNull() {
            addCriterion("act_is_read is null");
            return (Criteria) this;
        }

        public Criteria andActIsReadIsNotNull() {
            addCriterion("act_is_read is not null");
            return (Criteria) this;
        }

        public Criteria andActIsReadEqualTo(Boolean value) {
            addCriterion("act_is_read =", value, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadNotEqualTo(Boolean value) {
            addCriterion("act_is_read <>", value, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadGreaterThan(Boolean value) {
            addCriterion("act_is_read >", value, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("act_is_read >=", value, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadLessThan(Boolean value) {
            addCriterion("act_is_read <", value, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadLessThanOrEqualTo(Boolean value) {
            addCriterion("act_is_read <=", value, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadIn(List<Boolean> values) {
            addCriterion("act_is_read in", values, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadNotIn(List<Boolean> values) {
            addCriterion("act_is_read not in", values, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadBetween(Boolean value1, Boolean value2) {
            addCriterion("act_is_read between", value1, value2, "actIsRead");
            return (Criteria) this;
        }

        public Criteria andActIsReadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("act_is_read not between", value1, value2, "actIsRead");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table interact
     *
     * @mbggenerated do_not_delete_during_merge Wed May 09 11:39:51 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table interact
     *
     * @mbggenerated Wed May 09 11:39:51 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}