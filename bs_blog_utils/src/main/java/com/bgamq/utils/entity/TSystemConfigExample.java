package com.bgamq.utils.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSystemConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSystemConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyIsNull() {
            addCriterion("qi_niu_access_key is null");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyIsNotNull() {
            addCriterion("qi_niu_access_key is not null");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyEqualTo(String value) {
            addCriterion("qi_niu_access_key =", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyNotEqualTo(String value) {
            addCriterion("qi_niu_access_key <>", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyGreaterThan(String value) {
            addCriterion("qi_niu_access_key >", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyGreaterThanOrEqualTo(String value) {
            addCriterion("qi_niu_access_key >=", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyLessThan(String value) {
            addCriterion("qi_niu_access_key <", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyLessThanOrEqualTo(String value) {
            addCriterion("qi_niu_access_key <=", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyLike(String value) {
            addCriterion("qi_niu_access_key like", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyNotLike(String value) {
            addCriterion("qi_niu_access_key not like", value, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyIn(List<String> values) {
            addCriterion("qi_niu_access_key in", values, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyNotIn(List<String> values) {
            addCriterion("qi_niu_access_key not in", values, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyBetween(String value1, String value2) {
            addCriterion("qi_niu_access_key between", value1, value2, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuAccessKeyNotBetween(String value1, String value2) {
            addCriterion("qi_niu_access_key not between", value1, value2, "qiNiuAccessKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyIsNull() {
            addCriterion("qi_niu_secret_key is null");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyIsNotNull() {
            addCriterion("qi_niu_secret_key is not null");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyEqualTo(String value) {
            addCriterion("qi_niu_secret_key =", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyNotEqualTo(String value) {
            addCriterion("qi_niu_secret_key <>", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyGreaterThan(String value) {
            addCriterion("qi_niu_secret_key >", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyGreaterThanOrEqualTo(String value) {
            addCriterion("qi_niu_secret_key >=", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyLessThan(String value) {
            addCriterion("qi_niu_secret_key <", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyLessThanOrEqualTo(String value) {
            addCriterion("qi_niu_secret_key <=", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyLike(String value) {
            addCriterion("qi_niu_secret_key like", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyNotLike(String value) {
            addCriterion("qi_niu_secret_key not like", value, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyIn(List<String> values) {
            addCriterion("qi_niu_secret_key in", values, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyNotIn(List<String> values) {
            addCriterion("qi_niu_secret_key not in", values, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyBetween(String value1, String value2) {
            addCriterion("qi_niu_secret_key between", value1, value2, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andQiNiuSecretKeyNotBetween(String value1, String value2) {
            addCriterion("qi_niu_secret_key not between", value1, value2, "qiNiuSecretKey");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameIsNull() {
            addCriterion("email_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameIsNotNull() {
            addCriterion("email_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameEqualTo(String value) {
            addCriterion("email_user_name =", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameNotEqualTo(String value) {
            addCriterion("email_user_name <>", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameGreaterThan(String value) {
            addCriterion("email_user_name >", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("email_user_name >=", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameLessThan(String value) {
            addCriterion("email_user_name <", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameLessThanOrEqualTo(String value) {
            addCriterion("email_user_name <=", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameLike(String value) {
            addCriterion("email_user_name like", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameNotLike(String value) {
            addCriterion("email_user_name not like", value, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameIn(List<String> values) {
            addCriterion("email_user_name in", values, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameNotIn(List<String> values) {
            addCriterion("email_user_name not in", values, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameBetween(String value1, String value2) {
            addCriterion("email_user_name between", value1, value2, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailUserNameNotBetween(String value1, String value2) {
            addCriterion("email_user_name not between", value1, value2, "emailUserName");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordIsNull() {
            addCriterion("email_password is null");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordIsNotNull() {
            addCriterion("email_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordEqualTo(String value) {
            addCriterion("email_password =", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotEqualTo(String value) {
            addCriterion("email_password <>", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordGreaterThan(String value) {
            addCriterion("email_password >", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("email_password >=", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordLessThan(String value) {
            addCriterion("email_password <", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordLessThanOrEqualTo(String value) {
            addCriterion("email_password <=", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordLike(String value) {
            addCriterion("email_password like", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotLike(String value) {
            addCriterion("email_password not like", value, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordIn(List<String> values) {
            addCriterion("email_password in", values, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotIn(List<String> values) {
            addCriterion("email_password not in", values, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordBetween(String value1, String value2) {
            addCriterion("email_password between", value1, value2, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andEmailPasswordNotBetween(String value1, String value2) {
            addCriterion("email_password not between", value1, value2, "emailPassword");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressIsNull() {
            addCriterion("smtp_address is null");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressIsNotNull() {
            addCriterion("smtp_address is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressEqualTo(String value) {
            addCriterion("smtp_address =", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressNotEqualTo(String value) {
            addCriterion("smtp_address <>", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressGreaterThan(String value) {
            addCriterion("smtp_address >", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("smtp_address >=", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressLessThan(String value) {
            addCriterion("smtp_address <", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressLessThanOrEqualTo(String value) {
            addCriterion("smtp_address <=", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressLike(String value) {
            addCriterion("smtp_address like", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressNotLike(String value) {
            addCriterion("smtp_address not like", value, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressIn(List<String> values) {
            addCriterion("smtp_address in", values, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressNotIn(List<String> values) {
            addCriterion("smtp_address not in", values, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressBetween(String value1, String value2) {
            addCriterion("smtp_address between", value1, value2, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpAddressNotBetween(String value1, String value2) {
            addCriterion("smtp_address not between", value1, value2, "smtpAddress");
            return (Criteria) this;
        }

        public Criteria andSmtpPortIsNull() {
            addCriterion("smtp_port is null");
            return (Criteria) this;
        }

        public Criteria andSmtpPortIsNotNull() {
            addCriterion("smtp_port is not null");
            return (Criteria) this;
        }

        public Criteria andSmtpPortEqualTo(String value) {
            addCriterion("smtp_port =", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortNotEqualTo(String value) {
            addCriterion("smtp_port <>", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortGreaterThan(String value) {
            addCriterion("smtp_port >", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortGreaterThanOrEqualTo(String value) {
            addCriterion("smtp_port >=", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortLessThan(String value) {
            addCriterion("smtp_port <", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortLessThanOrEqualTo(String value) {
            addCriterion("smtp_port <=", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortLike(String value) {
            addCriterion("smtp_port like", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortNotLike(String value) {
            addCriterion("smtp_port not like", value, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortIn(List<String> values) {
            addCriterion("smtp_port in", values, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortNotIn(List<String> values) {
            addCriterion("smtp_port not in", values, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortBetween(String value1, String value2) {
            addCriterion("smtp_port between", value1, value2, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andSmtpPortNotBetween(String value1, String value2) {
            addCriterion("smtp_port not between", value1, value2, "smtpPort");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketIsNull() {
            addCriterion("qi_niu_bucket is null");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketIsNotNull() {
            addCriterion("qi_niu_bucket is not null");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketEqualTo(String value) {
            addCriterion("qi_niu_bucket =", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketNotEqualTo(String value) {
            addCriterion("qi_niu_bucket <>", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketGreaterThan(String value) {
            addCriterion("qi_niu_bucket >", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketGreaterThanOrEqualTo(String value) {
            addCriterion("qi_niu_bucket >=", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketLessThan(String value) {
            addCriterion("qi_niu_bucket <", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketLessThanOrEqualTo(String value) {
            addCriterion("qi_niu_bucket <=", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketLike(String value) {
            addCriterion("qi_niu_bucket like", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketNotLike(String value) {
            addCriterion("qi_niu_bucket not like", value, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketIn(List<String> values) {
            addCriterion("qi_niu_bucket in", values, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketNotIn(List<String> values) {
            addCriterion("qi_niu_bucket not in", values, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketBetween(String value1, String value2) {
            addCriterion("qi_niu_bucket between", value1, value2, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuBucketNotBetween(String value1, String value2) {
            addCriterion("qi_niu_bucket not between", value1, value2, "qiNiuBucket");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaIsNull() {
            addCriterion("qi_niu_area is null");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaIsNotNull() {
            addCriterion("qi_niu_area is not null");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaEqualTo(String value) {
            addCriterion("qi_niu_area =", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaNotEqualTo(String value) {
            addCriterion("qi_niu_area <>", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaGreaterThan(String value) {
            addCriterion("qi_niu_area >", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaGreaterThanOrEqualTo(String value) {
            addCriterion("qi_niu_area >=", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaLessThan(String value) {
            addCriterion("qi_niu_area <", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaLessThanOrEqualTo(String value) {
            addCriterion("qi_niu_area <=", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaLike(String value) {
            addCriterion("qi_niu_area like", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaNotLike(String value) {
            addCriterion("qi_niu_area not like", value, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaIn(List<String> values) {
            addCriterion("qi_niu_area in", values, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaNotIn(List<String> values) {
            addCriterion("qi_niu_area not in", values, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaBetween(String value1, String value2) {
            addCriterion("qi_niu_area between", value1, value2, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andQiNiuAreaNotBetween(String value1, String value2) {
            addCriterion("qi_niu_area not between", value1, value2, "qiNiuArea");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuIsNull() {
            addCriterion("upload_qi_niu is null");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuIsNotNull() {
            addCriterion("upload_qi_niu is not null");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuEqualTo(String value) {
            addCriterion("upload_qi_niu =", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuNotEqualTo(String value) {
            addCriterion("upload_qi_niu <>", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuGreaterThan(String value) {
            addCriterion("upload_qi_niu >", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuGreaterThanOrEqualTo(String value) {
            addCriterion("upload_qi_niu >=", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuLessThan(String value) {
            addCriterion("upload_qi_niu <", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuLessThanOrEqualTo(String value) {
            addCriterion("upload_qi_niu <=", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuLike(String value) {
            addCriterion("upload_qi_niu like", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuNotLike(String value) {
            addCriterion("upload_qi_niu not like", value, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuIn(List<String> values) {
            addCriterion("upload_qi_niu in", values, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuNotIn(List<String> values) {
            addCriterion("upload_qi_niu not in", values, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuBetween(String value1, String value2) {
            addCriterion("upload_qi_niu between", value1, value2, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadQiNiuNotBetween(String value1, String value2) {
            addCriterion("upload_qi_niu not between", value1, value2, "uploadQiNiu");
            return (Criteria) this;
        }

        public Criteria andUploadLocalIsNull() {
            addCriterion("upload_local is null");
            return (Criteria) this;
        }

        public Criteria andUploadLocalIsNotNull() {
            addCriterion("upload_local is not null");
            return (Criteria) this;
        }

        public Criteria andUploadLocalEqualTo(String value) {
            addCriterion("upload_local =", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalNotEqualTo(String value) {
            addCriterion("upload_local <>", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalGreaterThan(String value) {
            addCriterion("upload_local >", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalGreaterThanOrEqualTo(String value) {
            addCriterion("upload_local >=", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalLessThan(String value) {
            addCriterion("upload_local <", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalLessThanOrEqualTo(String value) {
            addCriterion("upload_local <=", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalLike(String value) {
            addCriterion("upload_local like", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalNotLike(String value) {
            addCriterion("upload_local not like", value, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalIn(List<String> values) {
            addCriterion("upload_local in", values, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalNotIn(List<String> values) {
            addCriterion("upload_local not in", values, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalBetween(String value1, String value2) {
            addCriterion("upload_local between", value1, value2, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andUploadLocalNotBetween(String value1, String value2) {
            addCriterion("upload_local not between", value1, value2, "uploadLocal");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityIsNull() {
            addCriterion("picture_priority is null");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityIsNotNull() {
            addCriterion("picture_priority is not null");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityEqualTo(String value) {
            addCriterion("picture_priority =", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityNotEqualTo(String value) {
            addCriterion("picture_priority <>", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityGreaterThan(String value) {
            addCriterion("picture_priority >", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityGreaterThanOrEqualTo(String value) {
            addCriterion("picture_priority >=", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityLessThan(String value) {
            addCriterion("picture_priority <", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityLessThanOrEqualTo(String value) {
            addCriterion("picture_priority <=", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityLike(String value) {
            addCriterion("picture_priority like", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityNotLike(String value) {
            addCriterion("picture_priority not like", value, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityIn(List<String> values) {
            addCriterion("picture_priority in", values, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityNotIn(List<String> values) {
            addCriterion("picture_priority not in", values, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityBetween(String value1, String value2) {
            addCriterion("picture_priority between", value1, value2, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andPicturePriorityNotBetween(String value1, String value2) {
            addCriterion("picture_priority not between", value1, value2, "picturePriority");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlIsNull() {
            addCriterion("qi_niu_picture_base_url is null");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlIsNotNull() {
            addCriterion("qi_niu_picture_base_url is not null");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlEqualTo(String value) {
            addCriterion("qi_niu_picture_base_url =", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlNotEqualTo(String value) {
            addCriterion("qi_niu_picture_base_url <>", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlGreaterThan(String value) {
            addCriterion("qi_niu_picture_base_url >", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qi_niu_picture_base_url >=", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlLessThan(String value) {
            addCriterion("qi_niu_picture_base_url <", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlLessThanOrEqualTo(String value) {
            addCriterion("qi_niu_picture_base_url <=", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlLike(String value) {
            addCriterion("qi_niu_picture_base_url like", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlNotLike(String value) {
            addCriterion("qi_niu_picture_base_url not like", value, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlIn(List<String> values) {
            addCriterion("qi_niu_picture_base_url in", values, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlNotIn(List<String> values) {
            addCriterion("qi_niu_picture_base_url not in", values, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlBetween(String value1, String value2) {
            addCriterion("qi_niu_picture_base_url between", value1, value2, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andQiNiuPictureBaseUrlNotBetween(String value1, String value2) {
            addCriterion("qi_niu_picture_base_url not between", value1, value2, "qiNiuPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlIsNull() {
            addCriterion("local_picture_base_url is null");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlIsNotNull() {
            addCriterion("local_picture_base_url is not null");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlEqualTo(String value) {
            addCriterion("local_picture_base_url =", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlNotEqualTo(String value) {
            addCriterion("local_picture_base_url <>", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlGreaterThan(String value) {
            addCriterion("local_picture_base_url >", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("local_picture_base_url >=", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlLessThan(String value) {
            addCriterion("local_picture_base_url <", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlLessThanOrEqualTo(String value) {
            addCriterion("local_picture_base_url <=", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlLike(String value) {
            addCriterion("local_picture_base_url like", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlNotLike(String value) {
            addCriterion("local_picture_base_url not like", value, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlIn(List<String> values) {
            addCriterion("local_picture_base_url in", values, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlNotIn(List<String> values) {
            addCriterion("local_picture_base_url not in", values, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlBetween(String value1, String value2) {
            addCriterion("local_picture_base_url between", value1, value2, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andLocalPictureBaseUrlNotBetween(String value1, String value2) {
            addCriterion("local_picture_base_url not between", value1, value2, "localPictureBaseUrl");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationIsNull() {
            addCriterion("start_email_notification is null");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationIsNotNull() {
            addCriterion("start_email_notification is not null");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationEqualTo(String value) {
            addCriterion("start_email_notification =", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationNotEqualTo(String value) {
            addCriterion("start_email_notification <>", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationGreaterThan(String value) {
            addCriterion("start_email_notification >", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationGreaterThanOrEqualTo(String value) {
            addCriterion("start_email_notification >=", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationLessThan(String value) {
            addCriterion("start_email_notification <", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationLessThanOrEqualTo(String value) {
            addCriterion("start_email_notification <=", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationLike(String value) {
            addCriterion("start_email_notification like", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationNotLike(String value) {
            addCriterion("start_email_notification not like", value, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationIn(List<String> values) {
            addCriterion("start_email_notification in", values, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationNotIn(List<String> values) {
            addCriterion("start_email_notification not in", values, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationBetween(String value1, String value2) {
            addCriterion("start_email_notification between", value1, value2, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andStartEmailNotificationNotBetween(String value1, String value2) {
            addCriterion("start_email_notification not between", value1, value2, "startEmailNotification");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Byte value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Byte value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Byte value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Byte value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Byte> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Byte> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Byte value1, Byte value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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