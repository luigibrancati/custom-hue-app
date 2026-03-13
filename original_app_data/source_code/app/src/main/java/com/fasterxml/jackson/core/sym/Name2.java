package com.fasterxml.jackson.core.sym;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class Name2 extends Name {

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private final int f28888q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private final int f28889q2;

    public Name2(String str, int i10, int i11, int i12) {
        super(str, i10);
        this.f28888q1 = i11;
        this.f28889q2 = i12;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11, int i12) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i10, int i11) {
        return i10 == this.f28888q1 && i11 == this.f28889q2;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i10) {
        return i10 == 2 && iArr[0] == this.f28888q1 && iArr[1] == this.f28889q2;
    }
}
