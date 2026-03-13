package fd;

import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum k implements j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static j.b internalValueMap = new j.b() { // from class: fd.k.a
        @Override // md.j.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k findValueByNumber(int i10) {
            return k.a(i10);
        }
    };
    private final int value;

    k(int i10, int i11) {
        this.value = i11;
    }

    public static k a(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }

    @Override // md.j.a
    public final int getNumber() {
        return this.value;
    }
}
