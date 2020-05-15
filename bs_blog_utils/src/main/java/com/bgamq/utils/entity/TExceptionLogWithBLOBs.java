package com.bgamq.utils.entity;

import java.io.Serializable;

public class TExceptionLogWithBLOBs extends TExceptionLog implements Serializable {
    private String exceptionJson;

    private String exceptionMessage;

    private String params;

    private static final long serialVersionUID = 1L;

    public String getExceptionJson() {
        return exceptionJson;
    }

    public void setExceptionJson(String exceptionJson) {
        this.exceptionJson = exceptionJson == null ? null : exceptionJson.trim();
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage == null ? null : exceptionMessage.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exceptionJson=").append(exceptionJson);
        sb.append(", exceptionMessage=").append(exceptionMessage);
        sb.append(", params=").append(params);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}