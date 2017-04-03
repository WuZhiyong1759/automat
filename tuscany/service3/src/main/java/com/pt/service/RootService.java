package com.pt.service;






import org.oasisopen.sca.annotation.Remotable;

import com.pt.domain.Root;
@Remotable
public interface RootService{

	public String findpass(String name); 
	
	public boolean insertRoot(Root root);
	
}
