package com.kingaspx.util;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class BrowserModel {

    private Browser browser;
    private BrowserView browserView;
    private Integer id;

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    public BrowserView getBrowserView() {
        return browserView;
    }

    public void setBrowserView(BrowserView browserView) {
        this.browserView = browserView;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
