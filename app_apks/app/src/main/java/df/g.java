package df;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class g implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.RequestPermissionsResultListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Uri f33508e = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Uri f33509f = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f33510g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MethodChannel f33511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterPlugin.FlutterPluginBinding f33512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f33513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f33514d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MethodChannel.Result f33515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MethodCall f33516b;

        public a(MethodChannel.Result result, MethodCall methodCall) {
            this.f33515a = result;
            this.f33516b = methodCall;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33515a.success(Boolean.valueOf(g.this.k(((Boolean) this.f33516b.argument("toAlbum")).booleanValue())));
        }
    }

    public static /* synthetic */ void a(g gVar, MethodCall methodCall, final MethodChannel.Result result) {
        gVar.getClass();
        try {
            gVar.m((String) methodCall.argument("path"), (String) methodCall.argument("album"), methodCall.method.contains("Image"));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: df.e
                @Override // java.lang.Runnable
                public final void run() {
                    result.success(null);
                }
            });
        } catch (Exception e10) {
            gVar.j(e10, result);
        }
    }

    public static /* synthetic */ void c(g gVar, MethodCall methodCall, final MethodChannel.Result result) {
        gVar.getClass();
        try {
            gVar.n((byte[]) methodCall.argument("bytes"), (String) methodCall.argument("album"), (String) methodCall.argument("name"));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: df.d
                @Override // java.lang.Runnable
                public final void run() {
                    result.success(null);
                }
            });
        } catch (Exception e10) {
            gVar.j(e10, result);
        }
    }

    public final ContentValues h(boolean z10, String str, String str2, String str3) {
        String string;
        ContentValues contentValues = new ContentValues();
        String str4 = (z10 || str3 != null) ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES;
        String str5 = "";
        if (f33510g) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str4);
            if (str3 == null) {
                str3 = "";
            }
            File file = new File(externalStoragePublicDirectory, str3);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str6 = file.getPath() + File.separator + str;
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str6);
                sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
                sb2.append(str2);
                string = sb2.toString();
                if (!new File(string).exists()) {
                    break;
                }
                i10++;
            }
            contentValues.put("_data", string);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            if (str3 != null) {
                str5 = File.separator + str3;
            }
            sb3.append(str5);
            contentValues.put("relative_path", sb3.toString());
        }
        contentValues.put("_display_name", str + str2);
        return contentValues;
    }

    public final Uri i(ContentResolver contentResolver, ContentValues contentValues, boolean z10, String str, String str2) {
        int i10 = 0;
        while (true) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i10 > 0 ? Integer.valueOf(i10) : "");
                sb2.append(str2);
                contentValues.put("_display_name", sb2.toString());
                return contentResolver.insert(z10 ? f33508e : f33509f, contentValues);
            } catch (IllegalStateException e10) {
                if (!e10.getMessage().contains("Failed to build unique file")) {
                    throw e10;
                }
                i10++;
            }
        }
    }

    public final void j(Exception exc, MethodChannel.Result result) {
        p(((exc instanceof SecurityException) || exc.toString().contains("Permission denied")) ? "ACCESS_DENIED" : exc instanceof FileNotFoundException ? "NOT_SUPPORTED_FORMAT" : ((exc instanceof IOException) && exc.toString().contains("No space left on device")) ? "NOT_ENOUGH_SPACE" : "UNEXPECTED", exc.toString(), exc.getStackTrace(), result);
    }

    public final boolean k(boolean z10) {
        return true;
    }

    public final void l() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(f33508e);
        intent.setFlags(268435456);
        this.f33512b.getApplicationContext().startActivity(intent);
    }

    public final void m(String str, String str2, boolean z10) throws IOException {
        File file = new File(str);
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            throw new FileNotFoundException("Extension not found.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            q(fileInputStream, z10, name.substring(0, iLastIndexOf), name.substring(iLastIndexOf), str2);
            fileInputStream.close();
        } finally {
        }
    }

    public final void n(byte[] bArr, String str, String str2) throws IOException {
        String str3 = "." + He.e.e(bArr).a().toLowerCase();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            q(byteArrayInputStream, true, str2, str3, str);
            byteArrayInputStream.close();
        } finally {
        }
    }

    public final void o() {
        androidx.core.app.a.v(this.f33513c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1317298);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f33513c = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "gal");
        this.f33511a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f33512b = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f33513c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f33513c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f33511a.setMethodCallHandler(null);
        this.f33512b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(final MethodCall methodCall, final MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "hasAccess":
                result.success(Boolean.valueOf(k(((Boolean) methodCall.argument("toAlbum")).booleanValue())));
                break;
            case "open":
                l();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: df.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        result.success(null);
                    }
                });
                break;
            case "requestAccess":
                if (!k(((Boolean) methodCall.argument("toAlbum")).booleanValue())) {
                    this.f33514d = new a(result, methodCall);
                    o();
                    break;
                } else {
                    result.success(Boolean.TRUE);
                    break;
                }
                break;
            case "putImage":
            case "putVideo":
                new Thread(new Runnable() { // from class: df.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a(this.f33495a, methodCall, result);
                    }
                }).start();
                break;
            case "putImageBytes":
                new Thread(new Runnable() { // from class: df.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c(this.f33498a, methodCall, result);
                    }
                }).start();
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f33513c = activityPluginBinding.getActivity();
        activityPluginBinding.addRequestPermissionsResultListener(this);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 1317298 || iArr.length == 0) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(this.f33514d);
        this.f33514d = null;
        return true;
    }

    public final void p(final String str, final String str2, StackTraceElement[] stackTraceElementArr, final MethodChannel.Result result) {
        final StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement.toString());
            sb2.append("\n");
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: df.f
            @Override // java.lang.Runnable
            public final void run() {
                result.error(str, str2, sb2.toString());
            }
        });
    }

    public final void q(InputStream inputStream, boolean z10, String str, String str2, String str3) throws IOException {
        ContentResolver contentResolver = this.f33512b.getApplicationContext().getContentResolver();
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(i(contentResolver, h(z10, str, str2, str3), z10, str, str2));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    break;
                } else {
                    outputStreamOpenOutputStream.write(bArr, 0, i10);
                }
            }
            if (outputStreamOpenOutputStream != null) {
                outputStreamOpenOutputStream.close();
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream == null) {
                throw th;
            }
            try {
                outputStreamOpenOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
