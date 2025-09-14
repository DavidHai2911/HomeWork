package Code;

import java.util.*;
import java.text.*;

public class Person {
    
    private String full_name;
    private Date birthday;
    private String sex;
    private int identity_card;
    
    public Person(String full_name, Date birthday, String sex, int identity_card) {
        this.full_name = full_name;
        this.birthday = birthday;
        this.sex = sex;
        this.identity_card = identity_card;
    }
    
    public Person() {
    }
    
    public String getname() {
        return full_name;
    }
    
    public void setname(String full_name) {
        this.full_name = full_name;
    }
    
    public Date getbirth() {
        return birthday;
    }
    
    public void setbirth(Date birthday) {
        this.birthday = birthday;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public int getCard() {
        return identity_card;
    }
    
    public void setCard(int identity_card) {
        this.identity_card = identity_card;
    }
    
    public void input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your full name:");
            setname(sc.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Enter your birthday:");
            String birthstring = sc.nextLine();
            setbirth(sdf.parse(birthstring));
            System.out.print("Enter your sex:");
            setSex(sc.nextLine());
            System.out.print("Enter your identity card:");
            setCard(Integer.parseInt(sc.nextLine()));
        } catch (ParseException exception) {
            System.out.println("Error" + exception.getMessage());
            
        }
    }
    
    public void output() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Your name :" + getname());
        System.out.println("Your birthday :" + sdf.format(getbirth()));
        System.out.println("Your sex :" + getSex());
        System.out.println("Your identity card :" + getCard());
        
    }
}