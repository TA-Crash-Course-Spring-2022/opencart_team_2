package com.opencart.team2.ui.constants;

public enum MenuName {
    DESKTOPS("desktops"),
    LAPTOPSNOTEBOOKS("laptops&notebooks"),
    COMPONENTS("components"),
    TABLETS("tablets"),
    SOFTWARE("software"),
    PHONESPDAs("phones&pdas"),
    CAMERAS("cameras"),
    MP3PLAYERS("mp3players");

    private final String name;

    MenuName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
