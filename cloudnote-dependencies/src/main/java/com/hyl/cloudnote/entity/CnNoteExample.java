package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnNoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnNoteExample() {
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

        public Criteria andCnNotebookIdIsNull() {
            addCriterion("cn_notebook_id is null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdIsNotNull() {
            addCriterion("cn_notebook_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdEqualTo(String value) {
            addCriterion("cn_notebook_id =", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdNotEqualTo(String value) {
            addCriterion("cn_notebook_id <>", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdGreaterThan(String value) {
            addCriterion("cn_notebook_id >", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_notebook_id >=", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdLessThan(String value) {
            addCriterion("cn_notebook_id <", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdLessThanOrEqualTo(String value) {
            addCriterion("cn_notebook_id <=", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdLike(String value) {
            addCriterion("cn_notebook_id like", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdNotLike(String value) {
            addCriterion("cn_notebook_id not like", value, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdIn(List<String> values) {
            addCriterion("cn_notebook_id in", values, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdNotIn(List<String> values) {
            addCriterion("cn_notebook_id not in", values, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdBetween(String value1, String value2) {
            addCriterion("cn_notebook_id between", value1, value2, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookIdNotBetween(String value1, String value2) {
            addCriterion("cn_notebook_id not between", value1, value2, "cnNotebookId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdIsNull() {
            addCriterion("cn_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCnUserIdIsNotNull() {
            addCriterion("cn_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnUserIdEqualTo(String value) {
            addCriterion("cn_user_id =", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdNotEqualTo(String value) {
            addCriterion("cn_user_id <>", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdGreaterThan(String value) {
            addCriterion("cn_user_id >", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_user_id >=", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdLessThan(String value) {
            addCriterion("cn_user_id <", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdLessThanOrEqualTo(String value) {
            addCriterion("cn_user_id <=", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdLike(String value) {
            addCriterion("cn_user_id like", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdNotLike(String value) {
            addCriterion("cn_user_id not like", value, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdIn(List<String> values) {
            addCriterion("cn_user_id in", values, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdNotIn(List<String> values) {
            addCriterion("cn_user_id not in", values, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdBetween(String value1, String value2) {
            addCriterion("cn_user_id between", value1, value2, "cnUserId");
            return (Criteria) this;
        }

        public Criteria andCnUserIdNotBetween(String value1, String value2) {
            addCriterion("cn_user_id not between", value1, value2, "cnUserId");
            return (Criteria) this;
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

        public Criteria andCnNoteTitleIsNull() {
            addCriterion("cn_note_title is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleIsNotNull() {
            addCriterion("cn_note_title is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleEqualTo(String value) {
            addCriterion("cn_note_title =", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleNotEqualTo(String value) {
            addCriterion("cn_note_title <>", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleGreaterThan(String value) {
            addCriterion("cn_note_title >", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("cn_note_title >=", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleLessThan(String value) {
            addCriterion("cn_note_title <", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("cn_note_title <=", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleLike(String value) {
            addCriterion("cn_note_title like", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleNotLike(String value) {
            addCriterion("cn_note_title not like", value, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleIn(List<String> values) {
            addCriterion("cn_note_title in", values, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleNotIn(List<String> values) {
            addCriterion("cn_note_title not in", values, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleBetween(String value1, String value2) {
            addCriterion("cn_note_title between", value1, value2, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteTitleNotBetween(String value1, String value2) {
            addCriterion("cn_note_title not between", value1, value2, "cnNoteTitle");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeIsNull() {
            addCriterion("cn_note_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeIsNotNull() {
            addCriterion("cn_note_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeEqualTo(Long value) {
            addCriterion("cn_note_create_time =", value, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeNotEqualTo(Long value) {
            addCriterion("cn_note_create_time <>", value, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeGreaterThan(Long value) {
            addCriterion("cn_note_create_time >", value, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("cn_note_create_time >=", value, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeLessThan(Long value) {
            addCriterion("cn_note_create_time <", value, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("cn_note_create_time <=", value, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeIn(List<Long> values) {
            addCriterion("cn_note_create_time in", values, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeNotIn(List<Long> values) {
            addCriterion("cn_note_create_time not in", values, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeBetween(Long value1, Long value2) {
            addCriterion("cn_note_create_time between", value1, value2, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("cn_note_create_time not between", value1, value2, "cnNoteCreateTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeIsNull() {
            addCriterion("cn_note_last_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeIsNotNull() {
            addCriterion("cn_note_last_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeEqualTo(Long value) {
            addCriterion("cn_note_last_modify_time =", value, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeNotEqualTo(Long value) {
            addCriterion("cn_note_last_modify_time <>", value, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeGreaterThan(Long value) {
            addCriterion("cn_note_last_modify_time >", value, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("cn_note_last_modify_time >=", value, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeLessThan(Long value) {
            addCriterion("cn_note_last_modify_time <", value, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeLessThanOrEqualTo(Long value) {
            addCriterion("cn_note_last_modify_time <=", value, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeIn(List<Long> values) {
            addCriterion("cn_note_last_modify_time in", values, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeNotIn(List<Long> values) {
            addCriterion("cn_note_last_modify_time not in", values, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeBetween(Long value1, Long value2) {
            addCriterion("cn_note_last_modify_time between", value1, value2, "cnNoteLastModifyTime");
            return (Criteria) this;
        }

        public Criteria andCnNoteLastModifyTimeNotBetween(Long value1, Long value2) {
            addCriterion("cn_note_last_modify_time not between", value1, value2, "cnNoteLastModifyTime");
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