package com.hyl.cloudnote.entity;

import java.util.ArrayList;
import java.util.List;

public class CnUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnUserExample() {
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

        public Criteria andCnUserNameIsNull() {
            addCriterion("cn_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCnUserNameIsNotNull() {
            addCriterion("cn_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnUserNameEqualTo(String value) {
            addCriterion("cn_user_name =", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameNotEqualTo(String value) {
            addCriterion("cn_user_name <>", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameGreaterThan(String value) {
            addCriterion("cn_user_name >", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_user_name >=", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameLessThan(String value) {
            addCriterion("cn_user_name <", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameLessThanOrEqualTo(String value) {
            addCriterion("cn_user_name <=", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameLike(String value) {
            addCriterion("cn_user_name like", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameNotLike(String value) {
            addCriterion("cn_user_name not like", value, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameIn(List<String> values) {
            addCriterion("cn_user_name in", values, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameNotIn(List<String> values) {
            addCriterion("cn_user_name not in", values, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameBetween(String value1, String value2) {
            addCriterion("cn_user_name between", value1, value2, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserNameNotBetween(String value1, String value2) {
            addCriterion("cn_user_name not between", value1, value2, "cnUserName");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordIsNull() {
            addCriterion("cn_user_password is null");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordIsNotNull() {
            addCriterion("cn_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordEqualTo(String value) {
            addCriterion("cn_user_password =", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordNotEqualTo(String value) {
            addCriterion("cn_user_password <>", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordGreaterThan(String value) {
            addCriterion("cn_user_password >", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cn_user_password >=", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordLessThan(String value) {
            addCriterion("cn_user_password <", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("cn_user_password <=", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordLike(String value) {
            addCriterion("cn_user_password like", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordNotLike(String value) {
            addCriterion("cn_user_password not like", value, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordIn(List<String> values) {
            addCriterion("cn_user_password in", values, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordNotIn(List<String> values) {
            addCriterion("cn_user_password not in", values, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordBetween(String value1, String value2) {
            addCriterion("cn_user_password between", value1, value2, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserPasswordNotBetween(String value1, String value2) {
            addCriterion("cn_user_password not between", value1, value2, "cnUserPassword");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenIsNull() {
            addCriterion("cn_user_token is null");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenIsNotNull() {
            addCriterion("cn_user_token is not null");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenEqualTo(String value) {
            addCriterion("cn_user_token =", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenNotEqualTo(String value) {
            addCriterion("cn_user_token <>", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenGreaterThan(String value) {
            addCriterion("cn_user_token >", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenGreaterThanOrEqualTo(String value) {
            addCriterion("cn_user_token >=", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenLessThan(String value) {
            addCriterion("cn_user_token <", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenLessThanOrEqualTo(String value) {
            addCriterion("cn_user_token <=", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenLike(String value) {
            addCriterion("cn_user_token like", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenNotLike(String value) {
            addCriterion("cn_user_token not like", value, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenIn(List<String> values) {
            addCriterion("cn_user_token in", values, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenNotIn(List<String> values) {
            addCriterion("cn_user_token not in", values, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenBetween(String value1, String value2) {
            addCriterion("cn_user_token between", value1, value2, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserTokenNotBetween(String value1, String value2) {
            addCriterion("cn_user_token not between", value1, value2, "cnUserToken");
            return (Criteria) this;
        }

        public Criteria andCnUserNickIsNull() {
            addCriterion("cn_user_nick is null");
            return (Criteria) this;
        }

        public Criteria andCnUserNickIsNotNull() {
            addCriterion("cn_user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andCnUserNickEqualTo(String value) {
            addCriterion("cn_user_nick =", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickNotEqualTo(String value) {
            addCriterion("cn_user_nick <>", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickGreaterThan(String value) {
            addCriterion("cn_user_nick >", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("cn_user_nick >=", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickLessThan(String value) {
            addCriterion("cn_user_nick <", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickLessThanOrEqualTo(String value) {
            addCriterion("cn_user_nick <=", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickLike(String value) {
            addCriterion("cn_user_nick like", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickNotLike(String value) {
            addCriterion("cn_user_nick not like", value, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickIn(List<String> values) {
            addCriterion("cn_user_nick in", values, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickNotIn(List<String> values) {
            addCriterion("cn_user_nick not in", values, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickBetween(String value1, String value2) {
            addCriterion("cn_user_nick between", value1, value2, "cnUserNick");
            return (Criteria) this;
        }

        public Criteria andCnUserNickNotBetween(String value1, String value2) {
            addCriterion("cn_user_nick not between", value1, value2, "cnUserNick");
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