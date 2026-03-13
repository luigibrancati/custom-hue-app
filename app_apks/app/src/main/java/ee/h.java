package ee;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f33964b;

        public a(e eVar) {
            this.f33964b = eVar;
            this.f33963a = eVar.d();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e next() {
            e eVar = this.f33964b;
            int iD = eVar.d();
            int i10 = this.f33963a;
            this.f33963a = i10 - 1;
            return eVar.h(iD - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33963a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f33966b;

        public b(e eVar) {
            this.f33966b = eVar;
            this.f33965a = eVar.d();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            e eVar = this.f33966b;
            int iD = eVar.d();
            int i10 = this.f33965a;
            this.f33965a = i10 - 1;
            return eVar.e(iD - i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33965a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Iterable, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f33967a;

        public c(e eVar) {
            this.f33967a = eVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(this.f33967a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements Iterable, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f33968a;

        public d(e eVar) {
            this.f33968a = eVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f33968a);
        }
    }

    public static final Iterable a(e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        return new c(eVar);
    }

    public static final Iterable b(e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        return new d(eVar);
    }
}
