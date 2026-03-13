package J7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6302d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f6303a;

        /* JADX INFO: renamed from: J7.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0105a extends b {
            public C0105a(r rVar, CharSequence charSequence) {
                super(rVar, charSequence);
            }

            @Override // J7.r.b
            public int e(int i10) {
                return i10 + 1;
            }

            @Override // J7.r.b
            public int f(int i10) {
                return a.this.f6303a.c(this.f6305c, i10);
            }
        }

        public a(d dVar) {
            this.f6303a = dVar;
        }

        @Override // J7.r.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(r rVar, CharSequence charSequence) {
            return new C0105a(rVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends J7.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f6305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f6306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6308f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6309g;

        public b(r rVar, CharSequence charSequence) {
            this.f6306d = rVar.f6299a;
            this.f6307e = rVar.f6300b;
            this.f6309g = rVar.f6302d;
            this.f6305c = charSequence;
        }

        @Override // J7.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iF;
            int i10 = this.f6308f;
            while (true) {
                int i11 = this.f6308f;
                if (i11 == -1) {
                    return (String) b();
                }
                iF = f(i11);
                if (iF == -1) {
                    iF = this.f6305c.length();
                    this.f6308f = -1;
                } else {
                    this.f6308f = e(iF);
                }
                int i12 = this.f6308f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f6308f = i13;
                    if (i13 > this.f6305c.length()) {
                        this.f6308f = -1;
                    }
                } else {
                    while (i10 < iF && this.f6306d.e(this.f6305c.charAt(i10))) {
                        i10++;
                    }
                    while (iF > i10 && this.f6306d.e(this.f6305c.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f6307e || i10 != iF) {
                        break;
                    }
                    i10 = this.f6308f;
                }
            }
            int i14 = this.f6309g;
            if (i14 == 1) {
                iF = this.f6305c.length();
                this.f6308f = -1;
                while (iF > i10 && this.f6306d.e(this.f6305c.charAt(iF - 1))) {
                    iF--;
                }
            } else {
                this.f6309g = i14 - 1;
            }
            return this.f6305c.subSequence(i10, iF).toString();
        }

        public abstract int e(int i10);

        public abstract int f(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        Iterator a(r rVar, CharSequence charSequence);
    }

    public r(c cVar) {
        this(cVar, false, d.f(), Integer.MAX_VALUE);
    }

    public static r d(char c10) {
        return e(d.d(c10));
    }

    public static r e(d dVar) {
        n.j(dVar);
        return new r(new a(dVar));
    }

    public List f(CharSequence charSequence) {
        n.j(charSequence);
        Iterator itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add((String) itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator g(CharSequence charSequence) {
        return this.f6301c.a(this, charSequence);
    }

    public r(c cVar, boolean z10, d dVar, int i10) {
        this.f6301c = cVar;
        this.f6300b = z10;
        this.f6299a = dVar;
        this.f6302d = i10;
    }
}
