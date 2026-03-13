package u6;

import s6.C5785d;
import u6.C5960i;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: u6.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5967m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5966l f45202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5972r f45203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f45204c;

    /* JADX INFO: renamed from: u6.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC5968n f45205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC5968n f45206b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C5960i f45208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C5785d[] f45209e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f45211g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Runnable f45207c = new Runnable() { // from class: u6.S
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45210f = true;

        public /* synthetic */ a(byte[] bArr) {
        }

        public C5967m a() {
            AbstractC6056k.b(this.f45205a != null, "Must set register function");
            AbstractC6056k.b(this.f45206b != null, "Must set unregister function");
            AbstractC6056k.b(this.f45208d != null, "Must set holder");
            return new C5967m(new C5934P(this, this.f45208d, this.f45209e, this.f45210f, this.f45211g), new C5935Q(this, (C5960i.a) AbstractC6056k.m(this.f45208d.b(), "Key must not be null")), this.f45207c, null);
        }

        public a b(InterfaceC5968n interfaceC5968n) {
            this.f45205a = interfaceC5968n;
            return this;
        }

        public a c(int i10) {
            this.f45211g = i10;
            return this;
        }

        public a d(InterfaceC5968n interfaceC5968n) {
            this.f45206b = interfaceC5968n;
            return this;
        }

        public a e(C5960i c5960i) {
            this.f45208d = c5960i;
            return this;
        }

        public final /* synthetic */ InterfaceC5968n f() {
            return this.f45205a;
        }

        public final /* synthetic */ InterfaceC5968n g() {
            return this.f45206b;
        }
    }

    public /* synthetic */ C5967m(AbstractC5966l abstractC5966l, AbstractC5972r abstractC5972r, Runnable runnable, byte[] bArr) {
        this.f45202a = abstractC5966l;
        this.f45203b = abstractC5972r;
        this.f45204c = runnable;
    }

    public static a a() {
        return new a(null);
    }
}
