# Mini Measure Studio 6.1 — Android build project

This is the Android source project for the Mini Measure Studio 6.1 prototype. It contains the HTML measuring interface inside an Android WebView. **This is source code, not a prebuilt APK.**

## Features in version 6.1
- Load a photo or use the phone camera to capture a live preview frame for measurement
- Manual calibrated length measurements, angles, and circle diameter estimates
- Improved classic contrast detection that can search for darker or brighter objects against the photo background
- Edge assist, measurement undo, and annotated image export
- CSV export and printable/PDF measurement report
- Rotatable rectangular-block 3D preview, estimated volume, surface area, and mass
- Measurement error/tolerance checks and persistent visible calibration points

## Build the APK using GitHub Actions (phone-friendly cloud option)
1. Create a new GitHub repository.
2. Upload the **contents of this folder** to the repository root, including the `.github` folder. At the repository top level you should see `app`, `build.gradle.kts`, `settings.gradle.kts`, and `.github`.
3. Open the repository's **Actions** tab.
4. Select **Build Mini Measure Studio APK**. If needed, tap **Run workflow** and confirm.
5. Wait for the run to finish with a green check mark.
6. Open the successful run, scroll to **Artifacts**, and download `Mini-Measure-Studio-debug-APK`.
7. Extract the downloaded artifact ZIP to find `app-debug.apk`.
8. Transfer the APK to your Android phone, tap it, and follow Android's installation prompt.

## Build using Android Studio
Open this folder as an Android Studio project, allow the Android SDK/build tools to install, then select **Build → Build Bundle(s) / APK(s) → Build APK(s)**. The APK output path is `app/build/outputs/apk/debug/app-debug.apk`.

## Limitations to know
- Camera access uses WebViewAssetLoader with the local HTTPS origin appassets.androidplatform.net and Android runtime camera permission. Allow camera permission when prompted. This camera fix has not yet been compiled or device-tested; verify it on the target phone before relying on it.
- Live camera mode captures a still frame for calibrated measuring; it is not a continuously tracking AR ruler.
- Detection is classic image processing, not a trained AI model. It proposes a bounding box and can fail on cluttered backgrounds, shadows, or low contrast.
- The 3D view is a rotatable rectangular-prism illustration based on entered dimensions, not a true 3D scan or reconstruction.
- Photo measurements can be affected by perspective, lens distortion, calibration error, and whether the ruler and object lie on the same plane. Verify critical dimensions with a physical instrument.
- The APK has not yet been compiled or device-tested in this environment.
