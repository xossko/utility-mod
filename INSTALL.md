# Installation & Build Guide

## Quick Install

1. Download the compiled `.jar` file from [GitHub Releases](../../releases)
2. Place it in your Minecraft `mods` folder
3. Launch Minecraft with Forge 1.20.1

## Building from Source

### Prerequisites
- Java 17 or higher
- Git

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/xossko/utility-mod.git
cd utility-mod

# 2. Set up the workspace
./gradlew genEclipseRuns  # For Eclipse IDE
# OR
./gradlew genIntellijRuns  # For IntelliJ IDEA

# 3. Build the mod
./gradlew build

# 4. Find the compiled JAR
# The mod JAR will be in: build/libs/utility-mod-1.0.0.jar
```

## Using in Development

### IntelliJ IDEA
1. Open the project in IntelliJ
2. Run `./gradlew genIntellijRuns`
3. Refresh Gradle project
4. Select "Run Minecraft Client" configuration
5. Click Run

### Eclipse
1. Open the project in Eclipse
2. Run `./gradlew genEclipseRuns`
3. Refresh the project
4. Select "Minecraft Client" run configuration
5. Click Run

## Troubleshooting

**Issue**: `Could not find matching variant`
- **Solution**: Make sure you have Java 17+ installed and set as default

**Issue**: Build fails with `Symbol not found`
- **Solution**: Run `./gradlew clean build` to refresh dependencies

**Issue**: Mod doesn't load
- **Solution**: Verify Forge version is 47.2.0+ and mod JAR is in `mods` folder

## Modifying the Code

The main event handler is in:
```
src/main/java/com/xossko/utilitymod/event/DamageEventHandler.java
```

Edit the `onLivingDamage` method to customize the damage calculation.

## Creating a Release

```bash
# Build the release JAR
./gradlew build

# Create a GitHub release with the JAR from:
# build/libs/utility-mod-1.0.0.jar
```
