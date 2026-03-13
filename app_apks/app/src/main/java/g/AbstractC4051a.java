package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4051a {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0450a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f34771a;

        public C0450a(Object obj) {
            this.f34771a = obj;
        }

        public final Object a() {
            return this.f34771a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0450a b(Context context, Object obj) {
        AbstractC4862t.e(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
