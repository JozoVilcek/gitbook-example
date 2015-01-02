# GitBook Usage Example

This is an example on how [GitBook](https://github.com/GitbookIO/gitbook)
 can be used to produce nice book or documentation for projects. This
 example was born while I was discovering gitbook's gems and treasures.

## How to run it?

To make things (hopefully) easier, everything is managed by gradle. No need to setup anything locally.

To build the book, run:

```
./gradlew buildDocs
```

and generated book will appear in `./build/docs/` folder. When you open the book, e.g. search will not be working (off course). We need a server for that.

To serve the book, run:

```
./gradlew serveDocs
```

and watch the console for hint where the book can be reached.
