package BaseData;

import javafx.beans.property.SimpleStringProperty;



    public class PersonTableData {
        private SimpleStringProperty id;
        private  SimpleStringProperty name; 
        private  SimpleStringProperty sex;
        private SimpleStringProperty age;



        private  SimpleStringProperty adress;
        private SimpleStringProperty wenhua;
        private SimpleStringProperty income;

        private SimpleStringProperty important;

        public PersonTableData() {}

        public PersonTableData(String id, String name, String sex,String age, String adress, String wenhua, String income,String important) {
            this.id = new SimpleStringProperty(id);
            this.name = new SimpleStringProperty(name);
            this.sex = new SimpleStringProperty(sex);
            this.age  = new SimpleStringProperty(age);
            this.adress = new SimpleStringProperty(adress);
            this.wenhua= new SimpleStringProperty(wenhua);
            this.income = new SimpleStringProperty(income);
            this.important = new SimpleStringProperty(important);
        }

        public String getId() {
            return id.get();
        }

        public SimpleStringProperty idProperty() {
            return id;
        }

        public void setId(String bookId) {
            this.id.set(bookId);
        }

        public String getName() {
            return name.get();
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }

        public void setName(String bookName) {
            this.name.set(bookName);
        }

        public String getSex() {
            return sex.get();
        }

        public SimpleStringProperty sexProperty() {
            return sex;
        }

        public void setSex(String bookAuthor) {
            this.sex.set(bookAuthor);
        }
        public String getAdress() {
            return adress.get();
        }

        public SimpleStringProperty adressProperty() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress.set(adress);
        }

        public String getWenhua() {
            return wenhua.get();
        }

        public SimpleStringProperty wenhuaProperty() {
            return wenhua;
        }

        public void setWenhua(String wenhua) {
            this.wenhua.set(wenhua);
        }

        public String getIncome() {
            return income.get();
        }

        public SimpleStringProperty incomeProperty() {
            return income;
        }

        public void setIncome(String income) {
            this.income.set(income);
        }

        public String getAge() {
            return age.get();
        }

        public SimpleStringProperty ageProperty() {
            return age;
        }

        public void setAge(String age) {
            this.age.set(age);
        }

        public String getImportant() {
            return important.get();
        }

        public SimpleStringProperty importantProperty() {
            return important;
        }

        public void setImportant(String important) {
            this.important.set(important);
        }
    }

