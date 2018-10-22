package chainOfResponsibility;

public abstract class BaseHandler {

    protected String value;
    protected Class currentClass;
    private BaseHandler next;

    public BaseHandler setNext(BaseHandler next) {
        this.next = next;
        return next;
    }

    public Object castSelection(Class c, String value) {
        if(c.equals(currentClass)){
            return cast(value);
        }else if (next != null) {
            return next.castSelection(c, value);
        }else {
            throw new ClassCastException("The field must be a string or a number");
        }
    }

    abstract protected Object cast(String v);
}
