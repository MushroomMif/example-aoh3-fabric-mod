[🇷🇺 Русский](https://github.com/MushroomMif/example-aoh3-fabric-mod/blob/master/README_RU.md)
Example mod for Age of History 3 Fabric Loader
============
This is an example mod for the [AOH3 Fabric Loader](https://github.com/MushroomMif/aoh3-fabric-loader).
You can use it as a template to create your own mods for this loader. 
Here are the steps to set it up:
1. Initial setup (you need to do it only once)
- Create a directory where all your mods for AOH3 Fabric Loader will be located.
- Create a `libs` directory there.
- Download [this archive](https://disk.yandex.ru/d/eTRhqz-oJE8lpQ) and unzip it's content
to previously created `libs` directory.
- Add loader's jar and game's jar renamed to `aoh3.jar` to the same directory. 
On Windows the game jar is just the `aoh3.exe` in the game directory and on Mac it is
`Age of History 3.app/Contents/MacOS/Age of History 3-*Version*.jar`. 
Don't forget to rename it to `aoh3.jar` in either case. 
If there is a new game update out you need to repeat this step.
- Download `aoh3-fabric-api.jar` and `aoh3-fabric-api-sources.jar` from 
[a latest AOH3 Fabric Api release](https://github.com/MushroomMif/aoh3-fabric-api/releases/latest)
and also put them to the `libs` directory. Technically, this is not necessary, but
AOH3 Fabric Api provides some very useful utils so why not use them. If there is a new
AOH3 Fabric Api version out you also need to repeat this step.
- Optional: For game's code better readability and better navigation of it in the IDE
we recommend to decompile it using a decompiler 
(for example, [Vineflower](https://github.com/Vineflower/vineflower))
and attach generated sources to the game's jar in IDE.
2. Mod project setup (you need do it for every new mod)
- Clone this repository to the mods projects directory you previously created.
- Rename created directory to your mod's name and also change it in `settings.gradle.kts` file.
- Open created project in your favorite IDE (if you don't know what IDE to use 
we recommend [free Intellij IDEA **Community Edition**](https://jetbrains.com/idea/download/)).
- Rename `com.example.mod` in `src/main/java` to any namespace you prefer and change
it in `src/main/resources/modid.mixins.json` file.
- Configure `id`, `version`, `name`, `description` and `authors` fields in
`src/main/resources/fabric.mod.json`. Also, replace `modid` in the name of `modid.mixins.json`
file with id of your mod and update it in `mixins` field in `fabric.mod.json` file.
- Congratulations! You have successfully set up the mod project. 
Now you can start writing mixins. We recommend to install the 
[Minecraft Dev plugin](https://mcdev.io/) if you are using IntelliJ IDEA,
it will help with writing of mixins. To build the project use `gradlew build` command,
it will create your mod's jar-file in `build/libs` directory. Also, take a look at 
[Mixins section on Fabric wiki](https://fabricmc.net/wiki/tutorial:mixin_introduction) and
[MixinExtras docs](https://github.com/LlamaLad7/MixinExtras/wiki) 
or just watch some videos on YouTube. If you want a deep understanding of this technology
you can view [the documentation of Mixin library](https://github.com/SpongePowered/Mixin/wiki).
