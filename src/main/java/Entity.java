import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.xml.ws.soap.Addressing;

public class Entity {

    @Setting("Thomas")
    private String name;

    @Setting("Martinez")
    private String surname;

    @Setting("15")
    private Integer age;

    //@Setting("false")
    private boolean action;

    @Setting("89376562267")
    private Long phone;

    @Setting("15")
    private int count;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}