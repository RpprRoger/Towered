Towered
=======
### This is a repo for a simple java game, based on <a href="http://towered.blogspot.com">this.</a>

Minor caveat using eclipse; any file externally edited will not immediatly display updates in eclipse, it is possible to
do a refresh on the project, don't forget!

### TODO

    Finish of serialise magic.
    Do less refactoring.

### Project layout
    
    This has grown quite a bit. I have done away with ExternalPipe and InternalPipe and moved reading and writing text
    files to the utilfactory. The resources will instead be contained and managed by resources.java, we can use the
    resources class to get resources from within the jar files. Then we can user the home directory to add
    custom maps and characters/enemies/stories etc without imbeding in the jar file.

    - towered
        > Main.java
        - core
            > Core.java
            > GameKeys.java
            > Logger.java
            > Settings.java
            - exceptions
                > ContentsLostException.java
                > FrameIsNullException.java
                > KeyNotFoundException.java
                > NoSupportedGraphicsModesException.java
                > SerialiseBufferedImageException.java
                > SettingsNotFoundException.java
            - factories
                > ScreenFactory.java
                > SettingsFactory.java
                > UtilFactory.java
            - services
                > ScreenManager.java
                > Services.java
                > SettingsManager.java
        - game
            > Towered.java
            - engine
                - scaler
            - entity
                > Entity.java
                > Map.java
            - modes
                > GameMode.java
                > Menu.java
                > Overworld.java
        - resources
            > Resources.java
        - seraliser
            > SerialiseFactory.java
            > Type.java
 
### External Resources

    I have found some free to use resources I'll be using to work on game logic with ( I can't draw or make music)
    
    - <a href="http://www.jamendo.com">http://www.jamendo.com</a> Has some cool music, I found some cool music by
        searching for 16bit
    - <a href="http://www.widgetworx.com/widgetworx/portfolio/spritelib.html">Widget works sprite lib</a> has some good basic drawn
        sprites.
        