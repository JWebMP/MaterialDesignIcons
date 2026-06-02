# JWebMP Material Design Icons (Google)

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/material-design-icons)](https://central.sonatype.com/artifact/com.jwebmp.plugins/material-design-icons)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-21-DD0031?logo=angular)

<!-- Tech icons row -->
![Material Design](https://img.shields.io/badge/Material_Icons-3.0.1-blueviolet)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

900+ official Google Material Design icons for JWebMP applications with 5 theme variants, 4 sizes, and 2 colour schemes. Full CRTP fluent API for icon configuration.

Built on [Google Material Design Icons](https://google.github.io/material-design-icons/) · [Angular 21](https://angular.dev/) · [JWebMP Core](https://jwebmp.com/) · JPMS module `com.jwebmp.plugins.materialdesignicons` · Java 25+

**Version: 3.0.1** — Official Google icon set with type-safe Java API.

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>material-design-icons</artifactId>
  <version>2.0.3-SNAPSHOT</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:material-design-icons:2.0.0-SNAPSHOT")
```
</details>

## Features

- **900+ Official Icons** — Google's official Material Design icon set
- **5 Theme Variants** — Filled, Outlined, Rounded, TwoTone, Sharp
- **4 Icon Sizes** — 18px, 24px (default), 36px, 48px
- **2 Colour Schemes** — Light (dark icon on light bg) and Dark (light icon on dark bg)
- **CRTP Fluent API** — `MaterialDesignIcon<J>` with chainable setTheme(), setSize(), setColour()
- **Inactive State** — Built-in support for dimmed/inactive icon rendering
- **Type-Safe Java Enum API** — `MaterialDesignIcons`, `MaterialDesignIconThemes`, `MaterialDesignIconSize`, `MaterialDesignIconColours`
- **IIcon Interface** — Implements JWebMP's standard icon interface for interoperability
- **Zero Configuration** — Auto-registered via ServiceLoader SPI

## Quick Start

### Prerequisites

- **Java 25 LTS** (required)
- **Maven 3.8+**
- **Node.js 18+** (for frontend builds)
- **Angular 21+** (auto-integrated via JWebMP)

### Basic Usage

```java
import com.jwebmp.plugins.materialdesignicons.*;

// Default: Filled theme, 24px, Light colour
var icon = new MaterialDesignIcon<>(MaterialDesignIcons.home);

// Outlined theme at default size
var outlined = new MaterialDesignIcon<>(
    MaterialDesignIconThemes.Outlined,
    MaterialDesignIcons.settings);

// Full customization: Rounded, 48px, Dark colour
var custom = new MaterialDesignIcon<>(
    MaterialDesignIconThemes.Rounded,
    MaterialDesignIcons.favorite,
    MaterialDesignIconSize.$48,
    MaterialDesignIconColours.Dark);

// Fluent API
var fluent = new MaterialDesignIcon<>(MaterialDesignIcons.search)
    .setTheme(MaterialDesignIconThemes.Sharp)
    .setSize(MaterialDesignIconSize.$36)
    .setInactive(true);
```

### Theme Variants

| Theme | CSS Class | Description |
|-------|-----------|-------------|
| Filled | `md-filled` | Default solid icon style |
| Outlined | `md-outlined` | Stroke-only outline style |
| Rounded | `md-rounded` | Rounded corner variant |
| TwoTone | `md-twotone` | Primary + secondary colour |
| Sharp | `md-sharp` | Sharp corner variant |

### Size Options

| Size | CSS Class | Pixels |
|------|-----------|--------|
| `$18` | `md-18` | 18px |
| `$24` | `md-24` | 24px (default) |
| `$36` | `md-36` | 36px |
| `$48` | `md-48` | 48px |

---

## Architecture

### Module Structure

```
src/main/java/com/jwebmp/plugins/materialdesignicons/
├── MaterialDesignIcon.java                # CRTP icon component (italic-based)
├── MaterialDesignIcons.java               # Enum with 900+ icon constants
├── MaterialDesignIconThemes.java          # Enum: Filled, Outlined, Rounded, TwoTone, Sharp
├── MaterialDesignIconSize.java            # Enum: $18, $24, $36, $48
├── MaterialDesignIconColours.java         # Enum: Dark, Light
├── MaterialDesignIconsCSSReference.java   # CSS reference for stylesheet
├── MaterialDesignIconsPageConfigurator.java # Auto-registration via ServiceLoader
└── implementations/
    ├── MaterialDesignIconsInclusionModule.java
    └── MaterialDesignIconsExclusionsModule.java
```

---

## API Reference

### MaterialDesignIcon Component

```java
public class MaterialDesignIcon<J extends MaterialDesignIcon<J>>
    extends Italic<J>
    implements IIcon<IComponentHierarchyBase<?,?>, J>

// Constructors (telescoping)
new MaterialDesignIcon<>(icon)
new MaterialDesignIcon<>(theme, icon)
new MaterialDesignIcon<>(theme, icon, size)
new MaterialDesignIcon<>(theme, icon, size, colour)

// Fluent setters (return J for chaining)
.setTheme(MaterialDesignIconThemes theme)
.setIcon(MaterialDesignIcons icon)
.setSize(MaterialDesignIconSize size)
.setColour(MaterialDesignIconColours colour)
.setInactive(boolean inactive)

// Getters
.getTheme(), .getIcon(), .getSize(), .getColour(), .isInactive()
.getClassName()      // Returns full CSS class string
.getIconComponent()  // Returns this component
```

---

## Configuration

### Auto-Configuration via PageConfigurator

The plugin is automatically configured when present on the classpath. It registers the Material Design Icons CSS stylesheet.

### Manual Disable (Optional)

```java
MaterialDesignIconsPageConfigurator.setEnabled(false);
```

---

## Module Graph

```
com.jwebmp.plugins.materialdesignicons
 ├── com.jwebmp.core              (JWebMP core)
 └── com.guicedee.guicedinjection (Guice DI)
```

### Exported Packages

- `com.jwebmp.plugins.materialdesignicons` — Icon component, enums, and configurator

---

## Testing

```bash
mvn clean test
```

---

## Documentation

- **[Google Material Design Icons](https://google.github.io/material-design-icons/)** — Official icon reference
- **[Material Design Guidelines](https://material.io/design/iconography)** — Design guidelines
- **[JWebMP Home](https://jwebmp.com/)** — JWebMP framework documentation

| File | Purpose |
|------|---------|
| `MaterialDesignIcon.java` | CRTP icon component with theme/size/colour |
| `MaterialDesignIcons.java` | Enum with 900+ icons |
| `MaterialDesignIconThemes.java` | 5 theme variants |
| `MaterialDesignIconSize.java` | 4 size options |
| `MaterialDesignIconColours.java` | 2 colour schemes |
| `MaterialDesignIconsPageConfigurator.java` | Auto-configuration |
| `module-info.java` | JPMS module descriptor |

---

## Security

- No external network calls at runtime
- No secrets or credentials required
- Pure CSS web font icon library

---

## Contributing

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/my-feature`)
3. **Commit with clear messages** (`git commit -m "feat: add icon support"`)
4. **Push to your fork** (`git push origin feature/my-feature`)
5. **Open a Pull Request**

---

## Project Status

| Aspect | Status |
|--------|--------|
| **Version** | 3.0.1 / 2.0.0-SNAPSHOT |
| **Icons** | 900+ complete |
| **Themes** | 5 variants |
| **Java** | 25 LTS (required) |
| **Build** | Passing |
| **License** | Apache 2.0 |
| **Maintenance** | Active |

---

## Links

- **GitHub Repository**: https://github.com/JWebMP/JWebMP
- **Google Material Icons**: https://google.github.io/material-design-icons/
- **JWebMP Home**: https://jwebmp.com/

---

## License

Licensed under the [Apache License 2.0](LICENSE).

```
Copyright 2025 JWebMP Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
```

---

## Acknowledgments

- **[Google](https://google.github.io/material-design-icons/)** — Official Material Design Icons
- **[JWebMP](https://jwebmp.com/)** — Server-driven web framework
- **[Angular](https://angular.dev/)** — Modern web framework

---

## Support

- **GitHub Issues**: https://github.com/JWebMP/JWebMP/issues
- **Discussions**: https://github.com/JWebMP/JWebMP/discussions

---

**Made with JWebMP**

