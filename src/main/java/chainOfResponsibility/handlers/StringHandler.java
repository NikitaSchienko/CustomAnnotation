package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class StringHandler extends BaseHandler {

    public StringHandler(Class currentClass) {
        this.currentClass = currentClass;
    }

    protected String cast(String value) {
        //System.out.printf("%s This is String\n", value);
        return String.valueOf(value);
    }
}
