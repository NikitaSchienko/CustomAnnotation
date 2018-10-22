package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class IntegerHandler extends BaseHandler {

    public IntegerHandler(Class currentClass) {
        this.currentClass = currentClass;
    }

    public Integer cast(String value){
        //System.out.printf("%s This is Integer\n",value);
        return Integer.valueOf(value);
    }
}
