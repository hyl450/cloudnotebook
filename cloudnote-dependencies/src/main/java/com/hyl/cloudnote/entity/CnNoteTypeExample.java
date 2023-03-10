package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnNoteTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnNoteTypeExample() {
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

        public Criteria andCnNoteTypeIdIsNull() {
            addCriterion("cn_note_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdIsNotNull() {
            addCriterion("cn_note_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdEqualTo(String value) {
            addCriterion("cn_note_type_id =", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdNotEqualTo(String value) {
            addCriterion("cn_note_type_id <>", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdGreaterThan(String value) {
            addCriterion("cn_note_type_id >", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_type_id >=", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdLessThan(String value) {
            addCriterion("cn_note_type_id <", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdLessThanOrEqualTo(String value) {
            addCriterion("cn_note_type_id <=", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdLike(String value) {
            addCriterion("cn_note_type_id like", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdNotLike(String value) {
            addCriterion("cn_note_type_id not like", value, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdIn(List<String> values) {
            addCriterion("cn_note_type_id in", values, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdNotIn(List<String> values) {
            addCriterion("cn_note_type_id not in", values, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdBetween(String value1, String value2) {
            addCriterion("cn_note_type_id between", value1, value2, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeIdNotBetween(String value1, String value2) {
            addCriterion("cn_note_type_id not between", value1, value2, "cnNoteTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeIsNull() {
            addCriterion("cn_note_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeIsNotNull() {
            addCriterion("cn_note_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeEqualTo(String value) {
            addCriterion("cn_note_type_code =", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeNotEqualTo(String value) {
            addCriterion("cn_note_type_code <>", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeGreaterThan(String value) {
            addCriterion("cn_note_type_code >", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_type_code >=", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeLessThan(String value) {
            addCriterion("cn_note_type_code <", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("cn_note_type_code <=", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeLike(String value) {
            addCriterion("cn_note_type_code like", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeNotLike(String value) {
            addCriterion("cn_note_type_code not like", value, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeIn(List<String> values) {
            addCriterion("cn_note_type_code in", values, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeNotIn(List<String> values) {
            addCriterion("cn_note_type_code not in", values, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeBetween(String value1, String value2) {
            addCriterion("cn_note_type_code between", value1, value2, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeCodeNotBetween(String value1, String value2) {
            addCriterion("cn_note_type_code not between", value1, value2, "cnNoteTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameIsNull() {
            addCriterion("cn_note_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameIsNotNull() {
            addCriterion("cn_note_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameEqualTo(String value) {
            addCriterion("cn_note_type_name =", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameNotEqualTo(String value) {
            addCriterion("cn_note_type_name <>", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameGreaterThan(String value) {
            addCriterion("cn_note_type_name >", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_type_name >=", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameLessThan(String value) {
            addCriterion("cn_note_type_name <", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameLessThanOrEqualTo(String value) {
            addCriterion("cn_note_type_name <=", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameLike(String value) {
            addCriterion("cn_note_type_name like", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameNotLike(String value) {
            addCriterion("cn_note_type_name not like", value, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameIn(List<String> values) {
            addCriterion("cn_note_type_name in", values, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameNotIn(List<String> values) {
            addCriterion("cn_note_type_name not in", values, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameBetween(String value1, String value2) {
            addCriterion("cn_note_type_name between", value1, value2, "cnNoteTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNoteTypeNameNotBetween(String value1, String value2) {
            addCriterion("cn_note_type_name not between", value1, value2, "cnNoteTypeName");
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