# GitBook Usage Example

Have you ever wanted to have a tool, for writing documentation, which would allow you to:
* express yourself in easy way such as [markdown](http://en.wikipedia.org/wiki/Markdown)
* insert code examples not just in from of inlined code blocks, but also from files (which you can validate first, e.g. they do compile)
* insert and render simple diagrams and flow charts
* insert mathematical expressions
* easily supply plugins to extend behaviors and add features
* support multiple output formats where one of them is good loking and simple static website 

Yes? Me too! You might want to checkout [GitBook](https://github.com/GitbookIO/gitbook). 
This is an example on how GitBook can be used to produce nice book or documentation for projects. It was born while I was discovering gitbook's gems and treasures.

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
