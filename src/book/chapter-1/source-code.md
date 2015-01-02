Source code
===========

We can include a source code examples in our documentation via
code block:

```java

public static class Fancy extends Object {

  private final static String USELESS = "I am useless string";

}

```

We can link a source code from external file via
[include](https://github.com/rlmv/gitbook-plugin-include) plugin.
That file can be e.g. compiled against a library to make sure the
 code is correct before using it in documentation!
```java
!INCLUDE "../../examples/java/example/Person.java"
```