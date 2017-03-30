package com.pt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.pt.domain.Stu;

public interface StuService extends Remote {
	public List<Stu> findBysstatue(int i)throws RemoteException;
}
