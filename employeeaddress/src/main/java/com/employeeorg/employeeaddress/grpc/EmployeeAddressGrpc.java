package com.employeeorg.employeeaddress.grpc;

import org.springframework.beans.factory.annotation.Autowired;

import com.employeeorg.employeeaddress.AddressServiceGrpc.AddressServiceImplBase;
import com.employeeorg.employeeaddress.repository.EmployeeAddressRepository;
import com.employeeorg.employeeaddress.GetEmployeeAddressRequest;
import com.employeeorg.employeeaddress.GetEmployeeAddressResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class EmployeeAddressGrpc extends AddressServiceImplBase {

    @Autowired
	private EmployeeAddressRepository employeeAddressRepository;


    @Override
    public void getEmployeeAddress(GetEmployeeAddressRequest request,
            StreamObserver<GetEmployeeAddressResponse> responseObserver) {
        GetEmployeeAddressResponse res = GetEmployeeAddressResponse.newBuilder().setEmpId(request.getEmpId())
                .setEmpAddress(employeeAddressRepository.findEmployeeAddressByEmpId(request.getEmpId()).getEmpAddress()).build();
                System.out.println(res);
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

}
