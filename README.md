Towered
=======
### This is a repo for a simple java game, based on <a href="http://towered.blogspot.com">this.</a>

Minor caveat using eclipse; any file externally edited will not immediatly display updates in eclipse, it is possible to
do a refresh on the project, don't forget!

### Skeleton thoughts.

#### Packages
 - game package will contain classes exclusively for drawing the game and game logic.
    - ? entities package will contain the interface Entity and the different entities which will draw to the screen and have dx and dy etc
    - ? physics package should handle and contain all objects which need to move and clip
    - ? viewport package should handle what is seen by the user. totaly clueless how this should work
    - ? staticentites package to contain interface StaticEntity, eg map, turrets, shop etc. 
 - core package contains objects and factories used to launch and run the game.
    ? factories will generate objects from files using the external/internal pipe.
 - resources package contains resource files for the game, and a Resource class; maybe this should contain resource paths, or a way to gather paths
    - externals contains the external pipe class, which handles piping/streaming files from outside the jar
    - internals handles internal file streaming from within the jar, all going through the Resources class within the resources package
 - window package will handle the window and jframe/jpanel for rendering.
