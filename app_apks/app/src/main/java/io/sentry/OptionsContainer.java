package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class OptionsContainer<T> {
    private final Class<T> clazz;

    private OptionsContainer(Class<T> cls) {
        this.clazz = cls;
    }

    public static <T> OptionsContainer<T> create(Class<T> cls) {
        return new OptionsContainer<>(cls);
    }

    public T createInstance() {
        return this.clazz.getDeclaredConstructor(null).newInstance(null);
    }
}
