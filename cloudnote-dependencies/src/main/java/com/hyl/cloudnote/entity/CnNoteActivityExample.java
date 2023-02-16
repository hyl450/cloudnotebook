package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnNoteActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnNoteActivityExample() {
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

        public Criteria andCnNoteActivityIdIsNull() {
            addCriterion("cn_note_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdIsNotNull() {
            addCriterion("cn_note_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdEqualTo(String value) {
            addCriterion("cn_note_activity_id =", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdNotEqualTo(String value) {
            addCriterion("cn_note_activity_id <>", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdGreaterThan(String value) {
            addCriterion("cn_note_activity_id >", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_activity_id >=", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdLessThan(String value) {
            addCriterion("cn_note_activity_id <", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdLessThanOrEqualTo(String value) {
            addCriterion("cn_note_activity_id <=", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdLike(String value) {
            addCriterion("cn_note_activity_id like", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdNotLike(String value) {
            addCriterion("cn_note_activity_id not like", value, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdIn(List<String> values) {
            addCriterion("cn_note_activity_id in", values, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdNotIn(List<String> values) {
            addCriterion("cn_note_activity_id not in", values, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdBetween(String value1, String value2) {
            addCriterion("cn_note_activity_id between", value1, value2, "cnNoteActivityId");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityIdNotBetween(String value1, String value2) {
            addCriterion("cn_note_activity_id not between", value1, value2, "cnNoteActivityId");
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

        public Criteria andCnNoteActivityUpIsNull() {
            addCriterion("cn_note_activity_up is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpIsNotNull() {
            addCriterion("cn_note_activity_up is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpEqualTo(Integer value) {
            addCriterion("cn_note_activity_up =", value, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpNotEqualTo(Integer value) {
            addCriterion("cn_note_activity_up <>", value, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpGreaterThan(Integer value) {
            addCriterion("cn_note_activity_up >", value, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("cn_note_activity_up >=", value, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpLessThan(Integer value) {
            addCriterion("cn_note_activity_up <", value, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpLessThanOrEqualTo(Integer value) {
            addCriterion("cn_note_activity_up <=", value, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpIn(List<Integer> values) {
            addCriterion("cn_note_activity_up in", values, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpNotIn(List<Integer> values) {
            addCriterion("cn_note_activity_up not in", values, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpBetween(Integer value1, Integer value2) {
            addCriterion("cn_note_activity_up between", value1, value2, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityUpNotBetween(Integer value1, Integer value2) {
            addCriterion("cn_note_activity_up not between", value1, value2, "cnNoteActivityUp");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownIsNull() {
            addCriterion("cn_note_activity_down is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownIsNotNull() {
            addCriterion("cn_note_activity_down is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownEqualTo(Integer value) {
            addCriterion("cn_note_activity_down =", value, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownNotEqualTo(Integer value) {
            addCriterion("cn_note_activity_down <>", value, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownGreaterThan(Integer value) {
            addCriterion("cn_note_activity_down >", value, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownGreaterThanOrEqualTo(Integer value) {
            addCriterion("cn_note_activity_down >=", value, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownLessThan(Integer value) {
            addCriterion("cn_note_activity_down <", value, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownLessThanOrEqualTo(Integer value) {
            addCriterion("cn_note_activity_down <=", value, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownIn(List<Integer> values) {
            addCriterion("cn_note_activity_down in", values, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownNotIn(List<Integer> values) {
            addCriterion("cn_note_activity_down not in", values, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownBetween(Integer value1, Integer value2) {
            addCriterion("cn_note_activity_down between", value1, value2, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityDownNotBetween(Integer value1, Integer value2) {
            addCriterion("cn_note_activity_down not between", value1, value2, "cnNoteActivityDown");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleIsNull() {
            addCriterion("cn_note_activity_title is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleIsNotNull() {
            addCriterion("cn_note_activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleEqualTo(String value) {
            addCriterion("cn_note_activity_title =", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleNotEqualTo(String value) {
            addCriterion("cn_note_activity_title <>", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleGreaterThan(String value) {
            addCriterion("cn_note_activity_title >", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_activity_title >=", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleLessThan(String value) {
            addCriterion("cn_note_activity_title <", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("cn_note_activity_title <=", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleLike(String value) {
            addCriterion("cn_note_activity_title like", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleNotLike(String value) {
            addCriterion("cn_note_activity_title not like", value, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleIn(List<String> values) {
            addCriterion("cn_note_activity_title in", values, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleNotIn(List<String> values) {
            addCriterion("cn_note_activity_title not in", values, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleBetween(String value1, String value2) {
            addCriterion("cn_note_activity_title between", value1, value2, "cnNoteActivityTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteActivityTitleNotBetween(String value1, String value2) {
            addCriterion("cn_note_activity_title not between", value1, value2, "cnNoteActivityTitle");
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