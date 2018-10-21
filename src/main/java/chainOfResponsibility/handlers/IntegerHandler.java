package chainOfResponsibility.handlers;

import chainOfResponsibility.BaseHandler;

public class IntegerHandler extends BaseHandler {

    public IntegerHandler(Class currentClass, String value) {
        this.currentClass = currentClass;
        this.value = value;
    }


    public Integer cast(){
        //System.out.printf("%s This is Integer\n",value);
        return Integer.valueOf(value);
    }
}
