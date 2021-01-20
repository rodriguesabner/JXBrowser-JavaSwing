package com.kingaspx.util;

import com.kingaspx.menu.Menu;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserPreferences;
import com.teamdev.jxbrowser.chromium.events.ConsoleEvent;
import com.teamdev.jxbrowser.chromium.events.FailLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.FrameLoadEvent;
import com.teamdev.jxbrowser.chromium.events.LoadEvent;
import com.teamdev.jxbrowser.chromium.events.LoadListener;
import com.teamdev.jxbrowser.chromium.events.ProvisionalLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.StartLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.TitleEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class BrowserController {

    private JTextField urlCampo;
    private JButton back, forward;

    public BrowserController() {
    }

    public BrowserController(JTextField urlCampo, JButton back, JButton forward) {
        this.urlCampo = urlCampo;
        this.back = back;
        this.forward = forward;
    }

    public void newBrowser(Integer id, Browser browser, String url, JTabbedPane jTabbedPane) {
        BrowserPreferences.setChromiumSwitches("--disable-gpu", "--disable-software-rasterizer", "--disable-web-security", "--allow-file-access-from-files");

        browser.addTitleListener((TitleEvent evt) -> {
            jTabbedPane.setTitleAt(id, evt.getTitle());
        });

        browser.addConsoleListener((ConsoleEvent evt) -> {
            System.out.println("LOG: " + evt.getMessage());
        });

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
                urlCampo.setText(browser.getCurrentNavigationEntry().getURL());

                if (browser.canGoForward()) {
                    forward.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/forward-allowed.png")));
                    forward.setEnabled(true);

                    forward.addActionListener((ActionEvent ae) -> {
                        browser.goForward();
                    });
                } else {
                    forward.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/forward-blocked.png")));
                    forward.setEnabled(false);
                }

                if (browser.canGoBack()) {
                    back.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/back-allowed.png")));
                    back.setEnabled(true);

                    back.addActionListener((ActionEvent ae) -> {
                        browser.goBack();
                    });
                } else {
                    back.setEnabled(false);
                    back.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/back-blocked.png")));
                }
            }

            @Override
            public void onDocumentLoadedInMainFrame(LoadEvent le) {
            }
        });

        browser.loadURL(url);
    }

    public void changeURL(Integer id, Browser browser, String url, JTabbedPane jTabbedPane) {
        browser.addTitleListener((TitleEvent evt) -> {

            String title = evt.getTitle();
            if (title.length() > 15) {
                jTabbedPane.setTitleAt(id, evt.getTitle().substring(0, 15) + "...");
            } else {
                jTabbedPane.setTitleAt(id, evt.getTitle());
            }

        });

        browser.loadURL(url);
    }

    public String getUrlTab(Browser browser) {
        return browser.getURL();
    }

    public void checkPreferences(Browser browser) {
        if (browser.canGoForward()) {
            forward.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/forward-allowed.png")));
            forward.setEnabled(true);

            forward.addActionListener((ActionEvent ae) -> {
                browser.goForward();
            });
        } else {
            forward.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/forward-blocked.png")));
            forward.setEnabled(false);
        }

        if (browser.canGoBack()) {
            back.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/back-allowed.png")));
            back.setEnabled(true);

            back.addActionListener((ActionEvent ae) -> {
                browser.goBack();
            });
        } else {
            back.setEnabled(false);
            back.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/com/kingaspx/icon/back-blocked.png")));
        }
    }

}
