package com.lt.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TestExtendsActionSupport extends ActionSupport {
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String execute() throws Exception {
        if ("2".equals(answer)) {

            return Action.SUCCESS;
        } else {
            return Action.ERROR;
        }
    }
}
