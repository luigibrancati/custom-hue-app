package b3;

import android.content.Context;
import b3.t;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f25192a = new n();

    public static final t.a a(Context context, Class klass, String str) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(klass, "klass");
        if (str == null || Od.F.k0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (AbstractC4862t.a(str, ":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new t.a(context, klass, str);
    }

    public static final t.a b(Context context, Class klass) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(klass, "klass");
        return new t.a(context, klass, null);
    }
}
