package Sb;

/* JADX INFO: renamed from: Sb.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222x extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f15854a;

    /* JADX INFO: renamed from: Sb.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f15856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f15859e;

        public a(Eb.p pVar, Object[] objArr) {
            this.f15855a = pVar;
            this.f15856b = objArr;
        }

        public void c() {
            Object[] objArr = this.f15856b;
            int length = objArr.length;
            for (int i10 = 0; i10 < length && !j(); i10++) {
                Object obj = objArr[i10];
                if (obj == null) {
                    this.f15855a.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                this.f15855a.c(obj);
            }
            if (j()) {
                return;
            }
            this.f15855a.a();
        }

        @Override // Mb.h
        public void clear() {
            this.f15857c = this.f15856b.length;
        }

        @Override // Hb.c
        public void dispose() {
            this.f15859e = true;
        }

        @Override // Mb.h
        public boolean isEmpty() {
            return this.f15857c == this.f15856b.length;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15859e;
        }

        @Override // Mb.h
        public Object poll() {
            int i10 = this.f15857c;
            Object[] objArr = this.f15856b;
            if (i10 == objArr.length) {
                return null;
            }
            this.f15857c = i10 + 1;
            return Lb.b.e(objArr[i10], "The array element is null");
        }

        @Override // Mb.d
        public int q(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f15858d = true;
            return 1;
        }
    }

    public C2222x(Object[] objArr) {
        this.f15854a = objArr;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar, this.f15854a);
        pVar.b(aVar);
        if (aVar.f15858d) {
            return;
        }
        aVar.c();
    }
}
