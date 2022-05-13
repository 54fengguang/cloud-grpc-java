//package org.example;
//
///**
// * @author xiongyu
// * @date 2021/12/3 下午4:14
// */
//import io.grpc.Server;
//import io.grpc.ServerBuilder;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//public class RoutingServer {
//
//    private Server server;
//    private void start() throws IOException {
//        /* The port on which the server should run */
//        int port = 50052;
//        server = ServerBuilder.forPort(port)
//                .addService(new RoutingServiceImpl())  //这里可以添加多个模块
//                .build()
//                .start();
//        System.out.println("Server started, listening on " + port);
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
//                System.err.println("*** shutting down gRPC server since JVM is shutting down");
//                try {
//                    RoutingServer.this.stop();
//                } catch (InterruptedException e) {
//                    e.printStackTrace(System.err);
//                }
//                System.err.println("*** server shut down");
//            }
//        });
//    }
//
//    private void stop() throws InterruptedException {
//        if (server != null) {
//            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
//        }
//    }
//
//    private void blockUntilShutdown() throws InterruptedException {
//        if (server != null) {
//            server.awaitTermination();
//        }
//    }
//
//    public static void main(String[] args) throws IOException, InterruptedException {
//        final RoutingServer server = new RoutingServer();
//        server.start();
//        server.blockUntilShutdown();
//    }
//
//}
