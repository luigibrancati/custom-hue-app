package A9;

import java.sql.Timestamp;
import java.util.Date;
import u9.e;
import u9.w;
import u9.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f253b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f254a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements x {
        @Override // u9.x
        public w create(e eVar, B9.a aVar) {
            a aVar2 = null;
            if (aVar.c() == Timestamp.class) {
                return new c(eVar.l(Date.class), aVar2);
            }
            return null;
        }
    }

    public /* synthetic */ c(w wVar, a aVar) {
        this(wVar);
    }

    @Override // u9.w
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Timestamp c(C9.a aVar) {
        Date date = (Date) this.f254a.c(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // u9.w
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(C9.c cVar, Timestamp timestamp) {
        this.f254a.e(cVar, timestamp);
    }

    public c(w wVar) {
        this.f254a = wVar;
    }
}
