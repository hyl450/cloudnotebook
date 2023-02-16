package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CnNotebookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnNotebookExample() {
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

        public Criteria andCnNotebookTypeIdIsNull() {
            addCriterion("cn_notebook_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdIsNotNull() {
            addCriterion("cn_notebook_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdEqualTo(String value) {
            addCriterion("cn_notebook_type_id =", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdNotEqualTo(String value) {
            addCriterion("cn_notebook_type_id <>", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdGreaterThan(String value) {
            addCriterion("cn_notebook_type_id >", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("cn_notebook_type_id >=", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdLessThan(String value) {
            addCriterion("cn_notebook_type_id <", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdLessThanOrEqualTo(String value) {
            addCriterion("cn_notebook_type_id <=", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdLike(String value) {
            addCriterion("cn_notebook_type_id like", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdNotLike(String value) {
            addCriterion("cn_notebook_type_id not like", value, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdIn(List<String> values) {
            addCriterion("cn_notebook_type_id in", values, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdNotIn(List<String> values) {
            addCriterion("cn_notebook_type_id not in", values, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdBetween(String value1, String value2) {
            addCriterion("cn_notebook_type_id between", value1, value2, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeIdNotBetween(String value1, String value2) {
            addCriterion("cn_notebook_type_id not between", value1, value2, "cnNotebookTypeId");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameIsNull() {
            addCriterion("cn_notebook_name is null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameIsNotNull() {
            addCriterion("cn_notebook_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameEqualTo(String value) {
            addCriterion("cn_notebook_name =", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameNotEqualTo(String value) {
            addCriterion("cn_notebook_name <>", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameGreaterThan(String value) {
            addCriterion("cn_notebook_name >", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_notebook_name >=", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameLessThan(String value) {
            addCriterion("cn_notebook_name <", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameLessThanOrEqualTo(String value) {
            addCriterion("cn_notebook_name <=", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameLike(String value) {
            addCriterion("cn_notebook_name like", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameNotLike(String value) {
            addCriterion("cn_notebook_name not like", value, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameIn(List<String> values) {
            addCriterion("cn_notebook_name in", values, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameNotIn(List<String> values) {
            addCriterion("cn_notebook_name not in", values, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameBetween(String value1, String value2) {
            addCriterion("cn_notebook_name between", value1, value2, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookNameNotBetween(String value1, String value2) {
            addCriterion("cn_notebook_name not between", value1, value2, "cnNotebookName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeIsNull() {
            addCriterion("cn_notebook_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeIsNotNull() {
            addCriterion("cn_notebook_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeEqualTo(Date value) {
            addCriterion("cn_notebook_createtime =", value, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeNotEqualTo(Date value) {
            addCriterion("cn_notebook_createtime <>", value, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeGreaterThan(Date value) {
            addCriterion("cn_notebook_createtime >", value, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cn_notebook_createtime >=", value, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeLessThan(Date value) {
            addCriterion("cn_notebook_createtime <", value, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("cn_notebook_createtime <=", value, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeIn(List<Date> values) {
            addCriterion("cn_notebook_createtime in", values, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeNotIn(List<Date> values) {
            addCriterion("cn_notebook_createtime not in", values, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeBetween(Date value1, Date value2) {
            addCriterion("cn_notebook_createtime between", value1, value2, "cnNotebookCreatetime");
            return (Criteria) this;
        }

        public Criteria andCnNotebookCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("cn_notebook_createtime not between", value1, value2, "cnNotebookCreatetime");
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