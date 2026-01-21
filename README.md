# Utility Mod

Minecraft Forge mod for version 1.20.1 that modifies the **Strength** potion effect.

## Features

✨ **Modified Strength Effect**
- Strength I: +30% damage
- Strength II: +60% damage
- Strength III: +90% damage
- And so on...

Instead of the default +3 damage per level, this mod scales damage by **30% per level**.

## Installation

1. Download the latest `.jar` file from [Releases](../../releases)
2. Place it in your `mods` folder
3. Launch Minecraft with Forge 1.20.1

## Requirements

- Minecraft 1.20.1
- Forge 47.2.0 or higher
- Java 17+

## Building from Source

```bash
# Clone the repository
git clone https://github.com/xossko/utility-mod.git
cd utility-mod

# Build the mod
./gradlew build

# The compiled mod will be in build/libs/
```

## How It Works

The mod listens to the `LivingDamageEvent` and applies a multiplier to damage based on the Strength effect level:

```
Damage Multiplier = 1.0 + (strength_level + 1) * 0.3
```

## License

MIT License

## Author

xossko
