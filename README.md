<div align="center">

  <img src="https://raw.githubusercontent.com/Mono-Code-Scheme/assets/refs/heads/main/logos/logo-round.svg" width="100"> 

  # Mono Code for Material 3 Compose
  <img width="200" alt="lynx-preview" src="https://github.com/user-attachments/assets/e20e1c82-fc62-4618-b725-28dee0d2bedb" />
  
  <img width="200" alt="panther-preview" src="https://github.com/user-attachments/assets/70085599-81b5-497f-ba56-5a38a0920022" />

  
</div>

# Install

Add jitpack.io to your `settings.gradle.kts`:
```gradle
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") } // Add This
  }
}
```

Add the library in your dependencies:
```gradle
dependencies {
  implementation("com.github.Mono-Code-Scheme:compose-material:1.0.0")
}
```

# Usage
Get the material theme:
```kotlin
val theme = getMaterialMonoCode(ThemeId.PantherYellow)
```
> You can use other colors like PantherBlue, LynxOrange

# Maintainers
🐈‍⬛ lighttigerXIV
