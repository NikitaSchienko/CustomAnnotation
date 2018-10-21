package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class DoubleHandler extends BaseHandler {

    public DoubleHandler(Class currentClass, String value) {
        this.currentClass = currentClass;
        this.value = value;
    }

    @Override
    protected Double cast() {
        //System.out.printf("%s This is Double\n", value);
        return Double.valueOf(value);
    }
}
