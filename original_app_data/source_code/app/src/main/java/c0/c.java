package c0;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25522a;

    public c() {
        this(0, 0.0f, 3, null);
    }

    public final Object a(Object key) {
        AbstractC4862t.e(key, "key");
        return this.f25522a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f25522a.entrySet();
        AbstractC4862t.d(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f25522a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        AbstractC4862t.e(key, "key");
        AbstractC4862t.e(value, "value");
        return this.f25522a.put(key, value);
    }

    public final Object e(Object key) {
        AbstractC4862t.e(key, "key");
        return this.f25522a.remove(key);
    }

    public c(int i10, float f10) {
        this.f25522a = new LinkedHashMap(i10, f10, true);
    }

    public /* synthetic */ c(int i10, float f10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 16 : i10, (i11 & 2) != 0 ? 0.75f : f10);
    }
}
