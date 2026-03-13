package fd;

import md.j;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum j implements j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static j.b internalValueMap = new j.b() { // from class: fd.j.a
        @Override // md.j.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j findValueByNumber(int i10) {
            return j.a(i10);
        }
    };
    private final int value;

    j(int i10, int i11) {
        this.value = i11;
    }

    public static j a(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }

    @Override // md.j.a
    public final int getNumber() {
        return this.value;
    }
}
