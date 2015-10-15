Diagram
========

Here is an example how to include graphs and diagrams rendered by excellent
 [mermaid](http://knsv.github.io/mermaid/).

We can do flow graphs like this one:

{% mermaid %}
graph LR
    A[Hard edge] -->|Link text| B(Round edge)
    B --> C{Decision}
    C -->|One| D[Result one]
    C -->|Two| E[Result two]
{% endmermaid %}

{% mermaid %}
graph LR
    id1(Start)-->id2(Stop)
    style id1 fill:#f9f,stroke:#333,stroke-width:4px;
    style id2 fill:#ccf,stroke:#f66,stroke-width:2px,stroke-dasharray: 5, 5;
{% endmermaid %}

{% mermaid %}
graph TB
         subgraph one
         a1-->a2
         end
         subgraph two
         b1-->b2
         end
         subgraph three
         c1-->c2
         end
         c1-->a2
{% endmermaid %}

{% mermaid %}
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
{% endmermaid %}

or even sequence diagrams and loaded from the file:

{% mermaid src="./diagram.mermaid" %}
{% endmermaid %}
