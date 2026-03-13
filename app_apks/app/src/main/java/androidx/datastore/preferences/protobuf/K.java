package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface K extends L {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a extends L, Cloneable {
        K buildPartial();
    }

    void a(AbstractC2703i abstractC2703i);

    T getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    AbstractC2700f toByteString();
}
