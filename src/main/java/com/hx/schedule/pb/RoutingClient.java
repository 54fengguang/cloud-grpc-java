package com.hx.schedule.pb;

/**
 * @author xiongyu
 * @date 2021/12/3 下午4:17
 */

import com.hx.schedule.algorithm.grpc.RoutingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class RoutingClient {

    //远程连接管理器,管理连接的生命周期
    private final ManagedChannel channel;
    private final RoutingServiceGrpc.RoutingServiceBlockingStub blockingStub;

    public RoutingClient(String host, int port) {
        //初始化连接
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        //初始化远程服务Stub
        blockingStub = RoutingServiceGrpc.newBlockingStub(channel);
    }


    public void shutdown() throws InterruptedException {
        //关闭连接
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

//    public List<NodeXYZ> getNodeXYZList(String name) {
//        //构造服务调用参数对象
//        Transfrom request = Transfrom.newBuilder().setAccOverlap(0)
//                .setChangeOperation(0).setSafeDistance(1.5)
//                .addNodeXYZs(NodeXYZ.newBuilder().setX(1d).setY(1d).build())
//                .addNodeXYZs(NodeXYZ.newBuilder().setX(2d).setY(2d).build())
//                .addNodeXYZs(NodeXYZ.newBuilder().setX(3d).setY(3d).build())
//                .addNodeXYZs(NodeXYZ.newBuilder().setX(4d).setY(4d).build())
//                .build();
//        //调用远程服务方法
//        GetNodeXYZResponse response = blockingStub.getNodeXYZList(request);
//        //返回值
//        return response.getNodeXYZList();
//    }
//
//    public HelloReply sayHello(String message){
//        HelloRequest request = HelloRequest.newBuilder().setName(message).build();
//       return blockingStub.sayHello(request);
//    }


    public static void main(String[] args) throws InterruptedException {
//        RoutingClient client = new RoutingClient("192.168.13.146", 50051);
//        //服务调用
////        List<NodeXYZ> content = client.getNodeXYZList("aa");
//        HelloReply helloReply = client.sayHello("jeff");
//        //打印调用结果
//        System.out.println(helloReply.getMessage());
////        System.out.println(content);
//        //关闭连接
//        client.shutdown();
    }

}
