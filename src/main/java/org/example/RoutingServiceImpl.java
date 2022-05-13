//package org.example;
//
//import com.hx.schedule.grpc.GetNodeXYZResponse;
//import com.hx.schedule.grpc.NodeXYZ;
//import com.hx.schedule.grpc.RoutingServiceGrpc;
//import com.hx.schedule.grpc.Transfrom;
//import io.grpc.stub.StreamObserver;
//
///**
// * @author xiongyu
// * @date 2021/12/16 下午8:32
// */
//public class RoutingServiceImpl extends RoutingServiceGrpc.RoutingServiceImplBase {
//
//    @Override
//    public void getNodeXYZList(Transfrom request, StreamObserver<GetNodeXYZResponse> responseObserver) {
//        NodeXYZ.Builder nBuilder1 = NodeXYZ.newBuilder();
//        nBuilder1.setBack(1);
//        nBuilder1.setZ(1);
//        nBuilder1.setX(1);
//        nBuilder1.setY(1);
//
//        NodeXYZ.Builder nBuilder2 = NodeXYZ.newBuilder();
//        nBuilder2.setBack(2);
//        nBuilder2.setZ(2);
//        nBuilder2.setX(2);
//        nBuilder2.setY(2);
//
//        GetNodeXYZResponse.Builder builder = GetNodeXYZResponse.newBuilder();
//        builder.addNodeXYZ(nBuilder1.build());
//        builder.addNodeXYZ(nBuilder2.build());
//
//        responseObserver.onNext(builder.build());
//        responseObserver.onCompleted();
//    }
//}
