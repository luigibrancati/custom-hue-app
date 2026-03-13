package O4;

import O4.C1601m;
import O4.r;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC3541h0;
import com.google.android.gms.internal.play_billing.AbstractC3629w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: O4.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1601m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f11108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC3541h0 f11109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f11110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11111g;

    /* JADX INFO: renamed from: O4.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f11114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f11115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c.a f11117f;

        public /* synthetic */ a(AbstractC1611r0 abstractC1611r0) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f11117f = aVarA;
        }

        public C1601m a() {
            ArrayList arrayList = this.f11115d;
            boolean z10 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f11114c;
            boolean z11 = (list == null || list.isEmpty()) ? false : true;
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            AbstractC1611r0 abstractC1611r0 = null;
            if (!z10) {
                this.f11114c.forEach(new Consumer() { // from class: O4.q0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        if (((C1601m.b) obj) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                });
            } else {
                if (this.f11115d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f11115d.size() > 1) {
                    android.support.v4.media.session.a.a(this.f11115d.get(0));
                    throw null;
                }
            }
            C1601m c1601m = new C1601m(abstractC1611r0);
            if (z10) {
                android.support.v4.media.session.a.a(this.f11115d.get(0));
                throw null;
            }
            c1601m.f11105a = z11 && !((b) this.f11114c.get(0)).b().h().isEmpty();
            c1601m.f11106b = this.f11112a;
            c1601m.f11107c = this.f11113b;
            c1601m.f11108d = this.f11117f.a();
            ArrayList arrayList2 = this.f11115d;
            c1601m.f11110f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            c1601m.f11111g = this.f11116e;
            List list2 = this.f11114c;
            c1601m.f11109e = list2 != null ? AbstractC3541h0.r(list2) : AbstractC3541h0.s();
            return c1601m;
        }

        public a b(String str) {
            this.f11112a = str;
            return this;
        }

        public a c(String str) {
            this.f11113b = str;
            return this;
        }

        public a d(List list) {
            this.f11114c = new ArrayList(list);
            return this;
        }

        public a e(c cVar) {
            this.f11117f = c.c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: O4.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f11118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11119b;

        /* JADX INFO: renamed from: O4.m$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public r f11120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f11121b;

            public /* synthetic */ a(AbstractC1611r0 abstractC1611r0) {
            }

            public b a() {
                AbstractC3629w.c(this.f11120a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f11120a.f() != null) {
                    AbstractC3629w.c(this.f11121b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f11121b = str;
                return this;
            }

            public a c(r rVar) {
                this.f11120a = rVar;
                if (rVar.c() != null) {
                    rVar.c().getClass();
                    r.b bVarC = rVar.c();
                    if (bVarC.e() != null) {
                        this.f11121b = bVarC.e();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ b(a aVar, AbstractC1611r0 abstractC1611r0) {
            this.f11118a = aVar.f11120a;
            this.f11119b = aVar.f11121b;
        }

        public static a a() {
            return new a(null);
        }

        public final r b() {
            return this.f11118a;
        }

        public final String c() {
            return this.f11119b;
        }
    }

    /* JADX INFO: renamed from: O4.m$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11124c = 0;

        /* JADX INFO: renamed from: O4.m$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f11125a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f11126b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f11127c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f11128d = 0;

            public /* synthetic */ a(AbstractC1611r0 abstractC1611r0) {
            }

            public static /* synthetic */ a e(a aVar) {
                aVar.f11127c = true;
                return aVar;
            }

            public c a() {
                boolean z10 = true;
                AbstractC1611r0 abstractC1611r0 = null;
                if (TextUtils.isEmpty(this.f11125a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f11126b);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f11127c && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(abstractC1611r0);
                cVar.f11122a = this.f11125a;
                cVar.f11124c = this.f11128d;
                cVar.f11123b = this.f11126b;
                return cVar;
            }

            public a b(String str) {
                this.f11125a = str;
                return this;
            }

            public a c(String str) {
                this.f11126b = str;
                return this;
            }

            public a d(int i10) {
                this.f11128d = i10;
                return this;
            }

            public final a f(String str) {
                this.f11125a = str;
                return this;
            }
        }

        public /* synthetic */ c(AbstractC1611r0 abstractC1611r0) {
        }

        public static a a() {
            return new a(null);
        }

        public static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.f(cVar.f11122a);
            aVarA.d(cVar.f11124c);
            aVarA.c(cVar.f11123b);
            return aVarA;
        }

        public final int b() {
            return this.f11124c;
        }

        public final String d() {
            return this.f11122a;
        }

        public final String e() {
            return this.f11123b;
        }
    }

    public /* synthetic */ C1601m(AbstractC1611r0 abstractC1611r0) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f11108d.b();
    }

    public final com.android.billingclient.api.a c() {
        if (this.f11109e.isEmpty()) {
            return com.android.billingclient.api.d.f26629l;
        }
        b bVar = (b) this.f11109e.get(0);
        for (int i10 = 1; i10 < this.f11109e.size(); i10++) {
            b bVar2 = (b) this.f11109e.get(i10);
            if (!bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                return com.android.billingclient.api.d.a(5, "All products should have same ProductType.");
            }
        }
        String strH = bVar.b().h();
        HashSet hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        AbstractC3541h0 abstractC3541h0 = this.f11109e;
        int size = abstractC3541h0.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar3 = (b) abstractC3541h0.get(i11);
            bVar3.b().e().equals("subs");
            if (hashSet.contains(bVar3.b().d())) {
                return com.android.billingclient.api.d.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar3.b().d()));
            }
            hashSet.add(bVar3.b().d());
            if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !strH.equals(bVar3.b().h())) {
                return com.android.billingclient.api.d.a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet2) {
            if (hashSet.contains(str)) {
                return com.android.billingclient.api.d.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        r.b bVarC = bVar.b().c();
        return (bVarC == null || bVarC.d() == null) ? com.android.billingclient.api.d.f26629l : com.android.billingclient.api.d.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    public final String d() {
        return this.f11106b;
    }

    public final String e() {
        return this.f11107c;
    }

    public final String f() {
        return this.f11108d.d();
    }

    public final String g() {
        return this.f11108d.e();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11110f);
        return arrayList;
    }

    public final List i() {
        return this.f11109e;
    }

    public final boolean q() {
        return this.f11111g;
    }

    public final boolean r() {
        return (this.f11106b == null && this.f11107c == null && this.f11108d.e() == null && this.f11108d.b() == 0 && !this.f11109e.stream().anyMatch(new Predicate() { // from class: O4.p0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) && !this.f11105a && !this.f11111g) ? false : true;
    }
}
