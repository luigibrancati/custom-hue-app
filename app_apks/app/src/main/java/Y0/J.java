package Y0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Nd.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f19600a;

        public a(ViewGroup viewGroup) {
            this.f19600a = viewGroup;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return J.b(this.f19600a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f19602b;

        public b(ViewGroup viewGroup) {
            this.f19602b = viewGroup;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f19602b;
            int i10 = this.f19601a;
            this.f19601a = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19601a < this.f19602b.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f19602b;
            int i10 = this.f19601a - 1;
            this.f19601a = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final Nd.h a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Iterator b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}
