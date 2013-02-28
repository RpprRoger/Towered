Towered
=======
### This is a repo for a simple java game, based on <a href="http://towered.blogspot.com">this.</a>

Minor caveat using eclipse; any file externally edited will not immediatly display updates in eclipse, it is possible to
do a refresh on the project, don't forget!

### Project layout

    - towered
        * Main.java
            | This file will instantiate 
            |
        - core
            * AbstractBase.java
            * Core.java
            * Resolution.java
            * Settings.java
            - exceptions
            - services
                * ExternalPipe.java
                * InternalPipe.java
                * Logger.java
                * Service.java
                * SettingsFactory.java
        - game
            * Towered.java
            ? this should contain some sort of game screen logger
        - resources
            * Resources.java
        - window
            * Canvas.java
            * Frame.java
            * GameWindow.java
            * WindowFactory.java