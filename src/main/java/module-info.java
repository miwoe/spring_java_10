module de.miwoe.jigsaw.spring.sample {
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    exports de.miwoe.java10.a;
    exports de.miwoe.java10;
    opens de.miwoe.java10;
}