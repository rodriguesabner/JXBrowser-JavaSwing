# JXBrowser-JavaSwing

Integrate your system with JXBrowser.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Built With

* [JXBrowser](https://www.teamdev.com/jxbrowser) - The JXBrowser Library
* [License](https://github.com/king-aspx/JXBrowser-JavaSwing/blob/master/MyLicense-1.0.jar) - This is the license I created, you will need it.

```
Documentation JXBrowser - https://jxbrowser.support.teamdev.com/support/solutions
Tutorial - https://www.youtube.com/watch?v=7rVChaNN33U
```

### Installing

Follow these steps for the integration to work properly


This is my license, this line of code is MANDATORY to work!
```
BrowserUtil.setVersion(Version.V6_22);
```

This is optional, it is for you to create a "profile" for the browser, so it will always save a session of WhatsApp, Facebook, etc ... It's like the history of Google Chrome

```
BrowserContextParams params = new BrowserContextParams(perfil);
BrowserPreferences.setChromiumSwitches("user-data-dir=" + perfil);
BrowserContext context = new BrowserContext(params);
browser = new Browser(context);
```

## Running the tests

If you want a fixed URL, do not put a String as a parameter, change the String to a true URL, for example: www.google.com. If you want to create something interactive, use the String.

```
//browser.loadURL(URL);
browser.loadURL("www.google.com");
```

## Screenshot

### Initial Screen
![image](https://user-images.githubusercontent.com/40338524/56543513-0bb56a00-6548-11e9-8398-b806c750b478.png)

### Interacting with our browser.
![image](https://user-images.githubusercontent.com/40338524/56543525-1839c280-6548-11e9-873e-c88034915560.png)
![image](https://user-images.githubusercontent.com/40338524/56543612-520ac900-6548-11e9-93f6-5807c936a9ab.png)
![image](https://user-images.githubusercontent.com/40338524/56543652-736bb500-6548-11e9-8101-29d2116b0741.png)
