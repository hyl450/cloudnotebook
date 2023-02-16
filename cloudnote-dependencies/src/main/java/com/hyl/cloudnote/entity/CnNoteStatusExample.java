package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnNoteStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnNoteStatusExample() {
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

        public Criteria andCnNoteStatusIdIsNull() {
            addCriterion("cn_note_status_id is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdIsNotNull() {
            addCriterion("cn_note_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdEqualTo(String value) {
            addCriterion("cn_note_status_id =", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdNotEqualTo(String value) {
            addCriterion("cn_note_status_id <>", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdGreaterThan(String value) {
            addCriterion("cn_note_status_id >", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_status_id >=", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdLessThan(String value) {
            addCriterion("cn_note_status_id <", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdLessThanOrEqualTo(String value) {
            addCriterion("cn_note_status_id <=", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdLike(String value) {
            addCriterion("cn_note_status_id like", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdNotLike(String value) {
            addCriterion("cn_note_status_id not like", value, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdIn(List<String> values) {
            addCriterion("cn_note_status_id in", values, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdNotIn(List<String> values) {
            addCriterion("cn_note_status_id not in", values, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdBetween(String value1, String value2) {
            addCriterion("cn_note_status_id between", value1, value2, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusIdNotBetween(String value1, String value2) {
            addCriterion("cn_note_status_id not between", value1, value2, "cnNoteStatusId");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeIsNull() {
            addCriterion("cn_note_status_code is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeIsNotNull() {
            addCriterion("cn_note_status_code is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeEqualTo(String value) {
            addCriterion("cn_note_status_code =", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeNotEqualTo(String value) {
            addCriterion("cn_note_status_code <>", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeGreaterThan(String value) {
            addCriterion("cn_note_status_code >", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_status_code >=", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeLessThan(String value) {
            addCriterion("cn_note_status_code <", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeLessThanOrEqualTo(String value) {
            addCriterion("cn_note_status_code <=", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeLike(String value) {
            addCriterion("cn_note_status_code like", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeNotLike(String value) {
            addCriterion("cn_note_status_code not like", value, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeIn(List<String> values) {
            addCriterion("cn_note_status_code in", values, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeNotIn(List<String> values) {
            addCriterion("cn_note_status_code not in", values, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeBetween(String value1, String value2) {
            addCriterion("cn_note_status_code between", value1, value2, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusCodeNotBetween(String value1, String value2) {
            addCriterion("cn_note_status_code not between", value1, value2, "cnNoteStatusCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameIsNull() {
            addCriterion("cn_note_status_name is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameIsNotNull() {
            addCriterion("cn_note_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameEqualTo(String value) {
            addCriterion("cn_note_status_name =", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameNotEqualTo(String value) {
            addCriterion("cn_note_status_name <>", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameGreaterThan(String value) {
            addCriterion("cn_note_status_name >", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_status_name >=", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameLessThan(String value) {
            addCriterion("cn_note_status_name <", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameLessThanOrEqualTo(String value) {
            addCriterion("cn_note_status_name <=", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameLike(String value) {
            addCriterion("cn_note_status_name like", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameNotLike(String value) {
            addCriterion("cn_note_status_name not like", value, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameIn(List<String> values) {
            addCriterion("cn_note_status_name in", values, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameNotIn(List<String> values) {
            addCriterion("cn_note_status_name not in", values, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameBetween(String value1, String value2) {
            addCriterion("cn_note_status_name between", value1, value2, "cnNoteStatusName");
            return (Criteria) this;
        }

        public Criteria andCnNoteStatusNameNotBetween(String value1, String value2) {
            addCriterion("cn_note_status_name not between", value1, value2, "cnNoteStatusName");
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