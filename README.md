# Help 
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) [![](https://jitpack.io/v/Omar-Khaium/Help.svg)](https://jitpack.io/#Omar-Khaium/Help) ![](https://img.shields.io/github/downloads/Omar-Khaium/Help/total.svg)

# Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

```
# Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.Omar-Khaium:Help:1.2.1'
}
```

# Documentation
Following attributes is added to resolve manual validation and formating values.
# Format
Name | Behaviour
------------ | -------------
`Format.Text(String text)` | will return text value in String format after checking. Default result : "-"
`Format.Name(String firstName, String secondName)` | will return name by checking first name and second name. Default result : "-"
`Format.Address(String address, String city, String state, String zip)` | will return address's value. Default result : "-"

# Validate
Name | Behaviour
------------ | -------------
`Validate.Input(EditText name)` | will return true or false after valiation
`Validate.Phone(String number)` | will return phone number in US  format
`Validate.ReversePhone(String number)` | will remove phone number US  format and return as plain text
