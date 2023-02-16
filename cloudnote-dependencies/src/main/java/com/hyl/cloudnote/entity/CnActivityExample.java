package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnActivityExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andCnActivityIdIsNull() {
            addCriterion("cn_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdIsNotNull() {
            addCriterion("cn_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdEqualTo(String value) {
            addCriterion("cn_activity_id =", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdNotEqualTo(String value) {
            addCriterion("cn_activity_id <>", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdGreaterThan(String value) {
            addCriterion("cn_activity_id >", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_activity_id >=", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdLessThan(String value) {
            addCriterion("cn_activity_id <", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdLessThanOrEqualTo(String value) {
            addCriterion("cn_activity_id <=", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdLike(String value) {
            addCriterion("cn_activity_id like", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdNotLike(String value) {
            addCriterion("cn_activity_id not like", value, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdIn(List<String> values) {
            addCriterion("cn_activity_id in", values, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdNotIn(List<String> values) {
            addCriterion("cn_activity_id not in", values, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdBetween(String value1, String value2) {
            addCriterion("cn_activity_id between", value1, value2, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityIdNotBetween(String value1, String value2) {
            addCriterion("cn_activity_id not between", value1, value2, "cnActivityId");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleIsNull() {
            addCriterion("cn_activity_title is null");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleIsNotNull() {
            addCriterion("cn_activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleEqualTo(String value) {
            addCriterion("cn_activity_title =", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleNotEqualTo(String value) {
            addCriterion("cn_activity_title <>", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleGreaterThan(String value) {
            addCriterion("cn_activity_title >", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("cn_activity_title >=", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleLessThan(String value) {
            addCriterion("cn_activity_title <", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("cn_activity_title <=", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleLike(String value) {
            addCriterion("cn_activity_title like", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleNotLike(String value) {
            addCriterion("cn_activity_title not like", value, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleIn(List<String> values) {
            addCriterion("cn_activity_title in", values, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleNotIn(List<String> values) {
            addCriterion("cn_activity_title not in", values, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleBetween(String value1, String value2) {
            addCriterion("cn_activity_title between", value1, value2, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityTitleNotBetween(String value1, String value2) {
            addCriterion("cn_activity_title not between", value1, value2, "cnActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeIsNull() {
            addCriterion("cn_activity_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeIsNotNull() {
            addCriterion("cn_activity_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeEqualTo(Long value) {
            addCriterion("cn_activity_end_time =", value, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeNotEqualTo(Long value) {
            addCriterion("cn_activity_end_time <>", value, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeGreaterThan(Long value) {
            addCriterion("cn_activity_end_time >", value, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("cn_activity_end_time >=", value, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeLessThan(Long value) {
            addCriterion("cn_activity_end_time <", value, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("cn_activity_end_time <=", value, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeIn(List<Long> values) {
            addCriterion("cn_activity_end_time in", values, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeNotIn(List<Long> values) {
            addCriterion("cn_activity_end_time not in", values, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeBetween(Long value1, Long value2) {
            addCriterion("cn_activity_end_time between", value1, value2, "cnActivityEndTime");
            return (Criteria) this;
        }

        public Criteria andCnActivityEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("cn_activity_end_time not between", value1, value2, "cnActivityEndTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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