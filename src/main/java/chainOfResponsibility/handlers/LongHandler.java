package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class LongHandler extends BaseHandler {

    public LongHandler(Class currentClass ) {
        this.currentClass = currentClass;
    }

    @Override
    protected Long cast(String value) {
        //System.out.printf("%s This is Long\n", value);
        return Long.valueOf(value);
    }
}
