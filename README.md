# Extensible Page Indicator

Forked from original project by @merhold (https://github.com/merhold/extensible-page-indicator) to fix an error when ViewPager or its adapter is null

## Download

Gradle
```groovy
compile 'com.maddog05.extensiblepageindicator:extensiblepageindicator:1.0.1'
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
