package v6;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f45790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f45792c;

    public M(com.google.android.gms.common.internal.a aVar, Object obj) {
        Objects.requireNonNull(aVar);
        this.f45792c = aVar;
        this.f45790a = obj;
        this.f45791b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f45790a;
                if (this.f45791b) {
                    String string = toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f45791b = true;
        }
        c();
    }

    public final void c() {
        d();
        com.google.android.gms.common.internal.a aVar = this.f45792c;
        synchronized (aVar.c0()) {
            aVar.c0().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f45790a = null;
        }
    }
}
