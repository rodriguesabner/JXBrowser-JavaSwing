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

//Back Page
browser.goBack();

//Forward Page
browser.goForward();

//reload
browser.reload();
```

## Screenshot

### Initial Screen
![image](https://user-images.githubusercontent.com/40338524/105253568-83218e80-5b5e-11eb-8f80-7bb04b7ad91d.png)

## Home Screen
![image](https://user-images.githubusercontent.com/40338524/105253583-89176f80-5b5e-11eb-8092-71e9b64c2042.png)

### Moving with cursor.
![image](https://user-images.githubusercontent.com/40338524/105253631-9e8c9980-5b5e-11eb-8820-d97622c8efc2.png)


### Interacting with our browser.

#### (fullscreen)

![image](https://user-images.githubusercontent.com/40338524/105253654-a9472e80-5b5e-11eb-9f73-899f64bc0e2b.png)

![image](https://user-images.githubusercontent.com/40338524/105253742-d693dc80-5b5e-11eb-868e-9dd56b495efc.png)


## Multiple Tabs

![image](https://user-images.githubusercontent.com/40338524/105253802-f9be8c00-5b5e-11eb-91c0-70ca9f04c411.png)

![image](https://user-images.githubusercontent.com/40338524/105253821-0347f400-5b5f-11eb-9e9f-bdd68697daad.png)