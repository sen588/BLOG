package com.bgamq.core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCommentExample() {
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

        public Criteria andUserUidIsNull() {
            addCriterion("user_uid is null");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNotNull() {
            addCriterion("user_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUserUidEqualTo(String value) {
            addCriterion("user_uid =", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotEqualTo(String value) {
            addCriterion("user_uid <>", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThan(String value) {
            addCriterion("user_uid >", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThanOrEqualTo(String value) {
            addCriterion("user_uid >=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThan(String value) {
            addCriterion("user_uid <", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThanOrEqualTo(String value) {
            addCriterion("user_uid <=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLike(String value) {
            addCriterion("user_uid like", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotLike(String value) {
            addCriterion("user_uid not like", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidIn(List<String> values) {
            addCriterion("user_uid in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotIn(List<String> values) {
            addCriterion("user_uid not in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidBetween(String value1, String value2) {
            addCriterion("user_uid between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotBetween(String value1, String value2) {
            addCriterion("user_uid not between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andToUidIsNull() {
            addCriterion("to_uid is null");
            return (Criteria) this;
        }

        public Criteria andToUidIsNotNull() {
            addCriterion("to_uid is not null");
            return (Criteria) this;
        }

        public Criteria andToUidEqualTo(String value) {
            addCriterion("to_uid =", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotEqualTo(String value) {
            addCriterion("to_uid <>", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidGreaterThan(String value) {
            addCriterion("to_uid >", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidGreaterThanOrEqualTo(String value) {
            addCriterion("to_uid >=", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLessThan(String value) {
            addCriterion("to_uid <", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLessThanOrEqualTo(String value) {
            addCriterion("to_uid <=", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLike(String value) {
            addCriterion("to_uid like", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotLike(String value) {
            addCriterion("to_uid not like", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidIn(List<String> values) {
            addCriterion("to_uid in", values, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotIn(List<String> values) {
            addCriterion("to_uid not in", values, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidBetween(String value1, String value2) {
            addCriterion("to_uid between", value1, value2, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotBetween(String value1, String value2) {
            addCriterion("to_uid not between", value1, value2, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidIsNull() {
            addCriterion("to_user_uid is null");
            return (Criteria) this;
        }

        public Criteria andToUserUidIsNotNull() {
            addCriterion("to_user_uid is not null");
            return (Criteria) this;
        }

        public Criteria andToUserUidEqualTo(String value) {
            addCriterion("to_user_uid =", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidNotEqualTo(String value) {
            addCriterion("to_user_uid <>", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidGreaterThan(String value) {
            addCriterion("to_user_uid >", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidGreaterThanOrEqualTo(String value) {
            addCriterion("to_user_uid >=", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidLessThan(String value) {
            addCriterion("to_user_uid <", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidLessThanOrEqualTo(String value) {
            addCriterion("to_user_uid <=", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidLike(String value) {
            addCriterion("to_user_uid like", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidNotLike(String value) {
            addCriterion("to_user_uid not like", value, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidIn(List<String> values) {
            addCriterion("to_user_uid in", values, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidNotIn(List<String> values) {
            addCriterion("to_user_uid not in", values, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidBetween(String value1, String value2) {
            addCriterion("to_user_uid between", value1, value2, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andToUserUidNotBetween(String value1, String value2) {
            addCriterion("to_user_uid not between", value1, value2, "toUserUid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andBlogUidIsNull() {
            addCriterion("blog_uid is null");
            return (Criteria) this;
        }

        public Criteria andBlogUidIsNotNull() {
            addCriterion("blog_uid is not null");
            return (Criteria) this;
        }

        public Criteria andBlogUidEqualTo(String value) {
            addCriterion("blog_uid =", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidNotEqualTo(String value) {
            addCriterion("blog_uid <>", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidGreaterThan(String value) {
            addCriterion("blog_uid >", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidGreaterThanOrEqualTo(String value) {
            addCriterion("blog_uid >=", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidLessThan(String value) {
            addCriterion("blog_uid <", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidLessThanOrEqualTo(String value) {
            addCriterion("blog_uid <=", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidLike(String value) {
            addCriterion("blog_uid like", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidNotLike(String value) {
            addCriterion("blog_uid not like", value, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidIn(List<String> values) {
            addCriterion("blog_uid in", values, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidNotIn(List<String> values) {
            addCriterion("blog_uid not in", values, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidBetween(String value1, String value2) {
            addCriterion("blog_uid between", value1, value2, "blogUid");
            return (Criteria) this;
        }

        public Criteria andBlogUidNotBetween(String value1, String value2) {
            addCriterion("blog_uid not between", value1, value2, "blogUid");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidIsNull() {
            addCriterion("first_comment_uid is null");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidIsNotNull() {
            addCriterion("first_comment_uid is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidEqualTo(String value) {
            addCriterion("first_comment_uid =", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidNotEqualTo(String value) {
            addCriterion("first_comment_uid <>", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidGreaterThan(String value) {
            addCriterion("first_comment_uid >", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidGreaterThanOrEqualTo(String value) {
            addCriterion("first_comment_uid >=", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidLessThan(String value) {
            addCriterion("first_comment_uid <", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidLessThanOrEqualTo(String value) {
            addCriterion("first_comment_uid <=", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidLike(String value) {
            addCriterion("first_comment_uid like", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidNotLike(String value) {
            addCriterion("first_comment_uid not like", value, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidIn(List<String> values) {
            addCriterion("first_comment_uid in", values, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidNotIn(List<String> values) {
            addCriterion("first_comment_uid not in", values, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidBetween(String value1, String value2) {
            addCriterion("first_comment_uid between", value1, value2, "firstCommentUid");
            return (Criteria) this;
        }

        public Criteria andFirstCommentUidNotBetween(String value1, String value2) {
            addCriterion("first_comment_uid not between", value1, value2, "firstCommentUid");
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