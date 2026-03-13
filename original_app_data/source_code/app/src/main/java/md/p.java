package md;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface p extends q {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a extends Cloneable, q {
        p build();

        a v0(C5051e c5051e, C5053g c5053g);
    }

    void a(C5052f c5052f);

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
