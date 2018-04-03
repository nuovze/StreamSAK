# WLD-SR

As a streamer, I've always looked for an elegant tool that I could use to adjust my wins/losses/draws count on the fly, without having to tab out or edit a file manually.  I never found anything, so I decided to make it myself.

When you run the program, this little guy pops up above your windows, and you just select what you want to do.  Selecting WIN, LOSS, or DRAW will increment the count by one, and RESET W/L/D resets all three back to 0.  Since I primarily play Overwatch, I also included an ADJUST SR option which allows me to type in my new SR after every game:

I use the Elgato Stream Deck, so I have the program bound to a key on there, but I also have it assigned as a macro on my mouse.  To me, it's as simple as pressing a button, and my viewers get updates real-time with minimal effort on my part.

It took me like an hour to create, so I just thought I'd share it!

Note: The program creates files to hold the data in the program location.  For example, if the jar file is in my Desktop, it will create its files in the Desktop.  I recommend placing it in a folder by itself somewhere.  Then, just set up OBS to read in text from a file, and your counter is all set up to go!
