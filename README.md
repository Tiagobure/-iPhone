


# Projeto iPhone

## Diagrama UML

```mermaid
classDiagram
    Widget <|-- MusicPlayer
    MusicPlayer <|-- IphoneMainMenu
    IphoneMainMenu ..|> TelephoneDevice
    IphoneMainMenu ..|> Browser

    class Widget {
        <<abstract>>
        +close() void
    }

    class MusicPlayer {
        +play() void
        +pause() void
        +selectMusic(music: String) void
    }

    class IphoneMainMenu {
        +call() void
        +turnOn() void
        +turnOff() void
        +answer() void
        +startVoiceMail() void
        +displayPage(url: String) void
        +search() void
        +addNewTab() void
        +updatePage() void
        +play() void
        +pause() void
        +selectMusic(music: String) void
        +close() void
    }

    class TelephoneDevice {
        <<interface>>
        +call() void
        +turnOn() void
        +turnOff() void
        +answer() void
        +startVoiceMail() void
    }

    class Browser {
        <<interface>>
        +displayPage(url: String) void
        +search() void
        +addNewTab() void
        +updatePage() void
    }
