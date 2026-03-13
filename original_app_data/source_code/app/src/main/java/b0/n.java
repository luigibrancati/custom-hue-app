package b0;

import fc.C4015H;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Set, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2775F f24921a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.k implements vc.p {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f24922k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f24923l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f24924m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f24925n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f24926o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f24927p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f24928q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f24929r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f24930s;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Nd.j jVar, InterfaceC4988e interfaceC4988e) {
            return ((a) create(jVar, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = n.this.new a(interfaceC4988e);
            aVar.f24930s = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0058 -> B:23:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:14:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:20:0x0094). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0091 -> B:20:0x0094). Please report as a decompilation issue!!! */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = mc.C5046c.f()
                int r2 = r0.f24929r
                r3 = 0
                r4 = 8
                r5 = 1
                if (r2 == 0) goto L33
                if (r2 != r5) goto L2b
                int r2 = r0.f24927p
                int r6 = r0.f24926o
                long r7 = r0.f24928q
                int r9 = r0.f24925n
                int r10 = r0.f24924m
                java.lang.Object r11 = r0.f24923l
                long[] r11 = (long[]) r11
                java.lang.Object r12 = r0.f24922k
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                java.lang.Object r13 = r0.f24930s
                Nd.j r13 = (Nd.j) r13
                fc.AbstractC4036s.b(r21)
                goto L94
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L33:
                fc.AbstractC4036s.b(r21)
                java.lang.Object r2 = r0.f24930s
                Nd.j r2 = (Nd.j) r2
                b0.n r6 = b0.n.this
                b0.F r6 = b0.n.c(r6)
                java.lang.Object[] r7 = r6.f24839b
                long[] r6 = r6.f24838a
                int r8 = r6.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto La2
                r9 = r3
            L4a:
                r10 = r6[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L9d
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r2
                r2 = r3
                r18 = r10
                r11 = r6
                r10 = r8
                r6 = r12
                r12 = r7
                r7 = r18
            L6b:
                if (r2 >= r6) goto L97
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r7
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto L94
                int r14 = r9 << 3
                int r14 = r14 + r2
                r14 = r12[r14]
                r0.f24930s = r13
                r0.f24922k = r12
                r0.f24923l = r11
                r0.f24924m = r10
                r0.f24925n = r9
                r0.f24928q = r7
                r0.f24926o = r6
                r0.f24927p = r2
                r0.f24929r = r5
                java.lang.Object r14 = r13.a(r14, r0)
                if (r14 != r1) goto L94
                return r1
            L94:
                long r7 = r7 >> r4
                int r2 = r2 + r5
                goto L6b
            L97:
                if (r6 != r4) goto La2
                r8 = r10
                r6 = r11
                r7 = r12
                r2 = r13
            L9d:
                if (r9 == r8) goto La2
                int r9 = r9 + 1
                goto L4a
            La2:
                fc.H r0 = fc.C4015H.f34254a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b0.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public n(AbstractC2775F parent) {
        AbstractC4862t.e(parent, "parent");
        this.f24921a = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f24921a.b(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f24921a.b(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.f24921a.f24842e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f24921a.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return Nd.k.a(new a(null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC4853j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }
}
