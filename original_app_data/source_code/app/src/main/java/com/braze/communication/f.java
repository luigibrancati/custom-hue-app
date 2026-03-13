package com.braze.communication;

import com.braze.support.BrazeLogger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f27564a;

    public f() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f27564a = sSLContext.getSocketFactory();
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            final ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            Iterator itA = AbstractC4846c.a(sSLSocket.getSupportedProtocols());
            while (itA.hasNext()) {
                String str = (String) itA.next();
                if (!AbstractC4862t.a(str, "SSLv3")) {
                    AbstractC4862t.b(str);
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: T4.g
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.communication.f.a(arrayList);
                }
            }, 6, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f27564a.createSocket();
        AbstractC4862t.d(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f27564a.getDefaultCipherSuites();
        AbstractC4862t.d(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f27564a.getSupportedCipherSuites();
        AbstractC4862t.d(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String host, int i10, boolean z10) throws IOException {
        AbstractC4862t.e(socket, "socket");
        AbstractC4862t.e(host, "host");
        Socket socketCreateSocket = this.f27564a.createSocket(socket, host, i10, z10);
        AbstractC4862t.d(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i10) throws IOException {
        AbstractC4862t.e(host, "host");
        Socket socketCreateSocket = this.f27564a.createSocket(host, i10);
        AbstractC4862t.d(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String host, int i10, InetAddress localHost, int i11) throws IOException {
        AbstractC4862t.e(host, "host");
        AbstractC4862t.e(localHost, "localHost");
        Socket socketCreateSocket = this.f27564a.createSocket(host, i10, localHost, i11);
        AbstractC4862t.d(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress host, int i10) throws IOException {
        AbstractC4862t.e(host, "host");
        Socket socketCreateSocket = this.f27564a.createSocket(host, i10);
        AbstractC4862t.d(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress address, int i10, InetAddress localAddress, int i11) throws IOException {
        AbstractC4862t.e(address, "address");
        AbstractC4862t.e(localAddress, "localAddress");
        Socket socketCreateSocket = this.f27564a.createSocket(address, i10, localAddress, i11);
        AbstractC4862t.d(socketCreateSocket, "createSocket(...)");
        return a(socketCreateSocket);
    }

    public static final String a(List list) {
        return "Enabling SSL protocols: " + list;
    }
}
