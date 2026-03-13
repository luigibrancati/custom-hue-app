package Za;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import gc.C4204q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.protocol.FeatureFlag;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010'¨\u0006)"}, d2 = {"LZa/a;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "c", "()Ljava/lang/String;", "Landroid/content/pm/PackageInfo;", "info", "", "d", "(Landroid/content/pm/PackageInfo;)J", "Landroid/content/pm/PackageManager;", "pm", "b", "(Landroid/content/pm/PackageManager;)Ljava/lang/String;", "", "sig", "e", "([B)Ljava/lang/String;", "bytes", "a", "Landroid/content/Context;", "Landroid/content/Context;", "applicationContext", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "package_info_plus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public MethodChannel methodChannel;

    public final String a(byte[] bytes) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = bytes[i10];
            int i11 = i10 * 2;
            cArr2[i11] = cArr[(b10 & ForkServer.ERROR) >>> 4];
            cArr2[i11 + 1] = cArr[b10 & 15];
        }
        return new String(cArr2);
    }

    public final String b(PackageManager pm) {
        try {
            Context context = this.applicationContext;
            AbstractC4862t.b(context);
            SigningInfo signingInfo = pm.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                AbstractC4862t.d(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray = ((Signature) C4204q.U(apkContentsSigners)).toByteArray();
                AbstractC4862t.d(byteArray, "toByteArray(...)");
                return e(byteArray);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            AbstractC4862t.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray2 = ((Signature) C4204q.U(signingCertificateHistory)).toByteArray();
            AbstractC4862t.d(byteArray2, "toByteArray(...)");
            return e(byteArray2);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final String c() {
        Context context = this.applicationContext;
        AbstractC4862t.b(context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = this.applicationContext;
        AbstractC4862t.b(context2);
        return packageManager.getInstallSourceInfo(context2.getPackageName()).getInitiatingPackageName();
    }

    public final long d(PackageInfo info) {
        return info.getLongVersionCode();
    }

    public final String e(byte[] sig) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(sig);
        byte[] bArrDigest = messageDigest.digest();
        AbstractC4862t.b(bArrDigest);
        return a(bArrDigest);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.applicationContext = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.methodChannel = methodChannel;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        this.applicationContext = null;
        MethodChannel methodChannel = this.methodChannel;
        AbstractC4862t.b(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.methodChannel = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String string;
        CharSequence charSequenceLoadLabel;
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        try {
            if (!AbstractC4862t.a(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.applicationContext;
            AbstractC4862t.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.applicationContext;
            AbstractC4862t.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            AbstractC4862t.b(packageManager);
            String strB = b(packageManager);
            String strC = c();
            long j10 = packageInfo.firstInstallTime;
            long j11 = packageInfo.lastUpdateTime;
            HashMap map = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str = "";
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = "";
            }
            map.put("appName", string);
            Context context3 = this.applicationContext;
            AbstractC4862t.b(context3);
            map.put("packageName", context3.getPackageName());
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            map.put("version", str);
            AbstractC4862t.b(packageInfo);
            map.put("buildNumber", String.valueOf(d(packageInfo)));
            if (strB != null) {
                map.put("buildSignature", strB);
            }
            if (strC != null) {
                map.put("installerStore", strC);
            }
            map.put("installTime", String.valueOf(j10));
            map.put("updateTime", String.valueOf(j11));
            result.success(map);
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("Name not found", e10.getMessage(), null);
        }
    }
}
