package pe;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.m f42806a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ te.d f42807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f42808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f42809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f42810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f42811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f42812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f42813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f42814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ue.q f42815i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(te.d dVar, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, ue.q qVar) {
            super(3);
            this.f42807a = dVar;
            this.f42808b = i10;
            this.f42809c = i11;
            this.f42810d = i12;
            this.f42811e = i13;
            this.f42812f = i14;
            this.f42813g = z10;
            this.f42814h = z11;
            this.f42815i = qVar;
        }

        @Override // vc.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ue.f invoke(ue.m pool, C5465a address, ue.d user) {
            AbstractC4862t.e(pool, "pool");
            AbstractC4862t.e(address, "address");
            AbstractC4862t.e(user, "user");
            return new ue.h(new ue.i(new ue.n(this.f42807a, pool, this.f42808b, this.f42809c, this.f42810d, this.f42811e, this.f42812f, this.f42813g, this.f42814h, address, this.f42815i, user)), this.f42807a);
        }
    }

    public l(ue.m delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f42806a = delegate;
    }

    public final ue.m a() {
        return this.f42806a;
    }

    public /* synthetic */ l(int i10, long j10, TimeUnit timeUnit, te.d dVar, k kVar, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, ue.q qVar, int i16, AbstractC4854k abstractC4854k) {
        this((i16 & 1) != 0 ? 5 : i10, (i16 & 2) != 0 ? 5L : j10, (i16 & 4) != 0 ? TimeUnit.MINUTES : timeUnit, (i16 & 8) != 0 ? te.d.f44940m : dVar, (i16 & 16) != 0 ? k.f42804a.a() : kVar, (i16 & 32) != 0 ? 10000 : i11, (i16 & 64) != 0 ? 10000 : i12, (i16 & 128) != 0 ? 10000 : i13, (i16 & 256) != 0 ? 10000 : i14, (i16 & 512) == 0 ? i15 : 10000, (i16 & RecognitionOptions.UPC_E) != 0 ? true : z10, (i16 & RecognitionOptions.PDF417) == 0 ? z11 : true, (i16 & RecognitionOptions.AZTEC) != 0 ? new ue.q() : qVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit, te.d taskRunner, k connectionListener, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, ue.q routeDatabase) {
        this(new ue.m(taskRunner, i10, j10, timeUnit, connectionListener, new a(taskRunner, i11, i12, i13, i14, i15, z10, z11, routeDatabase)));
        AbstractC4862t.e(timeUnit, "timeUnit");
        AbstractC4862t.e(taskRunner, "taskRunner");
        AbstractC4862t.e(connectionListener, "connectionListener");
        AbstractC4862t.e(routeDatabase, "routeDatabase");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, te.d.f44940m, k.f42804a.a(), 0, 0, 0, 0, 0, false, false, null, 8160, null);
        AbstractC4862t.e(timeUnit, "timeUnit");
    }

    public l() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
