package com.lt.action;

import com.opensymphony.xwork2.Action;

public class TestImpAction implements Action {
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String execute() throws Exception {
        if ("2".equals(answer)) {

            return Action.SUCCESS;
        } else {
            return Action.ERROR;
        }
    }
}
