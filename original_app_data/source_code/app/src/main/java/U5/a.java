package U5;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.sentry.protocol.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001$B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"LU5/a;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "<init>", "()V", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "Lfc/H;", "onAttachedToEngine", "(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "p0", "onAttachedToActivity", "(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "onDetachedFromActivityForConfigChanges", "activityPluginBinding", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", FeatureFlag.JsonKeys.RESULT, "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)Z", "a", "(Landroid/content/Intent;)V", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "c", "Lio/flutter/plugin/common/MethodChannel$Result;", "pendingResultCallback", "d", "contact_picker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MethodChannel channel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Activity activity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public MethodChannel.Result pendingResultCallback;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r10) throws java.io.IOException {
        /*
            r9 = this;
            android.app.Activity r0 = r9.activity
            java.lang.String r1 = "selection_error"
            r2 = 0
            if (r0 == 0) goto L84
            if (r10 == 0) goto L72
            android.net.Uri r4 = r10.getData()
            if (r4 == 0) goto L72
            android.content.ContentResolver r3 = r0.getContentResolver()
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            if (r10 == 0) goto L6f
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L5a
            java.lang.String r0 = "data1"
            int r0 = r10.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "display_name"
            int r3 = r10.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L55
            io.flutter.plugin.common.MethodChannel$Result r4 = r9.pendingResultCallback     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L58
            java.lang.String r5 = "name"
            java.lang.String r3 = r10.getString(r3)     // Catch: java.lang.Throwable -> L55
            fc.q r3 = fc.AbstractC4040w.a(r5, r3)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "phoneNumber"
            java.lang.String r0 = r10.getString(r0)     // Catch: java.lang.Throwable -> L55
            fc.q r0 = fc.AbstractC4040w.a(r5, r0)     // Catch: java.lang.Throwable -> L55
            fc.q[] r0 = new fc.C4034q[]{r3, r0}     // Catch: java.lang.Throwable -> L55
            java.util.HashMap r0 = gc.Q.k(r0)     // Catch: java.lang.Throwable -> L55
            r4.success(r0)     // Catch: java.lang.Throwable -> L55
            fc.H r0 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L55
            goto L65
        L55:
            r0 = move-exception
            r9 = r0
            goto L69
        L58:
            r0 = r2
            goto L65
        L5a:
            io.flutter.plugin.common.MethodChannel$Result r0 = r9.pendingResultCallback     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L58
            java.lang.String r3 = "Failed to select contact, nothing to select"
            r0.error(r1, r3, r2)     // Catch: java.lang.Throwable -> L55
            fc.H r0 = fc.C4015H.f34254a     // Catch: java.lang.Throwable -> L55
        L65:
            sc.c.a(r10, r2)
            goto L70
        L69:
            throw r9     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            sc.c.a(r10, r9)
            throw r0
        L6f:
            r0 = r2
        L70:
            if (r0 != 0) goto L80
        L72:
            io.flutter.plugin.common.MethodChannel$Result r10 = r9.pendingResultCallback
            if (r10 == 0) goto L7f
            java.lang.String r0 = "No contact data found"
            r10.error(r1, r0, r2)
            fc.H r10 = fc.C4015H.f34254a
            r0 = r10
            goto L80
        L7f:
            r0 = r2
        L80:
            if (r0 != 0) goto L83
            goto L84
        L83:
            return
        L84:
            io.flutter.plugin.common.MethodChannel$Result r9 = r9.pendingResultCallback
            if (r9 == 0) goto L8f
            java.lang.String r10 = "No running activity found to retrieve selected contact from"
            r9.error(r1, r10, r2)
            fc.H r9 = fc.C4015H.f34254a
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.a.a(android.content.Intent):void");
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 2015) {
            return false;
        }
        try {
            try {
                if (resultCode == -1) {
                    a(data);
                } else if (resultCode != 0) {
                    MethodChannel.Result result = this.pendingResultCallback;
                    if (result != null) {
                        result.error("intent_error", "Failed to pick contact", Integer.valueOf(resultCode));
                    }
                } else {
                    MethodChannel.Result result2 = this.pendingResultCallback;
                    if (result2 != null) {
                        result2.success(null);
                    }
                }
            } catch (Exception e10) {
                MethodChannel.Result result3 = this.pendingResultCallback;
                if (result3 != null) {
                    result3.error("selection_error", "Failed to query contact due to Exception raised", e10.getLocalizedMessage());
                }
            }
            this.pendingResultCallback = null;
            return true;
        } catch (Throwable th) {
            this.pendingResultCallback = null;
            throw th;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding p02) {
        AbstractC4862t.e(p02, "p0");
        this.activity = p02.getActivity();
        p02.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AbstractC4862t.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "contact_picker");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        AbstractC4862t.e(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            AbstractC4862t.p("channel");
            methodChannel = null;
        }
        methodChannel.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        AbstractC4862t.e(call, "call");
        AbstractC4862t.e(result, "result");
        if (!AbstractC4862t.a(call.method, "pickContact")) {
            result.notImplemented();
            return;
        }
        MethodChannel.Result result2 = this.pendingResultCallback;
        if (result2 != null) {
            AbstractC4862t.b(result2);
            result2.error("simultaneous_requests", "The user is already picking a contact, cancelling previous session", null);
            this.pendingResultCallback = null;
            return;
        }
        this.pendingResultCallback = result;
        Activity activity = this.activity;
        if (activity != null) {
            activity.startActivityForResult(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), 2015);
        } else {
            result.error("selection_error", "No running activity found to retrieve selected contact from", null);
            this.pendingResultCallback = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        AbstractC4862t.e(activityPluginBinding, "activityPluginBinding");
        this.activity = activityPluginBinding.getActivity();
        activityPluginBinding.addActivityResultListener(this);
    }
}
