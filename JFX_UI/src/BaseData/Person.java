package BaseData;

public class Person {


    private String id;
    private String name;
    private String sex;
    private int age;
    private String adress;
    private String wenhua;
    private String income;
    private String important;

    public Person() {
    }


    public Person(String id, String name, String sex, int age, String adress,String wenhua, String income, String important) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.wenhua = wenhua;
        this.adress = adress;
        this.income = income;
        this.important = important;
    }
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWenhua() {
        return wenhua;
    }

    public void setWenhua(String wenhua) {
        this.wenhua = wenhua;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }








}
