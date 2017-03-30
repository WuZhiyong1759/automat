package com.pt.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.pt.domain.Root;

public interface RootService extends Remote{

	public String findpass(String name)throws RemoteException; 
	
	public boolean insertRoot(Root root)throws RemoteException;
	
}
