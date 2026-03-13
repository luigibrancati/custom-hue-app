package Ya;

import Od.C;
import Od.F;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import gc.C4206t;
import gc.C4207u;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.SentryEvent;
import io.sentry.SentryOptions;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f19870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f19871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f19872c;

    public b(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        AbstractC4862t.e(packageManager, "packageManager");
        AbstractC4862t.e(activityManager, "activityManager");
        AbstractC4862t.e(contentResolver, "contentResolver");
        this.f19870a = packageManager;
        this.f19871b = activityManager;
        this.f19872c = contentResolver;
    }

    public final List a() {
        FeatureInfo[] systemAvailableFeatures = this.f19870a.getSystemAvailableFeatures();
        AbstractC4862t.d(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            if (featureInfo.name != null) {
                arrayList.add(featureInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FeatureInfo) it.next()).name);
        }
        return arrayList2;
    }

    public final boolean b() {
        String BRAND = Build.BRAND;
        AbstractC4862t.d(BRAND, "BRAND");
        if (C.P(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            AbstractC4862t.d(DEVICE, "DEVICE");
            if (C.P(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        String FINGERPRINT = Build.FINGERPRINT;
        AbstractC4862t.d(FINGERPRINT, "FINGERPRINT");
        if (C.P(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(FINGERPRINT, "FINGERPRINT");
        if (C.P(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String HARDWARE = Build.HARDWARE;
        AbstractC4862t.d(HARDWARE, "HARDWARE");
        if (F.V(HARDWARE, "goldfish", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(HARDWARE, "HARDWARE");
        if (F.V(HARDWARE, "ranchu", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        AbstractC4862t.d(MODEL, "MODEL");
        if (F.V(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(MODEL, "MODEL");
        if (F.V(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(MODEL, "MODEL");
        if (F.V(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC4862t.d(MANUFACTURER, "MANUFACTURER");
        if (F.V(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        AbstractC4862t.d(PRODUCT, "PRODUCT");
        if (F.V(PRODUCT, "sdk", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(PRODUCT, "PRODUCT");
        if (F.V(PRODUCT, "vbox86p", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(PRODUCT, "PRODUCT");
        if (F.V(PRODUCT, "emulator", false, 2, null)) {
            return true;
        }
        AbstractC4862t.d(PRODUCT, "PRODUCT");
        return F.V(PRODUCT, Device.JsonKeys.SIMULATOR, false, 2, null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        if (!call.method.equals("getDeviceInfo")) {
            result.notImplemented();
            return;
        }
        HashMap map = new HashMap();
        map.put("board", Build.BOARD);
        map.put("bootloader", Build.BOOTLOADER);
        map.put(Device.JsonKeys.BRAND, Build.BRAND);
        map.put(Device.TYPE, Build.DEVICE);
        map.put("display", Build.DISPLAY);
        map.put(SentryEvent.JsonKeys.FINGERPRINT, Build.FINGERPRINT);
        map.put("hardware", Build.HARDWARE);
        map.put("host", Build.HOST);
        map.put("id", Build.ID);
        map.put(Device.JsonKeys.MANUFACTURER, Build.MANUFACTURER);
        map.put(Device.JsonKeys.MODEL, Build.MODEL);
        map.put("product", Build.PRODUCT);
        int i10 = Build.VERSION.SDK_INT;
        String string = Settings.Global.getString(this.f19872c, "device_name");
        if (string == null) {
            string = "";
        }
        map.put("name", string);
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        map.put("supported32BitAbis", C4206t.n(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        map.put("supported64BitAbis", C4206t.n(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        map.put("supportedAbis", C4206t.n(Arrays.copyOf(strArr3, strArr3.length)));
        map.put("tags", Build.TAGS);
        map.put("type", Build.TYPE);
        map.put("isPhysicalDevice", Boolean.valueOf(!b()));
        map.put("systemFeatures", a());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        map.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
        map.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
        HashMap map2 = new HashMap();
        map2.put("baseOS", Build.VERSION.BASE_OS);
        map2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        map2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        map2.put("codename", Build.VERSION.CODENAME);
        map2.put("incremental", Build.VERSION.INCREMENTAL);
        map2.put("release", Build.VERSION.RELEASE);
        map2.put("sdkInt", Integer.valueOf(i10));
        map.put("version", map2);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f19871b.getMemoryInfo(memoryInfo);
        map.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
        map.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / SentryOptions.MAX_EVENT_SIZE_BYTES));
        map.put("availableRamSize", Long.valueOf(memoryInfo.availMem / SentryOptions.MAX_EVENT_SIZE_BYTES));
        result.success(map);
    }
}
