package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class FileChooserParamsProxyApi extends PigeonApiFileChooserParams {
    public FileChooserParamsProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    public List<String> acceptTypes(WebChromeClient.FileChooserParams fileChooserParams) {
        return Arrays.asList(fileChooserParams.getAcceptTypes());
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    public String filenameHint(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.getFilenameHint();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    public boolean isCaptureEnabled(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.isCaptureEnabled();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams
    public FileChooserMode mode(WebChromeClient.FileChooserParams fileChooserParams) {
        int mode = fileChooserParams.getMode();
        return mode != 0 ? mode != 1 ? mode != 3 ? FileChooserMode.UNKNOWN : FileChooserMode.SAVE : FileChooserMode.OPEN_MULTIPLE : FileChooserMode.OPEN;
    }
}
