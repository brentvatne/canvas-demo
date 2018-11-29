# canvas-demo

Demonstrates a project setup for running expo-2d-context on top of expo-gl in a plain react-native project. Did you know that it's possible to use Expo APIs without buying in to the whole thing? The flow isn't super easy at the moment but we'll be polishing that going forward - check out package.json, ios/Podfile, and ios/CanvasDemo/AppDelegate.m & h to see how it's done. See a full list of Expo packages at https://github.com/expo/expo/tree/master/packages, for example camera, contacts, file-system, and media-library.

Currently this demo is only running on iOS, but you can configure the Android side if you like as well, just follow the READMEs on the expo packages listed in package.json.

## Run it

- Clone the repository
- `cd` into it (of course)
- Run `yarn` as per usual
- Open `ios/CanvasDemo.xcworkspace`
- Build & run it
