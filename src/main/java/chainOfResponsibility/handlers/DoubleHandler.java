package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class DoubleHandler extends BaseHandler {

    public DoubleHandler(Class currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    protected Double cast(String value) {
        //System.out.printf("%s This is Double\n", value);
        return Double.valueOf(value);
    }
}
