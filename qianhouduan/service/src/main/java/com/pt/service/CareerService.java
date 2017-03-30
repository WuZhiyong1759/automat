package com.pt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.pt.domain.Career;

public interface CareerService extends Remote{
	
	public List<Career> findAll()throws RemoteException;
	
	public List<Career> findByType(String type)throws RemoteException;
	
}
