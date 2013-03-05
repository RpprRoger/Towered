Towered
=======
### This is a repo for a simple java game, based on <a href="http://towered.blogspot.com">this.</a>

Minor caveat using eclipse; any file externally edited will not immediatly display updates in eclipse, it is possible to
do a refresh on the project, don't forget!

### TODO

    - Write a proper todo list.
    - Look into using a better IDE, sublime?

### Project layout

    - towered
        * Main.java // Contains minor logic and instantiates new Towered. TODO: Parse command line params
        - core
            * AbstractBase.java // Contains Service instantiation and getters/setters
            * Core.java // Contains most of the Core game logic, basic game loop and variables such as FPS
            * Logger.java // Static logger class, consider moving?
            * Settings.java // Settings object containing game settings TODO: Save object to disk using simple text.
            - exceptions
                * ContentLostException.java // Exceptions currently just log using logger
                * FrameIsNullException.java // Maybe these should do something cleverer?
                * NoSupportedGraphicsModesException.java
            - factories
                * ScreenFactory.java // Screen factory contains tools and setup for the JFrame and other graphics device foo
                * SettingsFactory.java // Settings factory contains settings maker and will contain serialization foo
        - game
            * Towered.java // The actual game class, will contain game modes and active game modes
            - engine // Will contain core engine logic, Physics etc
            - modes
                * GameMode.java // Tests into how game modes will be stored and actived. This will be the abstract base to extend upon
                * Overworld.java // Example game mode, where we are in an overworld with shops etc
        - resources
            Resources.java // Main pipe for resource files, possibly un-needed, maybe contains hashmaps for different objects. e.g. maps
        -window // Possibly redundant