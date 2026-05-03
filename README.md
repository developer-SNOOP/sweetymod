# WORLDS: EXPANSION

[![build](https://github.com/developer-SNOOP/sweetymod/actions/workflows/build.yml/badge.svg)](https://github.com/developer-SNOOP/sweetymod/actions/workflows/build.yml)

A unique Minecraft Fabric mod that expands the world with new ores, materials, tools, armor and worldgen.

- **Minecraft:** 1.20.1
- **Loader:** Fabric (loader 0.15.x)
- **Required:** Fabric API
- **Java:** 17

## Features

### New Ores
Three new ore systems with both Overworld and Deepslate variants:

| Ore | Drops | Tier | Notes |
| --- | --- | --- | --- |
| **Ruby Ore** | Ruby | Iron-tier mining | Spawns at higher Y levels, fiery red gems |
| **Sapphire Ore** | Sapphire | Iron-tier mining | Spawns deep underground, deep blue gems |
| **Etherium Ore** | Raw Etherium | Diamond-tier mining | Very rare, smelt to Etherium Ingot |

### Storage Blocks
- Ruby Block, Sapphire Block, Etherium Block, Raw Etherium Block

### Tools
Full tool sets (Sword, Pickaxe, Axe, Shovel, Hoe) for each material:
- **Ruby Tools** — between iron and diamond, Ruby Sword sets enemies on fire briefly
- **Sapphire Tools** — diamond-tier with extra durability
- **Etherium Tools** — exceeds diamond, top-tier mining and combat

### Armor
Full armor sets (Helmet, Chestplate, Leggings, Boots) for Ruby, Sapphire and Etherium materials.

### Special Items
- **World Apple** — exotic food that grants Regeneration II and Speed I

### Creative Tab
A dedicated **WORLDS: EXPANSION** creative inventory tab gathering all of the mod's content.

### Worldgen
Custom configured/placed features add the new ores into Overworld biomes via Fabric Biome API.

## Build

```bash
./gradlew build
```

The output `.jar` will be in `build/libs/`. Drop it (along with Fabric API) into your `mods/` folder.

## License

CC0-1.0 — see `LICENSE`.
