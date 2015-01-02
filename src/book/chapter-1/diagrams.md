Diagram
========

Here is an example how to include graphs and diagrams rendered by excellent
 [mermaid](http://knsv.github.io/mermaid/).

We can do flow graphs like this one:

```mermaid
graph LR;
  A-->B;
  A-->C;
  B-->D;
  C-->D;
```

or even sequence diagrams:

```mermaid
sequenceDiagram
    participant Alice
    participant Bob
    Alice->John: Hello John, how are you?
    loop Healthcheck
        John->John: Fight against hypochondria
    end
    Note right of John: Rational thoughts <br/>prevail...
    John-->Alice: Great!
    John->Bob: How about you?
    Bob-->John: Jolly good!
```
