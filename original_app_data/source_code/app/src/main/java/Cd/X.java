package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface X {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements X {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1308a = new a();

        @Override // Cd.X
        public void a(Lc.e0 typeAlias, Lc.f0 f0Var, E substitutedArgument) {
            AbstractC4862t.e(typeAlias, "typeAlias");
            AbstractC4862t.e(substitutedArgument, "substitutedArgument");
        }

        @Override // Cd.X
        public void b(n0 substitutor, E unsubstitutedArgument, E argument, Lc.f0 typeParameter) {
            AbstractC4862t.e(substitutor, "substitutor");
            AbstractC4862t.e(unsubstitutedArgument, "unsubstitutedArgument");
            AbstractC4862t.e(argument, "argument");
            AbstractC4862t.e(typeParameter, "typeParameter");
        }

        @Override // Cd.X
        public void c(Mc.c annotation) {
            AbstractC4862t.e(annotation, "annotation");
        }

        @Override // Cd.X
        public void d(Lc.e0 typeAlias) {
            AbstractC4862t.e(typeAlias, "typeAlias");
        }
    }

    void a(Lc.e0 e0Var, Lc.f0 f0Var, E e10);

    void b(n0 n0Var, E e10, E e11, Lc.f0 f0Var);

    void c(Mc.c cVar);

    void d(Lc.e0 e0Var);
}
