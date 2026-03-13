package p1;

import android.text.Editable;
import n1.C5078i;

/* JADX INFO: renamed from: p1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5378b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f42151a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f42152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f42153c;

    public C5378b() {
        try {
            f42153c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C5378b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f42152b == null) {
            synchronized (f42151a) {
                try {
                    if (f42152b == null) {
                        f42152b = new C5378b();
                    }
                } finally {
                }
            }
        }
        return f42152b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f42153c;
        return cls != null ? C5078i.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
