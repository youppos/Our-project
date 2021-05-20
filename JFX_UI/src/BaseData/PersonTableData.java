package BaseData;

import javafx.beans.property.SimpleStringProperty;



    public class PersonTableData {
        private SimpleStringProperty id;
        private  SimpleStringProperty name; 
        private  SimpleStringProperty sex;
        private SimpleStringProperty wenhua;
        private SimpleStringProperty income;
        private SimpleStringProperty age;
        private SimpleStringProperty important;

        public PersonTableData() {}

        public PersonTableData(String bookId, String bookName, String bookAuthor,String bookAuthorSex, String bookPrice, String bookDescription, String bookType) {
            this.id = new SimpleStringProperty(bookId);
            this.name = new SimpleStringProperty(bookName);
            this.sex = new SimpleStringProperty(bookAuthor);
            this.wenhua = new SimpleStringProperty(bookAuthorSex);
            this.income = new SimpleStringProperty(bookPrice);
            this.age = new SimpleStringProperty(bookDescription);
            this.important = new SimpleStringProperty(bookType);
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

