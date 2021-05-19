package Data;



import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        String ip = "localhost";

            IncomeStructure income=new IncomeStructure();
            HandleIncome hincome=new HandleIncome(ip);
            hincome.update(income);
            for (long i:income.getNum()){
                System.out.println(i);
            }



//        CultrueStructure cul=new CultrueStructure();
//        HandleCul hcul=new HandleCul(ip);
//        hcul.update(cul);
//        for (String i:cul.getPer()){
//            System.out.println(i);
//        }



//        AgeStructure age=new AgeStructure();
//        HandleAge hage=new HandleAge(ip);
//        hage.update(age);
//        for (String i: age.getPer()){
//            System.out.println(i);
//        }



//        IncomeStructure income=new IncomeStructure();
//        HandleIncom hIncome=new HandleIncom(ip);
//        hIncome.query(income);
//        String str[]=income.getPer();
//        for (String i:str
//             ) {
//            System.out.println(i);
//        }


//        RegisterAndLogin user = new RegisterAndLogin(ip);
//        System.out.println("注册");
//        System.out.print("输入账号：");
//        String id1 = input.nextLine();
//        user.register.setId(id1);
//        System.out.print("\n输入密码：");
//        String password1 = input.nextLine();
//        user.register.setPassword(password1);
//        System.out.print("\n输入用户名：");
//        String userName = input.nextLine();
//        user.register.setUserName(userName);
//        user.hRegister.writeRegister(user.register);
//
//        System.out.println("\n登陆");
//        System.out.print("输入账号：");
//        String id2 = input.nextLine();
//        user.login.setId(id2);
//        System.out.print("\n输入密码：");
//        String password2 = input.nextLine();
//        user.login.setPassword(password2);
//        user.hLogin.verify(user.login);
//
//        Scanner input=new Scanner(System.in);
//        String ip="localhost";
//        Person person=new Person();
//        HandlePerson hperson=new HandlePerson(ip);
//        System.out.print("id:");
//        String id=input.nextLine();
//        person.setId(id);
//
//        System.out.print("\nname:");
//        String name=input.nextLine();
//        person.setName(name);
//
//        System.out.print("\nsex:");
//        String sex=input.nextLine();
//        person.setSex(sex);
//
//        System.out.print("\nage:");
//        int age=input.nextInt();
//        person.setAge(age);
//
//        System.out.print("\naddress:");
//        String address=input.nextLine();
//        person.setAddress(address);
//
//        System.out.print("\nkey:");
//        String key=input.nextLine();
//        person.setKey(key);
//
//        System.out.print("\nincomLevel:");
//        String incomeLevel=input.nextLine();
//        person.setIncomeLevel(incomeLevel);
//
//        boolean ok=hperson.insert(person);
//        if (ok){
//            System.out.println("插入成功！");
//        }else{
//            System.out.println("插入失败！");
//        }
//        System.out.print("输入id:");
//        String id=input.nextLine();
//        person.setId(id);
//        boolean ok=hperson.delete(person);
//        if (ok){
//            System.out.println("删除成功！");
//        }else{
//            System.out.println("删除失败！");
//        }


//        House house=new House();
//        HandleHouse hhouse=new HandleHouse(ip);
//        hhouse.query(house);
//        String str[][]=house.getHouse();
//        for (int i=0;i<str.length;i++){
//            for (int j=0;j<str[0].length;j++){
//                System.out.print(str[i][j]+"\t");
//            }
//            System.out.println();
//        }


//        AgeStructure age=new AgeStructure();
//        HandleAge hage=new HandleAge(ip);
//        hage.query(age);
//        String str[]=age.getPer();
//        for (int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }

//        CultrueStructure cul=new CultrueStructure();
//        HandleCul hcul=new HandleCul(ip);
//        hcul.query(cul);
//        String str[]=cul.getPer();
//        for (String i:str){
//            System.out.println(i);
//        }


    }
}
