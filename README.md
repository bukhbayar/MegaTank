# 🚜 MegaTank

> A little 2D tank game, made in Java — originally written in **2007** as a student project, and preserved here as a working version.

MegaTank is a top-down tank battle game drawn entirely with **Java 2D** (Swing, no game engine, no native code). You aim, shoot, dodge enemy soldiers, and fight your way across a series of maps — alone or against a friend over the network.

This repository is a **preserved, working copy** of the original project. It is not under active development; it is kept here so the game can still be built and played on modern machines.

---

## ✨ What's in the game

- 🎮 **Single-player mode** — fight enemy soldiers across the maps
- 🌐 **Multiplayer mode** — host a server or join a friend's game over the network
- 🗺️ **Multiple maps** with different layouts
- 🛡️ **Armor & lives** — tanks can take damage, lose armor, and respawn
- 🤖 **Enemy soldiers** that move, aim, and shoot back
- 🇲🇳 **Original Mongolian UI** (with a few English bits) — exactly as it shipped
- 📼 **About / credits screen** (an old MPEG video, played by the now-legendary JMF library)

## 🕹️ How to play

Start at the main menu:

| Action | Key |
|---|---|
| Move the selection up / down | `↑` / `↓` |
| Select / confirm | `Enter` |
| Turn the tank's head left / right | `A` / `D` |
| Aim the target left / right | `Q` / `E` |
| Fire! | `Space` |
| Go back / cancel | `Esc` |

That's it — it's a keyboard-only game. Point, aim, shoot, repeat. 💥


<img width="928" height="834" alt="Screenshot 2026-09-11 at 8 09 02 pm" src="https://github.com/user-attachments/assets/b0244791-4738-4f13-94f7-7ba687900318" />

<img width="927" height="827" alt="Screenshot 2026-09-11 at 8 09 29 pm" src="https://github.com/user-attachments/assets/83eb7a96-e5a2-4192-afcc-71fc062a5780" />

<img width="927" height="833" alt="Screenshot 2026-09-11 at 8 09 57 pm" src="https://github.com/user-attachments/assets/c9f9b821-399b-4e64-9eed-12165bc0adbe" />


## 📦 Building & running

You'll need:

- **JDK 8 or newer** (tested with Azul JDK 21)
- **Maven 3.6+**

From the project root:

```bash
# One-time: install the bundled JMF library into your local Maven repo
mvn install:install-file -Dfile=usedLibs/jmf.jar \
    -DgroupId=javax.media -DartifactId=jmf -Dversion=2.1.1e -Dpackaging=jar

# Build the game
mvn clean package
```

Then run it:

```bash
java -jar target/MegaTank.jar
```

Or simply open the project in your favorite Java IDE (IntelliJ IDEA works great) and run `Main.MainJApplet`.

> **Note:** the `About` screen uses an old MPEG video via JMF 2.1.1e (a 2003-era media library). It may not play on all modern systems — everything else in the game works fine.

## 🏗️ Tech notes

- **Language:** Java (compiled at release level 8, so it runs on any modern JDK)
- **UI / rendering:** Java Swing + `JApplet`-based frame, custom double-buffered `JPanel` rendering
- **Networking:** plain `java.net` sockets for the server/client multiplayer
- **Media:** JMF 2.1.1e (bundled in `usedLibs/`, not on Maven Central)
- **Build:** Maven (migrated from the original NetBeans/Ant project)

## 📁 Project layout

```
MegaTank/
├── pom.xml                  # Maven build
├── usedLibs/                # Bundled JMF jar (not on Maven Central)
└── src/main/
    ├── java/Main/           # All game code (game logic, menus, networking)
    └── resources/
        └── resource/
            ├── Menu/        # Menu artwork
            ├── Map/         # Map tiles
            ├── Player1/     # Player 1 tank sprites (4 directions × armor states)
            ├── Player2/     # Player 2 tank sprites
            ├── Soldier/     # Enemy soldier sprites
            └── media/       # The About-screen video
```

## 🖼️ A note on the art

All sprites and menu images are the **original 2007 artwork** — pixel-perfect, hand-made, and very of its era. That's part of the charm. 🥰

## 📜 History

MegaTank started life as a ~2007 student assignment (`Java2D by SW04D405`), built with NetBeans and Ant. In 2025–2026 it was given a small amount of loving care — migrated to Maven, and given a fix so the keyboard actually works on modern JDKs — and published here as a working archive.

No promises of future features. Just a tank, a keyboard, and a good time. 🚜💥

---

*Preserved and shared for fun. Not affiliated with any game studio (it never was).*
