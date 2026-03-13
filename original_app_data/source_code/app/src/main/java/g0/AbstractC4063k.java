package g0;

import h0.AbstractC4265a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: g0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4063k implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f34806a = C4062j.f34799e.a().h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34808c;

    public final C4062j a() {
        AbstractC4265a.a(e());
        Object obj = this.f34806a[this.f34808c];
        AbstractC4862t.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (C4062j) obj;
    }

    public final Object[] b() {
        return this.f34806a;
    }

    public final int c() {
        return this.f34808c;
    }

    public final boolean d() {
        return this.f34808c < this.f34807b;
    }

    public final boolean e() {
        AbstractC4265a.a(this.f34808c >= this.f34807b);
        return this.f34808c < this.f34806a.length;
    }

    public final void f() {
        AbstractC4265a.a(e());
        this.f34808c++;
    }

    public final void g(Object[] objArr, int i10) {
        h(objArr, i10, 0);
    }

    public final void h(Object[] objArr, int i10, int i11) {
        this.f34806a = objArr;
        this.f34807b = i10;
        this.f34808c = i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return d();
    }

    public final void i(int i10) {
        this.f34808c = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
