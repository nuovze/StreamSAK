## StreamSAK v4.2.1 (Current Version)

![alt text](https://github.com/ShermanZero/StreamSAK/blob/master/data/misc/StreamSAK.png "StreamSAK v4.1")

**[Download StreamSAK](https://github.com/ShermanZero/StreamSAK/raw/master/data/StreamSAK.jar)**

As a streamer, I've always looked for an elegant tool that I could use to adjust my wins/losses/draws count on the fly, or various text tidbits, without having to tab out or edit a file manually.  I never found anything, so I decided to make it myself.  StreamSAK stands for Stream **S**-wiss **A**-rmy **K**-nife, by the way.

*Note: The program creates files to hold the data in the program location.  For example, if the .jar file is on my Desktop, it will create its files on the Desktop.  I recommend placing it in a folder by itself somewhere, and letting StreamSAK populate that folder.  Then, just set up OBS to read in text from the locations StreamSAK created, and your counter/text adjuster is all set up to go!*

Want to see it in action?  **[Check it out here!](https://www.youtube.com/watch?v=5vMYJbCoJkU)**

Since the video (**v3.0**), lots of awesome changes have been made, check the release notes below to get a better idea of what's been changed.

If you want to learn more about developing and/or using plug-ins which work with StreamSAK, check that out here:  **[StreamSAK Plug-ins](data/plugins)**



## Release Notes

**v4.2.1 (04.10.18) - Plug-in library updates.**
  - StreamSAKPluginLibrary updates to ensure that plug-ins are never out of date with the current plug-in library build.

**v4.1.1 (04.09.18) - UI changes to updater; crucial bug fixed.**
  - New StreamSAK updater UI.
  - Fixed bug with plug-in loader which prevented all .class files in a plug-in from loading in.

**v4.1 (04.09.18) - Plug-in support for auto calls.**
  - You can now link plug-ins as well as adjusters to counters.

**v4.0 (04.09.18) - UI changes; bug fixes; now can load plug-ins.**
  - The UI is updated to look cleaner and as "one unit".
  - Bugs related to deleting/creating counters/adjusters have been patched.
  - You can now create your own plug-ins for StreamSAK.  They appear as buttons under the adjusters, and selecting them will perform whatever action you have coded.  I intend to create (free) plug-ins in the future that you can download and use if you want StreamSAK to have more functionality outside of just being a counter/text changer.

**v3.1 (04.08.18) - Added space between CLEAR LOG, and the counter/adjuster options.**

**v3.0 (04.08.18) - UI overhaul; linking adjusters to counters moved to file instead of file naming convention; added increment/decrement options; added linking option directly in program.**
  - Major UI overhaul fixes lots of bugs with large counter/adjuster names.
  - Linking adjusters to counters is no longer done with files (e.g. wins--sr.txt would link wins to sr).  Now, it is done by the program automatically in the *links.properties* file.
  - You can now increment or decrement a counter.  Clicking a counter name will just display its value.
  - You can now link an adjuster to a counter from within the program.

**v2.2 (04.06.18) - Revised creation/deletion options; added self-check updater; adjusted counter naming convention to show if it calls an adjuster.**
  - Deleting counters and adjusters isn't quite as picky.  You used to have to type the exact name of the counter/adjuster, which you may not have realized since it could have been hidden (e.g. the counter "wins--sr" would display as "wins").  Now, the program automatically finds the best match to delete (e.g. "wins--sr" would be deleted if you just typed "wins").
  - If counters automatically called an adjuster after use, you had no indication.  Now, if it calls an adjuster, it is displayed in its name (e.g the counter "wins--sr" would be displayed as "wins [+1]--sr").
  - If StreamSAK is out of date, it will let you know with an option to update it.
  - Automatic Adjuster Calls (the thing that will automatically allow you to modify your adjuster after you click a counter) was shortened to AAC, and changed into a toggle button rather than a checkbox.
  - Supporting the developer (me) has been moved from the title to directly above the log, and isn't as "in your face".  Now it just says "*Support the dev*", instead of a direct link to my Twitch channel.
  - When to provide input is more obvious (textbox changes color, and cursor always flashes).
  - Minor GUI "bug" fixes.

**v2.1 (04.06.18) - Added creation/deletion options of counters/adjusters.**
  - You can now create and delete counters and adjusters directly from the program.

**v2.0 (04.05.18) - Original release.**
