package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class U extends AbstractC3708c implements V, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f32192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V f32193d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f32194b;

    static {
        U u10 = new U(false);
        f32192c = u10;
        f32193d = u10;
    }

    public U() {
        this(10);
    }

    public static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC3722j ? ((AbstractC3722j) obj).J() : N.j((byte[]) obj);
    }

    @Override // com.google.protobuf.V
    public void F(AbstractC3722j abstractC3722j) {
        c();
        this.f32194b.add(abstractC3722j);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.V
    public Object W0(int i10) {
        return this.f32194b.get(i10);
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f32194b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        c();
        this.f32194b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f32194b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3722j) {
            AbstractC3722j abstractC3722j = (AbstractC3722j) obj;
            String strJ = abstractC3722j.J();
            if (abstractC3722j.s()) {
                this.f32194b.set(i10, strJ);
            }
            return strJ;
        }
        byte[] bArr = (byte[]) obj;
        String strJ2 = N.j(bArr);
        if (N.g(bArr)) {
            this.f32194b.set(i10, strJ2);
        }
        return strJ2;
    }

    @Override // com.google.protobuf.N.j, com.google.protobuf.N.f
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public U a(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f32194b);
        return new U(arrayList);
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        c();
        Object objRemove = this.f32194b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        c();
        return e(this.f32194b.set(i10, str));
    }

    @Override // com.google.protobuf.AbstractC3708c, com.google.protobuf.N.j
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.protobuf.V
    public List o() {
        return Collections.unmodifiableList(this.f32194b);
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f32194b.size();
    }

    @Override // com.google.protobuf.V
    public V u() {
        return m() ? new M0(this) : this;
    }

    public U(boolean z10) {
        super(z10);
        this.f32194b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        c();
        if (collection instanceof V) {
            collection = ((V) collection).o();
        }
        boolean zAddAll = this.f32194b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC3708c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public U(int i10) {
        this(new ArrayList(i10));
    }

    public U(ArrayList arrayList) {
        this.f32194b = arrayList;
    }
}
