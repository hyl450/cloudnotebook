package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnActivityStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnActivityStatusExample() {
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

        public Criteria andCnActivityStatusIdIsNull() {
            addCriterion("cn_activity_status_id is null");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdIsNotNull() {
            addCriterion("cn_activity_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdEqualTo(String value) {
            addCriterion("cn_activity_status_id =", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdNotEqualTo(String value) {
            addCriterion("cn_activity_status_id <>", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdGreaterThan(String value) {
            addCriterion("cn_activity_status_id >", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_activity_status_id >=", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdLessThan(String value) {
            addCriterion("cn_activity_status_id <", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdLessThanOrEqualTo(String value) {
            addCriterion("cn_activity_status_id <=", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdLike(String value) {
            addCriterion("cn_activity_status_id like", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdNotLike(String value) {
            addCriterion("cn_activity_status_id not like", value, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdIn(List<String> values) {
            addCriterion("cn_activity_status_id in", values, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdNotIn(List<String> values) {
            addCriterion("cn_activity_status_id not in", values, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdBetween(String value1, String value2) {
            addCriterion("cn_activity_status_id between", value1, value2, "cnActivityStatusId");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusIdNotBetween(String value1, String value2) {
            addCriterion("cn_activity_status_id not between", value1, value2, "cnActivityStatusId");
            return (Criteria) this;
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

        public Criteria andCnActivityStatusCodeIsNull() {
            addCriterion("cn_activity_status_code is null");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeIsNotNull() {
            addCriterion("cn_activity_status_code is not null");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeEqualTo(String value) {
            addCriterion("cn_activity_status_code =", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeNotEqualTo(String value) {
            addCriterion("cn_activity_status_code <>", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeGreaterThan(String value) {
            addCriterion("cn_activity_status_code >", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cn_activity_status_code >=", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeLessThan(String value) {
            addCriterion("cn_activity_status_code <", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("cn_activity_status_code <=", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeLike(String value) {
            addCriterion("cn_activity_status_code like", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeNotLike(String value) {
            addCriterion("cn_activity_status_code not like", value, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeIn(List<String> values) {
            addCriterion("cn_activity_status_code in", values, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeNotIn(List<String> values) {
            addCriterion("cn_activity_status_code not in", values, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeBetween(String value1, String value2) {
            addCriterion("cn_activity_status_code between", value1, value2, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusCodeNotBetween(String value1, String value2) {
            addCriterion("cn_activity_status_code not between", value1, value2, "cnActivityStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameIsNull() {
            addCriterion("cn_activity_status_name is null");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameIsNotNull() {
            addCriterion("cn_activity_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameEqualTo(String value) {
            addCriterion("cn_activity_status_name =", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameNotEqualTo(String value) {
            addCriterion("cn_activity_status_name <>", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameGreaterThan(String value) {
            addCriterion("cn_activity_status_name >", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_activity_status_name >=", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameLessThan(String value) {
            addCriterion("cn_activity_status_name <", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameLessThanOrEqualTo(String value) {
            addCriterion("cn_activity_status_name <=", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameLike(String value) {
            addCriterion("cn_activity_status_name like", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameNotLike(String value) {
            addCriterion("cn_activity_status_name not like", value, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameIn(List<String> values) {
            addCriterion("cn_activity_status_name in", values, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameNotIn(List<String> values) {
            addCriterion("cn_activity_status_name not in", values, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameBetween(String value1, String value2) {
            addCriterion("cn_activity_status_name between", value1, value2, "cnActivityStatusName");
            return (Criteria) this;
        }

        public Criteria andCnActivityStatusNameNotBetween(String value1, String value2) {
            addCriterion("cn_activity_status_name not between", value1, value2, "cnActivityStatusName");
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