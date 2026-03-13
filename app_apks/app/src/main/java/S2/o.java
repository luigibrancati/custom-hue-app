package S2;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f15306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f15308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15309f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            o.this.a();
        }

        public void onBackInvoked() {
            o.this.b();
        }

        public void onBackProgressed(BackEvent backEvent) {
            AbstractC4862t.e(backEvent, "backEvent");
            o.this.c(k.a(backEvent));
        }

        public void onBackStarted(BackEvent backEvent) {
            AbstractC4862t.e(backEvent, "backEvent");
            o.this.d(k.a(backEvent));
        }
    }

    public /* synthetic */ o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10, AbstractC4854k abstractC4854k) {
        this(onBackInvokedDispatcher, i10);
    }

    public static final void o(o oVar) {
        oVar.b();
    }

    @Override // S2.h
    public void j(boolean z10) {
        p(z10);
    }

    public final OnBackInvokedCallback n() {
        return new a();
    }

    public final void p(boolean z10) {
        if (z10 && !this.f15309f) {
            this.f15306c.registerOnBackInvokedCallback(this.f15307d, this.f15308e);
            this.f15309f = true;
        } else {
            if (z10 || !this.f15309f) {
                return;
            }
            this.f15306c.unregisterOnBackInvokedCallback(this.f15308e);
            this.f15309f = false;
        }
    }

    public o(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.f15306c = onBackInvokedDispatcher;
        this.f15307d = i10;
        this.f15308e = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: S2.n
            public final void onBackInvoked() {
                o.o(this.f15305a);
            }
        } : n();
    }
}
