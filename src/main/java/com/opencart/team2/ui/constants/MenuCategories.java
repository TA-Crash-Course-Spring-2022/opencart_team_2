package com.opencart.team2.ui.constants;

public enum MenuCategories {
    DASHBOARD("dashboard"),
    CATALOG("catalog"),
    EXTENSIONS("extension"),
    DESIGN("design"),
    SALES("sale"),
    CUSTOMERS("customer"),
    MARKETING("marketing"),
    SYSTEM("system"),
    REPORTS("report");

    private final String name;

    MenuCategories(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
