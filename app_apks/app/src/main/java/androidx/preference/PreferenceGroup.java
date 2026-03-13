package androidx.preference;

import N0.i;
import T2.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b0.J;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final J f23949E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Handler f23950F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final List f23951G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f23952H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f23953I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f23954J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f23955P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final Runnable f23956Q;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f23949E.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f23949E = new J();
        this.f23950F = new Handler(Looper.getMainLooper());
        this.f23952H = true;
        this.f23953I = 0;
        this.f23954J = false;
        this.f23955P = Integer.MAX_VALUE;
        this.f23956Q = new a();
        this.f23951G = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f16179v0, i10, i11);
        int i12 = g.f16183x0;
        this.f23952H = i.b(typedArrayObtainStyledAttributes, i12, i12, true);
        if (typedArrayObtainStyledAttributes.hasValue(g.f16181w0)) {
            int i13 = g.f16181w0;
            V(i.d(typedArrayObtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void G(boolean z10) {
        super.G(z10);
        int iU = U();
        for (int i10 = 0; i10 < iU; i10++) {
            T(i10).K(this, z10);
        }
    }

    public Preference T(int i10) {
        return (Preference) this.f23951G.get(i10);
    }

    public int U() {
        return this.f23951G.size();
    }

    public void V(int i10) {
        if (i10 != Integer.MAX_VALUE && !C()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f23955P = i10;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
