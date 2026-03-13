package androidx.core.app;

import Y0.AbstractC2555i;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.B;
import androidx.lifecycle.C2759o;
import androidx.lifecycle.InterfaceC2758n;
import b0.J;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class g extends Activity implements InterfaceC2758n, AbstractC2555i.a {
    private final J extraDataMap = new J(0, 1, null);
    private final C2759o lifecycleRegistry = new C2759o(this);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC4862t.e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        if (AbstractC2555i.a(decorView, event)) {
            return true;
        }
        return AbstractC2555i.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        AbstractC4862t.e(event, "event");
        View decorView = getWindow().getDecorView();
        AbstractC4862t.d(decorView, "getDecorView(...)");
        if (AbstractC2555i.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r3.equals("--list-dumpables") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r3.equals("--dump-dumpable") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.String[] r3) {
        /*
            r2 = this;
            r2 = 0
            if (r3 == 0) goto L4a
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L4a
        L7:
            r3 = r3[r2]
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case -645125871: goto L40;
                case 100470631: goto L2f;
                case 472614934: goto L26;
                case 1159329357: goto L1c;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L4a
        L12:
            java.lang.String r0 = "--autofill"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L1b
            goto L4a
        L1b:
            return r1
        L1c:
            java.lang.String r0 = "--contentcapture"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto L4a
        L25:
            return r1
        L26:
            java.lang.String r0 = "--list-dumpables"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38
            goto L4a
        L2f:
            java.lang.String r0 = "--dump-dumpable"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L38
            goto L4a
        L38:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L3f
            return r1
        L3f:
            return r2
        L40:
            java.lang.String r0 = "--translation"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L49
            goto L4a
        L49:
            return r1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.g.e(java.lang.String[]):boolean");
    }

    public <T extends a> T getExtraData(Class<T> extraDataClass) {
        AbstractC4862t.e(extraDataClass, "extraDataClass");
        return (T) this.extraDataMap.get(extraDataClass);
    }

    @Override // androidx.lifecycle.InterfaceC2758n
    public AbstractC2754j getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B.INSTANCE.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC4862t.e(outState, "outState");
        this.lifecycleRegistry.m(AbstractC2754j.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    public void putExtraData(a extraData) {
        AbstractC4862t.e(extraData, "extraData");
        this.extraDataMap.put(extraData.getClass(), extraData);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !e(strArr);
    }

    @Override // Y0.AbstractC2555i.a
    public boolean superDispatchKeyEvent(KeyEvent event) {
        AbstractC4862t.e(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
