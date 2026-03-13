package zc;

import java.util.Random;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: zc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6557b extends AbstractC6556a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f48884c = new a();

    /* JADX INFO: renamed from: zc.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // zc.AbstractC6556a
    public Random h() {
        Object obj = this.f48884c.get();
        AbstractC4862t.d(obj, "get(...)");
        return (Random) obj;
    }
}
