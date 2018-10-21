public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        AnnotationsHandler annotationsHandler = new AnnotationsHandler();
        Entity entity = new Entity();
        annotationsHandler.execute(entity);

        System.out.println(entity.getName());
        System.out.println(entity.getSurname());
        System.out.println(entity.getAge());
        System.out.println(entity.getPhone());
        System.out.println(entity.getCount());
    }

}
