package z6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import s6.C5785d;
import t6.InterfaceC5848f;
import v6.AbstractC6055j;
import v6.AbstractC6056k;
import w6.AbstractC6157a;

/* JADX INFO: renamed from: z6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C6518a extends AbstractC6157a {
    public static final Parcelable.Creator<C6518a> CREATOR = new C6520c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f48784e = new Comparator() { // from class: z6.b
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C5785d c5785d = (C5785d) obj2;
            C5785d c5785d2 = (C5785d) obj;
            Parcelable.Creator<C6518a> creator = C6518a.CREATOR;
            return !c5785d2.e().equals(c5785d.e()) ? c5785d2.e().compareTo(c5785d.e()) : Long.compare(c5785d2.f(), c5785d.f());
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f48785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f48786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48788d;

    public C6518a(List list, boolean z10, String str, String str2) {
        AbstractC6056k.l(list);
        this.f48785a = list;
        this.f48786b = z10;
        this.f48787c = str;
        this.f48788d = str2;
    }

    public static C6518a d(y6.f fVar) {
        return f(fVar.a(), true);
    }

    public static C6518a f(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f48784e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC5848f) it.next()).a());
        }
        return new C6518a(new ArrayList(treeSet), z10, null, null);
    }

    public List e() {
        return this.f48785a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6518a)) {
            return false;
        }
        C6518a c6518a = (C6518a) obj;
        return this.f48786b == c6518a.f48786b && AbstractC6055j.a(this.f48785a, c6518a.f48785a) && AbstractC6055j.a(this.f48787c, c6518a.f48787c) && AbstractC6055j.a(this.f48788d, c6518a.f48788d);
    }

    public final int hashCode() {
        return AbstractC6055j.b(Boolean.valueOf(this.f48786b), this.f48785a, this.f48787c, this.f48788d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w6.c.a(parcel);
        w6.c.A(parcel, 1, e(), false);
        w6.c.c(parcel, 2, this.f48786b);
        w6.c.w(parcel, 3, this.f48787c, false);
        w6.c.w(parcel, 4, this.f48788d, false);
        w6.c.b(parcel, iA);
    }
}
