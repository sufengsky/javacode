package Demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class Customer {
    boolean Login(String acc, String pass) {
        try {
            ConnectDB ob = new ConnectDB();
            Connection con = ob.getDbConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery("select * from customer where accno ='" + acc + "' and password = '" + pass + "'");
            if (rst.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Demo.Customer class login method" + e);
            return false;
        }
    }

    void display_Customer(String acc) {
        try {
            ConnectDB ob = new ConnectDB();
            Connection con = ob.getDbConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery("select * from customer where accno ='" + acc + "'");
            if (rst.next()) {
                System.out.println("Account no    # :" + acc);
                System.out.println("Password        :" + rst.getString("password"));
                System.out.println("Name            :" + rst.getString("name"));
                System.out.println("Contact         :" + rst.getString("contact"));
                System.out.println("Current Balance :" + rst.getDouble("balance"));
                System.out.println("Address         :" + rst.getString("address"));
            }
        } catch (Exception e) {
            System.out.println("Customer class display method" + e);
        }
    }

    void change_pass_cust(String acc, String pass) {
        try {
            ConnectDB ob = new ConnectDB();
            Connection con = ob.getDbConnection();
            Statement stm = con.createStatement();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new password :");
            String p1 = in.readLine();
            System.out.println("Confirm password :");
            String p2 = in.readLine();
            if (p1.equals(p2)) {
                stm.executeUpdate("update customer set password='" + p1 + "' where accno='" + acc + "' and password='" + pass + "'");
                System.out.println("password updated successfully...");
            } else {
                System.out.println("password does not match");
            }
        } catch (Exception e) {
            System.out.println("Customer class change password method" + e);
        }
    }

    void withdraw(String acc, String pass) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ConnectDB ob = new ConnectDB();
            Connection con = ob.getDbConnection();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery("select * from customer where accno ='" + acc + "' and password ='" + pass + "'");
            double amt1 = 0, amt2 = 0;
            System.out.print("Enter the amount :");
            amt2 = Double.parseDouble(in.readLine());
            if (rst.next()) {
                amt1 = rst.getDouble("Balance");
            }
            if (amt1 - amt2 < 0) {
                System.out.println("You cannot withdraw ");
            } else {
                stm.executeUpdate("update customer set balance='" + (amt1 - amt2) + "' where accno ='" + acc + "' and password ='" + pass + "'");
                System.out.println("money withdrawn");
                System.out.println("Current balance:" + (amt1 - amt2));
            }
        } catch (Exception e) {
            System.out.println("customer class withdraw method " + e);
        }
    }
}

public class CustomerMain {
    private static String password;

    public static void main(String[] args) throws Exception {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Customer..??");
            System.out.println("1-Yes or 2-No");
            int choice = Integer.parseInt(in.readLine());
            String acc;
            switch (choice) {
                case 1:
                    Customer customer = new Customer();
                    System.out.println("Enter A/C # : ");
                    acc = in.readLine();
                    System.out.println("Enter password :");
                    password = in.readLine();
                    boolean isLogin = customer.Login(acc, password);
                    if (isLogin) {
                        System.out.println("1-Display my details");
                        System.out.println("2-Change password");
                        System.out.println("3-Withdraw money");
                        System.out.print("Enter your choice: ");
                        int choice2 = Integer.parseInt(in.readLine());
                        switch (choice2) {
                            case 1:
                                customer.display_Customer(acc);
                                break;
                            case 2:
                                customer.change_pass_cust(acc, password);
                                break;
                            case 3:
                                customer.withdraw(acc, password);
                                break;
                            default:
                                System.out.println("Wrong choice");
                        }
                    } else {
                        System.out.println("Invalid A/C or password");
                    }
                    break;
                default:
                    System.out.println("Thank you");
            }
        } catch (Exception e) {
            System.out.println("main method:" + e);
        }
    }
}

