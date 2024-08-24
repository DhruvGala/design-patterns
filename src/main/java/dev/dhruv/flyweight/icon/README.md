## Flyweight Design Pattern
The Flyweight design pattern is a structural pattern that aims to minimize memory usage and improve performance by sharing objects that have similar or identical states. It is particularly useful when dealing with many objects that can be grouped into shared flyweight objects, reducing the overall memory footprint.

### example
Imagine a graphical user interface (GUI) application where multiple icons of different types (e.g., file icons, folder icons) need to be displayed on a screen. Each icon type has a specific appearance and behavior, such as different images and positions on the screen. However, displaying numerous icons of the same type can consume significant memory if each icon object stores its unique properties independently.