package org.webrtc;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public interface Predicate<T> {
    default Predicate<T> and(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.2
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate
            public boolean test(T t10) {
                return this.this$0.test(t10) && predicate.test(t10);
            }
        };
    }

    default Predicate<T> negate() {
        return new Predicate<T>() { // from class: org.webrtc.Predicate.3
            @Override // org.webrtc.Predicate
            public boolean test(T t10) {
                return !Predicate.this.test(t10);
            }
        };
    }

    default Predicate<T> or(final Predicate<? super T> predicate) {
        return new Predicate<T>(this) { // from class: org.webrtc.Predicate.1
            final /* synthetic */ Predicate this$0;

            {
                this.this$0 = this;
            }

            @Override // org.webrtc.Predicate
            public boolean test(T t10) {
                return this.this$0.test(t10) || predicate.test(t10);
            }
        };
    }

    boolean test(T t10);
}
