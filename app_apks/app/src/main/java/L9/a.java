package L9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0130a f8589e = new C0130a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I9.a f8590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f8592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f8593d;

    /* JADX INFO: renamed from: L9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0130a {
        public /* synthetic */ C0130a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0130a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        I9.b a();
    }

    public a(I9.a mBounds, int i10) {
        AbstractC4862t.e(mBounds, "mBounds");
        this.f8590a = mBounds;
        this.f8591b = i10;
    }

    public final void a(b item) {
        AbstractC4862t.e(item, "item");
        I9.b bVarA = item.a();
        if (this.f8590a.a(bVarA.f5671a, bVarA.f5672b)) {
            c(bVarA.f5671a, bVarA.f5672b, item);
        }
    }

    public final void b() {
        this.f8593d = null;
        Set set = this.f8592c;
        if (set != null) {
            AbstractC4862t.b(set);
            set.clear();
        }
    }

    public final void c(double d10, double d11, b bVar) {
        List list = this.f8593d;
        if (list == null) {
            if (this.f8592c == null) {
                this.f8592c = new LinkedHashSet();
            }
            Set set = this.f8592c;
            AbstractC4862t.b(set);
            set.add(bVar);
            Set set2 = this.f8592c;
            AbstractC4862t.b(set2);
            if (set2.size() <= 50 || this.f8591b >= 40) {
                return;
            }
            h();
            return;
        }
        I9.a aVar = this.f8590a;
        if (d11 < aVar.f5670f) {
            if (d10 < aVar.f5669e) {
                AbstractC4862t.b(list);
                ((a) list.get(0)).c(d10, d11, bVar);
                return;
            } else {
                AbstractC4862t.b(list);
                ((a) list.get(1)).c(d10, d11, bVar);
                return;
            }
        }
        if (d10 < aVar.f5669e) {
            AbstractC4862t.b(list);
            ((a) list.get(2)).c(d10, d11, bVar);
        } else {
            AbstractC4862t.b(list);
            ((a) list.get(3)).c(d10, d11, bVar);
        }
    }

    public final boolean d(double d10, double d11, b bVar) {
        List list = this.f8593d;
        if (list == null) {
            Set set = this.f8592c;
            if (set == null) {
                return false;
            }
            AbstractC4862t.b(set);
            return set.remove(bVar);
        }
        I9.a aVar = this.f8590a;
        if (d11 < aVar.f5670f) {
            if (d10 < aVar.f5669e) {
                AbstractC4862t.b(list);
                return ((a) list.get(0)).d(d10, d11, bVar);
            }
            AbstractC4862t.b(list);
            return ((a) list.get(1)).d(d10, d11, bVar);
        }
        if (d10 < aVar.f5669e) {
            AbstractC4862t.b(list);
            return ((a) list.get(2)).d(d10, d11, bVar);
        }
        AbstractC4862t.b(list);
        return ((a) list.get(3)).d(d10, d11, bVar);
    }

    public final boolean e(b item) {
        AbstractC4862t.e(item, "item");
        I9.b bVarA = item.a();
        if (this.f8590a.a(bVarA.f5671a, bVarA.f5672b)) {
            return d(bVarA.f5671a, bVarA.f5672b, item);
        }
        return false;
    }

    public final Collection f(I9.a searchBounds) {
        AbstractC4862t.e(searchBounds, "searchBounds");
        ArrayList arrayList = new ArrayList();
        g(searchBounds, arrayList);
        return arrayList;
    }

    public final void g(I9.a aVar, Collection collection) {
        if (this.f8590a.e(aVar)) {
            List list = this.f8593d;
            if (list != null) {
                AbstractC4862t.b(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).g(aVar, collection);
                }
                return;
            }
            if (this.f8592c != null) {
                if (aVar.b(this.f8590a)) {
                    Set set = this.f8592c;
                    AbstractC4862t.b(set);
                    collection.addAll(set);
                    return;
                }
                Set<b> set2 = this.f8592c;
                AbstractC4862t.b(set2);
                for (b bVar : set2) {
                    if (aVar.c(bVar.a())) {
                        collection.add(bVar);
                    }
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(4);
        this.f8593d = arrayList;
        AbstractC4862t.b(arrayList);
        I9.a aVar = this.f8590a;
        arrayList.add(new a(new I9.a(aVar.f5665a, aVar.f5669e, aVar.f5667c, aVar.f5670f), this.f8591b + 1));
        List list = this.f8593d;
        AbstractC4862t.b(list);
        I9.a aVar2 = this.f8590a;
        list.add(new a(new I9.a(aVar2.f5669e, aVar2.f5666b, aVar2.f5667c, aVar2.f5670f), this.f8591b + 1));
        List list2 = this.f8593d;
        AbstractC4862t.b(list2);
        I9.a aVar3 = this.f8590a;
        list2.add(new a(new I9.a(aVar3.f5665a, aVar3.f5669e, aVar3.f5670f, aVar3.f5668d), this.f8591b + 1));
        List list3 = this.f8593d;
        AbstractC4862t.b(list3);
        I9.a aVar4 = this.f8590a;
        list3.add(new a(new I9.a(aVar4.f5669e, aVar4.f5666b, aVar4.f5670f, aVar4.f5668d), this.f8591b + 1));
        Set<b> set = this.f8592c;
        this.f8592c = null;
        if (set != null) {
            for (b bVar : set) {
                c(bVar.a().f5671a, bVar.a().f5672b, bVar);
            }
        }
    }

    public /* synthetic */ a(I9.a aVar, int i10, int i11, AbstractC4854k abstractC4854k) {
        this(aVar, (i11 & 2) != 0 ? 0 : i10);
    }

    public a(double d10, double d11, double d12, double d13) {
        this(new I9.a(d10, d11, d12, d13), 0, 2, (AbstractC4854k) null);
    }
}
