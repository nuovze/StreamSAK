## StreamSAK Plugins

## Creating Your Own Plugins

If you're a strapping young Java programmer, and want to add more functionality to StreamSAK, then you're in the right place.  To begin, you're going to have to download the source files for the interface implementation that you'll need.  You can do that below.

**[Download StreamSAKPlugins]()**

Once you've downloaded the StreamSAKPlugins.jar file, you're going to need to import it into your project and set your build path to include it.  From there, developing your plug-in is as easy as implementing one of two interfaces:

```
SimplePlugin
AdvancedPlugin
```

The SimplePlugin interface contains limited functionality, while the AdvancedPlugin interface allows more versatility with your plug-in.  However, the AdvancedPlugin interface isn't always needed if you're just trying to do something simple.
