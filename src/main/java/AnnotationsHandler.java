import chainOfResponsibility.BaseHandler;
import chainOfResponsibility.handlers.DoubleHandler;
import chainOfResponsibility.handlers.IntegerHandler;
import chainOfResponsibility.handlers.LongHandler;
import chainOfResponsibility.handlers.StringHandler;

import java.lang.reflect.Field;


class AnnotationsHandler {

    private BaseHandler createChain(String value) {
        BaseHandler stringHandler = new StringHandler(String.class, value);
        BaseHandler integerHandler = stringHandler.setNext(new IntegerHandler(Integer.class, value));
        BaseHandler doubleHandler = integerHandler.setNext(new DoubleHandler(Double.class, value));
        BaseHandler longHandler = doubleHandler.setNext(new LongHandler(Long.class, value));
        BaseHandler integerPromitiveHandler = longHandler.setNext(new IntegerHandler(Integer.TYPE, value));
        BaseHandler longPrimitiveHandler = integerPromitiveHandler.setNext(new LongHandler(Long.TYPE, value));
        BaseHandler doublePrimitiveHandler = longPrimitiveHandler.setNext(new DoubleHandler(Double.TYPE, value));
        return stringHandler;
    }

    void execute(Entity entity) throws IllegalAccessException {
         Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Setting.class)) {
                Setting setting = field.getAnnotation(Setting.class);
                String value = setting.value();
                BaseHandler baseHandler = createChain(value);
                field.setAccessible(true);
                field.set(entity, baseHandler.castSelection(field.getType()));
            }
        }
    }
}
