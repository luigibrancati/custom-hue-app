package J4;

import gc.C4179C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6105c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f6106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f6107b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public c() {
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        AbstractC4862t.d(setSynchronizedSet, "synchronizedSet(...)");
        this.f6107b = setSynchronizedSet;
    }

    public final void a(String log) {
        AbstractC4862t.e(log, "log");
        this.f6107b.add(log);
        while (this.f6107b.size() > 10) {
            Set set = this.f6107b;
            set.remove(C4179C.g0(set));
        }
    }

    public final void b(String event) {
        AbstractC4862t.e(event, "event");
        if (this.f6106a == null) {
            this.f6106a = Collections.synchronizedList(new ArrayList());
        }
        List list = this.f6106a;
        if (list != null) {
            list.add(event);
        }
    }

    public final String c() {
        if (!d()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = this.f6106a;
        if (list != null) {
            AbstractC4862t.b(list);
            if (!list.isEmpty()) {
                List list2 = this.f6106a;
                AbstractC4862t.b(list2);
                linkedHashMap.put("malformed_events", list2);
            }
        }
        if (!this.f6107b.isEmpty()) {
            linkedHashMap.put("error_logs", C4179C.V0(this.f6107b));
        }
        String strValueOf = String.valueOf(n.e(linkedHashMap));
        List list3 = this.f6106a;
        if (list3 != null) {
            list3.clear();
        }
        this.f6107b.clear();
        return strValueOf;
    }

    public final boolean d() {
        List list = this.f6106a;
        if (list != null) {
            AbstractC4862t.b(list);
            if (!list.isEmpty()) {
                return true;
            }
        }
        return !this.f6107b.isEmpty();
    }
}
