package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class StringHandler extends BaseHandler {

    public StringHandler(Class currentClass, String value) {
        this.currentClass = currentClass;
        this.value = value;
    }

    protected String cast() {
        //System.out.printf("%s This is String\n", value);
        return String.valueOf(value);
    }
}
