package helloworld;

import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.Executors;

// executar com: mvn exec:java -Dexec.mainClass="helloworld.Server"
public class Server extends BankGrpc.BankImplBase {
    @Override
    public void hello(Balance request, StreamObserver<AccountId> responseObserver) {
        responseObserver.onNext(
                AccountId.newBuilder().bank.createAccount(request.getBalance()
                ).build());
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws Exception {
        Grpc.newServerBuilderForPort(10345, InsecureServerCredentials.create())
                .addService(new Server())
                .executor(Executors.newSingleThreadExecutor())
                .build().start().awaitTermination();
    }
}
