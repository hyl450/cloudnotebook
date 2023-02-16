package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnNotebookTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnNotebookTypeExample() {
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

        public Criteria andCnNotebookTypeCodeIsNull() {
            addCriterion("cn_notebook_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeIsNotNull() {
            addCriterion("cn_notebook_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeEqualTo(String value) {
            addCriterion("cn_notebook_type_code =", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeNotEqualTo(String value) {
            addCriterion("cn_notebook_type_code <>", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeGreaterThan(String value) {
            addCriterion("cn_notebook_type_code >", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cn_notebook_type_code >=", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeLessThan(String value) {
            addCriterion("cn_notebook_type_code <", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("cn_notebook_type_code <=", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeLike(String value) {
            addCriterion("cn_notebook_type_code like", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeNotLike(String value) {
            addCriterion("cn_notebook_type_code not like", value, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeIn(List<String> values) {
            addCriterion("cn_notebook_type_code in", values, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeNotIn(List<String> values) {
            addCriterion("cn_notebook_type_code not in", values, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeBetween(String value1, String value2) {
            addCriterion("cn_notebook_type_code between", value1, value2, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeCodeNotBetween(String value1, String value2) {
            addCriterion("cn_notebook_type_code not between", value1, value2, "cnNotebookTypeCode");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameIsNull() {
            addCriterion("cn_notebook_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameIsNotNull() {
            addCriterion("cn_notebook_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameEqualTo(String value) {
            addCriterion("cn_notebook_type_name =", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameNotEqualTo(String value) {
            addCriterion("cn_notebook_type_name <>", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameGreaterThan(String value) {
            addCriterion("cn_notebook_type_name >", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_notebook_type_name >=", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameLessThan(String value) {
            addCriterion("cn_notebook_type_name <", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameLessThanOrEqualTo(String value) {
            addCriterion("cn_notebook_type_name <=", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameLike(String value) {
            addCriterion("cn_notebook_type_name like", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameNotLike(String value) {
            addCriterion("cn_notebook_type_name not like", value, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameIn(List<String> values) {
            addCriterion("cn_notebook_type_name in", values, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameNotIn(List<String> values) {
            addCriterion("cn_notebook_type_name not in", values, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameBetween(String value1, String value2) {
            addCriterion("cn_notebook_type_name between", value1, value2, "cnNotebookTypeName");
            return (Criteria) this;
        }

        public Criteria andCnNotebookTypeNameNotBetween(String value1, String value2) {
            addCriterion("cn_notebook_type_name not between", value1, value2, "cnNotebookTypeName");
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