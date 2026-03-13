package ia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements PluginRegistry.ActivityResultListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f37335j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f37336k = (d.class.hashCode() + 43) & 65535;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37337l = (d.class.hashCode() + 83) & 65535;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f37338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MethodChannel.Result f37339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f37342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f37344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public EventChannel.EventSink f37345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f37346i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void a(MethodChannel.Result result) {
            AbstractC4862t.e(result, "result");
            result.error("already_active", "File picker is already active", null);
        }

        public final int b() {
            return c.f37336k;
        }

        public final int c() {
            return c.f37337l;
        }

        public a() {
        }
    }

    public c(Activity activity, MethodChannel.Result result) {
        AbstractC4862t.e(activity, "activity");
        this.f37338a = activity;
        this.f37339b = result;
    }

    public static final void f(c cVar, boolean z10) {
        EventChannel.EventSink eventSink = cVar.f37345h;
        if (eventSink != null) {
            eventSink.success(Boolean.valueOf(z10));
        }
    }

    public final void d() {
        this.f37339b = null;
    }

    public final void e(final boolean z10) {
        if (this.f37345h == null || AbstractC4862t.a(this.f37342e, "dir")) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ia.b
            @Override // java.lang.Runnable
            public final void run() {
                c.f(this.f37333a, z10);
            }
        });
    }

    public final void g(String errorCode, String str) {
        AbstractC4862t.e(errorCode, "errorCode");
        e(false);
        MethodChannel.Result result = this.f37339b;
        if (result != null) {
            result.error(errorCode, str, null);
        }
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.MethodChannel$Result] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 0
            r5.e(r0)
            io.flutter.plugin.common.MethodChannel$Result r0 = r5.f37339b
            if (r0 == 0) goto L50
            r1 = 0
            if (r6 == 0) goto L17
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L11
            r2 = r6
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 != 0) goto L15
            goto L17
        L15:
            r1 = r2
            goto L4a
        L17:
            boolean r2 = r6 instanceof java.util.ArrayList
            if (r2 == 0) goto L1e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            goto L1f
        L1e:
            r6 = r1
        L1f:
            if (r6 == 0) goto L4a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L2a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L15
            java.lang.Object r3 = r6.next()
            boolean r4 = r3 instanceof ia.C4370a
            if (r4 == 0) goto L3b
            ia.a r3 = (ia.C4370a) r3
            goto L3c
        L3b:
            r3 = r1
        L3c:
            if (r3 == 0) goto L43
            java.util.HashMap r3 = r3.a()
            goto L44
        L43:
            r3 = r1
        L44:
            if (r3 == 0) goto L2a
            r2.add(r3)
            goto L2a
        L4a:
            r0.success(r1)
            r5.d()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.c.h(java.lang.Object):void");
    }

    public final Activity i() {
        return this.f37338a;
    }

    public final ArrayList j() {
        return this.f37344g;
    }

    public final String k() {
        return this.f37342e;
    }

    public final boolean l(int i10, Intent intent) {
        if (i10 != -1) {
            if (i10 != 0) {
                return false;
            }
            h(null);
            return true;
        }
        e(true);
        e eVar = e.f37359a;
        Activity activity = this.f37338a;
        int i11 = this.f37343f;
        boolean z10 = this.f37341d;
        String str = this.f37342e;
        if (str == null) {
            str = "";
        }
        eVar.x(this, activity, intent, i11, z10, str);
        return true;
    }

    public final boolean m(int i10, Intent intent) {
        if (i10 == -1) {
            return o(intent != null ? intent.getData() : null);
        }
        if (i10 != 0) {
            return false;
        }
        h(null);
        return false;
    }

    public final boolean n() {
        return this.f37340c;
    }

    public final boolean o(Uri uri) {
        if (uri == null) {
            return false;
        }
        e(true);
        try {
            Uri uriD = e.f37359a.D(this.f37338a, uri, this.f37346i);
            if (uriD != null) {
                uri = uriD;
            }
            h(uri.getPath());
            return true;
        } catch (IOException e10) {
            Log.e("FilePickerDelegate", "Error while saving file", e10);
            g("Error while saving file", e10.getMessage());
            return false;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == f37337l) {
            return m(i11, intent);
        }
        if (i10 == f37336k) {
            return l(i11, intent);
        }
        g("unknown_activity", "Unknown activity error, please file an issue.");
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.f37344g = arrayList;
    }

    public final void q(byte[] bArr) {
        this.f37346i = bArr;
    }

    public final void r(int i10) {
        this.f37343f = i10;
    }

    public final void s(EventChannel.EventSink eventSink) {
        this.f37345h = eventSink;
    }

    public final void t(boolean z10) {
        this.f37341d = z10;
    }

    public final void u(boolean z10) {
        this.f37340c = z10;
    }

    public final boolean v(MethodChannel.Result result) {
        AbstractC4862t.e(result, "result");
        if (this.f37339b != null) {
            return false;
        }
        this.f37339b = result;
        return true;
    }

    public final void w(String str) {
        this.f37342e = str;
    }

    public /* synthetic */ c(Activity activity, MethodChannel.Result result, int i10, AbstractC4854k abstractC4854k) {
        this(activity, (i10 & 2) != 0 ? null : result);
    }
}
