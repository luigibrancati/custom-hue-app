package We;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Spliterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Spliterator f17964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function f17965b;

        public a(Spliterator spliterator, Function function) {
            this.f17964a = spliterator;
            this.f17965b = function;
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.f17964a.characteristics() & (-262);
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.f17964a.estimateSize();
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(final Consumer consumer) {
            Spliterator spliterator = this.f17964a;
            final Function function = this.f17965b;
            spliterator.forEachRemaining(new Consumer() { // from class: We.b
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    consumer.accept(function.apply(obj));
                }
            });
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(final Consumer consumer) {
            Spliterator spliterator = this.f17964a;
            final Function function = this.f17965b;
            return spliterator.tryAdvance(new Consumer() { // from class: We.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    consumer.accept(function.apply(obj));
                }
            });
        }

        @Override // java.util.Spliterator
        public Spliterator trySplit() {
            Spliterator spliteratorTrySplit = this.f17964a.trySplit();
            if (spliteratorTrySplit != null) {
                return d.a(spliteratorTrySplit, this.f17965b);
            }
            return null;
        }
    }

    public static Spliterator a(Spliterator spliterator, Function function) {
        Ve.a.a(spliterator);
        Ve.a.a(function);
        return new a(spliterator, function);
    }
}
