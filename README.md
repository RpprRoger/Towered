Towered
=======
### This is a repo for a simple java game, based on <a href="http://towered.blogspot.com">this.</a>

Minor caveat using eclipse; any file externally edited will not immediatly display updates in eclipse, it is possible to
do a refresh on the project, don't forget!

### Project layout

    - towered
        * Main.java
        - core
            * AbstractBase.java
            * Core.java
            * Logger.java
            * Settings.java
            - exceptions
                * ContentLostException.java
                * FrameIsNullException.java
                * NoSupportedGraphicsModesException.java
            - factories
                * ScreenFactory.java
                * SettingsFactory.java
        - game
            * Towered.java
            - engine
            - modes
                * GameMode.java
                * Overworld.java
        - resources
            Resources.java
        -window // Possibly redundant