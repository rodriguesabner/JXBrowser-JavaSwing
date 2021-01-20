package com.kingaspx.main;

import com.formdev.flatlaf.FlatDarkLaf;
import com.kingaspx.menu.Menu;
import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;

public class Main {

    public static void main(String[] args) {
        BrowserUtil.setVersion(Version.V6_22);
        
        FlatDarkLaf.install();
        new Menu().setVisible(true);
    }
}
