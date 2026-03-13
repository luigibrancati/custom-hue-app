package Nd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc.l f10645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.l f10646c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f10647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f10648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10649c;

        public a() {
            this.f10647a = f.this.f10644a.iterator();
        }

        public final boolean a() {
            Iterator it = this.f10648b;
            if (it != null && it.hasNext()) {
                this.f10649c = 1;
                return true;
            }
            while (this.f10647a.hasNext()) {
                Iterator it2 = (Iterator) f.this.f10646c.invoke(f.this.f10645b.invoke(this.f10647a.next()));
                if (it2.hasNext()) {
                    this.f10648b = it2;
                    this.f10649c = 1;
                    return true;
                }
            }
            this.f10649c = 2;
            this.f10648b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f10649c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f10649c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.f10649c = 0;
            Iterator it = this.f10648b;
            AbstractC4862t.b(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h sequence, vc.l transformer, vc.l iterator) {
        AbstractC4862t.e(sequence, "sequence");
        AbstractC4862t.e(transformer, "transformer");
        AbstractC4862t.e(iterator, "iterator");
        this.f10644a = sequence;
        this.f10645b = transformer;
        this.f10646c = iterator;
    }

    @Override // Nd.h
    public Iterator iterator() {
        return new a();
    }
}
