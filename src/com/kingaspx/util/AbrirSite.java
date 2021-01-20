package com.kingaspx.util;

import com.kingaspx.menu.Menu;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.chromium.*;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import com.teamdev.jxbrowser.chromium.events.ConsoleEvent;
import com.teamdev.jxbrowser.chromium.BrowserPreferences;
import com.teamdev.jxbrowser.chromium.events.FailLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.FrameLoadEvent;
import com.teamdev.jxbrowser.chromium.events.LoadEvent;
import com.teamdev.jxbrowser.chromium.events.LoadListener;
import com.teamdev.jxbrowser.chromium.events.ProvisionalLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.StartLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.TitleEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AbrirSite {

    public Browser browser;
    public BrowserView view;

    public void abrirPanel(String URL, JPanel panel, JLabel label, JTextField url, JButton back, JButton forward) {
        //Se estiver comentado = Sem perfil
        //Licença do JX
        BrowserUtil.setVersion(Version.V6_22);

        BrowserPreferences.setChromiumSwitches("--disable-gpu", "--disable-software-rasterizer", "--disable-web-security", "--allow-file-access-from-files");

        browser = new Browser();
        view = new BrowserView(browser);

        panel.add(view, BorderLayout.CENTER);

        browser.addLoadListener(new LoadListener() {
            @Override
            public void onStartLoadingFrame(StartLoadingEvent sle) {
            }

            @Override
            public void onProvisionalLoadingFrame(ProvisionalLoadingEvent ple) {
            }

            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent fle) {
            }

            @Override
            public void onFailLoadingFrame(FailLoadingEvent fle) {
            }

            @Override
            public void onDocumentLoadedInFrame(FrameLoadEvent fle) {
                url.setText(browser.getCurrentNavigationEntry().getURL());

                if (browser.canGoForward()) {
                    forward.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/forward-allowed.png")));
                    forward.setEnabled(true);
                } else {
                    forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kingaspx/icon/forward-blocked.png")));
                    forward.setEnabled(false);
                }

                if (browser.canGoBack()) {
                    back.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/back-allowed.png")));
                    back.setEnabled(true);
                } else {
                    back.setEnabled(false);
                    back.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/back-blocked.png")));
                }
            }

            @Override
            public void onDocumentLoadedInMainFrame(LoadEvent le) {
            }
        });

        //Mudar título do JFrame automaticamente
        browser.addTitleListener((TitleEvent evt) -> {
//            label.setText(evt.getTitle());
        });

        //Pegar o erro do console
        browser.addConsoleListener((ConsoleEvent evt) -> {
            System.out.println("LOG: " + evt.getMessage());
        });

        browser.loadURL(URL);
    }

}
