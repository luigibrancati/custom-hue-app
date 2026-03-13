package hd;

import fd.w;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36571b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f36572c = new h(C4206t.k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36573a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final h a(w table) {
            AbstractC4862t.e(table, "table");
            if (table.p() == 0) {
                return b();
            }
            List listQ = table.q();
            AbstractC4862t.d(listQ, "table.requirementList");
            return new h(listQ, null);
        }

        public final h b() {
            return h.f36572c;
        }

        public a() {
        }
    }

    public /* synthetic */ h(List list, AbstractC4854k abstractC4854k) {
        this(list);
    }

    public h(List list) {
        this.f36573a = list;
    }
}
