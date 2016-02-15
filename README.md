# Extensible Page Indicator

Simple view pager indicator based on Jardson Almeida concept. </br>
https://dribbble.com/shots/2429036-Page-Scrolling

![](https://i.imgur.com/b4Eb8zs.gif)

## Download

Gradle
```groovy
compile 'com.merhold.extensiblepageindicator:extensible-page-indicator:1.0.0'
```

## Usage
Define view in xml layout
```xml
<com.merhold.extensiblepageindicator.ExtensiblePageIndicator
        android:id="@+id/flexibleIndicator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:indicatorRadius="12dp"
        app:indicatorPadding="32dp"
        android:layout_marginBottom="80dp"
        android:layout_gravity="bottom" />
```
than init view pager object
```java
ExtensiblePageIndicator extensiblePageIndicator = (ExtensiblePageIndicator) findViewById(R.id.flexibleIndicator);
extensiblePageIndicator.initViewPager(mViewPager);
```
Available attributes:

* **indicatorRadius** - circle radius
* **indicatorPadding** - space between the circles
* **indicatorInactiveColor** - rare circles color
* **indicatorActiveColor** - extensible circle color
* **android:gravity** - left, center or right

## Library license

Extensible Page Indicator is published under the [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0) license. 
