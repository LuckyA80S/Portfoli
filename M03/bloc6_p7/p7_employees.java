package bloc6;

import java.util.Scanner;

public class p7_employees {

    private String name;
    private int age;
    private String phone;
    private String department;

    public p7_employees() {
    }

    public p7_employees(String name, int age, String phone, String department) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public boolean checkPhone(String Phone) {
        if (phone.length() != 9) {
            return false;
        }
        char[] phoneChar = phone.toCharArray();
        for (int i = 0; i < phoneChar.length; i++) {
            if (!Character.isDigit(phoneChar[i])) {
                return false;
            }
        }
        return true;
    }

    public void setPhone(String phone) {
        Scanner in = new Scanner(System.in);
        phone = phone.replace("-", "");
        phone = phone.replace(".", "");
        phone = phone.replace(" ", "");
        while (checkPhone(phone)) {
            System.out.println("Intro nou telefon");
            phone = in.nextLine();
        }
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "p7_employees{" + "name=" + name + ", age=" + age + ", phone=" + phone + ", department=" + department + '}';
    }

}
