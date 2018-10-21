package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class LongHandler extends BaseHandler {

    public LongHandler(Class currentClass, String value) {
        this.currentClass = currentClass;
        this.value = value;
    }

    @Override
    protected Long cast() {
        //System.out.printf("%s This is Long\n", value);
        return Long.valueOf(value);
    }
}
