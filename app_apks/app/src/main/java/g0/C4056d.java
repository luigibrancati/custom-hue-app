package g0;

import f0.InterfaceC3984b;
import gc.AbstractC4197j;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: g0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4056d extends AbstractC4197j implements InterfaceC3984b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4054b f34796b;

    public C4056d(C4054b c4054b) {
        this.f34796b = c4054b;
    }

    @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }

    @Override // gc.AbstractC4189b
    public int d() {
        return this.f34796b.size();
    }

    public boolean f(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object obj = this.f34796b.get(entry.getKey());
        return obj != null ? AbstractC4862t.a(obj, entry.getValue()) : entry.getValue() == null && this.f34796b.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C4057e(this.f34796b.n());
    }
}
