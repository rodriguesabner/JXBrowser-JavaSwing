# JXBrowser-JavaSwing

Integrate your system with JXBrowser. (Clone Safari)

Video:
https://youtu.be/3C53qRco-Kw

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Built With

* [JXBrowser](https://jxbrowser-support.teamdev.com/release-notes/2019/v6-23-1.html) - The JXBrowser Library
* [License](https://github.com/king-aspx/JXBrowser-JavaSwing/blob/master/MyLicense-1.0.jar) - This is the license I created, you will need it.

```
Documentation JXBrowser - https://jxbrowser.support.teamdev.com/support/solutions
Tutorial - https://www.youtube.com/watch?v=7rVChaNN33U
```

### Installing

Follow these steps for the integration to work properly.

##ONLY WORKS WITH JDK 1.8!!!!


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
![image](https://user-images.githubusercontent.com/40338524/105224144-93744200-5b3b-11eb-8e6c-d68a084f0f93.png)
![image](https://user-images.githubusercontent.com/40338524/105223781-fe714900-5b3a-11eb-9b32-1d8e24220ac0.png)

### Interacting with our browser.
![image](https://user-images.githubusercontent.com/40338524/105223863-1e087180-5b3b-11eb-949a-5de93f7c97aa.png)
![image](https://user-images.githubusercontent.com/40338524/105223890-26f94300-5b3b-11eb-9930-76e95a9c19ba.png)
![image](https://user-images.githubusercontent.com/40338524/105223931-3a0c1300-5b3b-11eb-98db-48f047afef43.png)

