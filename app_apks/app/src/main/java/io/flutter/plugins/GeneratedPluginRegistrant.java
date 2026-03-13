package io.flutter.plugins;

import Fa.i;
import La.B;
import P4.m;
import Q5.o;
import T5.d;
import V5.c;
import Wa.a;
import Xa.f;
import a.C2605a;
import ab.C2683e;
import androidx.annotation.Keep;
import b.C2769a;
import bb.C2903c;
import ca.e;
import com.braze.brazeplugin.BrazePlugin;
import com.cloudwebrtc.webrtc.FlutterWebRTCPlugin;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.github.dart_lang.jni.JniPlugin;
import com.hiennv.flutter_callkit_incoming.FlutterCallkitIncomingPlugin;
import com.signify.hue.appgroup_shared_preferences.AppgroupSharedPreferencesPlugin;
import com.signify.hue.dnsservicediscovery.DnsServiceDiscoveryPlugin;
import com.signify.hue.flutterreactiveble.ReactiveBlePlugin;
import db.C3859O;
import df.g;
import fa.ViewTreeObserverOnGlobalLayoutListenerC4006a;
import ga.C4174b;
import gb.C4176b;
import hb.C4294a;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.inapppurchase.InAppPurchasePlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.quickactions.QuickActionsPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import io.sentry.flutter.SentryFlutterPlugin;
import ja.C4752a;
import o4.C5205b;
import oe.C5295a;
import xa.C6353b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new C5205b());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin amplitude_flutter, com.amplitude.amplitude_flutter.AmplitudeFlutterPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin android_intent_plus, dev.fluttercommunity.plus.androidintent.AndroidIntentPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new C4174b());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new Ha.a());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin app_settings, com.spencerccf.app_settings.AppSettingsPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new AppgroupSharedPreferencesPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin appgroup_shared_preferences, com.signify.hue.appgroup_shared_preferences.AppgroupSharedPreferencesPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new d());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin ar_plugin, com.example.ar_plugin.ArPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new wa.d());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new com.bbflight.background_downloader.a());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin background_downloader, com.bbflight.background_downloader.BDPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new BrazePlugin());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin braze_plugin, com.braze.brazeplugin.BrazePlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new f());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new U5.a());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin contact_picker, com.example.contact_picker.ContactPickerPlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new Va.a());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin cryptography_flutter_plus, dev.dint.cryptography_flutter.CryptographyFlutterPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new Ya.a());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new C6353b());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin device_orientation, com.signify.device_orientation.DeviceOrientationPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new c());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin devicelocale, com.example.devicelocale.DevicelocalePlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new DnsServiceDiscoveryPlugin());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin dns_service_discovery, com.signify.hue.dnsservicediscovery.DnsServiceDiscoveryPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new C2605a());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin dtls_client, Signify.dtls_client.DtlsClientPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new ia.d());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseMessagingPlugin());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new FirebaseRemoteConfigPlugin());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new C4294a());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin flutter_appauth, io.crossingthestreams.flutterappauth.FlutterAppauthPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new C4752a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin flutter_appavailability, com.pichillilorenzo.flutter_appavailability.AppAvailability", e34);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterCallkitIncomingPlugin());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin flutter_callkit_incoming, com.hiennv.flutter_callkit_incoming.FlutterCallkitIncomingPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add(new ViewTreeObserverOnGlobalLayoutListenerC4006a());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterLocalNotificationsPlugin());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add(new e());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add(new ff.a());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin flutter_sound, xyz.canardoux.fluttersound.FlutterSound", e40);
        }
        try {
            flutterEngine.getPlugins().add(new C5295a());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin flutter_timezone, net.wolverinebeach.flutter_timezone.FlutterTimezonePlugin", e41);
        }
        try {
            flutterEngine.getPlugins().add(new C4176b());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin flutter_vibrate, flutter.plugins.vibrate.VibratePlugin", e42);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterWebRTCPlugin());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin flutter_webrtc, com.cloudwebrtc.webrtc.FlutterWebRTCPlugin", e43);
        }
        try {
            flutterEngine.getPlugins().add(new g());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin gal, studio.midoridesign.gal.GalPlugin", e44);
        }
        try {
            flutterEngine.getPlugins().add(new ya.f());
        } catch (Exception e45) {
            Log.e(TAG, "Error registering plugin genesis_authentication_plugin, com.signify.genesis.GenesisAuthenticationPlugin", e45);
        }
        try {
            flutterEngine.getPlugins().add(new com.signify.geofence.c());
        } catch (Exception e46) {
            Log.e(TAG, "Error registering plugin geofence, com.signify.geofence.GeofencePlugin", e46);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleMapsPlugin());
        } catch (Exception e47) {
            Log.e(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e47);
        }
        try {
            flutterEngine.getPlugins().add(new C2769a());
        } catch (Exception e48) {
            Log.e(TAG, "Error registering plugin hue_color_library, Signify.hue_color_library.HueColorLibraryPlugin", e48);
        }
        try {
            flutterEngine.getPlugins().add(new ImagePickerPlugin());
        } catch (Exception e49) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e49);
        }
        try {
            flutterEngine.getPlugins().add(new InAppPurchasePlugin());
        } catch (Exception e50) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e50);
        }
        try {
            flutterEngine.getPlugins().add(new Ua.d());
        } catch (Exception e51) {
            Log.e(TAG, "Error registering plugin in_app_review, dev.britannio.in_app_review.InAppReviewPlugin", e51);
        }
        try {
            flutterEngine.getPlugins().add(new JniPlugin());
        } catch (Exception e52) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e52);
        }
        try {
            flutterEngine.getPlugins().add(new com.lyokone.location.a());
        } catch (Exception e53) {
            Log.e(TAG, "Error registering plugin location, com.lyokone.location.LocationPlugin", e53);
        }
        try {
            flutterEngine.getPlugins().add(new C3859O());
        } catch (Exception e54) {
            Log.e(TAG, "Error registering plugin mobile_scanner, dev.steenbakker.mobile_scanner.MobileScannerPlugin", e54);
        }
        try {
            flutterEngine.getPlugins().add(new com.github.rmtmckenzie.native_device_orientation.d());
        } catch (Exception e55) {
            Log.e(TAG, "Error registering plugin native_device_orientation, com.github.rmtmckenzie.native_device_orientation.NativeDeviceOrientationPlugin", e55);
        }
        try {
            flutterEngine.getPlugins().add(new com.signify.widgets.a());
        } catch (Exception e56) {
            Log.e(TAG, "Error registering plugin native_widgets, com.signify.widgets.WidgetsPlugin", e56);
        }
        try {
            flutterEngine.getPlugins().add(new Za.a());
        } catch (Exception e57) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e57);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e58) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e58);
        }
        try {
            flutterEngine.getPlugins().add(new m());
        } catch (Exception e59) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e59);
        }
        try {
            flutterEngine.getPlugins().add(new Da.a());
        } catch (Exception e60) {
            Log.e(TAG, "Error registering plugin push_notifications, com.signify.push_notifications_plugin.PushNotificationsPlugin", e60);
        }
        try {
            flutterEngine.getPlugins().add(new QuickActionsPlugin());
        } catch (Exception e61) {
            Log.e(TAG, "Error registering plugin quick_actions_android, io.flutter.plugins.quickactions.QuickActionsPlugin", e61);
        }
        try {
            flutterEngine.getPlugins().add(new ReactiveBlePlugin());
        } catch (Exception e62) {
            Log.e(TAG, "Error registering plugin reactive_ble_mobile, com.signify.hue.flutterreactiveble.ReactiveBlePlugin", e62);
        }
        try {
            flutterEngine.getPlugins().add(new U3.a());
        } catch (Exception e63) {
            Log.e(TAG, "Error registering plugin rive_native, app.rive.rive_native.RiveNativePlugin", e63);
        }
        try {
            flutterEngine.getPlugins().add(new Ea.a());
        } catch (Exception e64) {
            Log.e(TAG, "Error registering plugin run_mode, com.signify.run_mode.RunModePlugin", e64);
        }
        try {
            flutterEngine.getPlugins().add(new SentryFlutterPlugin());
        } catch (Exception e65) {
            Log.e(TAG, "Error registering plugin sentry_flutter, io.sentry.flutter.SentryFlutterPlugin", e65);
        }
        try {
            flutterEngine.getPlugins().add(new C2683e());
        } catch (Exception e66) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e66);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e67) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e67);
        }
        try {
            flutterEngine.getPlugins().add(new o());
        } catch (Exception e68) {
            Log.e(TAG, "Error registering plugin speech_to_text, com.csdcorp.speech_to_text.SpeechToTextPlugin", e68);
        }
        try {
            flutterEngine.getPlugins().add(new B());
        } catch (Exception e69) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e69);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e70) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e70);
        }
        try {
            flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        } catch (Exception e71) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e71);
        }
        try {
            flutterEngine.getPlugins().add(new i());
        } catch (Exception e72) {
            Log.e(TAG, "Error registering plugin video_screenshot, com.signify.video_screenshot.VideoScreenshotPlugin", e72);
        }
        try {
            flutterEngine.getPlugins().add(new C2903c());
        } catch (Exception e73) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e73);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e74) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e74);
        }
    }
}
