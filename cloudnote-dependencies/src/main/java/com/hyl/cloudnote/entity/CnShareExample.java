package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnShareExample() {
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

        public Criteria andCnShareIdIsNull() {
            addCriterion("cn_share_id is null");
            return (Criteria) this;
        }

        public Criteria andCnShareIdIsNotNull() {
            addCriterion("cn_share_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnShareIdEqualTo(String value) {
            addCriterion("cn_share_id =", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdNotEqualTo(String value) {
            addCriterion("cn_share_id <>", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdGreaterThan(String value) {
            addCriterion("cn_share_id >", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_share_id >=", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdLessThan(String value) {
            addCriterion("cn_share_id <", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdLessThanOrEqualTo(String value) {
            addCriterion("cn_share_id <=", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdLike(String value) {
            addCriterion("cn_share_id like", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdNotLike(String value) {
            addCriterion("cn_share_id not like", value, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdIn(List<String> values) {
            addCriterion("cn_share_id in", values, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdNotIn(List<String> values) {
            addCriterion("cn_share_id not in", values, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdBetween(String value1, String value2) {
            addCriterion("cn_share_id between", value1, value2, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareIdNotBetween(String value1, String value2) {
            addCriterion("cn_share_id not between", value1, value2, "cnShareId");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleIsNull() {
            addCriterion("cn_share_title is null");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleIsNotNull() {
            addCriterion("cn_share_title is not null");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleEqualTo(String value) {
            addCriterion("cn_share_title =", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleNotEqualTo(String value) {
            addCriterion("cn_share_title <>", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleGreaterThan(String value) {
            addCriterion("cn_share_title >", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("cn_share_title >=", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleLessThan(String value) {
            addCriterion("cn_share_title <", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleLessThanOrEqualTo(String value) {
            addCriterion("cn_share_title <=", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleLike(String value) {
            addCriterion("cn_share_title like", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleNotLike(String value) {
            addCriterion("cn_share_title not like", value, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleIn(List<String> values) {
            addCriterion("cn_share_title in", values, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleNotIn(List<String> values) {
            addCriterion("cn_share_title not in", values, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleBetween(String value1, String value2) {
            addCriterion("cn_share_title between", value1, value2, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnShareTitleNotBetween(String value1, String value2) {
            addCriterion("cn_share_title not between", value1, value2, "cnShareTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdIsNull() {
            addCriterion("cn_note_id is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdIsNotNull() {
            addCriterion("cn_note_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdEqualTo(String value) {
            addCriterion("cn_note_id =", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdNotEqualTo(String value) {
            addCriterion("cn_note_id <>", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdGreaterThan(String value) {
            addCriterion("cn_note_id >", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_id >=", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdLessThan(String value) {
            addCriterion("cn_note_id <", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdLessThanOrEqualTo(String value) {
            addCriterion("cn_note_id <=", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdLike(String value) {
            addCriterion("cn_note_id like", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdNotLike(String value) {
            addCriterion("cn_note_id not like", value, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdIn(List<String> values) {
            addCriterion("cn_note_id in", values, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdNotIn(List<String> values) {
            addCriterion("cn_note_id not in", values, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdBetween(String value1, String value2) {
            addCriterion("cn_note_id between", value1, value2, "cnNoteId");
            return (Criteria) this;
        }

        public Criteria andCnNoteIdNotBetween(String value1, String value2) {
            addCriterion("cn_note_id not between", value1, value2, "cnNoteId");
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