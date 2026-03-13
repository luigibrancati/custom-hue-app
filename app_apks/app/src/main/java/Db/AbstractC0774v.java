package Db;

import Db.InterfaceC0773u;
import java.util.ArrayList;

/* JADX INFO: renamed from: Db.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0774v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2652a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f2653b;

    /* JADX INFO: renamed from: Db.v$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements InterfaceC0773u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f2654a;

        public final boolean a(b bVar) {
            return Double.doubleToLongBits(this.f2654a) == Double.doubleToLongBits(bVar.f2654a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && a((b) obj);
        }

        public int hashCode() {
            return Double.hashCode(this.f2654a) + 177573;
        }

        public String toString() {
            return "PartialSegmentInformation{partTargetDuration=" + this.f2654a + "}";
        }

        public b(AbstractC0774v abstractC0774v) {
            this.f2654a = abstractC0774v.f2653b;
        }
    }

    public AbstractC0774v() {
        if (!(this instanceof InterfaceC0773u.a)) {
            throw new UnsupportedOperationException("Use: new PartialSegmentInformation.Builder()");
        }
    }

    public InterfaceC0773u b() {
        if (this.f2652a == 0) {
            return new b();
        }
        throw new IllegalStateException(c());
    }

    public final String c() {
        ArrayList arrayList = new ArrayList();
        if ((this.f2652a & 1) != 0) {
            arrayList.add("partTargetDuration");
        }
        return "Cannot build PartialSegmentInformation, some of required attributes are not set " + arrayList;
    }

    public InterfaceC0773u.a d(double d10) {
        this.f2653b = d10;
        this.f2652a &= -2;
        return (InterfaceC0773u.a) this;
    }
}
