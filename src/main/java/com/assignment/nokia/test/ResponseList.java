package com.assignment.nokia.test;

import org.springframework.expression.spel.ast.Literal;

import java.util.List;

public class ResponseList {
    List<JsonPojo> jsonPojoList;

    public ResponseList(List<JsonPojo> jsonPojoList) {
        this.jsonPojoList = jsonPojoList;
    }

    public List<JsonPojo> getJsonPojoList() {
        return jsonPojoList;
    }

    public void setJsonPojoList(List<JsonPojo> jsonPojoList) {
        this.jsonPojoList = jsonPojoList;
    }
}
