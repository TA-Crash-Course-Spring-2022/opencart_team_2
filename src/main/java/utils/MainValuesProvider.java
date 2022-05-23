package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MainValuesProvider {
    Properties properties = new Properties();

    public MainValuesProvider() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/java/resources/data.properties");
        properties.load(fileInputStream);
    }

    public String getLoginEmail() {
        return properties.getProperty("loginEmail");

    }

    public String getLoginPassword() {
        return properties.getProperty("loginPassword");
    }

    public String getNewPassword() {
        return properties.getProperty("newPassword");
    }

    public String getNewEmail() {
        return properties.getProperty("newEmail");
    }

    public String getDefaultTelephone() { return properties.getProperty("defaultTelephone"); }

    public String getNewFirstName() {
        return properties.getProperty("newFirstName");
    }

    public String getNewLastName() {
        return properties.getProperty("newLastName");
    }

    public String getPhone() {
        return properties.getProperty("phone");
    }

    public String getFirstName() {
        return properties.getProperty("firstName");
    }

    public String getLastName() {
        return properties.getProperty("lastName");
    }

    public String getCompany() {
        return properties.getProperty("company");
    }

    public String getNewTelephone() { return properties.getProperty("newTelephone"); }

    public String getAddress1() {
        return properties.getProperty("address1");
    }

    public String getAddress2() {
        return properties.getProperty("address2");
    }

    public String getCity() {
        return properties.getProperty("city");
    }

    public String getPostCode() {
        return properties.getProperty("postCode");
    }

    public String getCountry() {
        return properties.getProperty("countryCode");
    }

    public String getRegion() {
        return properties.getProperty("regionCode");
    }

    public String getComment() {
        return properties.getProperty("comment");
    }

    public int getId1(){return Integer.parseInt(properties.getProperty("id1"));}

    public int getId2(){return Integer.parseInt(properties.getProperty("id2"));}

    public int getId3(){return Integer.parseInt(properties.getProperty("id3"));}

    public int getId4(){return Integer.parseInt(properties.getProperty("id4"));}

    public String getCurrencyTitle() {
        return properties.getProperty("currencyTitle");
    }

    public String getCode() {
        return properties.getProperty("code");
    }

    public String getSymbolLeft() {
        return properties.getProperty("symbolLeft");
    }

    public String getSymbolRight() {
        return properties.getProperty("symbolRight");
    }

    public String getDecimal() {
        return properties.getProperty("decimal");
    }

    public String getValue() {
        return properties.getProperty("value");
    }

    public String getStatus() {
        return properties.getProperty("status");
    }

    public String getAdminLogin() {
        return properties.getProperty("adminLogin");
    }

    public String getAdminPassword() {
        return properties.getProperty("adminPassword");
    }

    public String getLvl1() {
        return properties.getProperty("lvl1");
    }

    public String getLvl2() {
        return properties.getProperty("lvl2");
    }

    public String getProd1() {
        return properties.getProperty("product1");
    }

    public String getProd2() {
        return properties.getProperty("product2");
    }

}
