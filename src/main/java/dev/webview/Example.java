
package dev.webview;

public class Example {

    public static void main(String[] args) {
        Webview wv = new Webview(true); // Can optionally be created with an AWT component to be painted on.

        // Calling `await echo(1,2,3)` will return `[1,2,3]`
        wv.bind("echo", (arguments) -> {
            return arguments;
        });

        wv.setSize(800, 600);
        // wv.loadURL("https://google.com");
        // wv.loadURL("https://www.csic.es/es");
        wv.loadURL("http://localhost:8080/java-in-the-browser/");

        // Run the webview event loop, the webview is fully disposed when this returns.
        wv.run();
    }

}
