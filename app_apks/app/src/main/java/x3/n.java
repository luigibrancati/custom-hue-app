package x3;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f47435a;

    public n(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f47435a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // x3.m
    public String[] a() {
        return this.f47435a.getSupportedFeatures();
    }

    @Override // x3.m
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) Se.a.a(StaticsBoundaryInterface.class, this.f47435a.getStatics());
    }

    @Override // x3.m
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) Se.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f47435a.getWebkitToCompatConverter());
    }
}
