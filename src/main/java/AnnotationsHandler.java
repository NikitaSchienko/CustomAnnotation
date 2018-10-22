import chainOfResponsibility.BaseHandler;
import chainOfResponsibility.handlers.DoubleHandler;
import chainOfResponsibility.handlers.IntegerHandler;
import chainOfResponsibility.handlers.LongHandler;
import chainOfResponsibility.handlers.StringHandler;

import java.lang.reflect.Field;


class AnnotationsHandler {

    private BaseHandler createChain() {
        BaseHandler stringHandler = new StringHandler(String.class);
        BaseHandler integerHandler = stringHandler.setNext(new IntegerHandler(Integer.class));
        BaseHandler doubleHandler = integerHandler.setNext(new DoubleHandler(Double.class));
        BaseHandler longHandler = doubleHandler.setNext(new LongHandler(Long.class));
        BaseHandler integerPromitiveHandler = longHandler.setNext(new IntegerHandler(Integer.TYPE));
        BaseHandler longPrimitiveHandler = integerPromitiveHandler.setNext(new LongHandler(Long.TYPE));
        BaseHandler doublePrimitiveHandler = longPrimitiveHandler.setNext(new DoubleHandler(Double.TYPE));
        return stringHandler;
    }

    void execute(Entity entity) throws IllegalAccessException {
        BaseHandler baseHandler = createChain();
        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Setting.class)) {
                Setting setting = field.getAnnotation(Setting.class);
                String value = setting.value();
                field.setAccessible(true);
                field.set(entity, baseHandler.castSelection(field.getType(),value));
            }
        }
    }
}
